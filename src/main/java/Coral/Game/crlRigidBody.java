package Coral.Game;

import Coral.Util.crlManagerBase;

public class crlRigidBody extends crlManagerBase {
   crlBody[] mBodies;

   public final int open() {
      return 0;
   }

   public final int open(int var1) {
      this.mBodies = new crlBody[var1];
      return 0;
   }

   public int close() {
      return 0;
   }

   public int update() {
      return 0;
   }

   public String report(int var1) {
      return null;
   }
}
