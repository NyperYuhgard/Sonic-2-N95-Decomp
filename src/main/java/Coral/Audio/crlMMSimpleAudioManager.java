package Coral.Audio;

import Coral.Util.crlBinArray;
import java.io.ByteArrayInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public class crlMMSimpleAudioManager implements iAudio {
   private static final String[] a = new String[]{"audio/amr", "audio/midi", "audio/mpeg", "audio/x-wav", "Nokia tone format"};
   private static final int[] b = new int[]{0, 25, 50, 100};
   private int c;
   private int d;
   private Player e;
   private int f;
   private int g;
   private VolumeControl h;
   private int[] i;
   private crlBinArray[] j;
   private boolean k;
   private int l;
   private int m;

   public void open(int var1) {
      this.i = new int[var1];
      this.j = new crlBinArray[var1];
      this.d = 0;
      this.l = this.m = -1;
      this.c = 0;
   }

   public int load(iAudioLoader var1, long[] var2, int[] var3) {
      if (this.d != 0) {
         this.unload();
      }

      this.d = var2.length;

      for(int var4 = 0; var4 < this.d; ++var4) {
         this.i[var4] = var3[var4];
         this.j[var4] = var1.getAudioBinByID(var2[var4]);
      }

      this.l = -1;
      this.c = 1;
      return 0;
   }

   public void play(int var1, int var2, int var3) {
      if (var3 == -1 && this.isStarted(var1) && this.f != -1) {
         this.stop(var1);
      }

      if (var3 == -1) {
         var3 = -1;
      }

      this.f = var3;
      this.g = b[var2];
      this.l = var1;
   }

   public boolean isStarted(int var1) {
      return var1 == this.m && this.e != null && (this.k && this.f == -1 || this.e.getState() == 400);
   }

   public void pause() {
      if (this.c == 1) {
         this.a();
         this.c = 3;
      }

   }

   public void resume() {
      if (this.c == 3) {
         this.c = 4;
      }

   }

   public void stop(int var1) {
      if (var1 == this.m) {
         this.a();
         this.f = 0;
      }

      if (this.l == var1) {
         this.l = -1;
      }

   }

   public void stopAll() {
      if (this.m != -1) {
         this.stop(this.m);
      }

      this.l = -1;
   }

   public int reload() {
      if (this.c != 0) {
         this.c = 5;
      }

      return 0;
   }

   public int unload() {
      this.b();

      for(int var1 = 0; var1 < this.d; ++var1) {
         this.i[var1] = -1;
         this.j[var1] = null;
      }

      this.d = 0;
      this.c = 0;
      return 0;
   }

   public int update() {
      switch(this.c) {
      case 1:
         if (this.l != -1 && !this.isStarted(this.m)) {
            if (this.l != this.m) {
               if (this.e != null && this.e.getState() != 0) {
                  this.b();
               } else {
                  this.a(this.l);
               }
            } else if (this.c() == 0) {
               this.l = -1;
            }
         }
         break;
      case 2:
         this.a();
         this.c = 3;
      case 3:
      case 6:
      default:
         break;
      case 4:
         if (this.f == -1 && this.l == -1) {
            this.l = this.m;
         }

         this.c = 1;
         break;
      case 5:
         this.b();
      }

      return 0;
   }

   private int a(int var1) {
      try {
         ByteArrayInputStream var2 = new ByteArrayInputStream(this.j[var1].getArray(), this.j[var1].getOffset(), this.j[var1].getLength());
         this.e = Manager.createPlayer(var2, a[this.i[var1]]);
         this.e.realize();
         this.e.prefetch();
         this.h = (VolumeControl)this.e.getControl("VolumeControl");
         var2.close();
         this.m = this.l;
         return 0;
      } catch (Exception var3) {
         this.l = -1;
         this.m = -1;
         return -1;
      }
   }

   private int a() {
      try {
         this.e.stop();
         this.k = false;
         return 0;
      } catch (Exception var1) {
         return -1;
      }
   }

   private int b() {
      try {
         this.e.stop();
         this.k = false;
         this.e.deallocate();
         this.e.close();
         this.e = null;
         this.m = -1;
         return 0;
      } catch (Exception var1) {
         return -1;
      }
   }

   private int c() {
      if (this.isStarted(this.m)) {
         return -1;
      } else {
         try {
            this.h.setLevel(this.g);
            this.e.setLoopCount(this.f);
            this.e.start();
            this.k = true;
            return 0;
         } catch (Exception var1) {
            return -1;
         }
      }
   }
}
