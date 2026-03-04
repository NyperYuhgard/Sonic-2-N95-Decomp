package STH2P1;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public class Console {
   public static boolean show = true;
   static final int lines = 14;
   static final int lineHeight = 14;
   static int lineCounter = 0;
   static Graphics g = null;
   static String[] buffer = new String[14];
   static Font consoleFont;

   public static void flipShow() {
      show = !show;
   }

   public static void add(String var0) {
   }

   public static void draw(Graphics var0) {
      g = var0;
   }

   public static void draw() {
   }

   static {
      for(int var0 = 0; var0 < 14; ++var0) {
         buffer[var0] = " ";
      }

      buffer[13] = "DebugConsole by wolf is ready.";
      consoleFont = Font.getFont(32, 0, 8);
   }
}
