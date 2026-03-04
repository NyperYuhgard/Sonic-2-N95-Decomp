package STH2P1;

import Coral.Audio.crlAudioManager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

public class Sonic2AudioManager extends crlAudioManager implements PlayerListener {
   public static final int VOLUME_QUART = 50;
   public static final int VOLUME_HALF = 75;
   public static final int[] VOLUME_LEVELS = new int[]{0, 50, 75, 100};
   public static final int AUDIO_TITLE = 0;
   public static final int AUDIO_RING = 1;
   public static final int AUDIO_SEGA_SPLASH = 2;
   public static final int AUDIO_ZONE_TRACK = 0;
   public static final int AUDIO_ZONE_TRACK_INTRO = 1;
   public static final int AUDIO_BOSS = 2;
   public static final int AUDIO_STAGE_CLEAR = 3;
   public static final int AUDIO_DROWN_PANIC = 4;
   public static final int AUDIO_INVINCIBLE = 5;
   public static final int AUDIO_EXTRA_LIFE = 6;
   public static final int AUDIO_GAME_OVER = 7;
   public static final int AUDIO_CONTINUE = 8;
   public static final int AUDIO_SUPER_SONIC = 9;
   public static final int AUDIO_SCORE = 10;
   public static final int AUDIO_DROWN = 11;
   public static final int NUM_OF_PLAYERS = 13;
   private static final int[] a = new int[]{1, 5, 133, 132, 133, 133, 143, 5, 144, 141, 132, 139, 4, 2, 138, 3, 141};
   private static final String[] b = new String[]{"/title.mid", "/emerald_hill.mid", "/chemical_plant.mid", "/aquatic_ruin.mid", "/casino_night.mid", "/hill_top.mid", "/boss.mid", "/stageclear.mid", "/hurry.mid", "/invincible.mid", "/1up.mid", "/gameover.mid", "/continue.mid", "/super_sonic.mid", "/score.mid", "/drown.mid", "/ring.mid", "/emerald_hill_intro.mid", "/chemical_plant_intro.mid", "/aquatic_ruin_intro.mid", "/casino_night_intro.mid", "/hill_top.mid", "/SEGA.amr"};
   private static final int[] c = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
   private static final int[] d = new int[]{1, -1, -1, -1, -1, -1, -1, 1, 1, -1, 1, 1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
   public static String[] audioBank;
   public static int[] audioBankAudioTypes;
   public static int[] audioBankLoopStates;

   public void setAudioBank(State var1) {
      if (var1 instanceof TitleState) {
         audioBank = new String[]{b[0], b[16], b[22]};
         audioBankAudioTypes = new int[]{c[0], c[16], c[22]};
         audioBankLoopStates = new int[]{d[0], d[16], d[22]};
      } else {
         if (var1 instanceof GameState) {
            audioBank = new String[13];
            audioBankAudioTypes = new int[13];
            audioBankLoopStates = new int[13];
            int var3 = a[GameState.zoneNumber];
            this.a(0, var3);
            int var2 = audioBank.length;
            this.a(1, var3 + 16);

            for(var3 = 2; var3 < var2; ++var3) {
               this.a(var3, var3 + 4);
            }
         }

      }
   }

   private void a(int var1, int var2) {
      audioBank[var1] = b[var2];
      audioBankAudioTypes[var1] = c[var2];
      audioBankLoopStates[var1] = d[var2];
   }

   public void bgmset(int var1) {
      this.playAudio(var1, audioBankLoopStates[var1]);
   }

   public void bgmRestart() {
      this.bgmset(0);
   }

   public void activeAudioBankListener() {
      for(int var1 = 0; var1 < super._mNumPlayers; ++var1) {
         super._mPlayer[var1].addPlayerListener(this);
      }

   }

   public void playerUpdate(Player var1, String var2, Object var3) {
      try {
         if (var1.equals(super._mPlayer[1]) && var2.equals("endOfMedia")) {
            this.bgmRestart();
         } else {
            if (var1.equals(super._mPlayer[6]) && var2.equals("endOfMedia")) {
               if (!GameState.stageClear) {
                  if (State.mSonicAction.m_AirCnt < 12) {
                     cCanvas.am.bgmset(4);
                  } else {
                     byte var5 = 0;
                     if ((State.mSonicAction.m_PlPower & 2) != 0) {
                        var5 = 5;
                     }

                     if (GameState.m_SSonicFlag != 0) {
                        var5 = 9;
                     }

                     if (GameState.m_BossStart != 0) {
                        var5 = 2;
                     }

                     cCanvas.am.bgmset(var5);
                  }

                  return;
               }

               if (GameState.stageClearExtraLifeAudioRequired == 0) {
                  GameState.stageClearNextStage = true;
                  return;
               }

               if (GameState.stageClearExtraLifeAudioRequired > 0) {
                  this.bgmset(6);
                  --GameState.stageClearExtraLifeAudioRequired;
                  return;
               }
            } else {
               if (var1.equals(super._mPlayer[3]) && var2.equals("endOfMedia")) {
                  PlayerAction2.stclearAudioOver = true;
                  return;
               }

               if (var1.equals(super._mPlayer[10]) && var2.equals("endOfMedia")) {
                  if (GameState.stageClearExtraLifeAudioRequired == 0) {
                     GameState.stageClearNextStage = true;
                     return;
                  }

                  if (GameState.stageClearExtraLifeAudioRequired > 0) {
                     this.bgmset(6);
                     --GameState.stageClearExtraLifeAudioRequired;
                  }
               }
            }

            return;
         }
      } catch (Throwable var4) {
      }

   }

   public void setGlobalVolume(int var1, boolean var2) {
      if (var1 <= 100 && var1 >= 0) {
         crlAudioManager._gGlobalVolume = var1;
      }

      if (var2) {
         for(var1 = 0; var1 < super._mPlayer.length; ++var1) {
            super._mPlayerVolume[var1] = crlAudioManager._gGlobalVolume;
         }
      }

   }

   public boolean audioPlaying() {
      boolean var1 = false;

      for(int var2 = 0; var2 < super._mPlayer.length; ++var2) {
         if (this.isStarted(var2)) {
            var1 = true;
            break;
         }
      }

      return var1;
   }

   public int loadCurrentAudioBank() {
      return audioBank != null && audioBankAudioTypes != null ? this.loadAudioBank(audioBank, audioBankAudioTypes) : -1;
   }
}
