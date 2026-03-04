package Coral.Util;

import Coral.crlCanvas;
import Coral.Audio.iAudioLoader;
import Coral.Graphics2D.crlImagePacked;
import Coral.UI.crlUI;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;
import javax.microedition.rms.RecordStoreNotOpenException;

public class crlResourceManager extends crlManagerBase implements iAudioLoader {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   private static byte[] a;
   private static String b = "M_3D";
   private static String c = "/res/";
   private static String d = ".spg";
   private static String e = ".bin";
   public static final String[] LANGUAGE_STRINGS = new String[]{"en", "fr", "it", "de", "es", "nl", "pt"};
   private static int f = 16384;
   private static StringBuffer g;
   private long[] h;
   private int i;
   private InputStream j;
   private DataInputStream k;
   private boolean l;
   private byte[] m;
   private cResProcessObj[] n;
   private byte o = 22;
   private Hashtable p;
   private crlInt q;
   private int r;
   private long s = -1L;
   private int t = 0;
   private int u = -1;
   public static int mNumStrings;
   public static int mStrAboutID;
   public static int mStrCreditStartID;
   public static int mStrCreditEndID;
   protected static crlString _tString;
   public static crlString[] mLocaleText;
   private int v;

   public void setFileData(String var1, String var2) {
      c = var1;
      d = var2;
   }

   public crlResourceManager() {
      this.v = crlUI.mLocale;
   }

   public int open() {
      return this.a(0, 768, 16384, b);
   }

   public int open(int var1) {
      return this.a(var1, 768, 16384, b);
   }

   public int open(int var1, int var2) {
      return this.a(var1, var2, 16384, b);
   }

   public int open(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, b);
   }

   public int open(int var1, int var2, int var3, String var4) {
      return this.a(var1, var2, var3, var4);
   }

   private int a(int var1, int var2, int var3, String var4) {
      b = var4;
      if (var1 > 0) {
         this.m = new byte[var1];
      } else {
         this.m = null;
      }

      this.n = new cResProcessObj[4];
      this.addResProcessObj(1, new cStringLoaderProcObj());
      this.addResProcessObj(0, new cCacheProcObj());
      (g = new StringBuffer(128)).insert(0, c);
      this.p = new Hashtable(var2);
      this.q = new crlInt(0);
      a = new byte[var3];
      super._mStatus = 2;
      this.r = 3;
      return 0;
   }

   public int close() {
      if (this.n != null) {
         for(int var1 = 0; var1 < this.n.length; ++var1) {
            this.n[var1] = null;
         }
      }

      this.n = null;
      mLocaleText = null;
      this.p = null;
      this.q = null;
      g = null;
      this.m = null;
      return 0;
   }

   public String report(int var1) {
      return null;
   }

   public final int update() {
      byte var1 = 0;
      if (super._mStatus == 6) {
         crlResourceManager var9 = this;
         if (crlCanvas.mLoadInterrupted) {
            if (this.i > 0 && (int)(this.h[this.i] >> 32) != -1) {
               --this.i;
               this.unloadObject(this.h[this.i]);
               if (this.i > 0) {
                  this.s = this.h[this.i - 1];
               } else {
                  this.s = -1L;
               }
            }

            crlCanvas.mLoadInterrupted = false;
         }

         byte var10000;
         label68: {
            long var3;
            if ((var3 = this.h[this.i]) != 0L) {
               if ((int)(var3 >> 32) == -1) {
                  int var10 = (int)var3;
                  this.a(this.s, var10);
                  this.s = -1L;
               } else {
                  this.q.setValue((int)var3);
                  if (!this.p.containsKey(this.q)) {
                     System.gc();
                     this.r = 3;
                     boolean var11 = false;

                     while(!var11) {
                        var9.a(var3);
                        var9.q.setValue((int)var3);
                        if (var9.p.get(var9.q) != null) {
                           var11 = true;
                           var9.s = var3;
                        } else {
                           --var9.r;
                           if (var9.r < 0) {
                              var10000 = -1;
                              break label68;
                           }

                           crlUtil.garbageWait();
                        }
                     }
                  } else {
                     this.s = var3;
                  }
               }
            }

            if (crlCanvas.mLoadInterrupted) {
               if (var9.i >= 0 && (int)(var9.h[var9.i] >> 32) != -1) {
                  var9.unloadObject(var9.h[var9.i]);
                  crlUtil.garbageWait();
                  --var9.i;
                  if (var9.i > 0) {
                     var9.s = var9.h[var9.i - 1];
                  } else {
                     var9.s = -1L;
                  }
               }

               crlCanvas.mLoadInterrupted = false;
            }

            ++var9.i;
            if (var9.i == var9.h.length) {
               var9._mStatus = 2;
               crlUtil.garbageWait();
            }

            var10000 = 0;
         }

         var1 = var10000;
      }

      return var1;
   }

   public final int destroyScratchBuffer() {
      if (super._mStatus == 6) {
         return -1;
      } else {
         a = null;
         return 0;
      }
   }

   public final int createScratchBuffer(int var1) {
      if (super._mStatus != 2) {
         return -1;
      } else {
         try {
            f = var1;
            a = new byte[var1];
            return 0;
         } catch (Exception var2) {
            return -1;
         }
      }
   }

   public final Image getImageByID(long var1) {
      this.q.setValue((int)var1);
      return (Image)this.p.get(this.q);
   }

   public final Image createImageFromIDs(long var1, long var3) {
      boolean var5 = false;
      this.q.setValue((int)var1);
      crlBinArray var8;
      System.arraycopy((var8 = (crlBinArray)this.p.get(this.q)).getArray(), var8.getOffset(), a, 33, var8.getLength());
      int var9 = var8.getLength();
      int var10 = var9 + 33;
      this.q.setValue((int)var3);
      crlBinArray var6;
      System.arraycopy((var6 = (crlBinArray)this.p.get(this.q)).getArray(), var6.getOffset(), a, var10, var6.getLength());
      int var7 = var6.getLength();
      var10 += var7 - 33;
      System.arraycopy(a, var10, a, 0, 33);
      return Image.createImage(a, 0, var10);
   }

   public final crlImagePacked getIMPByID(long var1) {
      this.q.setValue((int)var1);
      return (crlImagePacked)this.p.get(this.q);
   }

   public final int loadPack(long[] var1) {
      if (super._mStatus == 0) {
         return -1;
      } else if (super._mStatus != 2) {
         return -1;
      } else {
         crlUtil.garbageWait();
         this.h = var1;
         this.i = 0;
         super._mStatus = 6;
         return 0;
      }
   }

   public final crlBinArray getBinBySpongeID(long var1) {
      this.q.setValue((int)var1);
      return (crlBinArray)this.p.get(this.q);
   }

   public final crlBinArray getAudioBinByID(long var1) {
      return this.getBinBySpongeID(var1);
   }

   public final void cacheSponge() {
      if (this.m != null) {
         try {
            if (this.j == null) {
               this.j = this.getClass().getResourceAsStream(c + b + d);
            }

            int var1 = 1048576;
            if (this.m.length - this.t < 1048576) {
               var1 = this.m.length - this.t;
            }

            if ((var1 = this.j.read(this.m, this.t, var1)) != -1 && var1 != 0) {
               this.t += var1;
               this.u = 10000 / (100 * (this.m.length - 1) / this.t);
               --this.i;
               return;
            }

            this.u = 100;
            this.t = this.m.length;
            this.j.close();
            this.l = true;
         } catch (Exception var2) {
         }

      }
   }

   private final void a(long var1, int var3) {
      cResProcessObj var5 = this.n[var3];

      try {
         var5.process(var1);
      } catch (Exception var4) {
      }
   }

    private final void a(byte var1, DataInputStream var2, int var3, long var4) {
        int var14;
        boolean var10000;
        byte[] var17;

        switch(var1) {
            case 1:
                try {
                    // Nota: Asegúrate de que 'a' esté declarada como byte[] en la clase
                    var2.readFully(a, 0, var3);
                    Image var19 = Image.createImage(a, 0, var3);
                    this.q.setValue((int)var4);
                    this.p.put(this.q, var19);
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
                var10000 = false;
                return;

            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
                byte[] var18 = new byte[var3];
                try {
                    var2.readFully(var18, 0, var3);
                    crlBinArray var20;
                    (var20 = new crlBinArray()).set(var18, 0, var3);
                    this.p.put(this.q, var20);
                    this.q.setValue((int)var4);
                    this.p.put(this.q, var20);
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
                var10000 = false;
                return;

            case 9:
                var14 = var3;
                DataInputStream var12 = var2;
                crlResourceManager var11 = this;
                byte var16 = 0;
                var17 = new byte[4];
                try {
                    var2.readFully(var17, 0, 4);
                    int var21 = 0; // Inicializada para evitar errores en el for
                    for(var3 = var16 + 4; var3 < var14; var3 += var21 + 9) {
                        var21 = var12.readInt();
                        int var22 = var12.readInt();
                        byte var23 = var12.readByte();
                        var11.a(var23, var12, var21, (long)var22);
                    }
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
                var10000 = false;
                return;

            case 11:
                var14 = var3;
                try {
                    var3 = var2.readInt();
                    var14 -= 4;
                    var17 = new byte[var3];
                    var2.readFully(var17, 0, var3);

                    var14 -= var3;
                    byte[] var5 = new byte[var14];
                    var2.readFully(var5, 0, var14);

                    Image var6 = Image.createImage(var5, 0, var14);
                    short[] var7 = new short[var3 / 2];

                    for(int var13 = 0; var13 < var3 / 2; ++var13) {
                        var7[var13] = crlUtil.toShort(var17, var13 << 1);
                    }

                    crlImagePacked var15;
                    (var15 = new crlImagePacked()).open(var6, var7);
                    this.q.setValue((int)var4);
                    this.p.put(this.q, var15);
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
                var10000 = false;
                return;

            case 5:
            case 8:
            case 10:
            default:
                return;
        }
    }

   private final void a(byte var1, int var2, int var3, long var4) {
      int var5;
      crlResourceManager var11;
      int var12;
      int var10001;
      boolean var19;
      switch(var1) {
      case 1:
         Image var15 = Image.createImage(this.m, var2, var3);
         this.q.setValue((int)var4);
         this.p.put(this.q, var15);
         var19 = false;
         return;
      case 2:
      case 3:
      case 4:
      case 6:
      case 7:
         crlBinArray var13;
         (var13 = new crlBinArray()).set(this.m, var2, var3);
         this.p.put(this.q, var13);
         this.q.setValue((int)var4);
         this.p.put(this.q, var13);
         var19 = false;
         return;
      case 9:
         var10001 = var2;
         var2 = var3;
         var12 = var10001;
         var11 = this;
         var3 = 4;

         for(var12 += 4; var3 < var2; var12 += var5) {
            var5 = crlUtil.toInt(var11.m, var12);
            var12 += 4;
            int var18 = crlUtil.toInt(var11.m, var12);
            var12 += 4;
            byte var16 = var11.m[var12];
            ++var12;
            var11.a(var16, var12, var5, (long)var18);
            var3 += var5 + 9;
         }

         var19 = false;
      case 5:
      case 8:
      case 10:
      default:
         return;
      case 11:
         var10001 = var2;
         var2 = var3;
         var12 = var10001;
         var11 = this;
         var3 = crlUtil.toInt(this.m, var12);
         var2 -= 4;
         var12 += 4;
         short[] var14 = new short[var3 / 2];

         for(var5 = 0; var5 < var3 / 2; ++var5) {
            var14[var5] = crlUtil.toShort(var11.m, var12);
            var12 += 2;
         }

         var2 -= var3;
         Image var17 = Image.createImage(var11.m, var12, var2);
         crlImagePacked var6;
         (var6 = new crlImagePacked()).open(var17, var14);
         var11.q.setValue((int)var4);
         var11.p.put(var11.q, var6);
         var19 = false;
      }
   }

   private final byte a(long var1) {
      byte var3 = -1;

      try {
         if (this.l) {
            int var9 = (int)(var1 >> 32);
            int var2 = crlUtil.toInt(this.m, var9);
            var9 += 4;
            int var4 = crlUtil.toInt(this.m, var9);
            var9 += 4;
            var3 = this.m[var9];
            ++var9;
            if ((var3 & 64) == 64) {
               var3 &= -65;
            }

            if ((var3 & -128) == -128) {
               var3 = (byte)(var3 & 127);
               int var5 = crlUtil.toInt(this.m, var9);
               var9 += 4;
               int var6 = c.length();

               for(int var7 = 0; var7 < var2 - 4; ++var7) {
                  g.append((char)this.m[var9++]);
               }

               String var11 = g.toString();
               int var10003 = var5;
               var5 = var4;
               var4 = var10003;
               String var10 = var11;
               this.j = this.getClass().getResourceAsStream(var10);
               if (this.j == null) {
                  crlUtil.garbageWait();
               }

               this.k = new DataInputStream(this.j);
               this.a(var3, this.k, var4, (long)var5);
               this.j.close();
               g.delete(var6, 128 - var6);
            } else {
               this.a(var3, var9, var2, (long)var4);
            }
         }
      } catch (Exception var8) {
      }

      return var3;
   }

   public final void insertPack(long[] var1) {
      long[] var2 = new long[this.h.length + var1.length];
      System.arraycopy(this.h, 0, var2, 0, this.h.length);
      System.arraycopy(var1, 0, var2, this.h.length, var1.length);
      this.h = var2;
   }

   public final int destroyPack(long[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if ((int)(var1[var2] >> 32) != -1) {
            this.unloadObject(var1[var2]);
         }
      }

      return 0;
   }

   public final int unloadObject(long var1) {
      this.q.setValue((int)var1);
      return this.p.remove(this.q) == null ? -1 : 0;
   }

   public final long[] getCurrentPack() {
      return this.h;
   }

   public final int getCurrentPackProgress() {
      if (super._mStatus == 2) {
         return 100;
      } else if (super._mStatus == 6 && this.h.length > 0 && this.i > 0) {
         int var1 = 10000 / (100 * (this.h.length - 1) / this.i) / 4 * 3;
         return this.u / 4 + var1;
      } else {
         return 0;
      }
   }

   public final void initStrings(int var1, int var2, int var3, int var4) {
      mNumStrings = var1;
      mStrAboutID = var2;
      mStrCreditStartID = var3;
      mStrCreditEndID = var4;
   }

   public void setLocale(int var1) {
      this.v = var1;
   }

   public final void loadStrings() {
      mLocaleText = new crlString[mNumStrings];
      boolean var1 = false;
      int var2 = 0;
      boolean var3 = false;
      this.a(a, "cUItext_" + LANGUAGE_STRINGS[this.v] + e);

      try {
         for(int var6 = 0; var6 < mNumStrings; ++var6) {
            short var7 = crlUtil.toShortIntel(a, var2);
            var2 += 2;
            mLocaleText[var6] = new crlString(a, var2, var7);
            var2 += var7;
         }
      } catch (Exception var4) {
      }

      byte[] var5 = new byte[]{35};
      mLocaleText[mStrAboutID].insert(crlCanvas._mVersion.getBytes(), var5);
      crlUtil.garbageWait();
   }

   private final int a(byte[] var1, String var2) {
      byte var7;
      try {
         InputStream var5 = this.getClass().getResourceAsStream(c + var2);
         boolean var8 = false;
         DataInputStream var6 = new DataInputStream(var5);
         var8 = false;

         try {
            var6.read(var1);
            var7 = 0;
         } catch (Exception var3) {
            var7 = -3;
         }

         var6.close();
      } catch (Exception var4) {
         var7 = -4;
      }

      return var7;
   }

   public void addResProcessObj(int var1, cResProcessObj var2) {
      this.n[var1] = var2;
   }

   public void delResProcessObj(int var1) {
      this.n[var1] = null;
   }

   public void setNumProcessObjs(int var1) {
      if (this.n.length != var1 && var1 >= 2) {
         cResProcessObj[] var2 = new cResProcessObj[var1];
         if (this.n.length > var1) {
            System.arraycopy(this.n, 0, var2, 0, var1);
         } else {
            System.arraycopy(this.n, 0, var2, 0, this.n.length);
         }

         this.n = var2;
      }
   }

   public boolean saveData(String var1, byte[] var2) {
      try {
         if (this.saveDataExists(var1)) {
            RecordStore.deleteRecordStore(var1);
         }

         RecordStore var7;
         (var7 = RecordStore.openRecordStore(var1, true)).addRecord(var2, 0, var2.length);
         var7.closeRecordStore();
         return true;
      } catch (RecordStoreNotFoundException var3) {
      } catch (RecordStoreFullException var4) {
      } catch (RecordStoreException var5) {
      } catch (IllegalArgumentException var6) {
      }

      return false;
   }

   public boolean deleteSaveData(String var1) {
      try {
         RecordStore.deleteRecordStore(var1);
         return true;
      } catch (RecordStoreNotFoundException var2) {
         return true;
      } catch (RecordStoreException var3) {
         return false;
      }
   }

   public boolean saveDataExists(String var1) {
      try {
         RecordStore.openRecordStore(var1, false).closeRecordStore();
         return true;
      } catch (RecordStoreNotFoundException var2) {
         return false;
      } catch (RecordStoreFullException var3) {
      } catch (RecordStoreException var4) {
      } catch (IllegalArgumentException var5) {
      }

      return false;
   }

   public byte[] loadData(String var1) {
      RecordStore var26 = null;

      try {
         (var26 = RecordStore.openRecordStore(var1, false)).getNumRecords();
         boolean var27 = false;
         var26.getRecordSize(1);
         var27 = false;
         byte[] var28 = var26.getRecord(1);
         var26.closeRecordStore();
         var28 = var28;
         return var28;
      } catch (RecordStoreNotFoundException var21) {
         return null;
      } catch (RecordStoreFullException var22) {
      } catch (RecordStoreException var23) {
      } catch (IllegalArgumentException var24) {
      } finally {
         try {
            if (var26 != null) {
               var26.closeRecordStore();
            }
         } catch (RecordStoreNotOpenException var19) {
         } catch (RecordStoreException var20) {
         }

      }

      return null;
   }

   public void setKey(byte var1) {
      this.o = var1;
   }

   public void decodeBuffer(byte[] var1) {
      this.decodeBuffer(var1, 0, var1.length);
   }

   public void decodeBuffer(byte[] var1, int var2, int var3) {
      int var4;
      if ((var3 = var3) < 100) {
         var4 = 10 + var3 % 10;
      } else if (var3 < 200) {
         var4 = 50 + var3 % 20;
      } else if (var3 < 300) {
         var4 = 80 + var3 % 20;
      } else {
         var4 = 100 + var3 % 50;
      }

      for(int var7 = 0; var7 < var4; ++var7) {
         int var5 = var7 + var2;
         int var6 = var3 - var7 - 1 + var2;
         var1[var5] ^= this.o;
         var1[var6] ^= this.o;
         var1[var5] ^= var1[var6];
         var1[var6] ^= var1[var5];
         var1[var5] ^= var1[var6];
      }

   }
}
