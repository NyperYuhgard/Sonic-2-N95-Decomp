package STH2P1;

import javax.microedition.lcdui.Graphics;

public class HillTopAction extends Action {
   private static final int[] a = new int[]{48, 48, 48, 48, 48, 48, 48, 48, 47, 47, 46, 46, 45, 45, 44, 44, 43, 43, 42, 42, 41, 41, 40, 40, 39, 39, 38, 38, 37, 37, 36, 36, 35, 35, 34, 34, 33, 33, 32, 32, 31, 31, 30, 30, 29, 29, 28, 28, 27, 27, 26, 26, 25, 25, 24, 24, 23, 23, 22, 22, 21, 21, 20, 20, 19, 19, 18, 18, 17, 17, 16, 16, 15, 15, 14, 14, 13, 13, 12, 12, 11, 11, 10, 10, 9, 9, 8, 8, 7, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1, 1, 0, 0, -1, -1, -2, -2, -3, -3, -4, -4, -5, -5, -6, -6, -7, -7, -8, -8, -9, -9, -10, -10, -11, -11, -12, -12, -13, -13, -14, -14, -15, -15, -16, -16, -17, -17, -18, -18, -19, -19, -20, -20, -21, -21, -22, -22, -23, -23, -24, -24, -25, -25, -26, -26, -27, -27, -28, -28, -29, -29, -30, -30, -31, -31, -32, -32, -33, -33, -34, -34, -35, -35, -36, -36, -37, -37, -38, -38, -39, -39, -40, -40, -41, -41, -42, -42, -43, -43, -44, -44, -45, -45, -46, -46, -47, -47, -48, -48, -48, -48, -48, -48};
   private static final int[] b = new int[]{49152, 49152, 49152, 57344, 49152};
   private static final int[][] c = new int[][]{{0, 0, 0, 64, 112, -32, -64}, {0, 0, 0, 24, 16, -12, -8}, {0, 0, 96, 64, 16, -32, 32}, {0, 0, 0, 24, 16, -12, -8}, {0, 0, 0, 24, 16, -12, -8}};
   private static int d = 0;
   private static int e = 1;
   private static int f = 2;
   private static int g = 3;
   private static final int[][] h = new int[][]{{0, 0, 0, 96, 56, -48, -28}, {0, 96, 16, 96, 40, -48, -12}, {0, 0, 0, 96, 56, -48, -28}, {0, 96, 0, 16, 16, -8, -8}, {0, 112, 0, 16, 16, -8, -8}, {0, 96, 0, 16, 16, -8, -8}};
   private static final int[] i = new int[]{20, 20, 22, 24, 26, 28, 26, 24, 22, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -14, -14, -14, -14, -14};
   private static final int[] j = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
   private static final int[][] k = new int[][]{{4, 3, 4, -1}};
   private static final int[] l = new int[]{-8, -28, -47, -28, -8};
   private static final int[][] m = new int[][]{{0, 0, 0, 32, 48, -16, -40}, {0, 0, 48, 32, 32, -16, 0}, {0, 0, 48, 32, 32, -16, -8}, {0, 0, 48, 32, 32, -16, -16}, {0, 0, 48, 32, 32, -16, -24}};
   private static final int[] n = new int[]{-256, -2048, 256, -2048, -224, -1792, 224, -1792, -192, -1536, 192, -1536, -160, -1280, 160, -1280, -128, -1024, 128, -1024};
   private static final int[][] o = new int[][]{{0, 0, 0, 16, 16, -8, -8}, {0, 16, 0, 16, 16, -8, -8}, {0, 0, 16, 16, 16, -8, -8}, {0, 16, 16, 16, 16, -8, -8}, {0, 0, 32, 16, 16, -8, -8}, {0, 16, 32, 16, 16, -8, -8}, {0, 0, 48, 16, 16, -8, -8}, {0, 16, 48, 16, 16, -8, -8}, {0, 0, 64, 16, 16, -8, -8}, {0, 16, 64, 16, 16, -8, -8}};
   private static final int[][] p = new int[][]{{0, 0, 48, 16, 16, -8, -8}, {0, 16, 48, 16, 16, -8, -8}, {0, 0, 64, 16, 16, -8, -8}, {0, 16, 64, 16, 16, -8, -8}};
   private static final int[] q = new int[]{36, 0, 32, 1, 24, 2, 16, 3, 8, 4};
   private static final int[][] r = new int[][]{{0, 0, 0, 24, 48, -12, -24}, {0, 24, 0, 24, 48, -12, -24}, {0, 0, 48, 24, 24, -12, 0}, {0, 24, 48, 24, 24, -12, 0}, {0, 48, 0, 16, 32, -8, -16}, {0, 48, 32, 16, 32, -8, -16}};
   private static final int[][] s = new int[][]{{10, 0, 1, -1}, {10, 2, 3, -1}};
   private static final int[] t = new int[]{4, 4, 16, 18};
   private static final int[][] u = new int[][]{{0, 0, 0, 24, 48, -12, -24}, {0, 24, 0, 24, 48, -12, -24}, {0, 0, 48, 24, 24, -12, -12}, {0, 24, 48, 24, 24, -12, -12}, {0, 48, 0, 16, 32, -16, -16}, {0, 48, 32, 16, 32, -16, -16}};
   private static final int[][] v = new int[][]{{0, 0, 0, 16, 16, -8, -8}, {0, 0, 0, 16, 16, -8, -8}, {0, 0, 0, 16, 16, -8, -8}, {0, 16, 0, 16, 16, -8, -8}, {0, 32, 0, 16, 16, -8, -8}, {0, 16, 0, 16, 16, -8, -8}};
   private static final int[][] w = new int[][]{{16, 0, -1}, {16, 1, 2, -2, 1}};
   private static final int[][] x = new int[][]{{6, 3, 4, -1}, {6, 3, 4, -1}};
   private static final int[][] y = new int[][]{{0, 48, 0, 24, 16, -12, -8}, {0, 32, 0, 16, 16, -8, -8}, {0, 0, 0, 32, 16, -16, -8}, {0, 0, 16, 8, 8, -4, -4}, {0, 8, 16, 8, 8, -4, -4}, {0, 16, 16, 8, 8, -4, -4}, {0, 24, 16, 8, 8, -4, -4}};
   private static final int[] z = new int[]{4, 4, 16, 0};
   private static final int[][] A = new int[][]{{0, 48, 0, 24, 16, -12, -8}, {0, 32, 0, 16, 16, -8, -8}, {0, 0, 0, 32, 16, -16, -8}, {0, 0, 16, 8, 8, -4, -4}, {0, 8, 16, 8, 8, -4, -4}, {0, 16, 16, 8, 8, -4, -4}, {0, 24, 16, 8, 8, -4, -4}};
   private static final int[] B = new int[]{15, 0, 15, -1, 15, -1, 15, -2, 15, -3, 15, -4, 14, -4, 14, -5, 14, -6, 14, -6, 13, -7, 13, -8, 12, -8, 12, -9, 12, -10, 11, -10, 11, -11, 10, -11, 10, -12, 9, -12, 8, -12, 8, -13, 7, -13, 6, -14, 6, -14, 5, -14, 4, -14, 4, -15, 3, -15, 2, -15, 1, -15, 1, -15};
   private static final int[] C = new int[]{132, 4, 4, 152};
   private static final int[][] D = new int[][]{{4, 3, 4, 5, 6, -1}};
   private static final int[] E = new int[]{36, 32, 28, 26, 24};
   private static final int[] F = new int[]{128, -256, 256, -128, 128};
   private static final int[] G = new int[]{30, 24, 18, 12, 6};

   public HillTopAction(int var1, int var2) {
      super.classType = 8;
      this.setType(var1, var2);
   }

   public void setType(int var1, int var2) {
      super.m_Actno = var1;
      HillTopAction var3;
      switch(super.m_Actno) {
      case 20:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(20);
         var3.m_Patbase_Table = h;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 5);
         return;
      case 22:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(22);
         var3.m_Patbase_Table = c;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, g);
         return;
      case 47:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(47);
         var3.m_Patbase_Table = m;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 7);
         return;
      case 48:
         (var3 = this).m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         return;
      case 146:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(146);
         var3.m_Patbase_Table = r;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 4);
         return;
      case 147:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(146);
         var3.m_Patbase_Table = u;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         return;
      case 149:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(149);
         var3.m_Patbase_Table = v;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 8);
         return;
      case 150:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(150);
         var3.m_Patbase_Table = y;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         var3.m_ReserveObj = new Action[8];
         return;
      case 151:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(150);
         var3.m_Patbase_Table = A;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 7);
         var3.m_ReserveObj = new Action[3];
      default:
      }
   }

   public void update(State var1) {
      Action var2;
      int var3;
      Action var4;
      Action var5;
      HillTopAction var8;
      int var9;
      int var11;
      int var19;
      Action var22;
      switch(super.m_Actno) {
      case 20:
         var9 = (var8 = this).m_Userflag & 255;
         switch(var8.m_R_No0) {
         case 0:
            var8.m_R_No0 += 2;
            var8.m_Sproffset = 966;
            var8.m_Actflg |= 4;
            var8.m_Sprpri = 4;
            var8.m_Sprhsize = 48;
            var8.m_Reserve[0] = var8.m_Xposi;
            if (var9 == 0 && (var2 = var1.insertAction(var8, var8.m_Actno)) != null) {
               var2.m_Actno = 20;
               var2.m_R_No0 = 6;
               var2.m_Xposi = var8.m_Xposi;
               var2.m_Yposi = var8.m_Yposi;
               var2.m_Cddat = var8.m_Cddat;
               var2.m_ReserveObj = var8;
            }

            if ((var8.m_Cddat & 1) != 0) {
               var8.m_Patno = 2;
            }

            var8.m_Reserve[4] = var8.m_Patno;
         case 2:
            var11 = var8.m_Reserve[4];
            if ((var8.m_Cddat & 8) != 0) {
               var11 = 2;
               var2 = var1.getSonicAction();
               if ((var3 = var8.m_Xposi - var2.m_Xposi) < 0) {
                  var3 = -var3;
                  var11 = 0;
               }

               if (8 > var3) {
                  var11 = 1;
               }

               if ((var8.m_Cddat & 16) != 0) {
                  byte var25 = 2;
                  if ((var22 = var1.getTailsAction()) != null) {
                     if ((var3 = var8.m_Xposi - var22.m_Xposi) < 0) {
                        var3 = -var3;
                        var25 = 0;
                     }

                     if (8 > var3) {
                        var25 = 1;
                     }

                     if ((var11 += var25) == 3) {
                        ++var11;
                     }

                     var11 >>= 1;
                  }
               }
            } else if ((var8.m_Cddat & 16) != 0) {
               var11 = 2;
               if ((var2 = var1.getTailsAction()) != null) {
                  if ((var3 = var8.m_Xposi - var2.m_Xposi) < 0) {
                     var3 = -var3;
                     var11 = 0;
                  }

                  if (8 > var3) {
                     var11 = 1;
                  }
               }
            } else {
               var2 = var1.getSonicAction();
               if ((var22 = var1.getTailsAction()) != null) {
                  var3 = var2.m_Yspeed;
                  int var27 = var22.m_Yspeed;
                  if (var3 <= var27) {
                     var3 = var27;
                  }

                  if (var3 != 0) {
                     var8.m_Reserve[2] = var3;
                  }
               }
            }

            var3 = var8.m_Patno;
            if (var11 != var3) {
               if (var11 > var3) {
                  var3 += 2;
               }

               --var3;
               var8.m_Patno = var3;
               var8.m_Reserve[4] = var11;
               var8.m_Actflg &= -2;
               if ((var8.m_Patno & 2) != 0) {
                  var8.m_Actflg |= 1;
               }
            }

            if ((var8.m_Patno & 1) == 0) {
               ((GameState)var1).rideChkSub_t(var8.m_Xposi, var8.m_Yposi, var8.m_Sprhsize, 0, 0, 8, var8, i);
            } else {
               ((GameState)var1).rideChkSub_t(var8.m_Xposi, var8.m_Yposi, var8.m_Sprhsize, 0, 0, 8, var8, j);
            }
         case 1:
         case 3:
         case 4:
         case 5:
         case 7:
         case 9:
         default:
            break;
         case 6:
            var8.m_R_No0 += 2;
            var8.m_Sproffset = 990;
            var8.m_Actflg |= 4;
            var8.m_Sprpri = 4;
            var8.m_Colino = 139;
            var8.m_Sprhsize = 12;
            var8.m_Reserve[0] = var8.m_Xposi;
            var8.m_Xposi += 40;
            var8.m_Yposi += 16;
            var8.m_Reserve[1] = var8.m_Yposi;
            if ((var8.m_Cddat & 1) != 0) {
               var8.m_Xposi -= 80;
               var8.m_Reserve[4] = 2;
            }
         case 8:
            var8.patchg(k);
            var8.a(var1.getSonicAction());
            if ((var2 = (Action)var8.m_ReserveObj) != null) {
               if ((var3 = var8.m_Reserve[4] - var2.m_Reserve[4]) != 0) {
                  if (var3 < 0) {
                     var3 = -var3;
                  }

                  short var16 = -2072;
                  short var20 = -276;
                  if (var3 != 1) {
                     var16 = -2800;
                     var20 = -204;
                     if (2304 <= var2.m_Reserve[2]) {
                        var16 = -3584;
                        var20 = -160;
                     }
                  }

                  var8.m_Yspeed = var16;
                  var8.m_Xspeed = var20;
                  if (var8.m_Xposi - var8.m_Reserve[0] < 0) {
                     var8.m_Xspeed = -var8.m_Xspeed;
                  }

                  var8.m_R_No0 += 2;
                  var8.b(var1);
               } else {
                  var3 = var2.m_Patno;
                  byte var24 = 40;
                  if (var8.m_Xposi - var8.m_Reserve[0] < 0) {
                     var24 = -40;
                     var3 += 2;
                  }

                  var8.m_Yposi = var8.m_Reserve[1] + l[var3];
                  var8.m_Xposi = var8.m_Reserve[0] + var24;
                  var8.setYposi(var8.getYposi() & -65536);
                  var8.setXposi(var8.getXposi() & -65536);
               }
            }
            break;
         case 10:
            var8.patchg(k);
            var8.b(var1);
         }

         var8.frameOutCheckX(var1, var8.m_Reserve[0]);
         return;
      case 22:
         var9 = (var8 = this).m_Userflag & 255;
         switch(var8.m_R_No0) {
         case 0:
            var8.m_R_No0 += 2;
            var8.m_Sproffset = 32768;
            var8.m_Actflg |= 4;
            var8.m_Sprhsize = 32;
            var8.m_Patno = 0;
            var8.m_Sprpri = 1;
            var8.m_Reserve[0] = var8.m_Xposi;
            var8.m_Reserve[e] = var8.m_Yposi;
            var8.m_Sprvsize = 64;
            var8.m_Actflg |= 16;
            var8.m_Reserve[f] = var9 << 3;
         case 2:
            var3 = var8.m_Xposi;
            State var17 = var1;
            HillTopAction var12 = var8;
            label416:
            switch(var8.m_R_No1) {
            case 0:
               if ((var8.m_Cddat & 24) != 0) {
                  var8.m_R_No1 += 2;
                  var8.m_Xspeed = 512;
                  if ((var8.m_Cddat & 1) != 0) {
                     var8.m_Xspeed = -var8.m_Xspeed;
                  }

                  var8.m_Yspeed = 256;
               }
            case 1:
            case 3:
            default:
               break;
            case 2:
               var8.speedSet2();
               if (--var8.m_Reserve[f] > 0) {
                  break;
               }

               var8.m_R_No1 += 2;
               var8.m_Patno = 2;
               var8.m_Xspeed = 0;
               var8.m_Yspeed = 0;
               var19 = 0;

               while(true) {
                  if (var19 >= 2) {
                     break label416;
                  }

                  Action var26;
                  if ((var26 = var17.insertAction(var12, 28)) != null) {
                     var26.m_Actno = 28;
                     var9 = var19 == 0 ? -19 : 19;
                     if ((var12.m_Actflg & 1) != 0) {
                        var9 = -var9;
                     }

                     var26.m_Xposi = var12.m_Xposi + var9;
                     var26.m_Yposi = var12.m_Yposi;
                     var26.m_Actflg = var12.m_Actflg;
                     var26.m_Userflag = var19;
                  }

                  ++var19;
               }
            case 4:
               var8.speedSet2();
               var8.m_Yspeed += 56;
               var9 = GameState.m_ScrALim_Down + 224;
               if (var8.m_Yposi > var9) {
                  if ((var8.m_Cddat & 24) != 0) {
                     if ((var8.m_Cddat & 8) != 0) {
                        var22 = var1.getSonicAction();
                        var8.m_Cddat &= -9;
                        var22.m_Cddat &= -9;
                        var22.m_Cddat |= 2;
                     }

                     if ((var8.m_Cddat & 16) != 0) {
                        var22 = var1.getTailsAction();
                        var8.m_Cddat &= -17;
                        if (var22 != null) {
                           var22.m_Cddat &= -9;
                           var22.m_Cddat |= 2;
                        }
                     }
                  }

                  var8.m_Xposi = 16384;
               }
            }

            ((GameState)var1).rideChkSub(var3, var8.m_Yposi, var8.m_Sprhsize, 0, 0, -40, var8);
            var8.frameOutCheck(var1);
         default:
            return;
         }
      case 47:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.m_R_No0 += 2;
            var8.m_Sproffset = 49152;
            var8.m_Actflg = 4;
            var8.m_Sprhsize = 16;
            var8.m_Sprpri = 4;
            var9 = var8.m_Userflag & 30;
            var8.m_Sprvsize = q[var9];
            var8.m_Patno = q[var9 + 1];
            var8.m_Reserve[6] = var8.m_Patno;
            var8.m_Sprvsize = 32;
            var8.m_Actflg |= 16;
         case 2:
            var8.m_Reserve[5] = GameState.m_EmyScoreCnt;
            var4 = var1.getSonicAction();
            var8.m_Reserve[1] = var4.m_Mstno;
            if ((var5 = var1.getTailsAction()) != null) {
               var8.m_Reserve[2] = var5.m_Mstno;
            }

            ((GameState)var1).atariRideSub(var8.m_Xposi, var8.m_Yposi, var8.m_Sprhsize + 11, var8.m_Sprvsize, var8.m_Sprvsize + 1, 8, var8);
            if ((var9 = var8.m_Cddat & 24) == 0) {
               var8.frameOutCheck(var1);
               return;
            }

            if (var9 != 24) {
               if ((var3 = var9 & 8) != 0) {
                  if (var8.m_Reserve[1] != 2 || (var8.m_Userflag & 128) == 0 && var4.m_Rideonwk != 16384) {
                     var4.m_Rideonwk = 4096;
                     var4.m_Hitcolwk = 8192;
                     var8.frameOutCheck(var1);
                     return;
                  }

                  var8.a(var4, 0, 0);
               } else {
                  if ((var9 &= 16) == 0) {
                     var8.frameOutCheck(var1);
                     return;
                  }

                  if (var5 != null && (var8.m_Reserve[2] != 2 || (var8.m_Userflag & 128) == 0 && var5.m_Rideonwk != 16384)) {
                     var5.m_Rideonwk = 4096;
                     var5.m_Hitcolwk = 8192;
                     var8.frameOutCheck(var1);
                     return;
                  }
               }
            } else {
               if (var8.m_Reserve[1] != 2 || (var8.m_Userflag & 128) == 0 && var4.m_Rideonwk != 16384) {
                  var4.m_Rideonwk = 4096;
                  var4.m_Hitcolwk = 8192;
                  if (var5 != null && (var8.m_Reserve[2] != 2 || (var8.m_Userflag & 128) == 0 && var5.m_Rideonwk != 16384)) {
                     var5.m_Rideonwk = 4096;
                     var5.m_Hitcolwk = 8192;
                     var8.frameOutCheck(var1);
                     return;
                  }
               }

               var8.a(var4, 2, var8.m_Reserve[1]);
               var8.a(var5, 2, var8.m_Reserve[2]);
            }

            GameState.m_EmyScoreCnt = var8.m_Reserve[5];
            var8.m_Cddat &= 231;
            ++var8.m_Patno;
            switch(var8.m_Reserve[6]) {
            case 0:
               var8.a(var1, o, n);
               break;
            default:
               var8.a(var1, p, n);
            }

            CommonAction.tensuusetsub(var1, var8);
            break;
         case 1:
         case 3:
         default:
            return;
         case 4:
         }

         var8.speedSet2();
         var8.m_Yspeed += 24;
         if ((var8.m_Actflg & 128) == 0) {
            var8.frameOut(var1);
         }

         return;
      case 48:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.m_R_No0 += 2;
            var8.m_Reserve[1] = var8.m_Yposi;
            var8.m_Reserve[0] = var8.m_Xposi;
            var9 = var8.m_Userflag & 255;
            var8.m_Sprhsize = b[var9 >> 1];
            if (6 <= var9) {
               if (var9 == 6) {
                  if (896 <= State.m_ScrA_V_Posit) {
                     return;
                  }
               } else if (896 <= State.m_ScrA_V_Posit) {
                  if ((GameState.m_FlagWorkCnt[2 + var8.m_Cdsts] & 1) != 0) {
                     int[] var10000 = GameState.m_FlagWorkCnt;
                     int var10001 = 2 + var8.m_Cdsts;
                     var10000[var10001] &= -129;
                  }

                  return;
               }
            }
         case 2:
            var8.m_Yposi = var8.m_Reserve[1] + GameState.m_ScrB_V_Offset;
            var5 = var1.getSonicAction();
            switch(var8.m_Userflag) {
            case 0:
            case 2:
               ((GameState)var1).atariRideSub2(var8.m_Xposi, var8.m_Yposi, 203, 128, 129, 8, var8, var5);
               ((GameState)var1).fColRideChk(var8);
            case 1:
            case 3:
            case 5:
            case 7:
            default:
               break;
            case 4:
               var8.m_Sprvsize = 121;
               ((GameState)var1).atariRideSub2(var8.m_Xposi, var8.m_Yposi, 203, 120, 121, 8, var8, var5);
               ((GameState)var1).fColRideChk(var8);
               var8.a(var1);
               break;
            case 6:
               var8.m_Sprvsize = 121;
               ((GameState)var1).atariRideSub2(var8.m_Xposi, var8.m_Yposi, 235, 120, 121, 8, var8, var5);
               ((GameState)var1).fColRideChk(var8);
               var8.a(var1);
               break;
            case 8:
               var8.m_Sprvsize = 0;
               ((GameState)var1).atariRideSub_t(203, 46, 0, 8, var8, var5, a);
               ((GameState)var1).fColRideChk(var8);
            }

            if (!GameState.m_ScrollMode) {
               var8.frameOutCheckN(var1);
            }

            return;
         default:
            return;
         }
      case 146:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.y_Emy_Init(t);
            var8.m_R_No0 += 2;
            var8.m_Reserve[0] = 64;
            var8.m_Xspeed = 128;
            var8.m_Cddat ^= 1;
            return;
         case 2:
            if (var8.c(var1) == 0 && --var8.m_Reserve[0] < 0) {
               var8.m_R_No0 += 2;
               var8.m_Reserve[0] = 16;
               var8.frameOutCheck(var1);
            } else {
               var8.speedSet2();
               var8.patchg(s);
               var8.frameOutCheck(var1);
            }

            return;
         case 4:
            if (var8.c(var1) == 0 && --var8.m_Reserve[0] < 0) {
               var8.m_R_No0 -= 2;
               var8.m_Reserve[0] = 64;
               var8.m_Xspeed = -var8.m_Xspeed;
               var8.m_Cddat ^= 1;
            }

            var8.frameOutCheck(var1);
            return;
         case 6:
            if ((var9 = var8.m_Reserve[2]) == 8) {
               Action var21;
               if ((var21 = var1.insertAction(var8, 147)) != null) {
                  var8.m_Reserve[1] = 1;
                  var21.m_Actno = 147;
                  var21.m_Userflag = var8.m_Userflag;
                  var21.m_ReserveObj = var8;
                  var21.m_Xposi = var8.m_Xposi;
                  var21.m_Yposi = var8.m_Yposi;
                  var21.m_Patno = 4;
                  var8.m_Patno = 2;
                  var8.m_Mstno = 1;
               }

               var8.m_R_No0 = var8.m_Reserve[3];
            } else {
               --var9;
               var8.m_Reserve[2] = var9;
            }

            var8.frameOutCheck(var1);
         case 1:
         case 3:
         case 5:
         default:
            return;
         }
      case 147:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.y_Emy_Init(t);
            var8.m_R_No0 += 2;
            var8.m_Actflg |= 128;
            var8.m_Colino |= 128;
            var4 = (Action)var8.m_ReserveObj;
            byte var14 = 0;
            if (var4 != null) {
               var9 = var4.m_Actflg & 3;
               var8.m_Actflg |= var9;
               var14 = 2;
               if ((var9 & 2) == 0) {
                  var14 = -2;
               }
            }

            var8.m_Yspeed = var14 << 8;
            return;
         case 2:
            if ((var8.m_Actflg & 128) == 0) {
               var8.frameOut(var1);
               return;
            } else {
               var8.m_Actflg ^= 1;
               var8.speedSet2();
               var8.frameOutCheck(var1);
            }
         default:
            return;
         }
      case 149:
         var1 = var1;
         var8 = this;
         switch(super.m_R_No0) {
         case 0:
            super.m_Sproffset = 0;
            super.m_Actflg |= 4;
            super.m_Sprpri = 4;
            super.m_Colino = 11;
            super.m_Sprhsize = 12;
            super.m_Xspeed = -64;
            var3 = 0;
            Action[] var13 = new Action[4];

            for(var9 = 0; var9 < 4; ++var9) {
               var13[var9] = var1.insertAction(var8, var8.m_Actno);
               if (var13[var9] != null) {
                  int var10002 = var8.m_Reserve[1]++;
                  var13[var9].m_Actno = var8.m_Actno;
                  var13[var9].m_R_No0 = 6;
                  var13[var9].m_Patbase = var8.m_Patbase;
                  var13[var9].m_Sproffset = var8.m_Sproffset;
                  var13[var9].m_Actflg |= 4;
                  var13[var9].m_Sprpri = 4;
                  var13[var9].m_Sprhsize = 8;
                  var13[var9].m_Patno = 3;
                  var13[var9].m_Colino = 152;
                  var13[var9].m_Direc = var3;
                  var3 += 64;
                  var13[var9].m_ReserveObj = var8;
               }
            }

            var8.m_Reserve[0] = (var8.m_Cddat & 1) == 0 ? 1 : -1;
            var8.m_R_No0 = var8.m_Userflag & 255;
            var8.m_R_No0 += 2;
            var8.m_Xspeed = (var8.m_Cddat & 1) == 0 ? -64 : 64;
            return;
         case 1:
         case 3:
         case 5:
         case 7:
         default:
            return;
         case 2:
            if ((var9 = (var5 = var1.getSonicAction()).m_Xposi - super.m_Xposi) < 0) {
               var9 = -var9;
            }

            if (160 > var9) {
               if ((var9 = var5.m_Yposi - super.m_Yposi) < 0) {
                  var9 = -var9;
               }

               if (80 > var9) {
                  super.m_Mstno = 1;
               }
            }

            this.speedSet2();
            this.patchg(w);
            super.m_Patno &= 3;
            this.frameOutCheck(var1);
            return;
         case 4:
            this.speedSet2();
            this.patchg(w);
            this.frameOutCheck(var1);
            return;
         case 6:
            this.patchg(x);
            if ((var5 = (Action)super.m_ReserveObj) == null) {
               this.frameOut(var1);
               return;
            } else if (var5.m_Actno != 149) {
               this.frameOut(var1);
               return;
            } else {
               if (var5.m_Patno == 2 && (super.m_Direc & 255) == 64) {
                  super.m_R_No0 += 2;
                  super.m_Mstno = 0;
                  if (--var5.m_Reserve[1] == 0) {
                     var5.m_R_No0 += 2;
                  }

                  super.m_Xspeed = (var5.m_Cddat & 1) == 0 ? -512 : 512;
               } else {
                  var9 = Utilities.sinset(super.m_Direc);
                  var19 = Utilities.cosset(super.m_Direc);
                  super.m_Xposi = var5.m_Xposi + (var19 >> 4);
                  super.m_Yposi = var5.m_Yposi + (var9 >> 4);
                  super.m_Direc += var5.m_Reserve[0];
               }

               return;
            }
         case 8:
            this.speedSet2();
            if ((super.m_Actflg & 128) != 0) {
               this.patchg(x);
               return;
            }

            this.frameOut(var1);
            return;
         }
      case 150:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.y_Emy_Init(z);
            var8.m_R_No0 += 2;
            var8.m_Patno = 2;
            var8.m_Xspeed = -32;
            var8.m_Reserve[0] = 128;
            return;
         case 2:
            var8._chk_pl_dir(var1);
            var9 = var8.pldir_d0;
            var3 = var8.pldir_d2;
            var3 += 96;
            if (256 > var3) {
               var8.a(var1, var9);
            }

            var11 = var8.m_Xposi;
            if (--var8.m_Reserve[0] < 0) {
               var8.m_Reserve[0] = 128;
               var8.m_Xspeed = -var8.m_Xspeed;
               var8.m_Actflg ^= 1;
            }

            ((GameState)var1).atariRideSub(var11, var8.m_Yposi, 27, 8, 17, 8, var8);
            var8.frameOutCheck(var1);
            return;
         case 4:
            var8._chk_pl_dir(var1);
            var9 = var8.pldir_d0;
            var3 = var8.pldir_d2;
            var3 += 96;
            if (256 > var3) {
               var8.a(var1, var9);
            }

            ((GameState)var1).atariRideSub(var8.m_Xposi, var8.m_Yposi, 27, 8, 8, 8, var8);
            var8.frameOutCheck(var1);
            return;
         case 6:
            ((GameState)var1).atariRideSub(var8.m_Xposi, var8.m_Yposi, 27, 8, 8, 8, var8);
            var8.frameOutCheck(var1);
         case 1:
         case 3:
         case 5:
         default:
            return;
         }
      case 151:
         switch((var8 = this).m_R_No0) {
         case 0:
            if ((var8.m_Userflag & 128) != 0) {
               var8.y_Emy_Init(C);
               var8.m_R_No0 = 10;
               var8.m_Userflag &= -129;
               var8.speedSet2();
               return;
            }

            var8.y_Emy_Init(z);
            var8.m_R_No0 += 2;
            var8.m_Sprhsize = 8;
            byte var18 = 40;
            if ((var8.m_Actflg & 1) == 0) {
               var18 = -24;
            }

            var8.m_Xposi += var18;
            var8.m_Yposi += 16;
            var8.m_Reserve[5] = 1;
            Action[] var10 = (Action[])((Action[])((Action[])((Action[])var8.m_ReserveObj))[0].m_ReserveObj);
            var8.m_Colino = 11;
            if ((var9 = var8.m_Reserve[2]) != 8) {
               var8.m_Patno = 1;
               var8.m_Colino = 139;
               ((Action[])((Action[])var8.m_ReserveObj))[1] = var10[(var9 >> 1) + 1];
            }

            ((Action[])((Action[])var8.m_ReserveObj))[2] = var10[4];
            var9 >>= 1;
            var8.m_Reserve[0] = G[var9];
            var8.m_Reserve[6] = var9;
            return;
         case 1:
         case 3:
         case 5:
         case 7:
         case 9:
         default:
            break;
         case 2:
            if (--var8.m_Reserve[0] < 0) {
               var8.m_R_No0 += 2;
               var8.m_Xspeed = -288;
               var8.m_Yspeed = -512;
               var9 = -(var8.m_Reserve[2] - 8) >> 1;
               var8.m_Reserve[0] = G[var9];
               var8.frameOutCheck(var1);
               return;
            }

            var8.a();
            var8.frameOutCheck(var1);
            return;
         case 4:
            boolean var15 = false;
            var8.m_Xspeed += 16;
            if (--var8.m_Reserve[0] < 0) {
               var8.m_R_No0 += 2;
               var8.m_Xspeed = 0;
               var8.m_Yspeed = 0;
               var8.m_Reserve[0] = 32;
               var9 = var8.m_Reserve[2] >> 1;
               var8.m_Reserve[1] = E[var9];
               var8.frameOutCheck(var1);
               return;
            }

            var8.a();
            var8.speedSet2();
            var8.frameOutCheck(var1);
            return;
         case 6:
            var8.a();
            if (var8.m_Reserve[2] == 8 && --var8.m_Reserve[0] < 0) {
               var8.m_Reserve[0] = 127;
               if ((var2 = var1.insertAction(151)) != null) {
                  var2.m_Actno = 151;
                  var2.m_Patno = 3;
                  var2.m_Userflag = 144;
                  var2.m_Xposi = var8.m_Xposi;
                  var2.m_Yposi = var8.m_Yposi;
                  short var6 = 256;
                  byte var7 = 16;
                  if ((var8.m_Actflg & 1) == 0) {
                     var6 = -256;
                     var7 = -16;
                  }

                  var2.m_Xspeed = var6;
                  var2.m_Xposi += var7;
                  var2.m_Yposi += 4;
                  var2.m_Yspeed = 128;
               }
            }

            if ((var8.m_Reserve[6]++ & 3) == 0) {
               var9 = var8.m_Reserve[1];
               var19 = var8.m_Reserve[5];
               var9 += var19;
               var8.m_Reserve[1] = var9;
               var9 -= 24;
               if (var9 <= 0 || 16 <= var9) {
                  var8.m_Reserve[5] = -var8.m_Reserve[5];
               }

               if ((var4 = ((Action[])((Action[])var8.m_ReserveObj))[1]) != null) {
                  var19 = var9 = var8.m_Reserve[1] & 127;
                  var9 += var9 &= 31;
                  int var23 = B[var9];
                  var9 = B[var9 + 1];
                  switch(var19 >> 4 & 6) {
                  case 0:
                  case 1:
                  case 3:
                  case 5:
                  default:
                     break;
                  case 2:
                     var3 = var23;
                     var23 = var9;
                     var9 = -var3;
                     break;
                  case 4:
                     var23 = -var23;
                     var9 = -var9;
                     break;
                  case 6:
                     var3 = var9;
                     var9 = var23;
                     var23 = -var3;
                  }

                  var4.m_Xposi = var8.m_Xposi + var23;
                  var3 = (var8.m_Yposi & 255) + var9;
                  var4.m_Yposi = (var4.m_Yposi & -256) + (var3 & 255);
               }
            }

            var8.frameOutCheck(var1);
            return;
         case 8:
            if ((var8.m_Actflg & 128) == 0) {
               var8.frameOut(var1);
               return;
            }

            var8.speedSet();
            var8.frameOutCheck(var1);
            return;
         case 10:
            if ((var8.m_Actflg & 128) == 0) {
               var8.frameOut(var1);
               return;
            }

            var8.speedSet2();
            var8.patchg(D);
         }
      }

   }

   public void render(Graphics var1) {
      if (super.m_Actno == 48) {
         var1.setColor(16711680);
         short var2 = 0;
         short var3 = 0;
         switch(super.m_Userflag) {
         case 2:
            super.m_Sprvsize = 129;
            var2 = 203;
            var3 = 128;
         case 3:
         case 5:
         case 7:
         default:
            break;
         case 4:
            super.m_Sprvsize = 121;
            var2 = 203;
            var3 = 120;
            break;
         case 6:
            super.m_Sprvsize = 121;
            var2 = 235;
            var3 = 120;
            break;
         case 8:
            super.m_Sprvsize = 0;
            var2 = 203;
            var3 = 46;
         }

         var1.fillRect(super.m_Xposi, super.m_Yposi, var2, var3);
      }

   }

   public static void prepareImages() {
      CommonAction.loadImages(50);
      CommonAction.loadImages(22);
      CommonAction.loadImages(20);
      CommonAction.loadImages(47);
      CommonAction.loadImages(24);
      CommonAction.loadImages(150);
      CommonAction.loadImages(146);
      CommonAction.loadImages(149);
   }

   public static void disposeImages() {
      CommonAction.unloadImage(50);
      CommonAction.unloadImage(22);
      CommonAction.unloadImage(20);
      CommonAction.unloadImage(47);
      CommonAction.unloadImage(146);
      CommonAction.unloadImage(149);
      CommonAction.unloadImage(150);
      CommonAction.unloadImage(24);
   }

   private void a(State var1) {
      Action var2;
      if ((super.m_Cddat & 8) != 0) {
         var2 = var1.getSonicAction();
         PlayerAction.pColPlay(var1, var2, this);
      }

      if ((super.m_Cddat & 16) != 0) {
         var2 = var1.getTailsAction();
         PlayerAction.pColPlay(var1, var2, this);
      }

   }

   private void a(Action var1) {
      if ((GameState.m_GameTimer >> 8 & 3) == 0) {
         super.m_Sproffset ^= 32;
      }

      super.m_Actflg &= 254;
      if (var1.m_Xposi - super.m_Xposi >= 0) {
         super.m_Actflg |= 1;
      }

   }

   private void b(State var1) {
      this.a(var1.getSonicAction());
      if (super.m_Yspeed < 0) {
         this.speedSet();
         if (super.m_Yposi >= super.m_Reserve[1] - 47) {
            this.speedSet();
         }

      } else {
         this.speedSet();
         Action var4;
         if ((var4 = (Action)super.m_ReserveObj) != null) {
            int var2 = var4.m_Patno;
            if (super.m_Xposi - super.m_Reserve[0] < 0) {
               var2 += 2;
            }

            int var3 = super.m_Reserve[1] + l[var2];
            if (super.m_Yposi >= var3) {
               byte var5 = 2;
               if (super.m_Xspeed >= 0) {
                  var5 = 0;
               }

               var4.m_Reserve[4] = var5;
               super.m_Reserve[4] = var5;
               if (var5 != var4.m_Patno) {
                  if ((var4.m_Cddat & 8) != 0) {
                     var4.m_Cddat &= -9;
                     this.b(var1.getSonicAction());
                  }

                  if ((var4.m_Cddat & 16) != 0) {
                     var4.m_Cddat &= -17;
                     this.b(var1.getTailsAction());
                  }
               }

               super.m_Xspeed = 0;
               super.m_Yspeed = 0;
               super.m_R_No0 -= 2;
            }
         }

      }
   }

   private void b(Action var1) {
      if (var1 != null) {
         var1.m_Yspeed = -super.m_Yspeed;
         var1.m_Cddat |= 2;
         var1.m_Cddat &= -9;
         var1.m_JumpFlag = 0;
         var1.m_Mstno = 16;
         var1.m_R_No0 = 2;
      }

   }

   private void a(Action var1, int var2, int var3) {
      if (var1 != null) {
         if (var2 == 2) {
            if (var3 == 2) {
               var2 = 0;
            } else {
               var2 = 1;
            }
         }

         if (var2 == 0) {
            var1.m_Cddat |= 4;
            var1.m_Sprvs = 14;
            var1.m_Sprhs = 7;
            var1.m_Mstno = 2;
         }

         var1.m_Cddat |= 2;
         var1.m_Cddat &= -9;
         var1.m_R_No0 = 2;
      }
   }

   private void a(State var1, int[][] var2, int[] var3) {
      int var7 = 0;
      int var4 = var2.length;
      super.m_Actflg |= 32;
      super.m_Actflg &= -65;
      int var5 = super.m_Actno;
      int var6 = super.m_Actflg;

      for(int var9 = 0; var9 < var4; ++var9) {
         Object var8;
         if ((var8 = var9 == 0 ? this : var1.insertAction(this, super.m_Actno)) != null) {
            ((Action)var8).m_R_No0 = 4;
            ((Action)var8).m_Actno = var5;
            ((Action)var8).m_Patbase_Table = var2;
            ((Action)var8).m_Patno = var9;
            ((Action)var8).m_Actflg = var6;
            ((Action)var8).m_Xposi = super.m_Xposi;
            ((Action)var8).m_Yposi = super.m_Yposi;
            ((Action)var8).m_Sproffset = super.m_Sproffset;
            ((Action)var8).m_Sprpri = super.m_Sprpri;
            ((Action)var8).m_Sprhsize = super.m_Sprhsize;
            ((Action)var8).m_Sprvsize = super.m_Sprvsize;
            ((Action)var8).m_Xspeed = var3[var7++];
            ((Action)var8).m_Yspeed = var3[var7++];
         }
      }

   }

   private int c(State var1) {
      if (super.m_Reserve[1] == 0 && (super.m_Actflg & 128) != 0) {
         this._chk_pl_dir(var1);
         int var3 = super.pldir_d2;
         int var2 = super.pldir_d3;
         var3 += 32;
         if (64 > var3) {
            var2 += 128;
            if (256 > var2) {
               super.m_Reserve[3] = super.m_R_No0;
               super.m_R_No0 = 6;
               super.m_Reserve[2] = 16;
               return 1;
            }
         }
      }

      return 0;
   }

   private void a(State var1, int var2) {
      super.m_R_No0 = 6;
      if (var2 == 0) {
         super.m_Actflg &= -2;
      } else {
         super.m_Actflg |= 1;
      }

      super.m_Xspeed = 0;
      super.m_Yspeed = 0;
      var2 = 0;

      Action var4;
      for(int var3 = 0; var3 < 5 && (var4 = var1.insertAction(151)) != null; ++var3) {
         var4.m_Actno = 151;
         var4.m_Actflg = super.m_Actflg;
         var4.m_Userflag = super.m_Userflag;
         ((Action[])((Action[])var4.m_ReserveObj))[0] = this;
         var4.m_Reserve[2] = var2;
         var4.m_Xposi = super.m_Xposi;
         var4.m_Yposi = super.m_Yposi;
         ((Action[])((Action[])super.m_ReserveObj))[var3] = var4;
         var2 += 2;
      }

   }

   private void a() {
      boolean var1 = false;
      Action var2;
      if ((var2 = ((Action[])((Action[])super.m_ReserveObj))[2]) == null) {
         var1 = true;
      } else if (var2.m_Actno != 151) {
         var1 = true;
      }

      if (var1) {
         super.m_R_No0 = 8;
         int var3 = super.m_Reserve[2];
         super.m_Xspeed = F[var3 >> 1];
      }

   }
}
