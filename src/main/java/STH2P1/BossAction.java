package STH2P1;

import Coral.crlCanvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class BossAction extends Action {
   private static final String[] a = new String[]{"/sonic2_eggman_00.png", "/sonic2_eggman_act2.png"};
   private static final String[] b = new String[]{"/sonic2_eggman_00.png", "/sonic2_eggman_act1.png"};
   public static final int BBOSS1_WORKMAX = 21;
   private static int[][] c;
   private static int[][] d;
   private static int[][] e;
   private static int[][] f;
   private static int[][] g;
   private static int[][] h;
   private static int[][] i;
   private static int[][] j;
   private static int[][] k;
   private static int[][] l;
   private static int[][] m;
   private static int[][] n;
   private static int[][] o;
   private static int[][] p;
   private static int[][] q;
   private static Image[] r = null;
   private static Image[] s = null;
   private static boolean t = false;
   public static boolean m_BossWorking;
   private static Object[] u = new Object[32];
   private static int v = 0;
   private static int[][] w;
   private static int[][] x;
   private static int[][] y;
   private static int[][] z;
   private static int[][] A;
   private static final String[] B = new String[]{"/sonic2_eggman_00.png", "/sonic2_eggman_act3.png"};
   private static int C;
   private static int D;
   private static int E;
   private static int F;
   private static int G;
   private static int H;
   private static int I;
   private static int[] J = new int[16];
   private static int K = 2;
   private static Image[] L = null;
   private static int[][] M;
   private static int[][] N;
   private static int[][] O;
   private static final String[] P = new String[]{"/sonic2_eggman_00.png", "/sonic2_eggman_act4.png"};
   private static Image[] Q = null;
   private int[][] R = new int[][]{{0, 0, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 64, 72, -32, -36}, {0, 16, 72, 8, 8, -32, -34}, {0, 0, 72, 16, 8, -40, -34}, {0, 0, 80, 24, 8, -48, -34}, {0, 0, 88, 40, 8, -64, -34}, {0, 0, 96, 56, 8, -80, -34}, {0, 0, 104, 72, 8, -96, -34}, {0, 0, 112, 88, 8, -112, -34}, {0, 0, 120, 88, 8, -112, -34}, {0, 0, 128, 64, 8, -88, -34}, {0, 72, 128, 32, 8, -56, -34}, {0, 72, 104, 8, 8, -4, -4}, {0, 80, 104, 8, 8, -4, -4}, {0, 56, 72, 16, 16, -8, -8}, {0, 56, 88, 16, 16, -8, -8}, {0, 88, 72, 64, 56, -32, -28}};
   private int[][] S = new int[][]{{2, 2, 3, -3, 1}, {3, 4, 5, -3, 2}, {4, 6, 7, -3, 3}, {5, 8, 9, -3, 4}, {6, 10, 11, -2}, {4, 12, 13, -1}, {16, 1, -1}, {4, 14, 15, -1}};
   private int[][] T = new int[][]{{1, 2, 3, -3, 1}, {2, 4, 5, -3, 2}, {3, 6, 7, -3, 3}, {4, 8, 9, -3, 4}, {5, 10, 11, -2}, {3, 12, 13, -1}, {15, 1, -1}, {3, 14, 15, -1}};
   private int[][] U = new int[][]{{0, 24, 72, 16, 16, -8, -8}, {0, 40, 72, 16, 16, -8, -8}, {0, 0, 136, 16, 24, -8, -16}, {0, 16, 136, 16, 24, -8, -16}, {0, 104, 128, 16, 32, -8, -24}, {0, 120, 128, 16, 32, -8, -24}};
   private int[][] V = new int[][]{{12, 2, 3, -4, 4, -3, 1}, {128, 5, -1}, {6, 4, 5, 2, 3, 0, 1, 0, 1, 2, 3, 4, 5, -4}};
   private int[][] W = new int[][]{{0, 24, 72, 16, 16, -8, -8}, {0, 40, 72, 16, 16, -8, -8}, {0, 0, 136, 16, 24, -8, -16}, {0, 16, 136, 16, 24, -8, -16}, {0, 104, 128, 16, 32, -8, -24}, {0, 120, 128, 16, 32, -8, -24}};
   private int[][] X = new int[][]{{0, 32, 136, 16, 16, -8, -8}, {0, 48, 136, 16, 16, -8, -8}, {0, 64, 136, 16, 16, -8, -8}, {0, 80, 136, 16, 16, -8, -8}};
   private static Image[] Y = null;
   private static String[] Z = new String[]{"/sonic2_eggman_act5.png"};
   private static Image[] aa = null;
   private static String[] ab = new String[]{"/sonic2_eggman_act5.png"};
   private static Image[] ac;
   private static final int[][] ad = new int[][]{{1, 0, 32, 64, 32, -32, -16}, {0, 0, 0, 64, 24, -32, -32}};

   public BossAction() {
   }

   public BossAction(int var1, int var2) {
      super.classType = 9;
      this.setType(var1, var2);
   }

   public void setType(int var1, int var2) {
      super.m_Actno = var1;
      switch(super.m_Actno) {
      case 32:
         super.m_Patbase_Image = aa;
         super.m_Reserve = new int[13];
         super.m_ReserveObj = null;
         return;
      case 81:
         this.BBOSS6_init();
         return;
      case 82:
         super.m_Patbase_Image = Y;
         super.m_Reserve = new int[13];
         super.m_ReserveObj = null;
         return;
      case 86:
         if (k == null) {
            k = Utilities.arrayInputDataInt2("/BBOSS2_bosshelipat.bin");
         }

         if (l == null) {
            l = Utilities.arrayInputDataInt2("/BBOSS2_bosshelichg.bin");
         }

         if (m == null) {
            m = Utilities.arrayInputDataInt2("/BBOSS2_bossdrillpat.bin");
         }

         if (n == null) {
            n = Utilities.arrayInputDataInt2("/BBOSS2_bossdrillpat2.bin");
         }

         if (o == null) {
            o = Utilities.arrayInputDataInt2("/BBOSS2_bossdrillchg.bin");
         }

         if (p == null) {
            p = Utilities.arrayInputDataInt2("/BBOSS2_bossbapat.bin");
         }

         if (q == null) {
            q = Utilities.arrayInputDataInt2("/BBOSS2_bossbachg.bin");
         }

         super.m_Patbase_Image = s;
         super.m_Reserve = new int[10];
         return;
      case 93:
         if (c == null) {
            c = Utilities.arrayInputDataInt2("/BBOSS1_bossbachg.bin");
            d = Utilities.arrayInputDataInt2("/BBOSS1_bossbapat.bin");
            e = Utilities.arrayInputDataInt2("/BBOSS1_bossbapat2.bin");
            f = Utilities.arrayInputDataInt2("/BBOSS1_bossvacchg.bin");
            g = Utilities.arrayInputDataInt2("/BBOSS1_bossvacpat.bin");
            h = Utilities.arrayInputDataInt2("/BBOSS1_bossvacpat2.bin");
            i = Utilities.arrayInputDataInt2("/BBOSS1_bossafbpat.bin");
            j = Utilities.arrayInputDataInt2("/BBOSS1_bosssmpat.bin");
         }

         t = false;
         super.m_Patbase_Image = r;
         super.m_Reserve = new int[21];
         return;
      case 137:
         this.BBOSS4_init();
         return;
      case 222:
         super.m_Patbase_Image = ac;
         super.m_Patbase_Table = ad;
         super.m_Reserve = new int[10];
      default:
      }
   }

   public void update(State var1) {
      Action var2;
      int var3;
      Action var4;
      Action var5;
      int var6;
      BossAction var7;
      int var8;
      int var9;
      Action var10;
      int var12;
      Action var15;
      int var16;
      int var10001;
      State var17;
      int var10002;
      BossAction var18;
      int var19;
      Action var23;
      boolean var24;
      int[] var31;
      switch(super.m_Actno) {
      case 32:
         this.y(var1);
         return;
      case 81:
         if ((var7 = this).m_R_No0_Ms == 0) {
            var7.m_Patbase_Table = O;
            var7.m_Sproffset = 935;
            var7.m_Actflg |= 4;
            var7.m_Sprpri = 3;
            var7.m_Xposi = 10822;
            var7.m_Yposi = 1620;
            var7.m_Patno_Ms = 0;
            var7.m_Sprhsize_Ms = 32;
            var7.m_Sprvsize_Ms = 128;
            var7.m_R_No0_Ms += 2;
            var7.m_Reserve[K] = 0;
            var7.m_Actflg |= 64;
            var7.m_Manysprcnt = 5;
            var7.m_Patno = 21;
            var7.m_Patno_Ms = 21;
            var7.m_Sprpositbl = new int[var7.m_Manysprcnt][4];
            var7.m_Colino = 15;
            var7.m_Colicnt_Ms = 8;
            if (cCanvas.m_Option[1] == 0) {
               var7.m_Colicnt_Ms = 4;
            } else if (cCanvas.m_Option[1] == 1) {
               var7.m_Colicnt_Ms = 6;
            }

            C = var7.m_Xposi;
            D = var7.m_Yposi;
            var7.m_Sprpositbl[1][0] = var7.m_Xposi;
            var7.m_Sprpositbl[1][1] = var7.m_Yposi;
            var7.m_Sprpositbl[1][3] = 5;
            var7.m_Sprpositbl[2][0] = var7.m_Xposi;
            var7.m_Sprpositbl[2][1] = var7.m_Yposi;
            var7.m_Sprpositbl[2][3] = 1;
            var7.m_Sprpositbl[3][0] = var7.m_Xposi;
            var7.m_Sprpositbl[3][1] = var7.m_Yposi;
            var7.m_Sprpositbl[3][3] = 6;
            var7.m_Sprpositbl[4][0] = var7.m_Xposi;
            var7.m_Sprpositbl[4][1] = var7.m_Yposi;
            var7.m_Sprpositbl[4][3] = 2;
            var7.m_Sprpositbl[0][0] = var7.m_Xposi;
            var7.m_Sprpositbl[0][1] = var7.m_Yposi;
            var7.m_Sprpositbl[0][3] = 21;
            var7.m_Reserve[4] = 0;
            H = 0;
            G = -384;
            var7.m_Reserve[7] = 0;
            I = 1;
            J[0] = 8;
            J[1] = 0;
            J[2] = 10;
            J[3] = 0;
            J[4] = 1;
            J[5] = 0;
            J[6] = 0;
            J[7] = 0;
            J[8] = 3;
            J[9] = 0;
            J[10] = 2;
            J[11] = 0;
         } else if (var7.m_R_No0_Ms == 2) {
            switch(var7.m_Reserve[K]) {
            case 0:
               if (var7.m_Reserve[4] != 0) {
                  if (var7.m_Reserve[4] == 2) {
                     if (C >= 10688) {
                        C = 10688;
                        G = 0;
                        G = -384;
                        var7.m_Reserve[4] = 0;
                        var7.m_Actflg &= -2;
                        var7.m_Reserve[7] = 0;
                     }

                     var7.t(var1);
                  }

                  return;
               }

               if (C <= 10432) {
                  C = 10432;
                  H = 0;
                  G = 384;
                  var7.m_Reserve[4] = 2;
                  var7.m_Actflg |= 1;
                  var7.m_Reserve[7] = 0;
               }

               var7.t(var1);
               return;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            default:
               return;
            case 2:
               GameState.m_BossState = 0;
               if (--I == 0) {
                  J[5] = 32;
                  J[11] = 32;
               } else if (I <= -20) {
                  J[5] = 0;
                  J[11] = 0;
                  var7.m_Reserve[K] = 0;
                  I = -1;
                  var7.m_Reserve[6] = 64;
               }

               var7.p(var1);
               return;
            case 4:
               var7.j(var1);
               if (var7.m_Reserve[5] == 0) {
                  if (var7.m_Yposi >= 1664) {
                     G = 0;
                     H = -384;
                     var7.m_Reserve[5] = -1;
                     GameState.m_BossState = 1;
                     J[5] = 0;
                     J[11] = 0;
                     J[0] = 4;
                  }
               } else if (var7.m_Yposi < 1620) {
                  var7.m_Reserve[K] = 0;
                  H = 0;
                  G = -384;
                  if ((var7.m_Actflg & 1) != 0) {
                     G = 384;
                     var7.m_Patno_Ms = 12;
                  }
               }

               var7.p(var1);
               return;
            case 6:
               var7.m_Reserve[3] = 255;
               if (--I >= 0) {
                  GameState.m_BossState = 0;
                  var7.m_Patno_Ms = 0;
                  var7.m_Sprpositbl[3][3] = 11;
                  var7.m(var1);
               } else {
                  var7.m_Actflg |= 1;
                  H = 0;
                  G = 0;
                  var31 = var7.m_Reserve;
                  var10001 = K;
                  var31[var10001] += 2;
                  var31 = J;
                  var31[8] &= 240;
                  var31 = J;
                  var31[8] |= 3;
                  J[0] = 8;
                  I = -18;
               }

               var7.m_Yposi = D;
               var7.m_Xposi = C;
               var7.q(var1);
               return;
            case 8:
               if (++I == 0) {
                  H = 0;
               } else if (I < 0) {
                  H += 24;
               } else if (I > 0) {
                  if (I > 24) {
                     if (I >= 32) {
                        var31 = var7.m_Reserve;
                        var10001 = K;
                        var31[var10001] += 2;
                     }
                  } else if (I < 24) {
                     H -= 8;
                  } else {
                     H = 0;
                     cCanvas.am.bgmRestart();
                     GameState.m_BossStart = 0;
                  }
               }

               var7.j(var1);
               var7.r(var1);
               var7.m_Yposi = D;
               var7.m_Xposi = C;
               var7.q(var1);
               return;
            case 10:
               GameState.m_BossFlag = 1;
               G = 1024;
               H = -64;
               if (GameState.m_ScrALim_Right != 11040) {
                  GameState.m_ScrALim_Right += 2;
               } else if ((var7.m_Actflg & 128) == 0) {
                  var7.frameOut(var1);
                  return;
               }

               var7.j(var1);
               var7.r(var1);
               var7.m_Yposi = D;
               var7.m_Xposi = C;
               var7.q(var1);
               var7.a(M);
            }
         } else {
            if (var7.m_R_No0_Ms != 4) {
               return;
            }

            if (((Action)var7.m_ReserveObj).m_Reserve[K] >= 6) {
               var7.frameOut(var1);
            } else if (var7.m_R_No1 == 0) {
               var7.m_Patbase_Table = O;
               var7.m_Sproffset = 935;
               var7.m_Actflg |= 4;
               var7.m_Sprpri = 7;
               var7.m_R_No1 = 2;
               var5 = (Action)var7.m_ReserveObj;
               var7.m_Xposi = var5.m_Xposi;
               var7.m_Yposi = var5.m_Yposi;
               var7.m_Sprvs = 8;
               var7.m_Sprhs = 8;
               var7.m_Patno = 18;
               var7.m_Colino = 152;
            } else if (var7.m_R_No1 == 2) {
               var5 = (Action)var7.m_ReserveObj;
               var7.m_Xposi = var5.m_Xposi;
               var7.m_Yposi = var5.m_Yposi;
               var6 = var7.m_Reserve[12];
               var7.m_Yposi += var6;
               ++var6;
               if (var6 >= 46) {
                  var6 = 46;
               }

               var7.m_Reserve[12] = var6;
               if (I == 0) {
                  var7.m_R_No1 += 2;
                  var7.m_Xspeed = 0;
                  var7.m_Yspeed = 0;
               }
            } else {
               if (var7.m_R_No1 != 4) {
                  if (var7.m_R_No1 == 6) {
                     var7.s(var1);
                     var7.patchg(N);
                     if (var7.m_Yposi >= 1797) {
                        var7.frameOut(var1);
                        return;
                     }
                  }

                  return;
               }

               var7.s(var1);
               if ((var19 = ((GameState)var1).emyCol_D(var7.m_Xposi, var7.m_Yposi, var7.m_Sprvs)) < 0) {
                  var7.m_Yposi += var19;
                  var7.m_Sproffset = 935;
                  var7.m_Mstno = 7;
                  var7.m_Patno = 19;
                  var7.m_Yspeed = -768;
                  var7.m_Xspeed = -256;
                  var7.m_R_No0_Ms = 4;
                  var7.m_R_No1 = 6;
                  var7.m_Colino = 152;
                  Action var11;
                  (var11 = var1.insertAction(var7, var7.m_Actno)).m_Actflg = var7.m_Actflg;
                  var11.m_Actno = var7.m_Actno;
                  var11.m_Patbase_Table = var7.m_Patbase_Table;
                  var11.m_Sprpri = var7.m_Sprpri;
                  var11.m_Sprhs = var7.m_Sprhs;
                  var11.m_Sprhsize = var7.m_Sprhsize;
                  var11.m_Sprvs = var7.m_Sprvs;
                  var11.m_Sprvsize = var7.m_Sprvsize;
                  var11.m_Patno = var7.m_Patno;
                  var11.m_Cddat = var7.m_Cddat;
                  var11.m_Colino = var7.m_Colino;
                  var11.m_Sproffset = var7.m_Sproffset;
                  var11.m_Mstno = var7.m_Mstno;
                  var11.m_Yposi = var7.m_Yposi;
                  var11.m_Xposi = var7.m_Xposi;
                  var11.m_Yspeed = var7.m_Yspeed;
                  var11.m_Xspeed = var7.m_Xspeed;
                  var11.m_R_No0_Ms = var7.m_R_No0_Ms;
                  var11.m_R_No1 = var7.m_R_No1;
                  var11.m_Xspeed = -var11.m_Xspeed;
                  var11.m_ReserveObj = var7.m_ReserveObj;
               }
            }
         }
         break;
      case 82:
         switch((var7 = this).m_R_No0_Ms) {
         case 0:
            var7.m_Patbase_Table = var7.R;
            var7.m_Sproffset = 961;
            var7.m_Actflg |= 4;
            var7.m_Sprhsize_Ms = 144;
            var7.m_Sprvsize_Ms = 144;
            var7.m_Sprpri = 4;
            var7.m_Xposi = 12352;
            var7.m_Yposi = 1408;
            var7.m_Reserve[3] = 1;
            var7.m_Patno_Ms = 1;
            var7.m_R_No0_Ms += 2;
            var7.m_Actflg |= 64;
            var7.m_Colino = 50;
            var7.m_Colicnt_Ms = 8;
            if (cCanvas.m_Option[1] == 0) {
               var7.m_Colicnt_Ms = 4;
            }

            if (cCanvas.m_Option[1] == 1) {
               var7.m_Colicnt_Ms = 6;
            }

            H = -224;
            C = var7.m_Xposi;
            D = var7.m_Yposi;
            var7.m_Reserve[4] = 0;
            var7.m_Patno = 1;
            int[][] var28;
            (var28 = new int[1][4])[0][0] = var7.m_Xposi;
            var28[0][1] = var7.m_Yposi;
            var28[0][3] = 2;
            J[0] = 6;
            J[1] = 0;
            J[2] = 16;
            J[3] = 0;
            var7.m_ReserveObj = var28;
            return;
         case 1:
         case 3:
         case 5:
         case 7:
         default:
            return;
         case 2:
            boolean var30;
            switch(var7.m_Reserve[K]) {
            case 0:
               GameState.m_BossState = 0;
               var7.j(var1);
               var30 = false;
               if (var7.m_Reserve[3] == 0) {
                  if (D > 1304) {
                     var30 = true;
                  } else {
                     D = 1304;
                  }
               } else if (D > 1276) {
                  var30 = true;
               } else {
                  D = 1276;
               }

               if (!var30) {
                  H = 0;
                  var7.m_Reserve[1] = 4;
                  var31 = var7.m_Reserve;
                  var10001 = K;
                  var31[var10001] += 2;
                  var7.m_Reserve[5] = 60;
               }

               var7.m_Yposi = D;
               var7.u(var1);
               return;
            case 1:
            case 3:
            case 5:
            case 7:
            default:
               return;
            case 2:
               if (--var7.m_Reserve[5] <= 0) {
                  GameState.m_BossState = 1;
                  var7.m_Manysprcnt = 1;
                  var7.m_Sprpositbl = (int[][])((int[][])var7.m_ReserveObj);
                  if (var7.m_Reserve[5] == -24) {
                     (var4 = var1.insertAction(var7.m_Actno)).m_Actno = 82;
                     var4.m_R_No0_Ms = 4;
                     var4.m_Actflg = var7.m_Actflg;
                     var4.m_Actflg &= 1;
                     var4.m_Xposi = var7.m_Xposi;
                     var4.m_Yposi = var7.m_Yposi;
                     var4.m_R_No1 = 0;
                     var4.m_Reserve[K] = 0;
                     var7.m_Reserve[5] = 47;
                     var7.u(var1);
                     var7.a();
                     var7.a(var7.T);
                     return;
                  }
               }

               var7.v(var1);
               return;
            case 4:
               GameState.m_BossState = 0;
               var7.m_Manysprcnt = 0;
               var7.m_Sprpositbl = null;
               J[2] = 16;
               J[3] = 0;
               if (--var7.m_Reserve[5] == 0) {
                  H = 224;
                  var31 = var7.m_Reserve;
                  var10001 = K;
                  var31[var10001] += 2;
                  var7.a();
                  return;
               }

               var7.v(var1);
               return;
            case 6:
               var30 = false;
               var7.j(var1);
               if (var7.m_Reserve[3] == 0) {
                  if (D < 1336) {
                     var30 = true;
                  }
               } else if (D < 1352) {
                  var30 = true;
               }

               if (!var30 && var7.m_Reserve[0] == 0) {
                  var7.m_Reserve[0] = 255;
                  (var5 = var1.insertAction(var7.m_Actno)).m_Actflg = 82;
                  var5.m_R_No0_Ms = 6;
                  var5.m_Xposi = var7.m_Xposi;
                  var5.m_Yposi = var7.m_Yposi;
               }

               var24 = false;
               if (var7.m_Reserve[3] == 0) {
                  if (D < 1440) {
                     var24 = true;
                  } else {
                     D = 1440;
                  }
               } else if (D < 1408) {
                  var24 = true;
               } else {
                  D = 1408;
               }

               if (!var24) {
                  H = -224;
                  var7.m_Reserve[K] = 0;
                  var7.m_Reserve[0] = 0;
                  if ((var23 = var1.getSonicAction()).m_Xposi - 12224 >= 0) {
                     D = 1408;
                     var7.m_Xposi = 12352;
                     var7.m_Reserve[3] = 255;
                  } else {
                     var7.m_Xposi = 12096;
                     D = 1440;
                     var7.m_Reserve[3] = 0;
                  }

                  if (var7.m_Xposi <= var23.m_Xposi) {
                     var7.m_Actflg |= 1;
                  } else {
                     var7.m_Actflg &= -2;
                  }
               }

               var7.m_Yposi = D;
               var7.u(var1);
               return;
            case 8:
               var7.m_Manysprcnt = 0;
               var7.m_Sprpositbl = null;
               if (--I >= 0) {
                  if (I >= 30) {
                     var7.w(var1);
                     return;
                  }

                  var7.m_Patno = 16;
                  var7.w(var1);
                  if ((crlCanvas.mCounter & 31L) != 0L) {
                     return;
                  }

                  var7.x(var1);
               } else {
                  if ((crlCanvas.mCounter & 31L) == 0L) {
                     var7.x(var1);
                  }

                  if (I <= 60) {
                     if (GameState.m_BossFlag == 0) {
                        cCanvas.am.bgmRestart();
                        GameState.m_BossFlag = 1;
                        GameState.m_BossStart = 0;
                     }

                     var7.m_Yposi += 2;
                     if (GameState.m_ScrALim_Right <= 12640) {
                        GameState.m_ScrALim_Right += 2;
                        return;
                     }

                     if (var7.m_Actflg <= 0) {
                        if (var7.m_Reserve[3] == 0) {
                           if (var7.m_Yposi <= 1400) {
                              return;
                           }
                        } else if (var7.m_Yposi <= 1416) {
                           return;
                        }
                     }

                     GameState.m_ScrALim_Right = 12640;
                     var7.frameOut(var1);
                     return;
                  }
               }

               return;
            }
         case 4:
            switch(var7.m_R_No1) {
            case 0:
               var7.m_Patbase_Table = var7.R;
               var7.m_Sproffset = 1057;
               var7.m_Actflg |= 4;
               var7.m_Sprpri = 4;
               var7.m_R_No1 += 2;
               var7.m_Mstno = 5;
               var7.m_Colino = 152;
               var7.m_Yposi -= 28;
               if ((var7.m_Actflg & 1) != 0) {
                  var7.m_Xposi += 112;
                  var7.m_Xspeed += 4;
                  return;
               }

               var7.m_Xposi -= 112;
               var7.m_Xspeed -= 4;
               return;
            case 2:
               var7.m_Xposi += var7.m_Xspeed;
               var7.patchg(var7.S);
               var7.frameOutCheck(var1);
               return;
            default:
               return;
            }
         case 6:
            switch(var7.m_R_No1) {
            case 0:
               var17 = var1;
               var18 = var7;
               Object var29 = var7;
               var19 = 0;
               var6 = 1;

               do {
                  if (var29 != var18) {
                     ((Action)(var29 = var17.insertAction(var18.m_Actno))).m_Xposi = var18.m_Xposi;
                     ((Action)var29).m_Yposi = var18.m_Yposi;
                  }

                  ((Action)var29).m_Actno = 82;
                  ((Action)var29).m_R_No0_Ms = 6;
                  ((Action)var29).m_Patbase_Table = var18.R;
                  ((Action)var29).m_Sproffset = 1057;
                  ((Action)var29).m_Actflg |= 4;
                  ((Action)var29).m_Sprpri = 3;
                  ((Action)var29).m_R_No1 += 2;
                  ((Action)var29).m_Mstno = 7;
                  ((Action)var29).m_Colino = 139;
                  ((Action)var29).m_Reserve[7] = var19;
                  ((Action)var29).m_Sprvs = 8;
                  ((Action)var29).m_Sprhs = 8;
                  ((Action)var29).m_Reserve[6] = ((Action)var29).getXposi();
                  short var13 = 7168;
                  if (var19 == 0) {
                     var13 = -7168;
                  }

                  ((Action)var29).m_Xspeed = var13;
                  ((Action)var29).m_Yspeed = -21504;
                  if (((Action)var29).m_Xposi != 12096) {
                     ((Action)var29).m_Yspeed = -25600;
                  }

                  ++var19;
                  if (var29 == var18) {
                     var29 = null;
                  }

                  --var6;
               } while(var6 >= 0);

               return;
            case 2:
               var9 = var7.m_Reserve[6];
               var8 = var7.getYposi();
               var16 = Math.abs((var16 = var7.m_Xspeed) << 4) * (var16 < 0 ? -1 : 1);
               var9 += var16;
               var16 = var7.m_Yspeed;
               var7.m_Yspeed += 896;
               var16 = Math.abs(var16 << 4) * (var16 < 0 ? -1 : 1);
               var8 += var16;
               var7.m_Reserve[6] = var9;
               var7.setYposi(var8);
               var7.setXposi(var7.m_Reserve[6]);
               if ((var16 = ((GameState)var1).emyCol_D(var7.m_Xposi, var7.m_Yposi, var7.m_Sprvs)) <= 0) {
                  var7.m_Yposi += var16;
                  var7.m_Actno = 32;
                  var7.m_R_No0 = 10;
                  var7.m_Mstno = 2;
                  var7.m_Patno = 4;
                  var7.m_Yspeed = 0;
                  var7.m_Patbase_Table = var7.W;
                  var7.m_Sproffset = 33694;
                  var7.m_Patno = 0;
                  var7.m_Reserve[8] = 9;
                  var7.m_Reserve[9] = 3;
                  var7.y(var1);
                  return;
               }

               var7.patchg(var7.S);
               var7.frameOutCheck(var1);
               return;
            default:
               return;
            }
         case 8:
            if (--var7.m_Pattim <= 0) {
               var7.m_Pattim = 17;
               ++var7.m_Patno;
               if (var7.m_Patno == 4) {
                  var7.frameOut(var1);
                  return;
               }
            }

            var12 = var7.m_Reserve[10];
            var3 = var7.getYposi();
            var16 = ((var16 = var7.m_Xspeed) >> 8) * (var16 < 0 ? -1 : 1);
            var12 += var16;
            var16 = ((var16 = var7.m_Yspeed) >> 8) * (var16 < 0 ? -1 : 1);
            var3 += var16;
            var7.m_Reserve[10] = var12;
            var7.setXposi(var7.m_Reserve[10]);
            var7.setYposi(var3);
            return;
         }
      case 86:
         switch((var7 = this).m_R_No0) {
         case 0:
            var7.bboss2Init(var1);
            return;
         case 1:
         case 3:
         case 5:
         case 7:
         case 9:
         case 11:
         case 13:
         default:
            return;
         case 2:
            switch(var7.m_R_No1) {
            case 0:
               var7.m_Colino = 0;
               if (var7.m_Xposi - 10704 <= 0) {
                  var7.m_Xposi = 10704;
                  var7.m_R_No1 += 2;
                  return;
               }

               --var7.m_Xposi;
               ++var7.m_Yposi;
               return;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            default:
               return;
            case 2:
               if (var7.m_R_No2 != 0) {
                  var10002 = var7.m_Reserve[8]--;
                  if (var7.m_Reserve[8] <= 0) {
                     var7.m_Xspeed = -512;
                     var7.m_R_No1 += 2;
                     var7.m_Colino = 15;
                     var31 = var7.m_Reserve;
                     var31[0] |= 2;
                  }

                  return;
               }

               if (var7.m_Yposi < 1054) {
                  ++var7.m_Yposi;
               } else {
                  var7.m_R_No2 += 2;
                  var31 = var7.m_Reserve;
                  var31[0] |= 1;
                  var7.m_Reserve[8] = 60;
               }

               return;
            case 4:
               if (var7.m_R_No1 < 6) {
                  if ((var7.m_Cddat & 128) == 0) {
                     if (var7.m_Colino == 0) {
                        if (var7.m_Reserve[6] == 0) {
                           var7.m_Reserve[6] = 32;
                        }

                        var10002 = var7.m_Reserve[6]--;
                        if (var7.m_Reserve[6] == 0) {
                           var7.m_Colino = 15;
                        }
                     }
                  } else {
                     GameState.scoreUp(100, true);
                     var7.m_R_No1 = 6;
                     var7.m_Xspeed = 0;
                     var7.m_Yspeed = -384;
                     var7.m_Reserve[5] = 179;
                     var31 = var7.m_Reserve;
                     var31[0] |= 8;
                     (var23 = (Action)var7.m_ReserveObj).m_Mstno = 4;
                     var23.m_Patno = 6;
                  }
               }

               var7.a(var1);
               var7.m_Yposi = (var7.m_Reserve[9] >> 1 & '\uffff') - 20;
               var7.m_Reserve[9] = 0;
               var7.setXposi(var7.getXposi() + (var7.m_Xspeed << 8));
               return;
            case 6:
               var10002 = var7.m_Reserve[5]--;
               if (var7.m_Reserve[5] < 0) {
                  var7.m_Xspeed = 0;
                  var7.m_R_No1 += 2;
                  var7.m_Reserve[5] = -38;
                  var7.m_Reserve[8] = 12;
                  return;
               }

               var7.b(var1);
               var7.speedSet();
               if ((var16 = ((GameState)var1).emyCol_D(var7.m_Xposi, var7.m_Yposi, var7.m_Sprvs)) < 0) {
                  var7.m_Yposi += var16;
                  var7.m_Yspeed = 0;
               }

               return;
            case 8:
               var10002 = var7.m_Reserve[8]--;
               if (var7.m_Reserve[8] <= 0) {
                  var7.m_R_No1 += 2;
                  var7.m_R_No2 = 0;
               }

               return;
            case 10:
               switch(var7.m_R_No2) {
               case 0:
                  var31 = var7.m_Reserve;
                  var31[0] &= -2;
                  (var23 = var1.insertAction(var7, var7.m_Actno)).m_Actno = 86;
                  var23.m_ReserveObj = var7;
                  var23.m_Patbase_Image = var7.m_Patbase_Image;
                  var23.m_Patbase_Table = k;
                  var23.m_Sproffset = 9580;
                  var23.m_Actflg = 4;
                  var23.m_Sprhsize = 32;
                  var23.m_Sprpri = 3;
                  var23.m_Xposi = var7.m_Xposi;
                  var23.m_Yposi = var7.m_Yposi;
                  var23.m_Yposi += 12;
                  var23.m_Cddat = var7.m_Cddat;
                  var23.m_Actflg = var7.m_Actflg;
                  var23.m_R_No0 = 12;
                  var23.m_Mstno = 2;
                  var23.m_Reserve = new int[10];
                  var23.m_Reserve[8] = 16;
                  var7.m_Reserve[8] = 50;
                  var7.m_R_No2 += 2;
                  cCanvas.am.bgmRestart();
                  GameState.m_BossFlag = 1;
                  GameState.m_BossStart = 0;
                  return;
               case 1:
               case 3:
               default:
                  return;
               case 2:
                  var10002 = var7.m_Reserve[8]--;
                  if (var7.m_Reserve[8] <= 0) {
                     var31 = var7.m_Reserve;
                     var31[0] |= 4;
                     var7.m_Reserve[8] = 96;
                     var7.m_R_No2 += 2;
                  }

                  return;
               case 4:
                  var10002 = var7.m_Reserve[8]--;
                  if (var7.m_Reserve[8] <= 0) {
                     var7.m_Cddat |= 1;
                     var7.m_Actflg |= 1;
                     var7.m_Xposi += 6;
                  } else {
                     --var7.m_Yposi;
                  }

                  if (GameState.m_ScrALim_Right - 10928 < 0) {
                     GameState.m_ScrALim_Right += 2;
                     return;
                  }

                  if ((var7.m_Actflg & 128) == 0) {
                     ((Action)var7.m_ReserveObj).frameOut(var1);
                     var7.frameOut(var1);
                  }

                  return;
               }
            }
         case 4:
            if (var7.m_R_No1 == 0) {
               if ((var2 = (Action)var7.m_ReserveObj).m_Actno != 86) {
                  var7.frameOut(var1);
                  return;
               }

               if ((var2.m_Reserve[0] & 1) != 0) {
                  var7.m_Mstno = 1;
                  var7.m_Reserve[8] = 24;
                  var7.m_R_No1 = 2;
               }

               var7.m_Xposi = var2.m_Xposi;
               var7.m_Yposi = var2.m_Yposi;
               var7.m_Cddat = var2.m_Cddat;
               var7.m_Actflg = var2.m_Actflg;
            } else {
               var10002 = var7.m_Reserve[8]--;
               if (var7.m_Reserve[8] <= 0) {
                  if (var7.m_Reserve[8] <= -16) {
                     var7.frameOut(var1);
                     return;
                  }

                  var7.m_Sprpri = 4;
                  ++var7.m_Yposi;
               }
            }

            var7.patchg(l);
            return;
         case 6:
            if (var7.m_R_No1 == 0) {
               if (GameState.m_ScrALim_Left >= 10480) {
                  if (var7.m_Xposi > 10704) {
                     --var7.m_Xposi;
                  } else {
                     var7.m_Xposi = 10704;
                     var7.m_R_No1 += 2;
                  }

                  return;
               }
            } else if (((var2 = (Action)var7.m_ReserveObj).m_Reserve[0] & 2) != 0 && (var2.m_Reserve[0] & 4) == 0) {
               var7.m_Xposi = var2.m_Xposi;
               var7.m_Yposi = var2.m_Yposi;
               var7.m_Yposi += 8;
               var7.m_Cddat = var2.m_Cddat;
               if ((var7.m_Cddat & 128) == 0) {
                  var7.m_Actflg = var2.m_Actflg;
               }

               return;
            }

            return;
         case 8:
            switch(var7.m_R_No1) {
            case 0:
               if (GameState.m_ScrALim_Left >= 10480) {
                  var7.m_Yspeed = 256;
                  if (var7.m_Userflag > 1) {
                     if (var7.m_Xposi > 10660) {
                        --var7.m_Xposi;
                     } else {
                        var7.m_R_No1 += 2;
                     }
                  } else if (var7.m_Userflag == 1) {
                     if (var7.m_Xposi > 10692) {
                        --var7.m_Xposi;
                     } else {
                        var7.m_R_No1 += 2;
                     }
                  } else if (var7.m_Xposi > 10732) {
                     --var7.m_Xposi;
                  } else {
                     var7.m_Xposi = 10732;
                     var7.m_R_No1 += 2;
                  }

                  var7.speedSet();
                  if ((var16 = ((GameState)var1).emyCol_D(var7.m_Xposi, var7.m_Yposi, var7.m_Sprvs)) <= 0) {
                     var7.m_Yposi += var16;
                  }

                  if (var7.m_R_No1 != 0) {
                     var7.m_Xspeed = -512;
                  }

                  var7.patchg(o);
               }

               return;
            case 1:
            case 3:
            case 5:
            case 7:
            default:
               return;
            case 2:
               if ((var4 = (Action)var7.m_ReserveObj).m_Actno == 86) {
                  if ((var4.m_Reserve[0] & 2) != 0) {
                     var7.m_R_No1 += 2;
                     if (var7.m_Sprpri == 2) {
                        var31 = ((Action)var7.m_ReserveObj).m_Reserve;
                        var31[9] += var7.m_Yposi;
                        return;
                     }
                  }

                  return;
               }

               var4.frameOut(var1);
               return;
            case 4:
               if ((var4 = (Action)var7.m_ReserveObj).m_Actno == 86) {
                  var7.m_Cddat = var4.m_Cddat;
                  var7.m_Actflg = var4.m_Actflg;
                  if ((var7.m_Cddat & 128) != 0) {
                     var7.m_R_No1 += 2;
                  } else if (var4.m_Colino == 0 && (cCanvas.m_ScreenFrame & 1) == 1) {
                     var7.m_Patbase_Table = n;
                  } else {
                     var7.m_Patbase_Table = m;
                  }

                  var7.a(var1);
                  var7.speedSet();
                  if ((var19 = ((GameState)var1).emyCol_D(var7.m_Xposi, var7.m_Yposi, var7.m_Sprvs)) < 0) {
                     var7.m_Yposi += var19;
                  }

                  var7.m_Yspeed = 256;
                  if (var7.m_Sprpri == 2) {
                     var31 = ((Action)var7.m_ReserveObj).m_Reserve;
                     var31[9] += var7.m_Yposi;
                  }

                  var7.patchg(o);
                  return;
               }

               var4.frameOut(var1);
               return;
            case 6:
               var10002 = var7.m_Reserve[8]--;
               if (var7.m_Reserve[8] <= 0) {
                  var7.m_R_No1 += 2;
                  var7.m_Reserve[8] = 10;
                  var7.m_Yspeed = -768;
                  if (var7.m_Sprpri != 2) {
                     var7.m_Xspeed = -var7.m_Xspeed;
                     return;
                  }
               }

               return;
            case 8:
               var10002 = var7.m_Reserve[8]--;
               if (var7.m_Reserve[8] <= 0) {
                  var7.speedSet();
                  if ((var16 = ((GameState)var1).emyCol_D(var7.m_Xposi, var7.m_Yposi, var7.m_Sprvs)) < 0) {
                     var7.m_Yspeed = -512;
                     var7.m_Yposi += var16;
                  }

                  var7.frameOutCheck(var1);
               }

               return;
            }
         case 10:
            if (var7.m_R_No1 == 0) {
               if (GameState.m_ScrALim_Left >= 10480) {
                  if (var7.m_Xposi > 10650) {
                     --var7.m_Xposi;
                  } else {
                     var7.m_Xposi = 10650;
                     var7.m_R_No1 += 2;
                  }

                  return;
               }

               return;
            } else {
               if ((var2 = (Action)var7.m_ReserveObj).m_Actno != 86) {
                  var2.frameOut(var1);
                  return;
               }

               byte var21;
               if ((var2.m_Reserve[0] & 8) == 0) {
                  if (var2.m_Colicnt == 1) {
                     label1009: {
                        var10 = var1.getSonicAction();
                        if (var7.m_Xposi <= var10.m_Xposi) {
                           if ((var2.m_Cddat & 1) == 0) {
                              break label1009;
                           }
                        } else if ((var2.m_Cddat & 1) != 0) {
                           break label1009;
                        }

                        var31 = var2.m_Reserve;
                        var31[0] |= 8;
                     }
                  }

                  if ((var2.m_Reserve[0] & 2) != 0) {
                     var7.m_Colino = 139;
                     var7.m_Xposi = var2.m_Xposi;
                     var7.m_Yposi = var2.m_Yposi;
                     var7.m_Cddat = var2.m_Cddat;
                     var7.m_Actflg = var2.m_Actflg;
                     var7.m_Yposi += 16;
                     var21 = -54;
                     if ((var7.m_Cddat & 1) != 0) {
                        var21 = 54;
                     }

                     var7.m_Xposi += var21;
                     if (var2.m_Colino == 0 && (cCanvas.m_ScreenFrame & 1) == 1) {
                        var7.m_Patbase_Table = n;
                     } else {
                        var7.m_Patbase_Table = m;
                     }

                     var7.patchg(o);
                     return;
                  }
               } else {
                  var21 = -3;
                  if ((var7.m_Cddat & 1) != 0) {
                     var21 = 3;
                  }

                  var7.m_Xposi += var21;
                  var7.patchg(o);
               }

               return;
            }
         case 12:
            --var7.m_Yposi;
            var10002 = var7.m_Reserve[8]--;
            if (var7.m_Reserve[8] <= 0) {
               var7.m_R_No0 = 4;
               var7.patchg(l);
            }

            return;
         case 14:
            var2 = (Action)var7.m_ReserveObj;
            var7.m_Xposi = var2.m_Xposi;
            var7.m_Yposi = var2.m_Yposi;
            var7.m_Cddat = var2.m_Cddat;
            var7.m_Actflg = var2.m_Actflg;
            if ((var2.m_Reserve[6] & 255) == 31) {
               var7.m_Mstno = 2;
            }

            var15 = var1.getSonicAction();
            var4 = var1.getTailsAction();
            if ((var15 != null && var15.m_R_No0 == 4 || var4 != null && var4.m_R_No0 == 4) && var7.m_Mstno != 2) {
               var7.m_Mstno = 3;
            }

            var7.patchg(q);
            return;
         }
      case 93:
         label1178: {
            Object var22;
            label1140: {
               switch((var7 = this).m_R_No0) {
               case 0:
                  var7.m_Patbase_Table = d;
                  var7.m_Sproffset = 9248;
                  var7.m_Actflg |= 4;
                  var7.m_Sprhsize = 32;
                  var7.m_Xposi = 11136;
                  var7.m_Yposi = 1200;
                  var7.m_Sprpri = 3;
                  var7.m_Colino = 15;
                  var7.m_Colicnt = 8;
                  if (cCanvas.m_Option[1] == 0) {
                     var7.m_Colicnt = 4;
                  }

                  if (cCanvas.m_Option[1] == 1) {
                     var7.m_Colicnt = 6;
                  }

                  var7.m_R_No0 += 2;
                  var7.m_Reserve[2] = var7.m_Xposi;
                  var7.m_Reserve[4] = var7.m_Yposi;
                  var31 = var7.m_Reserve;
                  var31[0] &= -9;
                  var7.m_Sprvs = 12;
                  m_BossWorking = true;
                  (var2 = var1.insertAction(var7, var7.m_Actno)).m_Actno = 93;
                  var2.m_ReserveObj = var7;
                  var7.m_ReserveObj = var2;
                  var2.m_Patbase_Table = d;
                  var2.m_Sproffset = 1056;
                  var2.m_Actflg = 4;
                  var2.m_Sprhsize = 32;
                  var2.m_Sprpri = 3;
                  var2.m_Xposi = var7.m_Xposi;
                  var2.m_Yposi = var7.m_Yposi;
                  var2.m_R_No0 = 22;
                  var2.m_Mstno = 1;
                  var2.m_Actflg = var7.m_Actflg;
                  (var2 = var1.insertAction(var7, var7.m_Actno)).m_Actno = 93;
                  var2.m_ReserveObj = var7;
                  var2.m_Patbase_Image = var7.m_Patbase_Image;
                  var2.m_Patbase_Table = i;
                  var2.m_Sproffset = 1048;
                  var2.m_Pattim = 1;
                  var2.m_Actflg = 4;
                  var2.m_Sprhsize = 32;
                  var2.m_Sprpri = 3;
                  var2.m_Xposi = var7.m_Xposi;
                  var2.m_Yposi = var7.m_Yposi;
                  var2.m_R_No0 = 24;
                  var2.m_Actflg = var7.m_Actflg;
                  (var2 = var1.insertAction(var7, var7.m_Actno)).m_Actno = 93;
                  var2.m_ReserveObj = var7;
                  var2.m_Patbase_Image = var7.m_Patbase_Image;
                  var2.m_Patbase_Table = g;
                  var2.m_Patno = 40;
                  var2.m_Sproffset = 9472;
                  var2.m_Actflg = 4;
                  var2.m_Sprhsize = 32;
                  var2.m_Sprpri = 2;
                  var2.m_Xposi = var7.m_Xposi;
                  var2.m_Yposi = var7.m_Yposi;
                  var2.m_R_No0 = 18;
                  (var2 = var1.insertAction(var7, var7.m_Actno)).m_Actno = 93;
                  var2.m_ReserveObj = var7;
                  var2.m_Patbase_Image = var7.m_Patbase_Image;
                  var2.m_Patbase_Table = g;
                  var2.m_Patno = 40;
                  var2.m_Sproffset = 9472;
                  var2.m_Actflg = 4;
                  var2.m_Sprhsize = 32;
                  var2.m_Sprpri = 4;
                  var2.m_Xposi = var7.m_Xposi;
                  var2.m_Yposi = var7.m_Yposi;
                  var2.m_Yposi -= 56;
                  var2.m_Xposi -= 16;
                  var2.m_Reserve[15] = -16;
                  var2.m_R_No0 += 16;
                  var2.m_Mstno = 6;
                  (var2 = var1.insertAction(var7, var7.m_Actno)).m_Actno = 93;
                  var2.m_ReserveObj = var7;
                  var2.m_Patbase_Image = var7.m_Patbase_Image;
                  var2.m_Patbase_Table = g;
                  var2.m_Patno = 40;
                  var2.m_Sproffset = 9472;
                  var2.m_Actflg = 4;
                  var2.m_Sprhsize = 32;
                  var2.m_Sprpri = 4;
                  var2.m_Xposi = var7.m_Xposi;
                  var2.m_Yposi = var7.m_Yposi;
                  var2.m_R_No0 = 4;
                  return;
               case 1:
               case 3:
               case 5:
               case 7:
               case 9:
               case 11:
               case 13:
               case 15:
               case 17:
               case 19:
               case 21:
               case 23:
               case 25:
               default:
                  break;
               case 2:
                  if ((var18 = var7).m_R_No1 < 8) {
                     if (var1.getSonicAction().m_Xposi <= var18.m_Xposi) {
                        var18.m_Cddat &= -2;
                     } else {
                        var18.m_Cddat |= 1;
                     }
                  }

                  switch(var7.m_R_No1) {
                  case 0:
                     var7.m_Yspeed = 256;
                     var7.g(var1);
                     if (var7.m_Reserve[4] == 1216) {
                        var7.m_Yspeed = 0;
                        var7.m_R_No1 += 2;
                     }

                     var7.h(var1);
                  case 1:
                  case 3:
                  case 5:
                  case 7:
                  case 9:
                  case 11:
                  default:
                     break;
                  case 2:
                     short var26;
                     if ((var7.m_Reserve[0] & 8) == 0) {
                        var26 = 11056;
                     } else {
                        var26 = 10832;
                     }

                     if (Math.abs(var26 - var7.m_Reserve[2]) > 3) {
                        if (var26 <= var7.m_Reserve[2]) {
                           var7.m_Xspeed = -768;
                        } else {
                           var7.m_Xspeed = 768;
                        }

                        var7.g(var1);
                     } else if (var7.m_Reserve[4] == 1216) {
                        var7.m_Xspeed = 0;
                        var7.m_Yspeed = 0;
                        var7.m_R_No1 += 2;
                        var31 = var7.m_Reserve;
                        var31[0] ^= 8;
                        var31 = var7.m_Reserve;
                        var31[1] |= 1;
                     }

                     var7.h(var1);
                     break;
                  case 4:
                     var7.getChemical_bboss1(var1);
                     break;
                  case 6:
                     var4 = var1.getSonicAction();
                     var24 = false;
                     if (var4.m_Xposi + 76 < var7.m_Reserve[2]) {
                        var19 = (var7.m_Reserve[2] << 16 | var7.m_Reserve[19]) - 65536;
                        var7.m_Reserve[2] = var19 >> 16;
                        var7.m_Reserve[19] = var19 & '\uffff';
                        if (var7.m_Reserve[2] <= 10792) {
                           var7.m_Reserve[2] = 10792;
                        }
                     } else if (var4.m_Xposi + 76 > var7.m_Reserve[2]) {
                        var19 = (var7.m_Reserve[2] << 16 | var7.m_Reserve[19]) + 65536;
                        var7.m_Reserve[2] = var19 >> 16;
                        var7.m_Reserve[19] = var19 & '\uffff';
                        if (var7.m_Reserve[2] >= 11120) {
                           var7.m_Reserve[2] = 11120;
                        }
                     }

                     var7.h(var1);
                     break;
                  case 8:
                     var10002 = var7.m_Reserve[5]--;
                     if (var7.m_Reserve[5] > 0) {
                        var7.b(var1);
                     } else {
                        var7.m_Cddat |= 1;
                        var7.m_Cddat &= -129;
                        var7.m_Xspeed = 0;
                        var7.m_R_No1 += 2;
                        var7.m_Reserve[5] = -38;
                     }
                     break;
                  case 10:
                     var10002 = var7.m_Reserve[5]++;
                     if (var7.m_Reserve[5] != 0) {
                        if (var7.m_Reserve[5] > 0) {
                           if (var7.m_Reserve[5] < 48) {
                              var7.m_Yspeed -= 8;
                           } else if (var7.m_Reserve[5] == 48) {
                              var7.m_Yspeed = 0;
                              cCanvas.am.bgmRestart();
                              GameState.m_BossStart = 0;
                           } else if (var7.m_Reserve[5] >= 56) {
                              var7.m_R_No1 += 2;
                           }
                        } else {
                           var7.m_Yspeed += 24;
                        }
                     } else {
                        var7.m_Yspeed = 0;
                     }

                     var7.g(var1);
                     var7.h(var1);
                     break;
                  case 12:
                     GameState.m_BossFlag = 1;
                     var31 = var7.m_Reserve;
                     var31[1] |= 64;
                     var7.m_Xspeed = 1024;
                     var7.m_Yspeed = -64;
                     if (GameState.m_ScrALim_Right < 11312) {
                        GameState.m_ScrALim_Right += 2;
                        var7.g(var1);
                        var7.h(var1);
                     } else if ((var7.m_Actflg & 128) != 0) {
                        var7.g(var1);
                        var7.h(var1);
                     } else {
                        ((Action)var7.m_ReserveObj).frameOut(var1);
                        var7.frameOut(var1);
                     }
                  }

                  if (t && (cCanvas.m_ScreenFrame & 1) == 1) {
                     var7.m_Patbase_Table = e;
                  } else {
                     var7.m_Patbase_Table = d;
                  }

                  var7.patchg(c);
                  var7.m_Actflg = var7.m_Cddat & 3 | var7.m_Actflg & 252;
                  return;
               case 4:
                  var22 = null;
                  if (var7.m_R_No1 != 0) {
                     if (var7.m_Reserve[9] > 0) {
                        var22 = var1.insertAction(var7, var7.m_Actno);
                        if (v == u.length) {
                           for(var6 = 0; var6 < v; ++var6) {
                              if (u[var6] == null) {
                                 u[var6] = var22;
                                 break;
                              }
                           }
                        } else {
                           u[v++] = var22;
                        }

                        ((Action)var22).m_ReserveObj = var7;
                     }
                     break label1140;
                  }

                  if (((var2 = (Action)var7.m_ReserveObj).m_Reserve[1] & 1) != 0) {
                     var7.m_Xposi = var2.m_Xposi;
                     var7.m_Yposi = var2.m_Yposi;
                     var7.m_Yposi += 24;
                     var7.m_Reserve[9] = 12;
                     var7.m_R_No1 += 2;
                     var22 = var7;
                     break label1140;
                  }
                  break;
               case 6:
                  if (var7.m_R_No1 == 0) {
                     var2 = var1.insertAction(var7, var7.m_Actno);
                     var7.m_R_No0 = 14;
                     var2.m_R_No0 = 6;
                     var2.m_R_No1 = 2;
                     var2.m_Actno = 93;
                     var2.m_Patbase_Image = var7.m_Patbase_Image;
                     var2.m_Patbase_Table = g;
                     var2.m_Patno = 40;
                     var2.m_Sproffset = 9472;
                     var2.m_Actflg = 4;
                     var2.m_Sprhsize = 32;
                     var2.m_Sprpri = 4;
                     var2.m_Reserve[12] = 2;
                     var2.m_Xposi = var7.m_Xposi;
                     var2.m_Yposi = var7.m_Yposi;
                     boolean var20 = false;
                     var2.m_Reserve[11] = 88;
                     var2.m_Yposi += 88;
                     var2.m_Mstno = 2;
                     var2.m_ReserveObj = var7;
                     var2.m_Reserve[10] = 18;
                     (var2 = var1.insertAction(var7, var7.m_Actno)).m_Actno = 93;
                     var2.m_R_No0 = 10;
                     var2.m_ReserveObj = var7.m_ReserveObj;
                     var7.c(var1);
                  } else {
                     if (var7.m_R_No1 != 2) {
                        var10002 = var7.m_Reserve[10]--;
                        if (var7.m_Reserve[10] == 0) {
                           var10002 = var7.m_Reserve[12]--;
                           if (var7.m_Reserve[12] != 0) {
                              var7.m_Mstno = 2;
                              var7.m_Reserve[10] = 18;
                              var7.m_R_No1 = 2;
                              var7.m_Reserve[11] = 88;
                           }

                           (var2 = (Action)var7.m_ReserveObj).m_R_No0 = 8;
                           var2.m_Reserve[11] = 88;
                           var7.frameOut(var1);
                        }

                        return;
                     }

                     if ((((Action)(var2 = (Action)var7.m_ReserveObj).m_ReserveObj).m_Cddat & 128) == 0) {
                        var7.m_Xposi = var2.m_Xposi;
                        var7.m_Yposi = var2.m_Yposi;
                        var10002 = var7.m_Reserve[10]--;
                        if (var7.m_Reserve[10] != 0) {
                           break label1178;
                        }

                        var7.m_Reserve[10] = 18;
                        var31 = var7.m_Reserve;
                        var31[11] -= 8;
                        if (var7.m_Reserve[11] > 0) {
                           break label1178;
                        }

                        if (var7.m_Reserve[11] == 0) {
                           var7.m_Mstno = 3;
                           var7.m_Reserve[10] = 12;
                           break label1178;
                        }

                        var7.m_Reserve[10] = 6;
                        var7.m_R_No1 = 4;
                     } else {
                        var7.frameOut(var1);
                     }
                  }
                  break;
               case 8:
                  if (var7.m_Reserve[17] != 0) {
                     return;
                  }

                  var12 = var7.m_Reserve[11] + var7.m_Yposi;

                  for(var3 = 0; var3 < u.length; ++var3) {
                     if ((var4 = (Action)u[var3]) != null && var4.m_Yposi == var12) {
                        var4.m_Cddat |= 128;
                        u[var3] = null;
                        var31 = var7.m_Reserve;
                        var31[11] -= 8;
                        if (var7.m_Reserve[11] == 0) {
                           var7.m_Reserve[17] = 0;
                        }

                        var7.c(var1);
                        return;
                     }
                  }

                  var7.c(var1);
                  return;
               case 10:
                  if ((var7.m_Cddat & 128) != 0) {
                     var7.frameOut(var1);
                     return;
                  }

                  switch(var7.m_R_No1) {
                  case 0:
                     var7.m_R_No1 = 2;
                     var7.m_Actno = 93;
                     var7.m_Patbase_Table = g;
                     var7.m_Patno = 40;
                     var7.m_Sproffset = 25856;
                     var7.m_Actflg = 4;
                     var7.m_Sprhsize = 32;
                     var7.m_Sprpri = 6;
                     var2 = (Action)var7.m_ReserveObj;
                     var7.m_Xposi = var2.m_Xposi;
                     var7.m_Yposi = var2.m_Yposi;
                     var7.m_Reserve[10] = 15;
                     var7.m_Mstno = 4;
                  case 2:
                     var10002 = var7.m_Reserve[10]--;
                     if (var7.m_Reserve[10] != 0) {
                        var2 = (Action)var7.m_ReserveObj;
                        var7.m_Xposi = var2.m_Xposi;
                        var7.m_Yposi = var2.m_Yposi;
                        var7.m_Cddat = var2.m_Cddat;
                        var7.m_Actflg = var2.m_Actflg;
                        if (t && (cCanvas.m_ScreenFrame & 1) == 1) {
                           var7.m_Patbase_Table = h;
                        } else {
                           var7.m_Patbase_Table = g;
                        }

                        var7.patchg(f);
                        return;
                     }

                     var7.m_Mstno = 5;
                     var7.m_Reserve[10] = 4;
                     var7.m_R_No1 += 2;
                     var7.m_Yposi -= 36;
                     var7.m_Xposi -= 2;
                     var7.m_IsDrawPatno = false;
                     return;
                  case 1:
                  case 3:
                  default:
                     return;
                  case 4:
                     var7.m_IsDrawPatno = true;
                     var10002 = var7.m_Reserve[10]--;
                     if (var7.m_Reserve[10] == 0) {
                        var7.m_R_No1 = 0;
                        var31 = ((Action)var7.m_ReserveObj).m_Reserve;
                        var31[1] |= 2;
                        var10002 = var7.m_Reserve[17]++;
                        if (var7.m_Reserve[17] >= 12) {
                           var7.frameOut(var1);
                           return;
                        }
                     } else {
                        var2 = (Action)var7.m_ReserveObj;
                        var7.m_Xposi = var2.m_Xposi;
                        var7.m_Yposi = var2.m_Yposi;
                        var7.m_Yposi -= 36;
                        var7.m_Xposi -= 2;
                        if ((var7.m_Actflg & 1) != 0) {
                           var7.m_Xposi += 4;
                        }

                        if (t && (cCanvas.m_ScreenFrame & 1) == 1) {
                           var7.m_Patbase_Table = h;
                        } else {
                           var7.m_Patbase_Table = g;
                        }

                        var7.patchg(f);
                     }

                     return;
                  }
               case 12:
                  switch(var7.m_R_No1) {
                  case 0:
                     var7.m_R_No1 += 2;
                     var7.m_Sprvs = 32;
                     var7.m_Mstno = 25;
                     var7.m_Yspeed = 0;
                     if (((var4 = (Action)((Action)var7.m_ReserveObj).m_ReserveObj).m_Reserve[0] & 4) != 0) {
                        var31 = var4.m_Reserve;
                        var31[0] &= -5;
                        var7.m_R_No1 = 6;
                        var7.m_Reserve[16] = 9;
                     }

                     var7.d(var1);
                     return;
                  case 1:
                  case 3:
                  case 5:
                  case 7:
                  default:
                     return;
                  case 2:
                     var7.d(var1);
                     return;
                  case 4:
                     var17 = var1;
                     var18 = var7;
                     if (var7.m_Userflag == 0) {
                        var7.m_Yposi += 24;
                        var7.m_Xposi += 12;
                        if ((var7.m_Actflg & 1) != 0) {
                           var7.m_Xposi -= 24;
                        }

                        var7.m_Sprvs = 4;
                        var7.m_Sprhs = 4;
                        ++var7.m_Userflag;
                        var7.m_Patno = 9;
                        var7.m_Yspeed = -(var7.m_Yspeed >> 1);
                        var24 = ((var16 = Utilities.getRandom() & '\uffff') & '耀') != 0;
                        var16 >>= 6;
                        if (!var24) {
                           var16 += 512;
                        }

                        var16 -= 256;
                        var7.m_Xspeed = var16;
                        var7.m_Colino = 0;
                        var6 = 3;

                        do {
                           (var10 = var17.insertAction(var18, var18.m_Actno)).m_Actno = 93;
                           var10.m_ReserveObj = var18;
                           var10.m_Patbase_Image = var18.m_Patbase_Image;
                           var10.m_Patbase_Table = g;
                           var10.m_Patno = 40;
                           var10.m_Sproffset = 25856;
                           var10.m_Actflg = 4;
                           var10.m_Sprhsize = 32;
                           var10.m_Sprpri = 2;
                           var10.m_Xposi = var18.m_Xposi;
                           var10.m_Yposi = var18.m_Yposi;
                           var10.m_Sprvs = 4;
                           var10.m_Sprhs = 4;
                           var10.m_Patno = 9;
                           var10.m_R_No0 = 12;
                           var10.m_R_No1 = 4;
                           var10.m_Userflag = 1;
                           var10.m_Yspeed = var18.m_Yspeed;
                           var10.m_Colino = var18.m_Colino;
                           var8 = var16 = Utilities.getRandom();
                           var24 = ((var16 &= 65535) & '耀') != 0;
                           var16 >>= 6;
                           if (!var24) {
                              var16 += 128;
                           }

                           var16 -= 128;
                           var10.m_Xspeed = var16;
                           var10.m_Yspeed -= var8 >> 16 & 1023;
                           --var6;
                        } while(var6 >= 0);

                        return;
                     }

                     var7.speedSet();
                     if ((var16 = ((GameState)var1).emyCol_D(var7.m_Xposi, var7.m_Yposi, var7.m_Sprvs)) >= 0) {
                        var7.frameOutCheck(var1);
                        return;
                     }

                     var7.frameOut(var1);
                     var7.m_Yposi += var16;
                     var7.m_Yspeed = -(var7.m_Yspeed >> 1);
                     return;
                  case 6:
                     var10002 = var7.m_Reserve[16]--;
                     if (var7.m_Reserve[16] <= 0) {
                        var7.m_Sprpri = 2;
                        var7.m_Patno = 37;
                        var4 = (Action)((Action)var7.m_ReserveObj).m_ReserveObj;
                        var7.m_Xposi = var4.m_Xposi;
                        var7.m_Yposi = var4.m_Yposi;
                        var7.m_R_No1 += 2;
                        var7.m_Pattim = 8;
                        var7.e(var1);
                        return;
                     }

                     var7.speedSet2();
                     if (t && (cCanvas.m_ScreenFrame & 1) == 1) {
                        var7.m_Patbase_Table = h;
                     } else {
                        var7.m_Patbase_Table = g;
                     }

                     var7.patchg(f);
                     return;
                  case 8:
                     var7.e(var1);
                     return;
                  }
               case 14:
                  var7.c(var1);
                  return;
               case 16:
                  switch(var7.m_R_No1) {
                  case 0:
                     if (((var4 = (Action)var7.m_ReserveObj).m_Reserve[1] & 128) == 0) {
                        var31 = var4.m_Reserve;
                        var31[1] |= 128;
                        (var4 = var1.insertAction(var7, var7.m_Actno)).m_Actno = 93;
                        var4.m_ReserveObj = var7;
                        var4.m_Patbase_Image = var7.m_Patbase_Image;
                        var4.m_Patbase_Table = g;
                        var4.m_Patno = 11;
                        var4.m_Sproffset = 9472;
                        var4.m_Actflg = 4;
                        var4.m_Sprhsize = 32;
                        var4.m_Sprpri = 4;
                        var4.m_Xposi = var7.m_Xposi;
                        var4.m_Yposi = var7.m_Yposi;
                        var4.m_R_No0 = 16;
                        var4.m_R_No1 = 4;
                        var4.m_Mstno = 9;
                     }

                     (var4 = var1.insertAction(var7, var7.m_Actno)).m_Actno = 93;
                     var4.m_ReserveObj = var7;
                     var4.m_Patbase_Image = var7.m_Patbase_Image;
                     var4.m_Patbase_Table = g;
                     var4.m_Patno = 40;
                     var4.m_Sproffset = 25856;
                     var4.m_Actflg = 4;
                     var4.m_Sprhsize = 32;
                     var4.m_Sprpri = 5;
                     var4.m_Xposi = var7.m_Xposi;
                     var4.m_Yposi = var7.m_Yposi;
                     var4.m_R_No0 += 16;
                     var4.m_R_No1 = 6;
                     var7.m_R_No1 += 2;
                     var7.f(var1);
                     return;
                  case 1:
                  case 3:
                  case 5:
                  case 7:
                  case 9:
                  default:
                     return;
                  case 2:
                     var7.f(var1);
                     return;
                  case 4:
                     if ((var7.m_Cddat & 128) != 0) {
                        var7.frameOut(var1);
                        return;
                     }

                     if ((((Action)((Action)var7.m_ReserveObj).m_ReserveObj).m_Reserve[1] & 32) != 0 && var7.m_Mstno == 9) {
                        var7.m_Mstno = 10;
                     }

                     var7.i(var1);
                     return;
                  case 6:
                     if ((var7.m_Cddat & 128) != 0) {
                        var7.frameOut(var1);
                        return;
                     }

                     if ((var4 = (Action)var7.m_ReserveObj).m_ReserveObj == null) {
                        var7.frameOut(var1);
                        return;
                     }

                     var19 = (var4 = (Action)var4.m_ReserveObj).m_Reserve[1];
                     var31 = var4.m_Reserve;
                     var31[1] &= -9;
                     if ((var19 & 8) != 0) {
                        var7.m_R_No0 = 12;
                        var7.m_R_No1 = 0;
                        var7.m_Colino = 135;
                     } else {
                        var19 = var4.m_Reserve[1];
                        var31 = var4.m_Reserve;
                        var31[1] &= -3;
                        if ((var19 & 2) == 0) {
                           if (var7.m_Mstno == 0) {
                              return;
                           }
                        } else {
                           if (var7.m_Mstno == 0) {
                              var7.m_Mstno = 11;
                           }

                           ++var7.m_Mstno;
                           if (var7.m_Mstno >= 23) {
                              var31 = var4.m_Reserve;
                              var31[1] &= -2;
                              var31 = var4.m_Reserve;
                              var31[1] |= 4;
                           }
                        }
                     }

                     var7.i(var1);
                     return;
                  case 8:
                     if ((var7.m_Cddat & 128) != 0) {
                        var7.frameOut(var1);
                        return;
                     }

                     if (--var7.m_Reserve[16] == 0) {
                        var7.frameOut(var1);
                        return;
                     }

                     var7.i(var1);
                     return;
                  case 10:
                     var17 = var1;
                     var18 = var7;
                     var7.m_Reserve[10] = 30;
                     var4 = (Action)var7.m_ReserveObj;
                     var7.m_Xposi = var4.m_Xposi;
                     var7.m_Yposi = var4.m_Yposi;
                     var7.m_Yposi -= 56;
                     var19 = var7.m_Reserve[15];
                     if ((var7.m_Actflg & 1) != 0) {
                        var19 = -var19;
                     }

                     var7.m_Xposi += var19;
                     var7.m_Patno = 32;
                     var7.m_R_No0 = 20;
                     var19 = Utilities.getRandom();
                     var7.m_Xspeed = var19 % 3 - 1;
                     var7.m_Yspeed -= 896;
                     var6 = 0;
                     var19 = var7.m_Reserve[15];
                     var19 += 24;
                     if (var19 < 0) {
                        var19 += 24;
                        if (var19 < 0) {
                           var19 += 24;
                           if (var19 < 0) {
                              ++var6;
                           }

                           ++var6;
                        }

                        ++var6;
                     }

                     --var6;
                     if (var6 >= 0) {
                        do {
                           (var4 = var17.insertAction(var18, var18.m_Actno)).m_Actno = 93;
                           var4.m_Patbase_Image = var18.m_Patbase_Image;
                           var4.m_Patbase_Table = g;
                           var4.m_Patno = 40;
                           var4.m_Patno = 33;
                           var4.m_R_No0 = 20;
                           var4.m_Sproffset = 9472;
                           var4.m_Actflg = var18.m_Actflg;
                           var4.m_Sprhsize = 32;
                           var4.m_Sprpri = 2;
                           var4.m_Xposi = var18.m_Xposi;
                           var4.m_Yposi = var18.m_Yposi;
                           var4.m_Yposi += 8;
                           var9 = var6 == 0 ? 24 : (var6 == 1 ? 48 : 72);
                           if ((var18.m_Actflg & 1) != 0) {
                              var9 = -var9;
                           }

                           var4.m_Xposi += var9;
                           var19 = Utilities.getRandom();
                           var4.m_Xspeed = var19 % 3 - 1;
                           var4.m_Yspeed = -896;
                           var18.m_Reserve[10] = (var19 >> 16 & '\uffff') + 30 & 127;
                           --var6;
                        } while(var6 >= 0);
                     }

                     return;
                  }
               case 18:
                  BossAction var10000 = var7;
                  var1 = var1;
                  var7 = var7;
                  if ((var10000.m_Cddat & 128) != 0) {
                     byte var14 = 34;
                     var7.m_Reserve[10] = 120;
                     var15 = (Action)var7.m_ReserveObj;
                     var7.m_Xposi = var15.m_Xposi;
                     var7.m_Yposi = var15.m_Yposi;
                     var7.m_Patno = 34;
                     var7.m_R_No0 = 20;
                     var7.m_Xspeed = Utilities.getRandom() % 3 - 1;
                     var7.m_Yspeed = -896;
                     var16 = 1;
                     var12 = var14 + 1;

                     do {
                        (var15 = var1.insertAction(var7, var7.m_Actno)).m_Actno = 93;
                        var15.m_Patbase_Image = var7.m_Patbase_Image;
                        var15.m_Patbase_Table = g;
                        var15.m_Patno = 40;
                        var15.m_Patno = var12;
                        var15.m_R_No0 = 20;
                        var15.m_Sproffset = 9472;
                        var15.m_Actflg = 4;
                        var15.m_Sprhsize = 32;
                        var15.m_Sprpri = 2;
                        var15.m_Xposi = var7.m_Xposi;
                        var15.m_Yposi = var7.m_Yposi;
                        var15.m_Cddat = var7.m_Cddat;
                        var15.m_Actflg = var7.m_Actflg;
                        var19 = Utilities.getRandom();
                        var15.m_Xspeed = var19 % 3 - 1;
                        var15.m_Yspeed = -896;
                        var19 >>= 16;
                        var19 += 30;
                        var19 &= 127;
                        var15.m_Reserve[10] = var19;
                        ++var12;
                        --var16;
                     } while(var16 >= 0);

                     return;
                  }

                  var2 = (Action)var7.m_ReserveObj;
                  var7.m_Xposi = var2.m_Xposi;
                  var7.m_Yposi = var2.m_Yposi;
                  var7.m_Actflg = var2.m_Actflg;
                  var7.m_Cddat = var2.m_Cddat;
                  if (t && (cCanvas.m_ScreenFrame & 1) == 1) {
                     var7.m_Patbase_Table = h;
                  } else {
                     var7.m_Patbase_Table = g;
                  }

                  var7.patchg(f);
                  break;
               case 20:
                  if (var7.m_Reserve[10] != -7) {
                     var10002 = var7.m_Reserve[10]--;
                     if (var7.m_Reserve[10] > 0) {
                        return;
                     }

                     (var5 = var1.insertAction(var7, var7.m_Actno)).m_Actno = 88;
                     var5.m_Xposi = var7.m_Xposi;
                     var5.m_Yposi = var7.m_Yposi;
                     var7.m_Reserve[10] = -7;
                     var7.m_Reserve[16] = 30;
                  }

                  var10002 = var7.m_Reserve[16]--;
                  if (var7.m_Reserve[16] <= 0) {
                     var7.m_Xposi += var7.m_Xspeed;
                     var12 = var7.m_Yspeed;
                     var7.m_Yspeed += 56;
                     var7.setYposi(var7.getYposi() + (var12 << 8));
                     if (var7.getYposi() >= 92274688) {
                        var7.frameOut(var1);
                     }

                     var7.frameOutCheck(var1);
                  }

                  return;
               case 22:
                  var2 = (Action)var7.m_ReserveObj;
                  var7.m_Xposi = var2.m_Xposi;
                  var7.m_Yposi = var2.m_Yposi;
                  var7.m_Cddat = var2.m_Cddat;
                  var7.m_Actflg = var2.m_Actflg;
                  if (var2.m_Reserve[6] == 31) {
                     var7.m_Mstno = 2;
                  }

                  if (var1.getSonicAction().m_R_No0 == 4 || (var4 = var1.getTailsAction()) != null && var4.m_R_No0 == 4) {
                     var7.m_Mstno = 3;
                  }

                  if (t && (cCanvas.m_ScreenFrame & 1) == 1) {
                     var7.m_Patbase_Table = e;
                  } else {
                     var7.m_Patbase_Table = d;
                  }

                  var7.patchg(c);
                  return;
               case 24:
                  if ((var7.m_Cddat & 128) == 0) {
                     var2 = (Action)var7.m_ReserveObj;
                     var7.m_Xposi = var2.m_Xposi;
                     var7.m_Yposi = var2.m_Yposi;
                     var7.m_Cddat = var2.m_Cddat;
                     var7.m_Actflg = var2.m_Actflg;
                     if (--var7.m_Pattim <= 0) {
                        var7.m_Pattim = 1;
                        var3 = var7.m_Reserve[18];
                        ++var3;
                        if (var3 > 2) {
                           var3 = 0;
                        }

                        var7.m_Patno = var3 == 0 ? 0 : (var3 == 1 ? -1 : 1);
                        var7.m_Reserve[18] = var3;
                     }

                     if (var7.m_Patno == -1) {
                        var7.m_Patno = 0;
                     }
                  } else {
                     if ((((Action)var7.m_ReserveObj).m_Reserve[1] & 64) != 0) {
                        var7.m_R_No1 += 2;
                        var7.m_Patbase_Table = j;
                        var7.m_Sproffset = 1048;
                        var7.m_Patno = 0;
                        var7.m_Pattim = 5;
                        var2 = (Action)var7.m_ReserveObj;
                        var7.m_Xposi = var2.m_Xposi;
                        var7.m_Yposi = var2.m_Yposi;
                        var7.m_Yposi += 4;
                        var7.m_Xposi -= 40;
                        return;
                     }

                     var7.m_Patno = 40;
                  }
                  break;
               case 26:
                  if (--var7.m_Pattim <= 0) {
                     var7.m_Pattim = 5;
                     if (++var7.m_Patno == 4) {
                        var7.m_Patno = 0;
                        if ((var2 = (Action)var7.m_ReserveObj) == null) {
                           var7.frameOut(var1);
                           return;
                        }

                        var7.m_Xposi = var2.m_Xposi;
                        var7.m_Yposi = var2.m_Yposi;
                        var7.m_Yposi += 4;
                        var7.m_Xposi -= 40;
                     }
                  }
               }

               return;
            }

            var10002 = var7.m_Reserve[9]--;
            if (var7.m_Reserve[9] >= 0) {
               ((Action)var22).m_Actno = 93;
               ((Action)var22).m_Patbase_Image = var7.m_Patbase_Image;
               ((Action)var22).m_Patbase_Table = g;
               ((Action)var22).m_Patno = 40;
               ((Action)var22).m_Sproffset = 9472;
               ((Action)var22).m_Actflg = 4;
               ((Action)var22).m_Sprhsize = 32;
               ((Action)var22).m_Sprpri = 5;
               ((Action)var22).m_Xposi = var7.m_Xposi;
               ((Action)var22).m_Yposi = var7.m_Yposi;
               var3 = var7.m_Reserve[9];
               var3 -= 11;
               var3 *= -8;
               ((Action)var22).m_Reserve[13] = var3;
               ((Action)var22).m_Yposi += var3;
               ((Action)var22).m_Mstno = 1;
               if (((Action)var22).m_R_No1 != 2) {
                  ((Action)var22).m_R_No0 = 14;
               }
            } else {
               var7.m_R_No1 = 0;
               var7.m_R_No0 = 6;
            }

            var7.c(var1);
            break;
         }

         var7.m_Yposi += var7.m_Reserve[11];
         if (t && (cCanvas.m_ScreenFrame & 1) == 1) {
            var7.m_Patbase_Table = h;
         } else {
            var7.m_Patbase_Table = g;
         }

         var7.patchg(f);
         break;
      case 137:
         this.BBOSS4_move(var1);
         return;
      case 222:
         switch((var7 = this).m_R_No0) {
         case 0:
            var7.m_Sproffset = 9120;
            var7.m_Actflg = 4;
            var7.m_Actflg |= 1;
            var7.m_Userflag = 129;
            var7.m_Xposi = -384;
            var7.m_Yposi = 80;
            var7.m_Sprhsize = 32;
            var7.m_Sprvsize = 20;
            var7.m_Sprpri = 4;
            var7.m_Colino = 15;
            var7.m_Colicnt = 8;
            var7.m_R_No0 = 2;
            var7.m_Reserve[2] = var7.m_Xposi;
            var7.m_Reserve[4] = var7.m_Yposi;
            if ((var2 = var1.insertAction(var7, var7.m_Actno)) != null) {
               var2.m_Patno = 1;
               var2.m_Actflg = 4;
               var2.m_Actflg |= 1;
               var2.m_Xposi = var7.m_Xposi;
               var2.m_Yposi = var7.m_Yposi;
               var2.m_Patbase_Image = var7.m_Patbase_Image;
               var2.m_Patbase_Table = ad;
               var2.m_Reserve[2] = var7.m_Xposi;
               var2.m_Reserve[4] = var7.m_Yposi;
               var2.m_R_No0 = 2;
            }

            return;
         case 2:
            var7.m_Xspeed = State.mSonicAction.m_Xspeed;
            if (var7.m_Xposi < State.mSonicAction.m_Xposi - 32) {
               var7.m_Xspeed += 256;
            } else if (var7.m_Xposi > GameState.m_ScrALim_Right - 896) {
               var7.m_Xspeed += 512;
            }

            var7.speedSet2();
         }
      }

   }

   public void render(Graphics var1) {
   }

   public static void prepareImages() {
      switch(GameState.zoneNumber) {
      case 0:
         if (s == null) {
            s = new Image[b.length];
            Utilities.loadImages(b, s);
         }

         return;
      case 1:
         if (ac == null) {
            ac = new Image[b.length];
            Utilities.loadImages(b, ac);
         }
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 8:
      case 9:
      case 10:
      case 11:
      case 14:
      default:
         return;
      case 7:
         if (aa == null) {
            aa = new Image[ab.length];
            Utilities.loadImages(ab, aa);
         }

         if (Y == null) {
            Y = new Image[Z.length];
            Utilities.loadImages(Z, Y);
         }

         return;
      case 12:
         if (Q == null) {
            Q = new Image[P.length];
            Utilities.loadImages(P, Q);
         }

         return;
      case 13:
         if (r == null) {
            r = new Image[a.length];
            Utilities.loadImages(a, r);
            m_BossWorking = false;
         }

         return;
      case 15:
         if (L == null) {
            L = new Image[B.length];
            Utilities.loadImages(B, L);
         }

      }
   }

   public void bboss2Init(State var1) {
      super.m_Patbase_Table = p;
      super.m_Sproffset = 9120;
      super.m_Actflg = 4;
      super.m_Userflag = 129;
      super.m_Xposi = 10704;
      super.m_Yposi = 1062;
      super.m_Sprhsize = 32;
      super.m_Sprvsize = 20;
      super.m_Sprpri = 4;
      super.m_Colino = 15;
      super.m_Colicnt = 8;
      if (cCanvas.m_Option[1] == 0) {
         super.m_Colicnt = 4;
      }

      if (cCanvas.m_Option[1] == 1) {
         super.m_Colicnt = 6;
      }

      super.m_R_No0 += 2;
      super.m_Reserve[2] = super.m_Xposi;
      super.m_Reserve[4] = super.m_Yposi;
      super.m_Sprvs = 12;
      Action var2;
      (var2 = var1.insertAction(this, super.m_Actno)).m_Actno = 86;
      var2.m_ReserveObj = this;
      super.m_ReserveObj = var2;
      var2.m_Patbase_Image = super.m_Patbase_Image;
      var2.m_Patbase_Table = p;
      var2.m_Sproffset = 928;
      var2.m_Actflg = 4;
      var2.m_Sprhsize = 32;
      var2.m_Sprpri = 4;
      var2.m_Xposi = super.m_Xposi;
      var2.m_Yposi = super.m_Yposi;
      var2.m_R_No0 = 14;
      var2.m_Mstno = 1;
      var2.m_Actflg = super.m_Actflg;
      (var2 = var1.insertAction(this, super.m_Actno)).m_Actno = 86;
      var2.m_ReserveObj = this;
      var2.m_Patbase_Image = super.m_Patbase_Image;
      var2.m_Patbase_Table = m;
      var2.m_Sproffset = 1024;
      var2.m_Actflg = 4;
      var2.m_Sprhsize = 48;
      var2.m_Sprvsize = 16;
      var2.m_Sprpri = 3;
      var2.m_Xposi = 10992;
      var2.m_Yposi = super.m_Yposi;
      var2.m_R_No0 = 6;
      Action var4 = var1.insertAction(this, super.m_Actno);
      this.a(var4);
      var4.m_Userflag = 0;
      var4.m_Xposi += 28;
      var4.m_Yposi += 12;
      var4.m_Sprpri = 2;
      var4.m_Patno = 4;
      var4.m_Mstno = 1;
      var4.m_Sprvs = 16;
      var4.m_Sprhs = 16;
      var4.m_R_No0 = 8;
      var4.m_Reserve = new int[10];
      var4.m_Reserve[8] = 10;
      var4 = var1.insertAction(this, super.m_Actno);
      this.a(var4);
      var4.m_Userflag = 1;
      var4.m_Xposi += -12;
      var4.m_Yposi += 12;
      var4.m_Sprpri = 2;
      var4.m_Patno = 4;
      var4.m_Mstno = 1;
      var4.m_Sprvs = 16;
      var4.m_Sprhs = 16;
      var4.m_R_No0 = 8;
      var4.m_Reserve = new int[10];
      var4.m_Reserve[8] = 10;
      var4 = var1.insertAction(this, super.m_Actno);
      this.a(var4);
      var4.m_Userflag = 2;
      var4.m_Xposi += -44;
      var4.m_Yposi += 12;
      var4.m_Sprpri = 3;
      var4.m_Patno = 6;
      var4.m_Mstno = 2;
      var4.m_Sprvs = 16;
      var4.m_Sprhs = 16;
      var4.m_R_No0 = 8;
      var4.m_Reserve = new int[10];
      var4.m_Reserve[8] = 10;
      var4 = var1.insertAction(this, super.m_Actno);
      this.a(var4);
      var4.m_Sprpri = 2;
      var4.m_Xposi += -54;
      var4.m_Yposi += 8;
      var4.m_R_No0 = 10;
      var4.m_Patno = 1;
      var4.m_Mstno = 0;
      int[] var10000 = super.m_Reserve;
      var10000[4] -= 8;
      super.m_Xposi = 10992;
      super.m_Yposi = 760;
      (var2 = var1.insertAction(this, super.m_Actno)).m_Actno = 86;
      var2.m_ReserveObj = this;
      var2.m_Patbase_Image = super.m_Patbase_Image;
      var2.m_Patbase_Table = k;
      var2.m_Sproffset = 9580;
      var2.m_Actflg = 4;
      var2.m_Sprhsize = 64;
      var2.m_Sprpri = 7;
      var2.m_Xposi = super.m_Xposi;
      var2.m_Yposi = super.m_Yposi;
      var2.m_Reserve = new int[10];
      var2.m_Reserve[8] = 30;
      var2.m_R_No0 = 4;
   }

   private void a(Action var1) {
      var1.m_Actno = 86;
      var1.m_ReserveObj = this;
      var1.m_Patbase_Image = super.m_Patbase_Image;
      var1.m_Patbase_Table = m;
      var1.m_Sproffset = 9216;
      var1.m_Actflg = 4;
      var1.m_Sprhsize = 16;
      var1.m_Xposi = 10992;
      var1.m_Yposi = super.m_Yposi;
   }

   private void a(State var1) {
      if (super.m_Xposi <= 10400 || super.m_Xposi >= 11016) {
         super.m_Cddat ^= 1;
         super.m_Actflg ^= 1;
         super.m_Xspeed = ~super.m_Xspeed;
      }

   }

   private void b(State var1) {
      if ((crlCanvas.mCounter & 7L) == 0L) {
         Action var4;
         (var4 = var1.insertAction(88)).m_Actno = 88;
         var4.m_Xposi = super.m_Xposi;
         var4.m_Yposi = super.m_Yposi;
         int var3;
         int var2 = ((var3 = Utilities.getRandom()) & 255) >> 2;
         var2 -= 32;
         var4.m_Xposi += var2;
         var3 = (var3 >> 8 & 255) >> 2;
         var3 -= 32;
         var4.m_Yposi += var3;
      }

   }

   public static void disposeImages() {
      r = null;
      s = null;
      Y = null;
      L = null;
      Q = null;
      aa = null;
      ac = null;
   }

   private void c(State var1) {
      Action var2;
      if ((((Action)(var2 = (Action)super.m_ReserveObj).m_ReserveObj).m_Cddat & 128) != 0) {
         BossAction var4;
         (var4 = this).m_R_No0 = 20;
         int var5 = Utilities.getRandom();
         var4.m_Xspeed = var5 % 3 - 1;
         var4.m_Yspeed = -896;
         var4.m_Reserve[10] = (var5 >> 16 & '\uffff') + 30 & 127;
      } else {
         super.m_Xposi = var2.m_Xposi;
         super.m_Yposi = var2.m_Yposi;
         if (super.m_R_No1 == 4) {
            super.m_Yposi += 24;
         }

         if ((super.m_Cddat & 128) != 0) {
            this.frameOut(var1);
         } else {
            super.m_Yposi += super.m_Reserve[13];
            if (t && (cCanvas.m_ScreenFrame & 1) == 1) {
               super.m_Patbase_Table = h;
            } else {
               super.m_Patbase_Table = g;
            }

            this.patchg(f);
         }
      }
   }

   void getChemical_bboss1(State var1) {
      if ((super.m_Reserve[1] & 1) == 0) {
         super.m_R_No1 += 2;
      }

      this.h(var1);
   }

   private void d(State var1) {
      this.speedSet();
      int[] var10000;
      int var2;
      Action var3;
      if ((var2 = ((GameState)var1).emyCol_D(super.m_Xposi, super.m_Yposi, super.m_Sprvs)) >= 0) {
         if (super.m_Yposi >= 1304) {
            var10000 = (var3 = (Action)((Action)super.m_ReserveObj).m_ReserveObj).m_Reserve;
            var10000[1] |= 4;
            var10000 = var3.m_Reserve;
            var10000[1] |= 16;
            var3.m_R_No1 = 2;
            this.frameOut(var1);
         } else {
            if (t && (cCanvas.m_ScreenFrame & 1) == 1) {
               super.m_Patbase_Table = h;
            } else {
               super.m_Patbase_Table = g;
            }

            this.patchg(f);
         }
      } else {
         super.m_Yposi += var2;
         var10000 = (var3 = (Action)((Action)super.m_ReserveObj).m_ReserveObj).m_Reserve;
         var10000[1] |= 4;
         var10000 = var3.m_Reserve;
         var10000[1] |= 16;
         var3.m_R_No1 = 2;
         super.m_R_No1 += 2;
         super.m_Userflag = 0;
      }
   }

   private void e(State var1) {
      --super.m_Pattim;
      Action var2;
      if (super.m_Pattim <= 0) {
         ++super.m_Patno;
         super.m_Pattim = 8;
         if (super.m_Patno > 39) {
            int[] var10000 = (var2 = (Action)((Action)super.m_ReserveObj).m_ReserveObj).m_Reserve;
            var10000[1] |= 4;
            var10000 = var2.m_Reserve;
            var10000[1] |= 16;
            var2.m_R_No1 = 2;
            this.frameOut(var1);
            return;
         }

         if (super.m_Patno == 39) {
            super.m_Pattim += 12;
         }
      }

      var2 = (Action)((Action)super.m_ReserveObj).m_ReserveObj;
      super.m_Xposi = var2.m_Xposi;
      super.m_Yposi = var2.m_Yposi;
   }

   private void f(State var1) {
      Action var2 = (Action)super.m_ReserveObj;
      super.m_Xposi = var2.m_Xposi;
      super.m_Yposi = var2.m_Yposi;
      super.m_Yposi -= 56;
      if ((super.m_Cddat & 128) == 0) {
         int[] var10000;
         if ((var2.m_Reserve[1] & 4) != 0) {
            byte var6 = 1;
            if ((var2.m_Reserve[1] & 16) == 0) {
               var6 = -1;
            }

            Action var5;
            label85: {
               int var7;
               if (super.m_Reserve[15] == -16) {
                  var7 = var2.m_Reserve[1];
                  var10000 = var2.m_Reserve;
                  var10000[1] &= -17;
                  if ((var7 & 16) != 0) {
                     var10000 = var2.m_Reserve;
                     var10000[1] &= -5;
                     super.m_R_No1 = 0;
                     (var5 = var1.insertAction(this, super.m_Actno)).m_Actno = 93;
                     var5.m_ReserveObj = super.m_ReserveObj;
                     var5.m_Patbase_Image = super.m_Patbase_Image;
                     var5.m_Patbase_Table = g;
                     var5.m_Patno = 40;
                     var5.m_Sproffset = 9472;
                     var5.m_Actflg = 4;
                     var5.m_Sprhsize = 32;
                     var5.m_Sprpri = 4;
                     var5.m_Xposi = super.m_Xposi;
                     var5.m_Yposi = super.m_Yposi;
                     var5.m_R_No0 = 4;
                     super.m_R_No1 = 0;
                     break label85;
                  }
               }

               if ((var7 = super.m_Reserve[15]) < -40) {
                  if (var7 < -64) {
                     super.m_Mstno = 8;
                     if (var7 >= -88) {
                        if (var7 > -88) {
                           var10000 = super.m_Reserve;
                           var10000[15] += var6;
                        } else if ((var2.m_Reserve[1] & 16) != 0) {
                           var10000 = super.m_Reserve;
                           var10000[15] += var6;
                        }
                     } else {
                        super.m_Reserve[15] = -88;
                        if ((super.m_Actflg & 1) != 0) {
                           super.m_Reserve[15] = 88;
                        }

                        var10000 = super.m_Reserve;
                        var10000[15] += var6;
                     }
                  } else {
                     super.m_Mstno = 7;
                     var10000 = super.m_Reserve;
                     var10000[15] += var6;
                  }
               } else {
                  super.m_Mstno = 6;
                  var10000 = super.m_Reserve;
                  var10000[15] += var6;
               }
            }

            if ((var2.m_Reserve[1] & 8) == 0 && (var2.m_Reserve[1] & 16) == 0) {
               label79: {
                  if (super.m_Reserve[15] >= -20) {
                     if ((var2.m_Reserve[0] & 2) == 0) {
                        break label79;
                     }

                     var10000 = var2.m_Reserve;
                     var10000[0] &= -3;
                     var10000 = var2.m_Reserve;
                     var10000[0] |= 4;
                  } else {
                     if (super.m_Reserve[15] >= -64) {
                        break label79;
                     }

                     int var9 = var1.getSonicAction().m_Xposi;
                     var9 -= 8;
                     if ((super.m_Actflg & 1) != 0) {
                        if ((var9 = var9 + super.m_Reserve[15] - super.m_Xposi) > 0 || var9 < -24) {
                           break label79;
                        }
                     } else if ((var9 = var9 - super.m_Reserve[15] - super.m_Xposi) < 0 || var9 > 24) {
                        break label79;
                     }
                  }

                  var10000 = var2.m_Reserve;
                  var10000[1] |= 32;
                  var10000 = var2.m_Reserve;
                  var10000[1] &= -5;
                  super.m_Reserve[16] = 18;
                  (var5 = var1.insertAction(this, super.m_Actno)).m_Actno = 93;
                  var5.m_ReserveObj = this;
                  var5.m_R_No0 = 16;
                  var5.m_R_No1 = 8;
                  var5.m_Patbase_Image = super.m_Patbase_Image;
                  var5.m_Patbase_Table = g;
                  var5.m_Patno = 40;
                  var5.m_Sproffset = 9472;
                  var5.m_Actflg = 4;
                  var5.m_Sprhsize = 32;
                  var5.m_Sprpri = 5;
                  var5.m_Xposi = super.m_Xposi;
                  var5.m_Yposi = super.m_Yposi;
                  var5.m_Mstno = 11;
                  var5.m_Reserve[16] = 36;
               }
            }
         } else if ((var2.m_Reserve[1] & 32) != 0 && --super.m_Reserve[16] <= 0) {
            var10000 = var2.m_Reserve;
            var10000[1] &= -33;
            var10000 = var2.m_Reserve;
            var10000[1] |= 8;
            var10000 = var2.m_Reserve;
            var10000[1] |= 16;
         }
      } else {
         super.m_R_No1 = 10;
      }

      var2 = (Action)super.m_ReserveObj;
      super.m_Cddat = var2.m_Cddat;
      super.m_Actflg = var2.m_Actflg;
      int var8 = super.m_Reserve[15];
      if ((super.m_Actflg & 1) != 0) {
         var8 = -var8;
      }

      super.m_Xposi += var8;
      if (t && (cCanvas.m_ScreenFrame & 1) == 1) {
         super.m_Patbase_Table = h;
      } else {
         super.m_Patbase_Table = g;
      }

      this.patchg(f);
   }

   private void g(State var1) {
      int var2 = (super.m_Reserve[2] << 16 | super.m_Reserve[19] & '\uffff') + (super.m_Xspeed << 8);
      super.m_Reserve[2] = var2 >> 16;
      super.m_Reserve[19] = var2 & '\uffff';
      var2 = (super.m_Reserve[4] << 16 | super.m_Reserve[20] & '\uffff') + (super.m_Yspeed << 8);
      super.m_Reserve[4] = var2 >> 16;
      super.m_Reserve[20] = var2 & '\uffff';
   }

   private void h(State var1) {
      int var2 = Utilities.sinset(super.m_Reserve[7]);
      super.m_Yposi = (var2 >> 6 | (var2 < -1 ? -65536 : 0)) + super.m_Reserve[4];
      super.m_Xposi = super.m_Reserve[2];
      super.m_Reserve[7] = super.m_Reserve[7] + 2 & 255;
      if (super.m_R_No1 < 8) {
         if ((super.m_Cddat & 128) == 0) {
            if (super.m_Colino == 0) {
               t = true;
               if (super.m_Reserve[6] == 0) {
                  super.m_Reserve[6] = 32;
               }

               if ((cCanvas.m_ScreenFrame & 1) == 1) {
                  super.m_Patbase_Table = e;
               } else {
                  super.m_Patbase_Table = d;
               }

               int var10002 = super.m_Reserve[6]--;
               if (super.m_Reserve[6] == 0) {
                  super.m_Colino = 15;
                  int[] var10000 = super.m_Reserve;
                  var10000[0] &= -3;
                  t = false;
                  super.m_Patbase_Table = d;
                  return;
               }
            }
         } else {
            m_BossWorking = false;
            GameState.scoreUp(100, true);
            super.m_R_No1 = 8;
            super.m_Reserve[5] = 179;
            ((Action)super.m_ReserveObj).m_Mstno = 4;
         }
      }

   }

   private void i(State var1) {
      Action var2 = (Action)super.m_ReserveObj;
      super.m_Xposi = var2.m_Xposi;
      super.m_Yposi = var2.m_Yposi;
      super.m_Actflg = var2.m_Actflg;
      super.m_Cddat = var2.m_Cddat;
      if (t && (cCanvas.m_ScreenFrame & 1) == 1) {
         super.m_Patbase_Table = h;
      } else {
         super.m_Patbase_Table = g;
      }

      this.patchg(f);
   }

   public void BBOSS4_init() {
      if (w == null) {
         w = Utilities.arrayInputDataInt2("/bboss4pillarchg.bin");
         x = Utilities.arrayInputDataInt2("/bboss4pillarpat.bin");
         y = Utilities.arrayInputDataInt2("/boss4chg.bin");
         z = Utilities.arrayInputDataInt2("/bboss4pat.bin");
         A = Utilities.arrayInputDataInt2("/bboss4pat2.bin");
      }

      super.m_Patbase_Image = L;
      super.m_Reserve = new int[18];
      super.m_ReserveObj = new Action[3];
   }

   public void BBOSS4_move(State var1) {
      Action var2;
      BossAction var9;
      int[] var10000;
      switch(super.m_R_No0_Ms) {
      case 0:
         C = 0;
         E = 0;
         D = 0;
         F = 0;
         G = 0;
         H = 0;
         super.m_Patno = -1;
         if ((var2 = var1.getSonicAction()).m_Xposi >= 10880 && var2.m_Xposi <= 11072 && ((var2 = var1.getTailsAction()).m_PlayerFlag == 129 || var2.m_Xposi >= 10848 && var2.m_Xposi <= 11104)) {
            GameState.m_ScrollShake = true;
            super.m_Sproffset = 992;
            super.m_Patbase_Table = z;
            super.m_Actflg |= 4;
            super.m_Sprhsize_Ms = 32;
            super.m_Sprpri = 2;
            super.m_R_No0_Ms = 2;
            super.m_Xposi = 10976;
            super.m_Yposi = 904;
            C = 10976;
            D = 904;
            super.m_Actflg |= 64;
            super.m_Manysprcnt = 3;
            super.m_Colino = 15;
            super.m_Colicnt_Ms = 8;
            if (cCanvas.m_Option[1] == 0) {
               super.m_Colicnt_Ms = 4;
            } else if (cCanvas.m_Option[1] == 1) {
               super.m_Colicnt_Ms = 6;
            }

            super.m_Patno = 8;
            super.m_Reserve[10] = 896;
            GameState.m_BossState = 0;
            super.m_Patno_Ms = 8;
            super.m_Sprpositbl = new int[super.m_Manysprcnt][4];
            super.m_Sprpositbl[0][0] = 10976;
            super.m_Sprpositbl[0][1] = super.m_Yposi;
            super.m_Sprpositbl[0][3] = 0;
            super.m_Sprpositbl[1][0] = 10976;
            super.m_Sprpositbl[1][1] = super.m_Yposi;
            super.m_Sprpositbl[1][3] = 9;
            super.m_Sprpositbl[2][0] = 10976;
            super.m_Sprpositbl[2][1] = super.m_Yposi;
            super.m_Sprpositbl[2][3] = 6;
            H = 256;
            Action var12;
            (var12 = var1.insertAction(this, super.m_Actno)).m_Actno = 137;
            var12.m_Patbase_Table = x;
            var12.m_Actflg |= 4;
            var12.m_Sproffset = 992;
            var12.m_Sprhsize = 16;
            var12.m_Xposi = 10848;
            var12.m_Yposi = 1296;
            var12.m_R_No0_Ms = 4;
            ((Object[])((Object[])var12.m_ReserveObj))[1] = this;
            var12.m_Patno = 0;
            var12.m_Sprpri = 2;
            var12.m_Sprvsize = 32;
            (var12 = var1.insertAction(this, super.m_Actno)).m_Actno = 137;
            var12.m_Patbase_Table = x;
            var12.m_Actflg |= 4;
            var12.m_Sproffset = 992;
            var12.m_Sprhsize = 16;
            var12.m_Yposi = 1296;
            var12.m_R_No0_Ms = 4;
            ((Object[])((Object[])var12.m_ReserveObj))[1] = this;
            var12.m_Patno = 0;
            var12.m_Sprpri = 2;
            var12.m_Sprvsize = 32;
            var12.m_Actflg |= 1;
            var12.m_Xposi = 11104;
            J[0] = 4;
            J[1] = 0;
            J[2] = 0;
            J[3] = 0;
            J[4] = 2;
            J[5] = 0;
            J[6] = 1;
            J[7] = 0;
         }

         return;
      case 1:
      case 3:
      default:
         break;
      case 2:
         int var10001;
         switch((var9 = this).m_Reserve[K]) {
         case 0:
            var9.j(var1);
            var9.k(var1);
            var9.l(var1);
            if (D >= 1072) {
               D = 1072;
               var10000 = var9.m_Reserve;
               var10001 = K;
               var10000[var10001] += 2;
               H = 0;
               G = -200;
               var9.m_Reserve[6] = 1;
            }

            var9.a(y);
            return;
         case 1:
         case 3:
         case 5:
         case 7:
         case 9:
         case 11:
         default:
            break;
         case 2:
            var9.j(var1);
            var9.k(var1);
            var9.l(var1);
            if (var9.m_Reserve[6] == 0) {
               if (C < 11008) {
                  if (var9.m_Colino == 0 && (cCanvas.m_ScreenFrame & 1) == 1) {
                     var9.m_Patbase_Table = A;
                  } else {
                     var9.m_Patbase_Table = z;
                  }

                  var9.a(y);
                  break;
               }
            } else if (C > 10944) {
               if (var9.m_Colino == 0 && (cCanvas.m_ScreenFrame & 1) == 1) {
                  var9.m_Patbase_Table = A;
               } else {
                  var9.m_Patbase_Table = z;
               }

               var9.a(y);
               break;
            }

            var10000 = var9.m_Reserve;
            var10001 = K;
            var10000[var10001] += 2;
            G = 0;
            if (var9.m_Colino == 0 && (cCanvas.m_ScreenFrame & 1) == 1) {
               var9.m_Patbase_Table = A;
            } else {
               var9.m_Patbase_Table = z;
            }

            var9.a(y);
            return;
         case 4:
            var9.j(var1);
            var9.k(var1);
            var9.l(var1);
            if (var9.m_Reserve[3] == 192) {
               var10000 = J;
               var10000[4] &= 240;
               var10000 = J;
               var10000[4] |= 3;
               var10000 = var9.m_Reserve;
               var10001 = K;
               var10000[var10001] += 2;
               var9.m_Reserve[6] = 0;
               if ((var9.m_Actflg & 1) != 0) {
                  var9.m_Reserve[6] = 255;
               }

               I = 30;
            }

            if (var9.m_Colino == 0 && (cCanvas.m_ScreenFrame & 1) == 1) {
               var9.m_Patbase_Table = A;
            } else {
               var9.m_Patbase_Table = z;
            }

            var9.a(y);
            return;
         case 6:
            if (I == 20) {
               var10000 = var9.m_Reserve;
               var10000[7] |= 1;
               GameState.m_BossState = 1;
            }

            if (--I < 0) {
               GameState.m_BossState = 0;
               var9.m_Reserve[K] = 2;
               if ((var9.m_Actflg & 1) != 0) {
                  G = -200;
               } else {
                  G = 200;
               }

               var9.m_Actflg ^= 1;
            }

            var9.j(var1);
            var9.k(var1);
            var9.l(var1);
            if (var9.m_Colino == 0 && (cCanvas.m_ScreenFrame & 1) == 1) {
               var9.m_Patbase_Table = A;
            } else {
               var9.m_Patbase_Table = z;
            }

            var9.a(y);
            return;
         case 8:
            var9.m_Reserve[4] = 1;
            if (--I >= 0) {
               var9.m(var1);
            } else {
               var9.m_Manysprcnt = 3;
               J[4] = 1;
               J[5] = 0;
               J[2] = 0;
               J[3] = 0;
               var9.m_Actflg |= 1;
               H = 0;
               G = 0;
               var10000 = var9.m_Reserve;
               var10001 = K;
               var10000[var10001] += 2;
               I = -18;
            }

            var9.m_Yposi = D;
            var9.m_Xposi = C;
            var9.m_Patbase_Table = z;
            var9.a(y);
            var9.l(var1);
            return;
         case 10:
            if (++I < 0) {
               H += 24;
            } else if (I == 0) {
               H = 0;
            } else if (I > 24) {
               if (I >= 32) {
                  var10000 = var9.m_Reserve;
                  var10001 = K;
                  var10000[var10001] += 2;
               }
            } else if (I < 24) {
               H -= 8;
            } else {
               H = 0;
               cCanvas.am.bgmRestart();
               GameState.m_BossStart = 0;
            }

            var9.j(var1);
            var9.n(var1);
            var9.m_Yposi = D;
            var9.m_Xposi = C;
            var9.m_Patbase_Table = z;
            var9.a(y);
            var9.l(var1);
            return;
         case 12:
            GameState.m_BossFlag = 1;
            G = 1024;
            H = -64;
            if (GameState.m_ScrALim_Right - 11264 < 0) {
               GameState.m_ScrALim_Right += 2;
            } else if ((var9.m_Actflg & 128) == 0) {
               var9.frameOut(var1);
            }

            var9.j(var1);
            var9.n(var1);
            var9.m_Yposi = D;
            var9.m_Xposi = C;
            var9.m_Patbase_Table = z;
            var9.a(y);
            var9.l(var1);
         }

         return;
      case 4:
         if ((var2 = (Action)((Object[])((Object[])(var9 = this).m_ReserveObj))[1]) != null && var2.m_Reserve[K] >= 8) {
            var9.m_R_No1 = 4;
         }

         BossAction var3;
         switch(var9.m_R_No1) {
         case 0:
            (var3 = var9).o(var1);
            --var3.m_Yposi;
            if (var3.m_Yposi <= 1160) {
               var3.m_R_No1 += 2;
               GameState.m_ScrollShake = false;
            }

            return;
         case 1:
         case 3:
         case 5:
         case 7:
         default:
            break;
         case 2:
            var9.o(var1);
            Action var11;
            if (((var11 = (Action)((Object[])((Object[])var9.m_ReserveObj))[1]).m_Reserve[7] & 1) != 0 && (var11.m_Reserve[6] != 0 && (var9.m_Actflg & 1) != 0 || var11.m_Reserve[6] == 0 && (var9.m_Actflg & 1) == 0)) {
               var10000 = var11.m_Reserve;
               var10000[7] &= -2;
               Action var6;
               (var6 = var1.insertAction(var9, var9.m_Actno)).m_Actno = 137;
               var6.m_R_No0_Ms = 4;
               var6.m_R_No1 = 8;
               var6.m_Patbase_Table = x;
               var6.m_Sproffset = var9.m_Sproffset = 992;
               var6.m_Actflg |= 4;
               byte var7 = 0;
               var6.m_Patno = 2;
               var6.m_Xposi = 10858;
               if (var11.m_Reserve[6] != 0) {
                  var7 = 1;
                  var6.m_Xposi = 11094;
                  var6.m_Actflg |= 1;
               }

               var6.m_Reserve[15] = 40;
               int var17 = Utilities.getRandom() & 3;
               var6.m_Yposi = 1112 + var17 * 32;
               Action var18 = var6;
               (var6 = var1.insertAction(var9, var9.m_Actno)).m_Actno = 137;
               var6.m_R_No0_Ms = 4;
               var6.m_R_No1 = 6;
               ((Object[])((Object[])var6.m_ReserveObj))[0] = var18;
               var6.m_Userflag = var7;
               ((Object[])((Object[])var6.m_ReserveObj))[2] = var11;
               var9.m_Reserve[16] = 1;
            }

            if (var9.m_Reserve[16] != 0) {
               if (var9.m_Reserve[15] <= 0) {
                  var9.m_Reserve[15] = 31;
               }

               if (--var9.m_Reserve[15] <= 0) {
                  var9.m_Reserve[16] = 0;
                  var9.m_Reserve[15] = 0;
                  if (var11.m_Reserve[6] == 0) {
                     var9.m_Xposi = 10848;
                  } else {
                     var9.m_Xposi = 11104;
                  }

                  var9.m_Yposi = 1160;
                  break;
               }

               short var15 = 10848;
               if (var11.m_Reserve[6] != 0) {
                  var15 = 11104;
               }

               int var16 = var15 + ((cCanvas.m_ScreenFrame + 3 & 1) == 0 ? 1 : -1);
               var9.m_Xposi = var16;
               var16 = 1160 + ((cCanvas.m_ScreenFrame + 3 & 1) == 0 ? 1 : -1);
               var9.m_Yposi = var16;
            }

            return;
         case 4:
            GameState.m_ScrollShake = true;
            ++var9.m_Yposi;
            if (var9.m_Yposi >= 1296) {
               GameState.m_ScrollShake = false;
               var9.frameOut(var1);
            }

            return;
         case 6:
            if (((Action)((Object[])((Object[])(var3 = var9).m_ReserveObj))[2]).m_Reserve[K] >= 8) {
               var3.m_R_No2 = 6;
            }

            int var5;
            switch(var3.m_R_No2) {
            case 0:
               var3.m_Patbase_Table = x;
               var3.m_Sproffset = 992;
               var3.m_Actflg |= 4;
               var3.m_Sprhsize = 144;
               var3.m_Sprpri = 4;
               var3.m_R_No2 += 2;
               Action var14 = (Action)((Object[])((Object[])var3.m_ReserveObj))[0];
               var3.m_Xposi = var14.m_Xposi;
               var3.m_Yposi = var14.m_Yposi;
               var3.m_Yspeed = 4;
               var3.m_Patno = 4;
               var3.m_Yposi += 9;
               if (var3.m_Userflag != 0) {
                  var3.m_Cddat |= 1;
                  var3.m_Actflg |= 1;
                  var3.m_Xspeed = -3;
               } else {
                  var3.m_Xspeed = 3;
               }

               var3.m_Colino = 176;
               return;
            case 1:
            case 3:
            case 5:
            case 7:
            default:
               return;
            case 2:
               if ((var3.m_Cddat & 128) != 0) {
                  var3.m_R_No2 = 8;
               }

               var5 = var3.m_Xposi + var3.m_Xspeed;
               short var13;
               if (var3.m_Xspeed < 0) {
                  if (var5 > 10887) {
                     var3.m_Xposi = var5;
                     return;
                  }

                  var13 = 10887;
               } else {
                  if (var5 < 11065) {
                     var3.m_Xposi = var5;
                     return;
                  }

                  var13 = 11065;
               }

               var3.m_R_No2 += 2;
               var3.m_Xposi = var13;
               return;
            case 4:
               var3.m_Colino = 0;
               if ((var3.m_Cddat & 128) != 0) {
                  var3.m_R_No2 += 2;
               }

               label232: {
                  if (var3.m_Reserve[17] == 0) {
                     ((GameState)var1).rideChkSub(var3.m_Xposi, var3.m_Yposi, 27, 1, 0, -1, var3);
                     if ((var3.m_Cddat & 8) == 0) {
                        break label232;
                     }

                     var3.m_Reserve[17] = 31;
                  }

                  if (--var3.m_Reserve[17] == 0) {
                     var3.m_R_No2 = 6;
                  }
               }

               var3.patchg(w);
               return;
            case 6:
               boolean var8 = (var3.m_Cddat & 8) != 0;
               var3.m_Cddat &= -9;
               if (var8) {
                  var3.b(var1.getSonicAction());
               }

               var8 = (var3.m_Cddat & 16) != 0;
               var3.m_Cddat &= -17;
               if (var8) {
                  var3.b(var1.getTailsAction());
               }

               if ((var5 = var3.m_Yposi + var3.m_Yspeed) > 1264) {
                  var3.frameOut(var1);
                  return;
               }

               var3.m_Yposi = var5;
               return;
            case 8:
               var3.frameOut(var1);
               return;
            }
         case 8:
            if (--(var3 = var9).m_Reserve[15] == 0) {
               var3.frameOut(var1);
            }
         }
      }

   }

   private void j(State var1) {
      int var2 = (Math.abs(C) & '\uffff') << 16 | E & '\uffff';
      if (C < 0) {
         var2 = -var2;
      }

      C = (Math.abs(var2 += (Math.abs(G) << 8) * (G < 0 ? -1 : 1)) >> 16 & '\uffff') * (var2 < 0 ? -1 : 1);
      E = Math.abs(var2) & '\uffff';
      var2 = (Math.abs(D) & '\uffff') << 16 | F & '\uffff';
      if (D < 0) {
         var2 = -var2;
      }

      D = (Math.abs(var2 += (Math.abs(H) << 8) * (H < 0 ? -1 : 1)) >> 16 & '\uffff') * (var2 < 0 ? -1 : 1);
      F = Math.abs(var2) & '\uffff';
   }

   private void k(State var1) {
      this.n(var1);
      Action var2 = var1.getSonicAction();
      Action var3 = var1.getTailsAction();
      if (var2.m_R_No0 == 4 || var3 != null && var3.m_R_No0 == 4) {
         J[3] = 49;
      }

      if (super.m_Reserve[1] == 63) {
         J[3] = 192;
      }

   }

   private void l(State var1) {
      super.m_Sprpositbl[0][0] = super.m_Xposi;
      super.m_Sprpositbl[0][1] = super.m_Yposi;
      super.m_Sprpositbl[2][0] = super.m_Xposi;
      super.m_Sprpositbl[2][1] = super.m_Yposi;
      if (super.m_Reserve[4] == 0) {
         super.m_Sprpositbl[1][0] = super.m_Xposi;
         super.m_Sprpositbl[1][1] = super.m_Yposi;
         super.m_Reserve[8] = super.m_Yposi;
      } else {
         if (I <= 120) {
            int var10002 = super.m_Sprpositbl[1][0]--;
            int var2 = (super.m_Reserve[8] << 16 | super.m_Reserve[14] & '\uffff') + (super.m_Reserve[10] << 8);
            super.m_Reserve[8] = var2 >> 16;
            super.m_Reserve[14] = var2 & '\uffff';
            int[] var10000 = super.m_Reserve;
            var10000[10] += 56;
            super.m_Sprpositbl[1][1] = super.m_Reserve[8];
            if (super.m_Sprpositbl[1][1] >= 1344) {
               super.m_Reserve[10] = 0;
            }
         }

      }
   }

   private void a(int[][] var1) {
      boolean var2 = false;
      byte var3 = 0;
      int var5;
      if (super.m_Patno_Ms == 0) {
         var5 = var3 + 2;
      } else {
         var5 = this.a(var1, 0, 0, -1);
      }

      int var4 = super.m_Manysprcnt;
      --var4;
      if (var4 >= 0) {
         this.a(var1, var4, var5, 0);
         super.m_Patno = super.m_Patno_Ms;
      }
   }

   private void m(State var1) {
      if ((crlCanvas.mCounter & 7L) == 0L) {
         Action var4;
         (var4 = var1.insertAction(88)).m_Actno = 88;
         var4.m_Xposi = super.m_Xposi;
         var4.m_Yposi = super.m_Yposi;
         int var3;
         int var2 = ((var3 = Utilities.getRandom()) & 255) >> 2;
         var2 -= 32;
         var4.m_Xposi += var2;
         var3 = (var3 >> 8 & 255) >> 2;
         var3 -= 32;
         var4.m_Yposi += var3;
      }

   }

   private void n(State var1) {
      int var2 = ((var2 = Utilities.sinset(super.m_Reserve[3])) >> 6) * (var2 >= 0 ? -1 : 1) + D;
      super.m_Yposi = var2;
      super.m_Xposi = C;
      super.m_Reserve[3] = super.m_Reserve[3] + 2 & 255;
      if (super.m_Reserve[K] < 8) {
         if (super.m_Colicnt_Ms != 0) {
            if (super.m_Colino == 0) {
               if (super.m_Reserve[1] == 0) {
                  super.m_Reserve[1] = 64;
               }

               if (--super.m_Reserve[1] == 0) {
                  super.m_Colino = 15;
               }
            }
         } else {
            GameState.scoreUp(100, true);
            I = 179;
            super.m_Reserve[K] = 8;
            J[2] = 5;
            J[3] = 0;
            super.m_Sprpositbl[0][3] = 5;
            super.m_Patbase_Table = z;
         }
      }
   }

   private void o(State var1) {
      int var2 = super.m_Yposi;
      super.m_Yposi += 4;
      ((GameState)var1).atariRideSub(super.m_Xposi, var2, 35, 68, 69, 8, this);
      super.m_Yposi = var2;
   }

   private int a(int[][] var1, int var2, int var3, int var4) {
      boolean var5 = false;
      boolean var6 = false;

      do {
         boolean var7 = false;
         boolean var8 = false;
         boolean var9 = false;
         var5 = false;
         int var12;
         int var13 = (var12 = J[var3++]) >> 4;
         int var14 = var12 = Math.abs(var12 &= 15);
         if (var12 != var13) {
            var5 = true;
         }

         int var10 = var12 << 4 & 240 | var12;
         var13 = (var12 = J[var3++]) >> 4;
         if (var5) {
            var12 = 0;
            var13 = 0;
         }

         var12 = Math.abs(var12 &= 15);
         --var12;
         if (var12 < 0) {
            int var11 = var14;
            var12 = var1[var14][0];
            if ((var14 = var1[var14][var13 + 1]) < 0) {
               switch(var14) {
               case -4:
                  var13 = var1[var11][var13 + 2];
                  var14 = var1[var11][var13 + 1];
                  break;
               case -3:
                  var10 = (var10 &= 240) | var1[var11][var13 + 2];
                  var6 = true;
                  break;
               case -2:
                  int[] var10000 = super.m_Reserve;
                  int var10001 = K;
                  var10000[var10001] += 2;
                  return var3;
               case -1:
                  var13 = 0;
                  var14 = var1[var11][1];
                  break;
               default:
                  return var3;
               }
            }

            if (!var6) {
               var14 &= 127;
               if (var4 >= 0) {
                  super.m_Sprpositbl[var4][3] = var14;
               } else {
                  super.m_Patno_Ms = var14;
               }

               ++var13;
            }

            var6 = false;
         }

         var13 <<= 4;
         var12 |= var13;
         J[var3 - 1] = var12;
         J[var3 - 2] = var10;
         ++var4;
         --var2;
      } while(var2 >= 0);

      return var3;
   }

   private void b(Action var1) {
      if (var1 != null) {
         var1.m_Cddat |= 2;
         var1.m_Cddat &= -9;
      }

   }

   public void BBOSS6_init() {
      if (M == null) {
         M = Utilities.arrayInputDataInt2("/bboss6chg.bin");
         N = Utilities.arrayInputDataInt2("/bboss6chg2.bin");
         O = Utilities.arrayInputDataInt2("/bboss6pat.bin");
      }

      super.m_Patbase_Image = Q;
      super.m_Reserve = new int[13];
   }

   private void p(State var1) {
      this.r(var1);
      this.q(var1);
      State var2 = var1;
      int[] var10000;
      if (super.m_Reserve[1] == 47) {
         var10000 = J;
         var10000[8] &= 240;
         var10000 = J;
         var10000[8] |= 6;
      } else {
         Action var3 = var1.getSonicAction();
         Action var4 = var2.getTailsAction();
         if ((var3.m_R_No0 == 4 || var4 != null && var4.m_R_No0 == 4) && (J[8] & 15) != 6) {
            var10000 = J;
            var10000[8] &= 240;
            var10000 = J;
            var10000[8] |= 6;
         }
      }

      this.a(M);
   }

   private void q(State var1) {
      int var4 = super.m_Xposi;
      int var2 = super.m_Yposi;
      super.m_Sprpositbl[2][0] = var4;
      super.m_Sprpositbl[2][1] = var2;
      super.m_Sprpositbl[3][0] = var4;
      super.m_Sprpositbl[3][1] = var2;
      super.m_Sprpositbl[0][0] = var4;
      super.m_Sprpositbl[0][1] = var2;
      if (super.m_Reserve[3] == 0) {
         super.m_Sprpositbl[4][0] = var4;
         super.m_Sprpositbl[4][1] = var2;
         super.m_Sprpositbl[1][0] = var4;
         super.m_Sprpositbl[1][1] = var2;
         super.m_Reserve[8] = var2;
         super.m_Reserve[9] = var2;
      } else {
         if (I <= 120) {
            int var10002 = super.m_Sprpositbl[4][0]--;
            int var3 = super.m_Yposi;
            super.m_Yposi = super.m_Reserve[8];
            var4 = this.getYposi();
            var2 = super.m_Reserve[10];
            int[] var10000 = super.m_Reserve;
            var10000[10] += 56;
            var2 = (Math.abs(var2) << 8) * (var2 < 0 ? -1 : 1);
            var4 += var2;
            this.setYposi(var4);
            super.m_Reserve[8] = super.m_Yposi;
            super.m_Yposi = var3;
            super.m_Sprpositbl[4][1] = super.m_Reserve[8];
            if (super.m_Sprpositbl[4][1] >= 1776) {
               super.m_Reserve[10] = 0;
            }

            if (I <= 60) {
               var10002 = super.m_Sprpositbl[1][0]++;
               var3 = super.m_Yposi;
               super.m_Yposi = super.m_Reserve[9];
               var4 = this.getYposi();
               var2 = super.m_Reserve[11];
               var10000 = super.m_Reserve;
               var10000[11] += 56;
               var2 = (Math.abs(var2) << 8) * (var2 < 0 ? -1 : 1);
               var4 += var2;
               this.setYposi(var4);
               super.m_Reserve[9] = super.m_Yposi;
               super.m_Yposi = var3;
               super.m_Sprpositbl[1][1] = super.m_Reserve[9];
               if (super.m_Sprpositbl[1][1] >= 1776) {
                  super.m_Reserve[11] = 0;
               }
            }
         }

      }
   }

   private void r(State var1) {
      int var2 = ((var2 = Utilities.sinset(super.m_Reserve[0])) >> 6) * (var2 < 0 ? -1 : 1) + D;
      super.m_Yposi = var2;
      super.m_Xposi = C;
      int[] var10000 = super.m_Reserve;
      var10000[0] += 2;
      if (super.m_Reserve[K] < 6) {
         if (super.m_Colicnt_Ms != 0) {
            if (super.m_Colino == 0) {
               if (super.m_Reserve[1] == 0) {
                  super.m_Reserve[1] = 48;
                  J[2] = 11;
                  J[6] = 12;
               }

               if (--super.m_Reserve[1] == 0) {
                  super.m_Colino = 15;
                  J[2] = 10;
                  J[6] = 128;
               }

            }
         } else {
            GameState.scoreUp(100, true);
            I = 179;
            super.m_Reserve[K] = 6;
         }
      }
   }

   private void s(State var1) {
      int var5 = super.m_Xposi;
      int var2 = super.m_Yposi;
      int var3 = (Math.abs(var3 = super.m_Xspeed) << 8) * (var3 < 0 ? -1 : 1);
      int var4 = super.m_Xposi;
      super.m_Xposi = var5;
      var5 = this.getXposi() + var3;
      this.setXposi(var5);
      var5 = super.m_Xposi;
      super.m_Xposi = var4;
      var3 = (Math.abs(var3 = super.m_Yspeed) << 8) * (var3 < 0 ? -1 : 1);
      var4 = super.m_Yposi;
      super.m_Yposi = var2;
      var2 = this.getYposi() + var3;
      this.setYposi(var2);
      var2 = super.m_Yposi;
      super.m_Yposi = var4;
      super.m_Yspeed += 56;
      super.m_Xposi = var5;
      super.m_Yposi = var2;
   }

   private void t(State var1) {
      this.j(var1);
      int var10002;
      if (super.m_Reserve[6] != 0) {
         var10002 = super.m_Reserve[6]--;
      } else {
         Action var2;
         int var3 = (var2 = var1.getSonicAction()).m_Xposi - super.m_Xposi;
         var3 += 16;
         if (Math.abs(var3) < 32) {
            if (var2.m_Yposi >= 1712) {
               if (super.m_Reserve[7] < 3) {
                  var10002 = super.m_Reserve[7]++;
                  int[] var10000 = super.m_Reserve;
                  int var10001 = K;
                  var10000[var10001] += 2;
                  J[0] = 8;
                  J[5] = 0;
                  J[11] = 0;
                  GameState.m_BossState = 0;
                  Action var4;
                  (var4 = var1.insertAction(super.m_Actno)).m_Actno = 81;
                  var4.m_R_No0_Ms = 4;
                  var4.m_ReserveObj = this;
                  I = 80;
                  this.p(var1);
               }
            } else if (var2.m_Yposi >= 1660) {
               super.m_Patno_Ms = 15;
               GameState.m_BossState = 2;
               J[5] = 32;
               J[11] = 32;
               J[0] = 9;
               super.m_Reserve[K] = 4;
               G = 0;
               H = 384;
               super.m_Reserve[5] = 0;
               this.p(var1);
            }
         }
      }

      if ((++I & 63) == 0) {
         if ((I & 64) != 0) {
            super.m_Patno_Ms = 15;
            GameState.m_BossState = 2;
            J[5] = 32;
            J[11] = 32;
            J[0] = 9;
         } else {
            super.m_Patno_Ms = 12;
            J[5] = 0;
            J[11] = 0;
            J[0] = 4;
         }
      }

      this.p(var1);
   }

   private void u(State var1) {
      if (super.m_Reserve[K] < 8) {
         if (super.m_Colicnt_Ms != 0) {
            if (super.m_Colino == 0) {
               if (super.m_Reserve[4] == 0) {
                  super.m_Reserve[4] = 32;
               }

               if ((cCanvas.m_ScreenFrame & 1) == 1) {
                  this.R[1][1] = 64;
               } else {
                  this.R[1][1] = 0;
               }

               if (--super.m_Reserve[4] == 0) {
                  super.m_Colino = 50;
                  this.R[1][1] = 0;
               }

            }
         } else {
            GameState.scoreUp(100, true);
            I = 179;
            super.m_Reserve[K] = 8;
         }
      }
   }

   private void a() {
      int[][] var1;
      (var1 = (int[][])((int[][])super.m_ReserveObj))[0][0] = super.m_Xposi;
      var1[0][1] = super.m_Yposi;
   }

   private void v(State var1) {
      int var2 = Utilities.sinset(super.m_Reserve[1]);
      super.m_Yposi = (var2 >> 7) * (var2 < 0 ? -1 : 1) + D;
      int[] var10000 = super.m_Reserve;
      var10000[1] += 4;
      this.u(var1);
      this.a();
      this.a(this.T);
   }

   private void w(State var1) {
      if ((crlCanvas.mCounter & 7L) == 0L) {
         Action var4;
         (var4 = var1.insertAction(88)).m_Actno = 88;
         var4.m_Xposi = super.m_Xposi;
         var4.m_Yposi = super.m_Yposi;
         int var3;
         int var2 = ((var3 = Utilities.getRandom()) & 255) >> 2;
         var2 -= 32;
         var4.m_Xposi += var2;
         var3 = (var3 >> 8 & 255) >> 2;
         var3 -= 32;
         var4.m_Yposi += var3;
      }

   }

   private void x(State var1) {
      Action var2;
      (var2 = var1.insertAction(super.m_Actno)).m_Actno = 82;
      var2.m_R_No0_Ms = 8;
      var2.m_Patbase_Table = this.X;
      var2.m_Sproffset = 1508;
      var2.m_Actflg |= 4;
      var2.m_Sprpri = 1;
      var2.m_Xposi = super.m_Xposi;
      var2.m_Yposi = super.m_Yposi;
      var2.m_Reserve[10] = this.getXposi();
      var2.m_Yposi -= 40;
      var2.m_Xspeed = -96;
      var2.m_Yspeed = -192;
      var2.m_Patno = 0;
      var2.m_Pattim = 17;
   }

   private void y(State var1) {
      BossAction var3;
      switch(super.m_R_No0) {
      case 0:
         (var3 = this).m_R_No0 = 2;
         var3.m_Sprvs = 8;
         var3.m_Sprhs = 8;
         var3.m_Patbase_Table = var3.U;
         var3.m_Sproffset = 33814;
         var3.m_Actflg |= 4;
         var3.m_Sprpri = 3;
         var3.m_Sprhsize = 8;
         var3.m_Colino = 139;
         var3.m_Reserve[11] = var3.m_Yposi;
         var3.m_Xspeed = -(var3.m_Userflag << 3 & 1920);
         var3.m_Yspeed = -(var3.m_Userflag << 3 & 1920);
         var3.m_Reserve[8] = (var3.m_Userflag & 15) << 4;
         var3.m_Reserve[12] = (var3.m_Userflag & 15) << 4;
         var3.z(var1);
         return;
      case 1:
      case 3:
      case 5:
      case 7:
      case 9:
      case 11:
      default:
         break;
      case 2:
         this.z(var1);
         return;
      case 4:
         if ((var3 = this).m_Pattim == 5) {
            Action var4 = var1.insertAction(var3, var3.m_Actno);
            var3.a(var1, var4);
            var4 = var1.insertAction(var3, var3.m_Actno);
            var3.a(var1, var4);
            System.err.println("ytama speed " + var4.m_Xspeed);
            var4.m_Xspeed = -var4.m_Xspeed;
            var4.m_Actflg |= 1;
            var3.m_R_No0 += 2;
         }

         var3.patchg(var3.V);
         var3.frameOutCheck(var1);
         return;
      case 6:
         if (--(var3 = this).m_Reserve[8] < 0) {
            var3.m_Reserve[8] = var3.m_Reserve[12];
            var3.m_R_No0 = 2;
            var3.m_Mstno = 0;
            var3.m_Mstno_1 = 1;
         }

         var3.patchg(var3.V);
         var3.frameOutCheck(var1);
         return;
      case 8:
         if (--(var3 = this).m_Pattim < 0) {
            var3.m_Pattim = 7;
            ++var3.m_Patno;
            var3.m_Patno &= 1;
         }

         var3.speedSet2();
         var3.m_Yspeed += 24;
         if (var3.m_Yposi >= GameState.m_ScrALim_Down + 224) {
            var3.m_Actflg &= -3;
            if (var3.m_Yspeed >= 0) {
               var3.m_Actflg |= 2;
               int var2;
               if ((var2 = ((GameState)var1).emyCol_D(var3.m_Xposi, var3.m_Yposi, var3.m_Sprvs)) <= 0) {
                  var3.m_Yposi += var2;
                  var3.m_R_No0 += 2;
                  var3.m_Mstno = 2;
                  var3.m_Patno = 4;
                  var3.m_Yspeed = 0;
                  var3.m_Patbase_Table = var3.W;
                  var3.m_Sproffset = 33694;
                  var3.m_Patno = 0;
                  var3.m_Reserve[8] = 9;
                  var3.m_Reserve[9] = 3;
               }
            }

            var3.frameOutCheck(var1);
            return;
         }

         var3.frameOut(var1);
         break;
      case 10:
         this.A(var1);
         return;
      case 12:
         this.frameOut(var1);
      }

   }

   private void z(State var1) {
      this.patchg(this.V);
      this.frameOutCheck(var1);
   }

   private void A(State var1) {
      if (--super.m_Reserve[8] <= 0) {
         super.m_Reserve[8] = 127;
         if (--super.m_Reserve[9] >= 0) {
            Action var2;
            (var2 = var1.insertAction(super.m_Actno)).m_Actno = super.m_Actno;
            var2.m_R_No0 = super.m_R_No0;
            var2.m_Xposi = super.m_Xposi;
            var2.m_Yposi = super.m_Yposi;
            var2.m_Xspeed = super.m_Xspeed;
            var2.m_Yspeed = super.m_Yspeed;
            var2.m_Sprvs = super.m_Sprvs;
            var2.m_Sprhs = super.m_Sprhs;
            var2.m_Patbase_Table = super.m_Patbase_Table;
            var2.m_Sproffset = super.m_Sproffset;
            var2.m_Actflg = super.m_Actflg;
            var2.m_Sprpri = super.m_Sprpri;
            var2.m_Sprhsize = super.m_Sprhsize;
            var2.m_Colino = super.m_Colino;
            var2.m_Cddat = super.m_Cddat;
            var2.m_Patcnt = super.m_Patcnt;
            var2.m_Patno = super.m_Patno;
            var2.m_Pattim = super.m_Pattim;
            var2.m_Userflag = super.m_Userflag;
            var2.m_ReserveObj = super.m_ReserveObj;
            var2.m_Reserve = new int[super.m_Reserve.length];

            int var3;
            for(var3 = 0; var3 < super.m_Reserve.length; ++var3) {
               var2.m_Reserve[var3] = super.m_Reserve[var3];
            }

            var2.m_Reserve[8] = 9;
            var2.m_Mstno = 2;
            var2.m_Mstno_1 = 0;
            byte var4 = 14;
            if (var2.m_Xspeed <= 0) {
               var4 = -14;
            }

            var2.m_Xposi += var4;
            var3 = ((GameState)var1).emyCol_D3(super.m_Xposi, super.m_Yposi, super.m_Sprvs);
            var2.m_Yposi += var3;
         }
      }

      this.patchg(this.V);
      this.frameOutCheck(var1);
   }

   private void a(State var1, Action var2) {
      var2.m_Actno = 32;
      var2.m_R_No0 = 8;
      var2.m_Xposi = super.m_Xposi;
      var2.m_Yposi = super.m_Yposi;
      var2.m_Xspeed = super.m_Xspeed;
      var2.m_Yspeed = super.m_Yspeed;
      var2.m_Sprvs = 8;
      var2.m_Sprhs = 8;
      var2.m_Patbase_Table = this.U;
      var2.m_Sproffset = super.m_Sproffset;
      var2.m_Actflg |= 4;
      var2.m_Sprpri = 3;
      var2.m_Sprhsize = 8;
      var2.m_Colino = 139;
      var2.m_Reserve[11] = var2.m_Yposi;
   }

   static {
      (new int[1][])[0] = new int[]{0};
      (new int[1][])[0] = new int[]{1};
   }
}
