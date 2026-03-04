package STH2P1;

import javax.microedition.lcdui.Graphics;

public class AquaticRuinAction extends Action {
   private static final int[][] a = new int[][]{{0, 0, 0, 56, 48, -28, -24}, {0, 0, 0, 56, 54, -28, -27}, {0, 0, 0, 56, 64, -28, -32}, {0, 0, 0, 56, 72, -28, -36}, {0, 0, 0, 56, 80, -28, -40}, {0, 0, 0, 56, 88, -28, -44}, {0, 0, 0, 56, 104, -28, -52}};
   private static final int[] b = new int[]{0, 0, 0, 0, 4, 4, 8, 8, 12, 12, 16, 16, 20, 20};
   private static final int[] c = new int[]{-512, -512, 512, -512, -448, -448, 448, -448, -384, -384, 384, -384, -320, -320, 320, -320, -256, -256, 256, -256, -192, -192, 192, -192, -128, -128, 128, -128};
   private static final int[][] d = new int[][]{{0, 0, 0, 28, 16, -14, -8}, {0, 28, 0, 28, 16, -24, -8}, {0, 0, 16, 28, 16, -14, -8}, {0, 28, 16, 28, 16, -24, -8}, {0, 0, 32, 28, 16, -14, -8}, {0, 28, 32, 28, 16, -24, -8}, {0, 0, 48, 28, 16, -14, -8}, {0, 28, 48, 28, 16, -24, -8}, {0, 0, 64, 28, 16, -14, -8}, {0, 28, 64, 28, 16, -24, -8}, {0, 0, 80, 28, 12, -14, -8}, {0, 28, 80, 28, 12, -24, -8}};
   private static final int[][] e = new int[][]{{0, 128, 0, 32, 8, -16, -4}, {0, 0, 0, 32, 16, -16, -8}, {0, 32, 0, 32, 16, -16, -8}, {0, 64, 0, 32, 16, -16, -8}, {0, 96, 0, 32, 16, -16, -8}};
   private static final int[][] f = new int[][]{{32, 1, -1}, {4, 1, 2, -1}, {8, 3, 4, -4, 4, 3, 1, -3, 0}};
   private static final int[][] g = new int[][]{{0, 0, 0, 56, 64, -28, -32}, {0, 8, 64, 40, 40, -20, -20}, {0, 8, 64, 40, 40, -20, -20}};
   private static final byte[] h = new byte[]{0, 1, -1, 1, 0, -1, 0, 1};
   private static final int[][] i = new int[][]{{0, 0, 0, 56, 104, -28, -52}};
   private static final int[][] j = new int[][]{{32, 8}, {28, 48}, {16, 16}, {16, 16}};
   private static final int[][] k = new int[][]{{0, 0, 24, 64, 16, -32, -8}, {0, 32, 0, 16, 16, -8, -8}, {0, 0, 0, 32, 24, -16, -12}};
   private static final int[][] l = new int[][]{{0, 0, 0, 8, 8, -4, -4}, {0, 0, 0, 8, 8, -4, -4}, {0, 8, 0, 8, 8, -4, -4}, {0, 24, 0, 16, 16, -8, -8}, {0, 24, 16, 16, 16, -8, -8}, {0, 0, 8, 24, 24, -12, -12}, {0, 0, 32, 32, 32, -16, -16}, {0, 32, 32, 32, 32, -16, -16}, {0, 48, 0, 16, 16, -8, -8}, {0, 48, 16, 16, 16, -8, -8}};
   private static final int[][] m = new int[][]{{16, 0, 1, 2, -4}, {16, 1, 2, 3, 4, -4}, {16, 2, 3, 4, 5, 6, -4}, {8, -4}, {8, -4}, {5, 6, 7, -4}, {16, 8, 9, -1}};
   private static final byte[] n = new byte[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -3, -3, -3, -3, -3, -3, -3, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -3, -3, -3, -3, -3, -3, -3, -2, -2, -2, -2, -2, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -3, -3, -3, -3, -3, -3, -3, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -3, -3, -3, -3, -3, -3, -3, -2, -2, -2, -2, -2, -1, -1, -1, -1, -1};
   private static final byte[] o = new byte[]{0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0};
   private static final int[][] p = new int[][]{{1, 0, 0, 32, 16, -16, -8}, {1, 32, 0, 16, 16, -8, -8}, {1, 48, 0, 8, 8, -4, -4}, {1, 48, 8, 8, 8, -4, -4}};
   private static final int[] q = new int[]{132, 4, 32, 0};
   private static final int[][] r = new int[][]{{1, -2}, {1, -1}, {-1, -2}, {-1, -1}};
   private static final int[][] s = new int[][]{{0, -20}, {16, -4}, {0, 12}, {-16, -4}};
   private static final int[][] t = new int[][]{{0, 0, 0, 32, 40, -16, -20}, {0, 32, 0, 32, 40, -16, -20}, {0, 64, 0, 32, 40, -16, -20}, {0, 96, 0, 32, 40, -16, -20}, {0, 128, 0, 32, 40, -16, -20}};
   private static final int[][] u = new int[][]{{4, 2, 3, 4, -1}, {8, 0, 1, -4}};
   private static final int[][] v = new int[][]{{8, 0, 1, -4}};
   private static final int[] w = new int[]{4, 5, 32, 2};
   private static final int[][] x = new int[][]{{0, 0, 0, 24, 16, -12, -8}, {0, 24, 0, 24, 16, -12, -8}};
   private static final int[] y = new int[]{4, 4, 12, 11};
   private static int[][] z = new int[][]{{4, 0, 1, -1}};
   private static final int[][] A = new int[][]{{0, 0, 0, 32, 24, -16, -12}, {0, 32, 0, 32, 24, -16, -12}};
   private static final int[][] B = new int[][]{{6, 0, 1, -1}};
   private static final int[] C = new int[]{4, 4, 16, 2};

   public AquaticRuinAction(int var1, int var2) {
      super.classType = 6;
      this.setType(var1, var2);
   }

   public void setType(int var1, int var2) {
      super.m_Actno = var1;
      AquaticRuinAction var3;
      switch(super.m_Actno) {
      case 34:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(34);
         var3.m_Patbase_Table = e;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         return;
      case 35:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(35);
         var3.m_Patbase_Table = g;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 4);
         return;
      case 36:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(36);
         var3.m_Patbase_Table = l;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 9);
         return;
      case 43:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(43);
         var3.m_Patbase_Table = a;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         return;
      case 130:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(130);
         var3.m_Patbase_Table = i;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 9);
         return;
      case 131:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(131);
         var3.m_Patbase_Table = k;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 4);
         var3.m_ReserveObj = new Action[4];
         return;
      case 140:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(140);
         var3.m_Patbase_Table = x;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         var3.m_Sprvsize = 8;
         var3.m_Sprhsize = 8;
         return;
      case 141:
      case 142:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(141);
         var3.m_Patbase_Table = t;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         return;
      case 143:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(143);
         var3.m_Patbase_Table = p;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         var3.m_Reserve[0] = 0;
         var3.m_Reserve[1] = 0;
         return;
      case 145:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(145);
         var3.m_Patbase_Table = A;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
      default:
      }
   }

   public void update(State var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      Action var6;
      int var8;
      int var9;
      Action var10;
      int var11;
      int var13;
      int var14;
      int var15;
      AquaticRuinAction var16;
      Action var18;
      boolean var20;
      Action var23;
      int var26;
      int var29;
      int var35;
      switch(super.m_Actno) {
      case 34:
         switch((var16 = this).m_R_No0) {
         case 0:
            var16.m_R_No0 += 2;
            var16.m_Actflg |= 4;
            var16.m_Sprpri = 3;
            var16.m_Sprhsize = 16;
            var16.m_Patno = 1;
            var16.m_Userflag &= 15;
         case 2:
            if (var16.m_Mstno != 2) {
               byte var32 = 0;
               var23 = var1.getSonicAction();
               if ((var2 = var16.m_Xposi - var23.m_Xposi) < 0) {
                  var2 = -var2;
               }

               if (64 > var2) {
                  var32 = 1;
               }

               if ((var6 = var1.getTailsAction()) != null) {
                  if ((var2 = var16.m_Xposi - var6.m_Xposi) < 0) {
                     var2 = -var2;
                  }

                  if (64 > var2) {
                     var32 = 1;
                  }
               }

               if (var32 == 0 && var16.m_Mstno != 0) {
                  var32 = 2;
               }

               var16.m_Mstno = var32;
            }

            var16.patchg(f);
            var16.frameOutCheck(var1);
            return;
         case 4:
            if ((var23 = var1.insertAction(var16.m_Actno)) != null) {
               var23.m_Actno = var16.m_Actno;
               var23.m_R_No0 = 6;
               var23.m_Xposi = var16.m_Xposi;
               var23.m_Yposi = var16.m_Yposi;
               var23.m_Actflg = var16.m_Actflg;
               var23.m_Cddat = var16.m_Cddat;
            }

            var16.m_R_No0 -= 2;
            var16.patchg(f);
            var16.frameOutCheck(var1);
            return;
         case 6:
            var16.m_R_No0 += 2;
            var16.m_Sprvs = 8;
            var16.m_Sprhs = 16;
            var16.m_Sprpri = 4;
            var16.m_Colino = 155;
            var16.m_Patno = 0;
            var16.m_Xspeed = 1024;
            if ((var16.m_Cddat & 1) != 0) {
               var16.m_Xspeed = -1024;
            }
         case 8:
            var16.speedSet2();
            if ((var16.m_Cddat & 1) == 0) {
               if (((GameState)var1).emyCol_L(var16.m_Xposi, var16.m_Yposi, -8) < 0) {
                  var16.frameOut(var1);
               } else {
                  var16.frameOutCheck(var1);
               }

               return;
            } else if (((GameState)var1).emyCol_R(var16.m_Xposi, var16.m_Yposi, 8) < 0) {
               var16.frameOut(var1);
               return;
            } else {
               var16.frameOutCheck(var1);
            }
         case 1:
         case 3:
         case 5:
         case 7:
         default:
            return;
         }
      case 35:
         switch((var16 = this).m_R_No0) {
         case 0:
            var16.m_R_No0 += 2;
            var16.m_Actflg |= 4;
            var16.m_Sprhsize = 16;
            var16.m_Sprvsize = 32;
            var16.m_Sprpri = 4;
            Action var24;
            if ((var24 = var1.insertAction(var16, var16.m_Actno)) != null) {
               var24.m_Actno = var16.m_Actno;
               var24.m_R_No0 += 2;
               var24.m_R_No1 += 2;
               var24.m_Xposi = var16.m_Xposi;
               var24.m_Reserve[0] = var16.m_Xposi;
               var24.m_Yposi = var16.m_Yposi + 48;
               var24.m_Actflg = var16.m_Actflg;
               var24.m_Sprhsize = 16;
               var24.m_Sprvsize = 16;
               var24.m_Sprpri = 4;
               var24.m_Patno = 1;
            }
         case 2:
            var2 = var16.m_Xposi;
            switch(var16.m_R_No1) {
            case 2:
               Action var39 = var1.getSonicAction();
               var16.b(var39);
               Action var40;
               if ((var40 = var1.getTailsAction()) != null) {
                  var16.b(var40);
               }
            case 3:
            case 5:
            default:
               break;
            case 4:
               if ((var26 = var16.m_Reserve[2] - 1) < 0) {
                  var16.m_R_No1 += 2;
               } else {
                  var16.m_Reserve[2] = var26;
                  var16.m_Xposi = var16.m_Reserve[0] + h[var26 & 7];
               }
               break;
            case 6:
               var16.speedSet2();
               var16.m_Yspeed += 56;
               if ((var29 = ((GameState)var1).emyCol_D(var16.m_Xposi, var16.m_Yposi, var16.m_Sprvsize - 1)) < 0) {
                  var16.m_Yposi += var29;
                  var16.m_Yspeed = 0;
                  var16.m_Reserve[1] = var16.m_Yposi;
                  var16.m_Patno = 2;
                  var16.m_R_No1 = 0;
               }
            }

            ((GameState)var1).atariRideSub(var2, var16.m_Yposi, var16.m_Sprhsize + 11, var16.m_Sprvsize, var16.m_Sprvsize + 1, 8, var16);
            var16.frameOutCheck(var1);
         default:
            return;
         }
      case 36:
         var2 = (var16 = this).m_Userflag & 255;
         boolean var21 = false;
         switch(var16.m_R_No0) {
         case 0:
            var16.m_R_No0 += 2;
            var16.m_Sproffset = 34139;
            var16.m_Actflg = 132;
            var16.m_Sprhsize = 16;
            var16.m_Sprpri = 1;
            if ((var2 & 128) != 0) {
               var16.m_R_No0 += 8;
               var2 &= 127;
               var16.m_Reserve[2] = var2;
               var16.m_Reserve[3] = var2;
               var16.m_Mstno = 6;
               var16.b(var1);
               return;
            }

            var16.m_Mstno = var2;
            var16.m_Reserve[1] = var16.m_Xposi;
            var16.m_Yspeed = -136;
            var16.m_Direc = Utilities.getRandom() & 255;
         case 2:
            var16.patchg(m);
            if (var16.m_Patno == 6) {
               var16.m_Reserve[0] = 1;
            }
         case 4:
            if (var16.m_Yposi <= GameState.m_WaterPosi) {
               var16.m_R_No0 = 6;
               var16.m_Mstno = 3;
               var16.a(var1);
               return;
            }

            var16.m_Xposi = var16.m_Reserve[1] + n[var16.m_Direc++ & 127];
            if (var16.m_Reserve[0] != 0) {
               State var30 = var1;
               AquaticRuinAction var31 = var16;

               for(var29 = 0; var29 < 2; ++var29) {
                  if ((var6 = var29 == 0 ? var30.getSonicAction() : var30.getTailsAction()) != null && (var6.m_PlayerFlag & 128) == 0 && var6.m_Xposi > var31.m_Xposi - 16 && var6.m_Xposi <= var31.m_Xposi + 16 && var6.m_Yposi > var31.m_Yposi && var6.m_Yposi <= var31.m_Yposi + 16) {
                     PlayerAction.PLAY00_PlAirSet(var30, var6);
                     var6.m_Xspeed = 0;
                     var6.m_Yspeed = 0;
                     var6.m_Mspeed = 0;
                     var6.m_Mstno = 21;
                     var6.m_FallTimer = 35;
                     var6.m_JumpFlag = 0;
                     var6.m_Cddat &= -49;
                     if ((var6.m_Cddat & 4) != 0) {
                        if (var6.m_Actno == 1) {
                           var6.m_Cddat &= -5;
                           var6.m_Sprvs = 19;
                           var6.m_Sprhs = 9;
                           var6.m_Yposi -= 5;
                        } else {
                           var6.m_Sprvs = 15;
                           var6.m_Sprhs = 9;
                           --var6.m_Yposi;
                        }
                     }

                     if (var31.m_R_No0 != 6) {
                        var31.m_R_No0 = 6;
                        var31.m_Mstno += 3;
                     }
                  }
               }

               if (var16.m_R_No0 == 6) {
                  var16.a(var1);
                  return;
               }
            }

            var16.speedSet2();
            if ((var16.m_Actflg & 128) == 0) {
               var16.frameOut(var1);
               return;
            }
         case 1:
         case 3:
         case 5:
         case 7:
         case 9:
         default:
            break;
         case 6:
            var16.a(var1);
            return;
         case 8:
            var16.frameOut(var1);
            return;
         case 10:
            var16.b(var1);
         }

         return;
      case 43:
         switch((var16 = this).m_R_No0) {
         case 0:
            var16.m_R_No0 += 2;
            var16.m_Actflg |= 4;
            var16.m_Sprhsize = 16;
            var16.m_Sprvsize = 24;
            var16.m_Sprpri = 4;
         case 2:
            switch(var16.m_R_No1) {
            case 0:
               var16.a(var1.getSonicAction());
               var16.a(var1.getTailsAction());
            case 1:
            case 3:
            case 4:
            default:
               break;
            case 2:
               if (--var16.m_Reserve[0] < 0) {
                  var16.m_Reserve[0] = 4;
                  var16.m_Yposi -= 4;
                  var16.m_Sprvsize += 4;
                  ++var16.m_Patno;
                  if (var16.m_Patno >= 6) {
                     var16.m_R_No1 = 4;
                  }
               }
            }

            ((GameState)var1).atariRideSub(var16.m_Xposi, var16.m_Yposi, var16.m_Sprhsize + 11, var16.m_Sprvsize, var16.m_Sprvsize + 1, 8, var16);
            if ((var16.m_Cddat & 24) != 0) {
               int[] var33 = b;
               int[] var27 = c;
               int[][] var28 = d;
               State var19 = var1;
               AquaticRuinAction var22 = var16;
               var35 = 0;
               var11 = 0;
               var29 = var28.length;
               var16.m_Actflg |= 32;
               var16.m_Actflg &= -65;
               var8 = var16.m_Actno;
               var9 = var16.m_Actflg;
               var13 = var16.m_Xposi - var16.m_Sprhsize;
               var14 = var16.m_Yposi - var16.m_Sprvsize;

               for(var15 = 0; var15 < var29; ++var15) {
                  Object var38;
                  if ((var38 = var15 == 0 ? var22 : var19.insertAction(var22, var22.m_Actno)) != null) {
                     ((Action)var38).m_R_No0 = 4;
                     ((Action)var38).m_Actno = var8;
                     ((Action)var38).m_Patbase_Table = var28;
                     ((Action)var38).m_Patno = var15;
                     ((Action)var38).m_Actflg = var9;
                     ((Action)var38).m_Xposi = var13 + var28[var15][1];
                     ((Action)var38).m_Yposi = var14 + var28[var15][2];
                     ((Action)var38).m_Sproffset = var22.m_Sproffset;
                     ((Action)var38).m_Sprpri = var22.m_Sprpri;
                     ((Action)var38).m_Sprhsize = var22.m_Sprhsize;
                     ((Action)var38).m_Xspeed = var27[var35++];
                     ((Action)var38).m_Yspeed = var27[var35++];
                     if (var33 != null) {
                        ((Action)var38).m_Reserve[1] = var33[var11++];
                     }
                  }
               }

               var16.a(var1.getSonicAction(), 8);
               var16.a(var1.getTailsAction(), 16);
               return;
            }
         case 1:
         case 3:
         default:
            break;
         case 4:
            if (var16.m_Reserve[1] != 0) {
               int var10002 = var16.m_Reserve[1]--;
            } else {
               var16.speedSet2();
               var16.m_Yspeed += 24;
            }

            if ((var16.m_Actflg & 128) == 0) {
               var16.frameOut(var1);
            }
         }

         return;
      case 130:
         var2 = (var16 = this).m_Userflag & 255;
         switch(var16.m_R_No0) {
         case 0:
            var16.m_R_No0 += 2;
            var16.m_Actflg = 4;
            var16.m_Sprpri = 3;
            var4 = var16.m_Userflag >> 4 & 3;
            var16.m_Sprhsize = j[var4][0];
            var16.m_Sprvsize = j[var4][1];
            var16.m_Sprvs = var16.m_Sprvsize - 1;
            var16.m_Reserve[2] = var16.m_Xposi;
            var16.m_Reserve[0] = var16.m_Yposi;
            if ((var2 & 15) != 0 && (var2 & 15) != 7) {
               var16.m_Reserve[4] = 1;
            }

            var16.m_Userflag &= 15;
         case 2:
            var3 = var16.m_Xposi;
            switch(var16.m_Userflag & 15) {
            case 0:
            default:
               break;
            case 1:
            case 3:
               if (var16.m_Reserve[3] == 0) {
                  if ((var16.m_Cddat & 24) != 0) {
                     var16.m_Reserve[3] = 30;
                  }
               } else if (--var16.m_Reserve[3] == 0) {
                  ++var16.m_Userflag;
                  var16.m_Reserve[4] = 0;
               }
               break;
            case 2:
            case 6:
               var16.speedSet2();
               var16.m_Yspeed += 8;
               if ((var35 = ((GameState)var1).emyCol_D(var16.m_Xposi, var16.m_Yposi, var16.m_Sprvsize - 1)) < 0) {
                  var16.m_Yposi += var35 + 1;
                  var16.m_Yspeed = 0;
                  var16.m_Userflag = 0;
               }
               break;
            case 4:
               var16.speedSet2();
               var16.m_Yspeed -= 8;
               if ((var35 = ((GameState)var1).emyCol_U(var16.m_Xposi, var16.m_Yposi, var16.m_Sprvs)) < 0) {
                  var16.m_Yposi -= var35;
                  var16.m_Yspeed = 0;
                  var16.m_Userflag = 0;
               }
               break;
            case 5:
               if ((var16.m_Reserve[8] & 3) != 0) {
                  ++var16.m_Userflag;
                  var16.m_Reserve[4] = 0;
               }
               break;
            case 7:
               if ((var9 = GameState.m_WaterPosi - var16.m_Yposi) != 0) {
                  if (var16.m_Yposi > var9) {
                     if (-2 > var9) {
                        var9 = -2;
                     }

                     var16.m_Yposi += var9;
                     if ((var35 = ((GameState)var1).emyCol_U(var16.m_Xposi, var16.m_Yposi, var16.m_Sprvs)) < 0) {
                        var16.m_Yposi -= var35;
                     }
                  } else {
                     if (2 < var9) {
                        var9 = 2;
                     }

                     var16.m_Yposi += var9;
                     if ((var35 = ((GameState)var1).emyCol_D(var16.m_Xposi, var16.m_Yposi, var16.m_Sprvs)) < 0) {
                        var16.m_Yposi += var35 + 1;
                     }
                  }
               }
            }

            if ((var16.m_Actflg & 128) != 0) {
               ((GameState)var1).atariRideSub(var3, var16.m_Yposi, var16.m_Sprhsize + 11, var16.m_Sprvsize, var16.m_Sprvsize + 1, 8, var16);
               var5 = GameState.m_D6_Tmp;
               var16.m_Reserve[8] = var5 >> 16 & 255;
               if (var16.m_Reserve[4] != 0) {
                  label575: {
                     int[] var10000;
                     if ((var16.m_Cddat & 24) == 0) {
                        if (var16.m_Reserve[7] == 0) {
                           break label575;
                        }

                        var10000 = var16.m_Reserve;
                        var10000[7] -= 4;
                     } else {
                        if (var16.m_Reserve[7] == 64) {
                           break label575;
                        }

                        var10000 = var16.m_Reserve;
                        var10000[7] += 4;
                     }

                     var16.m_Yposi = var16.m_Reserve[0] + (Utilities.sinset(var16.m_Reserve[7]) << 10 >> 16);
                  }
               }
            }

            var16.frameOutCheckX(var1, var16.m_Reserve[2]);
         default:
            return;
         }
      case 131:
         var2 = (var16 = this).m_Userflag & 255;
         if ((var16.m_Actflg & 64) == 0) {
            switch(var16.m_R_No0) {
            case 0:
               var16.m_R_No0 += 2;
               var16.m_Actflg = 4;
               var16.m_Sprpri = 4;
               var16.m_Sprhsize = 32;
               var16.m_Reserve[2] = var16.m_Xposi;
               var16.m_Reserve[3] = var16.m_Yposi;
               var20 = false;
               var16.m_Reserve[1] = (var2 & 240) << 3;
               var16.m_Direc = var16.m_Cddat >> 2 & 192;
               if ((var10 = var16.a(var1, var16, 6)) != null) {
                  var10.m_Actno = var16.m_Actno;
                  var10.m_Patbase_Image = var16.m_Patbase_Image;
                  var10.m_Patbase_Table = var16.m_Patbase_Table;
                  var10.m_Sproffset = var16.m_Sproffset;
                  var10.m_Actflg = 68;
                  var10.m_Patno = -1;
                  var10.m_Sprhsize_Ms = 64;
                  var10.m_Manysprcnt = 11;
                  var10.m_Sprpositbl = new int[var10.m_Manysprcnt][4];

                  for(var11 = 0; var11 < 9; ++var11) {
                     var10.m_Sprpositbl[var11][3] = 1;
                  }

                  var10.m_Patno_Ms = 1;
                  var10.m_Sprvsize_Ms = 64;
                  var10.m_Actflg |= 16;
               }

               Action[] var36;
               (var36 = new Action[3])[0] = var10;
               var36[1] = var16.a(var1, (Action)null, 4);
               var36[2] = var16.a(var1, (Action)null, 4);
               var16.m_ReserveObj = var36;
            case 2:
               var35 = var16.m_Xposi;
               var3 = var16.m_Reserve[1];
               var16.m_Direc += var3;
               var5 = var16.m_Reserve[3];
               var26 = var16.m_Reserve[2];
               Action var37 = ((Action[])((Action[])var16.m_ReserveObj))[0];
               var9 = 0;
               int var12;
               var3 = Utilities.sinset(var12 = var16.m_Direc >> 8 & 255) << 12;
               var4 = Utilities.cosset(var12) << 12;
               var29 = var3 >> 16;
               var8 = var4 >> 16;
               var29 += var5;
               var8 += var26;
               var37.m_Xposi = var8;
               var37.m_Yposi = var29;
               var29 = var3;
               var8 = var4;

               for(var13 = 0; var13 < 3; ++var13) {
                  var37.m_Sprpositbl[var9][0] = var26 + (var8 >> 16);
                  var37.m_Sprpositbl[var9][1] = var5 + (var29 >> 16);
                  var29 += var3;
                  var8 += var4;
                  ++var9;
               }

               var16.m_Xposi = var26 + (var8 >> 16);
               var16.m_Yposi = var5 + (var29 >> 16);
               var3 = Utilities.sinset(var13 = (var16.m_Direc >> 8) + 85 & 255) << 12;
               var4 = Utilities.cosset(var13) << 12;
               var29 = var3;
               var8 = var4;

               for(var14 = 0; var14 < 3; ++var14) {
                  var37.m_Sprpositbl[var9][0] = var26 + (var8 >> 16);
                  var37.m_Sprpositbl[var9][1] = var5 + (var29 >> 16);
                  var29 += var3;
                  var8 += var4;
                  ++var9;
               }

               var29 = var5 + (var29 >> 16);
               var8 = var26 + (var8 >> 16);
               Action var41;
               (var41 = ((Action[])((Action[])var16.m_ReserveObj))[1]).m_Xposi = var8;
               var41.m_Yposi = var29;
               var3 = Utilities.sinset(var15 = (var16.m_Direc >> 8) - 85 & 255) << 12;
               var4 = Utilities.cosset(var15) << 12;
               var29 = var3;
               var8 = var4;

               for(var2 = 0; var2 < 3; ++var2) {
                  var37.m_Sprpositbl[var9][0] = var26 + (var8 >> 16);
                  var37.m_Sprpositbl[var9][1] = var5 + (var29 >> 16);
                  var29 += var3;
                  var8 += var4;
                  ++var9;
               }

               var29 = var5 + (var29 >> 16);
               var8 = var26 + (var8 >> 16);
               (var18 = ((Action[])((Action[])var16.m_ReserveObj))[2]).m_Xposi = var8;
               var18.m_Yposi = var29;
               var37.m_Sprpositbl[9][0] = var41.m_Xposi;
               var37.m_Sprpositbl[9][1] = var41.m_Yposi;
               var37.m_Sprpositbl[10][0] = var18.m_Xposi;
               var37.m_Sprpositbl[10][1] = var18.m_Yposi;
               ((GameState)var1).rideChkSub(var35, var16.m_Yposi, var16.m_Sprhsize + 11, 8, 0, 9, var16);
               return;
            case 1:
            case 3:
            default:
               break;
            case 4:
               ((GameState)var1).rideChkSub(var16.m_Reserve[0], var16.m_Yposi, var16.m_Sprhsize + 11, 8, 0, 9, var16);
               var16.m_Reserve[0] = var16.m_Xposi;
            }
         }

         return;
      case 140:
         switch((var16 = this).m_R_No0) {
         case 0:
            var16.y_Emy_Init(y);
            var16.m_R_No0 += 2;
            var16.m_Reserve[0] = 16;
            var16.m_Reserve[1] = 4;
            return;
         case 1:
         case 3:
         case 5:
         case 7:
         default:
            break;
         case 2:
            if ((var16.m_Actflg & 128) == 0) {
               var16.patchg(z);
               var16.frameOutCheck(var1);
               return;
            }

            var16.d(var1);
            break;
         case 4:
            if (--var16.m_Reserve[0] >= 0) {
               if (((var2 = ((GameState)var1).chkPlDir(var16)) & 255) == 0) {
                  var16.m_Cddat &= -2;
               } else {
                  var16.m_Cddat |= 1;
               }

               var16.m_Xspeed += (var2 & 255) == 0 ? -16 : 16;
               var16.m_Yspeed += (var2 & '\uff00') == 0 ? -16 : 16;
               boolean var25 = true;
               var20 = true;
               if ((var26 = var16.m_Xspeed) < 0) {
                  if (-512 > var26) {
                     var26 = -512;
                  }
               } else if (512 < var26) {
                  var26 = 512;
               }

               if ((var29 = var16.m_Yspeed) < 0) {
                  if (-512 > var29) {
                     var29 = -512;
                  }
               } else if (512 < var29) {
                  var29 = 512;
               }

               var16.m_Xspeed = var26;
               var16.m_Yspeed = var29;
               var16.speedSet2();
               var16.patchg(z);
               var16.frameOutCheck(var1);
            } else {
               var16.m_R_No0 = 6;
               var16.m_Reserve[0] = Utilities.getRandom() & 31;
               var16.m_Xspeed = 0;
               var16.m_Yspeed = 0;
               var16.patchg(z);
               var16.frameOutCheck(var1);
            }

            return;
         case 6:
            if (--var16.m_Reserve[0] >= 0) {
               var16.patchg(z);
               var16.frameOutCheck(var1);
               return;
            }

            var16.d(var1);
            break;
         case 8:
            var16.speedSet2();
            var16.patchg(z);
            var16.frameOutCheck(var1);
         }

         return;
      case 141:
      case 142:
         switch((var16 = this).m_R_No0) {
         case 0:
            var16.y_Emy_Init(w);
            var16.m_R_No0 += 2;
            if ((var16.m_Actflg & 2) != 0) {
               var16.m_Cddat &= -3;
               var16.m_Sproffset &= 32767;
            }

            var16.m_Sprvs = 20;
            var16.m_Sprhs = 16;
            if ((var3 = ((GameState)var1).emyCol_D(var16.m_Xposi, var16.m_Yposi, var16.m_Sprvs)) < 0) {
               var16.m_Yposi += var3;
               var16.m_Yspeed = 0;
            }

            if (var16.m_Actno == 141) {
               AquaticRuinAction var34 = var16;
               State var7 = var1;

               for(var9 = 0; var9 < 4; ++var9) {
                  if ((var10 = var7.insertAction(143)) != null) {
                     var10.m_Actno = 143;
                     var10.m_Userflag = 4;
                     var10.m_ReserveObj = var34;
                     var10.m_Reserve[1] = var9;
                     var10.m_Xposi = var34.m_Xposi + s[var9][0];
                     var10.m_Yposi = var34.m_Yposi + s[var9][1];
                  }
               }

               return;
            } else {
               var16.m_R_No0 = 6;
               return;
            }
         case 2:
            var16.m_Actflg &= -3;
            var16.m_Cddat &= -3;
            var16.m_Sproffset &= 32767;
            var23 = var1.getSonicAction();
            if ((var4 = var16.m_Xposi - var23.m_Xposi) < 0) {
               var4 = -var4;
            }

            if (96 < var4) {
               var16.frameOutCheck(var1);
            } else {
               var16.m_R_No0 += 2;
               var16.m_Reserve[1] = 1;
               var16.frameOutCheck(var1);
            }

            return;
         case 4:
            var16.patchg(v);
            var16.frameOutCheck(var1);
            return;
         case 6:
            var16.m_R_No0 += 2;
            var16._chk_pl_dir(var1);
            var2 = var16.pldir_d0;
            var16.m_Xspeed = (var2 & 255) == 0 ? -256 : 256;
            if ((var2 & 255) == 0) {
               var16.m_Cddat &= -2;
            } else {
               var16.m_Cddat |= 1;
            }

            var16.frameOutCheck(var1);
            return;
         case 8:
            var16.m_Actflg &= -3;
            var16.m_Cddat &= -3;
            var16.m_Sproffset &= 32767;
            var16.speedSet2();
            var3 = ((GameState)var1).emyCol_D(var16.m_Xposi, var16.m_Yposi, var16.m_Sprvs);
            if (-1 <= var3 && 12 > var3) {
               var16.m_Yposi += var3;
               var16.patchg(u);
               var16.frameOutCheck(var1);
            } else {
               var16.m_R_No0 += 2;
               var16.m_Reserve[0] = 59;
               var16.frameOutCheck(var1);
            }

            return;
         case 10:
            if (--var16.m_Reserve[0] < 0) {
               var16.m_R_No0 = 8;
               var16.m_Xspeed = -var16.m_Xspeed;
               var16.m_Cddat ^= 1;
            }

            var16.frameOutCheck(var1);
         case 1:
         case 3:
         case 5:
         case 7:
         case 9:
         default:
            return;
         }
      case 143:
         switch((var16 = this).m_R_No0) {
         case 0:
            var16.y_Emy_Init(q);
            var16.m_R_No0 += 2;
            var16.m_Sproffset = 0;
            return;
         case 1:
         case 3:
         default:
            break;
         case 2:
            if ((var18 = (Action)((Action)var16.m_ReserveObj)) != null) {
               if (var18.m_Reserve[1] == 0) {
                  var16.frameOutCheck(var1);
               } else {
                  var16.m_R_No0 += 2;
                  var16.m_Xspeed = r[var16.m_Reserve[1]][0] << 8;
                  var16.m_Yspeed = r[var16.m_Reserve[1]][1] << 8;
                  var16.frameOutCheck(var1);
               }

               return;
            }
            break;
         case 4:
            if ((var16.m_Actflg & 128) == 0) {
               var16.frameOut(var1);
               return;
            }

            var16.speedSet();
            var16.frameOutCheck(var1);
         }

         return;
      case 145:
         if ((var16 = this).m_Xspeed > 0) {
            var16.m_Actflg |= 1;
            var16.m_Cddat |= 1;
         } else if (var16.m_Xspeed < 0) {
            var16.m_Actflg &= -2;
            var16.m_Cddat &= -2;
         }

         switch(var16.m_R_No0) {
         case 0:
            var16.y_Emy_Init(C);
            var16.m_R_No0 += 2;
            var16.m_Reserve[0] = 512;
            var16.m_Reserve[1] = 80;
            var16.m_Xspeed = (var16.m_Cddat & 1) == 0 ? -64 : 64;
            return;
         case 1:
         case 3:
         case 5:
         default:
            break;
         case 2:
            if (--var16.m_Reserve[1] <= 0) {
               var16.m_Reserve[1] = 80;
               if ((var6 = var1.insertAction(10)) != null) {
                  var6.m_Actno = 10;
                  var6.m_Userflag = 6;
                  var6.m_Xposi = var16.m_Xposi + ((var16.m_Actflg & 1) == 0 ? 20 : -20);
                  var6.m_Yposi = var16.m_Yposi + 6;
               }
            }

            if (--var16.m_Reserve[0] < 0) {
               var16.m_Reserve[0] = 512;
               var16.m_Cddat ^= 1;
               var16.m_Actflg ^= 1;
               var16.m_Xspeed = -var16.m_Xspeed;
            }

            var16.speedSet2();
            var16._chk_pl_dir(var1);
            boolean var17 = false;
            var4 = var16.pldir_d2;
            var5 = var16.pldir_d3;
            var8 = var4;
            boolean var42;
            if (64 <= var5 + 32) {
               var42 = false;
            } else {
               label417: {
                  if (var4 >= 0) {
                     if (var16.m_Xspeed >= 0) {
                        var42 = false;
                        break label417;
                     }
                  } else {
                     if (var16.m_Xspeed < 0) {
                        var42 = false;
                        break label417;
                     }

                     var8 = -var4;
                  }

                  var42 = 32 > var8 ? false : 160 > var8;
               }
            }

            if (var42) {
               var16.m_R_No0 += 2;
               var16.m_Reserve[0] = 16;
               var16.m_Xspeed = 0;
            }

            var16.frameOutCheck(var1);
            return;
         case 4:
            if (--var16.m_Reserve[0] >= 0) {
               var16.patchg(B);
               var16.frameOutCheck(var1);
               return;
            }

            var16.m_R_No0 += 2;
            var16._chk_pl_dir(var1);
            var2 = var16.pldir_d0;
            var5 = var16.pldir_d3;
            var2 >>= 1;
            var16.m_Xspeed = var2 == 0 ? -384 : 384;
            var5 += 16;
            if (32 <= (var5 & '\uffff')) {
               var16.m_Yspeed = 128;
            }

            var16.patchg(B);
            var16.frameOutCheck(var1);
            return;
         case 6:
            var16.speedSet2();
            var16.patchg(B);
            var16.frameOutCheck(var1);
         }
      }

   }

   public void render(Graphics var1) {
   }

   public static void prepareImages() {
      CommonAction.loadImages(43);
      CommonAction.loadImages(34);
      CommonAction.loadImages(35);
      CommonAction.loadImages(130);
      CommonAction.loadImages(36);
      CommonAction.loadImages(131);
      CommonAction.loadImages(34);
      CommonAction.loadImages(24);
      CommonAction.loadImages(143);
      CommonAction.loadImages(145);
      CommonAction.loadImages(141);
      CommonAction.loadImages(140);
   }

   public static void disposeImages() {
      CommonAction.unloadImage(43);
      CommonAction.unloadImage(34);
      CommonAction.unloadImage(35);
      CommonAction.unloadImage(130);
      CommonAction.unloadImage(36);
      CommonAction.unloadImage(131);
      CommonAction.unloadImage(34);
      CommonAction.unloadImage(143);
      CommonAction.unloadImage(141);
      CommonAction.unloadImage(140);
      CommonAction.unloadImage(145);
      CommonAction.unloadImage(24);
   }

   private void a(Action var1, int var2) {
      if ((super.m_Cddat & var2) != 0) {
         super.m_Cddat &= ~var2;
         var1.m_Cddat |= 4;
         var1.m_Sprvs = 20;
         var1.m_Sprhs = 7;
         var1.m_Mstno = 2;
         var1.m_Cddat |= 2;
         var1.m_Cddat &= -9;
         var1.m_R_No0 = 2;
      }

   }

   private void a(Action var1) {
      if (var1 != null) {
         int var2;
         if ((var2 = super.m_Xposi - var1.m_Xposi) < 0) {
            var2 = -var2;
         }

         if (64 > var2) {
            super.m_R_No1 = 2;
         }

      }
   }

   private void b(Action var1) {
      int var2;
      if ((var2 = super.m_Xposi - var1.m_Xposi) < 0) {
         var2 = -var2;
      }

      if (128 > var2) {
         super.m_R_No1 = 4;
         super.m_Reserve[2] = 8;
      }

   }

   private Action a(State var1, Action var2, int var3) {
      Action var4;
      if ((var4 = var1.insertAction(var2, super.m_Actno)) != null) {
         var4.m_R_No0 += 4;
         var4.m_Actno = super.m_Actno;
         var4.m_Sproffset = super.m_Sproffset;
         var4.m_Actflg = 4;
         var4.m_Sprpri = var3;
         var4.m_Sprhsize = 32;
         var4.m_Reserve[2] = super.m_Xposi;
         var4.m_Reserve[3] = super.m_Yposi;
         var4.m_Reserve[0] = super.m_Xposi;
         var4.m_IsDrawPatno = true;
      }

      return var4;
   }

   private void a(State var1) {
      this.patchg(m);
      if ((super.m_Actflg & 128) == 0) {
         this.frameOut(var1);
      }

   }

   private void b(State var1) {
      int[] var10000;
      int var2;
      if (super.m_Reserve[5] == 0) {
         if (super.m_Yposi <= GameState.m_WaterPosi) {
            this.c(var1);
            return;
         }

         if ((super.m_Actflg & 128) == 0) {
            this.c(var1);
            return;
         }

         if (--super.m_Reserve[6] >= 0) {
            this.patchg(m);
            this.c(var1);
            return;
         }

         super.m_Reserve[5] = 1;
         int var3 = var2 = Utilities.getRandom();
         super.m_Reserve[4] = var2 % 5;
         var3 &= 12;
         super.m_Reserve[8] = var3;
         if (--super.m_Reserve[2] < 0) {
            super.m_Reserve[2] = super.m_Reserve[3];
            var10000 = super.m_Reserve;
            var10000[5] |= 128;
         }
      } else if (--super.m_Reserve[6] >= 0) {
         this.patchg(m);
         this.c(var1);
         return;
      }

      super.m_Reserve[6] = Utilities.getRandom() & 31;
      Action var5;
      if ((var5 = var1.insertAction(super.m_Actno)) != null) {
         var5.m_Actno = super.m_Actno;
         var5.m_Xposi = super.m_Xposi + ((Utilities.getRandom() & 15) - 8);
         var5.m_Yposi = super.m_Yposi;
         var2 = super.m_Reserve[4];
         var5.m_Userflag = o[super.m_Reserve[8] + var2];
         if ((super.m_Reserve[5] & 128) != 0) {
            boolean var4 = true;
            if ((Utilities.getRandom() & 3) == 0) {
               if ((super.m_Reserve[5] & 64) == 0) {
                  var10000 = super.m_Reserve;
                  var10000[5] |= 64;
                  var5.m_Userflag = 2;
               } else {
                  var4 = false;
               }
            }

            if (var4 && super.m_Reserve[4] == 0 && (super.m_Reserve[5] & 64) == 0) {
               var10000 = super.m_Reserve;
               var10000[5] |= 64;
               var5.m_Userflag = 2;
            }
         }

         if (--super.m_Reserve[4] < 0) {
            var10000 = super.m_Reserve;
            var10000[6] += (Utilities.getRandom() & 127) + 128;
            super.m_Reserve[5] = 0;
         }
      }

      this.patchg(m);
      this.c(var1);
   }

   private void c(State var1) {
      this.frameOutCheck(var1);
      if (super.m_Yposi <= GameState.m_WaterPosi) {
         this.frameOut(var1);
      }

   }

   protected void y_Emy_Init(int[] var1) {
      super.m_Actflg = var1[0] & 252 | super.m_Actflg & 3;
      super.m_Sprpri = var1[1];
      super.m_Sprhsize = var1[2];
      super.m_Colino = var1[3];
   }

   private void d(State var1) {
      if (--super.m_Reserve[1] < 0) {
         super.m_R_No0 = 8;
         super.m_Cddat &= -2;
         super.m_Yspeed = 0;
         super.m_Xspeed = -512;
         super.m_Yspeed = -512;
         this.speedSet2();
         this.patchg(z);
         this.frameOutCheck(var1);
      } else {
         super.m_R_No0 = 4;
         super.m_Yspeed = -256;
         super.m_Reserve[0] = 96;
      }
   }
}
