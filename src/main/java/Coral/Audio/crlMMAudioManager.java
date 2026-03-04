package Coral.Audio;

import Coral.Util.crlBinArray;
import java.io.ByteArrayInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public class crlMMAudioManager implements iAudio {
   private static final String[] a = new String[]{"audio/amr", "audio/midi", "audio/mpeg", "audio/x-wav", "Nokia tone format"};
   private static final int[] b = new int[]{0, 37, 75, 100};
   private int c;
   private int d;
   private Player[] e;
   private int[] f;
   private int[] g;
   private int[] h;
   private VolumeControl[] i;
   private int[] j;
   private crlBinArray[] k;
   private int l;

   public void open(int var1) {
      this.e = new Player[var1];
      this.f = new int[var1];
      this.g = new int[var1];
      this.h = new int[var1];
      this.i = new VolumeControl[var1];
      this.j = new int[var1];
      this.k = new crlBinArray[var1];
      this.d = 0;
      this.l = -1;
      this.c = 0;
   }

   public int load(iAudioLoader var1, long[] var2, int[] var3) {
      if (this.d != 0) {
         this.unload();
      }

      this.d = var2.length;

      for(int var4 = 0; var4 < this.d; ++var4) {
         this.j[var4] = var3[var4];
         this.k[var4] = var1.getAudioBinByID(var2[var4]);
         this.a(var4);
      }

      this.l = -1;
      this.c = 1;
      return 0;
   }

   public void play(int var1, int var2, int var3) {
      if (var3 == -1 && this.isStarted(var1) && this.f[var1] != -1) {
         this.stop(var1);
      }

      if (var3 == -1) {
         var3 = -1;
      }

      this.f[var1] = var3;
      this.h[var1] = b[var2];
      this.l = var1;
   }

   public boolean isStarted(int var1) {
      return this.e[var1] != null && (this.g[var1] == 2 && this.f[var1] == -1 || this.e[var1].getState() == 400);
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
      this.b(var1);
      if (this.g[var1] == 3) {
         this.g[var1] = 1;
      }

      if (this.l == var1) {
         this.l = -1;
      }

   }

   public void stopAll() {
      for(int var1 = 0; var1 < this.d; ++var1) {
         this.stop(var1);
      }

   }

   public int reload() {
      if (this.c != 0) {
         this.c = 5;
      }

      return 0;
   }

   public int unload() {
      for(int var1 = 0; var1 < this.d; ++var1) {
         this.c(var1);
         this.j[var1] = -1;
         this.k[var1] = null;
      }

      this.d = 0;
      this.c = 0;
      return 0;
   }

   public int update() {
      int var1;
      int var2;
      switch(this.c) {
      case 1:
         if (this.l != -1) {
            var2 = this.l;
            if (this.e[var2] == null || this.e[var2].getState() == 0) {
               this.a(this.l);
            } else {
               boolean var4 = true;

               for(var2 = 0; var2 < this.d && var4; ++var2) {
                  if (this.g[var2] == 2) {
                     if (!this.isStarted(var2)) {
                        this.g[var2] = 1;
                     }

                     var4 = false;
                  } else if (this.g[var2] == 4 && !this.isStarted(var2)) {
                     this.g[var2] = 1;
                     var4 = false;
                  }
               }

               if (var4 && this.d(this.l) == 0) {
                  this.l = -1;
               }
            }
         }
         break;
      case 2:
         this.a();
         this.c = 3;
      case 3:
      default:
         break;
      case 4:
         crlMMAudioManager var3 = this;
         if (this.l == -1) {
            for(var2 = 0; var2 < var3.d; ++var2) {
               if (var3.g[var2] == 3) {
                  var3.g[var2] = 1;
                  var3.l = var2;
               }
            }
         }

         this.c = 1;
         break;
      case 5:
         for(var1 = 0; var1 < this.d; ++var1) {
            this.c(var1);
         }

         return 0;
      case 6:
         for(var1 = 0; var1 < this.d; ++var1) {
            this.a(var1);
         }
      }

      return 0;
   }

   private int a(int var1) {
      try {
         ByteArrayInputStream var2 = new ByteArrayInputStream(this.k[var1].getArray(), this.k[var1].getOffset(), this.k[var1].getLength());
         this.e[var1] = Manager.createPlayer(var2, a[this.j[var1]]);
         this.e[var1].realize();
         this.e[var1].prefetch();
         this.i[var1] = (VolumeControl)this.e[var1].getControl("VolumeControl");
         this.g[var1] = 1;
         var2.close();
         return 0;
      } catch (Exception var3) {
         this.l = -1;
         return -1;
      }
   }

   private void a() {
      for(int var1 = 0; var1 < this.d; ++var1) {
         if (this.g[var1] == 2 || this.isStarted(var1)) {
            if (!this.isStarted(var1)) {
               this.g[var1] = 1;
            } else {
               this.stop(var1);
               if (this.f[var1] == -1) {
                  this.g[var1] = 3;
               }
            }
         }
      }

   }

   private int b(int var1) {
      try {
         this.e[var1].stop();
         if (this.isStarted(var1)) {
            this.g[var1] = 4;
         } else {
            this.g[var1] = 1;
         }

         return 0;
      } catch (Exception var2) {
         return -1;
      }
   }

   private int c(int var1) {
      try {
         this.e[var1].stop();
         this.e[var1].deallocate();
         this.e[var1].close();
         this.e[var1] = null;
         this.g[var1] = 0;
         return 0;
      } catch (Exception var2) {
         return -1;
      }
   }

   private int d(int var1) {
      if (this.isStarted(var1)) {
         this.g[var1] = 2;
         return -1;
      } else {
         try {
            this.i[var1].setMute(false);
            this.i[var1].setLevel(this.h[var1]);
            this.e[var1].setLoopCount(this.f[var1]);
            this.e[var1].start();
            this.g[var1] = 2;
            return 0;
         } catch (Exception var2) {
            return -1;
         }
      }
   }
}
