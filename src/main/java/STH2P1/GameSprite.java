package STH2P1;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class GameSprite {
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   public int m_Sproffset;
   private int g;
   public int m_Sprpri;
   private int h;
   private Image i;

   public GameSprite() {
   }

   public GameSprite(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.setData(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public void setData(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.i = var1;
      this.a = var2;
      this.b = var3;
      this.e = var6;
      this.f = var7;
      this.c = var4;
      this.d = var5;
      this.m_Sprpri = var9;
      this.m_Sproffset = var11;
      this.h = var8;
      this.g = var10;
   }

   public void draw(Graphics var1) {
      Utilities.drawImage(var1, this.i, this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.g);
   }
}
