package Coral.Util;

public class crlInt {
   private int a;

   public crlInt(int var1) {
      this.a = var1;
   }

   public void setValue(int var1) {
      this.a = var1;
   }

   public int getValue() {
      return this.a;
   }

   public boolean equals(Object var1) {
      crlInt var2;
      return var1 instanceof crlInt && (var2 = (crlInt)var1).getValue() == this.a;
   }

   public int hashCode() {
      return this.a;
   }
}
