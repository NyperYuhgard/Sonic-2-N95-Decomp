package STH2P1;

import Coral.crlCanvas;
import javax.microedition.lcdui.Graphics;

public class EmeraldHillAction extends Action {
   public static final int HASHI_WORKMAX = 5;
   private static final int[][] a = new int[][]{{0, 0, 0, 16, 16, -8, -8}};
   private static byte[] b;
   private static int[] c;
   private static final int[] d = new int[]{132, 4, 16, 9};
   private static final int[][] e = new int[][]{{0, 0, 0, 32, 32, -16, -16}, {0, 0, 32, 32, 32, -16, -16}};
   private static final int[][] f = new int[][]{{8, 0, 1, -1}, {4, 0, 1, -1}, {8, 0, -1}};
   private static final int[][] g = new int[][]{{0, 0, 0, 32, 48, -16, -24}, {0, 32, 0, 32, 48, -16, -24}, {0, 64, 0, 32, 48, -16, -24}, {0, 96, 32, 16, 16, -8, -8}};
   private static final int[][] h = new int[][]{{6, 0, 1}, {20, 2}};
   private static final int[] i = new int[]{132, 5, 12, 9};
   private static final int[][] j = new int[][]{{-256, 32}, {256, 24}, {-256, 16}, {256, 40}, {-256, 32}, {256, 16}};
   private static int[] k = new int[]{132, 5, 8, 139};
   private static final int[][] l = new int[][]{{0, 0, 0, 48, 16, -24, -8}, {0, 0, 0, 48, 16, -24, -8}, {0, 48, 0, 48, 16, -24, -8}, {0, 0, 16, 48, 32, -24, -8}, {0, 0, 16, 48, 32, -24, -8}, {0, 48, 16, 48, 32, -24, -8}, {0, 96, 16, 16, 16, -8, -8}, {0, 96, 32, 16, 16, -8, -8}};
   private static final int[][] m = new int[][]{{4, 0, 1, -1}, {4, 2, 2, -1}, {4, 6, 7, -1}, {4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, -3, 0}};
   private static final int[] n = new int[]{132, 4, 16, 9};
   private static final int[][] o = new int[][]{{0, 0, 0, 64, 128, -32, -64}};

   public EmeraldHillAction(int var1, int var2) {
      super.classType = 4;
      this.setType(var1, var2);
   }

   public void setType(int var1, int var2) {
      super.m_Actno = var1;
      EmeraldHillAction var3;
      switch(super.m_Actno) {
      case 17:
         if (b == null) {
            b = Utilities.arrayInputDataByte1("/hashitbl.bin");
         }

         if (c == null) {
            c = Utilities.arrayInputDataInt1("/hashitbl2.bin");
         }

         super.m_Patbase_Image = CommonAction.getAppImages(17);
         super.m_Patbase_Table = a;
         super.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(super.m_Reserve, 0, 5);
         super.m_R_No0 = 0;
         return;
      case 73:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(73);
         var3.m_Patbase_Table = o;
         var3.m_Reserve = new int[1];
      default:
         return;
      case 75:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(75);
         var3.m_Patbase_Table = l;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 5);
         return;
      case 92:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(92);
         var3.m_Patbase_Table = e;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         return;
      case 157:
         (var3 = this).m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 3);
         var3.m_Patbase_Image = CommonAction.getAppImages(157);
         var3.m_Patbase_Table = g;
         var3.m_Sprvsize = 8;
         var3.m_Sprhsize = 8;
      }
   }

   public void update(State var1) {
      int var2;
      boolean var5;
      EmeraldHillAction var6;
      int var12;
      int var10002;
      switch(super.m_Actno) {
      case 17:
         var2 = (var6 = this).m_Userflag & 255;
         int var7;
         int var8;
         int var14;
         switch(var6.m_R_No0) {
         case 0:
            var6.m_R_No0 += 2;
            var6.m_Reserve[4] = var2;
            var6.m_Sproffset = 17334;
            var6.m_Sprpri = 3;
            var6.m_Actflg = 4;
            var6.m_Sprhsize = 128;
            var7 = var6.m_Yposi;
            var6.m_Reserve[0] = var7;
            var14 = var6.m_Xposi;
            var12 = (var2 = var6.m_Userflag & 255) >> 1 << 4;
            var14 -= var12;
            var10002 = var7;
            var7 = var14;
            var8 = var10002;
            EmeraldHillAction var13 = var6;
            var6.m_Actflg |= 64;
            var6.m_Manysprcnt = var6.m_Reserve[4];
            var6.m_Patno = -1;
            var6.m_Sprpositbl = new int[var6.m_Reserve[4]][4];

            for(var2 = 0; var2 < var13.m_Reserve[4]; var7 += 16) {
               var13.m_Sprpositbl[var2][0] = var7;
               var13.m_Sprpositbl[var2][1] = var8;
               var13.m_Sprpositbl[var2][2] = 0;
               var13.m_Sprpositbl[var2][3] = 0;
               ++var2;
            }

            return;
         case 1:
         case 3:
         case 4:
         case 5:
         case 6:
         default:
            return;
         case 2:
            int[] var10000;
            if ((var6.m_Cddat & 24) != 0) {
               if ((var6.m_Cddat & 16) != 0 && var6.m_Reserve[2] != var6.m_Reserve[3]) {
                  if (var6.m_Reserve[3] <= var6.m_Reserve[2]) {
                     var10002 = var6.m_Reserve[2]--;
                  } else {
                     var10002 = var6.m_Reserve[2]++;
                  }
               }

               if (var6.m_Reserve[1] != 64) {
                  var10000 = var6.m_Reserve;
                  var10000[1] += 4;
               }

               var6.a();
            } else if (var6.m_Reserve[1] != 0) {
               var10000 = var6.m_Reserve;
               var10000[1] -= 4;
               var6.a();
            }

            var10002 = (var6.m_Reserve[4] << 3) + 8;
            int var10003 = var6.m_Reserve[4] << 4;
            var14 = var6.m_Xposi;
            boolean var10 = true;
            var7 = var10003;
            var8 = var10002;
            var6.a(var1, 1, var8, var7, 8, var14);
            var6.a(var1, 0, var8, var7, 8, var14);
            return;
         }
      case 73:
         switch((var6 = this).m_R_No0) {
         case 0:
            var6.m_Actflg |= 20;
            var6.m_Sprhsize = 32;
            var6.m_Sprvsize = 64;
            var6.m_R_No0 = 2;
         case 2:
            var6.frameOutCheck(var1);
            return;
         default:
            return;
         }
      case 75:
         switch((var6 = this).m_R_No0) {
         case 0:
            var6.y_Emy_Init(n);
            var6.m_Actflg = 4;
            var6.m_Colino = 10;
            var6.m_Sprpri = 4;
            var6.m_R_No0 = 2;
            var6.m_Reserve[1] = 256;
            var6.m_Reserve[3] = 0;
            var6.m_Xspeed = (var6.m_Actflg & 1) == 0 ? 256 : -256;
            var6.m_Yspeed = 0;
            if ((var6.m_Actflg & 1) == 0) {
               var6.m_Cddat &= -2;
            } else {
               var6.m_Cddat |= 1;
            }

            return;
         case 2:
            switch(var6.m_R_No1) {
            case 0:
               if (var6.m_Reserve[3] == 0) {
                  Action var4;
                  if ((crlCanvas.mCounter & 1L) != 0L) {
                     var4 = var1.getSonicAction();
                  } else if ((var4 = var1.getTailsAction()) == null) {
                     var4 = var1.getSonicAction();
                  }

                  var12 = Math.abs(var6.m_Xposi - var4.m_Xposi);
                  if (40 <= var12 && var12 <= 48) {
                     var5 = false;
                     if (var6.m_Xposi < var4.m_Xposi) {
                        if ((var6.m_Actflg & 1) == 0) {
                           var5 = true;
                        }
                     } else if ((var6.m_Actflg & 1) != 0) {
                        var5 = true;
                     }

                     if (var5) {
                        var6.m_Reserve[3] = 1;
                        var6.m_R_No1 = 2;
                        var6.m_Mstno = 3;
                        var6.m_Reserve[4] = 50;
                     }
                  }
               }

               var10002 = var6.m_Reserve[2]--;
               if (var6.m_Reserve[2] == 15) {
                  var6.m_Reserve[3] = 0;
                  var6.m_Xspeed = -var6.m_Xspeed;
                  var6.m_Cddat ^= 1;
                  var6.m_Reserve[1] = 256;
               } else if (var6.m_Reserve[2] < 0) {
                  if (--var6.m_Reserve[1] > 0) {
                     var6.speedSet2();
                  } else {
                     var6.m_Reserve[2] = 30;
                  }
               }
               break;
            case 2:
               var10002 = var6.m_Reserve[4]--;
               Action var9;
               if (var6.m_Reserve[4] == 20 && (var9 = var1.insertAction(75)) != null) {
                  var9.m_Actno = 75;
                  var9.m_R_No0 = 6;
                  var9.m_Sprpri = 4;
                  var9.m_Colino = 152;
                  var9.m_Sprhsize = 16;
                  var9.m_Cddat = var6.m_Cddat;
                  var9.m_Actflg = var6.m_Actflg;
                  var9.m_Patno = 6;
                  var9.m_Mstno = 2;
                  boolean var11 = (var6.m_Actflg & 1) == 0;
                  var9.m_Xposi = var6.m_Xposi + (var11 ? -13 : 13);
                  var9.m_Yposi = var6.m_Yposi + 24;
                  var9.m_Xspeed = var11 ? 384 : -384;
                  var9.m_Yspeed = 384;
               }

               if (var6.m_Reserve[4] < 0) {
                  var6.m_R_No1 = 0;
               }
            }

            var6.patchg(m);
         case 1:
         case 3:
         case 5:
         default:
            return;
         case 4:
            return;
         case 6:
            var6.speedSet2();
            var6.patchg(m);
            var6.frameOutCheckD(var1);
            return;
         }
      case 92:
         switch((var6 = this).m_R_No0) {
         case 0:
            var6.y_Emy_Init(d);
            var6.m_R_No0 = 2;
            var6.m_Actflg = 4;
            var6.m_Sprpri = 4;
            var6.m_Colino = 9;
            var6.m_Sprhsize = 16;
            var6.m_Yspeed = -1024;
            var6.m_Reserve[0] = var6.m_Yposi;
         case 2:
            var6.patchg(f);
            var6.speedSet2();
            var6.m_Yspeed += 24;
            if (var6.m_Yposi > var6.m_Reserve[0]) {
               var6.m_Yposi = var6.m_Reserve[0];
               var6.m_Yspeed = -1280;
            }

            var6.m_Mstno = 1;
            if (var6.m_Yposi > var6.m_Reserve[0] - 192) {
               var6.m_Mstno = 0;
               if (var6.m_Yspeed >= 0) {
                  var6.m_Mstno = 2;
               }
            }
         default:
            return;
         }
      case 157:
         Action var3;
         switch((var6 = this).m_R_No0) {
         case 0:
            var6.y_Emy_Init(i);
            var6.m_Sprpri = 4;
            var6.m_Colino = 9;
            var6.m_Reserve[0] = 18;
            var6.m_R_No0 = 2;
            return;
         case 1:
         case 3:
         case 5:
         case 7:
         default:
            break;
         case 2:
            var6.patchg(h);
            if ((((GameState)var1).chkPlDir(var6) & 255) == 0) {
               var6.m_Cddat |= 1;
            } else {
               var6.m_Cddat &= -2;
            }

            var3 = var1.getSonicAction();
            if ((var2 = var6.m_Xposi - var3.m_Xposi) > -96 && var2 < 96) {
               if (var6.m_Reserve[2] <= 0) {
                  var6.m_R_No0 = 6;
                  var6.m_R_No1 = 0;
                  var6.m_Patno = 1;
                  var6.m_Reserve[0] = 8;
                  var6.m_Reserve[2] = 32;
                  var6.frameOutCheck(var1);
                  return;
               }

               var10002 = var6.m_Reserve[2]--;
            }

            if (--var6.m_Reserve[0] < 0) {
               var6.m_R_No0 = 4;
               var6.b();
            }

            var6.frameOutCheck(var1);
            return;
         case 4:
            if (--var6.m_Reserve[0] > 0) {
               var6.speedSet2();
               var6.patchg(h);
            } else {
               var6.m_R_No0 = 2;
               var6.m_Reserve[0] = 18;
            }

            var6.frameOutCheck(var1);
            return;
         case 6:
            switch(var6.m_R_No1) {
            case 0:
               if (--var6.m_Reserve[0] >= 0) {
                  return;
               }

               var6.m_R_No1 = 2;
               var6.m_Reserve[0] = 8;
               var6.m_Patno = 0;
               if ((var3 = var1.insertAction(157)) != null) {
                  var5 = (var6.m_Actflg & 1) == 0;
                  var3.m_Userflag = 32;
                  var3.m_Xposi = var6.m_Xposi + (var5 ? 11 : -11);
                  var3.m_Yposi = var6.m_Yposi - 13;
                  var3.m_Xspeed = var5 ? 256 : -256;
                  var3.m_Yspeed = -256;
                  var3.y_Emy_Init(k);
                  var3.m_R_No0 = 8;
                  var3.m_Patno = 3;
               }

               return;
            case 2:
               if (--var6.m_Reserve[0] < 0) {
                  var6.m_R_No1 = 0;
                  var6.m_R_No0 = 4;
                  var6.m_Reserve[0] = 8;
                  var6.b();
               }

               return;
            default:
               return;
            }
         case 8:
            if ((var6.m_Actflg & 128) == 0) {
               var6.frameOut(var1);
               return;
            }

            var6.m_Yspeed += 32;
            var6.speedSet2();
         }

      }
   }

   public void render(Graphics var1) {
   }

   private void a() {
      int var3 = Utilities.sinset(super.m_Reserve[1]);
      int var1 = super.m_Reserve[4] << 4;
      int var2 = super.m_Reserve[2];
      var1 += super.m_Reserve[2];
      byte var4 = b[var1 + -128];
      int var6 = (var1 & 15) << 4;
      int var5 = 0;

      int var7;
      for(var7 = 0; var7 < var2 + 1; ++var7) {
         var1 = c[var6++];
         ++var1;
         var1 = (var1 * var4 * var3 >> 16) + super.m_Reserve[0];
         super.m_Sprpositbl[var5++][1] = var1;
      }

      var1 = super.m_Reserve[4];
      if ((var1 = -(super.m_Reserve[2] + 1 - var1)) >= 0) {
         var2 = var1;
         var6 = (var1 <<= 4) + var2;
         --var2;
         if (var2 < 0) {
            return;
         }

         for(var7 = 0; var7 < var2 + 1; ++var7) {
            --var6;
            var1 = ((c[var6] + 1) * var4 * var3 >> 16) + super.m_Reserve[0];
            super.m_Sprpositbl[var5++][1] = var1;
         }
      }

   }

   private int a(State var1, int var2, int var3, int var4, int var5, int var6) {
      byte var7;
      byte var8;
      Action var10;
      if (var2 == 0) {
         var10 = var1.getSonicAction();
         var7 = 2;
         var8 = 8;
      } else {
         if ((var10 = var1.getTailsAction()) == null) {
            return 0;
         }

         var7 = 3;
         var8 = 16;
      }

      int var9;
      if ((super.m_Cddat & var8) != 0) {
         if ((var10.m_Cddat & 2) == 0 && (var9 = var10.m_Xposi - super.m_Xposi + var3) >= 0 && var4 > var9) {
            var9 >>= 4;
            super.m_Reserve[var7] = var9;
            var10.m_Yposi = super.m_Sprpositbl[var9][1] - 8 - var10.m_Sprvs;
            return 0;
         } else {
            var10.m_Cddat &= -9;
            super.m_Cddat &= ~var8;
            return 0;
         }
      } else {
         ((GameState)var1).rideonChk2(super.m_Xposi, super.m_Yposi, var3, var4, var5, var8, this, var10);
         if ((super.m_Cddat & var8) != 0) {
            var9 = var10.m_Xposi - super.m_Xposi + var3 >> 4;
            super.m_Reserve[var7] = var9;
         }

         return var6;
      }
   }

   private void b() {
      if (super.m_Reserve[1] >= 6) {
         super.m_Reserve[1] = 0;
      }

      super.m_Yspeed = j[super.m_Reserve[1]][0];
      super.m_Reserve[0] = j[super.m_Reserve[1]][1];
      int var10002 = super.m_Reserve[1]++;
   }

   public static void prepareImages() {
      CommonAction.loadImages(75);
      CommonAction.loadImages(157);
      CommonAction.loadImages(92);
      CommonAction.loadImages(17);
      CommonAction.loadImages(73);
      CommonAction.loadImages(24);
   }

   public static void disposeImages() {
      CommonAction.unloadImage(17);
      CommonAction.unloadImage(92);
      CommonAction.unloadImage(157);
      CommonAction.unloadImage(75);
      CommonAction.unloadImage(73);
      CommonAction.unloadImage(24);
      c = null;
      b = null;
   }
}
