package Coral.Graphics2D;

import javax.microedition.lcdui.Graphics;

public class crlSprite {
   public static final int ANIM_SINGLE = 0;
   public static final int ANIM_LOOP = 1;
   public static final int ANIM_SINGLE_CLAMPED = 2;
   private crlImagePacked a;
   private short[][] b;
   private short[] c;
   private short[] d;
   private int e;
   private int f = -1;
   private long g;
   private int h;

   public void open(crlImagePacked var1, short[][] var2, short[] var3, short[] var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public void open(crlImagePacked var1, short[][] var2) {
      this.a = var1;
      int var4 = var2.length;
      this.b = new short[var4][];
      this.c = new short[var4];
      this.d = new short[var4];

      for(var4 = 0; var4 < var2.length; ++var4) {
         this.c[var4] = var2[var4][0];
         this.d[var4] = var2[var4][1];

         for(int var3 = 2; var3 < var2[var4].length; ++var3) {
            this.b[var4][var3 - 2] = var2[var4][var3];
         }
      }

   }

   public void setSequence(int var1, boolean var2) {
      if (var1 != this.e) {
         if (this.sequenceComplete() || var2) {
            this.a(var1);
            return;
         }

         this.f = var1;
      }

   }

   public void setSequence(int var1) {
      this.setSequence(var1, true);
   }

   private void a(int var1) {
      this.e = var1;
      this.g = 0L;
      this.h = 0;
   }

   public void draw(Graphics var1, int var2, int var3, int var4, long var5, int var7) {
      int var8;
      if ((var8 = this.a(var7, var5)) != -1) {
         this.a.draw(var1, var2, var3, this.b[var7][var8], var4);
      }

   }

   public void draw(Graphics var1, int var2, int var3, int var4) {
      if (this.h != -1) {
         this.a.draw(var1, var2, var3, this.b[this.e][this.h], var4);
      }

   }

   public void draw(Graphics var1, int var2, int var3) {
      this.draw(var1, var2, var3, 0);
   }

   private int a(int var1, long var2) {
      short var4 = this.d[var1];
      short var5 = this.c[var1];
      if (var4 == 0) {
         return 0;
      } else {
         int var6 = (int)(var2 / (long)var4);
         switch(var5) {
         case 0:
            if (var6 >= this.b[var1].length) {
               var6 = -1;
            }
            break;
         case 1:
            var6 %= this.b[var1].length;
            break;
         case 2:
            if (var6 >= this.b[var1].length) {
               var6 = this.b[var1].length - 1;
            }
         }

         return var6;
      }
   }

   public boolean sequenceComplete() {
      if (this.h == -1) {
         return true;
      } else {
         return this.c[this.e] == 2 && (int)(this.g / (long)this.d[this.e]) >= this.b[this.e].length;
      }
   }

   public void tick(long var1) {
      this.setTime(this.g + var1);
   }

   public void setTime(long var1) {
      this.g = var1;
      this.h = this.a(this.e, this.g);
      if (this.sequenceComplete() && this.f != -1) {
         this.a(this.f);
      }

   }
}
