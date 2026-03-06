package STH2P1;

import Coral.crlCanvas;
import Coral.Audio.iAudioLoader;
import Coral.Util.crlUtil;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;
import javax.microedition.rms.RecordStoreNotOpenException;

public class cCanvas extends crlCanvas {
    public static final int COLOUR_BLACK = 0;
    public static final int COLOUR_WHITE = 16777215;
    public static final int COLOUR_RED = 16711680;
    public static final int COLOUR_GREEN_BORDER = 1336833;
    public static final int FPS = 60;
    public static final int FRAMETIME = 16;
    public static final int MAX_FRAMESKIP = 7;
    private static long a;
    public static int m_ScreenFrame;
    public static int m_ScreenFrame_Prev;
    public static final int SW_UP = 1;
    public static final int SW_DOWN = 2;
    public static final int SW_LEFT = 4;
    public static final int SW_RIGHT = 8;
    public static final int SW_B = 16;
    public static final int SW_C = 32;
    public static final int SW_A = 64;
    public static final int SW_START = 128;
    public static final int SW_T_UP = 256;
    public static final int SW_T_DOWN = 512;
    public static final int SW_T_LEFT = 1024;
    public static final int SW_T_RIGHT = 2048;
    public static final int SW_T_B = 4096;
    public static final int SW_T_C = 8192;
    public static final int SW_T_A = 16384;
    public static final int SW_T_START = 32768;
    static String[] softkeyLabels = new String[2];
    public static Sonic2AudioManager am;
    public static final int OPTION_LANGUAGE = 0;
    public static final int OPTION_DIFFICULTY = 1;
    public static final int OPTION_AUDIO = 2;
    public static final int OPTION_VIBRATION = 3;
    public static final int OPTION_SCORE1 = 4;
    public static final int OPTION_SCORE2 = 5;
    public static final int OPTION_LIVES = 6;
    public static final int OPTION_EMERALDS = 7;
    public static final int OPTION_STAGE_PART1 = 8;
    public static final int OPTION_STAGE_PART2 = 9;
    public static final int OPTION_STAGE_PART3 = 10;
    public static final int OPTION_STAGE_PART4 = 11;
    public static final int OPTION_STAGE_PART5 = 12;
    public static int[] m_Option;
    public static final int APP_ENDING = 0;
    public static final int APP_NEXTAPP = 1;
    public static int[][] m_Ranking;
    private static int b;
    static int m_NowOnTKeyBuf;
    private static int c;
    public static int m_Key;
    public static int m_OnTKey;
    private static long d = 0L;
    public static long[] lastLoopTime = new long[5];
    public static int lastLoopCounter = 0;
    public static int viewPortWidth;
    public static int viewPortHeight;
    public static int viewPortOffset;
    private static Font e = Font.getFont(0, 0, 8);
    public static final int softkeyBarHeight = 24;
    private static int f = 0;
    private static int[] g = new int[320]; // Pre-assigned
    private static int[] h = new int[320]; // Pre-assigned
    private static int i = 0;
    private static int j = 0;
    private static long k = 0L;
    public static int tickTime = 0;
    public static boolean screenRotated = false;
    public static String[] screenRotatedString = new String[]{"PLEASE SWITCH TO PORTRAIT MODE", "VEUILLEZ PASSER EN MODE PORTRAIT", "IMPOSTA LO SCHERMO IN MODALITÀ VERTICALE", "BITTE WECHSLE INS HOCHFORMAT", "POR FAVOR, CAMBIA A MODO RETRATO", "POR FAVOR, MUDA O TEU ECRÃ PARA O MODO PANORÂMICO"};
    public static int newWidth = 0;
    public static int newHeight = 0;
    private static String[] l = new String[]{"Sonic the Hedgehog 2 Dash", "Sonic the Hedgehog 2: Crash!"};

    public static void setState(int var0, Object var1) {
        if (crlCanvas.currentState != null) {
            crlCanvas.currentState.disposeResources();
            crlCanvas.currentState = null;
        }

        crlUtil.garbageWait();
        (crlCanvas.currentState = State.getInstance(var0, var1)).init();
        crlUtil.garbageWait();
    }

    public void reset() {
    }

    public void quitApp() {
        STH2P1.quitApp();
    }

    protected void cnvsUpdate() {
        crlCanvas.currentState.update();
    }

    public void sizeChanged(int var1, int var2) {
        newWidth = var1;
        newHeight = var2;

        screenRotated = false;
    }

    public void rotatePaint(Graphics var1) {

    }

    protected void render(Graphics var1) {
        if (crlCanvas.currentState != null) {
            if (crlCanvas.currentState instanceof TitleState) {
                this.a(var1);
            }

            crlCanvas.currentState.render(var1);
            if (!(crlCanvas.currentState instanceof TitleState)) {
                this.a(var1);
            }
        }

    }

    public void pause() {
        if (crlCanvas.currentState != null) {
            crlCanvas.currentState.pause();
        }
    }

    public void resume() {
        crlCanvas._mPaintReady = true;
        crlCanvas._mPaintFinished = true;
    }

    public final void run() {
        initViewPort();
        initAudio();
        byte[] var1;
        if ((var1 = loadData("settings")) == null) {
            m_Option = new int[13];
            m_Option[0] = 0;
            m_Option[1] = 1;
            m_Option[2] = 3;
            m_Option[3] = 1;
            m_Option[8] = GameState.APP1_PROGRESS[0] << 8;
            m_Option[9] = GameState.APP2_PROGRESS[0] << 8;
            saveOption();
        } else {
            m_Option = crlUtil.loadIntArray(var1, var1.length, 0);
        }

        this.a();
        setState(4, (Object)null);
        a = System.currentTimeMillis() - 1L;
        k = System.currentTimeMillis();

        while(true) {
            while(true) {
                try {
                    d = System.currentTimeMillis();

                    try {
                        if ((crlCanvas._mStartTime = (long)((int)((System.currentTimeMillis() - a + 16L - 1L) / 16L))) < 0L) {
                            crlCanvas._mStartTime = 1L;
                            a = System.currentTimeMillis() - 112L;
                        }

                        if (crlCanvas._mStartTime < 7L) {
                            crlCanvas._mStartTime = 0L;
                        }

                        if (crlCanvas._mStartTime >= 7L) {
                            crlCanvas._mStartTime = 7L;
                            a = System.currentTimeMillis() - 112L;
                        }

                        if (crlCanvas._mQuitApp) {
                            this.quitApp();
                            return;
                        }

                        crlCanvas._mTriggerPaintUI = true;

                        for(int var5 = 0; (long)var5 < crlCanvas._mStartTime; ++var5) {
                            ++crlCanvas.mCounter;
                            b = m_Key;
                            m_NowOnTKeyBuf = m_OnTKey;
                            m_OnTKey = 0;
                            setSwRead(b | m_NowOnTKeyBuf, m_NowOnTKeyBuf);
                            tickTime = (int)(System.currentTimeMillis() - k);
                            k = System.currentTimeMillis();
                            this.cnvsUpdate();
                            m_ScreenFrame_Prev = m_ScreenFrame;
                            if (am != null) {

                                if (m_Option[2] > 0) {
                                    am.update();
                                }
                            }
                            a += 16L;
                        }

                        if (crlCanvas._mPaintReady && crlCanvas._mStartTime >= 7L) {
                            this.triggerPaint();
                            ++m_ScreenFrame;
                        }

                        Thread.yield();
                        Thread.sleep(10L);
                        crlCanvas._mLastFrameTime = System.currentTimeMillis() - crlCanvas._mStartTime;
                    } catch (Exception var3) {
                    }

                    lastLoopTime[lastLoopCounter++] = System.currentTimeMillis() - d;
                    if (lastLoopCounter == lastLoopTime.length) {
                        lastLoopCounter = 0;
                    }
                } catch (Throwable var4) {
                    System.gc();
                    try {
                        Thread.sleep(100L);
                    } catch (Exception var2) {
                    }
                }
            }
        }
    }

    public static void initViewPort() {

        viewPortWidth = 240;
        viewPortHeight = 240;
        viewPortOffset = Math.max(0, (crlCanvas.getGameHeight() - viewPortHeight) / 2);
    }

    public static int getFPS() {
        int var0 = 0;
        for(int var1 = 0; var1 < lastLoopTime.length; ++var1) {
            var0 += (int)lastLoopTime[var1];
        }
        return (var0 /= lastLoopTime.length) != 0 ? 10000 / var0 : -1;
    }

    public static void setSwRead(int var0, int var1) {
        c = a(var1) << 8 | a(var0);
    }

    public static int swRead() {
        return c;
    }

    private static int a(int var0) {
        int var1 = 0;
        if ((var0 & 161) != 0) var1 = 64;
        if ((var0 & 4) != 0) var1 |= 4;
        if ((var0 & 8) != 0) var1 |= 8;
        if ((var0 & 2) != 0) var1 |= 2;
        return var1;
    }

    public static int getNowKeyBuf() {
        return b;
    }

    public static int getNowOnTKeyBuf() {
        return m_NowOnTKeyBuf;
    }

    public void keyPressed(int var1) {
        super.keyPressed(var1);
        m_Key = m_OnTKey = crlCanvas.mPad;
    }

    public void keyReleased(int var1) {
        super.keyReleased(var1);
        m_Key = crlCanvas.mPad;
    }

    public static void setSoftLabel(int var0, String var1) {
        if (var0 == 256) softkeyLabels[0] = var1;
        else if (var0 == 512) softkeyLabels[1] = var1;
    }

    private void a(Graphics var1) {
        var1.setColor(1336833);
        var1.fillRect(0, crlCanvas.getGameHeight() - 24, crlCanvas.getGameWidth(), 24);
        var1.setFont(e);
        int var2 = crlCanvas.getGameHeight();
        if (softkeyLabels[0] != null) {
            drawString(var1, softkeyLabels[0], 8, var2, 16777215, 0, 36);
        }
        if (softkeyLabels[1] != null) {
            drawString(var1, softkeyLabels[1], crlCanvas.getGameWidth() - 8, var2, 16777215, 0, 40);
        }
    }

    public static void doVibration(int var0) {
    }

    public static void drawString(Graphics var0, String var1, int var2, int var3, int var4, int var5, int var6) {
        var0.setColor(var5);
        var0.drawString(var1, var2 + 1, var3 - 1, var6);
        var0.drawString(var1, var2, var3, var6);
        var0.drawString(var1, var2, var3 + 1, var6);
        var0.drawString(var1, var2 - 1, var3 - 1, var6);
        var0.drawString(var1, var2 - 1, var3, var6);
        var0.drawString(var1, var2 - 1, var3 + 1, var6);
        var0.setColor(var4);
        var0.drawString(var1, var2, var3, var6);
    }

    public static void setFade(int var0, int var1) {
        short var2 = 0;
        if (var0 < 0) var2 = 255;
        f = var0;

        if (g == null || g.length < crlCanvas.getGameWidth()) g = new int[crlCanvas.getGameWidth()];
        for(var0 = 0; var0 < g.length; ++var0) {
            g[var0] = var2 << 24 | var1 & 16777215;
        }
    }

    public static void updateFade() {
        if (g == null) return;
        int var0;
        if ((var0 = (g[0] >> 24) + f) < 0) var0 = 0;
        else if (var0 > 255) var0 = 255;
        for(int var1 = 0; var1 < g.length; ++var1) {
            g[var1] = var0 << 24 | g[var1] & 16777215;
        }
    }

    public static void drawFade(Graphics var0, boolean var1) {
    }

    public static void setShade(int var0, int var1, int var2) {
        var0 &= 255;
        if (i != var0) {
            i = var0;
            if (h == null || h.length < crlCanvas.getGameWidth()) h = new int[crlCanvas.getGameWidth()];
            for(var0 = 0; var0 < h.length; ++var0) {
                h[var0] = i << 24 | var1 & 16777215;
            }
        }
        j = var2;
    }

    public static void fillShade(Graphics var0) {
        try {
            int limit = Math.min(j, crlCanvas.getGameHeight());
            for(int var1 = 0; var1 < limit; ++var1) {
                var0.drawRGB(h, 0, crlCanvas.getGameWidth(), 0, var1, crlCanvas.getGameWidth(), 1, true);
            }
        } catch (Exception var2) {
        }
        if (j < crlCanvas.getGameHeight() - 24) j += 16;
    }

    private void a() {
        byte[] var3;
        if ((var3 = loadData("rankings")) == null) {
            m_Ranking = new int[5][2];
            m_Ranking[0][0] = 10000; m_Ranking[0][1] = 0;
            m_Ranking[1][0] = 8000;  m_Ranking[1][1] = 1;
            m_Ranking[2][0] = 6000;  m_Ranking[2][1] = 2;
            m_Ranking[3][0] = 4000;  m_Ranking[3][1] = 1;
            m_Ranking[4][0] = 2000;  m_Ranking[4][1] = 0;
            saveRanking();
        } else {
            m_Ranking = new int[5][];
            for(int var1 = 0; var1 < m_Ranking.length; ++var1) {
                m_Ranking[var1] = crlUtil.loadIntArray(var3, 8, var1 << 3);
            }
        }
    }

    public static void saveOption() {
        if(m_Option == null) return;
        byte[] var0 = new byte[m_Option.length << 2];
        crlUtil.loadByteArray(m_Option, m_Option.length, 0, var0, 0);
        saveData("settings", var0);
    }

    static void saveRanking() {
        if(m_Ranking == null) return;
        byte[] var0 = new byte[m_Ranking.length * m_Ranking[0].length << 2];
        for(int var1 = 0; var1 < m_Ranking.length; ++var1) {
            int var2 = m_Ranking[0].length * var1 << 2;
            crlUtil.loadByteArray(m_Ranking[var1], m_Ranking[var1].length, 0, var0, var2);
        }
        saveData("rankings", var0);
    }

    public static byte[] loadData(String var0) {
        RecordStore var1 = null;
        byte[] var2 = null;
        try {
            var1 = RecordStore.openRecordStore(var0, false);
            var2 = var1.getRecord(1);
        } catch (Exception var19) {
        } finally {
            try { if (var1 != null) var1.closeRecordStore(); } catch (Exception var17) {}
        }
        return var2;
    }

    public static void saveData(String var0, byte[] var1) {
        RecordStore var5 = null;
        try {
            if (saveDataExists(var0)) RecordStore.deleteRecordStore(var0);
            var5 = RecordStore.openRecordStore(var0, true);
            var5.addRecord(var1, 0, var1.length);
        } catch (Exception var22) {
        } finally {
            try { if (var5 != null) var5.closeRecordStore(); } catch (Exception var19) {}
        }
    }

    public boolean deleteSaveData(String var1) {
        try { RecordStore.deleteRecordStore(var1); return true; }
        catch (Exception var3) { return false; }
    }

    public static boolean saveDataExists(String var0) {
        try { RecordStore.openRecordStore(var0, false).closeRecordStore(); return true; }
        catch (Exception var1) { return false; }
    }

    public static void initAudio() {
        try {
            am = new Sonic2AudioManager();
            am.loadAudioData();
            am.open((iAudioLoader)null, 13);
        } catch(Exception e) {}
    }
}