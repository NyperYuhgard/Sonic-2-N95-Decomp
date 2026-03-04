package Coral.Math.Float;

public class crlMath {
   public static final float TOL = 1.0E-6F;
   public static final double SQRT3 = 1.7320508075688772D;
   public static final double LOG10 = 2.302585092994046D;
   public static final double LOGdiv2 = -0.6931471805599453D;
   public static final double PIdiv2 = 1.5707963267948966D;
   public static final double PIdiv6 = 0.5235987755982988D;
   public static final double PIdiv12 = 0.2617993877991494D;
   public static final double PI2 = 6.283185307179586D;
   public static final double PIinv = 0.3183098861837907D;
   public static final double PI2inv = 0.15915494309189535D;
   public static final double DEGTORAD = 0.017453292942564074D;
   public static final double RADTODEG = 57.29577951308232D;
   public static final float MPSTOMPH = 2.24F;
   public static final float MPSTOKMH = 3.6F;
   public static final float MPHTOMPS = 0.447F;
   public static final float PIf = 3.1415927F;
   public static final float PI2f = 6.2831855F;
   public static final float PIdiv2f = 1.5707963F;
   public static final float PIdiv12f = 0.2617994F;
   public static final float PIdiv6f = 0.5235988F;
   public static final float PI2invf = 0.15915494F;
   public static final float SQRT3f = 1.7320508F;
   public static final float DEGTORADf = 0.017453294F;
   public static final float RADTODEGf = 57.295776F;

   public static double acos(double var0) {
      double var2;
      return (var2 = asin(var0)) == Double.NaN ? var2 : 1.5707963267948966D - var2;
   }

   public static double asin(double var0) {
      if (!(var0 < -1.0D) && !(var0 > 1.0D)) {
         if (var0 == -1.0D) {
            return -1.5707963267948966D;
         } else {
            return var0 == 1.0D ? 1.5707963267948966D : atan(var0 / Math.sqrt(1.0D - var0 * var0));
         }
      } else {
         return Double.NaN;
      }
   }

   public static double atan(double var0) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = 0;
      if (var0 < 0.0D) {
         var0 = -var0;
         var2 = true;
      }

      if (var0 > 1.0D) {
         var0 = 1.0D / var0;
         var3 = true;
      }

      double var7;
      while(var0 > 0.2617993877991494D) {
         ++var4;
         var7 = var0 + 1.7320508075688772D;
         var7 = 1.0D / var7;
         var0 = ((var0 *= 1.7320508075688772D) - 1.0D) * var7;
      }

      double var5;
      var7 = (var5 = var0 * var0) + 1.4087812D;

      for(var7 = ((var7 = 0.55913709D / var7) + 0.60310579D - var5 * 0.05160454D) * var0; var4 > 0; --var4) {
         var7 += 0.5235987755982988D;
      }

      if (var3) {
         var7 = 1.5707963267948966D - var7;
      }

      if (var2) {
         var7 = -var7;
      }

      return var7;
   }

   public static float acosf(float var0) {
      return (var0 = asinf(var0)) == Float.NaN ? var0 : 1.5707963F - var0;
   }

   public static float asinf(float var0) {
      if (!(var0 < -1.0F) && !(var0 > 1.0F)) {
         if (var0 == -1.0F) {
            return -1.5707963F;
         } else {
            return var0 == 1.0F ? 1.5707963F : atanf(var0 / (float)Math.sqrt((double)(1.0F - var0 * var0)));
         }
      } else {
         return Float.NaN;
      }
   }

   public static float atanf(float var0) {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = 0;
      if (var0 < 0.0F) {
         var0 = -var0;
         var1 = true;
      }

      if (var0 > 1.0F) {
         var0 = 1.0F / var0;
         var2 = true;
      }

      float var5;
      while(var0 > 0.2617994F) {
         ++var3;
         var5 = var0 + 1.7320508F;
         var5 = 1.0F / var5;
         var0 = ((var0 *= 1.7320508F) - 1.0F) * var5;
      }

      float var4;
      var5 = (var4 = var0 * var0) + 1.4087812F;

      for(var5 = ((var5 = 0.5591371F / var5) + 0.6031058F - var4 * 0.05160454F) * var0; var3 > 0; --var3) {
         var5 += 0.5235988F;
      }

      if (var2) {
         var5 = 1.5707963F - var5;
      }

      if (var1) {
         var5 = -var5;
      }

      return var5;
   }

   public static double atan2(double var0, double var2) {
      if (var0 == 0.0D && var2 == 0.0D) {
         return 0.0D;
      } else if (var2 > 0.0D) {
         return atan(var0 / var2);
      } else if (var2 < 0.0D) {
         return var0 < 0.0D ? -(3.141592653589793D - atan(var0 / var2)) : 3.141592653589793D - atan(-var0 / var2);
      } else {
         return var0 < 0.0D ? -1.5707963267948966D : 1.5707963267948966D;
      }
   }

   public static float fast_atan2(float var0, float var1) {
      if (var1 == 0.0F) {
         if (var0 > 0.0F) {
            return 1.5707963F;
         } else {
            return var0 == 0.0F ? 0.0F : -1.5707963F;
         }
      } else {
         float var2;
         if (((var2 = var0 / var1) < 0.0F ? -var2 : var2) < 1.0F) {
            var2 /= 1.0F + 0.28F * var2 * var2;
            if (var1 < 0.0F) {
               if (var0 < 0.0F) {
                  return var2 - 3.1415927F;
               }

               return var2 + 3.1415927F;
            }
         } else {
            var2 = 1.5707963F - var2 / (var2 * var2 + 0.28F);
            if (var0 < 0.0F) {
               return var2 - 3.1415927F;
            }
         }

         return var2;
      }
   }

   public static float invSqrt(float var0) {
      float var1 = 0.5F * var0;
      int var2 = Float.floatToIntBits(var0);
      return (var0 = Float.intBitsToFloat(var2 = 1597463174 - (var2 >> 1))) * (1.5F - var1 * var0 * var0);
   }

   public static double exp(double var0) {
      if (var0 == 0.0D) {
         return 1.0D;
      } else {
         double var2 = 1.0D;
         boolean var6;
         if (var6 = var0 < 0.0D) {
            var0 = -var0;
         }

         double var4 = var0 / 0.0D;

         for(long var7 = 2L; var7 < 50L; ++var7) {
            var2 += var4;
            var4 = var4 * var0 / (double)var7;
         }

         return var6 ? 1.0D / var2 : var2;
      }
   }

   private static double a(double var0) {
      if (!(var0 > 0.0D)) {
         return Double.NaN;
      } else {
         double var2 = 0.0D;

         int var4;
         for(var4 = 0; var0 > 0.0D && var0 <= 1.0D; ++var4) {
            var0 *= 2.0D;
         }

         var0 /= 2.0D;
         --var4;
         double var5 = var0 - 1.0D;
         double var7 = var0 + 1.0D;
         double var9;
         double var11;
         var7 = (var11 = var9 = var5 / var7) * var9;

         for(long var13 = 1L; var13 < 50L; var13 += 2L) {
            var2 += var11 / (double)var13;
            var11 *= var7;
         }

         var2 *= 2.0D;

         for(int var15 = 0; var15 < var4; ++var15) {
            var2 += -0.6931471805599453D;
         }

         return var2;
      }
   }

   public static double log(double var0) {
      if (!(var0 > 0.0D)) {
         return Double.NaN;
      } else if (var0 == 1.0D) {
         return 0.0D;
      } else {
         return var0 > 1.0D ? -a(var0 = 1.0D / var0) : a(var0);
      }
   }

   public static double log10(double var0) {
      return log(var0) / 2.302585092994046D;
   }

   public static final float round2dp(float var0) {
      return (float)((int)((var0 + 0.005F) * 100.0F)) / 100.0F;
   }

   public static final double round2dp(double var0) {
      return (double)((float)((int)((var0 + 0.005D) * 100.0D)) / 100.0F);
   }

   public static final float clamp(float var0, float var1, float var2) {
      return Math.min(Math.max(var0, var1), var2);
   }

   public static final double clamp(double var0, double var2, double var4) {
      return Math.min(Math.max(var0, var2), var4);
   }

   public static final float lerp(float var0, float var1, float var2) {
      return var1 + (var2 - var1) * var0;
   }

   public static final double lerp(double var0, double var2, double var4) {
      return var2 + (var4 - var2) * var0;
   }

   public static final float sgn(float var0) {
      return var0 < 0.0F ? -1.0F : 1.0F;
   }

   public static final void calcNorms(crlV4 var0, crlV4 var1, crlV4 var2, crlV4 var3, crlV4 var4, crlV4 var5) {
      float var6 = var1.x - var0.x;
      float var7 = var1.y - var0.y;
      float var11 = var1.z - var0.z;
      float var8 = var2.x - var0.x;
      float var9 = var2.y - var0.y;
      float var10 = var2.z - var0.z;
      var4.x = var7 * var10 - var11 * var9;
      var4.y = var11 * var8 - var6 * var10;
      var4.z = var6 * var9 - var7 * var8;
      var11 = 1.0F / (float)Math.sqrt((double)(var4.x * var4.x + var4.y * var4.y + var4.z * var4.z));
      var4.x *= var11;
      var4.y *= var11;
      var4.z *= var11;
      var5.x = var2.x - var0.x;
      var5.y = var2.y - var0.y;
      var5.z = var2.z - var0.z;
      var11 = 1.0F / (float)Math.sqrt((double)(var5.x * var5.x + var5.y * var5.y + var5.z * var5.z));
      var5.x *= var11;
      var5.y *= var11;
      var5.z *= var11;
      var3.x = var4.y * var5.z - var4.z * var5.y;
      var3.y = var4.z * var5.x - var4.x * var5.z;
      var3.z = var4.x * var5.y - var4.y * var5.x;
   }
}
