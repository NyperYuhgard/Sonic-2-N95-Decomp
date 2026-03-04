package STH2P1;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class STH2P1 extends MIDlet {
   public static STH2P1 _gmMIDlet = null;
   private static cCanvas a = null;

   public STH2P1() {
      _gmMIDlet = this;
   }

   public void startApp() {
      if (a == null) {
         (a = new cCanvas()).open(_gmMIDlet);
         Display.getDisplay(this).setCurrent(a);
         a.startThread();
      }

   }

   public void pauseApp() {
      a.pause();
   }

   public void destroyApp(boolean var1) {
      if (a != null) {
         a.close();
         a = null;
      }

   }

   public static final void quitApp() {
      _gmMIDlet.notifyDestroyed();
   }

   public static String getProperty(String var0) {
      return _gmMIDlet.getAppProperty(var0);
   }

   public static boolean platRequest(String var0) {
      try {
         return _gmMIDlet.platformRequest(var0);
      } catch (Exception var1) {
         return true;
      }
   }

   public static boolean isActive() {
      return a.isShown();
   }
}
