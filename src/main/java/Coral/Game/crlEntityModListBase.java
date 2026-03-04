package Coral.Game;

import Coral.Util.crlArrayList;

public class crlEntityModListBase extends crlEntityBase {
   private crlArrayList a = new crlArrayList(8, 8);

   public void open() {
   }

   public void close() {
      this.a.clear();
   }

   public void update() {
      int var1 = this.a.size();

      for(int var3 = 0; var3 < var1; ++var3) {
         ((crlModifierBase)this.a.get(var3)).update();
      }

   }

   public void addModifier(crlModifierBase var1) {
      this.a.add(var1);
   }

   public void removeModifier(crlModifierBase var1) {
      this.a.remove(var1);
   }

   public void clearModifiers() {
      this.a.clear();
   }

   public crlModifierBase findModifierByType(int var1) {
      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         crlModifierBase var3;
         if ((var3 = (crlModifierBase)this.a.get(var2)).mModifierType == var1) {
            return var3;
         }
      }

      return null;
   }

   public void insertModifier(crlModifierBase var1) {
   }

   public int size() {
      return this.a.size();
   }
}
