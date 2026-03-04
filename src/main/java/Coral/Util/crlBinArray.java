package Coral.Util;

public class crlBinArray {
   private byte[] a;
   private int b;
   private int c;

   public void set(byte[] var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public byte[] getArray() {
      return this.a;
   }

   public int getOffset() {
      return this.b;
   }

   public int getLength() {
      return this.c;
   }

   public byte[] getCopyOfArray() {
      if (this.c == 0) {
         return null;
      } else {
         byte[] var1 = new byte[this.c];
         System.arraycopy(this.a, this.b, var1, 0, this.c);
         return var1;
      }
   }
}
