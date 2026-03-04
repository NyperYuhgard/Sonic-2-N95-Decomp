package Coral.Math.FP;

public abstract class crlFP64 {
   private static int a = 24;
   private static int b = 8;
   private static long c = 16777216L;
   private static long d = 16777215L;
   private static long e = 100000000L;
   private static long f = 0L;
   private static long g = 52707178L;
   private static long[] h;
   public static long PI;
   public static long E;
   public static final long MAX_VALUE = Long.MAX_VALUE;
   public static final long MIN_VALUE = -9223372036854775807L;

   public static int setPrecision(int var0) {
      if (var0 <= 24 && var0 >= 0) {
         a = var0;
         c = 1L << var0;
         f = (long)(24 - var0);
         b = 0;
         e = 1L;
         d = c - 1L;
         PI = g >> (int)f;
         E = h[1] >> (int)f;

         for(long var1 = c; var1 != 0L; e *= 10L) {
            var1 /= 10L;
            ++b;
         }

         return b;
      } else {
         return b;
      }
   }

   public static int getPrecision() {
      return a;
   }

   public static long toLong(long var0) {
      return round(var0, 0) >> a;
   }

   public static long toFP(long var0) {
      return var0 << a;
   }

   public static long convert(long var0, int var2) {
      long var3 = var0 >= 0L ? 1L : -1L;
      if (abs((long)var2) < 25L) {
         if (a < var2) {
            var0 = var0 + var3 * (1L << (var2 - a >> 1)) >> var2 - a;
         } else {
            var0 <<= a - var2;
         }
      }

      return var0;
   }

   public static long toFP(String var0) {
      byte var1 = 0;
      if (var0.charAt(0) == '-') {
         var1 = 1;
      }

      String var2 = "-1";
      int var3;
      if ((var3 = var0.indexOf(46)) >= 0) {
         for(var2 = var0.substring(var3 + 1, var0.length()); var2.length() < b; var2 = var2 + "0") {
            if (var2.length() > b) {
               var2 = var2.substring(0, b);
            }
         }
      } else {
         var3 = var0.length();
      }

      long var4 = 0L;
      if (var1 != var3) {
         var4 = Long.parseLong(var0.substring(var1, var3));
      }

      long var6 = Long.parseLong(var2) + 1L;
      long var8 = (var4 << a) + (var6 << a) / e;
      if (var1 == 1) {
         var8 = -var8;
      }

      return var8;
   }

   public static String toString(long var0) {
      boolean var2 = false;
      if (var0 < 0L) {
         var2 = true;
         var0 = -var0;
      }

      long var3 = var0 >> a;

      String var7;
      for(var7 = Long.toString(e * (var0 & d) >> a); var7.length() < b; var7 = "0" + var7) {
      }

      return (var2 ? "-" : "") + Long.toString(var3) + "." + var7;
   }

   public static String toString(long var0, int var2) {
      if (var2 > b) {
         var2 = b;
      }

      String var3;
      return (var3 = toString(round(var0, var2))).substring(0, var3.length() - b + var2);
   }

   public static long max(long var0, long var2) {
      return var0 >= var2 ? var0 : var2;
   }

   public static long min(long var0, long var2) {
      return var2 >= var0 ? var0 : var2;
   }

   public static long round(long var0, int var2) {
      long var3 = 10L;

      for(int var5 = 0; var5 < var2; ++var5) {
         var3 *= 10L;
      }

      var3 = div(toFP(5L), toFP(var3));
      if (var0 < 0L) {
         var3 = -var3;
      }

      return var0 + var3;
   }

   public static long mul(long var0, long var2) {
      boolean var4 = false;
      int var5 = a;
      long var6 = d;
      if ((var0 & var6) == 0L) {
         return (var0 >> var5) * var2;
      } else if ((var2 & var6) == 0L) {
         return var0 * (var2 >> var5);
      } else {
         if (var0 < 0L && var2 > 0L || var0 > 0L && var2 < 0L) {
            var4 = true;
         }

         if (var0 < 0L) {
            var0 = -var0;
         }

         if (var2 < 0L) {
            var2 = -var2;
         }

         while(max(var0, var2) >= 1L << 63 - var5) {
            var0 >>= 1;
            var2 >>= 1;
            var6 >>= 1;
            --var5;
         }

         long var8 = (var0 >> var5) * (var2 >> var5) << var5;
         long var10 = ((var0 & var6) * (var2 & var6) >> var5) + ((var0 & ~var6) * (var2 & var6) >> var5);
         if ((var8 = var8 + var10 + ((var0 & var6) * (var2 & ~var6) >> var5) << a - var5) < 0L) {
            throw new ArithmeticException("Overflow");
         } else {
            return var4 ? -var8 : var8;
         }
      }
   }

   public static long div(long var0, long var2) {
      boolean var4 = false;
      int var5 = a;
      if (var2 == c) {
         return var0;
      } else if ((var2 & d) == 0L) {
         return var0 / (var2 >> var5);
      } else {
         if (var0 < 0L && var2 > 0L || var0 > 0L && var2 < 0L) {
            var4 = true;
         }

         if (var0 < 0L) {
            var0 = -var0;
         }

         if (var2 < 0L) {
            var2 = -var2;
         }

         while(max(var0, var2) >= 1L << 63 - var5) {
            var0 >>= 1;
            var2 >>= 1;
            --var5;
         }

         long var6 = (var0 << var5) / var2 << a - var5;
         return var4 ? -var6 : var6;
      }
   }

   public static long add(long var0, long var2) {
      return var0 + var2;
   }

   public static long sub(long var0, long var2) {
      return var0 - var2;
   }

   public static long abs(long var0) {
      return var0 < 0L ? -var0 : var0;
   }

   public static long sqrt(long var0, int var2) {
      if (var0 < 0L) {
         throw new ArithmeticException("Bad Input ");
      } else if (var0 == 0L) {
         return 0L;
      } else {
         long var3 = var0 + c >> 1;

         for(int var5 = 0; var5 < var2; ++var5) {
            var3 = var3 + div(var0, var3) >> 1;
         }

         if (var3 < 0L) {
            throw new ArithmeticException("Overflow");
         } else {
            return var3;
         }
      }
   }

   public static long sqrt(long var0) {
      return sqrt(var0, 24);
   }

   public static long sin(long var0) {
      long var2;
      if ((var2 = mul(var0, div(toFP(180L), PI)) % toFP(360L)) < 0L) {
         var2 += toFP(360L);
      }

      long var4 = var2;
      if (var2 >= toFP(90L) && var2 < toFP(270L)) {
         var4 = toFP(180L) - var2;
      } else if (var2 >= toFP(270L) && var2 < toFP(360L)) {
         var4 = -(toFP(360L) - var2);
      }

      long var6;
      long var8 = mul(var6 = var4 / 90L, var6);
      return mul(mul(mul(mul(-73190L >> (int)f, var8) + (1333581L >> (int)f), var8) - (10836755L >> (int)f), var8) + (long)(26353564 >> (int)f), var6);
   }

   public static long asin(long var0) {
      if (abs(var0) > c) {
         throw new ArithmeticException("Bad Input");
      } else {
         boolean var2 = var0 < 0L;
         var0 = abs(var0);
         long var3 = mul(mul(mul(mul((long)(145103 >> (int)f), var0) - (long)(599880 >> (int)f), var0) + (long)(1420468 >> (int)f), var0) - (long)(3592413 >> (int)f), var0) + (long)(26353447 >> (int)f);
         long var5 = PI / 2L - mul(sqrt(c - var0), var3);
         return var2 ? -var5 : var5;
      }
   }

   public static long cos(long var0) {
      return sin(PI / 2L - var0);
   }

   public static long acos(long var0) {
      return PI / 2L - asin(var0);
   }

   public static long tan(long var0) {
      return div(sin(var0), cos(var0));
   }

   public static long cot(long var0) {
      return div(cos(var0), sin(var0));
   }

   public static long atan(long var0) {
      return asin(div(var0, sqrt(c + mul(var0, var0))));
   }

   public static long exp(long var0) {
      if (var0 == 0L) {
         return c;
      } else {
         boolean var2 = var0 < 0L;
         int var3 = (int)((var0 = abs(var0)) >> a);
         long var4 = c;

         for(int var6 = 0; var6 < var3 / 4; ++var6) {
            var4 = mul(var4, h[4] >> (int)f);
         }

         if (var3 % 4 > 0) {
            var4 = mul(var4, h[var3 % 4] >> (int)f);
         }

         if ((var0 &= d) > 0L) {
            long var12 = c;
            long var8 = 0L;
            long var10 = 1L;

            for(var3 = 0; var3 < 16; ++var3) {
               var8 += var12 / var10;
               var12 = mul(var12, var0);
               if ((var10 *= (long)(var3 + 1)) > var12 || var12 <= 0L || var10 <= 0L) {
                  break;
               }
            }

            var4 = mul(var4, var8);
         }

         if (var2) {
            var4 = div(c, var4);
         }

         return var4;
      }
   }

   public static long log(long var0) {
      if (var0 <= 0L) {
         throw new ArithmeticException("Bad Input");
      } else {
         long var2 = 0L;

         int var4;
         for(var4 = 0; var0 >= c << 1; ++var4) {
            var0 >>= 1;
         }

         long var5 = (long)var4 * (long)(11629080 >> (int)f);
         long var7 = 0L;
         if (var0 < c) {
            return -log(div(c, var0));
         } else {
            var0 -= c;

            for(var4 = 1; var4 < 20; ++var4) {
               long var10;
               if (var2 == 0L) {
                  var10 = var0;
               } else {
                  var10 = mul(var2, var0);
               }

               if (var10 == 0L) {
                  break;
               }

               var7 += (var4 % 2 != 0 ? 1L : -1L) * var10 / (long)var4;
               var2 = var10;
            }

            return var5 + var7;
         }
      }
   }

   public static long pow(long var0, long var2) {
      boolean var4 = var2 < 0L;
      long var5 = c;

      for(int var7 = (int)(var2 = abs(var2)) >> a; var7-- > 0; var5 = mul(var5, var0)) {
      }

      if (var5 < 0L) {
         throw new ArithmeticException("Overflow");
      } else {
         if (var0 != 0L) {
            var5 = mul(var5, exp(mul(log(var0), var2 & d)));
         } else {
            var5 = 0L;
         }

         return var4 ? div(c, var5) : var5;
      }
   }

   public static long atan2(long var0, long var2) {
      long var4 = 0L;
      if (var2 > 0L) {
         var4 = atan(div(var0, var2));
      } else if (var2 < 0L) {
         var4 = (var2 >= 0L ? PI : -PI) - atan(abs(div(var0, var2)));
      } else {
         if (var2 == 0L && var0 == 0L) {
            throw new ArithmeticException("Bad Input");
         }

         var4 = (var0 >= 0L ? PI : -PI) / 2L;
      }

      return var4;
   }

   static {
      h = new long[]{c, 45605201L, 123967790L, 336979391L, 916004956L};
      PI = g;
      E = h[1];
   }
}
