package STH2P1;

import Coral.crlCanvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class TitleState extends State implements MenuStrings {
   private static final String[] a = new String[]{"/sonic2_title01.png", "/sonic2_title02.png", "/sonic2_title03.png", "/sonic2-bar3.png", "/common_1.png", "/play00_1.png", "/sonic2_font_00.png", "/sonic2_haikei_00.png", "/sonic2_haikei_01.png", "/language_flags.png", "/arrows.png", "/ring.png", "/item.png", "/checkpoint.png", "/sega_splash.png", "/sonic_team_splash.png", "/dash_logo.png"};
   private static final String[] b = new String[]{"/advamd_menu_int.bin", "/ADVAMD_Table.bin", "/STAGEKIND.bin", "/ADVAMD_LOCALSTATE_COUNTER.bin", "/ADVAMD_ANIME_STAR.bin", "/ADVAMD_ANIME_STAR_END.bin", "/ADVAMD_ANIME_SONIC.bin", "/ADVAMD_ANIME_SONIC_UDE1.bin", "/ADVAMD_ANIME_SONIC_UDE2.bin", "/ADVAMD_ANIME_TAILS.bin", "/ADVAMD_ANIME_TAILS_SIPPO.bin", "/ADVAMD_ANIME_TAILS_UDE.bin", "/ADVAMD_ANIME_TAILS_HIKARI.bin"};
   private static int[][] c;
   private static int[][] d;
   private static int[][] e;
   private static int[] f;
   private static int[][] g;
   private static int[][] h;
   private static int[][] i;
   private static int[][] j;
   private static int[][] k;
   private static int[][] l;
   private static int[][] m;
   private static int[][] n;
   private static int[][] o;
   public static final int ADVAMD_LOCALSTATE_ANIME_STAR = 3;
   private static final int[] p;
   private static final int q;
   private static int r;
   private static int s;
   private static int t;
   private int u = 0;
   private static int v;
   private static int w;
   private static int x;
   private int y = 0;
   private boolean z = false;
   private boolean A = false;
   private int B;
   private int C;
   private static int D;
   private boolean E;
   private boolean F;
   private String G;
   private String H;
   private int I;
   private int J;
   private int K;
   private int L;
   private int M;
   private int N;
   private int O;
   private int P;
   private int Q;
   private int R;
   private int S;
   private Image T = null;
   private int U = 0;
   public static String[] ADVAMD_MENU_STRINGS;
   private Image[] V;
   private static final String[][] W;
   public static String mDemoURL;
   public static String mUpsellURL;
   public static int mUpsell;
   public static int mDemo;
   public int smov_x = 0;
   public static boolean mDevCreditDisable;
   private static int X;
   private static int Y;
   public static String progressCode;
   private static final int[][] Z;
   public static final int ARROW_WIDTH = 6;
   public static final int ARROW_HEIGHT = 4;
   private static final int[] aa;
   private static final int[][] ab;
   private static final int[][] ac;

   public static void loadLanguage(int var0) {
      ADVAMD_MENU_STRINGS = Utilities.arrayInputDataString1(MenuStrings.languageFiles[var0]);
      if (mDemo > 0) {
         ADVAMD_MENU_STRINGS[1] = W[cCanvas.m_Option[0]][1];
         ADVAMD_MENU_STRINGS[6] = W[cCanvas.m_Option[0]][0];
      }

   }

   public TitleState(int var1, Object var2) {
      super.mMode = var1;
      cCanvas.am.setAudioBank(this);
      cCanvas.am.loadCurrentAudioBank();
      cCanvas.am.activeAudioBankListener();
      if (ADVAMD_MENU_STRINGS == null) {
         loadLanguage(cCanvas.m_Option[0]);
      }

      switch(var1) {
      case 4:
         this.C = -4;
         if (var2 != null) {
            try {
                this.C = ((Integer)var2).intValue();
            } catch (Exception var3) {
            }
         }

         t = cCanvas.m_Option[0];
         r = 0;
         s = 10;
         this.V = new Image[a.length];
         Utilities.loadImages(a, this.V);
         c = Utilities.arrayInputDataInt2(b[0]);
         e = Utilities.arrayInputDataInt2(b[1]);
         d = Utilities.arrayInputDataInt2(b[2]);
         f = Utilities.arrayInputDataInt1(b[3]);
         n = Utilities.arrayInputDataInt2(b[4]);
         o = Utilities.arrayInputDataInt2(b[5]);
         g = Utilities.arrayInputDataInt2(b[6]);
         h = Utilities.arrayInputDataInt2(b[7]);
         i = Utilities.arrayInputDataInt2(b[8]);
         j = Utilities.arrayInputDataInt2(b[9]);
         k = Utilities.arrayInputDataInt2(b[10]);
         l = Utilities.arrayInputDataInt2(b[11]);
         m = Utilities.arrayInputDataInt2(b[12]);
         this.B = 0;
         this.I = 0;
         this.J = 0;
         this.K = 0;
         this.L = 0;
         this.M = 0;
         this.N = 0;
         this.O = 0;
         this.P = 0;
         this.Q = 0;
         this.R = 0;
      default:
      }
   }

   public void init() {
   }

   public void update() {
      if (this.E) {
         if (this.F) {
            this.updateConfirmationMenu();
         } else {
            this.updatePauseMenu();
         }
      } else {
         int var1 = cCanvas.getNowOnTKeyBuf();
         switch(this.C) {
         case -4:
            if (cCanvas.screenRotated) {
               this.pause();
            }

            if (crlCanvas.mPad != 16 && crlCanvas.mPad != 256) {
               if (crlCanvas.mPad == 512) {
                  STH2P1.quitApp();
               } else {
                  if (crlCanvas.mPad == 1) {
                     t = (t + 4) % 5;
                     cCanvas.m_Option[0] = t;
                     loadLanguage(cCanvas.m_Option[0]);
                     cCanvas.saveOption();
                  } else if (crlCanvas.mPad == 2) {
                     t = (t + 1) % 5;
                     cCanvas.m_Option[0] = t;
                     loadLanguage(cCanvas.m_Option[0]);
                     cCanvas.saveOption();
                  }

                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
               }
            } else {
               this.C = -3;
               State.setSoftKey(256, ADVAMD_MENU_STRINGS[26]);
               State.setSoftKey(512, ADVAMD_MENU_STRINGS[27]);
            }

            crlCanvas.mPad = 0;
            crlCanvas.mPadDB = 0;
            return;
         case -3:
            if (crlCanvas.mPad != 16 && crlCanvas.mPad != 256) {
               if (crlCanvas.mPad == 512) {
                  cCanvas.m_Option[2] = 0;
                  State.setSoftKey(256, (String)null);
                  State.setSoftKey(512, (String)null);
                  cCanvas.am.setGlobalVolume(Sonic2AudioManager.VOLUME_LEVELS[cCanvas.m_Option[2]]);
                  this.C = -2;
                  return;
               }
               break;
            }

            if (cCanvas.m_Option[2] == 0) {
               cCanvas.m_Option[2] = 3;
            }

            State.setSoftKey(256, (String)null);
            State.setSoftKey(512, (String)null);
            cCanvas.am.setGlobalVolume(Sonic2AudioManager.VOLUME_LEVELS[cCanvas.m_Option[2]]);
            this.C = -2;
            return;
         case -2:
            if (this.B == 68) {
               cCanvas.am.bgmset(2);
            }

            ++this.B;
            if (this.B > 300) {
               this.B = 0;
               if (mDevCreditDisable) {
                  this.C = 1;
                  return;
               }

               this.C = -1;
               return;
            }
            break;
         case -1:
            boolean var14 = false;
            String var11 = "/rockpool_splash.png";
            TitleState var12 = this;
            if (this.T == null) {
               try {
                  var12.T = Image.createImage(var11);
                  var12.U = 120;
               } catch (Exception var8) {
               }
            } else {
               --this.U;
            }

            if (this.U < 0) {
               this.T = null;
               this.C = 0;
            }

            return;
         case 0:
            ++this.B;
            if (this.B >= f[this.C]) {
               this.C = 1;
               this.B = 0;
               return;
            }
            break;
         case 1:
            ++this.B;
            if (this.B >= f[this.C]) {
               this.C = 2;
               this.B = 0;
               return;
            }
            break;
         case 2:
            ++this.B;
            if (this.B >= f[this.C]) {
               this.C = 3;
               this.B = 0;
               return;
            }
            break;
         case 3:
            if (STH2P1.isActive()) {
               ++this.B;
               ++this.J;
            }

            if (this.J >= n[this.I][0] && n.length > this.I + 1) {
               ++this.I;
               if (this.I == 7) {
                  cCanvas.am.bgmset(0);
               }
            }

            if (this.B >= f[this.C]) {
               this.C = 4;
               cCanvas.setFade(-2, 0);
               this.B = 0;
               return;
            }
            break;
         case 4:
            ++this.B;
            ++this.J;
            cCanvas.updateFade();
            if (this.J >= n[this.I][0] && n.length > this.I + 1) {
               ++this.I;
            }

            if (this.B >= f[this.C]) {
               this.C = 5;
               this.B = 0;
               return;
            }
            break;
         case 5:
            ++this.B;
            ++this.J;
            if (this.J >= n[this.I][0] && n.length > this.I + 1) {
               ++this.I;
            }

            if (this.B >= f[this.C]) {
               this.C = 6;
               this.B = 0;
               return;
            }
            break;
         case 6:
            ++this.B;
            ++this.J;
            if (this.J >= n[this.I][0] && n.length > this.I + 1) {
               ++this.I;
            }

            if (this.B >= g[this.K][0] && g.length > this.K + 1) {
               ++this.K;
            }

            if (this.B >= h[this.L][0] && h.length > this.L + 1) {
               ++this.L;
            }

            if (this.B >= i[this.M][0] && i.length > this.M + 1) {
               ++this.M;
            }

            if (this.B >= f[this.C]) {
               this.C = 7;
               this.B = 0;
               return;
            }
            break;
         case 7:
            ++this.B;
            if (this.B >= j[this.N][0] && j.length > this.N + 1) {
               ++this.N;
            }

            if (this.B >= k[this.O][0] && k.length > this.O + 1) {
               ++this.O;
            }

            if (this.B >= l[this.P][0] && l.length > this.P + 1) {
               ++this.P;
            }

            if (this.B >= m[this.Q][0] && m.length / 5 + 1 > this.Q + 1) {
               ++this.Q;
            }

            if (this.B >= f[this.C]) {
               this.C = 8;
               cCanvas.setFade(2, 16777215);
               this.B = 0;
               return;
            }
            break;
         case 8:
            ++this.B;
            cCanvas.updateFade();
            if (this.B == f[this.C] / 2) {
               cCanvas.setFade(-2, 16777215);
               return;
            }

            if (this.B >= f[this.C]) {
               this.C = 9;
               this.B = 0;
               this.S = 0;
               State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
               State.setSoftKey(512, ADVAMD_MENU_STRINGS[29]);
               return;
            }
            break;
         case 9:
            if (var1 != 16 && var1 != 256) {
               if (var1 == 512) {
                  this.C = 10;
                  t = 1;
                  D = 6;
                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                  State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                  return;
               }

               ++this.B;
               if (this.B >= o[this.R][0] && o.length > this.R + 1) {
                  ++this.R;
               }

               if (this.B >= 1276) {
                  this.B = 0;
                  this.C = 10;
                  D = -1;
                  return;
               }
               break;
            }

            this.C = 10;
            State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
            State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
            s = 5;
            if (mUpsell > 0 || mDemo == 2) {
               ++s;
            }

            r = 0;
            this.S = 0;
            t = 0;
            D = 0;
            return;
         case 10:
            int[] var2;
            switch(D) {
            case -1:
               ++this.B;
               this.B %= 1276;
               if (var1 == 16 || var1 == 256) {
                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                  State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                  s = 5;
                  if (mUpsell > 0 || mDemo == 2) {
                     ++s;
                  }

                  r = 0;
                  this.S = 0;
                  t = 0;
                  X = crlCanvas.getGameWidth() / 2;
                  D = 0;
               }

               if (var1 != 512) {
                  return;
               }

               t = 1;
               X = crlCanvas.getGameWidth() / 2;
               Y = crlCanvas.getGameWidth() / 2;
               D = 6;
               break;
            case 0:
               ++this.B;
               this.B %= 1276;
               if (var1 == 2) {
                  ++t;
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
               } else if (var1 == 1) {
                  t += s - 1;
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
               }

               t %= s;
               if (var1 == 16 || var1 == 256) {
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  byte var13 = 0;
                  byte var3 = 1;
                  byte var4 = 2;
                  byte var5 = 3;
                  byte var6 = 4;
                  byte var7 = 5;
                  if (mDemo == 2) {
                     var7 = 0;
                     var13 = 1;
                     var3 = 2;
                     var4 = 3;
                     var5 = 4;
                     var6 = 5;
                  } else if (mUpsell > 0) {
                     var13 = 0;
                     var7 = 1;
                     var3 = 2;
                     var4 = 3;
                     var5 = 4;
                     var6 = 5;
                  }

                  if (t == var13) {
                     if (mDemo > 0) {
                        t = 0;
                        D = 1;
                        State.setSoftKey(256, W[cCanvas.m_Option[0]][2]);
                        State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                        return;
                     }

                     if (this.a()) {
                        t = 0;
                     } else {
                        t = 1;
                     }

                     D = 1;
                     break;
                  }

                  if (t == var3) {
                     t = 0;
                     w = 0;
                     v = 0;
                     this.y = 0;
                     D = 3;
                     State.setSoftKey(256, (String)null);
                     State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                     return;
                  }

                  if (t == var4) {
                     D = 4;
                     State.setSoftKey(256, (String)null);
                     State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                     return;
                  }

                  if (t == var5) {
                     t = 0;
                     D = 5;
                     State.setSoftKey(256, (String)null);
                     State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                     return;
                  }

                  if (t == var6) {
                     t = 0;
                     D = 9;
                     State.setSoftKey(256, (String)null);
                     State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                     return;
                  }

                  if (t == var7 && (mUpsell > 0 || mDemo == 2)) {
                     if (mDemo == 2) {
                        STH2P1.platRequest(mDemoURL);
                     } else {
                        STH2P1.platRequest(mUpsellURL);
                     }

                     STH2P1.quitApp();
                     return;
                  }
               }

               if ((var1 & 512) != 0) {
                  t = 0;
                  D = -1;
                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                  State.setSoftKey(512, ADVAMD_MENU_STRINGS[29]);
                  cCanvas.am.bgmset(0);
                  return;
               }

               return;
            case 1:
               ++this.B;
               this.B %= 1276;
               if (State.loadStage) {
                  if (mDemo <= 0 && t != 0) {
                     if (t == 1) {
                        int var9;
                        for(var9 = 0; var9 < GameState.APP1_PROGRESS.length && cCanvas.m_Option[8] >> 8 != GameState.APP1_PROGRESS[var9]; ++var9) {
                        }

                        if (var9 < GameState.APP1_PROGRESS.length) {
                           int[] var10 = new int[]{cCanvas.m_Option[8] >> 8, cCanvas.m_Option[8] & 15, cCanvas.m_Option[4] << 16 | cCanvas.m_Option[5], cCanvas.m_Option[6], cCanvas.m_Option[7], 1};
                           cCanvas.setState(12, var10);
                        } else {
                           cCanvas.setState(32, (Object)null);
                        }
                     }
                  } else {
                     var2 = new int[]{GameState.APP1_PROGRESS[0], 0, 0, 3, 0, 1};
                     cCanvas.setState(12, var2);
                  }

                  State.loadStage = false;
                  return;
               }

               if (var1 == 2 && mDemo == 0) {
                  if ((t = ++t % 3) == 1 && this.a()) {
                     t = ++t % 3;
                  }

                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  return;
               }

               if (var1 == 1 && mDemo == 0) {
                  if ((t = (t += 2) % 3) == 1 && this.a()) {
                     t = (t += 2) % 3;
                  }

                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  return;
               }

               if (var1 != 16 && var1 != 256) {
                  if (var1 == 512) {
                     State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                     State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                     s = 5;
                     if (mUpsell > 0 || mDemo == 2) {
                        ++s;
                     }

                     r = 0;
                     t = 0;
                     X = crlCanvas.getGameWidth() / 2;
                     Y = crlCanvas.getGameWidth() / 2;
                     D = 0;
                     return;
                  }
               } else {
                  if (mDemo > 0) {
                     GameState._quitDemo = false;
                     State.drawLoadingText = true;
                     State.setSoftKey(256, (String)null);
                     State.setSoftKey(512, (String)null);
                     return;
                  }

                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                  State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                  if (t == 0) {
                     if (this.a()) {
                        State.drawLoadingText = true;
                        State.setSoftKey(256, (String)null);
                        State.setSoftKey(512, (String)null);
                        return;
                     }

                     X = crlCanvas.getGameWidth() / 2;
                     Y = crlCanvas.getGameWidth() / 2;
                     D = 12;
                     t = 1;
                     return;
                  }

                  if (t == 1) {
                     State.drawLoadingText = true;
                     State.setSoftKey(256, (String)null);
                     State.setSoftKey(512, (String)null);
                     return;
                  }

                  if (t == 2) {
                     t = 0;
                     r = 0;
                     s = 10;
                     D = 2;
                     return;
                  }
               }

               return;
            case 2:
               if (State.loadStage) {
                  var2 = new int[]{d[t][0], d[t][1], 0, 3, 0, 1};
                  this.u = 0;
                  cCanvas.setState(12, var2);
                  State.loadStage = false;
                  return;
               }

               if (var1 == 8) {
                  ++t;
               }

               if (var1 == 4) {
                  --t;
               }

               if (t < 0) {
                  t = 0;
               }

               if (t >= s) {
                  t = s - 1;
               }

               if (var1 == 16 || var1 == 256) {
                  if (this.a()) {
                     State.drawLoadingText = true;
                     State.setSoftKey(256, (String)null);
                     State.setSoftKey(512, (String)null);
                  } else {
                     D = 13;
                     this.u = t;
                     t = 1;
                  }
               }

               if (var1 != 512) {
                  return;
               }

               if (this.a()) {
                  t = 0;
               } else {
                  t = 1;
               }

               X = crlCanvas.getGameWidth() / 2;
               Y = crlCanvas.getGameWidth() / 2;
               D = 1;
               break;
            case 3:
               if (v == 0 && t < q - 1 && crlCanvas.mPad == 8) {
                  ++t;
                  v = -4;
                  w = crlCanvas.getGameWidth();
                  x = this.S = 0;
                  this.y = 0;
                  this.z = false;
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
               } else if (v == 0 && t > 0 && crlCanvas.mPad == 4) {
                  --t;
                  v = 4;
                  w = -crlCanvas.getGameWidth();
                  x = this.S = 0;
                  this.y = 0;
                  this.z = false;
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
               } else if (crlCanvas.mPad == 1) {
                  if (this.y > 0) {
                     --this.y;
                  }
               } else if (crlCanvas.mPad == 2 && this.A) {
                  ++this.y;
               }

               if (var1 == 512) {
                  this.z = false;
                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                  s = 5;
                  if (mUpsell > 0 || mDemo == 2) {
                     ++s;
                  }

                  r = 0;
                  t = 0;
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  D = 0;
                  return;
               }

               return;
            case 4:
               if (var1 == 512) {
                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                  s = 5;
                  if (mUpsell > 0 || mDemo == 2) {
                     ++s;
                  }

                  r = 0;
                  t = 0;
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  D = 0;
               }

               if (var1 == 128) {
                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                  State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  D = 7;
                  t = 1;
                  return;
               }

               return;
            case 5:
               if (var1 == 2) {
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  if (++t == 3) {
                     ++t;
                  }

                  t %= 4;
               } else if (var1 == 1) {
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  if ((t += 3) == 3) {
                     t += 3;
                  }

                  t %= 4;
               } else if (var1 == 8) {
                  if (t == 0) {
                     cCanvas.m_Option[0] = (cCanvas.m_Option[0] + 1) % 5;
                     loadLanguage(cCanvas.m_Option[0]);
                     State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                  } else if (t == 1) {
                     cCanvas.m_Option[1] = (cCanvas.m_Option[1] + 1) % 3;
                  } else if (t == 2) {
                     cCanvas.m_Option[2] = (cCanvas.m_Option[2] + 1) % 4;
                     cCanvas.am.setGlobalVolume(Sonic2AudioManager.VOLUME_LEVELS[cCanvas.m_Option[2]]);
                     cCanvas.am.bgmset(1);
                  } else if (t == 3) {
                     cCanvas.m_Option[3] = 1 - cCanvas.m_Option[3];
                     cCanvas.doVibration(500);
                  }

                  cCanvas.saveOption();
               } else if (var1 == 4) {
                  if (t == 0) {
                     cCanvas.m_Option[0] = (cCanvas.m_Option[0] + 4) % 5;
                     loadLanguage(cCanvas.m_Option[0]);
                     State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                  } else if (t == 1) {
                     cCanvas.m_Option[1] = (cCanvas.m_Option[1] + 2) % 3;
                  } else if (t == 2) {
                     cCanvas.m_Option[2] = (cCanvas.m_Option[2] + 3) % 4;
                     cCanvas.am.setGlobalVolume(Sonic2AudioManager.VOLUME_LEVELS[cCanvas.m_Option[2]]);
                     cCanvas.am.bgmset(1);
                  } else if (t == 3) {
                     cCanvas.m_Option[3] = 1 - cCanvas.m_Option[3];
                     cCanvas.doVibration(500);
                  }

                  cCanvas.saveOption();
               }

               if (var1 == 512) {
                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                  s = 5;
                  if (mUpsell > 0 || mDemo == 2) {
                     ++s;
                  }

                  r = 0;
                  t = 0;
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  D = 0;
                  return;
               }

               return;
            case 6:
               if (var1 != 2 && var1 != 1) {
                  if (var1 == 16 || var1 == 256) {
                     if (t == 0) {
                        STH2P1.quitApp();
                     }

                     State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                     State.setSoftKey(512, ADVAMD_MENU_STRINGS[29]);
                     t = 0;
                     D = -1;
                     cCanvas.am.bgmset(0);
                     return;
                  }

                  if (var1 == 512) {
                     State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                     State.setSoftKey(512, ADVAMD_MENU_STRINGS[29]);
                     t = 0;
                     D = -1;
                     cCanvas.am.bgmset(0);
                     return;
                  }

                  return;
               }

               t = 1 - t;
               return;
            case 7:
               if (var1 != 2 && var1 != 1) {
                  if ((var1 == 16 || var1 == 256) && t == 0) {
                     cCanvas.m_Ranking[0][0] = 10000;
                     cCanvas.m_Ranking[0][1] = 0;
                     cCanvas.m_Ranking[1][0] = 8000;
                     cCanvas.m_Ranking[1][1] = 1;
                     cCanvas.m_Ranking[2][0] = 6000;
                     cCanvas.m_Ranking[2][1] = 2;
                     cCanvas.m_Ranking[3][0] = 4000;
                     cCanvas.m_Ranking[3][1] = 1;
                     cCanvas.m_Ranking[4][0] = 2000;
                     cCanvas.m_Ranking[4][1] = 0;
                     cCanvas.saveRanking();
                     X = crlCanvas.getGameWidth() / 2;
                     Y = crlCanvas.getGameWidth() / 2;
                     D = 8;
                     State.setSoftKey(256, (String)null);
                     State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                     return;
                  }
               } else {
                  t = 1 - t;
               }

               if (var1 == 16 || var1 == 512 || var1 == 256) {
                  t = 0;
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  D = 4;
                  State.setSoftKey(256, (String)null);
                  State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                  return;
               }

               return;
            case 8:
               if (var1 == 512) {
                  State.setSoftKey(256, (String)null);
                  State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                  t = 0;
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  D = 4;
                  return;
               }

               return;
            case 9:
               if (var1 == 512) {
                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                  s = 5;
                  if (mUpsell > 0 || mDemo == 2) {
                     ++s;
                  }

                  r = 0;
                  t = 0;
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  D = 0;
                  return;
               }

               return;
            case 10:
            case 11:
            default:
               return;
            case 12:
               if (State.loadStage) {
                  var2 = new int[]{GameState.APP1_PROGRESS[0], 0, 0, 3, 0, 1};
                  cCanvas.setState(12, var2);
                  State.loadStage = false;
                  return;
               }

               if (var1 == 2 || var1 == 1) {
                  t = 1 - t;
                  return;
               }

               if (var1 == 16 || var1 == 256) {
                  if (t == 0) {
                     State.drawLoadingText = true;
                     State.setSoftKey(256, (String)null);
                     State.setSoftKey(512, (String)null);
                     return;
                  } else {
                     X = crlCanvas.getGameWidth() / 2;
                     Y = crlCanvas.getGameWidth() / 2;
                     D = 1;
                     if (this.a()) {
                        t = 0;
                     } else {
                        t = 1;
                     }

                     State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                     State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                     return;
                  }
               }

               if (var1 == 512) {
                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  D = 1;
                  if (this.a()) {
                     t = 0;
                  } else {
                     t = 1;
                  }

                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                  State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                  return;
               }

               return;
            case 13:
               if (State.loadStage) {
                  var2 = new int[]{d[this.u][0], d[this.u][1], 0, 3, 0, 1};
                  this.u = 0;
                  cCanvas.setState(12, var2);
                  State.loadStage = false;
                  return;
               }

               if (var1 == 2 || var1 == 1) {
                  t = 1 - t;
                  return;
               }

               if (var1 == 16 || var1 == 256) {
                  if (t == 0) {
                     State.drawLoadingText = true;
                     State.setSoftKey(256, (String)null);
                     State.setSoftKey(512, (String)null);
                     return;
                  }

                  X = crlCanvas.getGameWidth() / 2;
                  Y = crlCanvas.getGameWidth() / 2;
                  D = 1;
                  if (this.a()) {
                     t = 0;
                  } else {
                     t = 1;
                  }

                  State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
                  State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
                  return;
               }

               if (var1 != 512) {
                  return;
               }

               X = crlCanvas.getGameWidth() / 2;
               Y = crlCanvas.getGameWidth() / 2;
               D = 1;
               if (this.a()) {
                  t = 0;
               } else {
                  t = 1;
               }
            }

            State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
            State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
         }

      }
   }

   public void render(Graphics var1) {
      PlayerAction.game_over_mid = false;
      if (this.E) {
         if (this.F) {
            drawConfirmationMenu(var1);
         } else {
            drawPauseMenu(var1, GameState.m_PAUSE_Cursor);
         }

         if (cCanvas.screenRotated) {
            State.rotatePaint(var1);
         }

      } else {
         int var2;
         int var5;
         int var6;
         int var8;
         int var15;
         int var18;
         boolean var20;
         switch(this.C) {
         case -4:
            var1 = var1;
            crlCanvas._mTriggerPaintUI = false;
            Font var13;
            var2 = (var13 = Font.getFont(64, 0, 8)).getHeight();
            var1.setColor(16777215);
            var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            var18 = crlCanvas.getGameWidth() - 16;
            var15 = crlCanvas.getGameHeight() / 2 - 48;
            var20 = false;
            var1.setFont(var13);

            for(var6 = 0; var6 <= 4; ++var6) {
               String var22 = ADVAMD_MENU_STRINGS[var6 + 32];
               var8 = var1.getFont().stringWidth(var22);
               if (t == var6) {
                  var1.setColor(0);
                  var5 = var15 - 3;
                  var1.setColor(5263440);
                  var1.fillRoundRect(8, var5, var18, var2 + 6, 16, 16);
                  var1.setColor(16777215);
                  var1.fillRoundRect(9, var5 + 1, var18 - 2, var2 + 4, 16, 16);
                  var1.setColor(22708);
                  var1.fillRoundRect(10, var5 + 2, var18 - 4, var2 + 2, 16, 16);
                  var1.setColor(16776960);
               } else {
                  var1.setColor(0);
               }

               var1.drawString(var22, crlCanvas.getGameWidth() - var8 >> 1, var15, 0);
               var15 += var2 + 4;
            }

            var15 = crlCanvas.getGameHeight() - var2 - 3;
            var1.setColor(0);
            var1.drawString(ADVAMD_MENU_STRINGS[30], 8, var15, 20);
            var1.drawString(ADVAMD_MENU_STRINGS[29], crlCanvas.getGameWidth() - 8, var15, 24);
            return;
         case -3:
            drawAudioSplash(var1);
            return;
         case -2:
            var1.setColor(16777215);
            var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            var1.drawImage(this.V[14], (crlCanvas.getGameWidth() - this.V[14].getWidth()) / 2, (crlCanvas.getGameHeight() - this.V[14].getHeight()) / 2, 20);
            var18 = crlCanvas.getGameWidth();
            var5 = crlCanvas.getGameHeight();
            if (this.B < 60) {
               var2 = var18 * this.B / 4 / 15;
               var1.fillRect(var2 - var18 - 10, 0, var18, var5);
               var1.fillRect(var2 + 10, 0, var18, var5);
               var15 = var2 - 11;
               var1.drawLine(var15 + 2, 0, var15 + 2, var5);
               var1.drawLine(var15 + 3, 0, var15 + 3, var5);
               var1.drawLine(var15 + 5, 0, var15 + 5, var5);
               var1.drawLine(var15 + 8, 0, var15 + 8, var5);
               var15 = var2 + 10;
               var1.drawLine(var15 - 2, 0, var15 - 2, var5);
               var1.drawLine(var15 - 3, 0, var15 - 3, var5);
               var1.drawLine(var15 - 5, 0, var15 - 5, var5);
               var1.drawLine(var15 - 8, 0, var15 - 8, var5);
            }

            if (this.B >= 240) {
               var1.setColor(0);
               var15 = (this.B / 4 - 60) * var18 / 2 / 15;

               for(var2 = 0; var2 < var15; ++var2) {
                  var1.drawLine(var2 * 2, 0, var2 * 2, var5);
                  var1.drawLine(var18 - 1 - var2 * 2, 0, var18 - 1 - var2 * 2, var5);
               }
            }
            break;
         case -1:
            if (this.T != null) {
               var1.setColor(0);
               var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
               var1.drawImage(this.T, crlCanvas.getGameWidth() >> 1, crlCanvas.getGameHeight() >> 1, 3);
               return;
            }
            break;
         case 0:
            var1.setColor(0);
            var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            var1.drawImage(this.V[15], (crlCanvas.getGameWidth() - this.V[15].getWidth()) / 2, (crlCanvas.getGameHeight() - this.V[15].getHeight()) / 2, 20);
            return;
         case 1:
            var1.setColor(0);
            var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            var1.drawImage(this.V[15], (crlCanvas.getGameWidth() - this.V[15].getWidth()) / 2, (crlCanvas.getGameHeight() - this.V[15].getHeight()) / 2, 20);
            return;
         case 2:
            var1.setColor(0);
            var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            var1.drawImage(this.V[15], (crlCanvas.getGameWidth() - this.V[15].getWidth()) / 2, (crlCanvas.getGameHeight() - this.V[15].getHeight()) / 2, 20);
            return;
         case 3:
            var1.setColor(0);
            var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            Utilities.drawImage(var1, this.V, e, n[this.I][1], 0, n[this.I][3] + this.smov_x, n[this.I][4], 0, 0);
            return;
         case 4:
            var1.setColor(0, 0, 0);
            var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            this.a(var1);
            cCanvas.drawFade(var1, true);
            Utilities.drawImage(var1, this.V, e, n[this.I][1], 0, n[this.I][3] + this.smov_x, n[this.I][4], 0, 0);
            return;
         case 5:
            var1.setColor(0, 0, 0);
            var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            this.a(var1);
            Utilities.drawImage(var1, this.V, e, n[this.I][1], 0, n[this.I][3] + this.smov_x, n[this.I][4], 0, 0);
            this.b(var1);
            return;
         case 6:
            var1.setColor(0, 0, 0);
            var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            this.a(var1);
            Utilities.drawImage(var1, this.V, e, i[this.M][1], 0, i[this.M][3] + this.smov_x, i[this.M][4] - 12, i[this.M][5], 0);
            Utilities.drawImage(var1, this.V, e, g[this.K][1], 0, g[this.K][3] + this.smov_x, g[this.K][4] - 12, g[this.K][5], 0);
            Utilities.drawImage(var1, this.V, e, h[this.L][1], 0, h[this.L][3] + this.smov_x, h[this.L][4] - 12, h[this.L][5], 0);
            Utilities.drawImage(var1, this.V, e, 32, 0, 37 + this.smov_x, 82, 0, 0);
            Utilities.drawImage(var1, this.V, e, n[this.I][1], 0, n[this.I][3] + this.smov_x, n[this.I][4], 0, 0);
            this.b(var1);
            return;
         case 7:
            var1.setColor(0);
            var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            this.a(var1);
            Utilities.drawImage(var1, this.V, e, k[this.O][1], 0, k[this.O][3] + this.smov_x, k[this.O][4] - 12, k[this.O][5], 0);
            Utilities.drawImage(var1, this.V, e, l[this.P][1], 0, l[this.P][3] + this.smov_x, l[this.P][4] - 12, l[this.P][5], 0);
            Utilities.drawImage(var1, this.V, e, j[this.N][1], 0, j[this.N][3] + this.smov_x, j[this.N][4] - 12, j[this.N][5], 0);
            Utilities.drawImage(var1, this.V, e, m[this.Q][1], 0, m[this.Q][3] + this.smov_x, m[this.Q][4] - 12, m[this.Q][5], 0);
            Utilities.drawImage(var1, this.V, e, m[this.Q + 3][1], 0, m[this.Q + 3][3] + this.smov_x, m[this.Q + 3][4] - 12, m[this.Q + 3][5], 0);
            Utilities.drawImage(var1, this.V, e, m[this.Q + 6][1], 0, m[this.Q + 6][3] + this.smov_x, m[this.Q + 6][4] - 12, m[this.Q + 6][5], 0);
            Utilities.drawImage(var1, this.V, e, i[this.M][1], 0, i[this.M][3] + this.smov_x, i[this.M][4] - 12, i[this.M][5], 0);
            Utilities.drawImage(var1, this.V, e, g[this.K][1], 0, g[this.K][3] + this.smov_x, g[this.K][4] - 12, g[this.K][5], 0);
            Utilities.drawImage(var1, this.V, e, h[this.L][1], 0, h[this.L][3] + this.smov_x, h[this.L][4] - 12, h[this.L][5], 0);
            Utilities.drawImage(var1, this.V, e, 32, 0, 37 + this.smov_x, 82, 0, 0);
            this.b(var1);
            return;
         case 8:
            if (this.B < f[this.C] / 2) {
               var1.setColor(0, 0, 0);
               var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            } else {
               var1.setColor(0, 32, 224);
               var1.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
               Utilities.drawImage(var1, this.V, e, 35, 0, 0, 160, 4, 0);
            }

            cCanvas.drawFade(var1, true);
            this.a(var1);
            Utilities.drawImage(var1, this.V, e, i[this.M][1], 0, i[this.M][3] + this.smov_x, i[this.M][4] - 12, i[this.M][5], 0);
            Utilities.drawImage(var1, this.V, e, k[this.O][1], 0, k[this.O][3] + this.smov_x, k[this.O][4] - 12, k[this.O][5], 0);
            Utilities.drawImage(var1, this.V, e, l[this.P][1], 0, l[this.P][3] + this.smov_x, l[this.P][4] - 12, l[this.P][5], 0);
            Utilities.drawImage(var1, this.V, e, j[this.N][1], 0, j[this.N][3] + this.smov_x, j[this.N][4] - 12, j[this.N][5], 0);
            Utilities.drawImage(var1, this.V, e, g[this.K][1], 0, g[this.K][3] + this.smov_x, g[this.K][4] - 12, g[this.K][5], 0);
            Utilities.drawImage(var1, this.V, e, h[this.L][1], 0, h[this.L][3] + this.smov_x, h[this.L][4] - 12, h[this.L][5], 0);
            Utilities.drawImage(var1, this.V, e, 32, 0, 37 + this.smov_x, 82, 0, 0);
            this.b(var1);
            return;
         case 9:
            this.a(var1, true, false);
            if (this.S < 10) {
               drawString(var1, ADVAMD_MENU_STRINGS[51], (crlCanvas.getGameWidth() - State.fT.stringWidth(ADVAMD_MENU_STRINGS[51])) / 2, crlCanvas.getGameHeight() * 3 / 4, 16777215, 0);
            }

            this.S = (this.S + 1) % 20;
            return;
         case 10:
            var1 = var1;
            TitleState var11 = this;
            crlCanvas.getGameWidth();
            crlCanvas.getGameHeight();
            var1.setFont(State.fT);
            this.a(var1, false, false);
            String var4;
            int var7;
            boolean var19;
            switch(D) {
            case -1:
               if (this.S < 10) {
                  drawString(var1, ADVAMD_MENU_STRINGS[51], (crlCanvas.getGameWidth() - State.fT.stringWidth(ADVAMD_MENU_STRINGS[51])) / 2, crlCanvas.getGameHeight() * 3 / 4, 16777215, 0);
               }

               this.S = (this.S + 1) % 20;
               return;
            case 0:
               String[][] var16 = new String[][]{{ADVAMD_MENU_STRINGS[1], ADVAMD_MENU_STRINGS[2], ADVAMD_MENU_STRINGS[3], ADVAMD_MENU_STRINGS[4], ADVAMD_MENU_STRINGS[5]}, {ADVAMD_MENU_STRINGS[6], ADVAMD_MENU_STRINGS[1], ADVAMD_MENU_STRINGS[2], ADVAMD_MENU_STRINGS[3], ADVAMD_MENU_STRINGS[4], ADVAMD_MENU_STRINGS[5]}, {ADVAMD_MENU_STRINGS[1], ADVAMD_MENU_STRINGS[6], ADVAMD_MENU_STRINGS[2], ADVAMD_MENU_STRINGS[3], ADVAMD_MENU_STRINGS[4], ADVAMD_MENU_STRINGS[5]}};
               byte var17 = 0;
               if (mDemo == 2) {
                  var17 = 1;
               } else if (mUpsell > 0) {
                  var17 = 2;
               }

               var4 = var16[var17][t];
               if (mDemo > 0) {
                  var4 = GameState.FULL_GAME[cCanvas.m_Option[0]][0];
               }

               var1.setFont(State.fT);
               a(var1, var4, (String)null, false, false);
               var20 = false;
               var19 = false;
               var1.setColor(255, 255, 255);
               boolean var21 = false;

               for(var7 = var8 = Math.min(Math.max(t - 2, 0), s - 4); var7 < var8 + 4; ++var7) {
                  drawBar(var1, crlCanvas.getGameHeight() / 2 + 16 + (var7 - var8) * (State.fontHeight + 5), Z[cCanvas.m_Option[0]][1], var7 == t, var16[var17][var7], 0);
               }

               this.a(var1, crlCanvas.getGameWidth() / 2, crlCanvas.getGameHeight() / 2 + 16 - 4, 0, 33);
               this.a(var1, crlCanvas.getGameWidth() / 2, crlCanvas.getGameHeight() / 2 + 16 + 4 * (State.fontHeight + 5) + 4, 1, 17);
               return;
            case 1:
               var4 = null;
               if (mDemo > 0) {
                  var4 = GameState.FULL_GAME[cCanvas.m_Option[0]][4];
                  a(var1, var4, (String)null, false, false);
               }

               var5 = State.fontHeight + 5;

               for(var2 = 0; var2 < (mDemo > 0 ? 1 : 3); ++var2) {
                  if (mDemo > 0) {
                     ADVAMD_MENU_STRINGS[7] = GameState.FULL_GAME[cCanvas.m_Option[0]][0];
                  }

                  if (var2 != 1 || !var11.a()) {
                     drawBar(var1, crlCanvas.getGameHeight() / 2 + var5, Z[cCanvas.m_Option[0]][2], var2 == t, ADVAMD_MENU_STRINGS[var2 + 7], 0);
                     var5 += State.fontHeight + 5;
                  }
               }

               if (State.drawLoadingText) {
                  State.drawLoadingText = false;
                  drawBar(var1, (crlCanvas.getGameHeight() + 16) / 2 + var5, Z[cCanvas.m_Option[0]][0], true, ADVAMD_MENU_STRINGS[66], 0);
                  State.loadStage = true;
               }

               if (t == 1) {
                  if (var11.S < 5) {
                     ++var11.S;
                     return;
                  }

                  var19 = false;
                  return;
               }
               break;
            case 2:
               var1.setColor(0, 32, 192);
               var1.fillRect(0, cCanvas.viewPortOffset, cCanvas.viewPortWidth, cCanvas.viewPortHeight);
               var1.drawImage(this.V[7], 0, cCanvas.viewPortOffset + Utilities.scale(176), 20);
               var1.drawImage(this.V[8], 0, cCanvas.viewPortOffset, 20);
               Utilities.drawImage(var1, this.V[6], 222 - c[t][2], cCanvas.viewPortOffset + 83, c[t][0], c[t][1], c[t][2], c[t][3], 0, 0);
               Utilities.drawImage(var1, this.V[6], 197 - c[20][2], cCanvas.viewPortOffset + 107, c[20][0], c[20][1], c[20][2], c[20][3], 0, 0);
               var2 = c[t][4];
               Utilities.drawImage(var1, this.V[6], 223 - c[var2 + 21][2], cCanvas.viewPortOffset + 107, c[var2 + 21][0], c[var2 + 21][1], c[var2 + 21][2], c[var2 + 21][3], 0, 0);
               if (this.S < 3) {
                  if (s - t > 1) {
                     this.a(var1, crlCanvas.getGameWidth() - 1, cCanvas.viewPortOffset + Utilities.scale(97), 5, 24);
                  }

                  if (t > 0) {
                     this.a(var1, 1, cCanvas.viewPortOffset + Utilities.scale(97), 4, 20);
                  }
               }

               if (State.drawLoadingText) {
                  drawBar(var1, cCanvas.viewPortHeight, Z[cCanvas.m_Option[0]][0], true, ADVAMD_MENU_STRINGS[66], 0);
                  State.drawLoadingText = false;
                  State.loadStage = true;
               }

               GameState.renderBorder(var1);
               this.S = (this.S + 1) % 6;
               return;
            case 3:
               var1.setFont(State.fT);
               a(var1, (String)null, (String)null, false, true);
               if (v != 0) {
                  w += Utilities.scale(v) << 1;
                  if (v > 0 && w > 0) {
                     w = 0;
                  } else if (v < 0 && w < 0) {
                     w = 0;
                  }

                  if (x >= 8) {
                     w = 0;
                     v = 0;
                  } else if (x < 3) {
                     v <<= 1;
                  } else if (x > 3) {
                     v /= 2;
                  }

                  ++x;
               }

               if (w != 0) {
                  this.a(var1, t + (w < 0 ? 1 : -1), w + (w < 0 ? crlCanvas.getGameWidth() : -crlCanvas.getGameWidth()));
               }

               this.a(var1, t, w);
               var2 = t;
               var15 = crlCanvas.getGameWidth();
               var18 = crlCanvas.getGameHeight();
               var6 = (var5 = (var15 - 32) / q) * q;
               if ((var7 = Utilities.scale(12)) % 2 == 1) {
                  ++var7;
               }

               var8 = var7 / 2;
               int var9 = (var15 - var6) / 2;
               int var10 = var18 - 24 - var7 - 3;
               var1.setColor(ac[0][0]);
               var1.fillRect(0, var10, var15, 1);
               var1.setColor(ac[0][1]);
               var1.fillRect(0, var10 + 1, var15, var8);
               var1.setColor(ac[0][2]);
               var1.fillRect(0, var10 + 1 + var8, var15, var8);
               var1.setColor(ac[0][3]);
               var1.fillRect(0, var10 + var7 + 1, var15, 1);
               var1.setColor(ac[0][4]);
               var1.fillRect(0, var10 + var7 + 2, var15, 1);
               var1.setColor(ac[0][6]);
               var1.fillRect(var9, var10 + 2, var6, 1);
               var1.fillRect(var9, var10 + 2, 1, var7 - 2);
               var1.setColor(ac[0][5]);
               var1.fillRect(var9 + 1, var10 + 3, var6 - 1, var7 - 3);
               var2 = var9 + var2 * var5 - w * var5 / var15;
               var15 = var18 - Utilities.scale(28) - 9;
               boolean var14 = true;
               var1.setColor(aa[1]);
               var1.fillRect(var2, var15, var5, 9);
               var1.setColor(aa[0]);
               var1.drawLine(var2, var15, var2 + var5, var15);
               var1.drawLine(var2, var15, var2, var15 + 9 - 1);
               var1.setColor(aa[2]);
               var1.drawLine(var2, var15 + 9, var2 + var5, var15 + 9);
               var1.drawLine(var2 + var5, var15 + 1, var2 + var5, var15 + 9);
               this.a(var1, var9 - 8, var18 - Utilities.scale(35), 4, 20);
               this.a(var1, crlCanvas.getGameWidth() - var9 + 2, var18 - Utilities.scale(35), 7, 20);
               return;
            case 4:
               a(var1, ADVAMD_MENU_STRINGS[3], ADVAMD_MENU_STRINGS[19], true, true);

               for(int var12 = 0; var12 < cCanvas.m_Ranking.length; ++var12) {
                  var5 = Utilities.scale(var5 = 48 + var12 * 30);
                  drawBar(var1, var5 - 2, crlCanvas.getGameWidth() - 32, false, (String)null, 0);
                  drawString(var1, String.valueOf(var12 + 1), 40, var5, 16777215, 0);
                  cCanvas.drawString(var1, String.valueOf(cCanvas.m_Ranking[var12][0]), 120, var5, 16777215, 0, 24);
                  drawString(var1, ADVAMD_MENU_STRINGS[37 + cCanvas.m_Ranking[var12][1]], 155, var5, 16777215, 0);
               }

               return;
            case 5:
               a(var1, ADVAMD_MENU_STRINGS[4], ADVAMD_MENU_STRINGS[53 + t], true, true);
               var5 = 50;

               for(var2 = 0; var2 < 4; ++var2) {
                  if (var2 != 3) {
                     String var3 = ADVAMD_MENU_STRINGS[var2 + 20];
                     var4 = ADVAMD_MENU_STRINGS[var2 * 5 + 32 + cCanvas.m_Option[var2 + 0]];
                     if (var2 == 0) {
                        var3 = ADVAMD_MENU_STRINGS[20];
                        var4 = ADVAMD_MENU_STRINGS[32 + cCanvas.m_Option[0]];
                     }

                     drawBar(var1, var5 - 2, Z[cCanvas.m_Option[0]][3], t == var2, (String)null, 0);
                     var6 = Utilities.getStringWidth(var4);
                     drawString(var1, var3, 30, var5, 16777215, 0);
                     var6 = crlCanvas.getGameWidth() / 2 + (crlCanvas.getGameWidth() / 2 - 30 + 2 - var6) / 2 + 3;
                     drawString(var1, var4, var6, var5, 16777215, 0);
                     var5 += 45;
                  }
               }

               var5 = 53 + 45 * t;
               this.a(var1, crlCanvas.getGameWidth() / 2, var5, 4, 20);
               this.a(var1, crlCanvas.getGameWidth() - 30 + 2, var5, 7, 20);
               return;
            case 6:
               drawConfirmation(var1, ADVAMD_MENU_STRINGS[0], ADVAMD_MENU_STRINGS[24], false);
               return;
            case 7:
               drawConfirmation(var1, ADVAMD_MENU_STRINGS[3], ADVAMD_MENU_STRINGS[49], false);
               return;
            case 8:
               var1.setFont(State.fT);
               a(var1, ADVAMD_MENU_STRINGS[3], (String)null, true, true);
               drawString(var1, ADVAMD_MENU_STRINGS[52], (crlCanvas.getGameWidth() - State.fT.stringWidth(ADVAMD_MENU_STRINGS[52])) / 2, Utilities.scale(127), 16777215, 0);
               return;
            case 9:
               a(var1, ADVAMD_MENU_STRINGS[5], (String)null, true, true);
               cCanvas.drawString(var1, STH2P1.getProperty("MIDlet-Name"), cCanvas.viewPortWidth >> 1, 40 + 0 * State.fontHeight, 16777215, 0, 17);
               cCanvas.drawString(var1, ADVAMD_MENU_STRINGS[157] + " " + STH2P1.getProperty("MIDlet-Version"), cCanvas.viewPortWidth >> 1, 40 + 1 * State.fontHeight, 16777215, 0, 17);
               cCanvas.drawString(var1, "(C) " + STH2P1.getProperty("MIDlet-Vendor") + " 2007", cCanvas.viewPortWidth >> 1, 40 + 3 * State.fontHeight, 16777215, 0, 17);
               if (!mDevCreditDisable) {
                  cCanvas.drawString(var1, ADVAMD_MENU_STRINGS[158], cCanvas.viewPortWidth >> 1, 40 + 5 * State.fontHeight, 16777215, 0, 17);
                  cCanvas.drawString(var1, "Rockpool Games", cCanvas.viewPortWidth >> 1, 40 + 6 * State.fontHeight, 16777215, 0, 17);
                  return;
               }
            case 10:
            case 11:
            default:
               break;
            case 12:
               drawConfirmation(var1, ADVAMD_MENU_STRINGS[16], (String)null, true);
               return;
            case 13:
               drawConfirmation(var1, ADVAMD_MENU_STRINGS[18], (String)null, true);
            }
         }

      }
   }

   private void a(Graphics var1) {
      Utilities.drawImage(var1, this.V, e, 33, 0, 25, 29, 2, 0);
      if (this.V[16] != null) {
         var1.drawImage(this.V[16], crlCanvas.getGameWidth() / 2, Utilities.scale(149), 17);
      }

   }

   private boolean a() {
      return cCanvas.m_Option[8] >> 8 == GameState.APP1_PROGRESS[0] && (cCanvas.m_Option[8] & 15) == 0 && cCanvas.m_Option[9] >> 8 == GameState.APP2_PROGRESS[0] && (cCanvas.m_Option[9] & 15) == 0;
   }

   private void b(Graphics var1) {
      var1.drawRegion(this.V[e[34][0]], Utilities.scale(e[34][1]), Utilities.scale(e[34][2]), Utilities.scale(e[34][3]), Utilities.scale(e[34][4]), 0, crlCanvas.getGameWidth() - 2, 286, 24);
   }

   private void a(Graphics var1, int var2, int var3, int var4, int var5) {
      var1.drawRegion(this.V[10], 0, 0, 6, 4, var4, var2, var3, var5);
   }

   private void a(Graphics var1, int var2, int var3) {
      this.A = false;
      int var4 = p[var2];
      var4 = var3 + (crlCanvas.getGameWidth() - State.fT.stringWidth(ADVAMD_MENU_STRINGS[var4])) / 2;
      boolean var5 = false;
      var1.setClip(7, 4, crlCanvas.getGameWidth() - 14, State.fontHeight);
      drawString(var1, ADVAMD_MENU_STRINGS[p[var2]], var4, 4, 16777215, 0);
      var1.setClip(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
      int var17 = State.fontHeight + 7;
      var4 = crlCanvas.getGameHeight() - 24 - 16 - var17;
      var1.setColor(16777215);
      var1.setClip(0, var17, crlCanvas.getGameWidth(), var4);
      var17 -= this.y;
      var4 = p[var2 + 1];

      for(var2 = p[var2] + 1; var2 < var4; ++var2) {
         String var10002 = ADVAMD_MENU_STRINGS[var2];
         int var10003 = var3 + 8;
         int var10 = crlCanvas.getGameWidth() - 16;
         int var9 = var17;
         int var8 = var10003;
         String var7 = var10002;
         Graphics var6 = var1;
         TitleState var18 = this;
         int var11 = 0;
         int var12 = var8;
         String var13 = null;
         int var14 = 0;
         int var19 = 0;

         for(int var15 = 0; var15 >= 0 && var15 < var7.length(); var19 = var15) {
            if ((var15 = var7.indexOf(32, var19)) == -1) {
               var15 = var7.length();
            } else {
               ++var15;
            }

            int var16;
            if ((var13 = var7.substring(var19, var15)).length() > 1 && var13.charAt(0) == '%') {
               if ((var16 = Integer.parseInt(var13.substring(1).trim())) == 2 || var16 == 3 || var16 == 0 || var16 == 1) {
                  var11 = ab[var16][2] - State.fontHeight;
               }

               var18.a(var6, var16, var8, var9);
               var19 = ab[var16][2] + 8;
               var10 -= var19;
               var12 += var19;
               var8 += var19;
            } else if (var13.length() > 1 && var13.charAt(0) == '|') {
               var14 = 0;
               var9 += State.fontHeight;
               var8 = var12;
            } else if (var13.length() > 1 && var13.charAt(0) == '}') {
               var16 = Integer.parseInt(var13.substring(1).trim());
               var19 = ab[var16][2] + 8;
               var9 = var18.a(var6, var16, var12 + var10 - var19, var9);
               var14 = 0;
               var8 = var12;
               var9 += ab[var16][3];
            } else {
               var16 = State.fT.stringWidth(var13);
               if ((var14 += var16) > var10) {
                  var14 = var16;
                  var9 += State.fontHeight;
                  var8 = var12;
               }

               var6.drawString(var13, var8, var9, 20);
               var8 += var16;
            }
         }

         var17 = var9 + State.fontHeight + var11;
      }

      var1.setClip(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
      if (w == 0 && var17 > crlCanvas.getGameHeight() - 24 - 16 - State.fontHeight) {
         this.z = true;
         this.A = true;
      }

      if (this.z) {
         var2 = cCanvas.viewPortOffset + cCanvas.viewPortHeight + State.fontHeight;
         this.a(var1, (cCanvas.viewPortWidth >> 1) - 6, var2, 0, 17);
         this.a(var1, (cCanvas.viewPortWidth >> 1) + 6, var2, 1, 17);
      }

   }

   public void disposeResources() {
      if (this.V != null) {
         for(int var1 = 0; var1 < this.V.length; ++var1) {
            this.V[var1] = null;
         }

         this.V = null;
      }

      this.T = null;
      ADVAMD_MENU_STRINGS = null;
      c = null;
      e = null;
      d = null;
      f = null;
      n = null;
      o = null;
      g = null;
      h = null;
      i = null;
      j = null;
      k = null;
      l = null;
      m = null;
   }

   public static void drawString(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
      cCanvas.drawString(var0, var1, var2, var3, var4, var5, 20);
   }

   private int a(Graphics var1, int var2, int var3, int var4) {
      Image var5 = this.V[4];
      switch(var2) {
      case 4:
         var4 -= 16;
         break;
      case 5:
         var5 = this.V[11];
         break;
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
         var5 = this.V[12];
         break;
      case 11:
      case 12:
         var5 = this.V[5];
         break;
      case 13:
         var4 -= 16;
         var5 = this.V[13];
      }

      byte var6 = 0;
      switch(ab[var2][4]) {
      case 1:
         var6 = 2;
         break;
      case 2:
         var6 = 1;
         break;
      case 3:
         var6 = 3;
      }

      var1.drawRegion(var5, ab[var2][0], ab[var2][1], ab[var2][2], ab[var2][3], var6, var3, var4, 20);
      return var4;
   }

   private static void a(Graphics var0, String var1, String var2, boolean var3, boolean var4) {
      if (var4) {
         cCanvas.setShade(192, 0, crlCanvas.getGameHeight() - 24);
         cCanvas.fillShade(var0);
      }

      int var6 = 0;
      if (var1 != null) {
         var6 = State.fT.stringWidth(var1);
      }

      X -= 2;
      drawBar(var0, 0, crlCanvas.getGameWidth(), true, var1, X);
      if (X < -(var6 + crlCanvas.getGameWidth()) / 2) {
         X = (crlCanvas.getGameWidth() + var6) / 2;
      }

      if (var3) {
         int var5 = 0;
         if (var2 != null) {
            var5 = State.fT.stringWidth(var2);
         }

         Y -= 2;
         drawBar(var0, crlCanvas.getGameHeight() - (State.fontHeight + 5 + 24), crlCanvas.getGameWidth(), true, var2, Y);
         if (Y < -(var5 + crlCanvas.getGameWidth()) / 2) {
            Y = (crlCanvas.getGameWidth() + var5) / 2;
         }
      }

   }

   public static void drawBar(Graphics var0, int var1, int var2, boolean var3, String var4, int var5) {
      int var6 = (crlCanvas.getGameWidth() - var2) / 2;
      drawBar(var0, var6, var1, var2, var3, var4, var5);
   }

   public static final void drawBar(Graphics var0, int var1, int var2, int var3, boolean var4, String var5, int var6) {
      int var7 = State.fontHeight;
      if (State.fontHeight % 2 == 0) {
         var7 += 2;
      } else {
         var7 += 3;
      }

      int var8 = var7 / 2;
      int var9 = var4 ? 0 : 1;
      var0.setColor(ac[var9][0]);
      var0.fillRect(var1, var2, var3, 1);
      var0.setColor(ac[var9][1]);
      var0.fillRect(var1, var2 + 1, var3, var8);
      var0.setColor(ac[var9][2]);
      var0.fillRect(var1, var2 + 1 + var8, var3, var8);
      var0.setColor(ac[var9][3]);
      var0.fillRect(var1, var2 + var7 + 1, var3, 1);
      var0.setColor(ac[var9][4]);
      var0.fillRect(var1, var2 + var7 + 2, var3, 1);
      var0.setColor(ac[var9][6]);
      var0.fillRect(var1 + 6, var2 + 2, var3 - 12, 1);
      var0.fillRect(var1 + 6, var2 + 2, 1, var7 - 2);
      if (var5 != null && ADVAMD_MENU_STRINGS != null && mUpsell > 0) {
         if (var5.equals(ADVAMD_MENU_STRINGS[6])) {
            var0.setColor(ac[var9][7]);
         } else {
            var0.setColor(ac[var9][5]);
         }
      } else {
         var0.setColor(ac[var9][5]);
      }

      var0.fillRect(var1 + 7, var2 + 3, var3 - 13, var7 - 3);
      if (var5 != null) {
         var0.setClip(var1 + 8, var2, var3 - 16, var7);
         cCanvas.drawString(var0, var5, var1 + (var3 >> 1) + var6, var2 + 2, 16777215, 0, 17);
         var0.setClip(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
      }

   }

   private void a(Graphics var1, boolean var2, boolean var3) {
      var1.setColor(0, 32, 224);
      int var4 = crlCanvas.getGameHeight();
      var4 -= 24;
      var1.fillRect(0, 0, crlCanvas.getGameWidth(), var4);
      Utilities.drawImage(var1, this.V, e, 35, 0, 0 - this.B / 4 % 319, 160, 4, 0);
      Utilities.drawImage(var1, this.V, e, 35, 0, 319 - this.B / 4 % 319, 160, 4, 0);
      if (var2) {
         Utilities.drawImage(var1, this.V, e, o[this.R][1], 0, o[this.R][3] + this.smov_x, o[this.R][4], o[this.R][5], 0);
      }

      this.a(var1);
      Utilities.drawImage(var1, this.V, e, i[this.M][1], 0, i[this.M][3] + this.smov_x, i[this.M][4] - 12, i[this.M][5], 0);
      Utilities.drawImage(var1, this.V, e, k[this.O][1], 0, k[this.O][3] + this.smov_x, k[this.O][4] - 12, k[this.O][5], 0);
      Utilities.drawImage(var1, this.V, e, l[this.P][1], 0, l[this.P][3] + this.smov_x, l[this.P][4] - 12, l[this.P][5], 0);
      Utilities.drawImage(var1, this.V, e, j[this.N][1], 0, j[this.N][3] + this.smov_x, j[this.N][4] - 12, j[this.N][5], 0);
      Utilities.drawImage(var1, this.V, e, g[this.K][1], 0, g[this.K][3] + this.smov_x, g[this.K][4] - 12, g[this.K][5], 0);
      Utilities.drawImage(var1, this.V, e, h[this.L][1], 0, h[this.L][3] + this.smov_x, h[this.L][4] - 12, h[this.L][5], 0);
      Utilities.drawImage(var1, this.V, e, 32, 0, 37 + this.smov_x, 82, 0, 0);
      if (D != 1) {
         this.b(var1);
      }

   }

   public static final void drawAudioSplash(Graphics var0) {
      crlCanvas._mTriggerPaintUI = false;
      Font var1;
      int var2 = (var1 = Font.getFont(64, 0, 8)).getHeight();
      var0.setColor(16777215);
      var0.fillRect(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
      int var3 = crlCanvas.getGameWidth() / 2 - 32;
      int var4 = crlCanvas.getGameHeight() / 2 - 48;
      var0.setColor(5263440);
      var0.fillRoundRect(var3 - 1, var4 - 1, 66, 66, 16, 16);
      var0.setColor(16777215);
      var0.fillRoundRect(var3, var4, 64, 64, 16, 16);
      var0.setColor(22708);
      var0.fillRoundRect(var3 + 2, var4 + 2, 60, 60, 16, 16);
      var0.setColor(5263440);
      var4 += 2;
      var0.fillArc(var3 + 12, var4 + 36, 16, 16, 0, 360);
      var0.fillArc(var3 + 36, var4 + 32, 16, 16, 0, 360);
      var0.fillRect(var3 + 24, var4 + 12, 4, 34);
      var0.fillRect(var3 + 24, var4 + 12, 24, 4);
      var0.fillRect(var3 + 48, var4 + 12, 4, 26);
      var0.drawRect(var3 + 24, var4 + 12, 4, 34);
      var0.drawRect(var3 + 24, var4 + 12, 24, 4);
      var0.drawRect(var3 + 48, var4 + 12, 4, 26);
      var0.setColor(16777215);
      var3 -= 2;
      var4 -= 2;
      var0.fillArc(var3 + 12, var4 + 36, 16, 16, 0, 360);
      var0.fillArc(var3 + 36, var4 + 32, 16, 16, 0, 360);
      var0.fillRect(var3 + 24, var4 + 12, 4, 34);
      var0.fillRect(var3 + 24, var4 + 12, 24, 4);
      var0.fillRect(var3 + 48, var4 + 12, 4, 26);
      var4 += 72;
      var0.setFont(var1);
      var0.setColor(0);
      int var5 = var0.getFont().stringWidth(ADVAMD_MENU_STRINGS[68]);
      var0.drawString(ADVAMD_MENU_STRINGS[68], crlCanvas.getGameWidth() - var5 >> 1, var4, 0);
      var4 = crlCanvas.getGameHeight() - var2 - 3;
      var0.setColor(0);
      var0.drawString(ADVAMD_MENU_STRINGS[26], 8, var4, 20);
      var0.drawString(ADVAMD_MENU_STRINGS[27], crlCanvas.getGameWidth() - 8, var4, 24);
   }

   protected void updateConfirmationMenu() {
      int var1 = cCanvas.getNowOnTKeyBuf();
      State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
      State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
      if (var1 != 2 && var1 != 1) {
         if (var1 != 16 && var1 != 256) {
            if (var1 == 512) {
               GameState.m_PAUSE_Cursor = 1;
               this.F = false;
            }

         } else {
            if (GameState.m_PAUSE_Cursor == 0) {
               STH2P1.quitApp();
            }

            this.F = false;
         }
      } else {
         GameState.m_PAUSE_Cursor = 1 - GameState.m_PAUSE_Cursor;
      }
   }

   public static final void drawConfirmationMenu(Graphics var0) {
      int var1 = GameState.m_PAUSE_Cursor;
      GameState.m_PAUSE_Cursor = t;
      t = var1;
      drawConfirmation(var0, ADVAMD_MENU_STRINGS[0], ADVAMD_MENU_STRINGS[24], false);
      t = GameState.m_PAUSE_Cursor;
      GameState.m_PAUSE_Cursor = var1;
      State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
      State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
   }

   public static final void drawPauseMenu(Graphics var0, int var1) {
      cCanvas.setShade(192, 0, crlCanvas.getGameHeight() - 24);
      cCanvas.fillShade(var0);
      drawBar(var0, 0, crlCanvas.getGameWidth(), true, GameState.STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][3], 0);
      var1 = crlCanvas.getGameWidth() - 64;
      drawBar(var0, Utilities.scale(110), var1, GameState.m_PAUSE_Cursor == 0, ADVAMD_MENU_STRINGS[28], 0);
      drawBar(var0, Utilities.scale(110) + State.fontHeight + 5, var1, GameState.m_PAUSE_Cursor == 1, ADVAMD_MENU_STRINGS[29], 0);
   }

   protected void updatePauseMenu() {
      int var1 = cCanvas.getNowOnTKeyBuf();
      State.setSoftKey(256, ADVAMD_MENU_STRINGS[30]);
      State.setSoftKey(512, ADVAMD_MENU_STRINGS[28]);
      if (var1 != 1 && var1 != 2) {
         if (var1 == 512) {
            crlCanvas.mPad = 0;
            this.resume();
         } else {
            if (var1 == 16 || var1 == 256) {
               switch(GameState.m_PAUSE_Cursor) {
               case 0:
                  crlCanvas.mPad = 0;
                  this.resume();
                  return;
               case 1:
                  this.F = true;
               }
            }

         }
      } else {
         GameState.m_PAUSE_Cursor = ++GameState.m_PAUSE_Cursor % 2;
      }
   }

   public void pause() {
      GameState.m_PAUSE_Cursor = 0;
      if (!this.E) {
         this.G = cCanvas.softkeyLabels[0];
         this.H = cCanvas.softkeyLabels[1];
      }

      this.E = true;
      cCanvas.am.pauseAudio();
   }

   public void resume() {
      GameState.m_PAUSE_Cursor = 0;
      cCanvas.softkeyLabels[0] = this.G;
      cCanvas.softkeyLabels[1] = this.H;
      this.E = false;
      if (cCanvas.am != null) {
         cCanvas.am.loadCurrentAudioBank();
         cCanvas.am.resumeAudio();
         if (this.C >= 3 && (this.C < 10 || D <= 0)) {
            cCanvas.am.bgmset(0);
         }
      }

   }

   public static void drawConfirmation(Graphics var0, String var1, String var2, boolean var3) {
      a(var0, var1, var2, true, true);
      int var4 = (crlCanvas.getGameWidth() - State.fT.stringWidth(ADVAMD_MENU_STRINGS[50])) / 2;
      drawString(var0, ADVAMD_MENU_STRINGS[50], var4, Utilities.scale(75), 16777215, 0);

      for(var4 = 0; var4 < 2; ++var4) {
         crlCanvas.getGameWidth();
         State.fT.stringWidth(ADVAMD_MENU_STRINGS[var4 + 26]);
         drawBar(var0, Utilities.scale(var4 * 28 + 120), Z[cCanvas.m_Option[0]][0], t == var4, ADVAMD_MENU_STRINGS[var4 + 26], 0);
      }

      if (var3 && State.drawLoadingText) {
         System.out.println("loading...");
         State.drawLoadingText = false;
         drawBar(var0, cCanvas.viewPortHeight - 24, Z[cCanvas.m_Option[0]][0], true, ADVAMD_MENU_STRINGS[66], 0);
         State.loadStage = true;
      }

   }

   static {
      q = (p = new int[]{71, 80, 95, 103, 107, 113, 117, 129, 135, 141, 147, 153, 157}).length - 2;
      ADVAMD_MENU_STRINGS = null;
      W = new String[][]{{"Get the game!", "Start trial", "Start"}, {"Achetez ce jeu !", "Lancez la démo", "Commencer"}, {"Compra il gioco!", "Inizia prova", "Iniziare"}, {"Hol' dir das Spiel!", "Test Starten", "Start"}, {"¡Compra el juego!", "Iniciar la demo", "Iniciar"}};
      mUpsell = 0;
      mDemo = 0;
      mDevCreditDisable = false;
      String var0;
      if ((var0 = STH2P1.getProperty("DevCreditDisable")) != null) {
         mDevCreditDisable = var0.toLowerCase().equals("true");
      }

      if ((var0 = STH2P1.getProperty("ms-upSell")) != null) {
         try {
            mUpsell = Integer.parseInt(var0);
         } catch (NumberFormatException var2) {
            mUpsell = 0;
         }

         if (mUpsell > 2) {
            mUpsell = 0;
         }
      }

      if ((mUpsellURL = STH2P1.getProperty("ms-upSellUrl")) == null) {
         mUpsell = 0;
      }

      if ((var0 = STH2P1.getProperty("ms-demoMode")) != null) {
         try {
            mDemo = Integer.parseInt(var0);
         } catch (NumberFormatException var1) {
            mDemo = 0;
         }

         if (mDemo > 2) {
            mDemo = 0;
         }
      }

      if ((mDemoURL = STH2P1.getProperty("ms-demoUrl")) == null) {
         mDemo = 0;
      }

      X = crlCanvas.getGameWidth() / 2;
      Y = crlCanvas.getGameWidth() / 2;
      Z = new int[][]{{136, 152, 148, crlCanvas.getGameWidth() - 32}, {136, 140, 190, crlCanvas.getGameWidth() - 32}, {136, 136, 148, crlCanvas.getGameWidth() - 32}, {136, 136, 168, crlCanvas.getGameWidth() - 32}, {136, 136, 190, crlCanvas.getGameWidth() - 32}};
      aa = new int[]{13565881, 11527828, 6532484};
      ab = new int[][]{{22, 34, 24, 24, 1}, {22, 34, 24, 24, 0}, {0, 34, 24, 24, 1}, {0, 34, 24, 24, 2}, {0, 0, 40, 32, 0}, {0, 0, 16, 16, 0}, {0, 32, 32, 32, 0}, {0, 160, 32, 32, 0}, {0, 0, 32, 32, 0}, {0, 128, 32, 32, 0}, {0, 96, 32, 32, 0}, {160, 128, 40, 32, 0}, {160, 40, 40, 40, 0}, {16, 16, 16, 64, 0}};
      ac = new int[][]{{8250470, 2983960, 26368, 2983960, 26368, 14852, 263684, 6520657}, {1668354, 1398272, 1324313, 1398272, 1324313, 795916, 263684, 4080684}};
      int[] var10000 = new int[]{16777215, 0, 3757208};
   }
}
