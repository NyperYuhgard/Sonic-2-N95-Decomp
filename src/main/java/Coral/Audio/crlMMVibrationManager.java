package Coral.Audio;

import javax.microedition.lcdui.Display;

public class crlMMVibrationManager implements iVibration {
   private static Display a;
   private int b;
   private boolean c;
   private int d;
   private boolean e;

   public void open(Display var1, int var2) {
      a = var1;
      this.d = var2;
   }

   public boolean isVibrationSupported() {
      return a != null && a.vibrate(0);
   }

   public void vibrate(int var1) {
      this.b += var1;
   }

   public void pause() {
      if (!this.e) {
         this.stop();
         this.e = true;
      }

   }

   public void resume() {
      this.e = false;
   }

   public void stop() {
      try {
         a.vibrate(0);
         this.b = 0;
         this.c = false;
      } catch (Exception var1) {
      }
   }

   public int update() {
      if (!this.e) {
         if (this.d == 1) {
            if (this.b > 0) {
               --this.b;
               if (this.c && this.b == 0) {
                  this.stop();
               } else {
                  this.a(500);
               }
            }
         } else if (this.d == 0 && this.b > 0) {
            this.a(this.b);
            this.b = 0;
         }
      }

      return 0;
   }

   private void a(int var1) {
      try {
         a.vibrate(var1);
         this.c = var1 > 0;
      } catch (Exception var2) {
      }
   }
}
