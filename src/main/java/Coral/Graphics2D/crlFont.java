package Coral.Graphics2D;

import Coral.Util.crlResourceManager;
import Coral.Util.crlString;
import javax.microedition.lcdui.Graphics;

public class crlFont {
   public static final int ALIGN_LEFT = 0;
   public static final int ALIGN_CENTER = 1;
   public static final int ALIGN_RIGHT = 2;
   public static final char CHAR_LINE_BREAK = '|';
   public static final char CHAR_ALIGN_LEFT = '{';
   public static final char CHAR_ALIGN_RIGHT = '}';
   public static final char CHAR_ALIGN_CENTER = '~';
   public static final char CHAR_SPACE = ' ';
   public int mLastLineWidth;
   public int mFirstLineWidth;
   public int mLongestLineWidth;
   public int mLinesDrawn;
   public static int mClipTop;
   public static int mClipBottom;
   private crlImagePacked a;
   private int b;
   private int c;
   private int d;
   private int e;
   public int mCharSpacing = 0;
   private boolean f = true;
   private byte[] g = new byte[128];
   public static int[] _mSpecialChars = new int[]{192, 193, 194, 196, 200, 201, 204, 205, 209, 211, 214, 217, 218, 219, 220, 161, 176, 186, 191};

   public void open(crlImagePacked var1, int var2, int var3) {
      var2 = var2;
      int var4 = 0;

      for(int var5 = 0; var5 < var1.getFrameCount(); ++var5) {
         int var6 = var1.getFrameMetric(var5, 2);
         int var7 = var1.getFrameMetric(var5, 3);
         if (var6 > var2) {
            var2 = var6;
         }

         if (var7 > var4) {
            var4 = var7;
         }
      }

      this.open(var1, var2, var4, var3);
   }

   public void open(crlImagePacked var1, int var2, int var3, int var4) {
      this.a = var1;
      this.d = var4 & 15;
      this.b = var2;
      this.c = var3;
      this.mLastLineWidth = 0;
   }

   public void setRotate(int var1) {
      this.d = var1 & 15;
   }

   public void setAlign(int var1) {
      this.e = var1;
   }

   public void close() {
   }

   private final int a(byte var1) {
      int var2 = 0;
      int var4;
      if ((var4 = var1 & 255) >= 32 && var4 != 124) {
         if (var4 < 96) {
            var2 = var4 - 32;
         } else {
            boolean var3 = false;

            for(var2 = 0; var2 < _mSpecialChars.length && var4 != _mSpecialChars[var2]; ++var2) {
            }

            if (var2 >= 0) {
               var2 += 64;
            } else {
               var2 = 64;
            }
         }
      }

      return var2;
   }

   public final int getWidth(crlString var1) {
      return this.getWidth(var1.get());
   }

   public final int getWidth(byte[] var1) {
      int var2 = 0;

      for(int var3 = 0; var1[var3] != 0; ++var3) {
         int var4 = this.a(var1[var3]);
         if ((var4 = this.a.getWidth(var4)) == 0 && this.f) {
            var2 += this.b / 2 + this.mCharSpacing;
         } else {
            var2 += var4 + this.mCharSpacing;
         }
      }

      return var2;
   }

   public final int getWidth(byte var1) {
      int var2 = this.a(var1);
      return this.a.getWidth(var2);
   }

   public final int getHeight() {
      return this.c;
   }

   public final int getHeight(crlString var1) {
      return this.getHeight(var1.get());
   }

   public final int getHeight(byte[] var1) {
      int var2 = 0;

      for(int var3 = 0; var1[var3] != 0; ++var3) {
         int var4 = this.a(var1[var3]);
         var4 = this.a.getHeight(var4);
         if (var2 < var4) {
            var2 = var4;
         }
      }

      return var2;
   }

   public final int getHeight(byte var1) {
      int var2 = this.a(var1);
      return this.a.getHeight(var2);
   }

   public int printChar(Graphics var1, int var2, int var3, byte var4) {
      int var6 = this.a(var4);
      this.a.draw(var1, var2, var3, var6, this.d);
      if (this.f) {
         int var5;
         if ((var5 = this.a.getWidth(var6)) == 0) {
            var5 = this.b / 2;
         }

         return var5 + this.mCharSpacing;
      } else {
         return this.b;
      }
   }

   public int printNumber(Graphics var1, int var2, int var3, int var4, int var5) {
      return this.printNumber(var1, var2, var3, var4, var5, '0');
   }

   public int printNumber(Graphics var1, int var2, int var3, int var4, int var5, char var6) {
      int var7 = 0;

      int var8;
      for(var8 = 1; var8 <= var4; var8 *= 10) {
         ++var7;
      }

      if (var7 == 0) {
         var7 = 1;
      }

      int var9 = 0;
      if (var7 < var5) {
         var9 = var5 - var7;
      }

      for(var5 = 0; var5 < var9; ++var5) {
         this.g[var5] = (byte)var6;
      }

      for(var5 = var9; var5 < var7 + var9; ++var5) {
         if ((var8 /= 10) == 0) {
            var8 = 1;
         }

         int var10 = var4 / var8 % 10;
         this.g[var5] = (byte)(var10 + 48);
      }

      this.g[var7 + var9] = 0;
      return this.print(var1, var2, var3, this.g);
   }

   public int print(Graphics var1, int var2, int var3, crlString var4) {
      return this.print(var1, var2, var3, var4.get());
   }

   public int print(Graphics var1, int var2, int var3, int var4) {
      crlString var5 = crlResourceManager.mLocaleText[var4];
      return this.print(var1, var2, var3, var5.get());
   }

   public int print(Graphics var1, int var2, int var3, byte[] var4) {
      this.mLastLineWidth = 0;
      int var5 = 0;
      int var6 = 0;
      boolean var7 = false;
      switch(this.e) {
      case 1:
         var6 = -(this.getWidth(var4) >> 1);
         break;
      case 2:
         var6 = -this.getWidth(var4);
      }

      switch(this.d) {
      case 0:
      case 1:
      case 2:
      case 4:
      default:
         for(; var4[var5] != 0; ++var5) {
            if (var4[var5] == 124) {
               this.mLastLineWidth = this.mLastLineWidth;
            } else {
               this.mLastLineWidth += this.printChar(var1, var2 + this.mLastLineWidth + var6, var3, var4[var5]);
            }
         }

         return var3 + this.c;
      case 3:
      case 6:
         return 0;
      case 5:
         for(; var4[var5] != 0; ++var5) {
            if (var4[var5] != 124) {
               var3 += this.printChar(var1, var2 + var6, var3, var4[var5]);
            }
         }

         return var2 - this.c;
      }
   }

   public final int printCentered(Graphics var1, int var2, int var3, byte[] var4) {
      this.mLastLineWidth = this.getWidth(var4);
      this.print(var1, var2 - (this.mLastLineWidth >> 1), var3, var4);
      return var3 + this.c;
   }

   public final int printCentred(Graphics var1, int var2, int var3, byte[] var4) {
      this.mLastLineWidth = this.getWidth(var4);
      this.print(var1, var2 - this.mLastLineWidth >> 1, var3, var4);
      return var3 + this.c;
   }

   public final int printStringsCentred(Graphics var1, int var2, int var3, byte[] var4, byte[] var5) {
      int var6 = this.getWidth(var4);
      boolean var7 = false;
      this.mLastLineWidth = var6 + this.b + this.getWidth(var5);
      int var8 = var2 - this.mLastLineWidth >> 1;
      this.print(var1, var8, var3, var4);
      this.print(var1, var8 + var6 + (this.b >> 2), var3, var5);
      this.mLastLineWidth = var6 + this.b + this.getWidth(var5);
      return var3 + this.c;
   }

   public int printTime(Graphics var1, int var2, int var3, long var4) {
      int var6 = (int)(var4 / 1000L % 60L);
      int var7 = (int)(var4 / 60000L % 60L);
      int var8 = (int)(var4 / 3600000L);
      byte[] var5;
      (var5 = new byte[10])[0] = (byte)(var8 / 100 % 10 + 48);
      var5[1] = (byte)(var8 / 10 % 10 + 48);
      var5[2] = (byte)(var8 % 10 + 48);
      var5[3] = 58;
      var5[4] = (byte)(var7 / 10 % 10 + 48);
      var5[5] = (byte)(var7 % 10 + 48);
      var5[6] = 58;
      var5[7] = (byte)(var6 / 10 % 10 + 48);
      var5[8] = (byte)(var6 % 10 + 48);
      return this.print(var1, var2, var3, var5);
   }

   public int printShortTime(Graphics var1, int var2, int var3, long var4) {
      int var6 = (int)(var4 / 1000L % 60L);
      int var7 = (int)(var4 / 60000L % 60L);
      byte[] var8;
      (var8 = new byte[10])[0] = (byte)(var7 / 10 % 10 + 48);
      var8[1] = (byte)(var7 % 10 + 48);
      var8[2] = 58;
      var8[3] = (byte)(var6 / 10 % 10 + 48);
      var8[4] = (byte)(var6 % 10 + 48);
      var8[5] = 46;
      var8[6] = (byte)((int)(var4 / 100L % 10L + 48L));
      var8[7] = (byte)((int)(var4 / 10L % 10L + 48L));
      return this.print(var1, var2, var3, var8);
   }

   private boolean b(byte var1) {
      return var1 == 124 || var1 == 123 || var1 == 125 || var1 == 126;
   }

   public int printWrapped(Graphics var1, int var2, int var3, int var4, int var5, byte[] var6, byte[] var7, int var8) {
      int var15 = var8;
      int var9 = var8;
      boolean var10 = false;
      int var11 = var3;
      this.mLinesDrawn = 0;
      this.mLongestLineWidth = 0;

      int var12;
      byte var16;
      for(var12 = 0; var12 < var8; ++var12) {
         if ((var16 = var6[var12]) == 123) {
            this.setAlign(0);
         } else if (var16 == 125) {
            this.setAlign(2);
         } else if (var16 == 126) {
            this.setAlign(1);
         }
      }

      int var17;
      for(var17 = var8; var6[var17++] != 0; ++var15) {
      }

      for(; var9 < var15; var11 += this.c) {
         var12 = 0;
         var8 = 0;

         for(int var13 = var9; var8 < var4; ++var13) {
            if (var13 >= var15) {
               var12 = var13 - var9;
               break;
            }

            var16 = var6[var13];
            boolean var14 = false;
            if (var16 == 123) {
               this.setAlign(0);
               var14 = true;
            } else if (var16 == 125) {
               this.setAlign(2);
               var14 = true;
            } else if (var16 == 126) {
               this.setAlign(1);
               var14 = true;
            } else {
               if (var16 == 124) {
                  var12 = var13 - var9;
                  break;
               }

               if (var16 == 32) {
                  var12 = var13 - var9;
               }
            }

            if (!var14) {
               if ((var17 = this.getWidth((byte)var16)) == 0 && this.f) {
                  var8 += this.b / 2 + this.mCharSpacing;
               } else {
                  var8 += var17 + this.mCharSpacing;
               }
            }
         }

         int var18 = 0;

         for(var17 = var9; var17 < var9 + var12; ++var17) {
            if (var17 < var15 && !this.b(var6[var17])) {
               this.g[var18] = var6[var17];
               ++var18;
            }
         }

         this.g[var18] = 0;
         if ((var9 += var12) < var15 && (var6[var9] == 32 || this.b(var6[var9]))) {
            ++var9;
         }

         if (var11 + this.c >= var3 + var5) {
            return var9 - var12 - 1;
         }

         if (this.e == 0) {
            var17 = var2;
         } else if (this.e == 1) {
            var17 = var2 + (var4 >> 1);
         } else {
            var17 = var2 + var4;
         }

         if (var1 != null) {
            this.print(var1, var17, var11, this.g);
         }
      }

      return var9;
   }

   public final int printWrapped(Graphics var1, int var2, int var3, byte[] var4, byte[] var5, int var6, boolean var7) {
      int var8 = 0;
      int var9 = var3;
      this.mLinesDrawn = 0;
      this.mLongestLineWidth = 0;
      int var10 = var6 / this.b;
      boolean var12 = false;
      var6 = 0;

      int var11;
      for(var11 = 0; var4[var6++] != 0; ++var11) {
      }

      if (var11 <= var10) {
         if (var3 >= mClipTop && var3 + this.c < mClipBottom) {
            if (var7) {
               this.print(var1, var2, var3, var4);
            } else {
               this.printCentred(var1, var2, var3, var4);
            }

            this.mLastLineWidth = this.getWidth(var4);
            this.mFirstLineWidth = this.mLastLineWidth;
            this.mLongestLineWidth = this.mLastLineWidth;
            this.mLinesDrawn = 1;
         }
      } else {
         for(; var8 < var11; ++this.mLinesDrawn) {
            var9 = var8 + var10;

            int var13;
            for(var13 = var8; var13 < var8 + var10; ++var13) {
               byte var14;
               if (var13 >= var11) {
                  var14 = 32;
               } else {
                  var14 = var4[var13];
               }

               if (var14 == 32) {
                  var9 = var13;
               }
            }

            var6 = 0;

            for(var13 = var8; var13 < var9; ++var13) {
               if (var13 < var11) {
                  var5[var6] = var4[var13];
                  ++var6;
               }
            }

            var5[var6] = 0;
            var8 = var9;
            if (var9 < var11 && var4[var9] == 32) {
               var8 = var9 + 1;
            }

            if ((var9 = var3 + (this.c + 1) * this.mLinesDrawn) >= mClipTop && var9 + this.c < mClipBottom) {
               if (var7) {
                  this.print(var1, var2, var9, var5);
               } else {
                  this.printCentred(var1, var2, var9, var5);
               }

               if (!var12) {
                  this.mFirstLineWidth = this.getWidth(var5);
                  var12 = true;
               }

               this.mLastLineWidth = this.getWidth(var5);
               if (this.mLastLineWidth > this.mLongestLineWidth) {
                  this.mLongestLineWidth = this.mLastLineWidth;
               }
            }
         }
      }

      return var9 + this.c;
   }
}
