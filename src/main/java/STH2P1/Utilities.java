package STH2P1;

import Coral.crlCanvas;
import Coral.Debug.crlDebug;
import Coral.Util.crlUtil;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class Utilities {
   private static final Random a = new Random();
   private static final int[] b = new int[]{0, 6, 12, 18, 25, 31, 37, 43, 49, 56, 62, 68, 74, 80, 86, 92, 97, 103, 109, 115, 120, 126, 131, 136, 142, 147, 152, 157, 162, 167, 171, 176, 181, 185, 189, 193, 197, 201, 205, 209, 212, 216, 219, 222, 225, 228, 231, 234, 236, 238, 241, 243, 244, 246, 248, 249, 251, 252, 253, 254, 254, 255, 255, 255, 256, 255, 255, 255, 254, 254, 253, 252, 251, 249, 248, 246, 244, 243, 241, 238, 236, 234, 231, 228, 225, 222, 219, 216, 212, 209, 205, 201, 197, 193, 189, 185, 181, 176, 171, 167, 162, 157, 152, 147, 142, 136, 131, 126, 120, 115, 109, 103, 97, 92, 86, 80, 74, 68, 62, 56, 49, 43, 37, 31, 25, 18, 12, 6, 0, 65530, 65524, 65518, 65511, 65505, 65499, 65493, 65487, 65480, 65474, 65468, 65462, 65456, 65450, 65444, 65439, 65433, 65427, 65419, 65416, 65410, 65405, 65400, 65394, 65389, 65384, 65379, 65374, 65369, 65365, 65360, 65355, 65351, 65347, 65343, 65339, 65335, 65331, 65327, 65324, 65320, 65317, 65314, 65311, 65308, 65305, 65302, 65300, 65298, 65295, 65293, 65292, 65290, 65288, 65287, 65285, 65284, 65283, 65282, 65282, 65281, 65281, 65281, 65280, 65281, 65281, 65281, 65282, 65282, 65283, 65284, 65285, 65287, 65288, 65290, 65292, 65293, 65295, 65298, 65300, 65302, 65305, 65308, 65311, 65314, 65317, 65320, 65324, 65327, 65331, 65335, 65339, 65343, 65347, 65351, 65355, 65360, 65365, 65369, 65374, 65379, 65384, 65389, 65394, 65400, 65405, 65410, 65416, 65419, 65427, 65433, 65439, 65444, 65450, 65456, 65462, 65468, 65474, 65480, 65487, 65493, 65499, 65505, 65511, 65518, 65524, 65530};
   private static final int[] c = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 32, 32, 32, 32, 32, 32, 32};
   static final int[][] AFFINE_TRANS = new int[][]{{0, 4096, -4096, -4096, 0, 4096}, {0, -4096, 4096, -4096, 0, 4096}, {0, 4096, -4096, 4096, 0, -4096}, {0, -4096, 4096, 4096, 0, -4096}};
   private static boolean d = false;

   private Utilities() {
   }

   public static int getRandom() {
      return Math.abs(a.nextInt());
   }

   public static byte[] arrayInputDataByte1(String var0) {
      DataInputStream var1 = null;
      byte[] var2 = null;

      try {
         DataInputStream var9;
         byte[] var3 = new byte[(var9 = var1 = a(var0)).readInt()];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = var9.readByte();
         }

         var2 = var3;
      } catch (Exception var7) {
      } finally {
         a((InputStream)var1);
      }

      return var2;
   }

   public static String[][] arrayInputDataString2(String var0) {
      DataInputStream var1 = null;
      String[][] var2 = null;

      try {
         DataInputStream var9;
         String[][] var3 = new String[(var9 = var1 = a(var0)).readInt()][];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = a(var9);
         }

         var2 = var3;
      } catch (Exception var7) {
      } finally {
         a((InputStream)var1);
      }

      return var2;
   }

   public static String[] arrayInputDataString1(String var0) {
      DataInputStream var1 = null;
      String[] var2 = null;

      try {
         var2 = a(var1 = a(var0));
      } catch (Exception var5) {
      } finally {
         a((InputStream)var1);
      }

      return var2;
   }

    private static String[] a(DataInputStream var0) {
        try {
            String[] var1 = new String[var0.readInt()];

            for(int var2 = 0; var2 < var1.length; ++var2) {
                var1[var2] = var0.readUTF();
            }

            return var1;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return new String[0]; // Retorna un array vacío para evitar que el juego crashee por NullPointerException
        }
    }

   public static int[] arrayInputDataInt1(String var0) {
      DataInputStream var1 = null;
      int[] var2 = null;

      try {
         var2 = b(var1 = a(var0));
      } catch (Exception var5) {
      } finally {
         a((InputStream)var1);
      }

      return var2;
   }

    private static int[] b(DataInputStream var0) {
        try {
            int[] var1 = new int[var0.readInt()];

            for(int var2 = 0; var2 < var1.length; ++var2) {
                int var3 = var0.readInt();
                var1[var2] = var3;
            }

            return var1;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            // Retornamos un array de tamaño 0 para evitar que el código que
            // usa este resultado lance un NullPointerException.
            return new int[0];
        }
    }

   public static int[][] arrayInputDataInt2(String var0) {
      DataInputStream var1 = null;
      int[][] var2 = null;

      try {
         var2 = c(var1 = a(var0));
      } catch (Exception var5) {
      } finally {
         a((InputStream)var1);
      }

      return var2;
   }

    private static int[][] c(DataInputStream var0) {
        try {
            int[][] var1 = new int[var0.readInt()][];

            for(int var2 = 0; var2 < var1.length; ++var2) {
                var1[var2] = b(var0);
            }

            return var1;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            // Retornamos una matriz vacía para evitar errores de puntero nulo
            return new int[0][0];
        }
    }

   private static DataInputStream a(String var0) {
      InputStream var1 = (new Object()).getClass().getResourceAsStream(var0);
      return new DataInputStream(var1);
   }

   private static void a(InputStream var0) {
      if (var0 != null) {
         try {
            var0.close();
            return;
         } catch (Exception var1) {
         }
      }

   }

   static void loadImages(String[] var0, Image[] var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         try {
            var1[var2] = Image.createImage(var0[var2]);
         } catch (Exception var3) {
         }
      }

   }

   public static int[][][] arrayInputDataInt3(String var0) {
      Object var1 = null;
      DataInputStream var2;
      int[][][] var3 = arrayInputDataInt3(var2 = a(var0));
      a((InputStream)var2);
      return var3;
   }

   public static int[][][] arrayInputDataInt3(DataInputStream var0) {
      int[][][] var1 = null;

      try {
         var1 = new int[var0.readInt()][][];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = c(var0);
         }
      } catch (Exception var3) {
      }

      return var1;
   }

   public static byte[] readBinaryFromArchive(String var0) {
      byte[] var1 = null;
      DataInputStream var3 = a(var0);

      try {
         var1 = new byte[var3.available()];
         var3.read(var1);
      } catch (Exception var2) {
      }

      return var1;
   }

   public static int sinset(int var0) {
      var0 &= 255;
      if (((var0 = b[var0]) & '耀') != 0) {
         var0 |= -65536;
      }

      return var0;
   }

   public static int cosset(int var0) {
      return sinset(var0 + 64);
   }

   public static int atan(int var0, int var1) {
      int var2 = var0;
      int var3 = var1;
      if (var0 == 0 && var1 == 0) {
         return 64;
      } else {
         if (var0 < 0) {
            var2 = 0 - var0;
         }

         if (var1 < 0) {
            var3 = 0 - var1;
         }

         if (var3 < var2) {
            var3 = (var3 <<= 8) / var2;
            var3 = Math.min(255, Math.max(0, var3));
            var2 = c[var3];
         } else {
            var2 = (var2 <<= 8) / var3;
            var2 = Math.min(255, Math.max(0, var2));
            var2 = 64 - c[var2];
         }

         if (var0 < 0) {
            var2 = 0 - var2;
            var2 += 128;
         }

         if (var1 < 0) {
            var2 = 0 - var2;
            var2 += 256;
         }

         return var2 & 255;
      }
   }

   public static int ext(int var0) {
      if ((var0 & '耀') != 0) {
         var0 |= -4096;
      }

      return var0;
   }

   public static void drawImage(Graphics var0, Image[] var1, int[][] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         switch(var4 & 3) {
         case 0:
            if (var3 == 7) {
               var4 = scale(var5 + var2[var3][5]);
               var5 = scale(var6 + var2[var3][6]);
               var6 = scale(var2[var3][1]);
               var7 = scale(var2[var3][2]);
               var8 = scale(var2[var3][3]);
               int var9 = scale(var2[var3][4]);
               var0.setClip(var4, var5, var8, var9);
               var0.drawImage(var1[var2[var3][0]], var4 - var6, var5 - var7, 20);
               var0.setClip(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
            } else {
               drawImage(var0, var1[var2[var3][0]], var5 + var2[var3][5], var6 + var2[var3][6], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var8);
            }
            break;
         case 1:
            drawImage(var0, var1[var2[var3][0]], var5 - var2[var3][3] - var2[var3][5], var6 + var2[var3][6], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var8);
            break;
         case 2:
            drawImage(var0, var1[var2[var3][0]], var5 + var2[var3][5], var6 - var2[var3][4] - var2[var3][6], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var8);
            break;
         case 3:
            drawImage(var0, var1[var2[var3][0]], var5 - var2[var3][3] - var2[var3][5], var6 - var2[var3][4] - var2[var3][6], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var8);
         default:
            return;
         }
      } catch (Exception var10) {
      }

   }

   public static void drawImage(Graphics var0, Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var4 = scale(var4);
      var5 = scale(var5);
      var2 = scale(var2);
      var3 = scale(var3);
      var6 = scale(var6);
      var7 = scale(var7);
      byte var10 = 0;
      if (var9 == 0) {
         switch(var8 & 3) {
         case 0:
            var10 = 0;
            break;
         case 1:
            var10 = 2;
            break;
         case 2:
            var10 = 1;
            break;
         case 3:
            var10 = 3;
         }
      } else {
         switch(var8 & 3) {
         case 0:
            var10 = 6;
            break;
         case 1:
            var10 = 7;
            break;
         case 2:
            var10 = 4;
            break;
         case 3:
            var10 = 5;
         }
      }

      var0.drawRegion(var1, var4, var5, var6, var7, var10, var2, var3, 20);
   }

   public static void reset1DIntArray(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1] = 0;
      }

   }

   public static void reset1DIntArray(int[] var0, int var1, int var2) {
      for(int var3 = var1; var3 < var1 + var2; ++var3) {
         var0[var3] = 0;
      }

   }

   public static int[] resizeRGB(int[] var0, int var1, int var2, int var3, int var4) {
      if (var4 == -1) {
         var4 = var3 * var2 / var1;
      }

      int[] var10 = new int[var3 * var4];

      for(int var6 = var4 - 1; var6 >= 0; --var6) {
         int var8 = var3 * var6;
         int var9 = var1 * (var6 * var2 / var4);

         for(int var5 = var3 - 1; var5 >= 0; --var5) {
            int var7 = var9 + var5 * var1 / var3;
            var10[var8 + var5] = var0[var7];
         }
      }

      return var10;
   }

   public static void reportFreeMemory(String var0) {
      crlUtil.garbageWait();
      crlDebug.print(var0, Runtime.getRuntime().freeMemory());
      System.out.println(var0 + " " + Runtime.getRuntime().freeMemory());
   }

   public static int scale(int var0) {
      return var0 * crlCanvas.currentState.SCALE_FACTOR >> 2;
   }

   public static int scale2(int var0) {
      return var0 * crlCanvas.currentState.SCALE_FACTOR >> 2;
   }

   public static int getStringWidth(String var0) {
      return State.fT.stringWidth(var0);
   }
}
