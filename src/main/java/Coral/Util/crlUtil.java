package Coral.Util;

import Coral.crlCanvas;

public class crlUtil {
   public static final void garbageWait() {
      try {
         System.gc();
         System.gc();
         Thread.sleep(500L);
         Thread.yield();
      } catch (Exception var0) {
      }
   }

   public static final void wait(int var0) {
      try {
         Thread.sleep((long)var0);
      } catch (InterruptedException var1) {
      }
   }

   public static final void quickSort(int[] var0, int var1, int var2) {
      int var3 = var1;
      int var4 = var2;
      int var5 = (var1 + var2) / 2;
      var5 = var0[var5];
      int var8 = var2 + 1;
      int var9 = var1 - 1;

      while(var9 + 1 < var8) {
         int var6;
         for(var6 = var0[var3]; var3 < var8 && var6 < var5; var6 = var0[var3]) {
            var9 = var3++;
         }

         while(true) {
            int var7 = var0[var4];
            if (var9 > var4 || var7 <= var5) {
               if (var3 == var4) {
                  var9 = var3;
               } else if (var3 < var4 && var6 >= var7) {
                  var0[var3] = var7;
                  var0[var4] = var6;
                  var8 = var4;
                  var9 = var3++;
                  --var4;
               }
               break;
            }

            var8 = var4--;
         }
      }

      if (var1 < var9) {
         quickSort(var0, var1, var9);
      }

      if (var8 < var2) {
         quickSort(var0, var8, var2);
      }

   }

   public static final void quickSort(long[] var0, int var1, int var2) {
      int var3 = var1;
      int var4 = var2;
      int var5 = (var1 + var2) / 2;
      long var6 = var0[var5];
      var5 = var2 + 1;
      int var12 = var1 - 1;

      while(var12 + 1 < var5) {
         long var8;
         for(var8 = var0[var3]; var3 < var5 && var8 < var6; var8 = var0[var3]) {
            var12 = var3++;
         }

         while(true) {
            long var10 = var0[var4];
            if (var12 > var4 || var10 <= var6) {
               if (var3 == var4) {
                  var12 = var3;
               } else if (var3 < var4 && var8 >= var10) {
                  var0[var3] = var10;
                  var0[var4] = var8;
                  var5 = var4;
                  var12 = var3++;
                  --var4;
               }
               break;
            }

            var5 = var4--;
         }
      }

      if (var1 < var12) {
         quickSort(var0, var1, var12);
      }

      if (var5 < var2) {
         quickSort(var0, var5, var2);
      }

   }

   public static final short toShortIntel(byte[] var0, int var1) {
      return (short)((var0[var1] & 255) + ((var0[var1 + 1] & 255) << 8));
   }

   public static final short toShort(byte[] var0, int var1) {
      return (short)((var0[var1 + 1] & 255) + ((var0[var1] & 255) << 8));
   }

   public static final int toIntIntel(byte[] var0, int var1) {
      return (var0[var1] & 255) + ((var0[var1 + 1] & 255) << 8) + ((var0[var1 + 2] & 255) << 16) + ((var0[var1 + 3] & 255) << 24);
   }

   public static final int toInt(byte[] var0, int var1) {
      return (var0[var1 + 3] & 255) + ((var0[var1 + 2] & 255) << 8) + ((var0[var1 + 1] & 255) << 16) + ((var0[var1] & 255) << 24);
   }

   public static final boolean isBitSet(int var0, int var1) {
      return (var0 & 1 << var1) != 0;
   }

   public static final int findLSB(int var0) {
      for(int var1 = 0; var1 < 32; ++var1) {
         if ((var0 >> var1 & 1) != 0) {
            return var1;
         }
      }

      return 0;
   }

   public static final int findHSB(int var0) {
      for(int var1 = 0; var1 < 32; ++var1) {
         if ((var0 << var1 & Integer.MIN_VALUE) != 0) {
            return 31 - var1;
         }
      }

      return 0;
   }

   public static final String toHEX(long var0) {
      int var2 = (int)var0;
      int var3 = (int)(var0 >> 32);
      return (Integer.toHexString(var3) + Integer.toHexString(var2)).toUpperCase();
   }

   public static final int[] loadIntArray(crlBinArray var0) {
      return loadIntArray(var0.getArray(), var0.getLength(), var0.getOffset());
   }

   public static final int[] loadIntArray(byte[] var0, int var1, int var2) {
      int var3;
      int[] var6 = new int[var3 = var1 >> 2];
      int var4 = 0;

      for(int var5 = 0; var5 < var1; var5 += 4) {
         var6[var4] = toInt(var0, var5 + var2);
         ++var4;
      }

      return var6;
   }

   public static final void loadByteArray(int[] var0, int var1, int var2, byte[] var3, int var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         for(int var6 = 0; var6 < 4; ++var6) {
            var3[var4 + (var5 << 2) + var6] = getByte(var0[var2 + var5], var6 + 1);
         }
      }

   }

   public static final byte getByte(int var0, int var1) {
      var1 = 4 - var1 << 3;
      return (byte)(var0 >> var1);
   }

   public static int randInt(int var0, int var1) {
      return (int)randLong((long)var0, (long)var1);
   }

   public static int randDist(int[] var0) {
      int var1 = 0;
      int var2 = -1;

      int var3;
      for(var3 = 0; var3 < var0.length; ++var3) {
         if ((var1 += var0[var3]) > 0 && var2 == -1) {
            var2 = var3;
         }
      }

      if ((var3 = randInt(var0[var2], var1)) == 0) {
         return var2;
      } else {
         var1 = 0;

         for(int var4 = 0; var4 < var0.length; ++var4) {
            int var5;
            if ((var5 = var0[var4]) + var1 >= var3) {
               return var4;
            }

            var1 += var5;
         }

         return var2;
      }
   }

   public static long randLong(long var0, long var2) {
      long var4;
      return (var4 = Math.abs(var2 - var0) + 1L) == 1L ? var0 : Math.abs(crlCanvas.gRandom.nextLong()) % var4 + var0;
   }

   public static final long clamp(long var0, long var2) {
      if (var0 > var2) {
         var0 = var2;
      } else if (var0 < -var2) {
         var0 = -var2;
      }

      return var0;
   }

   public static final long clamp(long var0, long var2, long var4) {
      if (var2 > var4) {
         return var4;
      } else {
         return var2 < var0 ? var0 : var2;
      }
   }

   public static final int clamp(int var0, int var1) {
      if (var0 > var1) {
         var0 = var1;
      } else if (var0 < -var1) {
         var0 = -var1;
      }

      return var0;
   }

   public static final boolean sign(int var0) {
      return var0 >= 0;
   }

   public static final int clamp(int var0, int var1, int var2) {
      if (var1 > var2) {
         return var2;
      } else {
         return var1 < var0 ? var0 : var1;
      }
   }

   public static final boolean hasFlag(int var0, int var1) {
      return (var0 & var1) == var1;
   }

   public static final float[] loadFloatArray(crlBinArray var0) {
      return loadFloatArray(var0.getArray(), var0.getLength(), var0.getOffset());
   }

   public static final float[] loadFloatArray(byte[] var0, int var1, int var2) {
      int var3;
      float[] var6 = new float[var3 = var1 >> 2];
      int var4 = 0;

      for(int var5 = 0; var5 < var1; var5 += 4) {
         var6[var4] = Float.intBitsToFloat(toInt(var0, var5 + var2));
         ++var4;
      }

      return var6;
   }

   public static final float getFloatFromArray(crlBinArray var0, int var1) {
      return getFloatFromArray(var0.getArray(), var0.getLength(), var0.getOffset() + (var1 << 2));
   }

   public static final float getFloatFromArray(byte[] var0, int var1, int var2) {
      return Float.intBitsToFloat(toInt(var0, var2));
   }
}
