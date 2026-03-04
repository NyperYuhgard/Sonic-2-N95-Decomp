package Coral.Util;

import Coral.crlCanvas;

public class cCacheProcObj extends cResProcessObj {
   public void process(long var1) {
      crlCanvas.gResourceManager.cacheSponge();
   }
}
