package STH2P1;

import Coral.crlCanvas;
import javax.microedition.lcdui.Graphics;

public class ChemicalPlantAction extends Action {
   private static final int[][] a = new int[][]{{0, 0, 0, 48, 24, -24, -12}, {0, 48, 0, 48, 24, -24, -12}, {0, 96, 0, 48, 24, -24, -12}, {0, 144, 0, 8, 8, -4, -4}, {0, 144, 8, 8, 8, -4, -4}};
   private static final int[][] b = new int[][]{{0, 0, 0, 24, 48, -12, -24}, {0, 24, 0, 24, 48, -12, -24}, {0, 48, 0, 24, 48, -12, -24}};
   private static final int[] c = new int[]{4, 4, 8, 11};
   private static int[] d = new int[]{132, 5, 12, 139};
   private static final int[][] e = new int[][]{{10, 0, 1, -1}};
   private static final int[][] f = new int[][]{{0, 0, 0, 32, 16, -16, -8}, {0, 32, 0, 32, 16, -16, -8}, {0, 64, 0, 32, 16, -16, -8}, {0, 96, 0, 32, 16, -16, -8}};
   private static final int[][] g = new int[][]{{0, 0, 0, 32, 32, -16, -16}, {0, 0, 32, 32, 40, -16, -20}, {0, 32, 32, 32, 32, -16, -12}, {0, 64, 32, 32, 32, -16, -8}, {0, 96, 32, 32, 32, -16, -8}};
   private static final int[][] h = new int[][]{{8, 0, 1, 2, 3, 4, -2, 1}, {8, 4, 3, 2, 1, 0, -2, 1}, {8, 0, -1}};
   private static final int[][] i = new int[][]{{8, 0, -1}, {8, 3, 4, -1}};
   private static final int[] j = new int[]{169, 58};
   private static final int[] k = new int[]{168, 56};
   private static final int[] l = new int[]{170, 60};
   private static final int[] m = new int[]{4, 4, 16, 11};
   private static final int[] n = new int[]{4, 1, 16, 215};
   private static final int[] o = new int[]{4, 4, 4, 0};
   private static final int[] p = new int[]{4, 5, 4, 0};
   private static final int[][] q = new int[][]{{0, 8, 0, 40, 16, -20, -8}, {0, 8, 32, 40, 16, -20, -8}, {0, 8, 64, 8, 8, -4, -4}, {0, 8, 16, 40, 16, -20, -8}, {0, 8, 48, 40, 16, -20, -8}, {0, 0, 0, 8, 8, -4, -4}, {0, 0, 0, 8, 16, -4, -4}, {0, 0, 0, 8, 24, -4, -4}, {0, 0, 0, 8, 32, -4, -4}, {0, 0, 0, 8, 40, -4, -4}, {0, 0, 0, 8, 48, -4, -4}, {0, 0, 0, 8, 56, -4, -4}, {0, 0, 0, 8, 64, -4, -4}, {0, 0, 0, 8, 72, -4, -4}, {0, 0, 0, 8, 80, -4, -4}};
   private static final int[][] r = new int[][]{{0, 0, 0, 32, 32, -16, -16}, {0, 32, 0, 32, 32, -16, -16}, {0, 64, 0, 32, 32, -16, -16}, {0, 96, 0, 32, 32, -16, -16}};
   private static byte[] s;
   private static byte[] t;
   private static int[][][] u;
   private static final int[] v = new int[]{160, 256, 288, 0};
   private static final int[][] w = new int[][]{{0, 0, 0, 32, 16, -16, -16}, {0, 64, 0, 32, 32, -16, -32}, {0, 32, 0, 32, 32, -16, -32}, {0, 0, 16, 32, 16, -16, -16}, {0, 32, 0, 32, 32, -16, -32}};
   private static final int[][] x = new int[][]{{16, 0, -1}, {4, 3, -3, 0}, {5, 1, 1, 2, 2, 4, -3, 0}, {5, 1, 1, 2, 2, 4, -3, 0}};
   private static final int[][] y = new int[][]{{0, 0, 0, 16, 16, -8, -8}, {0, 16, 0, 16, 16, -8, -8}, {0, 32, 0, 16, 16, -8, -8}, {0, 48, 0, 16, 16, -8, -8}};

   public ChemicalPlantAction() {
   }

   public ChemicalPlantAction(int var1, int var2) {
      super.classType = 5;
      this.setType(var1, var2);
   }

   public void setType(int var1, int var2) {
      super.m_Actno = var1;
      ChemicalPlantAction var3;
      switch(var1) {
      case 11:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(11);
         var3.m_Patbase_Table = g;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 5);
         return;
      case 27:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(27);
         var3.m_Patbase_Table = f;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         return;
      case 29:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(29);
         var3.m_Patbase_Table = y;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 6);
      default:
         return;
      case 30:
         if (t == null) {
            t = Utilities.arrayInputDataByte1("/terminalconnecttbl.bin");
         }

         if (s == null) {
            s = Utilities.arrayInputDataByte1("/termtbl.bin");
         }

         if (u == null) {
            u = Utilities.arrayInputDataInt3("/terminalpositbl.bin");
         }

         super.m_Patbase_Image = null;
         super.m_Patbase_Table = null;
         super.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(super.m_Reserve, 0, 14);
         return;
      case 120:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(120);
         var3.m_Patbase_Table = r;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 10);
         return;
      case 123:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(123);
         var3.m_Patbase_Table = w;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         return;
      case 165:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(165);
         var3.m_Patbase_Table = a;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         return;
      case 166:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(166);
         var3.m_Patbase_Table = b;
         var3.m_Reserve = new int[2];
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         return;
      case 167:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(167);
         var3.m_Patbase_Table = q;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 13);
         var3.m_ReserveObj = new Action[4];
         return;
      case 168:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(167);
         var3.m_Patbase_Table = q;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         return;
      case 169:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(167);
         var3.m_Patbase_Table = q;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         return;
      case 170:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(167);
         var3.m_Patbase_Table = q;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         return;
      case 171:
         (var3 = this).m_Patbase_Image = CommonAction.getAppImages(167);
         var3.m_Patbase_Table = q;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
      }
   }

   public void update(State var1) {
      Action var2;
      int var3;
      int var4;
      Action var5;
      Action var6;
      Action var7;
      ChemicalPlantAction var8;
      int var9;
      int var13;
      int var14;
      int[] var10000;
      int var10002;
      switch(super.m_Actno) {
      case 11:
         var9 = (var8 = this).m_Userflag & 255;
         Action var23;
         switch(var8.m_R_No0) {
         case 0:
            var8.m_R_No0 += 2;
            var8.m_Sproffset = 58288;
            var8.m_Actflg |= 4;
            var8.m_Sprhsize = 16;
            var8.m_Sprpri = 4;
            var3 = (var9 & 240) + 16 - 1;
            var8.m_Reserve[0] = var3;
            var8.m_Reserve[1] = var3;
            var8.m_Reserve[3] = (var9 & 15) + 1 << 4;
            if (var8.m_Xposi >= 10768) {
               var8.m_R_No0 += 2;
               var8.m_Mstno = 2;
               return;
            }
         case 2:
            if ((byte)((int)(crlCanvas.mCounter & 255L)) + var8.m_Reserve[3] != 0) {
               if (var8.m_Patno != 4) {
                  ((GameState)var1).rideChkSub(var8.m_Xposi, var8.m_Yposi, var8.m_Sprhsize, var8.m_Sprvsize, 0, 17, var8);
                  var8.frameOutCheck(var1);
               } else {
                  if ((var8.m_Cddat & 24) != 0) {
                     if ((var8.m_Cddat & 8) != 0) {
                        var8.m_Cddat &= -9;
                        var23 = var5 = var1.getSonicAction();
                        var23.m_Cddat &= -9;
                        var5.m_Cddat |= 2;
                     }

                     if ((var8.m_Cddat & 16) != 0) {
                        var8.m_Cddat &= -17;
                        if ((var5 = var1.getTailsAction()) != null) {
                           var5.m_Cddat &= -9;
                           var5.m_Cddat |= 2;
                        }
                     }
                  }

                  var8.frameOutCheck(var1);
               }

               return;
            } else {
               var8.m_R_No0 += 2;
            }
         case 4:
            var5 = var1.getSonicAction();
            if (var8.m_Mstno == 2) {
               ((GameState)var1).rideChkSub(var8.m_Xposi, var8.m_Yposi, var8.m_Sprhsize, var8.m_Sprvsize, 0, 17, var8);
               var8.frameOutCheck(var1);
               if (var5.m_Xposi < 10832) {
                  var8.m_Reserve[0] = var8.m_Reserve[3] + 64 - 1;
                  return;
               }
            }

            if (--var8.m_Reserve[0] < 0) {
               var8.m_Reserve[0] = 383;
               if (var8.m_Mstno == 2) {
                  var8.m_Reserve[0] = 127;
                  var8.m_Mstno = 0;
                  return;
               }

               if (var8.m_Mstno != 0) {
                  var8.m_Reserve[0] = var8.m_Reserve[1];
               }

               if (var8.m_Xposi < 10768 || var8.m_Mstno != 1 || BossAction.m_BossWorking && var5.m_Xposi >= 10832) {
                  var8.m_Mstno ^= 1;
               }
            }

            var8.patchg(h);
            if (var8.m_Patno != 4) {
               ((GameState)var1).rideChkSub(var8.m_Xposi, var8.m_Yposi, var8.m_Sprhsize, var8.m_Sprvsize, 0, 17, var8);
               var8.frameOutCheck(var1);
               return;
            } else {
               if ((var8.m_Cddat & 24) != 0) {
                  if ((var8.m_Cddat & 8) != 0) {
                     var8.m_Cddat &= -9;
                     var23 = var5 = var1.getSonicAction();
                     var23.m_Cddat &= -9;
                     var5.m_Cddat |= 2;
                  }

                  if ((var8.m_Cddat & 16) != 0) {
                     var8.m_Cddat &= -17;
                     if ((var6 = var1.getTailsAction()) != null) {
                        var6.m_Cddat &= -9;
                        var6.m_Cddat |= 2;
                     }
                  }
               }

               var8.frameOutCheck(var1);
               return;
            }
         case 1:
         case 3:
         default:
            return;
         }
      case 27:
         var9 = (var8 = this).m_Userflag & 255;
         switch(var8.m_R_No0) {
         case 0:
            var8.m_R_No0 += 2;
            var8.m_Sproffset = 3641;
            var8.m_Actflg |= 4;
            var8.m_Sprhsize = 32;
            var8.m_Sprpri = 1;
            var8.m_Reserve[0] = (var9 & 2) == 0 ? 4096 : 2560;
         case 2:
            var8.m_Patno = GameState.getGameTimer() & 2;
            var3 = var8.m_Xposi - 16;
            var4 = var8.m_Xposi + 16;
            var13 = var8.m_Yposi - 16;
            var14 = var8.m_Yposi + 16;
            if (((var7 = var1.getSonicAction()).m_Cddat & 2) == 0 && var3 <= var7.m_Xposi && var4 > var7.m_Xposi && var13 <= var7.m_Yposi && var14 > var7.m_Yposi) {
               var8.a(var7);
            }

            if ((var7 = var1.getTailsAction()) != null && (var7.m_Cddat & 2) == 0 && var3 <= var7.m_Xposi && var4 > var7.m_Xposi && var13 <= var7.m_Yposi && var14 > var7.m_Yposi) {
               var8.a(var7);
            }

            var8.frameOutCheck(var1);
         default:
            return;
         }
      case 29:
         var1 = var1;
         var8 = this;
         switch(super.m_R_No0) {
         case 0:
            super.m_R_No0 += 2;
            super.m_Yspeed = -1152;
            var9 = var3 = super.m_Userflag & 255;
            var3 &= 15;
            var14 = (var9 & 240) == 0 ? 2 : 6;
            var4 = 0;

            for(int var20 = 0; var20 < var3 - 1; ++var20) {
               Object var17;
               if ((var17 = var20 == 0 ? var8 : var1.insertAction(var8, var8.m_Actno)) != null) {
                  ((Action)var17).m_Actno = var8.m_Actno;
                  ((Action)var17).m_R_No0 = var14;
                  ((Action)var17).m_Xposi = var8.m_Xposi;
                  ((Action)var17).m_Yposi = var8.m_Yposi;
                  ((Action)var17).m_Sproffset = 25660;
                  ((Action)var17).m_Actflg = 4;
                  ((Action)var17).m_Sprpri = 3;
                  ((Action)var17).m_Colino = 139;
                  ((Action)var17).m_Reserve[4] = ((Action)var17).m_Xposi;
                  ((Action)var17).m_Reserve[0] = ((Action)var17).m_Yposi;
                  ((Action)var17).m_Yspeed = var8.m_Yspeed;
                  ((Action)var17).m_Reserve[2] = ((Action)var17).m_Yspeed;
                  ((Action)var17).m_Sprhsize = 8;
                  ((Action)var17).m_Reserve[5] = 96;
                  ((Action)var17).m_Reserve[3] = 11;
                  if ((var8.m_Cddat & 1) != 0) {
                     ((Action)var17).m_Reserve[3] = -((Action)var17).m_Reserve[3];
                     ((Action)var17).m_Reserve[5] = -((Action)var17).m_Reserve[5];
                  }

                  ((Action)var17).m_Reserve[1] = var4;
                  var4 += 3;
               }
            }

            return;
         case 1:
         case 3:
         case 5:
         case 7:
         default:
            return;
         case 2:
         case 6:
            if (--super.m_Reserve[1] < 0) {
               super.m_R_No0 += 2;
               super.m_Reserve[1] = 59;
            }

            this.frameOutCheck(var1);
            return;
         case 4:
            this.speedSet2();
            super.m_Xspeed += super.m_Reserve[3];
            super.m_Yspeed += 24;
            if (super.m_Yspeed == 0) {
               super.m_Reserve[3] = -super.m_Reserve[3];
            }

            if (super.m_Yposi >= super.m_Reserve[0]) {
               super.m_Yspeed = super.m_Reserve[2];
               super.m_Xspeed = 0;
               super.m_R_No0 -= 2;
            }

            this.frameOutCheck(var1);
            return;
         case 8:
            this.speedSet2();
            super.m_Yspeed += 24;
            if (super.m_Yspeed == 0) {
               super.m_Xposi = super.m_Reserve[4] + super.m_Reserve[5];
            }

            if (super.m_Yposi >= super.m_Reserve[0]) {
               super.m_Yspeed = super.m_Reserve[2];
               super.m_Xposi = super.m_Reserve[4];
            }

            this.frameOutCheck(var1);
            return;
         }
      case 30:
         var9 = (var8 = this).m_Userflag & 255;
         switch(var8.m_R_No0) {
         case 0:
            var8.m_R_No0 += 2;
            var8.m_Reserve[13] = v[var9 & 3];
         case 2:
            Action var15 = var1.getSonicAction();
            var8.a(var15, 0);
            var5 = var1.getTailsAction();
            var8.a(var5, 6);
         default:
            if (var8.m_Reserve[0] + var8.m_Reserve[6] == 0) {
               var8.frameOutCheckN(var1);
            }

            return;
         }
      case 120:
         label595: {
            var1 = var1;
            var8 = this;
            label464:
            switch(super.m_R_No0) {
            case 0:
               super.m_R_No0 += 2;
               var4 = 5;
               byte var16 = 1;
               if ((super.m_Cddat & 1) != 0) {
                  var4 = 8;
                  var16 = -1;
               }

               var3 = super.m_Xposi;
               Action[] var18;
               (var18 = new Action[4])[0] = this;

               for(var9 = 1; var9 < 4; ++var9) {
                  var18[var9] = var1.insertAction(var8, var8.m_Actno);
                  if (var18[var9] != null) {
                     var18[var9].m_R_No0 = 4;
                     var18[var9].m_ReserveObj = var8;
                  }
               }

               for(var9 = 0; var9 < 4; ++var9) {
                  if (var18[var9] != null) {
                     var18[var9].m_Actno = var8.m_Actno;
                     var18[var9].m_Sproffset = 25624;
                     var18[var9].m_Actflg = 4;
                     var18[var9].m_Sprpri = 3;
                     var18[var9].m_Sprhsize = 16;
                     var18[var9].m_Userflag = var8.m_Userflag;
                     var18[var9].m_Xposi = var3;
                     var18[var9].m_Yposi = var8.m_Yposi;
                     var18[var9].m_Reserve[3] = var8.m_Xposi;
                     var18[var9].m_Reserve[4] = var18[var9].m_Yposi;
                     var3 += 32;
                     var18[var9].m_Reserve[2] = var4;
                     var4 += var16;
                  }
               }
            case 2:
               switch(var8.m_Userflag & 255 & 7) {
               case 0:
               case 4:
                  if (var8.m_Reserve[0] == 0) {
                     if ((var8.m_Reserve[1] & 48) != 0) {
                        var8.m_Reserve[0] = 30;
                     }
                  } else if (--var8.m_Reserve[0] == 0) {
                     ++var8.m_Userflag;
                  }
                  break label464;
               case 1:
               case 3:
                  if (128 != var8.m_Reserve[5]) {
                     var10002 = var8.m_Reserve[5]++;
                     var4 = var3 = var8.m_Reserve[5] << 16 >> 1;
                     var13 = (var3 >>= 1) + var4;
                     var8.m_Reserve[6] = var13 >> 16;
                     var8.m_Reserve[7] = var4 >> 16;
                     var8.m_Reserve[8] = var3 >> 16;
                  }
                  break label464;
               case 2:
               case 6:
                  if (var8.m_Reserve[0] == 0) {
                     if ((var8.m_Reserve[1] & 12) != 0) {
                        var8.m_Reserve[0] = 60;
                     }
                  } else if (--var8.m_Reserve[0] == 0) {
                     ++var8.m_Userflag;
                  } else {
                     var3 = var8.m_Reserve[0] >> 2 & 1;
                     var8.m_Reserve[5] = var3;
                     var3 ^= 1;
                     var8.m_Reserve[6] = var3;
                     var3 ^= 1;
                     var8.m_Reserve[7] = var3;
                     var3 ^= 1;
                     var8.m_Reserve[8] = var3;
                  }
                  break label464;
               case 5:
               case 7:
                  if (-128 != var8.m_Reserve[5]) {
                     var10002 = var8.m_Reserve[5]--;
                     var4 = var3 = var8.m_Reserve[5] << 16 >> 1;
                     var13 = (var3 >>= 1) + var4;
                     var8.m_Reserve[6] = var13 >> 16;
                     var8.m_Reserve[7] = var4 >> 16;
                     var8.m_Reserve[8] = var3 >> 16;
                  }
               default:
                  break label464;
               }
            case 1:
            case 3:
            default:
               break label595;
            case 4:
            }

            Object var19;
            if (var8.m_ReserveObj == null) {
               var19 = var8;
            } else {
               var19 = (Action)var8.m_ReserveObj;
            }

            var9 = ((Action)var19).m_Reserve[var8.m_Reserve[2]];
            var8.m_Yposi = var8.m_Reserve[4] + var9;
            ((GameState)var1).atariRideSub(var8.m_Xposi, var8.m_Yposi, var8.m_Sprhsize + 11, 16, 17, 8, var8);
            var14 = GameState.m_D6_Tmp;
            var10000 = ((Action)var19).m_Reserve;
            var10000[1] |= var14 >> 16 & 255;
         }

         var8.frameOutCheckX(var1, var8.m_Reserve[3]);
         return;
      case 123:
         var9 = (var8 = this).m_Userflag & 255;
         switch(var8.m_R_No0) {
         case 0:
            var8.m_R_No0 += 2;
            var8.m_Sproffset = 992;
            var8.m_Actflg |= 4;
            var8.m_Sprhsize = 16;
            var8.m_Sprpri = 1;
            var8.m_Reserve[0] = (var9 & 2) == 0 ? -4096 : -2688;
         case 2:
            var7 = var1.getSonicAction();
            var2 = var1.getTailsAction();
            if (var8.m_Patno != 1) {
               ((GameState)var1).atariRideSub3(var8.m_Xposi, 27, 8, 16, 8, var8, var7);
               if ((var8.m_Cddat & 8) != 0) {
                  var8.b(var7);
               }

               if (var2 != null) {
                  ((GameState)var1).atariRideSub3(var8.m_Xposi, 27, 8, 16, 16, var8, var2);
                  if ((var8.m_Cddat & 16) != 0) {
                     var8.b(var2);
                  }
               }
            }

            var13 = var8.m_Xposi - 16;
            var14 = var8.m_Xposi + 16;
            var3 = var8.m_Yposi;
            var4 = var8.m_Yposi + 48;
            if (var13 <= var7.m_Xposi && var14 > var7.m_Xposi && var3 <= var7.m_Yposi && var4 > var7.m_Yposi && var8.m_Mstno_1 != 2) {
               var8.m_Mstno = 2;
            }

            if (var2 != null && var13 <= var2.m_Xposi && var14 > var2.m_Xposi && var3 <= var2.m_Yposi && var4 > var2.m_Yposi && var8.m_Mstno_1 != 3 && ((PlayerAction)var2).m_PLAY20_Automode != 4) {
               var8.m_Mstno = 3;
            }

            var8.patchg(x);
         default:
            var8.frameOutCheck(var1);
            return;
         }
      case 165:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.y_Emy_Init(c);
            var8.m_R_No0 += 2;
            var8.m_Xspeed = -64;
            var8.m_Reserve[0] = 128;
            return;
         case 1:
         case 3:
         case 5:
         default:
            return;
         case 2:
            if (var8.m_Reserve[1] != 0) {
               var10002 = var8.m_Reserve[1]--;
            } else {
               var8._chk_pl_dir(var1);
               var9 = var8.pldir_d2;
               if (192 > var9 + 96) {
                  var8.m_R_No0 += 2;
                  var8.m_Reserve[1] = 80;
                  var8.m_Patno = 2;
                  var8.frameOutCheck(var1);
                  return;
               }
            }

            if (--var8.m_Reserve[0] <= 0) {
               var8.m_Reserve[0] = 128;
               var8.m_Xspeed = -var8.m_Xspeed;
            }

            var8.speedSet2();
            var8.patchg(e);
            var8.frameOutCheck(var1);
            return;
         case 4:
            if (--var8.m_Reserve[1] >= 0) {
               if (var8.m_Reserve[1] == 20) {
                  var8.a(var1);
               }

               var8.frameOutCheck(var1);
            } else {
               var8.m_R_No0 -= 2;
               var8.m_Reserve[1] = 80;
               var8.frameOutCheck(var1);
            }

            return;
         case 6:
            if ((var8.m_Actflg & 128) != 0) {
               var8.m_Yspeed += 32;
               var8.speedSet2();
               return;
            }

            var8.frameOut(var1);
            return;
         }
      case 166:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.y_Emy_Init(c);
            var8.m_R_No0 += 2;
            var8.m_Yspeed = -64;
            var8.m_Reserve[0] = 128;
            return;
         case 1:
         case 3:
         default:
            return;
         case 2:
            if (var8.m_Reserve[1] != 0) {
               var10002 = var8.m_Reserve[1]--;
            } else {
               var8._chk_pl_dir(var1);
               var9 = var8.pldir_d2;
               if (192 > var9 + 96) {
                  var8.m_R_No0 += 2;
                  var8.m_Reserve[1] = 80;
                  var8.m_Patno = 2;
                  var8.frameOutCheck(var1);
                  return;
               }
            }

            if (--var8.m_Reserve[0] <= 0) {
               var8.m_Reserve[0] = 128;
               var8.m_Yspeed = -var8.m_Yspeed;
            }

            var8.speedSet2();
            var8.patchg(e);
            var8.frameOutCheck(var1);
            return;
         case 4:
            if (--var8.m_Reserve[1] < 0) {
               var8.m_R_No0 -= 2;
               var8.m_Reserve[1] = 80;
               var8.frameOutCheck(var1);
               return;
            }

            if (var8.m_Reserve[1] == 20) {
               var8.a(var1);
            }

            var8.frameOutCheck(var1);
            return;
         }
      case 167:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.y_Emy_Init(m);
            var8.m_R_No0 = 2;
            var8.m_Xspeed = (var8.m_Actflg & 1) == 0 ? -64 : 64;
            var8.m_Reserve[0] = 255;
            var8.m_Reserve[2] = 3;
            ((Action[])((Action[])var8.m_ReserveObj))[1] = var1.insertAction(var8, j);
            ((Action[])((Action[])var8.m_ReserveObj))[2] = var1.insertAction(var8, k);
            ((Action[])((Action[])var8.m_ReserveObj))[3] = var1.insertAction(var8, l);
            break;
         case 2:
            switch(var8.m_R_No1) {
            case 0:
               var8._chk_pl_dir(var1);
               var13 = var8.pldir_d2;
               var14 = var8.pldir_d3;
               var13 += 64;
               if (128 > var13 && 65408 < (var14 & '\uffff')) {
                  var8.m_R_No1 += 2;
                  var8.m_Reserve[3] = var8.m_Xspeed;
                  var8.m_Xspeed = 0;
                  var8.m_Reserve[1] = 16;
               } else if (--var8.m_Reserve[0] < 0) {
                  var8.m_Reserve[0] = 255;
                  var8.m_Xspeed = -var8.m_Xspeed;
                  var8.m_Actflg ^= 1;
                  var8.m_Cddat ^= 1;
               }
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            default:
               break;
            case 2:
               if (--var8.m_Reserve[1] < 0) {
                  var8.m_R_No1 += 2;
                  var8.m_Yspeed = 512;
                  boolean var12 = false;
                  var8.m_Reserve[1] = 64;
               }
               break;
            case 4:
               if (var8.m_Reserve[4] == 0) {
                  if (--var8.m_Reserve[1] != 0) {
                     if (var8.m_Reserve[1] == 32) {
                        var8.m_Yspeed = -var8.m_Yspeed;
                     }

                     var8.patchg(i);
                     if ((var7 = ((Action[])((Action[])var8.m_ReserveObj))[2]) != null) {
                        var7.m_Reserve[1] = 2;
                     }
                  } else {
                     var8.m_R_No1 = 0;
                     var8.m_Yspeed = 0;
                     var8.m_Xspeed = var8.m_Reserve[3];
                     var8.m_Patno = 0;
                  }
               } else {
                  var8.m_R_No1 += 2;
                  if ((var7 = ((Action[])((Action[])var8.m_ReserveObj))[0]) != null) {
                     var7.m_PlayerFlag = 129;
                     var7.m_Xspeed = 0;
                     var7.m_Yspeed = 0;
                     var7.m_Mstno = 14;
                     var7.m_DashMode = false;
                     var8.m_Patno = 1;
                     if (var8.m_Yspeed >= 0) {
                        var8.m_Yspeed = -var8.m_Yspeed;
                        var4 = -(var8.m_Reserve[1] - 64) + 1;
                        var8.m_Reserve[1] = var4;
                     }
                  }

                  var8.m_Reserve[0] = 272;
                  var8.m_Reserve[9] = 32;
               }
               break;
            case 6:
               var8.b(var1);
               var8.a();
               if (--var8.m_Reserve[1] == 0) {
                  var8.m_R_No1 += 2;
                  var8.m_Yspeed = 0;
               }
               break;
            case 8:
               var8.b(var1);
               var8.a();
               break;
            case 10:
               var8.b(var1);
            }

            var8.speedSet2();
            if (((Action[])((Action[])var8.m_ReserveObj))[2] != null) {
               ((Action[])((Action[])var8.m_ReserveObj))[2].m_Xposi = var8.m_Xposi;
               ((Action[])((Action[])var8.m_ReserveObj))[2].m_Yposi = var8.m_Yposi + 16;
            }

            if (((Action[])((Action[])var8.m_ReserveObj))[3] != null) {
               ((Action[])((Action[])var8.m_ReserveObj))[3].m_Xposi = var8.m_Xposi;
            }

            if (((Action[])((Action[])var8.m_ReserveObj))[1] != null) {
               ((Action[])((Action[])var8.m_ReserveObj))[1].m_Xposi = var8.m_Xposi;
            }

            State var11 = var1;
            ChemicalPlantAction var10 = var8;
            var8.frameOutCheck(var1);
            if (var8.m_Actno != 167) {
               if ((var4 = var8.m_Cdsts) != 0) {
                  var10000 = GameState.m_FlagWorkCnt;
                  var10000[var4 + 2] &= -129;
               }

               if (var8.m_Reserve[4] != 0 && (var5 = ((Action[])((Action[])var8.m_ReserveObj))[0]) != null) {
                  var5.m_PlayerFlag = 0;
                  var5.m_Cddat |= 2;
               }

               for(var13 = 0; var13 < 3; ++var13) {
                  if (((Action[])((Action[])var10.m_ReserveObj))[var13 + 1] != null) {
                     ((Action[])((Action[])var10.m_ReserveObj))[var13 + 1].frameOut(var11);
                  }
               }

               var10.frameOut(var11);
               var10.m_ReserveObj = null;
            }
         }

         if (var8.m_Xspeed <= 0) {
            if (var8.m_Xspeed < 0) {
               var8.m_Actflg &= -2;
               var8.m_Cddat &= -2;
            }

            return;
         }

         var8.m_Actflg |= 1;
         var8.m_Cddat |= 1;
         break;
      case 168:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.y_Emy_Init(n);
            var8.m_R_No0 += 2;
            var8.m_Patno = 3;
            return;
         case 1:
         case 3:
         case 5:
         default:
            return;
         case 2:
            if ((var5 = (Action)var8.m_ReserveObj) == null) {
               var8.frameOut(var1);
               return;
            } else if (var5.m_Actno != 167) {
               var8.frameOut(var1);
               return;
            } else {
               var9 = var8.m_Actflg & 252;
               var4 = var8.m_Cddat & 252;
               var3 = var5.m_Cddat & 252;
               var9 |= var3;
               var4 |= var3;
               var8.m_Actflg = var9;
               var8.m_Cddat = var4;
               var8.m_Patno = var5.m_Patno + 3;
               if ((var9 = var8.m_Colicnt) != 0) {
                  var8.m_Colicnt = 0;
                  if (var5.m_R_No1 == 4 && (var9 &= 3) != 0) {
                     var8.m_Colino = 0;
                     var8.m_R_No0 += 2;
                     var5.m_Reserve[4] = 1;
                     switch(var9) {
                     case 2:
                        ((Action[])((Action[])var5.m_ReserveObj))[0] = var1.getTailsAction();
                        if (((Action[])((Action[])var5.m_ReserveObj))[0] != null) {
                           var8.m_Reserve[0] = 2;
                        }
                        break;
                     default:
                        ((Action[])((Action[])var5.m_ReserveObj))[0] = var1.getSonicAction();
                        var8.m_Reserve[0] = 1;
                     }
                  }
               }

               if (var8.m_Reserve[1] != 0) {
                  var10002 = var8.m_Reserve[1]--;
                  var8.m_Mstno = 1;
                  var8.patchg(i);
               } else {
                  var8.m_Patno = 3;
               }

               return;
            }
         case 4:
            if ((var5 = (Action)var8.m_ReserveObj) == null) {
               var8.frameOut(var1);
               return;
            } else if ((var6 = ((Action[])((Action[])var5.m_ReserveObj))[0]) != null) {
               if (var5.m_Actno == 167) {
                  var6.m_Xposi = var8.m_Xposi;
                  var6.m_Yposi = var8.m_Yposi;
               } else {
                  var6.m_PlayerFlag = 0;
                  var6.m_Cddat |= 2;
                  var8.frameOut(var1);
               }

               return;
            } else {
               var8.m_R_No0 += 2;
               return;
            }
         case 6:
            if ((var5 = (Action)var8.m_ReserveObj) != null) {
               if (var5.m_Actno != 167) {
                  var8.frameOut(var1);
               }

               return;
            }

            var8.frameOut(var1);
            return;
         }
      case 169:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.y_Emy_Init(o);
            var8.m_R_No0 += 2;
            var8.m_Patno = 2;
            var8.m_Yposi -= 12;
            return;
         case 2:
            if ((var2 = (Action)var8.m_ReserveObj) == null) {
               var8.frameOut(var1);
               return;
            } else if (var2.m_Actno != 167) {
               var8.frameOut(var1);
            }
         default:
            return;
         }
      case 170:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.y_Emy_Init(p);
            var8.m_R_No0 += 2;
            var8.m_Yposi -= 8;
            return;
         case 2:
            if ((var2 = (Action)var8.m_ReserveObj) == null) {
               var8.frameOut(var1);
               return;
            } else if (var2.m_Actno != 167) {
               var8.frameOut(var1);
               return;
            } else {
               if ((var3 = var2.m_Yposi - var8.m_Yposi) < 0) {
                  var3 = 0;
               }

               var8.m_Patno = 5 + (var3 >> 3) % 10;
               return;
            }
         default:
            return;
         }
      case 171:
         switch((var8 = this).m_R_No0) {
         case 0:
            var8.m_R_No0 += 2;
            break;
         case 2:
            var8.frameOutCheck(var1);
         default:
            return;
         }
      }

   }

   public void render(Graphics var1) {
   }

   public static void prepareImages() {
      CommonAction.loadImages(165);
      CommonAction.loadImages(166);
      CommonAction.loadImages(167);
      CommonAction.loadImages(27);
      CommonAction.loadImages(11);
      CommonAction.loadImages(120);
      CommonAction.loadImages(123);
      CommonAction.loadImages(29);
      CommonAction.loadImages(50);
   }

   private void a(State var1) {
      Action var2;
      if ((var2 = var1.getSonicAction()) != null) {
         Action var3;
         if ((var3 = var1.insertAction(165)) != null) {
            var3.m_Actno = 165;
            var3.m_Userflag = 52;
            var3.m_Xposi = super.m_Xposi;
            var3.m_Yposi = super.m_Yposi;
            if (super.m_Actno == 165) {
               var3.m_Xspeed = var2.m_Xposi > super.m_Xposi ? 256 : -100;
               var3.m_Yspeed = -640;
            } else {
               var3.m_Xspeed = (super.m_Actflg & 1) == 0 ? 512 : -512;
               var3.m_Yspeed = 0;
            }

            var3.y_Emy_Init(d);
            var3.m_R_No0 = 6;
            var3.m_Patno = 3;
         }

      }
   }

   private void a(Action var1) {
      int var2 = var1.m_Xspeed;
      if ((super.m_Cddat & 1) != 0) {
         var2 = -var2;
      }

      if (4096 > var2) {
         var1.m_Xspeed = super.m_Reserve[0];
         var1.m_Cddat &= -2;
         if ((super.m_Cddat & 1) != 0) {
            var1.m_Cddat |= 1;
            var1.m_Xspeed = -var1.m_Xspeed;
         }

         var1.m_FallTimer = 15;
         var1.m_Mspeed = var1.m_Xspeed;
         super.m_Cddat &= -97;
         var1.m_Cddat &= -33;
      }

   }

   private void b(State var1) {
      if (super.m_Reserve[11] == 0) {
         super.m_Reserve[11] = 13;
         super.m_Patno = super.m_Patno == 0 ? 1 : 0;
      }

      int var10002 = super.m_Reserve[11]--;
      int var2 = super.m_Reserve[0] >> 8;
      int var3 = super.m_Reserve[0] & 255;
      --var2;
      Action var4;
      if (var2 == 0) {
         var2 = var3--;
         if (var3 == 0) {
            if ((var4 = var1.insertAction(39)) != null) {
               var4.m_Actno = 39;
               var4.m_R_No0 = 2;
               var4.m_Xposi = super.m_Xposi;
               var4.m_Yposi = super.m_Yposi;
            }

            super.m_Actno = 39;
            super.m_R_No0 = 2;
            super.m_Sproffset |= 32;
            if ((var4 = ((Action[])((Action[])super.m_ReserveObj))[0]) != null) {
               var4.m_PlayerFlag = 0;
               var4.m_Cddat |= 2;
               var4.m_Colino = 11;
               if ((var4.m_PlPower & 2) == 0) {
                  ((GameState)var1).playDamageSet(var4, this);
               } else {
                  var4.m_PlPower &= -3;
               }

               ((Action[])((Action[])super.m_ReserveObj))[0] = null;
            }

            super.m_Sproffset ^= 32;
         }
      }

      if (((Action[])((Action[])super.m_ReserveObj))[0] != null) {
         (var4 = ((Action[])((Action[])super.m_ReserveObj))[0]).m_PlayerFlag = 129;
         var4.m_Xspeed = 0;
         var4.m_Yspeed = 0;
         var4.m_Mstno = 14;
      }

      super.m_Reserve[0] = var2 << 8 | var3 & 255;
   }

   private void a() {
      int var1 = cCanvas.swRead();
      if (super.m_Reserve[5] == 0) {
         if ((var1 &= 12) != 0) {
            super.m_Reserve[5] = 1;
            super.m_Reserve[8] = var1;
         }

      } else if (--super.m_Reserve[9] == 0) {
         if (4 <= super.m_Reserve[10]) {
            super.m_R_No1 = 10;
            super.m_Yspeed = 0;
            super.m_Colino = 0;
            Action var2;
            if ((var2 = ((Action[])((Action[])super.m_ReserveObj))[0]) != null) {
               var2.m_PlayerFlag = 0;
               var2.m_Cddat |= 2;
               var2.m_Mstno = 0;
               ((Action[])((Action[])super.m_ReserveObj))[0] = null;
            }
         }

         super.m_Reserve[9] = 32;
         super.m_Reserve[5] = 0;
         super.m_Reserve[10] = 0;
      } else {
         if ((var1 &= 12) != super.m_Reserve[8]) {
            super.m_Reserve[8] = var1;
            int var10002 = super.m_Reserve[10]++;
         }

      }
   }

   private void a(Action var1, int var2) {
      if (var1 != null) {
         int var3 = super.m_Userflag & 255;
         int var4;
         int var5;
         int var6;
         int var7;
         boolean var11;
         int[] var10000;
         switch(super.m_Reserve[var2]) {
         case 0:
            var6 = super.m_Reserve[13];
            var4 = var1.m_Xposi - super.m_Xposi;
            var5 = var1.m_Yposi - super.m_Yposi;
            if (var6 > (var4 & '\uffff') && 128 > (var5 & '\uffff') && var1.m_Mstno != 32) {
               byte var10;
               if (160 == var6) {
                  var10 = 0;
               } else if (288 == var6) {
                  var10 = 8;
               } else {
                  var10 = 4;
                  var4 = 0 - var4 + 256;
               }

               if (128 <= (var4 & '\uffff')) {
                  if ((var6 = s[var3 >> 2 & 15]) == 2) {
                     var6 = GameState.m_PlTime >> 8 & 1;
                  }
               } else {
                  var6 = 2;
                  if (64 > (var5 & '\uffff')) {
                     var6 = 3;
                  }
               }

               super.m_Reserve[var2 + 1] = var6;
               var7 = var6 + var10 & 15;
               var11 = false;
               super.m_Reserve[var2 + 3] = u[var7].length - 1;
               var1.m_Xposi = u[var7][0][0] + super.m_Xposi;
               var1.m_Yposi = u[var7][0][1] + super.m_Yposi;
               super.m_Reserve[var2 + 5] = var7;
               super.m_Reserve[var2 + 4] = 1;
               var4 = u[var7][1][0] + super.m_Xposi;
               var5 = u[var7][1][1] + super.m_Yposi;
               var10000 = super.m_Reserve;
               var10000[var2] += 2;
               var1.m_PlayerFlag = 129;
               var1.m_Mstno = 2;
               var1.m_Mspeed = 2048;
               var1.m_Xspeed = 0;
               var1.m_Yspeed = 0;
               super.m_Cddat &= -33;
               var1.m_Cddat &= -33;
               var1.m_Cddat |= 2;
               var1.m_JumpFlag = 0;
               var1.m_Sproffset &= 32767;
               this.a(var1, 2048, var4, var5, var2);
               return;
            }

            return;
         case 1:
         case 3:
         case 5:
         default:
            return;
         case 2:
            if (--super.m_Reserve[var2 + 2] < 0) {
               var7 = super.m_Reserve[var2 + 5];
               var6 = super.m_Reserve[var2 + 4];
               var4 = u[var7][var6][0] + super.m_Xposi;
               var1.m_Xposi = var4;
               var5 = u[var7][var6][1] + super.m_Yposi;
               var1.m_Yposi = var5;
               if (super.m_Reserve[var2 + 1] >= 0) {
                  ++var6;
               } else {
                  --var6;
               }

               super.m_Reserve[var2 + 4] = var6;
               if (--super.m_Reserve[var2 + 3] != 0) {
                  var4 = u[var7][var6][0] + super.m_Xposi;
                  var5 = u[var7][var6][1] + super.m_Yposi;
                  this.a(var1, 2048, var4, var5, var2);
                  return;
               }

               if (4 > (super.m_Reserve[var2 + 1] & '\uffff')) {
                  byte var8 = t[(var3 & 252) + super.m_Reserve[var2 + 1]];
                  super.m_Reserve[var2 + 1] = 4;
                  if (var8 != 0) {
                     var3 = var2;
                     boolean var9 = false;
                     var11 = false;
                     if (var8 < 0) {
                        var2 = -var8;
                        super.m_Reserve[var3 + 1] = -4;
                        var5 = var2 + 12;
                        var2 = u[var5].length - 1;
                        super.m_Reserve[var3 + 3] = var2;
                        var1.m_Xposi = u[var5][var2][0];
                        var1.m_Yposi = u[var5][var2][1];
                        var6 = var2 - 1;
                     } else {
                        var5 = var8 + 12;
                        byte var12 = 0;
                        super.m_Reserve[var2 + 3] = u[var5].length - 1;
                        var1.m_Xposi = u[var5][0][0];
                        var1.m_Yposi = u[var5][0][1];
                        var6 = var12 + 1;
                     }

                     super.m_Reserve[var2 + 4] = var6;
                     super.m_Reserve[var2 + 5] = var5;
                     this.a(var1, 2048, u[var5][var6][0], u[var5][var6][1], var2);
                     var10000 = super.m_Reserve;
                     var10000[var2] += 2;
                     return;
                  }
               }

               var1.m_Yposi &= 2047;
               super.m_Reserve[var2] = 6;
               var1.m_PlayerFlag = 0;
               return;
            }

            var1.setXposi(var1.getXposi() + (var1.m_Xspeed << 8));
            var1.setYposi(var1.getYposi() + (var1.m_Yspeed << 8));
            return;
         case 4:
            if (--super.m_Reserve[var2 + 2] < 0) {
               var7 = super.m_Reserve[var2 + 5];
               var6 = super.m_Reserve[var2 + 4];
               var4 = u[var7][var6][0];
               var1.m_Xposi = var4;
               var5 = u[var7][var6][1];
               var1.m_Yposi = var5;
               if (super.m_Reserve[var2 + 1] >= 0) {
                  ++var6;
               } else {
                  --var6;
               }

               super.m_Reserve[var2 + 4] = var6;
               if (--super.m_Reserve[var2 + 3] != 0) {
                  var4 = u[var7][var6][0];
                  var5 = u[var7][var6][1];
                  this.a(var1, 2048, var4, var5, var2);
                  return;
               }

               var1.m_Yposi &= 2047;
               super.m_Reserve[var2] = 0;
               return;
            }

            var1.setXposi(var1.getXposi() + (var1.m_Xspeed << 8));
            var1.setYposi(var1.getYposi() + (var1.m_Yspeed << 8));
            return;
         case 6:
            var6 = super.m_Reserve[13];
            var4 = var1.m_Xposi - super.m_Xposi;
            if (var6 <= (var4 & '\uffff')) {
               super.m_Reserve[var2] = 0;
            } else {
               var5 = var1.m_Yposi - super.m_Yposi;
               if (128 <= (var5 & '\uffff')) {
                  super.m_Reserve[var2] = 0;
               }
            }
         }
      }
   }

   private void a(Action var1, int var2, int var3, int var4, int var5) {
      short var8 = 2048;
      int var6;
      if ((var6 = var3 - var1.m_Xposi) < 0) {
         var6 = -var6;
         var2 = -2048;
      }

      int var7;
      if ((var7 = var4 - var1.m_Yposi) < 0) {
         var7 = -var7;
         var8 = -2048;
      }

      if (var6 <= var7) {
         var7 = (var4 - var1.m_Yposi << 16) / var8;
         if ((var6 = var3 - var1.m_Xposi) != 0) {
            var6 = (var6 <<= 16) / var7;
         }

         var1.m_Xspeed = var6;
         var1.m_Yspeed = var8;
         if (var7 < 0) {
            var7 = -var7;
         }

         super.m_Reserve[var5 + 2] = var7 >> 8;
      } else {
         var6 = (var3 - var1.m_Xposi << 16) / var2;
         if ((var7 = var4 - var1.m_Yposi) != 0) {
            var7 = (var7 <<= 16) / var6;
         }

         var1.m_Yspeed = var7;
         var1.m_Xspeed = var2;
         if (var6 < 0) {
            var6 = -var6;
         }

         super.m_Reserve[var5 + 2] = var6 >> 8;
      }
   }

   private void b(Action var1) {
      super.m_Mstno = 1;
      super.m_Mstno_1 = 0;
      var1.m_Yposi += 4;
      var1.m_Yspeed = super.m_Reserve[0];
      var1.m_Cddat |= 2;
      var1.m_Cddat &= -9;
      var1.m_Mstno = 16;
      var1.m_R_No0 = 2;
      int var2;
      if (((var2 = super.m_Userflag & 255) & 128) != 0) {
         var1.m_Xspeed = 0;
      }

      if ((var2 & 1) != 0) {
         var1.m_Mspeed = 1;
         var1.m_Direc1 = 1;
         var1.m_Mstno = 0;
         var1.m_DirecCnt = 0;
         var1.m_DirecSpd = 4;
         if ((var2 & 2) == 0) {
            var1.m_DirecCnt = 1;
         }

         if ((var1.m_Cddat & 1) != 0) {
            var1.m_Direc1 = -var1.m_Direc1;
            var1.m_Mspeed = -var1.m_Mspeed;
         }
      }

      if ((var2 &= 12) == 4) {
         var1.m_Rideonwk = 4096;
         var1.m_Hitcolwk = 8192;
      } else {
         if (var2 == 8) {
            var1.m_Rideonwk = 16384;
            var1.m_Hitcolwk = 32768;
         }

      }
   }

   public static void disposeImages() {
      CommonAction.unloadImage(165);
      CommonAction.unloadImage(166);
      CommonAction.unloadImage(27);
      CommonAction.unloadImage(11);
      CommonAction.unloadImage(167);
      CommonAction.unloadImage(120);
      CommonAction.unloadImage(123);
      CommonAction.unloadImage(29);
      CommonAction.unloadImage(50);
      u = null;
      s = null;
      t = null;
   }
}
