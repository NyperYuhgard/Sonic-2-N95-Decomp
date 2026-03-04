package Coral.Audio;

import Coral.crlCanvas;
import Coral.Util.crlBinArray;
import Coral.Util.crlManagerBase;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public class crlAudioManager extends crlManagerBase implements iAudio {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   public static final int INFINITE_LOOP = -1;
   public static final int VOLUME_FULL = 100;
   public static final int VOLUME_HALF = 75;
   public static final int VOLUME_OFF = 0;
   public static final int NO_SOUND = -1;
   public static final int[] VOLUME_LEVEL = new int[]{0, 37, 75, 100};
   private static final String[] a = new String[]{"audio/amr", "audio/midi", "audio/mpeg", "audio/x-wav", "Nokia tone format"};
   protected static int _gGlobalVolume;
   private iAudioLoader b;
   protected Player[] _mPlayer;
   private VolumeControl[] c;
   private int[] d;
   private crlBinArray[] e;
   private int[] f;
   private int[] g;
   protected int[] _mPlayerVolume;
   protected int _mNumPlayers;
   private int[] h;
   private int[] i;
   private int j;
   private int k = -1;
   private boolean l = true;
   private int[] m;
   private int[] n;
   private boolean[] o;
   public static int mAudioState;

   public static boolean isSupported(int var0) {
      boolean var1 = false;
      String[] var2 = Manager.getSupportedContentTypes((String)null);

      for(int var3 = 0; var3 < var2.length && !var1; ++var3) {
         var1 = var2[var3].equals(a[var0]);
      }

      return var1;
   }

   public crlAudioManager() {
      super._mStatus = 0;
   }

   public int open() {
      return -1;
   }

   public final int open(int var1) {
      return this.open(crlCanvas.gResourceManager, var1, 0, var1);
   }

   public final int open(iAudioLoader var1, int var2) {
      return this.open(var1, var2, 0, var2);
   }

   public int open(iAudioLoader var1, int var2, int var3, int var4) {
      this._mPlayer = new Player[var2];
      this.c = new VolumeControl[var2];
      this.d = new int[var2];

      int var5;
      for(var5 = 0; var5 < this.d.length; ++var5) {
         this.d[var5] = 7;
      }

      this.e = new crlBinArray[var2];
      this.f = new int[var2];
      this.g = new int[var2];
      this._mPlayerVolume = new int[var2];
      this.m = new int[var2];
      this.o = new boolean[var2];
      this.n = new int[var2];
      if (var4 >= var2) {
         var3 = 0;
         var4 = var2;
      } else if (var3 == 1) {
         var3 = 2;
      }

      if (var4 <= 0) {
         var4 = 1;
      }

      this.h = new int[var3];

      for(var5 = 0; var5 < var3; ++var5) {
         this.h[var5] = -1;
      }

      this.i = new int[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         this.i[var5] = -1;
      }

      this.b = var1;
      super._mStatus = 4;
      this._mNumPlayers = 0;
      _gGlobalVolume = 100;
      return 0;
   }

   public int close() {
      this.removeAudioBank();
      this._mPlayer = null;
      this.d = null;
      this.e = null;
      this.f = null;
      this.g = null;
      this._mPlayerVolume = null;
      this.c = null;
      this.m = null;
      this.o = null;
      this.n = null;
      super._mStatus = 0;
      return 0;
   }

   public int update() {
      if (this.j != -1) {
         this.k = this.j;
      }

      switch(super._mStatus) {
      case 2:
         int var2;
         int var5;
         if (this.j != -1) {
            try {
               if (this.h.length > 0 && !this.a(this.j)) {
                  var5 = this.h[this.h.length - 1];
                  if (this.a(var5)) {
                     if (this.d[var5] != 0) {
                        this.j(var5);
                     }
                  } else {
                     this.h[this.h.length - 1] = -1;
                     if (this.d(this.j) == 0) {
                        this.a(this.h, this.j, 0);
                     }
                  }
               } else if (!this.b(this.j)) {
                  var5 = this.i[this.i.length - 1];
                  if (this.b(var5)) {
                     if (this.d[var5] != 5 && this.d[var5] != 0) {
                        if (this.h.length == 0) {
                           this.h(var5);
                        } else {
                           var2 = this.h[this.h.length - 1];
                           if (this.a(var2)) {
                              if (this.d[var2] != 0) {
                                 this.j(var2);
                              }
                           } else {
                              this.h[this.h.length - 1] = -1;
                              if (this.i(var5) == 0) {
                                 this.a(this.h, var5, 0);
                              }
                           }
                        }
                     }
                  } else if (this.e(this.j) == 0) {
                     this.a(this.i, this.j, 0);
                     this.a(this.h, this.j, 1);
                  }
               } else {
                  boolean var1 = true;
                  var2 = 0;

                  while(true) {
                     int var3 = this.j;
                     if (var2 > this._mNumPlayers - 1 || !var1) {
                        if (var1 && this.f(this.j) == 0) {
                           if (this.i.length < this._mNumPlayers && this.i[0] != this.j) {
                              this.a(this.i, this.j, 0);
                           }

                           this.j = -1;
                        }
                        break;
                     }

                     if (this.d[var2] == 8) {
                        if (!this.c(var2)) {
                           if (this.l) {
                              this.g(var2);
                           }
                        } else {
                           this.d[var2] = 2;
                        }

                        var1 = false;
                     } else if (this.d[var2] == 11) {
                        if (this.c(var2)) {
                           this.d[var2] = 2;
                        } else {
                           var1 = false;
                        }
                     }

                     ++var2;
                  }
               }
            } catch (Exception var4) {
               this.j = -1;
            }
         }

         for(var5 = 0; var5 < this.o.length; ++var5) {
            if (this.o[var5]) {
               int[] var10000 = this.m;
               var10000[var5] += this.n[var5];
               var2 = this.m[var5] >> 8;
               this.c[var5].setLevel(var2);
               if (var2 < 0) {
                  this.o[var5] = false;
                  this.stopAudio(var5);
               } else if (var2 > 100) {
                  this.o[var5] = false;
               }
            }
         }

         return 0;
      case 3:
         this.a();
         super._mStatus = 4;
      case 4:
      case 5:
      case 6:
      case 7:
      }

      return 0;
   }

   private void a(int[] var1, int var2, int var3) {
      try {
         if (var1.length > 0) {
            if (var3 == 0) {
               int var7 = -1;
               var3 = var2;

               for(int var4 = 0; var4 < var1.length && var7 != var2; ++var4) {
                  var7 = var1[var4];
                  var1[var4] = var3;
                  var3 = var7;
               }

               return;
            }

            if (var3 == 1) {
               boolean var6 = false;
               if (var1[var1.length - 1] == var2) {
                  var6 = true;
               } else {
                  for(var3 = 0; var3 < var1.length - 1; ++var3) {
                     if (var1[var3] == var2) {
                        var6 = true;
                     }

                     if (var6) {
                        var1[var3] = var1[var3 + 1];
                     }
                  }
               }

               if (var6) {
                  var1[var1.length - 1] = -1;
               }
            }
         }

      } catch (Exception var5) {
      }
   }

   public void setForceStop(boolean var1) {
      this.l = var1;
   }

   public boolean isStarted(int var1) {
      return !this.c(var1);
   }

   public int loadAudioBank(long[] var1) {
      return this.loadAudioBank(var1, this.b);
   }

   public int load(iAudioLoader var1, long[] var2, int[] var3) {
      this.b = var1;
      long[] var5 = new long[var2.length << 1];

      for(int var4 = 0; var4 < var2.length; ++var4) {
         var5[var4 << 1] = var2[var4];
         var5[(var4 << 1) + 1] = (long)var3[var4];
      }

      return this.loadAudioBank(var5);
   }

   public int loadAudioBank(long[] var1, iAudioLoader var2) {
      int var3 = 0;
      if (this._mNumPlayers != 0) {
         this.removeAudioBank();
      }

      int var4;
      for(var4 = 0; var4 < var1.length && var3 < this.f.length; var4 += 2) {
         this.f[var3] = (int)var1[var4 + 1];
         this.e[var3] = var2.getAudioBinByID(var1[var4]);
         ++var3;
      }

      this.j = -1;

      for(var4 = 0; var4 < this.i.length; ++var4) {
         this.i[var4] = -1;
      }

      for(var4 = 0; var4 < this.i.length && var4 < var3; ++var4) {
         if (this.e(var4) == -1) {
            this.i[var4] = var4;
         }
      }

      for(var4 = 0; var4 < this.h.length; ++var4) {
         this.h[var4] = -1;
      }

      for(var4 = this.i.length; var4 - this.i.length < this.h.length && var4 < var3; ++var4) {
         if (this.d(var4) == -1) {
            this.h[var4 - this.i.length] = var4;
         }
      }

      this._mNumPlayers = var3;
      return 0;
   }

   public int loadAudioBank(String[] var1, int[] var2) {
      int var3 = 0;
      if (this._mNumPlayers != 0) {
         this.removeAudioBank();
      }

      int var4;
      for(var4 = 0; var4 < var1.length && var3 < this.f.length; ++var4) {
         try {
            this.f[var3] = var2[var4];
            InputStream var5 = this.getClass().getResourceAsStream(var1[var4]);
            crlBinArray var6 = new crlBinArray();
            byte[] var7 = new byte[var5.available()];
            var5.read(var7, 0, var7.length);
            var5.close();
            var6.set(var7, 0, var7.length);
            this.e[var3] = var6;
            ++var3;
         } catch (Exception var8) {
         }
      }

      this.j = -1;

      for(var4 = 0; var4 < this.i.length; ++var4) {
         this.i[var4] = -1;
      }

      for(var4 = 0; var4 < this.i.length && var4 < var3; this.i[var4] = var4++) {
         if (this.e(var4) == -1) {
            return -1;
         }
      }

      for(var4 = 0; var4 < this.h.length; ++var4) {
         this.h[var4] = -1;
      }

      for(var4 = this.i.length; var4 - this.i.length < this.h.length && var4 < var3; this.h[var4 - this.i.length] = var4++) {
         if (this.d(var4) == -1) {
            return -1;
         }
      }

      this._mNumPlayers = var3;
      return 0;
   }

   public int removeAudioBank(int var1) {
      return this.removeAudioBank();
   }

   public int reload() {
      this.killAllAudio();
      return 0;
   }

   public int unload() {
      return this.removeAudioBank();
   }

   public int removeAudioBank() {
      for(int var1 = 0; var1 < this._mNumPlayers; ++var1) {
         this.h(var1);
         this.f[var1] = -1;
         this.e[var1] = null;
      }

      this._mNumPlayers = 0;
      return 0;
   }

   public void stopAll() {
      this.stopAllAudio();
   }

   public void stopAllAudio() {
      for(int var1 = 0; var1 < this._mNumPlayers; ++var1) {
         if (!this.c(var1) || this.d[var1] == 8 || this.d[var1] == 9) {
            this.g(var1);
            if (this.d[var1] == 9) {
               this.d[var1] = 2;
            }
         }
      }

      this.j = -1;
   }

   public void killAllAudio() {
      for(int var1 = 0; var1 < this._mNumPlayers; ++var1) {
         this.h(var1);
         if (this.d[var1] == 9) {
            this.d[var1] = 0;
         }
      }

      this.j = -1;
   }

   public void killLastAudio() {
      if (this.k != -1) {
         this.h(this.k);
         if (this.d[this.k] == 9) {
            this.d[this.k] = 0;
         }
      }

      this.k = -1;
   }

   public void stop(int var1) {
      this.stopAudio(var1);
   }

   public void stopAudio(int var1) {
      if (var1 >= 0 && var1 < this._mNumPlayers) {
         this.g(var1);
         if (this.d[var1] == 9) {
            this.d[var1] = 2;
         }

         if (this.j == var1) {
            this.j = -1;
         }

      }
   }

   public void pause() {
      this.pauseAudio();
   }

   public void pauseAudio() {
      if (super._mStatus == 2) {
         this.a();
         super._mStatus = 4;
         this.j = -1;
      }

   }

   public void resume() {
      this.resumeAudio();
   }

   public void resumeAudio() {
      if (super._mStatus == 4) {
         super._mStatus = 2;
         crlAudioManager var2 = this;

         for(int var1 = 0; var1 < var2._mNumPlayers; ++var1) {
            if (var2.d[var1] == 9) {
               var2.d[var1] = 2;
               var2.j = var1;
            }
         }

         boolean var10000 = false;
      }

   }

   public void playAudio(int var1, int var2) {
      this.playAudio(var1, _gGlobalVolume, var2);
   }

   public void play(int var1, int var2, int var3) {
      if (var3 == -1) {
         this.playAudio(var1, VOLUME_LEVEL[var2], -1);
      } else {
         this.playAudio(var1, VOLUME_LEVEL[var2], var3);
      }
   }

   public void playAudio(int var1, int var2, int var3) {
      if (this._mNumPlayers != 0) {
         super._mStatus = 2;
         if (var1 > -1 && var1 < this._mNumPlayers) {
            if (var3 == -1 && !this.c(var1) && this.g[var1] != -1) {
               this.stopAudio(var1);
            }

            this._mPlayerVolume[var1] = var2;
            this.g[var1] = var3;
            this.j = var1;
         }

      }
   }

   public void setGlobalVolume(int var1) {
      if (var1 <= 100 && var1 >= 0) {
         _gGlobalVolume = var1;

         for(var1 = 0; var1 < this._mNumPlayers; ++var1) {
            this._mPlayerVolume[var1] = _gGlobalVolume;
         }
      }

   }

   public static int getAudioVolume() {
      return _gGlobalVolume;
   }

   private boolean a(int var1) {
      return var1 != -1 && var1 < this._mNumPlayers && this._mPlayer[var1] != null;
   }

   private boolean b(int var1) {
      return var1 != -1 && var1 < this._mNumPlayers && this._mPlayer[var1] != null && this._mPlayer[var1].getState() >= 300;
   }

   private boolean c(int var1) {
      return var1 == -1 || var1 >= this._mNumPlayers || this._mPlayer[var1] == null || (this.d[var1] != 8 || this.g[var1] != -1) && this._mPlayer[var1].getState() != 400;
   }

   private int d(int var1) {
      try {
         ByteArrayInputStream var2 = new ByteArrayInputStream(this.e[var1].getArray(), this.e[var1].getOffset(), this.e[var1].getLength());
         this._mPlayer[var1] = Manager.createPlayer(var2, a[this.f[var1]]);
         this._mPlayer[var1].realize();
         this.d[var1] = 1;
         var2.close();
         return 0;
      } catch (Exception var3) {
         this.j = -1;
         return -1;
      }
   }

   private int e(int var1) {
      if (!this.a(var1) && this.d(var1) == -1) {
         return -1;
      } else {
         try {
            this._mPlayer[var1].prefetch();
            this.d[var1] = 2;
            this.c[var1] = (VolumeControl)this._mPlayer[var1].getControl("VolumeControl");
            return 0;
         } catch (Exception var2) {
            this.j = -1;
            return -1;
         }
      }
   }

   private int f(int var1) {
      if (!this.c(var1)) {
         this.d[var1] = 8;
         return -1;
      } else {
         try {
            Thread.yield();
            this.c[var1].setMute(false);
            this.c[var1].setLevel(this._mPlayerVolume[var1]);
            this._mPlayer[var1].setLoopCount(this.g[var1]);
            this._mPlayer[var1].setMediaTime(0L);
            this._mPlayer[var1].start();
            this.d[var1] = 8;
            return 0;
         } catch (Exception var2) {
            return -1;
         }
      }
   }

   private int a() {
      for(int var1 = 0; var1 < this._mNumPlayers; ++var1) {
         if (this.b(var1) && (this.d[var1] == 8 || !this.c(var1))) {
            if (this.c(var1)) {
               this.d[var1] = 2;
            } else {
               this.g(var1);
               if (this.g[var1] == -1) {
                  this.d[var1] = 9;
               }
            }
         }
      }

      return 0;
   }

   private int g(int var1) {
      try {
         this._mPlayer[var1].stop();
         if (!this.c(var1)) {
            this.d[var1] = 11;
         } else {
            this.d[var1] = 2;
         }

         return 0;
      } catch (Exception var2) {
         return -1;
      }
   }

   private int h(int var1) {
      return this.i(var1) == 0 ? this.j(var1) : -1;
   }

   private int i(int var1) {
      if (this.b(var1)) {
         try {
            this._mPlayer[var1].stop();
            this.d[var1] = 5;
         } catch (Exception var2) {
            return this.j(var1);
         }
      }

      return 0;
   }

   private int j(int var1) {
      if (this.a(var1)) {
         try {
            this.d[var1] = 0;
         } catch (Exception var2) {
            return -1;
         }
      }

      return 0;
   }

   public void resetFades() {
      for(int var1 = 0; var1 < this.o.length; ++var1) {
         this.m[var1] = 0;
         this.o[var1] = false;
         this.n[var1] = 0;
      }

   }

   public void setFadeOut(int var1, int var2, int var3) {
      this.o[var1] = true;
      this.m[var1] = var2 << 8;
      this.n[var1] = -(var2 << 8) / var3;
   }

   public void setFadeIn(int var1, int var2, int var3) {
      this.o[var1] = true;
      this.m[var1] = 0;
      this.n[var1] = (var2 << 8) / var3;
   }

   public String report(int var1) {
      return null;
   }
}
