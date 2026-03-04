package Coral.Game;

import Coral.Util.crlArrayList;
import Coral.Util.crlManagerBase;

public class crlEntityManager extends crlManagerBase {
   private crlArrayList a;

   public final int open() {
      this.a = new crlArrayList();
      return 0;
   }

   public final int open(int var1, int var2) {
      this.setStatus(1);
      this.a = new crlArrayList(var1, var2);
      this.setStatus(2);
      return 0;
   }

   public final int close() {
      this.setStatus(5);
      this.a.clear();
      this.a = null;
      this.setStatus(0);
      return 0;
   }

   public final int update() {
      int var1 = this.a.size();

      for(int var3 = 0; var3 < var1; ++var3) {
         crlEntityBase var2;
         if ((var2 = (crlEntityBase)this.a.get(var3)) != null) {
            var2.update();
         }
      }

      return 0;
   }

   public final int add(crlEntityBase var1) {
      this.a.add(var1);
      return 0;
   }

   public final int delete(crlEntityBase var1) {
      this.a.remove(var1);
      return 0;
   }

   public final crlEntityBase find(crlEntityBase var1) {
      return null;
   }

   public final int reset() {
      this.a.clear();
      return 0;
   }

   public final String report(int var1) {
      return null;
   }
}
