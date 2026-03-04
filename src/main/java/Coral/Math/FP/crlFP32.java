package Coral.Math.FP;

public abstract class crlFP32 {
   private static int a = 12;
   private static int b = 4;
   private static int c = 4096;
   private static int d = 4095;
   private static int e = 10000;
   private static int f = 0;
   private static int g = 12868;
   private static int[] h;
   public static int PI;
   public static int E;
   public static final int MAX_VALUE = Integer.MAX_VALUE;
   public static final int MIN_VALUE = -2147483647;

   public static int setPrecision(int var0) {
      if (var0 <= 12 && var0 >= 0) {
         a = var0;
         c = 1 << var0;
         f = 12 - var0;
         b = 0;
         e = 1;
         d = c - 1;
         PI = g >> f;
         E = h[1] >> f;

         for(var0 = c; var0 != 0; e *= 10) {
            var0 /= 10;
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

   public static int toInt(int var0) {
      return round(var0, 0) >> a;
   }

   public static int toFP(int var0) {
      return var0 << a;
   }

   public static int convert(int var0, int var1) {
      byte var2 = (byte)(var0 >= 0 ? 1 : -1);
      if (abs(var1) < 13) {
         if (a < var1) {
            var0 = var0 + var2 * (1 << (var1 - a >> 1)) >> var1 - a;
         } else {
            var0 <<= a - var1;
         }
      }

      return var0;
   }

   public static int toFP(String var0) {
      byte var1 = 0;
      if (var0.charAt(0) == '-') {
         var1 = 1;
      }

      String var2 = "-1";
      int var3;
      if ((var3 = var0.indexOf(46)) >= 0) {
         for(var2 = var0.substring(var3 + 1, var0.length()); var2.length() < b; var2 = var2 + "0") {
         }

         if (var2.length() > b) {
            var2 = var2.substring(0, b);
         }
      } else {
         var3 = var0.length();
      }

      int var4 = 0;
      if (var1 != var3) {
         var4 = Integer.parseInt(var0.substring(var1, var3));
      }

      int var5 = Integer.parseInt(var2) + 1;
      var5 = (var4 << a) + (var5 << a) / e;
      if (var1 == 1) {
         var5 = -var5;
      }

      return var5;
   }

   public static String toString(int var0) {
      boolean var1 = false;
      if (var0 < 0) {
         var1 = true;
         var0 = -var0;
      }

      int var2 = var0 >> a;

      String var3;
      for(var3 = Integer.toString(e * (var0 & d) >> a); var3.length() < b; var3 = "0" + var3) {
      }

      return (var1 ? "-" : "") + Integer.toString(var2) + "." + var3;
   }

   public static String toString(int var0, int var1) {
      if (var1 > b) {
         var1 = b;
      }

      String var2;
      return (var2 = toString(round(var0, var1))).substring(0, var2.length() - b + var1);
   }

   public static int max(int var0, int var1) {
      return var0 >= var1 ? var0 : var1;
   }

   public static int min(int var0, int var1) {
      return var1 >= var0 ? var0 : var1;
   }

   public static int round(int var0, int var1) {
      int var2 = 10;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 *= 10;
      }

      var2 = div(toFP(5), toFP(var2));
      if (var0 < 0) {
         var2 = -var2;
      }

      return var0 + var2;
   }

   public static int mul(int var0, int var1) {
      boolean var2 = false;
      int var3 = a;
      int var4 = d;
      if ((var0 & var4) == 0) {
         return (var0 >> var3) * var1;
      } else if ((var1 & var4) == 0) {
         return var0 * (var1 >> var3);
      } else {
         if (var0 < 0 && var1 > 0 || var0 > 0 && var1 < 0) {
            var2 = true;
         }

         if (var0 < 0) {
            var0 = -var0;
         }

         if (var1 < 0) {
            var1 = -var1;
         }

         while(max(var0, var1) >= 1 << 31 - var3) {
            var0 >>= 1;
            var1 >>= 1;
            var4 >>= 1;
            --var3;
         }

         int var5 = (var0 >> var3) * (var1 >> var3) << var3;
         int var6 = ((var0 & var4) * (var1 & var4) >> var3) + ((var0 & ~var4) * (var1 & var4) >> var3);
         if ((var5 = var5 + var6 + ((var0 & var4) * (var1 & ~var4) >> var3) << a - var3) < 0) {
            throw new ArithmeticException("Overflow");
         } else {
            return var2 ? -var5 : var5;
         }
      }
   }

   public static int div(int var0, int var1) {
      boolean var2 = false;
      int var3 = a;
      if (var1 == c) {
         return var0;
      } else if ((var1 & d) == 0) {
         return var0 / (var1 >> var3);
      } else {
         if (var0 < 0 && var1 > 0 || var0 > 0 && var1 < 0) {
            var2 = true;
         }

         if (var0 < 0) {
            var0 = -var0;
         }

         if (var1 < 0) {
            var1 = -var1;
         }

         while(max(var0, var1) >= 1 << 31 - var3) {
            var0 >>= 1;
            var1 >>= 1;
            --var3;
         }

         var0 = (var0 << var3) / var1 << a - var3;
         return var2 ? -var0 : var0;
      }
   }

   public static int add(int var0, int var1) {
      return var0 + var1;
   }

   public static int sub(int var0, int var1) {
      return var0 - var1;
   }

   public static int abs(int var0) {
      return var0 < 0 ? -var0 : var0;
   }

   public static int sqrt(int var0, int var1) {
      if (var0 < 0) {
         throw new ArithmeticException("Bad Input");
      } else if (var0 == 0) {
         return 0;
      } else {
         int var2 = var0 + c >> 1;

         for(int var3 = 0; var3 < var1; ++var3) {
            var2 = var2 + div(var0, var2) >> 1;
         }

         if (var2 < 0) {
            throw new ArithmeticException("Overflow");
         } else {
            return var2;
         }
      }
   }

   public static int sqrt(int var0) {
      return sqrt(var0, 16);
   }

   public static int sin(int var0) {
      if ((var0 = mul(var0, div(toFP(180), PI)) % toFP(360)) < 0) {
         var0 += toFP(360);
      }

      int var1 = var0;
      if (var0 >= toFP(90) && var0 < toFP(270)) {
         var1 = toFP(180) - var0;
      } else if (var0 >= toFP(270) && var0 < toFP(360)) {
         var1 = -(toFP(360) - var0);
      }

      var1 = mul(var0 = var1 / 90, var0);
      return mul(mul(mul(mul(-18 >> f, var1) + (326 >> f), var1) - (2646 >> f), var1) + (6434 >> f), var0);
   }

   public static int asin(int var0) {
      if (abs(var0) > c) {
         throw new ArithmeticException("Bad Input");
      } else {
         boolean var1 = var0 < 0;
         if (var0 < 0) {
            var0 = -var0;
         }

         int var2 = mul(mul(mul(mul(35 >> f, var0) - (146 >> f), var0) + (347 >> f), var0) - (877 >> f), var0) + (6434 >> f);
         var0 = PI / 2 - mul(sqrt(c - var0), var2);
         return var1 ? -var0 : var0;
      }
   }

   public static int cos(int var0) {
      return sin(PI / 2 - var0);
   }

   public static int acos(int var0) {
      return PI / 2 - asin(var0);
   }

   public static int tan(int var0) {
      return div(sin(var0), cos(var0));
   }

   public static int cot(int var0) {
      return div(cos(var0), sin(var0));
   }

   public static int atan(int var0) {
      return asin(div(var0, sqrt(c + mul(var0, var0))));
   }

   public static int exp(int var0) {
      if (var0 == 0) {
         return c;
      } else {
         boolean var1 = var0 < 0;
         int var2 = (var0 = abs(var0)) >> a;
         int var3 = c;

         int var4;
         for(var4 = 0; var4 < var2 / 4; ++var4) {
            var3 = mul(var3, h[4] >> f);
         }

         if (var2 % 4 > 0) {
            var3 = mul(var3, h[var2 % 4] >> f);
         }

         if ((var0 &= d) > 0) {
            var4 = c;
            var2 = 0;
            int var5 = 1;

            for(int var6 = 0; var6 < 16; ++var6) {
               var2 += var4 / var5;
               var4 = mul(var4, var0);
               if ((var5 *= var6 + 1) > var4 || var4 <= 0 || var5 <= 0) {
                  break;
               }
            }

            var3 = mul(var3, var2);
         }

         if (var1) {
            var3 = div(c, var3);
         }

         return var3;
      }
   }

   public static int log(int var0) {
      if (var0 <= 0) {
         throw new ArithmeticException("Bad Input");
      } else {
         int var1 = 0;

         int var2;
         for(var2 = 0; var0 >= c << 1; ++var2) {
            var0 >>= 1;
         }

         var2 *= 2839 >> f;
         int var3 = 0;
         if (var0 < c) {
            return -log(div(c, var0));
         } else {
            var0 -= c;

            for(int var4 = 1; var4 < 20; ++var4) {
               if (var1 == 0) {
                  var1 = var0;
               } else {
                  var1 = mul(var1, var0);
               }

               if (var1 == 0) {
                  break;
               }

               var3 += (var4 % 2 != 0 ? 1 : -1) * var1 / var4;
               var1 = var1;
            }

            return var2 + var3;
         }
      }
   }

   public static int pow(int var0, int var1) {
      boolean var2 = var1 < 0;
      int var3 = c;

      for(int var4 = (var1 = abs(var1)) >> a; var4-- > 0; var3 = mul(var3, var0)) {
      }

      if (var3 < 0) {
         throw new ArithmeticException("Overflow");
      } else {
         if (var0 != 0) {
            var3 = mul(var3, exp(mul(log(var0), var1 & d)));
         } else {
            var3 = 0;
         }

         return var2 ? div(c, var3) : var3;
      }
   }

   public static int atan2(int var0, int var1) {
      boolean var2 = false;
      int var3;
      if (var1 > 0) {
         var3 = atan(div(var0, var1));
      } else if (var1 < 0) {
         var3 = (var1 >= 0 ? PI : -PI) - atan(abs(div(var0, var1)));
      } else {
         if (var1 == 0 && var0 == 0) {
            throw new ArithmeticException("Bad Input");
         }

         var3 = (var1 >= 0 ? PI : -PI) / 2;
      }

      return var3;
   }

   static {
      h = new int[]{c, 11134, 30266, 82270, 223636};
      PI = g;
      E = h[1];
   }
}
