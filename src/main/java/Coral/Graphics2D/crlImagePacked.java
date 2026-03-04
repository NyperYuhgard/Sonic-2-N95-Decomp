package Coral.Graphics2D;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class crlImagePacked {
   public static final int METRICS = 1;
   public static final int FRAME_OFFSET = 6;
   public static final int TRANS_NONE = 0;
   public static final int TRANS_ROT90 = 5;
   public static final int TRANS_ROT180 = 3;
   public static final int TRANS_ROT270 = 6;
   public static final int TRANS_MIRROR = 2;
   public static final int TRANS_MIRROR_ROT90 = 7;
   public static final int TRANS_MIRROR_ROT180 = 1;
   public static final int TRANS_MIRROR_ROT270 = 4;
   public static final int FRAME_X = 0;
   public static final int FRAME_Y = 1;
   public static final int FRAME_WIDTH = 2;
   public static final int FRAME_HEIGHT = 3;
   public static final int FRAME_ANCHOR_X = 4;
   public static final int FRAME_ANCHOR_Y = 5;
   private Image a;
   private short[] b;
   private int c;

   public void open(Image var1, short[] var2) {
      this.a = var1;
      short var6;
      if (((var6 = var2[0]) & 1023) == var6) {
         this.b = var2;
         this.c = var2[0];
      } else {
         this.c = var6 & 1023;
         this.b = new short[1 + 6 * this.c];
         if (var6 >> 12 == 2) {
            boolean var7 = (var6 >> 11 & 1) == 1;
            int var3 = 1;

            for(int var4 = 0; var4 < this.c; ++var4) {
               if (var2[var3] == -1) {
                  ++var3;
               } else {
                  int var5 = 1 + var4 * 6;
                  if (var7 && var2[var3] != -2) {
                     this.b[var5] = (short)(var2[var3] >> 8 & 255);
                     this.b[var5 + 1] = (short)(var2[var3] & 255);
                     this.b[var5 + 2] = (short)(var2[var3 + 1] >> 8 & 255);
                     this.b[var5 + 3] = (short)(var2[var3 + 1] & 255);
                     this.b[var5 + 4] = (short)((var2[var3 + 2] >> 8 & 255) - 128);
                     this.b[var5 + 5] = (short)((var2[var3 + 2] & 255) - 128);
                     var3 += 3;
                  } else {
                     this.b[var5] = var2[var3];
                     this.b[var5 + 1] = var2[var3 + 1];
                     this.b[var5 + 2] = var2[var3 + 2];
                     this.b[var5 + 3] = var2[var3 + 3];
                     this.b[var5 + 4] = var2[var3 + 4];
                     this.b[var5 + 5] = var2[var3 + 5];
                     var3 += 6;
                  }
               }
            }
         }

      }
   }

   public void open(Image var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      int var6 = var1.getWidth() / var2;
      int var10 = var1.getHeight() / var3;
      this.c = var6 * var10;
      this.b = new short[1 + 6 * this.c];
      this.b[0] = (short)this.c;

      for(var10 = 0; var10 < this.c; ++var10) {
         int var7 = 1 + var10 * 6;
         int var8 = var10 % var6 * var2;
         int var9 = var10 / var6 * var3;
         this.b[var7++] = (short)var8;
         this.b[var7++] = (short)var9;
         this.b[var7++] = (short)var2;
         this.b[var7++] = (short)var3;
         this.b[var7++] = (short)var4;
         this.b[var7] = (short)var5;
      }

   }

   public void open(Image var1, int var2) {
      this.open(var1, var2, 1);
   }

   public void open(Image var1, int var2, int var3) {
      var2 /= var3;
      var2 = var1.getWidth() / var2;
      var3 = var1.getHeight() / var3;
      int var4 = var2 >> 1;
      int var5 = var3 >> 1;
      this.open(var1, var2, var3, var4, var5);
   }

   public void close() {
      this.a = null;
      this.b = null;
   }

   public void draw(Graphics var1, int var2, int var3, int var4) {
      this.draw(var1, var2, var3, var4, 0);
   }

   public void draw(Graphics var1, int var2, int var3, int var4, int var5) {
      if (this.a != null) {
         if (var4 >= this.c) {
            var4 %= this.c;
         } else if (var4 < 0) {
            var4 = 0;
         }

         var4 = 1 + var4 * 6;
         short var6;
         short var8;
         if ((var6 = this.b[var4++]) != -2) {
            short var12 = this.b[var4++];
            var8 = this.b[var4++];
            short var9 = this.b[var4++];
            short var10 = this.b[var4++];
            short var11 = this.b[var4];
            var2 -= var10;
            var3 -= var11;
            var1.drawRegion(this.a, var6, var12, var8, var9, var5, var2, var3, 20);
         } else {
            for(int var7 = var4; var7 < var4 + 6 - 1 && (var8 = this.b[var7]) != -1; ++var7) {
               this.draw(var1, var2, var3, var8);
            }

         }
      }
   }

   public int getMetrics(int var1) {
      return this.b[var1];
   }

   public int getFrameCount() {
      return this.c;
   }

   public Image getImage() {
      return this.a;
   }

   public int getFrameMetric(int var1, int var2) {
      var1 = 1 + var1 * 6;
      int var3 = this.b[var1 + var2];
      if (this.b[var1] == -2) {
         switch(var2) {
         case 3:
            int var4 = -this.getFrameMetric(this.b[var1 + 1], 5);
            int var5 = this.getFrameMetric(this.b[var1 + 1], 3) + var4;

            for(int var6 = 2; var6 < 6 && this.b[var1 + var6] != -1; ++var6) {
               var2 = -this.getFrameMetric(this.b[var1 + var6], 5);
               var3 = this.getFrameMetric(this.b[var1 + var6], 3) + var2;
               if (var4 == -1 || var2 < var4) {
                  var4 = var2;
               }

               if (var5 < var3) {
                  var5 = var3;
               }
            }

            var3 = var5 - var4;
            break;
         default:
            var3 = this.getFrameMetric(this.b[var1 + 1], var2);
         }
      }

      return var3;
   }

   public int getWidth(int var1) {
      return this.getFrameMetric(var1, 2);
   }

   public int getHeight(int var1) {
      return this.getFrameMetric(var1, 3);
   }
}
