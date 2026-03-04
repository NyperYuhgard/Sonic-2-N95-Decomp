package Coral.Util;

public class crlArrayList {
   private Object[] a;
   private int b;
   private int c;

   public crlArrayList() {
      this(32, 32);
   }

   public crlArrayList(int var1, int var2) {
      this.a = new Object[var1];
      this.b = var2;
   }

   public int size() {
      return this.c;
   }

   public boolean contains(Object var1) {
      for(int var2 = 0; var2 < this.c; ++var2) {
         if (this.a[var2].equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public int indexOf(Object var1) {
      for(int var2 = 0; var2 < this.c; ++var2) {
         if (this.a[var2].equals(var1)) {
            return var2;
         }
      }

      return -1;
   }

   public Object get(int var1) {
      return this.a[var1];
   }

   public Object remove(int var1) {
      Object var2 = this.a[var1];
      ++var1;

      while(var1 < this.c) {
         this.a[var1 - 1] = this.a[var1];
         ++var1;
      }

      --this.c;
      this.a[this.c] = null;
      return var2;
   }

   public boolean remove(Object var1) {
      int var2 = -1;

      int var3;
      for(var3 = 0; var3 < this.c; ++var3) {
         if (this.a[var3].equals(var1)) {
            var2 = var3;
            break;
         }
      }

      if (var2 == -1) {
         return false;
      } else {
         for(var3 = var2 + 1; var3 < this.c; ++var3) {
            this.a[var3 - 1] = this.a[var3];
         }

         --this.c;
         this.a[this.c] = null;
         return true;
      }
   }

   public void clear() {
      for(int var1 = 0; var1 < this.c; ++var1) {
         this.a[var1] = null;
      }

      this.c = 0;
   }

   public void add(Object var1) {
      if (this.c >= this.a.length) {
         this.a();
      }

      this.a[this.c] = var1;
      ++this.c;
   }

   public void add(int var1, Object var2) {
      if (this.c >= this.a.length) {
         this.a();
      }

      for(int var3 = this.c; var3 > var1; --var3) {
         this.a[var3] = this.a[var3 - 1];
      }

      this.a[var1] = var2;
      ++this.c;
   }

   public Object set(int var1, Object var2) {
      Object var3 = this.a[var1];
      this.a[var1] = var2;
      return var3;
   }

   public Object[] toArray() {
      Object[] var1 = new Object[this.c];
      System.arraycopy(this.a, 0, var1, 0, this.c);
      return var1;
   }

   public Object[] toArray(Object[] var1) {
      System.arraycopy(this.a, 0, var1, 0, this.c);
      return var1;
   }

   public void trimToSize() {
      if (this.a.length != this.c) {
         Object[] var1 = new Object[this.c];
         System.arraycopy(this.a, 0, var1, 0, this.c);
         this.a = var1;
      }

   }

   private void a() {
      int var1;
      int var2;
      if ((var2 = (var1 = this.a.length) + this.b) == var1) {
         ++var2;
      }

      Object[] var3 = new Object[var2];
      System.arraycopy(this.a, 0, var3, 0, this.c);
      this.a = var3;
   }
}
