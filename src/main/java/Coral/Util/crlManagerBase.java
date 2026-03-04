package Coral.Util;

public abstract class crlManagerBase {
   protected int _mStatus;

   public void crlManagerBase() {
      this._mStatus = 0;
   }

   public abstract int open();

   public abstract int close();

   public int reset() {
      return 0;
   }

   public abstract int update();

   public abstract String report(int var1);

   public int getStatus() {
      return this._mStatus;
   }

   public void setStatus(int var1) {
      this._mStatus = var1;
   }
}
