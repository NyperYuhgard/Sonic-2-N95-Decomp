package Coral.Util;

public class crlString {
   protected byte[] _mString;

   public crlString() {
   }

   public crlString(byte[] var1, int var2, int var3) {
      this._mString = new byte[var3 + 1];
      System.arraycopy(var1, var2, this._mString, 0, var3);
   }

   public crlString(byte[] var1) {
      boolean var2 = false;

      int var3;
      for(var3 = 0; var3 < var1.length && var1[var3] != 0; ++var3) {
      }

      this._mString = new byte[var3 + 1];
      System.arraycopy(var1, 0, this._mString, 0, var3);
   }

   public crlString(String var1) {
      byte[] var3;
      int var2 = (var3 = var1.getBytes()).length;
      this._mString = new byte[var2 + 1];
      System.arraycopy(var3, 0, this._mString, 0, var2);
   }

   public byte[] get() {
      return this._mString;
   }

   public void insert(byte[] var1, byte[] var2) {
      int var3;
      if ((var3 = this.findString(var2, 0)) != -1) {
         byte[] var4 = new byte[this._mString.length - var2.length + var1.length];
         System.arraycopy(this._mString, 0, var4, 0, var3);
         System.arraycopy(var1, 0, var4, var3, var1.length);
         System.arraycopy(this._mString, var3 + var2.length, var4, var3 + var1.length, var4.length - (var3 + var1.length));
         this._mString = var4;
      }

   }

   public void append(crlString var1) {
      byte[] var2 = new byte[this._mString.length - 1 + var1.length()];
      System.arraycopy(this._mString, 0, var2, 0, this._mString.length - 1);
      System.arraycopy(var1.get(), 0, var2, this._mString.length - 1, var1.length());
      this._mString = var2;
   }

   public int findString(byte[] var1, int var2) {
      int var3 = 0;

      for(var2 = var2; var2 < this._mString.length; ++var2) {
         if (this._mString[var2] == var1[var3]) {
            ++var3;
            if (var3 >= var1.length) {
               break;
            }
         } else {
            var3 = 0;
         }
      }

      if (var2 >= this._mString.length) {
         var2 = -1;
      } else {
         var2 -= var1.length - 1;
      }

      return var2;
   }

   public int findChar(byte var1, int var2) {
      for(var2 = var2; var2 < this._mString.length; ++var2) {
         if (this._mString[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public crlString substring(int var1, int var2) {
      byte[] var3 = new byte[var2 -= var1];
      System.arraycopy(this._mString, var1, var3, 0, var2);
      return new crlString(var3, 0, var2);
   }

   public void deleteSubString(int var1, int var2) {
      byte[] var3 = new byte[this._mString.length - (var2 - var1)];
      System.arraycopy(this._mString, 0, var3, 0, var1);
      System.arraycopy(this._mString, var2, var3, var1, this._mString.length - var2);
      this._mString = var3;
   }

   public String toString() {
      return toString(this._mString);
   }

   public static String toString(byte[] var0) {
      int var1;
      for(var1 = 0; var1 < var0.length && var0[var1] != 0; ++var1) {
      }

      char[] var3 = new char[var1];

      for(int var2 = 0; var2 < var3.length; ++var2) {
         var3[var2] = (char)var0[var2];
      }

      return new String(var3);
   }

   public int indexOf(int var1) {
      return this.findChar((byte)var1, 0);
   }

   public int indexOf(int var1, int var2) {
      return this.findChar((byte)var1, var2);
   }

   public int length() {
      return this._mString.length;
   }
}
