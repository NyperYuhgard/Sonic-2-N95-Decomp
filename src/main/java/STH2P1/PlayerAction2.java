package STH2P1;

import Coral.crlCanvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class PlayerAction2 extends PlayerAction {
   public static final int PLEFFECTMOVE2 = 6;
   public static final int PLEFFECT_SPIN_DASH = 2;
   public static final int PLEFFECT_WATER = 4;
   public static final int PLEFFECT_PLORFOX = 2;
   private static final int[][] a = new int[][]{{0, 0, 0, 0, 0, 0, 0}, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], {0, 0, 48, 32, 16, -32, 4}, {0, 32, 48, 32, 16, -32, 4}, {0, 64, 32, 32, 16, -32, 4}, {0, 64, 48, 32, 24, -32, -4}, {0, 96, 32, 32, 24, -32, -4}, {0, 128, 32, 32, 24, -32, -4}, {0, 160, 64, 32, 24, -32, -4}, {0, 0, 32, 16, 16, -8, -8}, {0, 16, 32, 16, 16, -8, -8}, {0, 32, 32, 16, 16, -8, -8}, {0, 48, 32, 16, 16, -8, -8}, {0, 192, 136, 24, 16, -12, -16}, {0, 0, 120, 32, 32, -16, -32}, {0, 32, 120, 32, 32, -16, -32}, {0, 64, 120, 32, 32, -16, -32}, {0, 96, 120, 32, 32, -16, -32}, {0, 128, 120, 32, 24, -16, -24}, {0, 160, 128, 32, 16, -16, -16}, {0, 128, 144, 32, 8, -16, -8}, {0, 160, 144, 32, 8, -16, -8}};
   private static final int[][] b = new int[][]{{32, 0, -1}, {4, 1, 2, 3, 4, 5, 6, 7, 8, 9, -3, 0}, {2, 10, 11, 12, 13, 14, 15, 16, -1}, {4, 17, 18, 19, 20, -3, 0}, {4, 21, 22, 23, 24, 25, 26, 27, 28, 29, -3, 0}};
   private static final int[][] c = new int[][]{{2, 0, 0, 16, 16, -8, -8}, {2, 0, 16, 16, 16, -8, -8}, {2, 0, 32, 16, 16, -8, -8}, {2, 0, 16, 16, 16, -8, -8}, {0, 96, 72, 16, 16, -8, -8}, {0, 112, 72, 16, 16, -8, -8}, {0, 0, 17, 16, 16, -8, -8}, {0, 192, 104, 16, 16, -8, -8}};
   private static final int[][] d = new int[][]{{6, 4, 5, 6, 7, -4}, {8, 0, 1, 2, 3}};
   private static Image[] e;
   private static final int[][] f = new int[][]{{0, 176, 0, 32, 32, -16, -16}, {0, 208, 0, 32, 32, -16, -16}, {0, 208, 80, 32, 32, -16, -16}, {0, 144, 0, 32, 32, -16, -16}, {0, 160, 32, 32, 32, -16, -16}, {0, 192, 32, 48, 48, -24, -24}};
   private static final int[][] g = new int[][]{{1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, -1}};
   public static final int BAKUHATU_INIT2 = 2;
   private static final int[][] h = new int[][]{{0, 0, 0, 16, 16, -8, -8}, {0, 16, 0, 32, 32, -16, -16}, {0, 48, 0, 32, 32, -16, -16}, {0, 80, 0, 32, 32, -16, -16}, {0, 112, 0, 32, 32, -16, -16}, {0, 112, 0, 32, 32, -16, -16}};
   private static final int[][] i = new int[][]{{8, 0, 1, 2, 3, 4, 5}};
   private static final int[][] j = new int[][]{{3, 0, 72, 16, 24, -8, -12}, {3, 32, 56, 16, 24, -8, -12}, {3, 48, 64, 16, 24, -8, -12}, new int[0], {3, 64, 64, 16, 24, -8, -12}, {3, 80, 64, 16, 16, -8, -8}, {3, 96, 64, 16, 16, -8, -8}, new int[0], {3, 48, 40, 16, 24, -8, -12}, {3, 64, 40, 16, 24, -8, -12}, {3, 80, 40, 16, 24, -8, -12}, new int[0], {3, 0, 48, 16, 24, -8, -12}, {3, 16, 32, 16, 16, -8, -12}, {3, 32, 40, 16, 16, -8, -12}, new int[0], {3, 0, 0, 16, 24, -8, -12}, {3, 16, 0, 16, 16, -8, -8}, {3, 32, 0, 16, 16, -8, -8}, new int[0], {3, 0, 24, 16, 24, -8, -12}, {3, 16, 16, 24, 16, -12, -8}, {3, 40, 24, 24, 16, -12, -8}, new int[0], {3, 64, 16, 16, 24, -8, -12}, {3, 80, 16, 16, 16, -8, -8}, {3, 96, 16, 16, 16, -8, -8}, new int[0], {3, 0, 72, 16, 24, -8, -12}, {3, 32, 56, 16, 24, -8, -12}, {3, 48, 64, 16, 24, -8, -12}, new int[0], {3, 48, 0, 16, 24, -8, -12}, {3, 64, 0, 24, 16, -12, -8}, {3, 88, 0, 24, 16, -12, -8}, new int[0], {3, 16, 48, 16, 24, -8, -12}, {3, 16, 80, 24, 16, -12, -8}, {3, 80, 80, 24, 16, -12, -8}, new int[0], {3, 96, 32, 16, 32, -8, -16}, new int[0], new int[0], new int[0]};
   public static final int USAGI_friend_no = 0;
   public static final int USAGI_xspeed_m = 1;
   public static final int USAGI_runaway_tm = 3;
   public static final int USAGI_friendflag = 4;
   private static final int[][] k = new int[][]{{5, 4}, {5, 4}, {5, 4}, {5, 4}, {8, 6}, {8, 6}, {8, 6}, {8, 6}, {7, 3}, {7, 3}, {2, 3}, {7, 1}, {9, 4}, {0, 6}, {0, 0}, {2, 4}, {10, 1}};
   private static final int[][] l = new int[][]{{512, 1024}, {512, 768}, {384, 768}, {320, 384}, {448, 768}, {768, 1024}, {640, 896}, {640, 768}, {512, 896}, {704, 768}, {320, 512}, {512, 768}};
   private static final int[][] m = new int[][]{{0, 0, 0, 0, 0, 0, 0}, {0, 40, 96, 8, 8, -4, -4}, {0, 40, 104, 8, 8, -4, -4}, {0, 40, 112, 8, 8, -4, -4}, {0, 48, 64, 8, 8, -4, -4}, {0, 48, 64, 8, 8, -4, -4}, {0, 96, 56, 16, 16, -8, -8}, {0, 112, 56, 16, 16, -8, -8}, {0, 128, 56, 32, 32, -16, -16}};
   private static final int[][] n = new int[][]{{0, 0, 0}, {13, 0, 11}, {34, 22, 13}, {59, 44, 13}};
   private static final int[] o = new int[]{15, 0, 15, 3, 14, 6, 13, 8, 11, 11, 8, 13, 6, 14, 3, 15, 0, 16, 252, 15, 249, 14, 247, 13, 244, 11, 242, 8, 241, 6, 240, 3, 240, 0, 240, 252, 241, 249, 242, 247, 244, 244, 247, 242, 249, 241, 252, 240, 255, 240, 3, 240, 6, 241, 8, 242, 11, 244, 13, 247, 14, 249, 15, 252};
   private static final int[] p = new int[]{8, 5, 7, 6, 6, 7, 5, 8, 6, 7, 7, 6, -1, 8, 7, 6, 5, 4, 3, 4, 5, 6, 7, -1, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 8, 7, 6, 5, 4, 3, 2, 3, 4, 5, 6, 7, -1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, -1, 1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2};
   private static final int[][] q = new int[][]{{4, 0, 0, 176, 16, 0, 0}, {4, 0, 16, 208, 16, 0, 0}, {4, 0, 32, 168, 16, 0, 0}, {4, 0, 48, 168, 16, 0, 0}, {4, 0, 64, 104, 16, 0, 0}, {4, 0, 80, 160, 16, 0, 0}, {4, 104, 64, 128, 16, 0, 0}, {4, 0, 96, 160, 16, 0, 0}, {4, 0, 112, 128, 16, 0, 0}, {4, 0, 128, 192, 16, 0, 0}, {4, 0, 144, 128, 16, 0, 0}, {4, 128, 160, 64, 16, 0, 0}, {4, 168, 40, 24, 24, 0, 0}, {4, 176, 96, 24, 24, 0, 0}, {4, 200, 96, 24, 24, 0, 0}, {6, 0, 0, 240, 64, 0, 0}, {7, 0, 0, 90, 240, 0, 0}};
   private static final int[] r = new int[]{0, -1, -1, -1, 7, 7, 9, 4, -1, -1, 6, 5, 3, 1, 10, 2, 8};
   private static final int[][] s = new int[][]{{4, 0, 160, 128, 16, 0, 0}, {4, 0, 176, 112, 16, 0, 0}, {4, 160, 80, 48, 16, 0, 0}, {4, 168, 40, 24, 24, 0, 0}, {4, 176, 96, 24, 24, 0, 0}, {4, 200, 96, 24, 24, 0, 0}, {5, 64, 16, 88, 16, 0, 0}, {5, 152, 16, 88, 16, 0, 0}, {5, 72, 64, 48, 16, 0, 0}, {5, 0, 96, 8, 16, 0, 0}, {5, 8, 96, 8, 16, 0, 0}, {5, 16, 96, 8, 16, 0, 0}, {5, 24, 96, 8, 16, 0, 0}, {5, 32, 96, 8, 16, 0, 0}, {5, 40, 96, 8, 16, 0, 0}, {5, 48, 96, 8, 16, 0, 0}, {5, 56, 96, 8, 16, 0, 0}, {5, 64, 96, 8, 16, 0, 0}, {5, 72, 96, 8, 16, 0, 0}, {5, 80, 96, 8, 16, 0, 0}, {5, 88, 96, 8, 16, 0, 0}, {5, 96, 96, 8, 16, 0, 0}, {5, 104, 96, 8, 16, 0, 0}, {5, 112, 96, 8, 16, 0, 0}, {5, 120, 96, 8, 16, 0, 0}, {5, 128, 96, 8, 16, 0, 0}, {5, 136, 96, 8, 16, 0, 0}, {5, 144, 96, 8, 16, 0, 0}, {5, 152, 96, 8, 16, 0, 0}};
   private static final int[][] t = new int[][]{{4, 2, 240, 64, 14, 0, 0}, {4, 70, 240, 154, 14, 0, 0}};
   public static boolean stclearAudioOver = false;
   private static final int[] u = new int[]{5000, 5000, 1000, 500, 400, 400, 300, 300, 200, 200, 200, 200, 100, 100, 100, 100, 50, 50, 50, 50, 0};
   private static final int[][] v = new int[][]{{0, 176, 88, 14, 16, -7, -8}, {0, 160, 88, 16, 16, -8, -8}, {0, 160, 104, 16, 16, -8, -8}, {0, 176, 88, 19, 16, -9, -8}, {0, 176, 88, 8, 16, -4, -8}, {0, 176, 88, 24, 16, -12, -8}, {0, 160, 104, 26, 16, -13, -8}};
   private static final int[][] w = new int[][]{{0, 0, 64, 16, 16, -8, -8}, {0, 16, 64, 32, 32, -16, -16}, {0, 48, 72, 48, 48, -24, -24}, {0, 0, 0, 0, 0, 0, 0}};
   private static final int[] x = new int[]{0, 1, 2, 1, 0, 3};
   private static final int[][] y = new int[][]{{5, 0, 0, 64, 16, 0, 0}, {5, 168, 96, 56, 16, 0, 0}, {5, 0, 16, 64, 16, 0, 0}};
   private static final int[][] z = new int[][]{{0, 24, 112, 8, 8, -4, -4}, {0, 32, 112, 8, 8, -4, -4}, {0, 32, 112, 8, 8, -4, -4}, {0, 24, 96, 16, 16, -8, -8}, {0, 0, 80, 16, 16, -8, -8}, {0, 0, 96, 24, 24, -12, -12}, {0, 96, 88, 32, 32, -16, -16}, {0, 128, 88, 32, 32, -16, -16}, {0, 24, 112, 8, 8, -4, -4}, {0, 24, 112, 8, 8, -4, -4}, {0, 24, 112, 8, 8, -4, -4}, {0, 24, 112, 8, 8, -4, -4}, {0, 24, 112, 8, 8, -4, -4}, {0, 24, 112, 8, 8, -4, -4}, {0, 24, 96, 16, 16, -8, -8}, {0, 0, 80, 16, 16, -8, -8}, {0, 0, 0, 0, 0, 0, 0}, {1, 0, 0, 16, 20, 0, 0}, {1, 16, 0, 16, 20, 0, 0}, {1, 32, 0, 16, 20, 0, 0}, {1, 48, 0, 16, 20, 0, 0}, {1, 64, 0, 16, 20, 0, 0}, {1, 80, 0, 16, 20, 0, 0}};
   private static final int[][] A = new int[][]{{6, 0, 1, 2, 3, 4, 8, 8, -4}, {6, 0, 1, 2, 3, 4, 9, 9, -4}, {6, 0, 1, 2, 3, 4, 10, 10, -4}, {6, 0, 1, 2, 3, 4, 11, 11, -4}, {6, 0, 1, 2, 3, 4, 12, 12, -4}, {6, 0, 1, 2, 3, 4, 13, 13, -4}, {15, 0, 1, 2, -4}, {8, 16, 8, 16, 8, 16, 8, -4}, {8, 16, 9, 16, 9, 16, 9, -4}, {8, 16, 10, 16, 10, 16, 10, -4}, {8, 16, 11, 16, 11, 16, 11, -4}, {8, 16, 12, 16, 12, 16, 12, -4}, {8, 16, 13, 16, 13, 16, 13, -4}, {15, -4}, {15, 1, 2, 3, 4, -4}};
   private static final int[] B = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 255, 255, 255, 255, 255, 254, 254, 254, 254, 254, 253, 253, 253, 253, 253, 253, 253, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 253, 253, 253, 253, 253, 253, 253, 254, 254, 254, 254, 254, 255, 255, 255, 255, 255, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 255, 255, 255, 255, 255, 254, 254, 254, 254, 254, 253, 253, 253, 253, 253, 253, 253, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 252, 253, 253, 253, 253, 253, 253, 253, 254, 254, 254, 254, 254, 255, 255, 255, 255, 255};
   private static final int[][] C = new int[][]{{5, 96, 112, 16, 16, 0, 0}, {5, 112, 112, 16, 16, 0, 0}, {5, 128, 112, 16, 16, 0, 0}, {5, 144, 112, 16, 16, 0, 0}, {5, 160, 112, 16, 16, 0, 0}, {5, 176, 112, 16, 16, 0, 0}, {5, 192, 112, 16, 16, 0, 0}};

   public PlayerAction2() {
   }

   public PlayerAction2(int var1, int var2) {
      super.classType = 2;
      this.setType(var1, var2);
   }

   public void setType(int var1, int var2) {
      super.m_Actno = var1;
      PlayerAction2 var3;
      switch(var1) {
      case 8:
         (var3 = this).m_Actflg = 132;
         var3.m_Patbase_Image = e;
         var3.m_Patbase_Table = a;
         var3.m_Patno = 0;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 5);
         var3.m_Cddat = 0;
         return;
      case 10:
         (var3 = this).m_R_No0 = 0;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 10);
         return;
      case 37:
         (var3 = this).m_Actflg = 132;
         var3.m_Patbase_Image = e;
         var3.m_Patbase_Table = c;
         var3.m_Patno = 0;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 7);
         var3.m_Cddat = 0;
         var3.m_Mstno = 1;
         return;
      case 39:
         (var3 = this).m_Actflg = 132;
         var3.m_Patbase_Image = e;
         var3.m_Patbase_Table = h;
         var3.m_Patno = 0;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         var3.m_Cddat = 0;
         var3.m_Mstno = 0;
         return;
      case 40:
         (var3 = this).m_Actflg = 132;
         var3.m_Patbase_Image = e;
         var3.m_Patbase_Table = j;
         var3.m_Patno = 2;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 8);
         var3.m_Cddat = 0;
         var1 = Utilities.getRandom();
         var3.m_Sproffset = 1408;
         var1 &= 1;
         var2 = GameState.zoneNumber;
         if ((var1 & 1) != 0) {
            var3.m_Sproffset = 1428;
         }

         var1 = k[var2][var1];
         if (var2 == 1) {
            var1 = Utilities.getRandom() % 10;
         }

         var3.m_Reserve[0] = var1;
         int[] var4 = l[var1];
         var3.m_Reserve[1] = var3.m_Userflag == 0 ? -var4[0] : var4[0];
         var3.m_Reserve[2] = -var4[1];
         var3.m_Reserve[6] = var1 << 2;
         return;
      case 41:
         super.m_Actflg = 132;
         super.m_Patbase_Image = e;
         super.m_Patbase_Table = v;
         super.m_Patno = 0;
         super.m_Cddat = 0;
         return;
      case 52:
         (var3 = this).m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 11);
         var1 = r[GameState.zoneNumber];
         var2 = GameState.actNumber + 12;
         var3.m_Reserve[6] = var1;
         var3.m_Reserve[9] = var2;
         var3.m_Reserve[1] = cCanvas.viewPortOffset;
         var3.m_Reserve[2] = cCanvas.viewPortWidth;
         var3.m_Reserve[3] = -90;
         var3.m_Reserve[8] = 222;
         var3.m_Reserve[7] = (222 - (240 + q[var1][3])) / 20 - 1;
         var3.m_Reserve[4] = 222 - var3.m_Reserve[7] * 20;
         var3.m_Reserve[10] = 11;
         var3.m_Reserve[5] = 210 - var3.m_Reserve[10] * 20;
         GameState.m_Accept_Softkey = 2;
         return;
      case 53:
         (var3 = this).m_Actflg = 132;
         var3.m_Patbase_Image = e;
         var3.m_Patbase_Table = m;
         var3.m_Patno = 0;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 5);
         var3.m_Cddat = 0;
         return;
      case 55:
         (var3 = this).m_Actflg = 132;
         var3.m_Patbase_Image = e;
         var3.m_Patbase_Table = c;
         var3.m_Patno = 0;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 7);
         var3.m_Cddat = 0;
         var3.m_Mstno = 1;
         var3.m_AutoFrameout = false;
         return;
      case 56:
         (var3 = this).m_Actflg = 132;
         var3.m_Patbase_Image = e;
         var3.m_Patbase_Table = f;
         var3.m_Patno = 0;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 0);
         var3.m_Cddat = 0;
         return;
      case 57:
         (var3 = this).m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 11);
         var3.m_Reserve[1] = 0;
         if (GameState.m_PlTimeOver_F) {
            var3.m_Reserve[1] = 1;
         }

         var3.m_Reserve[2] = 0;
         var3.m_Reserve[3] = 240;
         GameState.m_Accept_Softkey = 2;
         State.setSoftKey(256, (String)null);
         State.setSoftKey(512, (String)null);
         return;
      case 58:
         (var3 = this).m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 11);
         var1 = GameState.actNumber + 3;
         var3.m_Reserve[1] = var1;
         var3.m_Reserve[2] = 240;
         var3.m_Reserve[3] = -s[var1][3];
         var3.m_Reserve[4] = 240;
         var3.m_Reserve[5] = 240;
         var3.m_Reserve[6] = 240;
         var2 = GameState.decodePlTime(GameState.m_PlTime) / 60;
         var3.m_Reserve[7] = u[Math.min(var2 / 15, 20)];
         var3.m_Reserve[8] = GameState.m_PlRing * 10;
         GameState.m_Accept_Softkey = 2;
         cCanvas.am.bgmset(3);
         stclearAudioOver = false;
         return;
      case 126:
         (var3 = this).m_Actflg = 132;
         var3.m_Patbase_Image = e;
         var3.m_Patbase_Table = w;
         var3.m_Patno = 0;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         var3.m_Cddat = 0;
         var3.m_Mstno = 0;
         return;
      case 221:
         super.m_Actflg = 132;
         super.m_Patno = 0;
         super.m_Cddat = 0;
         super.m_Mstno = 1;
         return;
      case 223:
         (var3 = this).m_R_No0 = 0;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         return;
      case 224:
         (var3 = this).m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         var3.m_Reserve[0] = -t[0][3] - 100;
         var3.m_Reserve[1] = crlCanvas.getGameWidth() + 100;
      default:
      }
   }

   public void update(State var1) {
      PlayerAction2 var9;
      label565: {
         int var2;
         int var3;
         int var4;
         int var6;
         Action var10;
         int[] var10000;
         int var10002;
         switch(super.m_Actno) {
         case 8:
            switch((var9 = this).m_R_No0) {
            case 0:
               var9.m_R_No0 += 2;
               var9.m_Patbase_Table = a;
               var9.m_Actflg |= 4;
               var9.m_Sprpri = 1;
               var9.m_Sprhsize = 16;
               var9.m_Sproffset = 1180;
               var9.m_ReserveObj = var1.getSonicAction();
               if (var9 != GameState.m_playerEffectAction) {
                  var9.m_Reserve[2] = 1;
                  var9.m_Sproffset = 1164;
                  var9.m_ReserveObj = var1.getTailsAction();
               }
            case 2:
               var10 = (Action)var9.m_ReserveObj;
               switch(var9.m_Mstno) {
               case 0:
                  var9.a(var1);
                  break;
               case 1:
                  var9.m_Yposi = GameState.m_WaterPosi;
                  if (var9.m_Mstno_1 == 0) {
                     var9.m_Xposi = var10.m_Xposi;
                     var9.m_Cddat = 0;
                     var9.m_Sproffset &= 32767;
                  }

                  var9.patchg(b);
                  break;
               case 2:
                  if (var10.m_AirCnt >= 12 && var10.m_R_No0 < 4 && var10.m_DashMode) {
                     var9.m_Xposi = var10.m_Xposi;
                     var9.m_Yposi = var10.m_Yposi;
                     var9.m_Cddat = var10.m_Cddat & 1;
                     if (var9.m_Reserve[2] != 0) {
                        var9.m_Yposi -= 4;
                     }

                     if (var9.m_Mstno_1 == 0) {
                        var9.m_Sproffset &= 32767;
                        if (var10.m_Sproffset < 0) {
                           var9.m_Sproffset |= 32768;
                        }
                     }

                     var9.patchg(b);
                  } else {
                     var9.m_Mstno = 0;
                  }
                  break;
               case 3:
                  if (var10.m_AirCnt < 12) {
                     var9.m_Mstno = 0;
                  } else {
                     var9.patchg(b);
                  }
                  break;
               case 4:
                  var9.patchg(b);
                  return;
               default:
                  return;
               }
            case 1:
            case 3:
            case 5:
            default:
               break;
            case 4:
               var9.a(var1);
               return;
            case 6:
               if (var9.m_Reserve[2] == 0) {
                  var10 = var1.getSonicAction();
               } else {
                  var10 = var1.getTailsAction();
               }

               if (var10.m_Mstno != 13) {
                  var9.a(var1);
                  return;
               }

               if (--var9.m_Reserve[1] < 0) {
                  var9.m_Reserve[1] = 3;
                  Action var16;
                  if ((var16 = var1.insertAction(8)) != null) {
                     var16.m_ReserveObj = var10;
                     var16.m_Xposi = var10.m_Xposi;
                     var16.m_Yposi = var10.m_Yposi + 16;
                     if (var9.m_Reserve[2] != 0) {
                        var16.m_Yposi -= 4;
                     }

                     var16.m_Cddat = 0;
                     var16.m_Mstno = 3;
                     var16.m_R_No0 += 2;
                     var16.m_Actflg = var9.m_Actflg;
                     var16.m_Sprpri = 1;
                     var16.m_Sprhsize = 4;
                     var16.m_Sproffset = var9.m_Sproffset;
                     var16.m_Sproffset &= 32767;
                     if ((var10.m_Sproffset & '耀') != 0) {
                        var16.m_Sproffset |= 32768;
                     }
                  }
               }
            }

            return;
         case 10:
            switch((var9 = this).m_R_No0) {
            case 0:
               var10 = var1.getSonicAction();
               var9.m_Xposi = var10.m_Xposi;
               var9.m_Yposi = var10.m_Yposi;
               if ((var10.m_Cddat & 1) != 0) {
                  var9.m_Xposi -= 10;
               } else {
                  var9.m_Xposi += 10;
               }

               var9.m_R_No0 += 2;
               var9.m_Patbase_Image = e;
               var9.m_Patbase_Table = z;
               var9.m_Actflg = 132;
               var9.m_Sprhsize = 16;
               var9.m_Sprpri = 1;
               if (((var3 = var9.m_Userflag) & 128) != 0) {
                  var9.m_R_No0 += 8;
                  var3 &= 127;
                  var9.m_Reserve[9] = var3;
                  break label565;
               }

               var9.m_Mstno = var3;
               var9.m_Reserve[2] = var9.m_Xposi;
               var9.m_Yspeed = -136;
            case 2:
               var9.patchg(A);
            case 4:
               if (GameState.m_WaterPosi >= var9.m_Yposi) {
                  var9.m_R_No0 = 6;
                  var9.m_Mstno += 7;
                  if (var9.m_Mstno > 13) {
                     var9.m_Mstno = 13;
                  }

                  var9.c(var1);
                  var9.patchg(A);
                  return;
               } else {
                  if (GameState.m_WaterColiFlag != 0) {
                     var10000 = var9.m_Reserve;
                     var10000[2] += 4;
                  }

                  var3 = var9.m_Direc++;
                  var3 &= 127;
                  if (((var3 = B[var3]) & 128) != 0) {
                     var3 |= -256;
                  }

                  var3 += var9.m_Reserve[2];
                  var9.m_Xposi = var3;
                  var9.c(var1);
                  var9.speedSet2();
                  if ((var9.m_Actflg & 128) == 0) {
                     var9.frameOut(var1);
                     return;
                  }

                  return;
               }
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 15:
            default:
               return;
            case 8:
            case 16:
               var9.frameOut(var1);
            case 12:
               if (var1.getSonicAction().m_AirCnt > 12) {
                  var9.frameOut(var1);
               }

               var10002 = var9.m_Reserve[6]--;
               if (var9.m_Reserve[6] == 0) {
                  var9.m_R_No0 = 14;
                  var9.m_Mstno += 7;
                  var9.c(var1);
                  var9.patchg(A);
               } else {
                  var9.patchg(A);
                  if ((var9.m_Actflg & 128) != 0) {
                     return;
                  }

                  var9.frameOut(var1);
               }

               return;
            case 10:
               break label565;
            case 14:
               if (var1.getSonicAction().m_AirCnt > 12) {
                  var9.frameOut(var1);
               }
            case 6:
               var9.c(var1);
               var9.patchg(A);
               return;
            }
         case 37:
            switch((var9 = this).m_R_No0) {
            case 0:
               var9.m_R_No0 = 2;
               var9.m_Reserve[1] = var9.m_Xposi;
               var9.m_Sproffset = 9916;
               var9.m_Sprpri = 2;
               var9.m_Colino = 71;
               var9.m_Sprhsize = 8;
            case 2:
               var9.m_Patno = GameState.mMasterRing.m_Patno;
               return;
            case 4:
               var9.m_R_No0 = 6;
               var9.m_Colino = 0;
               var9.m_Sprpri = 1;
               RING_RingGetSub0(var9);
            case 6:
               var9.m_Mstno = 0;
               var9.patchg(d);
               return;
            case 8:
               var1.deleteAction(var9);
            case 1:
            case 3:
            case 5:
            case 7:
            default:
               return;
            }
         case 39:
            switch((var9 = this).m_R_No0) {
            case 0:
               var9.m_R_No0 = 2;
               if ((var10 = var1.insertAction(40)) != null) {
                  var10.m_Xposi = var9.m_Xposi;
                  var10.m_Yposi = var9.m_Yposi;
                  var10.m_Reserve[5] = 0;
               }
            case 2:
               var9.m_R_No0 = 4;
               var9.m_Sproffset = 1444;
               var9.m_Sprpri = 1;
               var9.m_Sprhsize = 12;
            case 4:
               var9.patchg(i);
               if (var9.m_Patno == 5) {
                  var1.deleteAction(var9);
               }
            case 1:
            case 3:
            default:
               return;
            }
         case 40:
            switch((var9 = this).m_R_No0) {
            case 0:
               if (var9.m_Userflag == 0) {
                  var9.m_R_No0 = 2;
               } else {
                  var9.m_R_No0 = (var9.m_Reserve[0] << 1) + 4;
                  var9.m_Reserve[4] = 1;
               }

               var9.m_Sprvs = 12;
               var9.m_Actflg = 4;
               var9.m_Reserve[7] = 1;
               var9.m_Sprpri = 6;
               var9.m_Sprhsize = 8;
               var9.m_Pattim = 7;
               var9.m_Patno = 0 + var9.m_Reserve[6];
               var9.m_Yspeed = -1024;
               if (var9.m_Reserve[4] == 0) {
                  if ((var10 = var1.insertAction(41)) != null) {
                     var10.m_Xposi = var9.m_Xposi;
                     var10.m_Yposi = var9.m_Yposi;
                     var10.m_Patno = var9.m_Reserve[5] >> 1;
                  }
               } else if (var9.m_Userflag == 0) {
                  var9.m_R_No0 = 28;
                  var9.m_Xspeed = 0;
               }

               var9.m_Actflg |= 128;
            case 2:
               if ((var9.m_Actflg & 128) == 0) {
                  var1.deleteAction(var9);
               } else {
                  var9.speedSet();
                  if (var9.m_Yspeed > 0 && (var2 = ((GameState)var1).emyCol_D(var9.m_Xposi, var9.m_Yposi, var9.m_Sprvs)) < 0) {
                     var9.m_Yposi += var2;
                     var9.m_Xspeed = var9.m_Reserve[1];
                     var9.m_Yspeed = var9.m_Reserve[2];
                     var9.m_Patno = 1 + var9.m_Reserve[6];
                     var9.m_R_No0 = (var9.m_Reserve[0] << 1) + 4;
                     if (var9.m_Reserve[4] != 0 && (var9.m_Reserve[4] == 2 || (crlCanvas.mCounter & 16L) != 0L)) {
                        var9.m_Xspeed = 0 - var9.m_Xspeed;
                     }
                  }
               }
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 15:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
            default:
               break;
            case 4:
            case 8:
            case 10:
            case 12:
            case 16:
            case 20:
            case 22:
            case 24:
            case 26:
               var9.a();
               var9.speedSet();
               var9.m_Patno = 1 + var9.m_Reserve[6];
               if (var9.m_Yspeed >= 0) {
                  var9.m_Patno = 2 + var9.m_Reserve[6];
                  if ((var2 = ((GameState)var1).emyCol_D(var9.m_Xposi, var9.m_Yposi, var9.m_Sprvs)) < 0) {
                     var9.m_Yposi += var2;
                     var9.m_Yspeed = var9.m_Reserve[2];
                  }
               }

               if ((var9.m_Actflg & 128) == 0) {
                  var1.deleteAction(var9);
               }
               break;
            case 6:
            case 14:
            case 18:
               var9.a();
               var9.speedSet2();
               var9.m_Yspeed += 24;
               if (var9.m_Yspeed >= 0 && (var2 = ((GameState)var1).emyCol_D(var9.m_Xposi, var9.m_Yposi, var9.m_Sprvs)) < 0) {
                  var9.m_Yposi += var2;
                  var9.m_Yspeed = var9.m_Reserve[2];
                  if (var9.m_Userflag != 0 && var9.m_Userflag != 10) {
                     var9.m_Xspeed = 0 - var9.m_Xspeed;
                  }
               }

               --var9.m_Pattim;
               if (var9.m_Pattim < 0) {
                  var9.m_Pattim = 1;
               }

               var9.m_Patno = var9.m_Reserve[6] + var9.m_Pattim % 2 + 1;
               if ((var9.m_Actflg & 128) == 0) {
                  var1.deleteAction(var9);
               }
               break;
            case 28:
               if ((var9.m_Actflg & 128) == 0) {
                  var1.deleteAction(var9);
               } else {
                  var10002 = var9.m_Reserve[3]--;
                  if (var9.m_Reserve[3] == 0) {
                     var9.m_R_No0 = 2;
                     var9.m_Sprpri = 1;
                  }
               }
            }

            if (var9.m_Xspeed >= 0) {
               var9.m_Actflg |= 1;
               return;
            }

            var9.m_Actflg &= -2;
            break;
         case 41:
            switch((var9 = this).m_R_No0) {
            case 0:
               var9.m_R_No0 += 2;
               var9.m_Sproffset = 33964;
               var9.m_Actflg = 4;
               var9.m_Sprpri = 1;
               var9.m_Sprhsize = 8;
               var9.m_Yspeed = -768;
            case 2:
               if (var9.m_Yspeed >= 0) {
                  var9.frameOut(var1);
               }

               var9.speedSet2();
               var9.m_Yspeed += 24;
            default:
               return;
            }
         case 52:
            GameState.m_SwData = 0;
            var2 = super.m_Reserve[0]++;
            switch(super.m_R_No0) {
            case 0:
               if (var2 < 8) {
                  return;
               }

               super.m_Reserve[1] = Math.min(super.m_Reserve[1] + 15, cCanvas.viewPortOffset + cCanvas.viewPortHeight);
               if (var2 >= 12) {
                  super.m_Reserve[2] = Math.max(super.m_Reserve[2] - 12, 0);
               }

               if (var2 >= 24) {
                  super.m_Reserve[3] = Math.min(super.m_Reserve[3] + 11, 0);
               }

               if (var2 >= 32) {
                  super.m_Reserve[4] = Math.max(super.m_Reserve[4] + super.m_Reserve[7], super.m_Reserve[8]);
                  super.m_Reserve[5] = Math.min(super.m_Reserve[5] + super.m_Reserve[10], 223);
               }

               if (var2 < 52) {
                  return;
               }

               this.b();
               return;
            case 1:
               if (var2 < 60) {
                  return;
               }

               this.b();
               return;
            case 2:
               GameState.loading_cont = false;
               super.m_Reserve[3] = Math.max(super.m_Reserve[3] - 22, -90);
               if (var2 >= 4) {
                  super.m_Reserve[2] = Math.min(super.m_Reserve[2] + 20, 240);
               }

               if (var2 >= 16) {
                  super.m_Reserve[1] = Math.max(super.m_Reserve[1] - (cCanvas.viewPortOffset + cCanvas.viewPortHeight) / 8, 0);
               }

               if (var2 < 24) {
                  return;
               }

               this.b();
               return;
            case 3:
               if (var2 < 40) {
                  return;
               }

               this.b();
               return;
            case 4:
               super.m_Reserve[4] = Math.min(super.m_Reserve[4] + 20, 480);
               super.m_Reserve[5] = Math.max(super.m_Reserve[5] - 18, 0);
               if (var2 >= 12) {
                  GameState.m_PlTime_F = 1;
                  GameState.m_SwData = -1;
                  GameState.m_Accept_Softkey = 0;
                  State.setSoftKey(256, (String)null);
                  State.setSoftKey(512, GameState.STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][0]);
                  this.frameOut(var1);
               }

               return;
            default:
               return;
            }
         case 53:
            var1 = var1;
            var9 = this;
            var10 = var1.getSonicAction();
            switch(super.m_R_No0_Ms) {
            case 0:
               var3 = 0;
               var4 = 0;

               while(true) {
                  Object var11;
                  if (var4 >= 4 || (var11 = var4 == 0 ? var9 : var1.insertAction(var10, 53)) == null) {
                     var9.m_R_No0_Ms = 2;
                     var9.m_Reserve[1] = 4;
                     var9.m_Sprpositbl = new int[2][4];
                     break;
                  }

                  ((Action)var11).m_R_No0_Ms = 4;
                  ((Action)var11).m_Patbase_Table = m;
                  ((Action)var11).m_Sproffset = 1246;
                  ((Action)var11).m_Actflg = 4;
                  ((Action)var11).m_Actflg |= 64;
                  ((Action)var11).m_Sprhsize_Ms = 16;
                  ((Action)var11).m_Manysprcnt = 2;
                  ((Action)var11).m_Reserve[3] = var3++;
                  ((Action)var11).m_Reserve[0] = n[var4][0];
                  ((Action)var11).m_Reserve[1] = n[var4][1];
                  ((Action)var11).m_Reserve[2] = n[var4][2];
                  ((Action)var11).m_Sprpositbl = new int[2][4];
                  ++var4;
               }
            case 2:
            case 4:
               if ((var10.m_PlPower & 2) == 0) {
                  var9.frameOut(var1);
                  return;
               } else {
                  var4 = 0;
                  int var12;
                  byte var14;
                  if (var9.m_R_No0_Ms == 2) {
                     var9.m_Xposi = var10.m_Xposi;
                     var9.m_Yposi = var10.m_Yposi;
                     var14 = 18;
                  } else {
                     var12 = PlayerAction.m_PlPosiWkAdr + 256 - var9.m_Reserve[3] * 12 & 255;
                     var9.m_Xposi = PlayerAction.m_PlPosiWk[var12][0];
                     var9.m_Yposi = PlayerAction.m_PlPosiWk[var12][1];
                     var14 = 2;
                     var4 = var9.m_Reserve[0];
                  }

                  for(var12 = 0; var12 < 2; ++var12) {
                     var6 = var9.m_Reserve[1] + (var12 << 5) & 62;
                     var9.m_Sprpositbl[var12][0] = (byte)o[var6] + var9.m_Xposi;
                     var9.m_Sprpositbl[var12][1] = (byte)o[var6 + 1] + var9.m_Yposi;
                     if (var9.m_R_No0_Ms == 2) {
                        var9.m_Sprpositbl[var12][3] = p[var9.m_Reserve[4]];
                     } else {
                        var9.m_Sprpositbl[var12][3] = p[var9.m_Reserve[0] + var9.m_Reserve[4] + var9.m_Reserve[2] * var12];
                     }
                  }

                  var10002 = var9.m_Reserve[4]++;
                  if (p[var4 + var9.m_Reserve[4]] < 0) {
                     var9.m_Reserve[4] = 0;
                  }

                  var10000 = var9.m_Reserve;
                  var10000[1] += (var10.m_Cddat & 1) == 0 ? var14 : -var14;
                  return;
               }
            case 1:
            case 3:
            default:
               return;
            }
         case 55:
            var1 = var1;
            var9 = this;
            switch(super.m_R_No0) {
            case 0:
               var2 = Math.min(GameState.m_PlRing, 32);
               var3 = 648;
               var4 = 0;
               short var5 = 0;
               var6 = 0;

               while(true) {
                  if (var6 >= var2) {
                     GameState.m_PlRing = 0;
                     GameState.m_PlRing_F = 128;
                     GameState.m_PlRing_F2 = 0;
                     break;
                  }

                  Object var7;
                  Object var18 = var7 = var6 == 0 ? var9 : var1.insertAction(var9.m_Actno);
                  ((Action)var18).m_R_No0 += 2;
                  ((Action)var7).m_Sprvs = 8;
                  ((Action)var7).m_Sprhs = 8;
                  ((Action)var7).m_Xposi = var9.m_Xposi;
                  ((Action)var7).m_Yposi = var9.m_Yposi;
                  ((Action)var7).m_Sproffset = 9916;
                  ((Action)var7).m_Actflg = 132;
                  ((Action)var7).m_Sprpri = 3;
                  ((Action)var7).m_Colino = 71;
                  ((Action)var7).m_Sprhsize = 8;
                  ((Action)var7).m_Reserve[4] = 255;
                  if (var3 >= 0) {
                     var5 = (short)Utilities.sinset(var3);
                     short var8 = (short)Utilities.cosset(var3);
                     var4 = var3 >> 8;
                     var5 = (short)(var5 << var4);
                     var8 = (short)(var8 << var4);
                     var4 = var5;
                     var5 = var8;
                     int var15 = var3 & 255;
                     var15 += 16;
                     var3 = var3 & -256 | var15 & 255;
                     if ((var15 & -256) != 0) {
                        var3 -= 128;
                        if (var3 < 0) {
                           var3 = 648;
                        }
                     }
                  }

                  ((Action)var7).m_Xspeed = var4;
                  ((Action)var7).m_Yspeed = var5;
                  var4 = -var4;
                  var3 = -var3;
                  ++var6;
               }
            case 2:
               var9.patchg(d);
               var9.speedSet2();
               var9.m_Yspeed += 24;
               if (var9.m_Yspeed >= 0 && (crlCanvas.mCounter + (long)((GameState)var1).getD7(var9) & 7L) == 0L && (var9.m_Actflg & 128) != 0 && (var6 = ((GameState)var1).emyCol_D(var9.m_Xposi, var9.m_Yposi, var9.m_Sprvs)) < 0) {
                  var9.m_Yposi += var6;
                  int var13 = var9.m_Yspeed >> 2;
                  var9.m_Yspeed -= var13;
                  var9.m_Yspeed = -var9.m_Yspeed;
               }

               var10002 = var9.m_Reserve[4]--;
               if (var9.m_Reserve[4] == 0 || var9.m_Yposi > GameState.m_ScrALim_Down + 224) {
                  var9.frameOut(var1);
                  return;
               }

               return;
            case 1:
            case 3:
            case 5:
            case 7:
            default:
               return;
            case 4:
               super.m_R_No0 += 2;
               super.m_Colino = 0;
               super.m_Sprpri = 1;
               RING_RingGetSub0(this);
            case 6:
               this.patchg(d);
               return;
            case 8:
               this.frameOut(var1);
               return;
            }
         case 56:
            switch((var9 = this).m_R_No0) {
            case 0:
               var9.m_R_No0 += 2;
               var9.m_Sprpri = 1;
               var9.m_Sprhsize = 24;
               var9.m_Sproffset = 1214;
            case 2:
               if (((var10 = var1.getSonicAction()).m_PlPower & 2) != 0) {
                  var9.m_Patno = -1;
                  return;
               } else if ((var10.m_PlPower & 1) == 0) {
                  var9.frameOut(var1);
                  return;
               } else {
                  var9.m_Xposi = var10.m_Xposi;
                  var9.m_Yposi = var10.m_Yposi;
                  var9.m_Cddat = var10.m_Cddat;
                  var9.m_Sproffset &= 32767;
                  if ((var10.m_Sproffset & '耀') != 0) {
                     var9.m_Sproffset |= 32768;
                  }

                  var9.patchg(g);
                  if (cCanvas.m_ScreenFrame % 2 == 0) {
                     var9.m_Patno = 5;
                  }

                  return;
               }
            default:
               return;
            }
         case 57:
            var2 = (var9 = this).m_Reserve[0]++;
            switch(var9.m_R_No0) {
            case 0:
               var9.m_Reserve[2] = Math.min(var9.m_Reserve[2] + 3, 112);
               var9.m_Reserve[3] = Math.max(var9.m_Reserve[3] + -3, 128);
               if (var2 < 36) {
                  return;
               }

               ++var9.m_R_No0;
               return;
            case 1:
               if ((crlCanvas.mPad & 16) != 0 || var2 >= 750) {
                  cCanvas.am.stopAllAudio();
                  if (GameState.m_PlTimeOver_F) {
                     GameState.m_GameFlag = 1;
                     return;
                  } else {
                     ((GameState)var1).continueGame();
                  }
               }

               return;
            default:
               return;
            }
         case 58:
            var2 = (var9 = this).m_Reserve[0]++;
            switch(var9.m_R_No0) {
            case 0:
               if (var1.countAction(37) == 0) {
                  var9.m_Reserve[9] = 5000;
               }

               var9.c();
            case 1:
               var9.m_Reserve[2] = Math.max(var9.m_Reserve[2] - 5, 52);
               var9.m_Reserve[3] = Math.min(var9.m_Reserve[3] + 5, 196);
               if (var2 >= 40) {
                  var9.m_Reserve[4] = Math.max(var9.m_Reserve[4] - 5, 40);
               }

               if (var2 >= 44) {
                  var9.m_Reserve[5] = Math.max(var9.m_Reserve[5] - 5, 40);
               }

               if (var2 >= 52) {
                  var9.m_Reserve[6] = Math.max(var9.m_Reserve[6] - 5, 40);
               }

               if (var2 < 92) {
                  return;
               }

               var9.c();
               return;
            case 2:
               if (var2 < 40) {
                  return;
               }

               var9.c();
               return;
            case 3:
               var3 = 0;
               if (var9.m_Reserve[7] != 0) {
                  var3 += 10;
                  var10000 = var9.m_Reserve;
                  var10000[7] -= 10;
               }

               if (var9.m_Reserve[8] != 0) {
                  var3 += 10;
                  var10000 = var9.m_Reserve;
                  var10000[8] -= 10;
               }

               if (var9.m_Reserve[9] != 0) {
                  var3 += 10;
                  var10000 = var9.m_Reserve;
                  var10000[9] -= 10;
               }

               var10000 = var9.m_Reserve;
               var10000[10] += var3;
               GameState.scoreUp(var3, false);
               GameState.stageClearNextStage = false;
               if (var3 != 0) {
                  return;
               }

               var9.c();
               return;
            case 4:
               if (stclearAudioOver) {
                  cCanvas.am.bgmset(10);
                  stclearAudioOver = false;
               }

               if (cCanvas.m_Option[2] != 0 && !GameState.stageClearNextStage) {
                  return;
               }

               var9.c();
               return;
            case 5:
               if (cCanvas.m_Option[2] != 0 && !GameState.stageClearNextStage || var2 < 180) {
                  return;
               }

               ((GameState)var1).clearGame();
               return;
            case 6:
               if (var2 >= 240) {
                  ((GameState)var1).clearGame();
               }

               return;
            default:
               return;
            }
         case 126:
            var10 = var1.getSonicAction();
            switch(super.m_R_No0) {
            case 0:
               super.m_R_No0 += 2;
               super.m_Actflg = 4;
               super.m_Sprpri = 1;
               super.m_Sprhsize = 24;
               super.m_Sproffset = 1522;
               if ((var10.m_Sproffset & 128) != 0) {
                  super.m_Sproffset |= 128;
               }
            case 2:
               break;
            default:
               return;
            }

            super.m_Patno = 3;
            if (GameState.m_SSonicFlag == 0) {
               this.frameOut(var1);
            } else if (super.m_Reserve[0] != 0) {
               --super.m_Pattim;
               if (super.m_Pattim < 0) {
                  super.m_Pattim = 1;
                  ++super.m_Patcnt;
                  if (super.m_Patcnt >= 6) {
                     super.m_Patcnt = 0;
                     super.m_Reserve[0] = 0;
                     super.m_Reserve[1] = 1;
                     break;
                  }
               }

               if (super.m_Reserve[1] == 0) {
                  super.m_Xposi = var10.m_Xposi;
                  super.m_Yposi = var10.m_Yposi;
               }

               super.m_Patno = x[super.m_Patcnt];
            } else {
               if (var10.m_PlayerFlag != 0 || Math.abs(var10.m_Mspeed) < 2048) {
                  super.m_Reserve[0] = 0;
                  super.m_Reserve[1] = 0;
                  return;
               }

               super.m_Patcnt = 0;
               super.m_Reserve[0] = 1;
               super.m_Xposi = var10.m_Xposi;
               super.m_Yposi = var10.m_Yposi;
            }
            break;
         case 221:
            this.patchg(d);
            return;
         case 223:
            switch((var9 = this).m_R_No0) {
            case 0:
               var9.m_Reserve[0] = 360;
               ++GameState.m_ChaosCnt;
               GameState.m_PlRing = 0;
               cCanvas.doVibration(1000);
               cCanvas.am.bgmset(6);
               var9.m_R_No0 = 2;
               return;
            case 1:
            case 3:
            default:
               return;
            case 2:
               var10002 = var9.m_Reserve[0]--;
               if (var9.m_Reserve[0] != 0) {
                  return;
               }

               var9.m_R_No0 = 4;
               return;
            case 4:
               var9.frameOut(var1);
               return;
            }
         case 224:
            var2 = t[0][3];
            var3 = t[1][3];
            if (super.m_Reserve[0] < (crlCanvas.getGameWidth() - var2) / 2) {
               var10000 = super.m_Reserve;
               var10000[0] += 4;
            }

            if (super.m_Reserve[1] > (crlCanvas.getGameWidth() - var3) / 2) {
               var10000 = super.m_Reserve;
               var10000[1] -= 4;
            }
         }

         return;
      }

      var9.b(var1);
   }

   public void render(Graphics var1) {
      int var2;
      switch(super.m_Actno) {
      case 10:
         Action var5;
         if ((var5 = State.mSonicAction).m_airClock > 0 && ((var2 = var5.m_airClock / 1000) <= 11 && var2 > 7 || var2 <= 7 && var2 >= 0 && cCanvas.m_ScreenFrame % 2 == 0)) {
            Utilities.drawImage(var1, e, z, 17 + var2 / 2, 0, 112, 70, 0, 0);
         }

         return;
      case 52:
         PlayerAction2 var4;
         if ((var4 = this).m_R_No0 <= 1) {
            var1.setColor(0, 0, 0);
            var1.fillRect(0, cCanvas.viewPortOffset, cCanvas.viewPortWidth, cCanvas.viewPortHeight);
         }

         if (var4.m_Reserve[1] > 0) {
            var1.setColor(0, 32, 192);
            var1.fillRect(0, cCanvas.viewPortOffset, cCanvas.viewPortWidth, var4.m_Reserve[1] - cCanvas.viewPortOffset);
         }

         var1.drawImage(e[q[15][0]], var4.m_Reserve[2], cCanvas.viewPortOffset + Utilities.scale(176), 20);
         var1.drawImage(e[q[16][0]], var4.m_Reserve[3], cCanvas.viewPortOffset, 20);
         Utilities.drawImage(var1, e, q, var4.m_Reserve[6], 0, 0 + var4.m_Reserve[4] - q[var4.m_Reserve[6]][3], cCanvas.viewPortOffset + 83, 0, 0);
         Utilities.drawImage(var1, e, q, 11, 0, 0 + var4.m_Reserve[5] - 26 - q[11][3], cCanvas.viewPortOffset + 107, 0, 0);
         var2 = var4.m_Reserve[9];
         Utilities.drawImage(var1, e, q, var2, 0, 0 + var4.m_Reserve[5] - q[var2][3], cCanvas.viewPortOffset + 107, 0, 0);
         return;
      case 57:
         Utilities.drawImage(var1, e, y, super.m_Reserve[1], 0, super.m_Reserve[2] - y[super.m_Reserve[1]][3], 104, 0, 0);
         Utilities.drawImage(var1, e, y, 2, 0, super.m_Reserve[3], 104, 0, 0);
         return;
      case 58:
         var1 = var1;
         Utilities.drawImage(var1, e, s, 0, 0, super.m_Reserve[2], 70, 0, 0);
         var2 = super.m_Reserve[1];
         Utilities.drawImage(var1, e, s, 1, 0, super.m_Reserve[3] - s[2][3] - s[1][3] - 16, 106 - s[1][4], 0, 0);
         Utilities.drawImage(var1, e, s, 2, 0, super.m_Reserve[3] - s[2][3] - 8, 106 - s[2][4], 0, 0);
         Utilities.drawImage(var1, e, s, var2, 0, super.m_Reserve[3], 106 - s[var2][4], 0, 0);
         Utilities.drawImage(var1, e, s, 7, 0, super.m_Reserve[4], 128, 0, 0);
         this.a(var1, super.m_Reserve[7] * 10, super.m_Reserve[4] + 160, 128);
         Utilities.drawImage(var1, e, s, 6, 0, super.m_Reserve[5], 144, 0, 0);
         this.a(var1, super.m_Reserve[8] * 10, super.m_Reserve[5] + 160, 144);
         Utilities.drawImage(var1, e, s, 8, 0, super.m_Reserve[6], 176, 0, 0);
         this.a(var1, super.m_Reserve[10] * 10, super.m_Reserve[6] + 160, 176);
         if (super.m_R_No0 == 6 && super.m_Reserve[0] >= 60 && (GameState.m_GameTimer & 8) != 0) {
            Utilities.drawImage(var1, e, s, 29 + GameState.m_GameTimer / 19 % 2, 0, 208, 174, 0, 0);
         }

         for(int var3 = 0; var3 < GameState.m_ChaosCnt; ++var3) {
            Utilities.drawImage(var1, e, C, var3, 0, 40 + var3 * 20, 200, 0, 0);
         }

         return;
      case 223:
         if (cCanvas.m_ScreenFrame % 2 == 0) {
            Utilities.drawImage(var1, e, C, GameState.m_ChaosCnt - 1, 0, cCanvas.viewPortWidth - C[0][3] >> 1, cCanvas.viewPortOffset + 32, 0, 0);
         }

         return;
      case 224:
         var2 = crlCanvas.getGameHeight() / 2;
         var1.drawRegion(e[4], t[0][1], t[0][2], t[0][3], t[0][4], 0, super.m_Reserve[0], var2 - 18, 20);
         var1.drawRegion(e[4], t[1][1], t[1][2], t[1][3], t[1][4], 0, super.m_Reserve[1], var2, 20);
      default:
      }
   }

   public static void prepareImages() {
      e = new Image[Filenames.PlayerActionImgName.length];
      Utilities.loadImages(Filenames.PlayerActionImgName, e);
   }

   private void a(State var1) {
      this.frameOut(var1);
      if (this == GameState.m_playerEffectAction) {
         GameState.m_playerEffectAction = null;
      }

   }

   private void a() {
      if (super.m_Userflag == 1) {
         if (super.m_Xposi > GameState.m_ScrALim_Right / 3) {
            super.m_Xspeed = State.mSonicAction.m_Xspeed - 256;
            return;
         }

         super.m_Xspeed = State.mSonicAction.m_Xspeed;
      }

   }

   public static void disposeImages() {
      e = null;
   }

   private void b() {
      ++super.m_R_No0;
      super.m_Reserve[0] = 0;
   }

   private void c() {
      ++super.m_R_No0;
      super.m_Reserve[0] = 0;
   }

   private void a(Graphics var1, int var2, int var3, int var4) {
      do {
         int var5 = var2 % 10;
         var2 /= 10;
         var3 -= s[var5 + 9][3];
         Utilities.drawImage(var1, e, s, var5 + 9, 0, var3, var4, 0, 0);
      } while(var2 > 0);

   }

   private void b(State var1) {
      Action var2 = var1.getSonicAction();
      int[] var10000;
      int var10002;
      int var3;
      if (super.m_Reserve[0] == 0) {
         if (var2.m_R_No0 >= 6) {
            return;
         }

         if ((var2.m_Cddat & 64) == 0) {
            super.m_Patno = -1;
            return;
         }

         if (var2.m_AirCnt == 30) {
            var2.m_airClock = 0;
         } else if (var2.m_airClock > 0) {
            var2.m_airClock -= cCanvas.tickTime;
            cCanvas.tickTime = 0;
            if (var2.m_airClock <= 0) {
               State.mSonicAction.m_AirCnt = 0;
            }
         }

         var10002 = super.m_Reserve[6]--;
         if (super.m_Reserve[6] < 0) {
            super.m_Reserve[6] = 62;
            super.m_Reserve[5] = 1;
            var3 = Utilities.getRandom() & 1;
            super.m_Reserve[4] = var3;
            if (var2.m_AirCnt == 12) {
               cCanvas.am.bgmset(4);
               var2.m_airClock = 12000;
               var10002 = super.m_Reserve[3]--;
               if (super.m_Reserve[3] < 0) {
                  super.m_Reserve[3] = super.m_Reserve[9];
                  var10000 = super.m_Reserve;
                  var10000[5] |= 128;
               }
            }

            --var2.m_AirCnt;
            if (var2.m_AirCnt < 0) {
               ((GameState)var1).playDieSet(var2);
               var2.m_PlayerFlag = 129;
               cCanvas.am.bgmset(11);
               super.m_Reserve[4] = 10;
               super.m_Reserve[5] = 1;
               super.m_Reserve[0] = 120;
               ((GameState)var1).jumpColSub(var2);
               var2.m_Mstno = 23;
               var2.m_Cddat |= 2;
               var2.m_Yspeed = 0;
               var2.m_Xspeed = 0;
               var2.m_Mspeed = 0;
               GameState.m_Scroll_Start = 1;
               GameState.m_ScrollStop = true;
            }
         } else {
            if (super.m_Reserve[5] == 0) {
               return;
            }

            var10002 = super.m_Reserve[7]--;
            if (super.m_Reserve[7] >= 0) {
               return;
            }
         }
      } else {
         var10002 = super.m_Reserve[0]--;
         if (super.m_Reserve[0] == 0) {
            var2.m_R_No0 = 6;
            return;
         }

         var2.speedSet2();
         var2.m_Yspeed += 16;
      }

      var3 = Utilities.getRandom() & 15;
      var3 += 8;
      super.m_Reserve[7] = var3;
      Action var4;
      if ((var4 = var1.insertAction(super.m_Actno)) != null) {
         var4.m_Xposi = super.m_Xposi;
         byte var6 = 6;
         if ((var2.m_Cddat & 1) != 0) {
            var6 = -6;
            var4.m_Direc = 64;
         }

         var4.m_Xposi += var6;
         var4.m_Yposi = var2.m_Yposi;
         var4.m_Userflag = 6;
         int var5;
         if (super.m_Reserve[0] != 0) {
            var10000 = super.m_Reserve;
            var10000[7] &= 7;
            var5 = var2.m_Yposi;
            var5 -= 12;
            var4.m_Yposi = var5;
            var3 = Utilities.getRandom();
            var4.m_Direc = var3;
            if ((GameState.m_GameTimer & 3) == 0) {
               var4.m_Userflag = 14;
            }

            var10002 = super.m_Reserve[4]--;
            if (super.m_Reserve[4] < 0) {
               super.m_Reserve[5] = 0;
            }

         } else {
            if ((super.m_Reserve[5] & 128) != 0 && var2.m_AirCnt < 12) {
               var5 = var2.m_AirCnt >> 1;
               if ((Utilities.getRandom() & 3) != 0) {
                  if ((super.m_Reserve[5] & 64) != 0) {
                     var10002 = super.m_Reserve[4]--;
                     if (super.m_Reserve[4] < 0) {
                        super.m_Reserve[5] = 0;
                     }

                     return;
                  }

                  var4.m_Userflag = var5;
                  var4.m_Reserve[6] = 28;
               }

               if (super.m_Reserve[4] == 0 && (super.m_Reserve[5] & 64) == 0) {
                  var4.m_Userflag = var5;
                  var4.m_Reserve[6] = 28;
               }
            }

            var10002 = super.m_Reserve[4]--;
            if (super.m_Reserve[4] < 0) {
               super.m_Reserve[5] = 0;
            }

         }
      }
   }

   private void c(State var1) {
      if (super.m_Reserve[6] != 0) {
         int var10002 = super.m_Reserve[6]--;
         if (super.m_Reserve[6] > 0 && super.m_Mstno < 7) {
            super.m_Reserve[6] = 15;
            super.m_Yspeed = 0;
            super.m_Actflg = 128;
            super.m_R_No0 = 12;
         }
      }

   }

   public static void RING_RingGetSub0(Action var0) {
      var0.m_Mstno = 0;
      GameState.m_PlRing_T = Math.min(GameState.m_PlRing_T + 1, 999);
      if (GameState.m_PlRing < 999) {
         ++GameState.m_PlRing;
         GameState.m_PlRing_F |= 2;
         if (GameState.m_PlRing >= 100 && (GameState.m_PlRing_F2 & 2) == 0) {
            GameState.m_PlRing_F2 |= 2;
            ++GameState.m_Pl_Suu;
            cCanvas.am.bgmset(6);
            return;
         }

         if (GameState.m_PlRing >= 200 && (GameState.m_PlRing_F2 & 4) == 0) {
            GameState.m_PlRing_F2 |= 4;
            ++GameState.m_Pl_Suu;
            cCanvas.am.bgmset(6);
            return;
         }
      }

   }

   public static Image[] getPlayerSprites() {
      return e;
   }
}
