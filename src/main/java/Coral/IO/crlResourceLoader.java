package Coral.IO;

import Coral.crlCanvas;
import Coral.Graphics2D.crlImagePacked;
import Coral.Util.crlResourceManager;
import Coral.Util.crlString;
import Coral.Util.crlUtil;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public class crlResourceLoader implements iLoadEvent, iLoader {
   static final int MBOOSTER_MAX_INSTANCES = 1;
   long PO_CACHE;
   long PO_LOAD_STRINGS;
   public static final int INITAL_CAPACITY = 10;
   public static final byte[] HASH_CHAR = new byte[]{35};
   private Hashtable a;
   private iLoadEvent b;
   private int c;
   private int d;
   private int e;
   private int f;
   private InputStream g;
   public static crlString[] localeStrings;
   private long[] h;
   private int i;
   public String localeFile;
   public String spongeFile;

   public crlResourceLoader() {
      this(1);
   }

   public crlResourceLoader(int var1) {
      this.PO_CACHE = -4294967296L;
      this.PO_LOAD_STRINGS = -4294967295L;
      this.a = new Hashtable(10);
      this.setListener(this);
   }

   public void initStrings(String var1, int var2, int var3, int var4) {
      this.localeFile = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public void setListener(iLoadEvent var1) {
      this.b = var1;
   }

   private int a(long var1) {
      byte var3 = 0;

      try {
         DataInputStream var12;
         (var12 = this.b(var1)).readInt();
         var12.readInt();
         var3 = var12.readByte();
      } catch (Throwable var10) {
      } finally {
         try {
            if (this.g != null) {
               this.g.close();
            }
         } catch (Throwable var9) {
         }

      }

      return var3;
   }

   private DataInputStream b(long var1) {
      try {
         this.g = this.getClass().getResourceAsStream(this.spongeFile);
         DataInputStream var4 = new DataInputStream(this.g);

         for(int var5 = (int)(var1 >> 32); var5 > 0; var5 = (int)((long)var5 - var4.skip((long)var5))) {
         }

         return var4;
      } catch (Throwable var3) {
         return null;
      }
   }

   private byte[] c(long var1) {
      try {
         DataInputStream var12;
         int var2 = (var12 = this.b(var1)).readInt();
         var12.readInt();
         var12.readByte();
         byte[] var3 = new byte[var2];
         var12.readFully(var3, 0, var2);
         byte[] var13 = var3;
         return var13;
      } catch (Throwable var10) {
      } finally {
         try {
            if (this.g != null) {
               this.g.close();
            }
         } catch (Throwable var9) {
         }

      }

      return null;
   }

   public Image getImageByID(long var1) {
      return (Image)this.d(var1);
   }

   public byte[] getBinBySpongeID(long var1) {
      return (byte[])((byte[])this.d(var1));
   }

   public crlImagePacked getIMPByID(long var1) {
      return (crlImagePacked)this.d(var1);
   }

   private Object d(long var1) {
      Object var3;
      if ((var3 = this.a.get(new Long(var1))) != null) {
         return var3;
      } else {
         int var4 = this.a(var1);
         if (!this.b.preLoad(var1, var4)) {
            return null;
         } else if ((var3 = this.a.get(new Long(var1))) != null) {
            return var3;
         } else {
            byte[] var5 = this.c(var1);
            if (!this.b.onLoad(var5, var1, var4)) {
               return null;
            } else {
               var3 = this.a.get(new Long(var1));
               return !this.b.postLoad(var3, var1, var4) ? null : var3;
            }
         }
      }
   }

   public Object unloadObject(long var1, boolean var3) {
      Object var4 = this.a.remove(new Long(var1));
      if (var3) {
         var4 = null;
      }

      return var4;
   }

   public Object unloadObject(long var1) {
      return this.unloadObject(var1, false);
   }

   public boolean preLoad(long var1, int var3) {
      if (var1 == this.PO_LOAD_STRINGS) {
         crlResourceLoader var6 = this;

         try {
            localeStrings = new crlString[var6.c];
            byte[] var7 = new byte[var6.e];
            var6.getClass().getResourceAsStream(var6.localeFile).read(var7, 0, var7.length);
            boolean var2 = false;
            var3 = 0;

            for(int var4 = 0; var4 < var6.c; ++var4) {
               short var8 = crlUtil.toShortIntel(var7, var3);
               var3 += 2;
               localeStrings[var4] = new crlString(var7, var3, var8);
               var3 += var8;
            }

            localeStrings[var6.d].insert(crlCanvas._mVersion.getBytes(), HASH_CHAR);
            crlResourceManager.mLocaleText = localeStrings;
         } catch (Throwable var5) {
         }

         return false;
      } else {
         return true;
      }
   }

   public boolean onLoad(byte[] var1, long var2, int var4) {
      switch(var4) {
      case 1:
         Image var10 = Image.createImage(var1, 0, var1.length);
         this.a.put(new Long(var2), var10);
         return true;
      case 11:
         short[] var5 = new short[(var4 = crlUtil.toInt(var1, 0)) / 2];
         int var6 = var1.length - 4;
         int var7 = 4;

         for(int var8 = 0; var8 < var4 / 2; ++var8) {
            var5[var8] = crlUtil.toShort(var1, var7);
            var7 += 2;
         }

         var6 -= var4;
         Image var11 = Image.createImage(var1, var7, var6);
         crlImagePacked var9;
         (var9 = new crlImagePacked()).open(var11, var5);
         this.a.put(new Long(var2), var9);
         return true;
      default:
         this.a.put(new Long(var2), var1);
         return false;
      }
   }

   public boolean postLoad(Object var1, long var2, int var4) {
      return false;
   }

   public void loadPack(long[] var1) {
      this.h = var1;
      this.i = 0;
   }

   public long[] getCurrentPack() {
      return this.h;
   }

   public void destroyPack(long[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.unloadObject(var1[var2]);
      }

   }

   public int getCurrentPackProgress() {
      return this.i * 100 / this.h.length;
   }

   public int update() {
      this.f = 0;
      if (this.h != null && this.i < this.h.length) {
         long var1 = this.h[this.i];
         this.d(var1);
         ++this.i;
         if (this.i >= this.h.length) {
            this.f = 2;
         } else {
            this.f = 6;
         }
      }

      return this.f;
   }

   public void close() {
   }

   public int getStatus() {
      return this.f;
   }

   public byte[] loadRmsData(String var1) {
      RecordStore var3 = null;

      try {
         byte[] var4 = (var3 = RecordStore.openRecordStore(var1, false)).getRecord(1);
         var3.closeRecordStore();
         return var4;
      } catch (Throwable var2) {
         return null;
      }
   }

   public void saveRmsData(String var1, byte[] var2) {
      try {
         RecordStore var5 = RecordStore.openRecordStore(var1, true);

         try {
            var5.setRecord(1, var2, 0, var2.length);
         } catch (Throwable var3) {
            var5.addRecord(var2, 0, var2.length);
         }

         var5.closeRecordStore();
      } catch (Throwable var4) {
      }
   }
}
