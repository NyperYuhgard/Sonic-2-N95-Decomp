package STH2P1;

import Coral.Audio.crlAudioManager;
import Coral.Util.crlBinArray;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

public class Sonic2AudioManager extends crlAudioManager implements PlayerListener {
    public static final int VOLUME_QUART = 50;
    public static final int VOLUME_HALF = 75;
    public static final int[] VOLUME_LEVELS = new int[]{0, 50, 75, 100};
    public static final int NUM_OF_PLAYERS = 13;

    // Arrays dinámicos para ahorrar RAM
    public static int[] a;
    public static String[] b;
    public static int[] c;
    public static int[] d;

    public static String[] audioBank;
    public static int[] audioBankAudioTypes;
    public static int[] audioBankLoopStates;

    public void loadAudioData() {
        System.out.println("AudioMgr: Iniciando carga de archivos binarios...");
        try {
            // Carga de Rutas (Array b)
            InputStream isB = getClass().getResourceAsStream("/audio_b.bin");
            if (isB != null) {
                DataInputStream disB = new DataInputStream(isB);
                int total = disB.readByte();
                b = new String[42];
                for (int i = 0; i < 42; i++) b[i] = "";
                for (int i = 0; i < total; i++) {
                    int idx = disB.readByte();
                    int len = disB.readByte();
                    byte[] buf = new byte[len];
                    disB.read(buf);
                    b[idx] = new String(buf, "UTF-8");
                }
                disB.close();
                System.out.println("AudioMgr: Rutas 'b' cargadas correctamente.");
            }

            // Carga de Lógica (Arrays a, c, d)
            InputStream isD = getClass().getResourceAsStream("/audio_data.bin");
            if (isD != null) {
                a = new int[17];
                c = new int[42];
                d = new int[42];
                for (int i = 0; i < 17; i++) a[i] = isD.read();
                for (int i = 0; i < 42; i++) c[i] = isD.read();
                for (int i = 0; i < 42; i++) {
                    int v = isD.read();
                    d[i] = (v == 255) ? -1 : v;
                }
                isD.close();
                System.out.println("AudioMgr: Tablas numericas cargadas.");
            }
        } catch (Exception e) {
            System.out.println("AudioMgr ERROR en loadAudioData: " + e.getMessage());
        }
    }

    public void setAudioBank(State var1) {
        this.clearAllPlayers();
        if (b == null) loadAudioData();

        if (var1 instanceof TitleState) {
            audioBank = new String[]{b[0], b[16], b[22]};
            audioBankAudioTypes = new int[]{c[0], c[16], c[22]};
            audioBankLoopStates = new int[]{d[0], d[16], d[22]};
        } else if (var1 instanceof GameState) {
            audioBank = new String[13];
            audioBankAudioTypes = new int[13];
            audioBankLoopStates = new int[13];
            int var3 = a[GameState.zoneNumber];

            System.out.println("AudioMgr: Configurando banco para Zona " + GameState.zoneNumber);

            this.a(0, var3);      // Slot 0: Track Principal (Loop)
            this.a(1, var3 + 16); // Slot 1: Intro

            for(int i = 2; i < 13; ++i) {
                this.a(i, i + 4);
            }
        }
    }

    private void a(int slot, int idx) {
        if (idx < b.length) {
            audioBank[slot] = b[idx];
            audioBankAudioTypes[slot] = c[idx];
            audioBankLoopStates[slot] = d[idx];
            System.out.println("AudioMgr: Slot " + slot + " cargado con " + b[idx]);
        }
    }

    public void bgmset(int var1) {
        System.out.println("AudioMgr C3: Preparando Slot " + var1);

        // 1. Matar cualquier player que esté usando el recurso actualmente
        this.clearAllPlayers();

        // 2. Intentar inicializar solo el player que necesitamos (Lazy Load)
        // d(var1) crea el Player, e(var1) hace prefetch
        if (this.d(var1) == 0) {
            if (this.e(var1) == 0) {
                // 3. Activar listener y reproducir
                if (super._mPlayer[var1] != null) {
                    super._mPlayer[var1].addPlayerListener(this);
                }
                this.playAudio(var1, audioBankLoopStates[var1]);
            }
        }
    }

    public void bgmRestart() {
        System.out.println("AudioMgr: Intro finalizada. Saltando al Loop (Slot 0)");
        this.bgmset(0);
    }

    public void activeAudioBankListener() {
        for(int i = 0; i < super._mNumPlayers; ++i) {
            if (super._mPlayer[i] != null) {
                super._mPlayer[i].addPlayerListener(this);
            }
        }
    }

    public void playerUpdate(Player var1, String var2, Object var3) {
        try {
            if (var2.equals("endOfMedia")) {
                if (var1.equals(super._mPlayer[1])) {
                    this.bgmRestart();
                } else if (var1.equals(super._mPlayer[6])) {
                    if (!GameState.stageClear) {
                        if (State.mSonicAction.m_AirCnt < 12) {
                            this.bgmset(4);
                        } else {
                            int track = 0;
                            if ((State.mSonicAction.m_PlPower & 2) != 0) track = 5;
                            if (GameState.m_SSonicFlag != 0) track = 9;
                            if (GameState.m_BossStart != 0) track = 2;
                            this.bgmset(track);
                        }
                    } else {
                        if (GameState.stageClearExtraLifeAudioRequired == 0) {
                            GameState.stageClearNextStage = true;
                        } else {
                            this.bgmset(6);
                            --GameState.stageClearExtraLifeAudioRequired;
                        }
                    }
                } else if (var1.equals(super._mPlayer[3])) {
                    PlayerAction2.stclearAudioOver = true;
                } else if (var1.equals(super._mPlayer[10])) {
                    if (GameState.stageClearExtraLifeAudioRequired == 0) {
                        GameState.stageClearNextStage = true;
                    } else {
                        this.bgmset(6);
                        --GameState.stageClearExtraLifeAudioRequired;
                    }
                }
            }
        } catch (Throwable t) {}
    }

    public void setGlobalVolume(int var1, boolean var2) {
        if (var1 <= 100 && var1 >= 0) crlAudioManager._gGlobalVolume = var1;
        if (var2) {
            for(int i = 0; i < super._mPlayer.length; ++i) {
                super._mPlayerVolume[i] = crlAudioManager._gGlobalVolume;
            }
        }
    }

    public boolean audioPlaying() {
        for(int i = 0; i < super._mPlayer.length; ++i) {
            if (this.isStarted(i)) return true;
        }
        return false;
    }

    /**
     * Versión optimizada para C3:
     * Registra las rutas pero NO crea los objetos Player de golpe.
     */
    public int loadCurrentAudioBank() {
        if (audioBank == null) return -1;

        System.out.println("AudioMgr C3: Cargando banco de audios en memoria...");
        this.removeAudioBank(); // Limpia arrays internos de la clase padre

        for (int i = 0; i < audioBank.length; i++) {
            try {
                if (audioBank[i] == null || audioBank[i].equals("")) continue;

                super.f[i] = audioBankAudioTypes[i];
                InputStream is = this.getClass().getResourceAsStream(audioBank[i]);
                if (is != null) {
                    byte[] buf = new byte[is.available()];
                    is.read(buf);
                    is.close();

                    crlBinArray bin = new crlBinArray();
                    bin.set(buf, 0, buf.length);
                    super.e[i] = bin; // Guardamos solo los bytes
                }
            } catch (Exception ex) {
                System.out.println("Error cargando slot " + i);
            }
        }
        this._mNumPlayers = audioBank.length;
        return 0;
    }

    public void clearAllPlayers() {
        for (int i = 0; i < super._mPlayer.length; i++) {
            if (super._mPlayer[i] != null) {
                try {
                    super._mPlayer[i].stop();
                    super._mPlayer[i].deallocate();
                    super._mPlayer[i].close();
                    super._mPlayer[i] = null;
                } catch (Exception e) {}
            }
        }
    }
}