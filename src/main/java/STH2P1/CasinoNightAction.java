package STH2P1;

import javax.microedition.lcdui.Graphics;

public class CasinoNightAction extends Action {
   private static final int[][] a = new int[][]{{0, 0, 0, 32, 32, -16, -16}, {0, 0, 32, 40, 40, -20, -20}, {0, 32, 0, 32, 32, -16, -16}, {0, 64, 0, 32, 32, -16, -16}, {0, 40, 32, 40, 40, -20, -20}};
   private static final int[][] b = new int[][]{{16, 0, -1}, {4, 1, 0, 1, -3, 0}};
   private static final int[][] c = new int[][]{{0, 0, 0, 48, 32, -24, -16}};
   private static final int[][] d = new int[][]{{0, 0, 0, 48, 32, -24, -16}, {0, 0, 32, 48, 16, -24, -8}, {0, 0, 48, 48, 32, -24, -16}, {1, 16, 0, 32, 48, -16, -24}, {1, 0, 0, 16, 48, -8, -24}, {1, 0, 0, 16, 48, -8, -24}, {1, 0, 0, 16, 48, -8, -24}, {1, 16, 0, 32, 48, -16, -24}, {1, 16, 0, 32, 48, -16, -24}, {0, 0, 48, 48, 32, -24, -8}, {0, 0, 48, 48, 32, -24, -8}, {0, 0, 48, 48, 32, -24, -16}, {0, 0, 48, 48, 32, -24, -16}, {0, 0, 0, 48, 32, -24, -16}, {0, 0, 0, 48, 32, -24, -16}};
   private static final int[][] e = new int[][]{{16, 0, -1}, {4, 1, 2, 1, -3, 0}, {16, 4, -1}, {4, 5, 4, 3, 3, -3, 2}, {4, 3, 4, 5, 5, -3, 2}};
   private static final int[] f = new int[]{7, 7, 7, 7, 7, 7, 7, 8, 9, 10, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14};
   private static final int[] g = new int[]{6, 6, 6, 6, 6, 6, 7, 8, 9, 9, 9, 9, 9, 9, 8, 8, 8, 8, 8, 8, 7, 7, 7, 7, 6, 6, 6, 6, 5, 5, 4, 4, 4, 4, 4, 4};
   private static final int[] h = new int[]{5, 5, 5, 5, 5, 6, 7, 8, 9, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 17, 17, 16, 16, 16, 16, 16, 16, 16, 16};
   private static final int[][] i = new int[][]{{0, 0, 0, 64, 64, -32, -32}};
   private static final int[][] j = new int[][]{{0, 0, 0, 32, 16, -16, -8}, {0, 0, 32, 32, 16, -16, -8}, {0, 0, 64, 32, 16, -16, -8}};
   private static final int[][] k = new int[][]{{0, 0, 48, 16, 16, -8, -8}, {0, 0, 32, 16, 32, -8, -16}, {0, 0, 16, 16, 48, -8, -24}, {0, 0, 0, 16, 64, -8, -32}, {0, 0, 0, 32, 64, -16, -32}, {0, 0, 0, 48, 48, -24, -24}, {0, 0, 0, 64, 32, -32, -16}, {0, 0, 0, 80, 16, -40, -8}, {0, 16, 0, 80, 16, -40, -8}, {0, 32, 0, 64, 32, -32, -16}, {0, 48, 0, 48, 48, -24, -24}, {0, 64, 0, 32, 64, -16, -32}, {0, 80, 0, 16, 64, -8, -32}, {0, 80, 16, 16, 48, -8, -24}, {0, 80, 32, 16, 32, -8, -16}, {0, 80, 48, 16, 16, -8, -8}};
   private static final int[] l = new int[]{-40, 24, 8, 8, -40, 16, 8, 16, -40, 8, 8, 24, -40, 0, 8, 32, -32, 0, 16, 32, -24, -8, 24, 24, -16, -16, 32, 16, -8, -24, 40, 8, 8, -24, 40, 8, 16, -16, 32, 16, 24, -8, 24, 24, 32, 0, 16, 32, 40, 0, 8, 32, 40, 8, 8, 24, 40, 16, 8, 16, 40, 24, 8, 8};
   private static final int[][][] m = new int[][][]{{{0, 0, 0, 22, 16, -11, -32}, {0, 0, 16, 22, 16, -11, -32}, {0, 0, 32, 22, 40, -11, -48}, {0, 0, 48, 22, 24, -11, -32}}, {{1, 0, 0, 32, 32, -12, -21}, {1, 32, 0, 32, 32, -12, -21}, {1, 64, 0, 32, 32, -32, 0}, {1, 64, 8, 24, 24, -32, 8}}};
   private static final int[][] n = new int[][]{{6, 0, -1}, {6, 0, 1, -1}};
   private static final int[][][] o = new int[][][]{{{0, 0, 0, 32, 12, -16, -8}, {1, 0, 0, 24, 24, -12, -12}, {2, 0, 0, 16, 32, -8, -16}, {0, 32, 0, 32, 12, -16, -8}, {1, 24, 0, 24, 24, -12, -12}, {2, 16, 0, 16, 32, -8, -16}}, {{0, 96, 0, 32, 12, -16, -8}, {1, 72, 0, 24, 24, -12, -12}, {2, 48, 0, 16, 32, -8, -16}, {0, 32, 0, 32, 12, -16, -8}, {1, 24, 0, 24, 24, -12, -12}, {2, 16, 0, 16, 32, -8, -16}}, {{0, 128, 0, 32, 12, -16, -8}, {1, 96, 0, 24, 24, -12, -12}, {2, 64, 0, 16, 32, -8, -16}, {0, 128, 0, 32, 12, -16, -8}, {1, 96, 0, 24, 24, -12, -12}, {2, 64, 0, 16, 32, -8, -16}}};
   private static final int[][] p = new int[][]{{16, 0, -1}, {16, 1, -1}, {16, 2, -1}, {6, 3, 0, 3, -3, 0}, {6, 4, 1, 4, -3, 1}, {6, 5, 2, 5, -3, 2}};
   private static final int[][] q = new int[][]{{0, 0, 0, 48, 40, -24, -20}, {0, 48, 0, 48, 40, -24, -20}};
   private static final int[][] r = new int[][]{{16, 0, -1}, {16, 1, 0, -1}};
   private static final int[][] s = new int[][]{{0, 0, 0, 16, 16, -8, -8}, {0, 0, 16, 16, 16, -8, -8}, {0, 0, 32, 16, 16, -8, -8}, {0, 0, 16, 16, 16, -8, -8}, {0, 0, 0, 0, 0, -8, -8}, {0, 0, 0, 0, 0, -8, -8}, {0, 0, 0, 0, 0, -8, -8}, {0, 0, 0, 0, 0, -8, -8}};
   private static final int[][] t = new int[][]{{6, 4, 5, 6, 7, -4}};
   private static final int[][] u = new int[][]{{6, 0, 1, 2, 3, -1}};
   private static final int[][] v = new int[][]{{0, 0, 0, 15, 15, -7, -7}, {0, 0, 0, 15, 15, -7, -7}};
   private static final int[][] w = new int[][]{{0, 0, 0, 48, 32, -24, -16}, {0, 48, 0, 64, 32, -32, -16}, {0, 112, 0, 40, 32, -40, -16}, {0, 152, 0, 48, 32, -32, -16}};
   private static final int[] x = new int[]{4, 3, 16, 215};
   private static final int[][] y = new int[][]{{20, 0, 1, -1}};

   public CasinoNightAction(int var1, int var2) {
      super.classType = 7;
      this.setType(var1, var2);
   }

   public void setType(int var1, int var2) {
      super.m_Actno = var1;
      CasinoNightAction var3;
      switch(super.m_Actno) {
      case 68:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(68);
         var3.m_Patbase_Table = a;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         return;
      case 133:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(133);
         var3.m_Patbase_Table = m[0];
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 9);
         return;
      case 134:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(134);
         var3.m_Patbase_Table = d;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 6);
         return;
      case 200:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(200);
         var3.m_Patbase_Table = w;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
      default:
         return;
      case 210:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(210);
         var3.m_Patbase_Table = k;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 6);
         return;
      case 211:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(211);
         var3.m_Patbase_Table = v;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 14);
         return;
      case 212:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(212);
         var3.m_Patbase_Table = i;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         return;
      case 213:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(213);
         var3.m_Patbase_Table = j;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 3);
         return;
      case 214:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(214);
         var3.m_Patbase_Table = q;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 14);
         return;
      case 215:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(215);
         var3.m_Patbase_Table = c;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 3);
         return;
      case 216:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(216);
         var3.m_Patbase_Table = o[0];
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 3);
         return;
      case 220:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(220);
         var3.m_Patbase_Table = s;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 14);
      }
   }

   public void update(State var1) {
      int var2;
      int var3;
      int var4;
      CasinoNightAction var5;
      Action var6;
      byte var7;
      Action var8;
      Action var9;
      int[] var10000;
      int var10002;
      switch(super.m_Actno) {
      case 68:
         switch((var5 = this).m_R_No0) {
         case 0:
            var5.m_R_No0 += 2;
            var5.m_Actflg = 4;
            var5.m_Sprhsize = 16;
            var5.m_Sprpri = 1;
            var5.m_Colino = 215;
         case 2:
            if (var5.m_Colicnt != 0) {
               if ((var5.m_Colicnt & 1) != 0) {
                  var5.m_Colicnt &= -2;
                  var5.a(var1, var1.getSonicAction());
               }

               if ((var5.m_Colicnt & 2) != 0) {
                  var5.m_Colicnt &= -3;
                  var5.a(var1, var1.getTailsAction());
               }

               var5.m_Colicnt = 0;
            }

            var5.patchg(b);
            var5.frameOutCheck(var1);
         default:
            return;
         }
      case 133:
         switch((var5 = this).m_R_No0) {
         case 0:
            var5.m_R_No0 += 2;
            if ((var5.m_Userflag & 255) != 0) {
               var5.m_Patbase_Table = m[1];
            }

            var5.m_Actflg = 68;
            var5.m_Patno_Ms = 1;
            if ((var5.m_Userflag & 255) != 0) {
               var5.m_R_No0 += 2;
               var5.m_Sprhsize_Ms = 32;
               var5.m_Sprhsize = 24;
               var5.m_Reserve[0] = var5.m_Xposi;
               var5.m_Reserve[4] = var5.m_Yposi;
               var2 = var5.m_Xposi;
               var4 = var5.m_Yposi;
               var5.m_Manysprcnt = 1;
               var5.m_Sprpositbl = new int[1][4];
               var5.m_Sprpositbl[0][0] = var2;
               var5.m_Sprpositbl[0][1] = var4;
               var5.m_Sprpositbl[0][3] = 2;
               return;
            }

            var5.m_Sprhsize_Ms = 32;
            var5.m_Sprhsize = 24;
            var5.m_Reserve[0] = var5.m_Xposi;
            var5.m_Reserve[4] = var5.m_Yposi;
            var2 = var5.m_Xposi;
            var4 = var5.m_Yposi + 32;
            var5.m_Manysprcnt = 1;
            var5.m_Sprpositbl = new int[1][4];
            var5.m_Sprpositbl[0][0] = var2;
            var5.m_Sprpositbl[0][1] = var4;
            var5.m_Sprpositbl[0][3] = 2;
         case 2:
            var5.patchg(n);
            var5.m_Mstno = 0;
            var5.m_Reserve[8] = 0;
            var5.m_Yposi = var5.m_Reserve[4] + var5.m_Reserve[7];
            var5.m_Sprpositbl[0][3] = 2;
            if (16 <= var5.m_Reserve[7]) {
               var5.m_Sprpositbl[0][3] = 3;
            }

            var5.b(var1, var1.getSonicAction(), 5, 35, 32, 29, var5.m_Xposi, cCanvas.swRead(), 8);
            var5.b(var1, var1.getTailsAction(), 6, 35, 32, 29, var5.m_Xposi, 0, 16);
            if (var5.m_Reserve[5] != 0) {
               if (var5.m_Reserve[7] != 0) {
                  var2 = 0;
                  if (var5.m_Reserve[5] == 1) {
                     var2 = 0 | cCanvas.swRead();
                  }

                  if ((var2 &= 28784) == 0) {
                     var5.m_Reserve[5] = 2;
                     var5.m_Reserve[6] = 2;
                     return;
                  }
               }
            } else {
               var5.m_Patno_Ms = 1;
               var10000 = var5.m_Reserve;
               if ((var10000[7] -= 4) < 0) {
                  var5.m_Reserve[7] = 0;
                  return;
               }
            }
         case 1:
         case 3:
         default:
            break;
         case 4:
            var5.patchg(n);
            var5.m_Mstno = 0;
            var5.m_Reserve[8] = 0;
            var3 = var5.m_Reserve[7] >> 1;
            var5.m_Xposi = var5.m_Reserve[0] - var3;
            var5.m_Yposi = var5.m_Reserve[4] + var3;
            var5.m_Sprpositbl[0][3] = 2;
            if (16 <= var5.m_Reserve[7]) {
               var5.m_Sprpositbl[0][3] = 3;
            }

            var5.a(var1, var1.getSonicAction(), 5, 35, 8, 5, var5.m_Xposi, cCanvas.swRead(), 8);
            var5.a(var1, var1.getTailsAction(), 6, 35, 8, 5, var5.m_Xposi, 0, 16);
            if (var5.m_Reserve[5] != 0) {
               if (var5.m_Reserve[7] != 0) {
                  var2 = 0;
                  if (var5.m_Reserve[5] == 1) {
                     var2 = 0 | cCanvas.swRead();
                  }

                  if ((var2 &= 28784) == 0) {
                     var5.m_Reserve[5] = 2;
                     var5.m_Reserve[6] = 2;
                  }

                  return;
               }
            } else {
               var5.m_Patno_Ms = 1;
               var10000 = var5.m_Reserve;
               if ((var10000[7] -= 4) < 0) {
                  var5.m_Reserve[7] = 0;
               }
            }
         }

         return;
      case 134:
         switch((var5 = this).m_R_No0) {
         case 0:
            var5.m_R_No0 += 2;
            var5.m_Actflg |= 4;
            var5.m_Sprhsize = 24;
            var5.m_Sprpri = 4;
            if ((var5.m_Userflag & 255) != 0) {
               var5.m_R_No0 += 2;
               var5.m_Mstno = 2;
               return;
            }
         case 2:
            var6 = var1.getSonicAction();
            var8 = var1.getTailsAction();
            switch(var5.m_Patno) {
            case 0:
               ((GameState)var1).atariRideSub_t(35, 6, 0, 8, var5, var6, f);
               break;
            case 1:
               ((GameState)var1).atariRideSub_t(35, 6, 0, 8, var5, var6, g);
               break;
            case 2:
               ((GameState)var1).atariRideSub_t(35, 6, 0, 8, var5, var6, h);
            }

            var5.a(var6, 3, cCanvas.swRead(), 8);
            var5.a(var8, 4, 0, 16);
            if (var5.m_Reserve[5] != 0) {
               var5.m_Reserve[5] = 0;
               var5.b(var8, 4, 0, 16);
               var5.b(var6, 3, cCanvas.swRead(), 8);
            }

            var5.patchg(e);
            return;
         case 1:
         case 3:
         default:
            return;
         case 4:
            var6 = var1.getSonicAction();
            var8 = var1.getTailsAction();
            ((GameState)var1).atariRideSub3(var5.m_Xposi, 19, 24, 25, 8, var5, var6);
            if ((var5.m_Cddat & 32) != 0) {
               var5.b(var6);
            }

            if (var8 != null) {
               ((GameState)var1).atariRideSub3(var5.m_Xposi, 19, 24, 25, 16, var5, var8);
            }

            if ((var5.m_Cddat & 64) != 0) {
               var5.b(var8);
            }

            var5.patchg(e);
            return;
         }
      case 200:
         switch((var5 = this).m_R_No0) {
         case 0:
            var5.y_Emy_Init(x);
            var5.m_R_No0 += 2;
            var5.m_Reserve[0] = 512;
            var5.m_Xspeed = (var5.m_Actflg & 1) == 0 ? -32 : 32;
            var5.m_Sprvs = 15;
            var5.m_Sprhs = 16;
            return;
         case 1:
         case 3:
         case 5:
         default:
            return;
         case 2:
            if (--var5.m_Reserve[0] == 0) {
               var5.m_R_No0 += 2;
               var5.m_Reserve[0] = 59;
               var5.frameOutCheck(var1);
               return;
            }

            var5.speedSet2();
            var5.a(var1);
            var5.patchg(y);
            var5.frameOutCheck(var1);
            return;
         case 4:
            if (--var5.m_Reserve[0] < 0) {
               var5.m_R_No0 = 2;
               var5.m_Reserve[0] = 512;
               var5.m_Xspeed = -var5.m_Xspeed;
               var5.m_Actflg ^= 1;
               var5.m_Cddat ^= 1;
               var5.frameOutCheck(var1);
               return;
            }

            var5.a(var1);
            var5.frameOutCheck(var1);
            return;
         case 6:
            var5.m_Colino = 215;
            var9 = var5._chk_pl_dir(var1);
            var3 = var5.pldir_d2;
            var2 = var5.pldir_d3;
            var3 += 64;
            var2 += 64;
            if (128 > var3 && 128 > var2) {
               if ((var5.m_Cddat & 8) != 0) {
                  var5.m_Cddat &= -9;
                  var5.m_Patno = 1;
                  var5.frameOutCheck(var1);
                  return;
               }

               if (var5.m_Colicnt == 0) {
                  var5.frameOutCheck(var1);
                  return;
               }

               if ((var5.m_Colicnt & 1) != 0) {
                  var5.m_Colicnt &= -2;
                  if (var9.m_Mstno != 2) {
                     var5.b(var1, var9);
                     return;
                  }

                  if ((var9.m_Cddat & 2) == 0) {
                     var5._chk_pl_dir(var1);
                     var2 = var5.pldir_d0;
                     if ((var5.m_Actflg & 1) != 0) {
                        var2 -= 2;
                     }

                     if (var2 != 0) {
                        var5.m_Colino = 23;
                        var5.frameOutCheck(var1);
                        return;
                     }
                  }

                  var5.c(var9);
               }

               if ((var8 = var1.getTailsAction()) != null && (var5.m_Colicnt & 2) != 0) {
                  if (var8.m_Mstno == 2) {
                     var5.b(var1, var8);
                     return;
                  }

                  if ((var8.m_Cddat & 2) == 0) {
                     var5._chk_pl_dir(var1);
                     var2 = var5.pldir_d0;
                     if ((var5.m_Actflg & 1) != 0) {
                        var2 -= 2;
                     }

                     if (var2 != 0) {
                        var5.m_Colino = 23;
                        var5.frameOutCheck(var1);
                        return;
                     }
                  }

                  var5.c(var8);
               }

               var5.m_Colicnt = 0;
               var5.frameOutCheck(var1);
               return;
            }

            var5.m_R_No0 = var5.m_Reserve[1];
            var5.frameOutCheck(var1);
            return;
         }
      case 210:
         switch((var5 = this).m_R_No0) {
         case 0:
            var5.m_R_No0 += 2;
            var5.m_Actflg |= 4;
            var5.m_Sprhsize = 8;
            var5.m_Sprpri = 4;
            var5.m_Reserve[0] = var5.m_Xposi;
            var5.m_Reserve[1] = var5.m_Yposi;
            var5.m_Reserve[4] = (var5.m_Userflag & 255) << 4;
            var5.a();
         case 2:
            if (var5.m_Reserve[4] != 0) {
               var10002 = var5.m_Reserve[4]--;
               return;
            } else {
               if (--var5.m_Reserve[5] < 0) {
                  var5.m_Reserve[5] = 15;
                  ++var5.m_Patno;
                  var5.m_Patno &= 15;
                  if (var5.m_Patno == 0) {
                     var5.m_Reserve[4] = (var5.m_Userflag & 255) << 4;
                     if ((var5.m_Cddat & 24) != 0) {
                        if ((var5.m_Cddat & 8) != 0) {
                           var5.m_Cddat &= -9;
                           Action var10 = var9 = var1.getSonicAction();
                           var10.m_Cddat &= -9;
                           var9.m_Cddat |= 2;
                        }

                        if ((var5.m_Cddat & 16) != 0) {
                           var5.m_Cddat &= -17;
                           if ((var9 = var1.getTailsAction()) != null) {
                              var9.m_Cddat &= -9;
                              var9.m_Cddat |= 2;
                           }
                        }
                     }

                     var5.m_Xposi = var5.m_Reserve[0];
                     var5.a();
                  }

                  var5.a();
               }

               var3 = var5.m_Reserve[2] + 11;
               var4 = (var2 = var5.m_Reserve[3]) + 1;
               ((GameState)var1).atariRideSub(var5.m_Xposi, var5.m_Yposi, var3, var2, var4, 8, var5);
               var5.frameOutCheckX(var1, var5.m_Reserve[0]);
               return;
            }
         default:
            return;
         }
      case 211:
         var3 = (var5 = this).m_Reserve[8] << 16;
         var2 = var5.m_Reserve[6] - var3 >> 4;
         var10000 = var5.m_Reserve;
         var10000[6] -= var2;
         var5.m_Xposi = var5.m_Reserve[6] >> 16;
         var3 = var5.m_Reserve[9] << 16;
         var2 = var5.m_Reserve[7] - var3 >> 4;
         var10000 = var5.m_Reserve;
         var10000[7] -= var2;
         var5.m_Yposi = var5.m_Reserve[7] >> 16;
         if (--var5.m_Reserve[12] == 0) {
            if ((var6 = (Action)var5.m_ReserveObj) != null) {
               var10002 = var6.m_Reserve[10]--;
            }

            if (GameState.m_PlRing != 0) {
               --GameState.m_PlRing;
               GameState.m_PlRing_F |= 129;
            }

            var5.frameOut(var1);
         }

         return;
      case 212:
         var2 = (var5 = this).m_Userflag & 255;
         switch(var5.m_R_No0) {
         case 0:
            var5.m_R_No0 += 2;
            var5.m_Actflg = 4;
            var5.m_Sprhsize = 32;
            var5.m_Sprpri = 4;
            var5.m_Reserve[0] = var5.m_Xposi;
            var5.m_Reserve[1] = var5.m_Yposi;
            var5.setXposi(var5.getXposi() + '耀');
            var5.setYposi(var5.getYposi() + '耀');
            if (var2 == 0) {
               if ((var5.m_Cddat & 1) == 0) {
                  var5.m_Xposi -= 96;
               } else {
                  var5.m_Xposi += 96;
               }
            } else if ((var5.m_Cddat & 2) == 0) {
               var5.m_Yposi -= 96;
            } else {
               var5.m_Yposi += 96;
            }
         case 2:
            var3 = var5.m_Xposi;
            switch(var5.m_Userflag & 255) {
            case 0:
               var7 = 4;
               if (var5.m_Xposi >= var5.m_Reserve[0]) {
                  var7 = -4;
               }

               var5.m_Xspeed += var7;
               break;
            case 2:
               var7 = 4;
               if (var5.m_Yposi >= var5.m_Reserve[1]) {
                  var7 = -4;
               }

               var5.m_Yspeed += var7;
            }

            var5.speedSet2();
            ((GameState)var1).atariRideSub(var3, var5.m_Yposi, 43, 32, 33, 8, var5);
            var5.frameOutCheckX(var1, var5.m_Reserve[0]);
         default:
            return;
         }
      case 213:
         switch((var5 = this).m_R_No0) {
         case 0:
            var5.m_R_No0 += 2;
            var5.m_Actflg = 4;
            var5.m_Sprhsize = 16;
            var5.m_Sprpri = 4;
            var5.m_Reserve[1] = var5.m_Yposi;
            var5.setYposi(var5.getYposi() + '耀');
            var2 = (var5.m_Userflag & 255) << 2;
            if ((var5.m_Cddat & 1) == 0) {
               var5.m_Yposi -= var2;
            } else {
               var5.m_Yposi += var2;
            }
         case 2:
            var5.speedSet2();
            switch(var5.m_Reserve[2]) {
            case 0:
               if ((var5.m_Cddat & 24) != 0) {
                  var10000 = var5.m_Reserve;
                  var10000[2] += 2;
               }
            case 1:
            case 3:
            case 5:
            default:
               break;
            case 2:
               var7 = 8;
               var2 = var5.m_Reserve[1];
               if (var5.m_Yposi > var2) {
                  var7 = -8;
               }

               var5.m_Yspeed += var7;
               if (var5.m_Yspeed == 0) {
                  var10000 = var5.m_Reserve;
                  var10000[2] += 2;
                  var5.m_Yposi = var2;
                  var2 = (var5.m_Userflag & 255) << 2;
                  if ((var5.m_Cddat & 1) == 0) {
                     var5.m_Yposi += var2;
                  } else {
                     var5.m_Yposi -= var2;
                  }
               }
               break;
            case 4:
               if ((var5.m_Cddat & 24) == 0) {
                  var10000 = var5.m_Reserve;
                  var10000[2] += 2;
               }
               break;
            case 6:
               var7 = 8;
               var2 = var5.m_Reserve[1];
               if (var5.m_Yposi > var2) {
                  var7 = -8;
               }

               var5.m_Yspeed += var7;
               if (var5.m_Yspeed == 0) {
                  var5.m_Reserve[2] = 0;
                  var5.m_Yposi = var2;
                  var2 = (var5.m_Userflag & 255) << 2;
                  if ((var5.m_Cddat & 1) == 0) {
                     var5.m_Yposi -= var2;
                  } else {
                     var5.m_Yposi += var2;
                  }
               }
            }

            if (6 > var5.m_Reserve[2]) {
               ((GameState)var1).rideChkSubR(var5.m_Xposi, 16, 0, 9, var5);
            }

            var5.frameOutCheck(var1);
         default:
            return;
         }
      case 214:
         switch((var5 = this).m_R_No0) {
         case 0:
            var5.m_R_No0 += 2;
            var5.m_Actflg = 4;
            var5.m_Sprhsize = 24;
            var5.m_Sprpri = 1;
         case 2:
            var4 = var5.m_Xposi;
            var5.c(var1, var1.getSonicAction(), 0, 0, 35, 16, 17, var4, 8);
            var5.c(var1, var1.getTailsAction(), 1, 2, 35, 16, 17, var4, 16);
            var5.patchg(r);
            var5.frameOutCheck(var1);
         default:
            return;
         }
      case 215:
         switch((var5 = this).m_R_No0) {
         case 0:
            var5.m_R_No0 += 2;
            var5.m_Actflg = 4;
            var5.m_Sprhsize = 16;
            var5.m_Sprpri = 1;
            var5.m_Colino = 202;
            if ((var5.m_Cddat & 1) != 0) {
               var5.m_Reserve[2] = 1;
            }

            var5.m_Reserve[0] = var5.m_Xposi - 96;
            var5.m_Reserve[1] = var5.m_Xposi + 96;
         case 2:
            if (var5.m_Colicnt != 0) {
               if ((var5.m_Colicnt & 1) != 0) {
                  var5.m_Colicnt &= -2;
                  var5.a(var1.getSonicAction());
               }

               if ((var5.m_Colicnt & 2) != 0) {
                  var5.m_Colicnt &= -3;
                  var5.a(var1.getTailsAction());
               }

               var5.m_Colicnt = 0;
            }

            if ((var5.m_Userflag & 255) != 0) {
               if (var5.m_Reserve[2] != 0) {
                  if ((var2 = var5.m_Xposi - 1) == var5.m_Reserve[0]) {
                     var5.m_Reserve[2] = 0;
                  }

                  var5.m_Xposi = var2;
               } else {
                  if ((var2 = var5.m_Xposi + 1) == var5.m_Reserve[1]) {
                     var5.m_Reserve[2] = 1;
                  }

                  var5.m_Xposi = var2;
               }
            }
         default:
            var5.m_Actflg |= 1;
            return;
         }
      case 216:
         switch((var5 = this).m_R_No0) {
         case 0:
            var5.m_R_No0 += 2;
            var5.m_Sproffset = 17382;
            var5.m_Actflg = 4;
            var5.m_Sprhsize = 16;
            var5.m_Sprpri = 1;
            var5.m_Colino = 215;
            var5.m_Mstno = var5.m_Userflag >> 6 & 3;
         case 2:
            if (var5.m_Colicnt != 0 || var5.m_Reserve[0] != 0) {
               if (var5.m_Reserve[0] != 0) {
                  var10002 = var5.m_Reserve[0]--;
               } else if ((var5.m_Colicnt & 1) != 0) {
                  var5.m_Colicnt &= -2;
                  var5.a(var1, var1.getSonicAction(), 0);
               }

               if (var5.m_Reserve[1] != 0) {
                  var10002 = var5.m_Reserve[1]--;
               } else if ((var5.m_Colicnt & 2) != 0) {
                  var5.m_Colicnt &= -3;
                  var5.a(var1, var1.getTailsAction(), 1);
               }

               var5.m_Colicnt = 0;
            }

            var5.patchg(p);
            var5.frameOutCheck(var1);
            return;
         case 4:
            var5.patchg(p);
            if (var5.m_Mstno < 3) {
               var5.frameOut(var1);
               return;
            } else {
               var5.frameOutCheck(var1);
            }
         case 1:
         case 3:
         default:
            return;
         }
      case 220:
         switch((var5 = this).m_R_No0) {
         case 0:
            var3 = var5.m_Reserve[8] << 16;
            var2 = var5.m_Reserve[6] - var3 >> 4;
            var10000 = var5.m_Reserve;
            var10000[6] -= var2;
            var5.m_Xposi = var5.m_Reserve[6] >> 16;
            var3 = var5.m_Reserve[9] << 16;
            var2 = var5.m_Reserve[7] - var3 >> 4;
            var10000 = var5.m_Reserve;
            var10000[7] -= var2;
            var5.m_Yposi = var5.m_Reserve[7] >> 16;
            var5.patchg(u);
            if (--var5.m_Reserve[12] == 0 && (var6 = (Action)var5.m_ReserveObj) != null) {
               var10002 = var6.m_Reserve[10]--;
               PlayerAction2.RING_RingGetSub0(var5);
               var5.m_R_No0 += 2;
               break;
            }

            return;
         case 1:
         case 3:
         default:
            return;
         case 2:
            var5.patchg(t);
            break;
         case 4:
            var5.frameOut(var1);
            return;
         }
      }

   }

   public void render(Graphics var1) {
   }

   public static void prepareImages() {
      CommonAction.loadImages(68);
      CommonAction.loadImages(215);
      CommonAction.loadImages(134);
      CommonAction.loadImages(212);
      CommonAction.loadImages(213);
      CommonAction.loadImages(210);
      CommonAction.loadImages(133);
      CommonAction.loadImages(216);
      CommonAction.loadImages(214);
      CommonAction.loadImages(220);
      CommonAction.loadImages(211);
      CommonAction.loadImages(200);
   }

   public static void disposeImages() {
      CommonAction.unloadImage(68);
      CommonAction.unloadImage(215);
      CommonAction.unloadImage(134);
      CommonAction.unloadImage(212);
      CommonAction.unloadImage(213);
      CommonAction.unloadImage(210);
      CommonAction.unloadImage(133);
      CommonAction.unloadImage(216);
      CommonAction.unloadImage(214);
      CommonAction.unloadImage(220);
      CommonAction.unloadImage(211);
      CommonAction.unloadImage(200);
   }

   private void a(State var1, Action var2) {
      if (var2 != null) {
         int var3 = super.m_Xposi - var2.m_Xposi;
         int var4 = super.m_Yposi - var2.m_Yposi;
         var4 = Utilities.sinset(var3 = Utilities.atan(var3, var4) + (GameState.m_GameTimer >> 8 & 3));
         var3 = Utilities.cosset(var3);
         var2.m_Xspeed = var3 * -1792 >> 8;
         var2.m_Yspeed = var4 * -1792 >> 8;
         var2.m_Cddat |= 2;
         var2.m_Cddat &= -17;
         var2.m_Cddat &= -33;
         var2.m_JumpFlag = 0;
         super.m_Mstno = 1;
         if (super.m_Cdsts != 0 && 138 > GameState.m_FlagWorkCnt[super.m_Cdsts + 2]) {
            int var10002 = GameState.m_FlagWorkCnt[super.m_Cdsts + 2]++;
         }

         GameState.scoreUp(1, true);
         Action var5;
         if ((var5 = var1.insertAction(41)) != null) {
            var5.m_Xposi = super.m_Xposi;
            var5.m_Yposi = super.m_Yposi;
            var5.m_Patno = 4;
         }

      }
   }

   private void a(Action var1) {
      if (var1 != null) {
         int var3 = super.m_Xposi - var1.m_Xposi;
         int var2 = super.m_Yposi - var1.m_Yposi;
         var2 = Utilities.atan(var3, var2);
         var2 += 32;
         if ((var2 &= 192) == 64) {
            if (var3 >= 0) {
               var1.m_Xspeed -= 512;
            } else {
               var1.m_Xspeed += 512;
            }

            var1.m_Yspeed = -2048;
            super.m_Mstno = 1;
         } else if (var2 == 128) {
            var1.m_Xspeed = 2048;
            super.m_Mstno = 2;
         } else if (var2 == 192) {
            if (var3 >= 0) {
               var1.m_Xspeed -= 512;
            } else {
               var1.m_Xspeed += 512;
            }

            var1.m_Yspeed = 2048;
            super.m_Mstno = 1;
         } else {
            var1.m_Xspeed = -2048;
            super.m_Mstno = 2;
         }

         var1.m_Cddat |= 2;
         var1.m_Cddat &= -49;
         var1.m_JumpFlag = 0;
      }
   }

   private void b(Action var1) {
      if (var1 != null) {
         super.m_Mstno = 3;
         super.m_Mstno_1 = 0;
         var1.m_Xspeed = -4096;
         var1.m_Xposi += 8;
         var1.m_Cddat |= 1;
         if (super.m_Xposi - var1.m_Xposi < 0) {
            var1.m_Cddat &= -2;
            var1.m_Xposi -= 16;
            var1.m_Xspeed = -var1.m_Xspeed;
            super.m_Mstno = 4;
            super.m_Mstno_1 = 0;
         }

         var1.m_FallTimer = 15;
         var1.m_Mspeed = var1.m_Xspeed;
         var1.m_Sprvs = 14;
         var1.m_Sprhs = 7;
         var1.m_Mstno = 2;
         if ((var1.m_Cddat & 4) == 0) {
            var1.m_Cddat |= 4;
            var1.m_Yposi += 5;
         }

      }
   }

   private void a(Action var1, int var2, int var3, int var4) {
      if (var1 != null) {
         if (super.m_Reserve[var2] == 0) {
            if ((super.m_Cddat & var4) == 0) {
               return;
            }

            var1.m_PlayerFlag = 1;
            var1.m_Sprvs = 14;
            var1.m_Sprhs = 7;
            var1.m_Mstno = 2;
            if ((var1.m_Cddat & 4) == 0) {
               var1.m_Cddat |= 4;
               var1.m_Yposi += 5;
            }

            int var10002 = super.m_Reserve[var2]++;
         }

         if ((var3 & 112) == 0) {
            if ((super.m_Cddat & var4) == 0) {
               var1.m_PlayerFlag = 0;
               super.m_Reserve[var2] = 0;
            } else {
               var2 = super.m_Patno - 1;
               var1.m_Cddat |= 1;
               if ((super.m_Cddat & 1) == 0) {
                  var2 = -var2;
                  var1.m_Cddat &= -2;
               }

               var1.m_Xposi += var2;
               var2 <<= 8;
               var1.m_Xspeed = var2;
               var1.m_Mspeed = var2;
               var1.m_Yspeed = 0;
            }
         } else {
            super.m_Reserve[5] = 1;
         }
      }
   }

   private void b(Action var1, int var2, int var3, int var4) {
      if (var1 != null) {
         if ((super.m_Cddat & var4) != 0) {
            super.m_Cddat &= ~var4;
            var3 = var1.m_Xposi - super.m_Xposi;
            if ((super.m_Cddat & 1) != 0) {
               var3 = -var3;
            }

            var3 += 35;
            int var5 = var3;
            if (64 <= var3) {
               var5 = 64;
            }

            var5 = -((var5 << 5) + 2048);
            var3 = Utilities.sinset(var4 = (var3 >> 2) + 64);
            var4 = Utilities.cosset(var4);
            var3 *= var5;
            var4 *= var5;
            var3 >>= 8;
            var4 >>= 8;
            var1.m_Yspeed = var3;
            if ((super.m_Cddat & 1) != 0) {
               var4 = -var4;
            }

            var1.m_Xspeed = var4;
            var1.m_Cddat |= 2;
            var1.m_Cddat &= -9;
            var1.m_R_No0 = 2;
            var1.m_PlayerFlag = 0;
            super.m_Mstno = 1;
            super.m_Reserve[var2] = 0;
         }
      }
   }

   private void a() {
      int var2 = super.m_Patno << 2;
      int var1 = l[var2++];
      if ((super.m_Cddat & 1) != 0) {
         var1 = -var1;
      }

      super.m_Xposi = super.m_Reserve[0] + var1;
      var1 = l[var2++];
      super.m_Yposi = super.m_Reserve[1] + var1;
      var1 = l[var2++];
      var2 = l[var2];
      super.m_Reserve[2] = var1;
      super.m_Sprhsize = var1;
      super.m_Reserve[3] = var2;
   }

   private void a(State var1, Action var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var2 != null) {
         int var10002;
         if ((var4 = super.m_Reserve[var3]) != 0) {
            if (4 > var2.m_R_No0) {
               --var4;
               if (var4 != 0) {
                  super.m_Reserve[var3] = 0;
                  if ((super.m_Cddat & var9) != 0) {
                     super.m_Cddat &= ~var9;
                     var4 = super.m_Reserve[7] + 4 << 7;
                     var2.m_Xspeed = var4;
                     var4 = -var4;
                     var2.m_Yspeed = var4;
                     var2.m_Mspeed = 2048;
                     var2.m_Cddat |= 2;
                     var2.m_Cddat &= -9;
                     if ((super.m_Userflag & 128) != 0) {
                        var4 = -var4;
                        var2.m_Mspeed = var4;
                        var2.m_Cddat &= -2;
                        var2.m_Cddat &= -3;
                        var2.m_Direc = 224;
                     }

                     var2.m_R_No0 = 2;
                     var2.m_PlayerFlag = 0;
                  }
               } else if ((var2.m_Actflg & 128) != 0) {
                  if ((var8 &= 28784) != 0 && super.m_Reserve[8] == 0) {
                     super.m_Reserve[8] = 1;
                     if (--super.m_Reserve[2] < 0) {
                        super.m_Reserve[2] = 3;
                        if (super.m_Reserve[7] != 28) {
                           var10002 = super.m_Reserve[7]++;
                        }
                     }

                     if (--super.m_Reserve[3] < 0) {
                        super.m_Reserve[3] = -(super.m_Reserve[7] - 28) >> 1;
                        super.m_Patno_Ms ^= 4;
                        super.m_Mstno = 1;
                     } else {
                        super.m_Patno_Ms = 1;
                     }
                  }

                  var2.m_Xposi = super.m_Xposi + 19;
                  var2.m_Yposi = super.m_Yposi - 19;
               } else {
                  super.m_Cddat &= ~var9;
                  var2.m_Cddat |= 2;
                  var2.m_Cddat &= -9;
                  var2.m_R_No0 = 2;
                  var2.m_PlayerFlag = 0;
                  super.m_Reserve[var3] = 0;
               }
            }
         } else if (var2.m_Yspeed >= 0) {
            ((GameState)var1).atariRideSub3(super.m_Xposi, 35, 8, 5, var9, this, var2);
            if ((super.m_Cddat & var9) == 0) {
               var4 = var9 << 2;
               if ((super.m_Cddat & var4) == 0) {
                  return;
               }

               super.m_Cddat |= var9;
            }

            var2.m_PlayerFlag = 129;
            var2.m_Xposi = super.m_Xposi + 19;
            var2.m_Yposi = super.m_Yposi - 19;
            var2.m_Xspeed = 0;
            var2.m_Yspeed = 0;
            var2.m_Mspeed = 0;
            var2.m_Cddat |= 4;
            var2.m_Sprvs = 14;
            var2.m_Sprhs = 7;
            var2.m_Mstno = 2;
            var10002 = super.m_Reserve[var3]++;
         }
      }
   }

   private void b(State var1, Action var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var2 != null) {
         int var10002;
         if ((var4 = super.m_Reserve[var3]) != 0) {
            if (4 <= var2.m_R_No0) {
               return;
            }

            --var4;
            if (var4 == 0) {
               if ((var2.m_Actflg & 128) != 0) {
                  if ((var8 &= 28784) != 0 && super.m_Reserve[8] == 0) {
                     super.m_Reserve[8] = 1;
                     if (--super.m_Reserve[2] < 0) {
                        super.m_Reserve[2] = 3;
                        if (super.m_Reserve[7] != 32) {
                           var10002 = super.m_Reserve[7]++;
                        }
                     }

                     if (--super.m_Reserve[3] < 0) {
                        super.m_Reserve[3] = -(super.m_Reserve[7] - 32) >> 1;
                        super.m_Patno_Ms ^= 4;
                        super.m_Mstno = 1;
                     } else {
                        super.m_Patno_Ms = 1;
                     }
                  }

                  var2.m_Yposi = super.m_Yposi - 46;
                  return;
               }

               super.m_Cddat &= ~var9;
               var2.m_Cddat |= 2;
               var2.m_Cddat &= -9;
               var2.m_R_No0 = 2;
               var2.m_PlayerFlag = 0;
               super.m_Reserve[var3] = 0;
               return;
            }

            super.m_Reserve[var3] = 0;
            if ((super.m_Cddat & var9) != 0) {
               super.m_Cddat &= ~var9;
               var2.m_Yspeed = -(super.m_Reserve[7] + 16 << 7);
               var2.m_Xspeed = 0;
               var2.m_Mspeed = 2048;
               var2.m_Cddat |= 2;
               var2.m_Cddat &= -9;
               var2.m_R_No0 = 2;
               var2.m_PlayerFlag = 0;
               return;
            }
         }

         if (var2.m_Yspeed >= 0) {
            var4 = var2.m_Xposi;
            ((GameState)var1).m_ForceAtariY = true;
            ((GameState)var1).atariRideSub3(super.m_Xposi, 35, 32, 29, var9, this, var2);
            ((GameState)var1).m_ForceAtariY = false;
            var2.m_Xposi = var4;
            if ((super.m_Cddat & var9) != 0) {
               var2.m_PlayerFlag = 129;
               var2.m_Xposi = super.m_Xposi;
               var2.m_Xspeed = 0;
               var2.m_Yspeed = 0;
               var2.m_Mspeed = 0;
               var2.m_Cddat |= 4;
               var2.m_Sprvs = 14;
               var2.m_Sprhs = 7;
               var2.m_Mstno = 2;
               var10002 = super.m_Reserve[var3]++;
            }
         }
      }
   }

   private void a(State var1, Action var2, int var3) {
      if (var2 != null) {
         boolean var5 = false;
         int var4;
         if ((var4 = super.m_Patno - 3) == 0) {
            var5 = true;
         } else if (var4 > 0) {
            var5 = false;
         } else {
            var4 += 3;
            if (var4 == 0) {
               var5 = true;
            }
         }

         byte var6;
         int var7;
         if (var5) {
            super.m_Mstno = 3;
            var2.m_Yspeed = -1792;
            if (super.m_Yposi - var2.m_Yposi < 0) {
               var2.m_Yspeed = -var2.m_Yspeed;
            }
         } else {
            --var4;
            if (var4 == 0) {
               super.m_Mstno = 4;
               var6 = 32;
               if ((super.m_Cddat & 1) == 0) {
                  var6 = 96;
               }

               var7 = var2.m_Xspeed;
               var4 = var2.m_Yspeed;
               if ((var7 = var4 = Utilities.atan(var7, var4) - var6) < 0) {
                  var7 = -var7;
               }

               var4 = (var4 = -var4) + var6;
               if (64 > var7) {
                  if (56 <= var7) {
                     var4 = var6;
                  }
               } else {
                  var7 -= 128;
                  var7 = -var7;
                  if (56 <= var7) {
                     var4 = var6 + 128;
                  }
               }

               var7 = Utilities.sinset(var4);
               var4 = Utilities.cosset(var4);
               var2.m_Xspeed = var4 * -1792 >> 8;
               var2.m_Yspeed = var7 * -1792 >> 8;
            } else {
               super.m_Mstno = 5;
               var2.m_Xspeed = -1792;
               if (super.m_Xposi - var2.m_Xposi < 0) {
                  var2.m_Xspeed = -var2.m_Xspeed;
               }
            }
         }

         var2.m_Cddat |= 2;
         var2.m_Cddat &= -49;
         var2.m_JumpFlag = 0;
         var6 = 4;
         byte var8 = 1;
         if (++super.m_Reserve[2] > 2) {
            super.m_Reserve[2] = 2;
            super.m_R_No0 = 4;
            var7 = super.m_Userflag & 63;
            if (GameState.m_Ita0cwk[var7] < 127) {
               int var10002 = GameState.m_Ita0cwk[var7]++;
            }

            if (3 <= GameState.m_Ita0cwk[var7]) {
               var6 = 2;
               var8 = 50;
            }
         }

         super.m_Patbase_Table = o[super.m_Reserve[2]];
         GameState.scoreUp(var8, true);
         Action var9;
         if ((var9 = var1.insertAction(41)) != null) {
            var9.m_Actno = 41;
            var9.m_Xposi = super.m_Xposi;
            var9.m_Yposi = super.m_Yposi;
            var9.m_Patno = var6;
         }

         super.m_Reserve[var3] = 4;
      }
   }

   private void c(State var1, Action var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var2 != null) {
         int[] var10000;
         switch(super.m_Reserve[var4]) {
         case 0:
            if (var2.m_PlayerFlag != 0) {
               return;
            } else if (super.m_Userflag != 0 && GameState.m_Slot_sts != 0) {
               return;
            } else {
               ((GameState)var1).atariRideSub3(var8, 35, 16, 17, var9, this, var2);
               if ((GameState.m_D4_Tmp & '耀') == 0) {
                  return;
               }

               var2.m_Xposi = super.m_Xposi;
               var2.m_Yposi = super.m_Yposi;
               var2.m_Xspeed = 0;
               var2.m_Yspeed = 0;
               var2.m_Mspeed = 0;
               var2.m_PlayerFlag = 129;
               var2.m_Cddat |= 4;
               var2.m_Sprvs = 14;
               var2.m_Sprhs = 7;
               var2.m_Mstno = 2;
               super.m_Mstno = 1;
               var10000 = super.m_Reserve;
               var10000[var4] += 2;
               super.m_Reserve[var4 + 1] = 120;
               if (super.m_Userflag != 0 && GameState.m_SLOTWK_EVN_LEV == 24) {
                  GameState.m_SLOTWK_EVN_LEV = 8;
                  super.m_Reserve[11] = 0;
                  GameState.m_Slot_sts = -1;
                  super.m_Reserve[4] = -1;
               }

               return;
            }
         case 1:
         case 3:
         default:
            return;
         case 2:
            if ((super.m_Actflg & 128) != 0) {
               if (super.m_Userflag != 0) {
                  if (GameState.m_SLOTWK_EVN_LEV == 24 && var2 != null) {
                     int var10002;
                     int var11;
                     Action var12;
                     if ((var5 = GameState.m_SLOTWK_HIT_VAL) < 0) {
                        if (super.m_Reserve[4] < 0) {
                           super.m_Reserve[4] = 100;
                        }

                        if (super.m_Reserve[4] != 0) {
                           if (GameState.m_GameTimer == 0 || 16 <= super.m_Reserve[10] || (var12 = var1.insertAction(211)) == null) {
                              return;
                           }

                           var12.m_Actno = 211;
                           var12.m_AutoFrameout = false;
                           var12.m_Actflg = 4;
                           var12.m_Sprhsize = 16;
                           var12.m_Sprpri = 4;
                           var12.m_Reserve[12] = 30;
                           var12.m_Reserve[5] = super.m_Reserve[11];
                           var10000 = super.m_Reserve;
                           var10000[11] += 144;
                           var12.m_Reserve[8] = super.m_Xposi;
                           var12.m_Reserve[9] = super.m_Yposi;
                           var5 = Utilities.sinset(var12.m_Reserve[5]);
                           var11 = (Utilities.cosset(var12.m_Reserve[5]) >> 1) + var12.m_Reserve[8];
                           var12.m_Reserve[6] = var11 << 16;
                           var12.m_Xposi = var11;
                           var5 = (var5 >>= 1) + var12.m_Reserve[9];
                           var12.m_Reserve[7] = var5 << 16;
                           var12.m_Yposi = var5;
                           var12.m_ReserveObj = this;
                           var10002 = super.m_Reserve[10]++;
                           var10002 = super.m_Reserve[4]--;
                        }

                        if (super.m_Reserve[10] == 0) {
                           super.m_Reserve[10] = 0;
                           super.m_Mstno = 0;
                           var2.m_PlayerFlag = 0;
                           super.m_Cddat &= ~var9;
                           var2.m_Cddat &= -9;
                           var2.m_Cddat |= 2;
                           var2.m_Yspeed = 1024;
                           var10000 = super.m_Reserve;
                           var10000[var4] += 2;
                           super.m_Reserve[var4 + 1] = 30;
                           return;
                        }

                        return;
                     } else {
                        if (var5 != 0) {
                           if (GameState.m_GameTimer == 0 || 16 <= super.m_Reserve[10] || (var12 = var1.insertAction(220)) == null) {
                              return;
                           }

                           var12.m_Actno = 220;
                           var12.m_AutoFrameout = false;
                           var12.m_Actflg = 4;
                           var12.m_Sprpri = 3;
                           var12.m_Sprhsize = 8;
                           var12.m_Reserve[12] = 26;
                           var12.m_Reserve[5] = super.m_Reserve[11];
                           var10000 = super.m_Reserve;
                           var10000[11] += 137;
                           var12.m_Reserve[8] = super.m_Xposi;
                           var12.m_Reserve[9] = super.m_Yposi;
                           var5 = Utilities.sinset(var12.m_Reserve[5]);
                           var11 = (Utilities.cosset(var12.m_Reserve[5]) >> 1) + var12.m_Reserve[8];
                           var12.m_Reserve[6] = var11 << 16;
                           var12.m_Xposi = var11;
                           var5 = (var5 >>= 1) + var12.m_Reserve[9];
                           var12.m_Reserve[7] = var5 << 16;
                           var12.m_Yposi = var5;
                           var12.m_ReserveObj = this;
                           var10002 = super.m_Reserve[10]++;
                           --GameState.m_SLOTWK_HIT_VAL;
                        }

                        if (super.m_Reserve[10] == 0) {
                           super.m_Reserve[10] = 0;
                           super.m_Mstno = 0;
                           var2.m_PlayerFlag = 0;
                           super.m_Cddat &= ~var9;
                           var2.m_Cddat &= -9;
                           var2.m_Cddat |= 2;
                           var2.m_Yspeed = 1024;
                           var10000 = super.m_Reserve;
                           var10000[var4] += 2;
                           super.m_Reserve[var4 + 1] = 30;
                        }
                     }
                  }

                  return;
               }

               if (--super.m_Reserve[var4 + 1] >= 0) {
                  if ((super.m_Reserve[var4 + 1] & 15) != 0) {
                     return;
                  }

                  GameState.scoreUp(10, true);
                  Action var10;
                  if ((var10 = var1.insertAction(41)) != null) {
                     var10.m_Actno = 41;
                     var10.m_Xposi = super.m_Xposi;
                     var10.m_Yposi = super.m_Yposi;
                     var10.m_Patno = 0;
                  }

                  return;
               }
            }

            super.m_Reserve[10] = 0;
            super.m_Mstno = 0;
            var2.m_PlayerFlag = 0;
            super.m_Cddat &= ~var9;
            var2.m_Cddat &= -9;
            var2.m_Cddat |= 2;
            var2.m_Yspeed = 1024;
            var10000 = super.m_Reserve;
            var10000[var4] += 2;
            super.m_Reserve[var4 + 1] = 30;
            return;
         case 4:
            if (--super.m_Reserve[var4 + 1] < 0) {
               super.m_Reserve[var4] = 0;
               if (super.m_Userflag != 0) {
                  GameState.m_Slot_sts = 0;
               }
            }

         }
      }
   }

   private void b(State var1, Action var2) {
      if (var2 != null) {
         super.m_Colino = 151;
         if ((var2.m_PlPower & 2) != 0) {
            super.m_Colino = 23;
         }

         super.m_Cddat |= 8;
         super.m_Patno = 1;
         this.frameOutCheck(var1);
      }
   }

   private void c(Action var1) {
      if ((var1.m_Cddat & 2) == 0) {
         super.m_Patno = 2;
      } else {
         super.m_Patno = 3;
      }

      int var3 = Utilities.atan(super.m_Xposi - var1.m_Xposi, super.m_Yposi - var1.m_Yposi);
      int var2 = GameState.m_GameTimer >> 16 & 3;
      var2 = Utilities.sinset(var3 += var2);
      var3 = Utilities.cosset(var3);
      var1.m_Xspeed = var3 * -1792 >> 8;
      var1.m_Yspeed = var2 * -1792 >> 8;
      var1.m_Cddat |= 2;
      var1.m_Cddat &= -49;
      var1.m_JumpFlag = 0;
   }

   private void a(State var1) {
      this._chk_pl_dir(var1);
      int var3 = super.pldir_d2;
      int var2 = super.pldir_d3;
      if (128 > var3 + 64 && 128 > var2 + 64) {
         super.m_Reserve[1] = super.m_R_No0;
         super.m_R_No0 = 6;
         super.m_Patno = 0;
      }

   }
}
