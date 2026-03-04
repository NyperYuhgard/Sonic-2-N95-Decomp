package STH2P1;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class CommonAction extends Action {
   public static final int ACT_MAX = 221;
   private static int[] a;
   private static Image[][] b = new Image[221][];
   private static final int[] c = new int[]{32, 64, 128, 256};
   private static int d = 2;
   private static int e = 3;
   private static int f = 4;
   private static int g = 5;
   private static int h = 0;
   private static int i = 0;
   private static byte[] j;
   private static byte[] k;
   private static final int[][] l = new int[][]{{0, 0, 0, 16, 16, -8, -8}, {0, 16, 0, 32, 32, -16, -16}, {0, 48, 0, 32, 32, -16, -16}, {0, 80, 0, 32, 32, -16, -16}, {0, 112, 0, 32, 32, -16, -16}, {0, 144, 0, 32, 32, -16, -16}, {0, 176, 0, 32, 32, -16, -16}};
   private static final int[][][] m = new int[][][]{{{0, 0, 0, 64, 32, -32, -16}}, {{0, 0, 0, 64, 32, -32, -16}, {1, 0, 0, 64, 96, -32, -48}}, {{0, 0, 0, 64, 48, -32, -24}, {1, 0, 0, 64, 88, -32, -44}}};
   private static final byte[][] n = new byte[][]{{32, 0}, {32, 1}, {32, 2}, {64, 3}, {48, 4}};
   private static final int[][] o = new int[][]{{0, 16, 16, 16, 64, -8, -40}, {0, 0, 32, 16, 48, -8, -24}, {0, 16, 16, 16, 16, -8, -8}, {0, 0, 16, 16, 16, -8, -8}, {0, 0, 16, 16, 64, -8, -40}, {0, 0, 0, 8, 8, -4, -4}, {0, 8, 0, 8, 8, -4, -4}, {0, 16, 0, 16, 16, -8, -8}};
   private static final int[][] p = new int[][]{{16, 0, -1}, {16, 1, -1}, {4, 0, 4, -1}};
   private static final int[][] q = new int[][]{{0, 0, 64, 32, 32, -16, -16}, {0, 0, 160, 32, 32, -16, -16}, new int[0], new int[0], {0, 0, 32, 32, 32, -16, -16}, {0, 0, 0, 32, 32, -16, -16}, {0, 0, 128, 32, 32, -16, -16}, {0, 0, 96, 32, 32, -16, -16}, {0, 0, 192, 32, 32, -16, -16}, new int[0], {0, 0, 224, 32, 14, -16, 0}, {0, 8, 69, 16, 16, -8, -8}, {0, 8, 165, 16, 16, -8, -8}, new int[0], new int[0], {0, 8, 37, 16, 16, -8, -8}, {0, 8, 5, 16, 16, -8, -8}, {0, 8, 133, 16, 16, -8, -8}, {0, 8, 101, 16, 16, -8, -8}, {0, 8, 197, 16, 16, -8, -8}, new int[0]};
   private static final int[][] r = new int[][]{{30, 0, -1}, {30, 1, -1}, {30, 2, -1}, {30, 3, -1}, {30, 4, -1}, {30, 5, -1}, {30, 6, -1}, {30, 7, -1}, {30, 8, -1}, {30, 9, -1}, {30, 10, -1}, {30, 11, -1}, {30, 12, -1}, {30, 13, -1}, {30, 14, -1}, {30, 15, -1}};
   private static final int[][] s;
   private static final int[][] t;
   private static final int[][] u;
   private static final int[] v;
   private static final int[] w;
   private static final int[][] x;
   private static final byte[][] y;
   private static final int[][] z;
   private static final int[][] A;
   private static final int[][] B;
   private static final int[][] C;
   private static byte[] D;
   private static final int[][] E;
   private static final int[][] F;
   private static final int[][] G;
   private static final int[][] H;
   private static final int[][] I;
   private static final byte[] J;
   private static final int[] K;
   private static final int[] L;
   private static final int[][][] M;
   private static final int[][] N;
   private static final int[][][] O;
   private static final int[][] P;
   private static final int[][] Q;
   private static final int[][] R;
   private static final short[][] S;
   private static final int[][][] T;
   private static final int[][][] U;
   private static final int[][] V;
   private static final int[] W;
   private static final int[] X;
   private static final int[] Y;
   private static final int[] Z;
   private static final int[] aa;
   private static final int[][][] ab;
   private static final int[][][] ac;

   public CommonAction() {
   }

   public CommonAction(int var1, int var2) {
      super.classType = 3;
      this.setType(var1, var2);
   }

   public void setType(int var1, int var2) {
      super.m_Actno = var1;
      CommonAction var3;
      switch(var1) {
      case 3:
         (var3 = this).m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, g);
         return;
      case 6:
         if (j == null) {
            j = Utilities.arrayInputDataByte1("/SLOOPTBL.bin");
         }

         if (k == null) {
            k = Utilities.arrayInputDataByte1("/SLOOPDIRTBL.bin");
         }

         super.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(super.m_Reserve, 0, 4);
         h = 0;
         i = 0;
         return;
      case 13:
         (var3 = this).m_Patbase_Image = getAppImages(13);
         var3.m_Patbase_Table = B;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 6);
         return;
      case 21:
         super.m_Patbase_Image = getAppImages(21);
         super.m_Patbase_Table = ac[0];
         super.m_AutoFrameout = false;
         super.m_Reserve = new int[11];
      default:
         return;
      case 24:
         (var3 = this).m_Patbase_Image = getAppImages(24);
         var3.m_Patbase_Table = m[0];
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 8);
         return;
      case 25:
         (var3 = this).m_Patbase_Image = getAppImages(25);
         var3.m_Patbase_Table = M[0];
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 4);
         return;
      case 28:
         super.m_Patno = -1;
         super.m_Patbase_Image = getAppImages(28);
         super.m_Patbase_Table = z;
         return;
      case 31:
         (var3 = this).m_Patbase_Image = getAppImages(31);
         var3.m_Patbase_Table = T[0];
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 5);
         return;
      case 38:
      case 46:
         (var3 = this).m_Patbase_Image = getAppImages(38);
         var3.m_Patbase_Table = q;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 10);
         return;
      case 45:
         (var3 = this).m_Patbase_Image = getAppImages(45);
         var3.m_Patbase_Table = ab[0];
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 5);
         return;
      case 50:
         (var3 = this).m_Patbase_Image = getAppImages(50);
         var3.m_Patbase_Table = T[4];
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 7);
         return;
      case 54:
         (var3 = this).m_Patbase_Image = getAppImages(54);
         var3.m_Patbase_Table = x;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 5);
         return;
      case 62:
         (var3 = this).m_Patbase_Image = getAppImages(62);
         var3.m_Patbase_Table = E;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 3);
         return;
      case 64:
         (var3 = this).m_Patbase_Image = getAppImages(64);
         var3.m_Patbase_Table = H;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 2);
         return;
      case 65:
         (var3 = this).m_Patbase_Image = getAppImages(65);
         var3.m_Patbase_Table = s;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         return;
      case 88:
         (var3 = this).m_Patbase_Image = getAppImages(88);
         var3.m_Patbase_Table = l;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 1);
         return;
      case 107:
         (var3 = this).m_Patbase_Image = getAppImages(107);
         var3.m_Patbase_Table = O[0];
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 8);
         return;
      case 114:
         (var3 = this).m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 4);
         return;
      case 116:
         return;
      case 121:
         (var3 = this).m_Patbase_Image = getAppImages(121);
         var3.m_Patbase_Table = o;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 9);
         return;
      case 122:
         (var3 = this).m_Patbase_Image = getAppImages(122);
         var3.m_Patbase_Table = Q;
         var3.m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 6);
         return;
      case 132:
         (var3 = this).m_Reserve = State.mReserves[var2];
         Utilities.reset1DIntArray(var3.m_Reserve, 0, 3);
      }
   }

   public void update(State var1) {
      CommonAction var11;
      label1582: {
         label1332: {
            label1583: {
               int var2;
               int var3;
               Action var4;
               Action var5;
               Action var7;
               Action var8;
               int var13;
               int var14;
               Action var15;
               int var17;
               int var10001;
               int var18;
               int var10002;
               byte var20;
               int var22;
               Action var23;
               boolean var24;
               Action var28;
               CommonAction var32;
               int[] var36;
               switch(super.m_Actno) {
               case 3:
                  var2 = (var11 = this).m_Userflag & 255;
                  var28 = var1.getSonicAction();
                  var4 = var1.getTailsAction();
                  switch(var11.m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Actflg |= 4;
                     var11.m_Sprhsize = 16;
                     var11.m_Sprpri = 5;
                     if ((var2 & 4) != 0) {
                        var11.m_R_No0 += 2;
                        var11.m_Reserve[d] = c[var2 & 3];
                        if (var28.m_Yposi > var11.m_Yposi) {
                           var11.m_Reserve[e] = 1;
                        }

                        if (var4 != null && var4.m_Yposi > var11.m_Yposi) {
                           var11.m_Reserve[f] = 1;
                        }

                        var11.a(var1);
                        return;
                     } else {
                        var11.m_Reserve[d] = c[var2 & 3];
                        if (var28.m_Xposi > var11.m_Xposi) {
                           var11.m_Reserve[e] = 1;
                        }

                        if (var4 != null && var4.m_Xposi > var11.m_Xposi) {
                           var11.m_Reserve[f] = 1;
                        }
                     }
                  case 2:
                     var11.a(var1, var28, e);
                     var24 = false;
                     if (GameState.zoneNumber == 0) {
                        if (var11.m_Xposi == 6552 && var11.m_Yposi == 1088) {
                           var24 = true;
                        }

                        if (var11.m_Xposi == 8720 && var11.m_Yposi == 1112) {
                           var24 = true;
                        }
                     }

                     if (!var24) {
                        var11.a(var1, var4, f);
                     }
                  case 1:
                  case 3:
                  default:
                     break label1583;
                  case 4:
                     var11.a(var1);
                     break label1583;
                  }
               case 6:
                  var2 = (var11 = this).m_Userflag & 255;
                  switch(var11.m_R_No0) {
                  case 0:
                     h = 0;
                     i = 0;
                     var11.m_Sprhsize = 208;
                     if ((var2 & 128) != 0) {
                        var11.m_R_No0 = 4;
                     } else {
                        var11.m_R_No0 = 2;
                     }

                     return;
                  case 2:
                     var11.a((State)var1, 0);
                     var11.a((State)var1, 1);
                     return;
                  case 4:
                     var11.b((State)var1, 0);
                     var11.b((State)var1, 1);
                  case 1:
                  case 3:
                  default:
                     return;
                  }
               case 13:
                  switch((var11 = this).m_R_No0) {
                  case 0:
                     if ((GameState.zoneNumber != 4 || GameState.actNumber != 1) && GameState.actNumber != 0) {
                        var11.m_Xposi = 0;
                        return;
                     } else {
                        var11.m_R_No0 = 2;
                        var11.m_Actflg = 4;
                        var11.m_Sprhsize = 24;
                        var11.m_Sprpri = 4;
                     }
                  case 2:
                     if (GameState.m_PlTime_F != 0 && (var2 = var1.getSonicAction().m_Xposi - var11.m_Xposi) >= 0 && 32 > var2) {
                        GameState.m_PlTime_F = 0;
                        var11.m_Mstno = 0;
                        var11.m_Mstno_1 = 1;
                        var11.m_Reserve[0] = 0;
                        GameState.m_ScrALim_Left = GameState.m_ScrALim_Right;
                        var11.m_R_No1 = 2;
                        GameState.m_Accept_Softkey = 2;
                        State.setSoftKey(256, (String)null);
                        State.setSoftKey(512, (String)null);
                        if (var11.m_Reserve[3] != 0) {
                           var11.c(var1);
                        } else {
                           var11.m_Reserve[3] = 3;
                           if (var11.m_Reserve[4] == 2) {
                              var11.m_Reserve[3] = 4;
                           }

                           var11.c(var1);
                        }

                        return;
                     } else {
                        var11.c(var1);
                     }
                  default:
                     break label1582;
                  }
               case 21:
                  var2 = (var11 = this).m_Userflag & 255;
                  if ((var11.m_Actflg & 64) == 0) {
                     switch(var11.m_R_No0) {
                     case 0:
                        var11.m_R_No0 += 2;
                        var11.m_Actflg = 4;
                        var11.m_Sprpri = 1;
                        var11.m_Sprhsize = 32;
                        var11.m_Sprvsize = 16;
                        var11.m_Reserve[4] = var11.m_Yposi;
                        var11.m_Reserve[5] = var11.m_Xposi;
                        if (GameState.zoneNumber == 10) {
                           var11.m_Patbase_Table = ac[1];
                        } else if (GameState.zoneNumber == 11) {
                           var11.m_Sprhsize = 24;
                           var11.m_Sprvsize = 8;
                           var11.m_Patbase_Table = ac[2];
                        } else if (GameState.zoneNumber == 15) {
                           var11.m_Sprhsize = 32;
                           var11.m_Sprvsize = 8;
                        }

                        if ((var2 & 128) != 0) {
                           var11.m_R_No0 += 4;
                        }

                        var18 = var2 & 112;
                        var3 = var2 & 15;
                        var13 = var11.m_Xposi;
                        var14 = var11.m_Yposi;
                        if ((var15 = var1.insertAction(var11, var11.m_Actno)) != null) {
                           var15.m_Actno = var11.m_Actno;
                           var15.m_Patbase_Table = var11.m_Patbase_Table;
                           var15.m_Sprpri = 6;
                           var15.m_Sproffset = 0;
                           var15.m_Actflg = 4;
                           if (var18 == 32) {
                              var15.m_R_No0 = 4;
                              var15.m_Sprpri = 4;
                              var15.m_Sprhsize = 16;
                              var15.m_Sprvsize = 80;
                              var15.m_Actflg |= 16;
                              var15.m_Patno = 2;
                              var15.m_Xposi = var13;
                              var14 += 64;
                              var15.m_Yposi = var14;
                              var14 += 72;
                              var11.m_Yposi = var14;
                           } else {
                              var15.m_Sprpri = 6;
                              var15.m_Sproffset = 0;
                              var15.m_Actflg |= 64;
                              var15.m_Patno = -1;
                              var15.m_Sprhsize = 72;
                              var3 += 2;
                              var15.m_Manysprcnt = var3;
                              var15.m_Sprpositbl = new int[var3][4];

                              for(var22 = 0; var22 < var3; ++var22) {
                                 var15.m_Sprpositbl[var22][0] = var13;
                                 var15.m_Sprpositbl[var22][1] = var14;
                                 var15.m_Sprpositbl[var22][3] = 1;
                                 var14 += 16;
                              }

                              var15.m_Sprpositbl[0][3] = 2;
                              var15.m_Sprpositbl[var3 - 1][0] = var11.m_Xposi;
                              var15.m_Sprpositbl[var3 - 1][1] = var11.m_Yposi;
                              var15.m_Sprpositbl[var3 - 1][3] = 2;
                              var15.m_Patno_Ms = 1;
                              var14 += 8;
                              var11.m_Yposi = var14;
                              var15.m_Sprvsize_Ms = 80;
                              var15.m_Actflg |= 16;
                           }

                           var11.m_ReserveObj = var15;
                        }

                        var11.m_Direc = 128;
                        var11.m_Direc1 = 0;
                        var11.m_Reserve[8] = 0;
                        var11.m_Userflag &= 112;
                        if (var11.m_Userflag == 64) {
                           var11.m_Patbase_Table = ac[3];
                           var11.m_Colino = 167;
                        }

                        var11.m_Patno = 0;
                     case 2:
                        var17 = var11.m_Xposi;
                        var11.g(var1);
                        ((GameState)var1).rideChkSub_h(var17, var11.m_Yposi, var11.m_Sprhsize, var11.m_Sprvsize, 0, var11.m_Sprvsize + 1, var11);
                        return;
                     case 1:
                     case 3:
                     case 5:
                     case 7:
                     case 9:
                     case 11:
                     default:
                        break;
                     case 4:
                        return;
                     case 6:
                        var17 = var11.m_Xposi;
                        var11.g(var1);
                        ((GameState)var1).rideChkSub_h(var17, var11.m_Yposi, var11.m_Sprhsize, var11.m_Sprvsize, 0, var11.m_Sprvsize + 1, var11);
                        if ((var11.m_Cddat & 24) != 0 && GameState.m_Sysdirec[6] >> 24 == 0) {
                           if ((var15 = var1.insertAction(var11, var11.m_Actno)) != null) {
                              var15.m_Actno = var11.m_Actno;
                              var15.m_Actflg = 4;
                              var15.m_Userflag = var11.m_Userflag;
                              var15.m_Sproffset = var11.m_Sproffset;
                              var15.m_Patbase = var11.m_Patbase;
                              var15.m_Patbase_Table = var11.m_Patbase_Table;
                              var15.m_Xposi = var11.m_Xposi;
                              var15.m_Yposi = var11.m_Yposi;
                              var15.m_Sprvs = var11.m_Sprvs;
                              var15.m_Sprhs = var11.m_Sprhs;
                              var15.m_Sprhsize = var11.m_Sprhsize;
                              var15.m_Sprvsize = var11.m_Sprvsize;
                              var15.m_Sprpri = var11.m_Sprpri = 3;
                              var15.m_Patno = var11.m_Patno;
                              var15.m_Patcnt = var11.m_Patcnt;
                              var15.m_Colino = var11.m_Colino;
                              var15.m_Cddat = var11.m_Cddat;
                              var15.m_Direc = var11.m_Direc;
                              var15.m_Direc1 = var11.m_Direc1;

                              for(var22 = 0; var22 < 11; ++var22) {
                                 var15.m_Reserve[var22] = var11.m_Reserve[var22];
                              }

                              var15.m_R_No0 = 10;
                              if (GameState.zoneNumber == 15) {
                                 var15.m_R_No0 += 2;
                              }

                              var15.m_Xspeed = 512;
                              if ((var11.m_Cddat & 1) != 0) {
                                 var15.m_Xspeed = -var15.m_Xspeed;
                              }

                              var15.m_Cddat |= 2;
                              if ((var11.m_Cddat & 8) != 0) {
                                 var1.getSonicAction().m_RideActWk = var15;
                              }

                              if ((var11.m_Cddat & 16) != 0 && (var8 = var1.getTailsAction()) != null) {
                                 var8.m_RideActWk = var15;
                              }
                           }

                           var11.m_Patno = 3;
                           var11.m_R_No0 += 2;
                           var11.m_Cddat &= 231;
                           return;
                        }
                        break;
                     case 8:
                        var11.g(var1);
                        return;
                     case 10:
                        var17 = var11.m_Xposi;
                        if ((var11.m_Cddat & 2) != 0) {
                           var11.speedSet2();
                           var11.m_Yspeed += 24;
                           if (1824 <= var11.m_Yposi) {
                              var11.m_Cddat &= -3;
                              var11.m_Xspeed = 0;
                              var11.m_Yspeed = 0;
                              var11.m_Reserve[4] = var11.m_Yposi;
                           }
                        } else {
                           var11.m_Yposi = var11.m_Reserve[4] + (GameState.m_Sysdirec[5] >> 25);
                        }

                        ((GameState)var1).rideChkSub_h(var17, var11.m_Yposi, var11.m_Sprhsize, var11.m_Sprvsize, 0, var11.m_Sprvsize + 1, var11);
                        var11.frameOutCheck(var1);
                        return;
                     case 12:
                        var17 = var11.m_Xposi;
                        var11.speedSet2();
                        if ((var11.m_Cddat & 2) != 0) {
                           var11.m_Yspeed += 24;
                           if (var11.m_Yposi >= GameState.m_WaterPosi_m) {
                              var11.m_Yposi = GameState.m_WaterPosi_m;
                              var11.m_Reserve[4] = GameState.m_WaterPosi_m;
                              var11.m_Cddat &= -3;
                              var11.m_Xspeed = 256;
                              var11.m_Yspeed = 0;
                           }
                        } else {
                           var11.m_Yposi = var11.m_Reserve[4] + (GameState.m_Sysdirec[5] >> 25);
                           if (var11.m_Xspeed != 0 && (var3 = ((GameState)var1).emyCol_R(var11.m_Xposi, var11.m_Yposi, var11.m_Sprhsize)) < 0) {
                              var11.m_Xposi += var3;
                              var11.m_Xspeed = 0;
                           }
                        }

                        ((GameState)var1).rideChkSub_h(var17, var11.m_Yposi, var11.m_Sprhsize, var11.m_Sprvsize, 0, var11.m_Sprvsize + 1, var11);
                        var11.frameOutCheck(var1);
                     }
                  }
                  break;
               case 24:
                  var2 = (var11 = this).m_Userflag & 255;
                  switch(var11.m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Sprvsize = 16;
                     var11.m_Sprhsize = n[var2 >> 4 & 7][0];
                     var11.m_Patno = n[var2 >> 4 & 7][1];
                     if (GameState.zoneNumber == 15) {
                        var11.m_Patbase_Table = m[2];
                     } else if (GameState.zoneNumber == 7) {
                        var11.m_Patbase_Table = m[1];
                     }

                     var11.m_Actflg = 4;
                     var11.m_Sprpri = 4;
                     var11.m_Reserve[0] = var11.m_Yposi;
                     var11.m_Reserve[2] = var11.m_Yposi;
                     var11.m_Reserve[1] = var11.m_Xposi;
                     var11.m_Direc = 0;
                     var11.m_Direc1 = 128;
                     if ((var2 & 128) != 0) {
                        var11.m_R_No0 += 6;
                        var11.m_Userflag &= 15;
                        var11.m_Sprvsize = 48;
                        if (GameState.zoneNumber == 15) {
                           var11.m_Sprvsize = 40;
                        }

                        var11.m_Actflg |= 16;
                        return;
                     } else {
                        var11.m_Userflag &= 15;
                     }
                  case 2:
                     if ((var11.m_Cddat & 24) == 0) {
                        if (var11.m_Reserve[5] != 0) {
                           var36 = var11.m_Reserve;
                           var36[5] -= 4;
                        }
                     } else if (var11.m_Reserve[5] != 40) {
                        var36 = var11.m_Reserve;
                        var36[5] += 4;
                     }

                     var3 = var11.m_Xposi;
                     var11.b(var1);
                     var11.b();
                     ((GameState)var1).rideChkSub(var3, var11.m_Yposi, var11.m_Sprhsize, var11.m_Sprvsize, 0, 8, var11);
                     var11.shimafoutchk(var1);
                     return;
                  case 1:
                  case 3:
                  case 5:
                  case 7:
                  default:
                     return;
                  case 4:
                     var11.frameOut(var1);
                     return;
                  case 6:
                     var3 = var11.m_Xposi;
                     var11.b(var1);
                     var11.b();
                     ((GameState)var1).rideChkSub(var3, var11.m_Yposi, var11.m_Sprhsize, var11.m_Sprvsize, 0, 8, var11);
                     var11.frameOutCheck(var1);
                     return;
                  case 8:
                     if ((var11.m_Cddat & 24) == 0) {
                        if (var11.m_Reserve[5] != 0) {
                           var36 = var11.m_Reserve;
                           var36[5] -= 4;
                        }
                     } else if (var11.m_Reserve[5] != 64) {
                        var36 = var11.m_Reserve;
                        var36[5] += 4;
                     }

                     var11.b(var1);
                     var11.b();
                     ((GameState)var1).atariRideSub(var11.m_Xposi, var11.m_Yposi, var11.m_Sprhsize + 11, var11.m_Sprvsize, var11.m_Sprvsize + 1, 8, var11);
                     var11.shimafoutchk(var1);
                     return;
                  }
               case 25:
                  var2 = (var11 = this).m_Userflag & 255;
                  switch(var11.m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Actflg = 4;
                     var3 = var2 >> 4 & 15;
                     var11.m_Sprhsize = N[var3][0];
                     var11.m_Patno = N[var3][1];
                     var11.m_Sprpri = 4;
                     var11.m_Reserve[0] = var11.m_Xposi;
                     var11.m_Reserve[1] = var11.m_Yposi;
                     var11.m_Userflag &= 15;
                     if (var11.m_Userflag == 3 && (var11.m_Cddat & 1) != 0) {
                        var11.m_Yposi -= 192;
                     } else if (var11.m_Userflag == 7) {
                        var11.m_Yposi -= 192;
                     }
                  case 2:
                     var13 = var11.m_Xposi;
                     byte var34;
                     switch(var18 = var11.m_Userflag & 15) {
                     case 0:
                     case 1:
                        if (var18 == 0) {
                           var17 = GameState.m_Sysdirec[2] >> 24;
                           var20 = 64;
                        } else {
                           var17 = GameState.m_Sysdirec[3] >> 24;
                           var20 = 96;
                        }

                        if ((var11.m_Cddat & 1) != 0) {
                           var17 = (var17 = -var17) + var20;
                        }

                        var11.m_Xposi = var11.m_Reserve[0] - var17;
                        break;
                     case 2:
                        var17 = GameState.m_Sysdirec[7] >> 24;
                        boolean var35 = false;
                        if ((var11.m_Cddat & 1) != 0) {
                           var17 = (var17 = -var17) + 128;
                        }

                        var11.m_Yposi = var11.m_Reserve[1] - var17;
                        break;
                     case 3:
                        if ((var11.m_Cddat & 24) != 0) {
                           ++var11.m_Userflag;
                        }
                        break;
                     case 4:
                        var11.speedSet2();
                        var34 = 8;
                        var17 = var11.m_Reserve[1] - 96;
                        if (var11.m_Yposi > var17) {
                           var34 = -8;
                        }

                        var11.m_Yspeed += var34;
                        if (var11.m_Yspeed == 0) {
                           ++var11.m_Userflag;
                        }
                     case 5:
                     default:
                        break;
                     case 6:
                     case 7:
                        var11.speedSet2();
                        var34 = 8;
                        var17 = var11.m_Reserve[1] - 96;
                        if (var11.m_Yposi > var17) {
                           var34 = -8;
                        }

                        var11.m_Yspeed += var34;
                        break;
                     case 8:
                     case 9:
                     case 10:
                     case 11:
                        var2 = GameState.m_Sysdirec[14] - 1073741824 >> 24;
                        var22 = GameState.m_Sysdirec[15] - 1073741824 >> 24;
                        if ((var18 & 2) != 0) {
                           var2 = -var2;
                           var22 = -var22;
                        }

                        if ((var18 & 1) != 0) {
                           var3 = -var2;
                           var2 = var22;
                           var22 = var3;
                        }

                        var11.m_Xposi = var11.m_Reserve[0] + var2;
                        var11.m_Yposi = var11.m_Reserve[1] + var22;
                        break;
                     case 12:
                     case 13:
                     case 14:
                     case 15:
                        var2 = GameState.m_Sysdirec[14] - 1073741824 >> 24;
                        var22 = GameState.m_Sysdirec[15] - 1073741824 >> 24;
                        if ((var18 & 2) != 0) {
                           var2 = -var2;
                           var22 = -var22;
                        }

                        if ((var18 & 1) != 0) {
                           var3 = -var2;
                           var2 = var22;
                           var22 = var3;
                        }

                        var2 = -var2;
                        var11.m_Xposi = var11.m_Reserve[0] + var2;
                        var11.m_Yposi = var11.m_Reserve[1] + var22;
                     }

                     ((GameState)var1).rideChkSub(var13, var11.m_Yposi, var11.m_Sprhsize, 0, 0, 17, var11);
                     var11.frameOutCheck(var1);
                  }

                  return;
               case 28:
                  switch((var11 = this).m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var2 = var11.m_Userflag & 255;
                     var11.m_Patno = var2;
                     var11.m_Sproffset = A[var2][0];
                     var11.m_Actflg |= 4;
                     var11.m_Sprhsize = A[var2][1];
                     var11.m_Sprpri = A[var2][3];
                     if ((var3 = A[var2][2]) != 0) {
                        var11.m_Sprvsize = var3;
                        var11.m_Actflg |= 16;
                     }

                     var11.m_AutoFrameout = false;
                  case 2:
                     var11.frameOutCheck(var1);
                  default:
                     return;
                  }
               case 31:
                  switch((var11 = this).m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Actflg |= 4;
                     var11.m_Sprpri = 4;
                     var11.m_Reserve[0] = 24;
                     var11.m_Sprhsize = 36;
                     if ((var11.m_Userflag & 1) == 0) {
                        var11.m_ReserveObj = V[0];
                        var11.m_Reserve[2] = 0;
                     } else {
                        var11.m_ReserveObj = V[1];
                        var11.m_Reserve[2] = 1;
                     }

                     if (GameState.zoneNumber == 15) {
                        var11.m_Patbase_Table = T[3];
                        var11.m_Sprhsize = 32;
                        var11.m_ReserveObj = V[6];
                        var11.m_Reserve[2] = 4;
                     }
                  case 2:
                     if (var11.m_Reserve[1] != 0) {
                        if (var11.m_Reserve[0] == 0) {
                           var3 = var11.m_Reserve[2];
                           int[][] var37;
                           switch(var3) {
                           case 2:
                              var37 = U[3];
                              break;
                           case 3:
                              var37 = U[4];
                              break;
                           case 4:
                              var37 = U[2];
                              break;
                           default:
                              var37 = U[0];
                           }

                           var11.a(var1, var37, (int[])((int[])var11.m_ReserveObj), 1);
                           return;
                        }

                        var10002 = var11.m_Reserve[0]--;
                     }

                     if ((var11.m_Cddat & 24) != 0) {
                        var11.m_Reserve[1] = 1;
                     }

                     ((GameState)var1).rideChkSub(var11.m_Xposi, var11.m_Yposi, var11.m_Sprhsize, var11.m_Sprvsize, 0, 16, var11);
                     var11.frameOutCheck(var1);
                     return;
                  case 4:
                     if (var11.m_Reserve[0] == 0) {
                        var11.speedSet();
                        if ((var11.m_Actflg & 128) == 0) {
                           var11.frameOut(var1);
                           return;
                        }
                     } else if (var11.m_Reserve[1] == 0) {
                        var10002 = var11.m_Reserve[0]--;
                        return;
                     } else {
                        ((GameState)var1).rideChkSub(var11.m_Xposi, var11.m_Yposi, var11.m_Sprhsize, var11.m_Sprvsize, 0, 16, var11);
                        var11.frameOutCheck(var1);
                        if (--var11.m_Reserve[0] == 0) {
                           var11.j(var1.getSonicAction());
                           var11.j(var1.getTailsAction());
                        }
                     }
                  case 1:
                  case 3:
                  default:
                     return;
                  }
               case 38:
                  var2 = (var11 = this).m_Userflag & 255;
                  switch(var11.m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Sprvs = 14;
                     var11.m_Sprhs = 14;
                     var11.m_Actflg = 4;
                     var11.m_Sprpri = 3;
                     var11.m_Sprhsize = 15;
                     if ((GameState.m_FlagWorkCnt[2 + var11.m_Cdsts] & 1) != 0) {
                        var11.m_R_No0 = 8;
                        var11.m_Patno = 10;
                        return;
                     }

                     var11.m_Colino = 70;
                     var11.m_Mstno = var2;
                     var11.m_Patno = var11.m_Mstno;
                  case 2:
                     if (var11.m_R_No1 != 0) {
                        var11.speedSet();
                        if ((var3 = ((GameState)var1).emyCol_D(var11.m_Xposi, var11.m_Yposi, var11.m_Sprvs)) < 0) {
                           var11.m_Yposi += var3;
                           var11.m_Yspeed = 0;
                           var11.m_R_No1 = 0;
                        }
                     }

                     var18 = var11.m_Xposi;
                     var11.a(var1, var1.getSonicAction(), 26, 15, 16, var18, 8, 0);
                     var11.a(var1, var1.getTailsAction(), 26, 15, 16, var18, 16, 1);
                  case 1:
                  case 3:
                  case 5:
                  case 7:
                  default:
                     break;
                  case 4:
                     boolean var27 = false;
                     var28 = var1.getSonicAction();
                     if ((var11.m_Cddat & 120) != 0) {
                        if ((var11.m_Cddat & 40) != 0) {
                           var28.m_Cddat &= -41;
                           var28.m_Cddat |= 2;
                        }

                        if ((var11.m_Cddat & 80) != 0 && (var4 = var1.getTailsAction()) != null) {
                           var4.m_Cddat &= -41;
                           var4.m_Cddat |= 2;
                        }
                     }

                     var11.m_Cddat = 0;
                     var11.m_R_No0 += 2;
                     var11.m_Colino = 0;
                     if ((var4 = var1.insertAction(46)) != null) {
                        var4.m_Actno = 46;
                        var4.m_Xposi = var11.m_Xposi;
                        var4.m_Yposi = var11.m_Yposi;
                        var4.m_Mstno = var11.m_Mstno;
                        var4.m_Reserve[4] = var11.m_Reserve[4];
                        var4.m_Reserve[9] = 0;
                     }

                     if ((var5 = var1.insertAction(39)) != null) {
                        var5.m_Actno = 39;
                        var5.m_R_No0 = 2;
                        var5.m_Xposi = var11.m_Xposi;
                        var5.m_Yposi = var11.m_Yposi;
                     }

                     var36 = GameState.m_FlagWorkCnt;
                     var10001 = var11.m_Cdsts + 2;
                     var36[var10001] |= 1;
                     var11.m_Mstno = 10;
                     var11.m_Patno = 10;
                     break;
                  case 6:
                     var11.patchg(r);
                  case 8:
                     var11.frameOutCheck(var1);
                  }

                  if (GameState.m_SSonicFlag != 0) {
                     if (var11.m_Mstno == 1) {
                        var11.m_Mstno = 8;
                        var11.m_Patno = 8;
                     }

                     return;
                  }

                  if (var11.m_Mstno != 8) {
                     return;
                  }

                  var11.m_Mstno = 1;
                  var11.m_Patno = 1;
                  break;
               case 45:
                  var2 = (var11 = this).m_Userflag & 255;
                  switch(var11.m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Sprhsize = 8;
                     if (GameState.zoneNumber == 7) {
                        var11.m_Patbase_Table = ab[1];
                     } else if (GameState.zoneNumber == 13) {
                        var11.m_Sprhsize = 8;
                     } else if (GameState.zoneNumber == 15) {
                        var11.m_Sprhsize = 8;
                     }

                     var11.m_Actflg |= 4;
                     var11.m_Sprpri = 4;
                     var11.m_Reserve[1] = var11.m_Yposi;
                     var11.m_Patno = var2;
                     var3 = var11.m_Xposi - 512;
                     var13 = var11.m_Xposi + 24;
                     if ((var11.m_Cddat & 1) != 0) {
                        var3 += 488;
                        var13 += 488;
                     }

                     var11.m_Reserve[3] = var3;
                     var11.m_Reserve[4] = var13;
                  case 2:
                     if ((var11.m_Cddat & 1) == 0) {
                        var3 = var11.m_Reserve[3];
                        var13 = var11.m_Xposi;
                        if (var11.m_R_No1 != 0) {
                           var13 = var11.m_Reserve[4];
                        }
                     } else {
                        var3 = var11.m_Xposi;
                        var13 = var11.m_Reserve[4];
                        if (var11.m_R_No1 != 0) {
                           var3 = var11.m_Reserve[3];
                        }
                     }

                     var14 = var11.m_Reserve[1] - 32;
                     var18 = var11.m_Reserve[1] + 32;
                     var11.m_R_No1 = 0;
                     var7 = var1.getSonicAction();
                     if (var3 <= var7.m_Xposi && var13 > var7.m_Xposi && var14 <= var7.m_Yposi && var18 > var7.m_Yposi && (var7.m_PlayerFlag & 128) == 0) {
                        var11.m_R_No1 += 2;
                     }

                     if ((var15 = var1.getSonicAction()) != null && var3 <= var15.m_Xposi && var13 > var15.m_Xposi && var14 <= var15.m_Yposi && var18 > var15.m_Yposi && (var15.m_PlayerFlag & 128) == 0) {
                        var11.m_R_No1 += 2;
                     }

                     if (var11.m_R_No1 != 0) {
                        if (var11.m_Reserve[0] != 64) {
                           var36 = var11.m_Reserve;
                           var36[0] += 8;
                           var11.m_Yposi = var11.m_Reserve[1] - var11.m_Reserve[0];
                        }
                     } else if (var11.m_Reserve[0] != 0) {
                        var36 = var11.m_Reserve;
                        var36[0] -= 8;
                        var11.m_Yposi = var11.m_Reserve[1] - var11.m_Reserve[0];
                     }

                     ((GameState)var1).atariRideSub(var11.m_Xposi, var11.m_Yposi, var11.m_Sprhsize + 11, 32, 33, 8, var11);
                     var11.frameOutCheck(var1);
                  default:
                     return;
                  }
               case 46:
                  switch((var11 = this).m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Sproffset = 34432;
                     var11.m_Actflg = 4;
                     var11.m_Sprpri = 3;
                     var11.m_Sprhsize = 8;
                     var11.m_Yspeed = -768;
                     var2 = var11.m_Mstno;
                     ++var2;
                     var11.m_Patno = var2 + 10;
                  case 2:
                     var24 = false;
                     if (var11.m_Yspeed < 0) {
                        var11.speedSet2();
                        var11.m_Yspeed += 24;
                     } else {
                        var11.m_R_No0 += 2;
                        var11.m_Pattim = 29;
                        if (var11.m_Reserve[4] == 0) {
                           var23 = var1.getSonicAction();
                           var24 = false;
                        } else {
                           var23 = var1.getTailsAction();
                           var24 = true;
                        }

                        switch(var11.m_Mstno) {
                        case 0:
                        case 3:
                           if (!var24) {
                              ++GameState.m_PlItem;
                           }

                           var11.togedamagesub(var1, var23);
                           break;
                        case 1:
                        case 8:
                           ++GameState.m_PlItem;
                           var11.a();
                        case 2:
                        default:
                           break;
                        case 4:
                           ++GameState.m_PlItem;
                           if ((GameState.m_PlRing_T += 10) > 999) {
                              GameState.m_PlRing_T = 999;
                           }

                           if ((GameState.m_PlRing += 10) > 999) {
                              GameState.m_PlRing = 999;
                           }

                           GameState.m_PlRing_F |= 1;
                           if (100 <= GameState.m_PlRing) {
                              if ((GameState.m_PlRing_F2 & 2) == 0) {
                                 GameState.m_PlRing_F2 |= 2;
                                 var11.a();
                              } else if (200 <= GameState.m_PlRing && (GameState.m_PlRing_F2 & 4) == 0) {
                                 GameState.m_PlRing_F2 |= 4;
                                 var11.a();
                              }
                           }
                           break;
                        case 5:
                           ++GameState.m_PlItem;
                           var23.m_PlPower |= 4;
                           var23.m_SpeedUpTimer = 1200;
                           GameState.m_PlMaxSpdWk = 3072;
                           GameState.m_PlAddSpdWk = 24;
                           GameState.m_PlRetSpdWk = 128;
                           break;
                        case 6:
                           ++GameState.m_PlItem;
                           var23.m_PlPower |= 1;
                           if (var1.getActionType(56).length == 0) {
                              var1.insertAction(var23, 56);
                           }
                           break;
                        case 7:
                           ++GameState.m_PlItem;
                           if (GameState.m_SSonicFlag == 0) {
                              var23.m_PlPower |= 2;
                              var23.m_MutekiTimer = 1200;
                              if (GameState.m_BossStart == 0 && 12 < var23.m_AirCnt) {
                                 cCanvas.am.bgmset(5);
                              }

                              if (var1.getActionType(53).length == 0) {
                                 var1.insertAction(53);
                              }
                           }
                        }
                     }
                  case 1:
                  case 3:
                  default:
                     break;
                  case 4:
                     --var11.m_Pattim;
                     if (var11.m_Pattim < 0) {
                        var11.frameOut(var1);
                        return;
                     }
                  }

                  if (GameState.m_SSonicFlag != 0) {
                     if (var11.m_Patno == 12) {
                        var11.m_Patno = 19;
                     }

                     return;
                  }

                  if (var11.m_Patno != 19) {
                     return;
                  }

                  var11.m_Patno = 12;
                  break;
               case 49:
                  switch((var11 = this).m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Colino = Z[var11.m_Userflag & 255];
                     var11.m_Sproffset = 34432;
                     var11.m_Actflg = 132;
                     var11.m_Sprhsize = 128;
                     var11.m_Sprpri = 4;
                     var11.m_Patno = var11.m_Userflag & 255;
                  case 2:
                     var11.frameOutCheck(var1);
                  default:
                     return;
                  }
               case 50:
                  switch((var11 = this).m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     if (GameState.zoneNumber != 13) {
                        var11.m_Sprhsize = 24;
                        var11.m_Reserve[6] = 0;
                     } else {
                        var11.m_Patbase_Table = T[5];
                        var11.m_Sprhsize = 16;
                        var11.m_Reserve[6] = 1;
                     }

                     var11.m_Actflg = 4;
                     var11.m_Sprpri = 4;
                  case 2:
                     var11.m_Reserve[5] = GameState.m_EmyScoreCnt;
                     var28 = var1.getSonicAction();
                     var11.m_Reserve[1] = var28.m_Mstno;
                     if ((var4 = var1.getTailsAction()) != null) {
                        var11.m_Reserve[2] = var4.m_Mstno;
                     }

                     ((GameState)var1).atariRideSub(var11.m_Xposi, var11.m_Yposi, var11.m_Sprhsize + 11, 16, 17, 8, var11);
                     if ((var2 = var11.m_Cddat & 24) == 0) {
                        var11.frameOutCheck(var1);
                        return;
                     } else {
                        if (var2 == 24) {
                           if (var11.m_Reserve[1] != 2 && var11.m_Reserve[2] != 2) {
                              var11.frameOutCheck(var1);
                              return;
                           }

                           var11.a(var28, var11.m_Reserve[1]);
                           if (var4 != null) {
                              var11.a(var4, var11.m_Reserve[2]);
                           }
                        } else if ((var2 & 8) == 0) {
                           if ((var2 & 16) == 0) {
                              var11.frameOutCheck(var1);
                              return;
                           }

                           if (var4 != null) {
                              if (var11.m_Reserve[2] != 2) {
                                 var11.frameOutCheck(var1);
                                 return;
                              }

                              var11.b((Action)var4, 0);
                           }
                        } else {
                           if (var11.m_Reserve[1] != 2) {
                              var11.frameOutCheck(var1);
                              return;
                           }

                           var11.b((Action)var28, 0);
                        }

                        GameState.m_EmyScoreCnt = var11.m_Reserve[5];
                        var11.m_Cddat &= 231;
                        switch(var11.m_Reserve[6]) {
                        case 0:
                           var11.a(var1, U[1], W, 0);
                           break;
                        case 1:
                           var11.a(var1, U[5], X, 0);
                        }

                        tensuusetsub(var1, var11);
                        break label1332;
                     }
                  case 1:
                  case 3:
                  default:
                     return;
                  case 4:
                     break label1332;
                  }
               case 54:
                  var2 = (var11 = this).m_Userflag & 255;
                  boolean var31 = false;
                  switch(var11.m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Actflg |= 4;
                     var11.m_Sprpri = 4;
                     var11.m_Userflag &= 15;
                     var3 = (var2 & 240) >> 4;
                     var11.m_Sprhsize = y[var3][0];
                     var11.m_Sprvsize = y[var3][1];
                     var11.m_Patno = var3;
                     if (4 <= var11.m_Patno) {
                        var11.m_R_No0 += 2;
                     }

                     if ((var11.m_Cddat & 2) != 0) {
                        var11.m_R_No0 = 6;
                     }

                     var11.m_Reserve[0] = var11.m_Xposi;
                     var11.m_Reserve[1] = var11.m_Yposi;
                     var32 = var11;
                     var3 = var11.m_Sprvsize / 16 * (var11.m_Sprhsize / 16);
                     var11.m_Actflg |= 64;
                     var11.m_Manysprcnt = var3;
                     var11.m_Sprpositbl = new int[var3][4];
                     var13 = 0;

                     for(var14 = 0; var14 < var32.m_Sprvsize / 16; ++var14) {
                        for(var17 = 0; var17 < var32.m_Sprhsize / 16; ++var17) {
                           var2 = var32.m_Xposi - var32.m_Sprhsize + 16 + var17 * 32;
                           var22 = var32.m_Yposi - var32.m_Sprvsize + 16 + var14 * 32;
                           var32.m_Sprpositbl[var13][0] = var2;
                           var32.m_Sprpositbl[var13][1] = var22;
                           var32.m_Sprpositbl[var13][2] = 0;
                           var32.m_Sprpositbl[var13][3] = var32.m_Patno;
                           ++var13;
                        }
                     }

                     return;
                  case 2:
                     var11.c();
                     ((GameState)var1).atariRideSub(var11.m_Xposi, var11.m_Yposi, var11.m_Sprhsize + 11, var11.m_Sprvsize, var11.m_Sprvsize + 1, 8, var11);
                     if ((var11.m_Cddat & 24) != 0) {
                        if ((var11.m_Cddat & 8) != 0) {
                           var11.togedamagesub(var1, var1.getSonicAction());
                        }

                        if ((var11.m_Cddat & 16) != 0) {
                           var11.togedamagesub(var1, var1.getTailsAction());
                        }
                     }

                     var11.frameOutCheckX(var1, var11.m_Reserve[0]);
                     return;
                  case 4:
                     var14 = var11.m_Xposi;
                     var11.c();
                     ((GameState)var1).atariRideSub(var14, var11.m_Yposi, var11.m_Sprhsize + 11, var11.m_Sprvsize, var11.m_Sprvsize + 1, 8, var11);
                     if (((var13 = GameState.m_D6_Tmp >> 16) & 3) != 0) {
                        if ((var13 & 1) != 0) {
                           var11.togedamagesub(var1, var1.getSonicAction());
                           var11.m_Cddat &= -33;
                        }

                        if ((var13 & 2) != 0) {
                           var11.togedamagesub(var1, var1.getTailsAction());
                           var11.m_Cddat &= -65;
                        }
                     }

                     var11.frameOutCheckX(var1, var11.m_Reserve[0]);
                     return;
                  case 6:
                     var11.c();
                     ((GameState)var1).atariRideSub(var11.m_Xposi, var11.m_Yposi, var11.m_Sprhsize + 11, var11.m_Sprvsize, var11.m_Sprvsize + 1, 8, var11);
                     if (((var13 = GameState.m_D6_Tmp >> 16) & 12) != 0) {
                        if ((var13 & 4) != 0) {
                           var11.togedamagesub(var1, var1.getSonicAction());
                        }

                        if ((var13 & 8) != 0) {
                           var11.togedamagesub(var1, var1.getTailsAction());
                        }
                     }

                     var11.frameOutCheckX(var1, var11.m_Reserve[0]);
                  case 1:
                  case 3:
                  case 5:
                  default:
                     return;
                  }
               case 62:
                  var1 = var1;
                  var11 = this;
                  switch(super.m_R_No0) {
                  case 0:
                     super.m_R_No0 = 2;
                     super.m_Reserve[0] = super.m_Yposi;
                     super.m_Actflg = 132;
                     super.m_Sprhsize = 32;
                     super.m_Sprpri = 4;
                     super.m_Patno = 0;
                     super.m_Mstno = 0;
                     Action[] var30 = new Action[3];

                     for(var14 = 0; var14 < 3; ++var14) {
                        var30[var14] = var1.insertAction(var11.m_Actno);
                        if (var30[var14] != null) {
                           var30[var14].m_Actno = var11.m_Actno;
                           var30[var14].m_Xposi = var11.m_Xposi;
                           var30[var14].m_Yposi = var11.m_Yposi;
                           var30[var14].m_Reserve[0] = var11.m_Yposi;
                           var30[var14].m_Actflg = 132;
                           var30[var14].m_Yposi -= G[var14][0];
                           var30[var14].m_Reserve[0] = var30[var14].m_Yposi;
                           var30[var14].m_R_No0 = G[var14][1];
                           var30[var14].m_Sprhsize = G[var14][2];
                           var30[var14].m_Sprpri = G[var14][3];
                           var30[var14].m_Patno = G[var14][4];
                        }
                     }

                     var11.m_ReserveObj = var30;
                     return;
                  case 1:
                  case 3:
                  case 5:
                  case 7:
                  case 9:
                  default:
                     return;
                  case 2:
                     State var33 = var1;
                     var32 = this;
                     if (super.m_ReserveObj != null) {
                        label1401: {
                           switch(super.m_R_No1) {
                           case 0:
                              if ((var28 = ((Action[])((Action[])super.m_ReserveObj))[0]) != null && var28.m_Reserve[1] != 0 && (var4 = ((Action[])((Action[])super.m_ReserveObj))[1]) != null) {
                                 if ((var5 = var1.insertAction(39)) != null) {
                                    var5.m_Actno = 39;
                                    var5.m_R_No0 += 2;
                                    var5.m_Xposi = var4.m_Xposi;
                                    var5.m_Yposi = var4.m_Yposi;
                                 }

                                 var4.m_Yspeed = -1024;
                                 var4.m_Xspeed = 2048;
                                 var4.m_R_No1 += 2;
                                 super.m_Reserve[2] = 30;
                                 super.m_R_No1 += 2;
                              }
                           case 1:
                           case 3:
                           case 4:
                           default:
                              break label1401;
                           case 2:
                              if (--super.m_Reserve[2] >= 0) {
                                 break label1401;
                              }

                              super.m_Mstno = 1;
                              var22 = 154;
                              var2 = -28;
                              var3 = 0;
                           }

                           for(; var3 < 8; ++var3) {
                              if ((var4 = var33.insertAction(40)) != null) {
                                 var4.m_Actno = 40;
                                 var4.m_Xposi = var32.m_Xposi;
                                 var4.m_Yposi = var32.m_Yposi;
                                 var4.m_Xposi += var2;
                                 var4.m_Reserve[4] = 1;
                                 var2 += 7;
                                 var4.m_Reserve[3] = var22;
                                 var22 -= 8;
                              }
                           }

                           if ((var28 = ((Action[])((Action[])var32.m_ReserveObj))[2]) != null) {
                              var28.m_Pattim = 180;
                              var28.m_R_No1 += 2;
                              var32.m_R_No1 += 2;
                           }
                        }
                     }

                     ((GameState)var1).atariRideSub(super.m_Xposi, super.m_Yposi, 43, 24, 24, 8, this);
                     this.patchg(F);
                     this.frameOutCheck(var1);
                     return;
                  case 4:
                     ((GameState)var1).atariRideSub(super.m_Xposi, super.m_Yposi, 27, 8, 8, 8, this);
                     super.m_Yposi = super.m_Reserve[0];
                     if ((super.m_Cddat & 24) != 0) {
                        super.m_Yposi += 8;
                        GameState.m_PlTime_F = 0;
                        super.m_Reserve[1] = 1;
                        GameState.m_Accept_Softkey = 2;
                        State.setSoftKey(256, (String)null);
                        State.setSoftKey(512, (String)null);
                     }

                     this.frameOutCheck(var1);
                     return;
                  case 6:
                     if (super.m_R_No1 != 0) {
                        if ((super.m_Actflg & 128) == 0) {
                           this.frameOut(var1);
                           return;
                        }

                        this.speedSet();
                     }

                     this.frameOutCheck(var1);
                     return;
                  case 8:
                     if (super.m_R_No1 == 0 || --super.m_Pattim != 0) {
                        return;
                     }

                     super.m_R_No0 += 2;
                     super.m_Pattim = 180;
                     return;
                  case 10:
                     if (var1.countAction(40) == 0) {
                        this.d(var1);
                        this.frameOut(var1);
                     }

                     return;
                  }
               case 64:
                  var2 = (var11 = this).m_Userflag & 255;
                  switch(var11.m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Patno = 0;
                     var11.m_Actflg |= 4;
                     var11.m_Sprhsize = 28;
                     var11.m_Sprpri = 4;
                     var11.m_Cddat |= 128;
                     var11.m_Reserve[0] = (var2 & 2) == 0 ? -1024 : -2560;
                  case 2:
                     var11.patchg(I);
                     var28 = var1.getSonicAction();
                     if (var11.m_Patno == 0) {
                        ((GameState)var1).atariRideSub_t2(var11.m_Xposi, var11.m_Yposi, 39, 8, 0, 8, var11, var28, K);
                     } else {
                        ((GameState)var1).atariRideSub_t2(var11.m_Xposi, var11.m_Yposi, 39, 8, 0, 8, var11, var28, L);
                     }

                     if ((var11.m_Cddat & 8) != 0) {
                        var11.f(var28);
                     }

                     if ((var4 = var1.getTailsAction()) != null) {
                        if (var11.m_Patno == 0) {
                           ((GameState)var1).atariRideSub_t2(var11.m_Xposi, var11.m_Yposi, 39, 8, 0, 16, var11, var4, K);
                        } else {
                           ((GameState)var1).atariRideSub_t2(var11.m_Xposi, var11.m_Yposi, 39, 8, 0, 16, var11, var4, L);
                        }

                        if ((var11.m_Cddat & 16) != 0) {
                           var11.f(var4);
                        }
                     }
                  default:
                     var11.frameOutCheck(var1);
                     return;
                  }
               case 65:
                  var2 = (var11 = this).m_Userflag & 255;
                  switch(var11.m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Actflg |= 4;
                     var11.m_Sprhsize = 16;
                     var11.m_Sprpri = 4;
                     switch(var2 >> 4 & 7) {
                     case 0:
                     default:
                        break;
                     case 1:
                        var11.m_R_No0 = 4;
                        var11.m_Mstno = 2;
                        var11.m_Patno = 3;
                        var11.m_Sprhsize = 8;
                        break;
                     case 2:
                        var11.m_R_No0 = 6;
                        var11.m_Patno = 6;
                        var11.m_Cddat |= 2;
                        break;
                     case 3:
                        var11.m_R_No0 = 8;
                        var11.m_Mstno = 4;
                        var11.m_Patno = 7;
                        break;
                     case 4:
                        var11.m_R_No0 = 10;
                        var11.m_Mstno = 4;
                        var11.m_Patno = 10;
                        var11.m_Cddat |= 2;
                     }

                     var11.m_Reserve[0] = (var2 & 2) == 0 ? -4096 : -2560;
                     if ((var2 & 2) != 0) {
                        var11.m_Sproffset |= 32;
                        var11.m_Patbase_Table = t;
                     }
                  case 1:
                  case 3:
                  case 5:
                  case 7:
                  case 9:
                  default:
                     break;
                  case 2:
                     var23 = var1.getSonicAction();
                     ((GameState)var1).atariRideSub3(var11.m_Xposi, 27, 8, 16, 8, var11, var23);
                     if ((var11.m_Cddat & 8) != 0) {
                        var11.a(var23);
                     }

                     if ((var7 = var1.getTailsAction()) != null) {
                        ((GameState)var1).atariRideSub3(var11.m_Xposi, 27, 8, 16, 16, var11, var7);
                        if ((var11.m_Cddat & 16) != 0) {
                           var11.a(var7);
                        }
                     }

                     var11.patchg(u);
                     break;
                  case 4:
                     var23 = var1.getSonicAction();
                     ((GameState)var1).atariRideSub3(var11.m_Xposi, 19, 14, 15, 8, var11, var23);
                     if ((var11.m_Cddat & 32) != 0) {
                        var13 = var11.m_Cddat;
                        if (var11.m_Xposi - var23.m_Xposi >= 0) {
                           var13 ^= 1;
                        }

                        if ((var13 & 1) == 0) {
                           var11.b(var23);
                        }
                     }

                     if ((var7 = var1.getTailsAction()) != null) {
                        ((GameState)var1).atariRideSub3(var11.m_Xposi, 19, 14, 15, 16, var11, var7);
                        if ((var11.m_Cddat & 64) != 0) {
                           var13 = var11.m_Cddat;
                           if (var11.m_Xposi - var23.m_Xposi >= 0) {
                              var13 ^= 1;
                           }

                           if ((var13 & 1) == 0) {
                              var11.b(var7);
                           }
                        }
                     }

                     if (var11.m_Mstno != 3) {
                        var13 = var3 = var11.m_Xposi;
                        var13 += 40;
                        if ((var11.m_Cddat & 1) != 0) {
                           var13 = var3;
                           var3 -= 40;
                        }

                        var17 = var14 = var11.m_Yposi;
                        var14 -= 24;
                        var17 += 24;
                        Action var25;
                        if (((var25 = var1.getSonicAction()).m_Cddat & 2) == 0) {
                           var18 = var25.m_Mspeed;
                           if ((var11.m_Cddat & 1) != 0) {
                              var18 = -var18;
                           }

                           if (var18 >= 0 && var3 <= var25.m_Xposi && var13 > var25.m_Xposi && var14 <= var25.m_Yposi && var17 > var25.m_Yposi) {
                              var11.b(var25);
                              var3 = var3;
                           }
                        }

                        Action var26;
                        if ((var26 = var1.getTailsAction()) != null && (var26.m_Cddat & 2) == 0) {
                           var18 = var26.m_Mspeed;
                           if ((var11.m_Cddat & 1) != 0) {
                              var18 = -var18;
                           }

                           if (var18 >= 0 && var3 <= var26.m_Xposi && var13 > var26.m_Xposi && var14 <= var26.m_Yposi && var17 > var26.m_Yposi) {
                              var11.b(var26);
                           }
                        }
                     }

                     var11.patchg(u);
                     break;
                  case 6:
                     var23 = var1.getSonicAction();
                     ((GameState)var1).atariRideSub3(var11.m_Xposi, 27, 8, 16, 8, var11, var23);
                     if (GameState.m_D4_Tmp == -2) {
                        var11.c(var23);
                     }

                     if ((var7 = var1.getTailsAction()) != null) {
                        ((GameState)var1).atariRideSub3(var11.m_Xposi, 27, 8, 16, 16, var11, var7);
                        if (GameState.m_D4_Tmp == -2) {
                           var11.c(var7);
                        }
                     }

                     var11.patchg(u);
                     break;
                  case 8:
                     var23 = var1.getSonicAction();
                     ((GameState)var1).atariRideSub_t2(var11.m_Xposi, var11.m_Yposi, 27, 16, 0, 8, var11, var23, v);
                     if ((var11.m_Cddat & 8) != 0) {
                        var11.d(var23);
                     }

                     if ((var7 = var1.getTailsAction()) != null) {
                        ((GameState)var1).atariRideSub_t2(var11.m_Xposi, var11.m_Yposi, 27, 16, 0, 16, var11, var7, v);
                        if ((var11.m_Cddat & 16) != 0) {
                           var11.d(var7);
                        }
                     }

                     var11.patchg(u);
                     break;
                  case 10:
                     var23 = var1.getSonicAction();
                     if (((GameState)var1).atariRideSub_t2(var11.m_Xposi, var11.m_Yposi, 27, 16, 0, 8, var11, var23, w) == -2) {
                        var11.e(var23);
                     }

                     if ((var7 = var1.getTailsAction()) != null && ((GameState)var1).atariRideSub_t2(var11.m_Xposi, var11.m_Yposi, 27, 16, 0, 16, var11, var7, w) == -2) {
                        var11.e(var23);
                     }

                     var11.patchg(u);
                  }

                  var11.frameOutCheck(var1);
                  return;
               case 88:
                  switch((var11 = this).m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Sproffset = 34176;
                     var11.m_Actflg = 4;
                     var11.m_Sprpri = 0;
                     var11.m_Colino = 0;
                     var11.m_Sprhsize = 12;
                     var11.m_Pattim = 7;
                     var11.m_Patno = 0;
                     return;
                  case 2:
                     if (--var11.m_Pattim < 0) {
                        var11.m_Pattim = 7;
                        ++var11.m_Patno;
                        if (var11.m_Patno == 7) {
                           var11.frameOut(var1);
                        }
                     }
                  default:
                     return;
                  }
               case 107:
                  var2 = (var11 = this).m_Userflag & 255;
                  switch(var11.m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Actflg = 4;
                     var11.m_Sprpri = 3;
                     var3 = var2 >> 4 & 15;
                     var11.m_Sprhsize = P[var3][0];
                     var11.m_Sprvsize = P[var3][1];
                     var11.m_Patno = P[var3][2];
                     var11.m_Reserve[3] = var11.m_Xposi;
                     var11.m_Reserve[1] = var11.m_Yposi;
                     var11.m_Reserve[0] = var11.m_Cddat;
                     if ((var3 = (var11.m_Userflag & 15) - 8) >= 0 && GameState.m_SysdirSpd[var3 + 10] < 0) {
                        var36 = var11.m_Reserve;
                        var36[0] ^= 1;
                     }
                  case 2:
                     var13 = var11.m_Xposi;
                     short var29;
                     switch(var18 = var11.m_Userflag & 15) {
                     case 0:
                     default:
                        break;
                     case 1:
                     case 2:
                        if (var18 == 1) {
                           var29 = 64;
                           var17 = GameState.m_Sysdirec[2] >> 24;
                        } else {
                           var29 = 128;
                           var17 = GameState.m_Sysdirec[7] >> 24;
                        }

                        if ((var11.m_Cddat & 1) != 0) {
                           var17 = (var17 = -var17) + var29;
                        }

                        var11.m_Xposi = var11.m_Reserve[3] - var17;
                        break;
                     case 3:
                     case 4:
                        if (var18 == 3) {
                           var29 = 64;
                           var17 = GameState.m_Sysdirec[2] >> 24;
                        } else {
                           var29 = 128;
                           var17 = GameState.m_Sysdirec[7] >> 24;
                        }

                        if ((var11.m_Cddat & 1) != 0) {
                           var17 = (var17 = -var17) + var29;
                        }

                        var11.m_Yposi = var11.m_Reserve[1] - var17;
                        break;
                     case 5:
                        var11.m_Yposi = var11.m_Reserve[1] + (GameState.m_Sysdirec[0] >> 25);
                        if ((var11.m_Cddat & 24) != 0) {
                           ++var11.m_Userflag;
                        }
                        break;
                     case 6:
                        var11.setYposi(var11.getYposi() + (var11.m_Yspeed << 8));
                        var11.m_Yspeed += 8;
                        if (var11.m_Yposi > GameState.m_ScrALim_Down + 14) {
                           var11.m_Userflag = 0;
                        }
                        break;
                     case 7:
                        if (var11.m_Reserve[5] == 0) {
                           if ((var11.m_Cddat & 24) == 0) {
                              break;
                           }

                           var11.m_Reserve[5] = 8;
                        }

                        var11.speedSet2();
                        var11.m_Yposi &= 2047;
                        if (var11.m_Yspeed == 680) {
                           var11.m_Reserve[5] = -var11.m_Reserve[5];
                        }

                        var11.m_Yspeed += var11.m_Reserve[5];
                        if (var11.m_Yspeed == 0) {
                           var11.m_Userflag = 0;
                        }
                        break;
                     case 8:
                     case 9:
                     case 10:
                     case 11:
                        if (var18 == 8) {
                           var20 = 16;
                           var17 = GameState.m_Sysdirec[10] >> 25;
                           var3 = GameState.m_SysdirSpd[10] >> 16;
                        } else if (var18 == 9) {
                           var20 = 48;
                           var17 = GameState.m_Sysdirec[11] >> 24;
                           var3 = GameState.m_SysdirSpd[11] >> 16;
                        } else if (var18 == 10) {
                           var20 = 80;
                           var17 = GameState.m_Sysdirec[12] >> 24;
                           var3 = GameState.m_SysdirSpd[12] >> 16;
                        } else {
                           var20 = 112;
                           var17 = GameState.m_Sysdirec[13] >> 24;
                           var3 = GameState.m_SysdirSpd[13] >> 16;
                        }

                        if (var3 == 0) {
                           if ((var11.m_Cddat & 1) == 0) {
                              var10002 = var11.m_Reserve[0]++;
                           } else {
                              var10002 = var11.m_Reserve[0]--;
                           }

                           var36 = var11.m_Reserve;
                           var36[0] &= 3;
                        }

                        if ((var22 = var11.m_Reserve[0] & 3) == 0) {
                           var17 -= var20;
                           var11.m_Xposi = var11.m_Reserve[3] + var17;
                           var2 = -var20;
                           var11.m_Yposi = var11.m_Reserve[1] + var2;
                        } else if (var22 == 1) {
                           var2 = var20 - 1;
                           var17 = -(var17 - var2);
                           var11.m_Yposi = var11.m_Reserve[1] + var17;
                           ++var2;
                           var11.m_Xposi = var11.m_Reserve[3] + var2;
                        } else if (var22 == 2) {
                           var2 = var20 - 1;
                           var17 = -(var17 - var2);
                           var11.m_Xposi = var11.m_Reserve[3] + var17;
                           ++var2;
                           var11.m_Yposi = var11.m_Reserve[1] + var2;
                        } else if (var22 == 3) {
                           var17 -= var20;
                           var11.m_Yposi = var11.m_Reserve[1] + var17;
                           var2 = -var20;
                           var11.m_Xposi = var11.m_Reserve[3] + var2;
                        }
                     }

                     ((GameState)var1).atariRideSub(var13, var11.m_Yposi, var11.m_Sprhsize + 11, var11.m_Sprvsize, var11.m_Sprvsize + 1, 8, var11);
                     var11.frameOutCheckX(var1, var11.m_Reserve[3]);
                  default:
                     return;
                  }
               case 114:
                  switch((var11 = this).m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Reserve[3] = 48;
                     if ((var11.m_Userflag & 128) != 0) {
                        var11.m_Reserve[3] = 112;
                     }

                     var11.m_Reserve[1] = (var11.m_Userflag & 127) << 4;
                     if ((var11.m_Cddat & 1) == 0) {
                        var11.m_Reserve[0] = 2;
                     } else {
                        var11.m_Reserve[0] = -2;
                     }
                  case 2:
                     var11.i(var1.getSonicAction());
                     var11.i(var1.getTailsAction());
                     var11.frameOutCheckN(var1);
                  default:
                     return;
                  }
               case 116:
                  var2 = (var11 = this).m_Userflag & 255;
                  switch(var11.m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Sproffset = 34432;
                     var11.m_Actflg |= 4;
                     var11.m_Sprhsize = (var2 & 240) + 16 >> 1;
                     var11.m_Sprvsize = (var2 & 15) + 1 << 3;
                     if (GameState.zoneNumber == 13 && var11.m_Xposi == 4672 && var11.m_Yposi == 1068) {
                        var11.m_Sprhsize += 32;
                     }
                  case 2:
                     ((GameState)var1).atariRideSub2(var11.m_Xposi, var11.m_Yposi, var11.m_Sprhsize + 11, var11.m_Sprvsize, var11.m_Sprvsize + 1, 8, var11, var1.getSonicAction());
                     var11.frameOutCheck(var1);
                  default:
                     return;
                  }
               case 121:
                  label1324: {
                     var2 = (var11 = this).m_Userflag & 255;
                     switch(var11.m_R_No0) {
                     case 0:
                        var11.m_R_No0 += 2;
                        var11.m_Actflg = 4;
                        var11.m_Sprhsize = 8;
                        var11.m_Sprpri = 5;
                        if ((GameState.m_FlagWorkCnt[2 + var11.m_Cdsts] & 1) != 0 || (var2 & 127) <= (GameState.m_PlFlag & 127)) {
                           var36 = GameState.m_FlagWorkCnt;
                           var10001 = 2 + var11.m_Cdsts;
                           var36[var10001] |= 1;
                           var11.m_Mstno = 2;
                        }
                     case 2:
                        var8 = var1.getSonicAction();
                        int var9 = GameState.m_PlFlag;
                        if (var8 != null) {
                           var9 &= 127;
                           if ((var11.m_Userflag & 127) <= var9) {
                              if (var11.m_Mstno == 0) {
                                 var11.m_Mstno = 2;
                              }
                           } else {
                              int var10 = var8.m_Xposi - var11.m_Xposi + 8;
                              if (16 > (var10 & '\uffff')) {
                                 var10 = var8.m_Yposi - var11.m_Yposi + 64;
                                 if (104 > (var10 & '\uffff')) {
                                    if ((var15 = var1.insertAction(121)) != null) {
                                       var15.m_Actno = 121;
                                       var15.m_R_No0 = 6;
                                       var15.m_Reserve[0] = var11.m_Xposi;
                                       var15.m_Reserve[1] = var11.m_Yposi - 20;
                                       var15.m_Sproffset = var11.m_Sproffset;
                                       var15.m_Actflg = 4;
                                       var15.m_Sprhsize = 8;
                                       var15.m_Sprpri = 4;
                                       var15.m_Patno = 2;
                                       var15.m_Reserve[3] = 32;
                                       var15.m_ReserveObj = var11;
                                       if (7 != GameState.m_ChaosCnt && 100 <= GameState.m_PlRing) {
                                          State var21 = var1;
                                          CommonAction var16 = var11;
                                          var13 = 0;

                                          for(var18 = 0; var18 < 4; ++var18) {
                                             if ((var8 = var21.insertAction(var16, var16.m_Actno)) != null) {
                                                var8.m_Actno = 121;
                                                var8.m_Actflg = 4;
                                                var8.m_R_No0 = 8;
                                                var9 = var16.m_Xposi;
                                                var8.m_Xposi = var9;
                                                var8.m_Reserve[5] = var9;
                                                var9 = var16.m_Yposi - 48;
                                                var8.m_Yposi = var9;
                                                var8.m_Reserve[6] = var9;
                                                var8.m_Sprpri = var16.m_Sprpri;
                                                var8.m_Sprhsize = 8;
                                                var8.m_Patno = 1;
                                                var8.m_Xspeed = -1024;
                                                var8.m_Yspeed = 0;
                                                var8.m_Reserve[7] = var13;
                                                var13 += 64;
                                             }
                                          }
                                       }
                                    }

                                    var11.m_Mstno = 1;
                                    ((GameState)var1).playSaves(var11);
                                    var36 = GameState.m_FlagWorkCnt;
                                    var10001 = 2 + var11.m_Cdsts;
                                    var36[var10001] |= 1;
                                 }
                              }
                           }
                        }
                        break label1324;
                     case 1:
                     case 3:
                     case 5:
                     case 7:
                     default:
                        break;
                     case 4:
                        break label1324;
                     case 6:
                        var10002 = var11.m_Reserve[3]--;
                        if (var11.m_Reserve[3] < 0) {
                           if ((var8 = (Action)var11.m_ReserveObj) != null && var8.m_Actno == 121) {
                              var8.m_Mstno = 2;
                              var8.m_Patno = 0;
                           }

                           var11.frameOut(var1);
                        } else {
                           var22 = var11.m_Direc;
                           var11.m_Direc -= 16;
                           var22 -= 64;
                           var2 = Utilities.sinset(var22);
                           var3 = Utilities.cosset(var22) * 3072 >> 16;
                           var11.m_Xposi = var11.m_Reserve[0] + var3;
                           var2 = var2 * 3072 >> 16;
                           var11.m_Yposi = var11.m_Reserve[1] + var2;
                           var11.frameOutCheck(var1);
                        }

                        return;
                     case 8:
                        if (var11.m_Colicnt != 0) {
                           if (Math.abs((var8 = var1.getSonicAction()).m_Xposi - var11.m_Xposi) < 16 && Math.abs(var8.m_Yposi - var11.m_Yposi) < 16 && var11.m_Reserve[2] == 0) {
                              Action[] var19 = var1.getActionType(121);

                              for(var13 = 0; var13 < var19.length; ++var13) {
                                 var19[var13].m_Reserve[2] = 1;
                              }

                              ((GameState)var1).intoSPGame();
                              var11.frameOut(var1);
                              return;
                           }

                           var11.m_Colicnt = 0;
                        }

                        var36 = var11.m_Reserve;
                        var36[7] += 10;
                        var2 = Utilities.sinset(var22 = var11.m_Reserve[7]) >> 5;
                        var3 = Utilities.cosset(var22) >> 3;
                        var13 = (var11.m_Reserve[7] & 992) >> 5;
                        var14 = var3;
                        var18 = 0;
                        var17 = 2;
                        if (16 < var13) {
                           var3 = -var3;
                        }

                        var13 &= 15;
                        if (8 < var13) {
                           var13 = -var13 & 7;
                        }

                        do {
                           if ((var13 >>= 1) != 0) {
                              var18 += var3;
                           }

                           var3 <<= 1;
                           --var17;
                        } while(var17 >= 0);

                        var18 >>= 4;
                        var2 += var18;
                        var10002 = var11.m_Reserve[8]++;
                        var3 = var11.m_Reserve[8];
                        if (128 == var3) {
                           var11.m_Colino = 216;
                        }

                        label1300: {
                           if (128 <= var3) {
                              if (384 >= var3) {
                                 break label1300;
                              }

                              var3 = -var3;
                              var3 += 512;
                              if (var3 < 0) {
                                 var11.frameOut(var1);
                                 return;
                              }
                           }

                           var2 *= var3;
                           var14 *= var3;
                           var2 >>= 7;
                           var14 >>= 7;
                        }

                        var11.m_Xposi = var11.m_Reserve[5] + var14;
                        var11.m_Yposi = var11.m_Reserve[6] + var2;
                        ++var11.m_Patcnt;
                        if ((var2 = (var11.m_Patcnt & 6) >> 1) == 3) {
                           var2 = 1;
                        }

                        var11.m_Patno = var2 + 5;
                        var11.frameOutCheck(var1);
                     }

                     return;
                  }

                  var11.patchg(p);
                  var11.frameOutCheck(var1);
                  break;
               case 122:
                  var1 = var1;
                  var11 = this;
                  var2 = super.m_Userflag & 255;
                  Object var6 = null;
                  switch(super.m_R_No0) {
                  case 0:
                     super.m_R_No0 += 2;
                     super.m_Sproffset = 58392;
                     if (GameState.zoneNumber == 11) {
                        super.m_Patbase_Table = R;
                     }

                     var14 = (super.m_Userflag & 127) / 6;
                     short var12 = S[var14][0];

                     for(var17 = 0; var17 < var12; ++var17) {
                        if (var17 == 0) {
                           var6 = var11;
                        } else if ((var6 = var1.insertAction(var11, var11.m_Actno)) != null) {
                           ((Action)var6).m_Actno = var11.m_Actno;
                           ((Action)var6).m_R_No0 = 4;
                           ((Action)var6).m_Xposi = var11.m_Xposi;
                           ((Action)var6).m_Yposi = var11.m_Yposi;
                           ((Action)var6).m_Sproffset = var11.m_Sproffset;
                        }

                        ((Action)var6).m_Actflg = 4;
                        ((Action)var6).m_Sprpri = 4;
                        ((Action)var6).m_Sprhsize = 24;
                        ((Action)var6).m_Reserve[0] = var11.m_Xposi;
                     }

                     if (var6 != null) {
                        ((Action)var6).m_ReserveObj = var11;
                     }

                     var11.m_ReserveObj = var6;
                     if (var2 == 12) {
                        var11.m_Reserve[3] = 1;
                     }

                     var12 = S[var14][1];
                     var3 = var11.m_Reserve[0] - var12;
                     var11.m_Reserve[1] = var3;
                     if (var6 != null) {
                        ((Action)var6).m_Reserve[1] = var3;
                     }

                     var3 += var12 + var12;
                     var11.m_Reserve[2] = var3;
                     if (var6 != null) {
                        ((Action)var6).m_Reserve[2] = var3;
                     }

                     var11.m_Xposi += S[var14][2];
                     if (var6 != null) {
                        ((Action)var6).m_Xposi += S[var14][3];
                     }
                  case 2:
                     var11.e(var1);
                     return;
                  case 1:
                  case 3:
                  case 5:
                  default:
                     return;
                  case 4:
                     this.e(var1);
                     if ((var7 = (Action)super.m_ReserveObj) == null || super.m_Xposi - 24 != var7.m_Xposi + 24) {
                        return;
                     }

                     var36 = super.m_Reserve;
                     var36[3] ^= 1;
                     var36 = var7.m_Reserve;
                     var36[3] ^= 1;
                     this.g((Action)this);
                     this.g(var7);
                     return;
                  case 6:
                     if (--super.m_Reserve[5] < 0) {
                        super.m_R_No0 = super.m_Reserve[4];
                     }

                     ((GameState)var1).rideChkSub(super.m_Xposi, super.m_Yposi, super.m_Sprhsize, super.m_Sprvsize, 0, 8, this);
                     return;
                  }
               case 132:
                  switch((var11 = this).m_R_No0) {
                  case 0:
                     var11.m_R_No0 += 2;
                     var11.m_Actflg |= 4;
                     var11.m_Sprhsize = 16;
                     var11.m_Sprpri = 5;
                     if (((var2 = var11.m_Userflag & 255) & 4) != 0) {
                        var11.m_R_No0 += 2;
                        var2 &= 7;
                        var11.m_Reserve[0] = aa[var2 & 3];
                        var3 = var11.m_Yposi;
                        if (((GameState)var1).getSonicAction().m_Yposi > var3) {
                           var11.m_Reserve[1] = 1;
                        }

                        if ((var5 = ((GameState)var1).getTailsAction()) != null && var5.m_Yposi > var3) {
                           var11.m_Reserve[2] = 1;
                        }

                        var11.f(var1);
                        break;
                     } else {
                        var11.m_Reserve[0] = aa[var2 & 3];
                        var3 = var11.m_Xposi;
                        if (((GameState)var1).getSonicAction().m_Xposi > var3) {
                           var11.m_Reserve[1] = 1;
                        }

                        if ((var5 = ((GameState)var1).getTailsAction()) != null && var5.m_Xposi > var3) {
                           var11.m_Reserve[2] = 1;
                        }
                     }
                  case 2:
                     var11.rollcmove_sub(((GameState)var1).getSonicAction(), 1, var11.m_Xposi);
                     if ((var4 = ((GameState)var1).getTailsAction()) != null) {
                        if (((PlayerAction)var4).m_PLAY20_Automode != 4) {
                           var11.rollcmove_sub(var4, 2, var11.m_Xposi);
                        } else {
                           var4.m_BallMode = 0;
                        }
                     }
                  case 1:
                  case 3:
                  default:
                     break;
                  case 4:
                     var11.f(var1);
                  }

                  var11.frameOutCheckN(var1);
                  return;
               }

               return;
            }

            var11.frameOutCheckN(var1);
            return;
         }

         var11.speedSet2();
         var11.m_Yspeed += 24;
         if ((var11.m_Actflg & 128) == 0) {
            var11.frameOut(var1);
         }

         return;
      }

      var11.patchg(C);
      var11.frameOutCheck(var1);
   }

   public void render(Graphics var1) {
   }

   public static void prepareImages() {
      loadImages(65);
      loadImages(38);
      loadImages(88);
      loadImages(24);
      loadImages(28);
      loadImages(64);
      loadImages(25);
      loadImages(107);
      loadImages(122);
      loadImages(31);
      loadImages(45);
      loadImages(21);
      loadImages(121);
      loadImages(54);
      loadImages(13);
      loadImages(62);
   }

   private void a(State var1) {
      this.b(var1, var1.getSonicAction(), e);
      this.b(var1, var1.getTailsAction(), f);
   }

   private void a(State var1, Action var2, int var3) {
      if (var2 != null) {
         int var4 = super.m_Userflag & 255;
         if (super.m_Reserve[var3] == 0) {
            if (var2.m_Xposi >= super.m_Xposi) {
               super.m_Reserve[var3] = 1;
               if (super.m_Yposi - super.m_Reserve[d] <= var2.m_Yposi) {
                  if (super.m_Yposi + super.m_Reserve[d] > var2.m_Yposi) {
                     if ((var4 & 128) == 0 || (var2.m_Cddat & 2) == 0) {
                        if ((super.m_Actflg & 1) == 0) {
                           var2.m_Rideonwk = 4096;
                           var2.m_Hitcolwk = 8192;
                           if ((var4 & 8) != 0) {
                              var2.m_Rideonwk = 16384;
                              var2.m_Hitcolwk = 32768;
                           }
                        }

                        if ((var4 & 32) == 0) {
                           var2.m_Sproffset &= 32767;
                        } else {
                           var2.m_Sproffset |= 32768;
                        }
                     }
                  }
               }
            }
         } else if (var2.m_Xposi < super.m_Xposi) {
            super.m_Reserve[var3] = 0;
            if (super.m_Yposi - super.m_Reserve[d] <= var2.m_Yposi) {
               if (super.m_Yposi + super.m_Reserve[d] > var2.m_Yposi) {
                  if ((var4 & 128) == 0 || (var2.m_Cddat & 2) == 0) {
                     if ((super.m_Actflg & 1) == 0) {
                        var2.m_Rideonwk = 4096;
                        var2.m_Hitcolwk = 8192;
                        if ((var4 & 16) != 0) {
                           var2.m_Rideonwk = 16384;
                           var2.m_Hitcolwk = 32768;
                        }
                     }

                     if ((var4 & 64) == 0) {
                        var2.m_Sproffset &= 32767;
                     } else {
                        var2.m_Sproffset |= 32768;
                     }
                  }
               }
            }
         }
      }
   }

   private void b(State var1, Action var2, int var3) {
      if (var2 != null) {
         int var4 = super.m_Userflag & 255;
         if (super.m_Reserve[var3] == 0) {
            if (var2.m_Yposi >= super.m_Yposi) {
               super.m_Reserve[var3] = 1;
               if (super.m_Xposi - super.m_Reserve[d] <= var2.m_Xposi) {
                  if (super.m_Xposi + super.m_Reserve[d] > var2.m_Xposi) {
                     if ((var4 & 128) == 0 || (var2.m_Cddat & 2) == 0) {
                        if ((super.m_Actflg & 1) == 0) {
                           var2.m_Rideonwk = 4096;
                           var2.m_Hitcolwk = 8192;
                           if ((var4 & 8) != 0) {
                              var2.m_Rideonwk = 16384;
                              var2.m_Hitcolwk = 32768;
                           }
                        }

                        if ((var4 & 32) == 0) {
                           var2.m_Sproffset &= 32767;
                        } else {
                           var2.m_Sproffset |= 32768;
                        }
                     }
                  }
               }
            }
         } else if (var2.m_Yposi < super.m_Yposi) {
            super.m_Reserve[var3] = 0;
            if (super.m_Xposi - super.m_Reserve[d] <= var2.m_Xposi) {
               if (super.m_Xposi + super.m_Reserve[d] > var2.m_Xposi) {
                  if ((var4 & 128) == 0 || (var2.m_Cddat & 2) == 0) {
                     if ((super.m_Actflg & 1) == 0) {
                        var2.m_Rideonwk = 4096;
                        var2.m_Hitcolwk = 8192;
                        if ((var4 & 16) != 0) {
                           var2.m_Rideonwk = 16384;
                           var2.m_Hitcolwk = 32768;
                        }
                     }

                     if ((var4 & 64) == 0) {
                        var2.m_Sproffset &= 32767;
                     } else {
                        var2.m_Sproffset |= 32768;
                     }
                  }
               }
            }
         }
      }
   }

   private void a(State var1, int var2) {
      byte var3;
      Action var4;
      if (var2 == 0) {
         var4 = var1.getSonicAction();
         var3 = 8;
      } else {
         if ((var4 = var1.getTailsAction()) == null) {
            return;
         }

         var3 = 16;
      }

      if ((super.m_Cddat & var3) != 0) {
         var2 = var4.m_Xposi - super.m_Xposi + 208;
         if (1536 > Math.abs(var4.m_Mspeed) || (var4.m_Cddat & 2) != 0 || var2 < 0 || 416 <= var2) {
            var4.m_Cddat &= -9;
            super.m_Cddat &= ~var3;
            var4.m_DirecCnt = 0;
            var4.m_DirecSpd = 4;
            return;
         }

         if ((var4.m_Cddat & 8) != 0) {
            int var5 = super.m_Yposi + j[var2];
            var4.m_Yposi = var5 - (var4.m_Sprvs - 19);
            var4.m_Direc1 = k[var2 >> 3 & 63];
            return;
         }
      } else if ((var4.m_Cddat & 2) == 0) {
         if ((var4.m_Cddat & 8) == 0) {
            var2 = var4.m_Xposi - super.m_Xposi;
            if (var4.m_Xspeed >= 0) {
               if (-192 < var2 || -208 > var2) {
                  return;
               }
            } else if (192 > var2 || 208 < var2) {
               return;
            }

            var2 = var4.m_Yposi - super.m_Yposi - 16;
            if (48 > var2 && var4.m_PlayerFlag == 0) {
               ((GameState)var1).rideonSet(var3, this, var4);
            }

            return;
         }

         var2 = var4.m_Xposi - super.m_Xposi;
         if (var4.m_Xspeed >= 0) {
            if (-176 < var2 || -192 > var2) {
               return;
            }
         } else if (176 > var2 || 192 < var2) {
            return;
         }

         var2 = var4.m_Yposi - super.m_Yposi - 16;
         if (48 > var2) {
            ((GameState)var1).rideonSet(var3, this, var4);
         }
      }

   }

   private void b(State var1, int var2) {
      byte var6;
      Action var7;
      if (var2 == 0) {
         var7 = var1.getSonicAction();
         var6 = 8;
      } else {
         if ((var7 = var1.getTailsAction()) == null) {
            return;
         }

         var6 = 16;
      }

      int var3;
      int var5;
      if ((super.m_Cddat & var6) == 0) {
         var3 = var7.m_Xposi - super.m_Xposi;
         if (-192 > var3 || 192 <= var3) {
            return;
         }

         var3 = super.m_Yposi + 60;
         var5 = var7.m_Yposi;
         int var4 = var7.m_Sprvs;
         if ((var3 -= var4 + var5 + 4) > 0 || -16 > var3 || 6 <= var7.m_R_No0) {
            return;
         }

         var7.m_Yposi = var5 + var3 + 3;
         super.m_SLoopFlag = 1;
         ((GameState)var1).rideonSet(var6, this, var7);
         var7.m_Mstno = 0;
         var7.m_Mstno_1 = 1;
         if (var2 == 0) {
            h = 0;
         } else {
            i = 0;
         }

         if (var7.m_Mspeed == 0) {
            var7.m_Mspeed = 1;
            return;
         }
      } else {
         if ((var7.m_Cddat & 2) != 0) {
            var3 = var2 == 0 ? h : i;
            var3 += 32;
            if (64 > var3) {
               var7.m_Yspeed >>= 1;
            } else {
               var7.m_Yspeed = 0;
            }

            var7.m_Cddat &= -9;
            super.m_Cddat &= ~var6;
            var7.m_DirecCnt = 0;
            var7.m_DirecSpd = 4;
            var7.m_Cddat |= 2;
            return;
         }

         if ((var3 = var7.m_Xposi - super.m_Xposi + 192) < 0 || 384 <= var3) {
            var7.m_Cddat &= -9;
            super.m_Cddat &= ~var6;
            var7.m_DirecCnt = 0;
            var7.m_DirecSpd = 4;
            var7.m_Cddat |= 2;
            return;
         }

         if ((var7.m_Cddat & 8) != 0) {
            int var8 = Utilities.cosset(var2 == 0 ? h : i);
            var5 = super.m_Yposi + (var8 * 10240 >> 16);
            var7.m_Yposi = var5 - (var7.m_Sprvs - 19);
            var7.m_Direc1 = var2 == 0 ? h : i;
            if (var2 == 0) {
               h += 4;
            } else {
               i += 4;
            }

            if (var7.m_Mspeed == 0) {
               var7.m_Mspeed = 1;
            }
         }
      }

   }

   private void a(Action var1) {
      if (var1 != null) {
         int var2 = super.m_Userflag & 255;
         super.m_Mstno = 1;
         super.m_Mstno_1 = 0;
         var1.m_Yposi += 8;
         var1.m_Yspeed = super.m_Reserve[0];
         var1.m_Cddat |= 2;
         var1.m_Cddat &= -9;
         var1.m_Mstno = 16;
         var1.m_R_No0 = 2;
         if ((var2 & 128) != 0) {
            var1.m_Xspeed = 0;
         }

         if ((var2 & 1) != 0) {
            var1.m_Mspeed = 1;
            var1.m_Direc1 = 1;
            var1.m_Mstno = 0;
            var1.m_DirecCnt = 0;
            var1.m_DirecSpd = 4;
            if ((var2 & 2) == 0) {
               var1.m_DirecCnt = 1;
            }

            if ((var1.m_Cddat & 1) != 0) {
               var1.m_Direc1 = -var1.m_Direc1;
               var1.m_Mspeed = -var1.m_Mspeed;
            }
         }

         if ((var2 & 12) == 4) {
            var1.m_Rideonwk = 4096;
            var1.m_Hitcolwk = 8192;
         }

         if ((var2 & 12) == 8) {
            var1.m_Rideonwk = 16384;
            var1.m_Hitcolwk = 32768;
         }

      }
   }

   private void b(Action var1) {
      int var2 = super.m_Userflag & 255;
      super.m_Mstno = 3;
      super.m_Mstno_1 = 0;
      var1.m_Xspeed = super.m_Reserve[0];
      var1.m_Xposi += 8;
      var1.m_Cddat |= 1;
      if ((super.m_Cddat & 1) == 0) {
         var1.m_Cddat &= -2;
         var1.m_Xposi -= 16;
         var1.m_Xspeed = -var1.m_Xspeed;
      }

      var1.m_FallTimer = 15;
      var1.m_Mspeed = var1.m_Xspeed;
      if ((var1.m_Cddat & 4) == 0) {
         var1.m_Mstno = 0;
      }

      if ((var2 & 128) != 0) {
         var1.m_Yspeed = 0;
      }

      if ((var2 & 1) != 0) {
         var1.m_Mspeed = 1;
         var1.m_Direc1 = 1;
         var1.m_Mstno = 0;
         var1.m_DirecCnt = 1;
         var1.m_DirecSpd = 8;
         if ((var2 & 2) == 0) {
            var1.m_DirecCnt = 3;
         }

         if ((var1.m_Cddat & 1) != 0) {
            var1.m_Direc1 = -var1.m_Direc1;
            var1.m_Mspeed = -var1.m_Mspeed;
         }
      }

      if ((var2 & 12) == 4) {
         var1.m_Rideonwk = 4096;
         var1.m_Hitcolwk = 8192;
      }

      if ((var2 & 12) == 8) {
         var1.m_Rideonwk = 16384;
         var1.m_Hitcolwk = 32768;
      }

      super.m_Cddat &= -33;
      super.m_Cddat &= -65;
      var1.m_Cddat &= -33;
   }

   private void c(Action var1) {
      int var2 = super.m_Userflag & 255;
      super.m_Mstno = 1;
      super.m_Mstno_1 = 0;
      var1.m_Yposi -= 8;
      var1.m_Yspeed = super.m_Reserve[0];
      var1.m_Yspeed = -var1.m_Yspeed;
      if ((var2 & 128) != 0) {
         var1.m_Xspeed = 0;
      }

      if ((var2 & 1) != 0) {
         var1.m_Mspeed = 1;
         var1.m_Direc1 = 1;
         var1.m_Mstno = 0;
         var1.m_DirecCnt = 0;
         var1.m_DirecSpd = 4;
         if ((var2 & 2) == 0) {
            var1.m_DirecCnt = 1;
         }

         if ((var1.m_Cddat & 1) != 0) {
            var1.m_Direc1 = -var1.m_Direc1;
            var1.m_Mspeed = -var1.m_Mspeed;
         }
      }

      if ((var2 & 12) == 4) {
         var1.m_Rideonwk = 4096;
         var1.m_Hitcolwk = 8192;
      }

      if ((var2 & 12) == 8) {
         var1.m_Rideonwk = 16384;
         var1.m_Hitcolwk = 32768;
      }

      var1.m_Cddat |= 2;
      var1.m_Cddat &= -9;
      var1.m_R_No0 = 2;
   }

   private void d(Action var1) {
      int var2 = super.m_Userflag & 255;
      if ((super.m_Cddat & 1) == 0) {
         if (var1.m_Xposi <= super.m_Xposi - 4) {
            return;
         }
      } else if (var1.m_Xposi > super.m_Xposi + 4) {
         return;
      }

      super.m_Mstno = 5;
      super.m_Mstno_1 = 0;
      var1.m_Yspeed = super.m_Reserve[0];
      var1.m_Xspeed = super.m_Reserve[0];
      var1.m_Yposi += 6;
      var1.m_Xposi += 6;
      var1.m_Cddat |= 1;
      if ((super.m_Cddat & 1) == 0) {
         var1.m_Cddat &= -2;
         var1.m_Xposi -= 12;
         var1.m_Xspeed = -var1.m_Xspeed;
      }

      var1.m_Cddat |= 2;
      var1.m_Cddat &= -9;
      var1.m_Mstno = 16;
      var1.m_R_No0 = 2;
      if ((var2 & 1) != 0) {
         var1.m_Mspeed = 1;
         var1.m_Direc1 = 1;
         var1.m_Mstno = 0;
         var1.m_DirecCnt = 1;
         var1.m_DirecSpd = 8;
         if ((var2 & 2) == 0) {
            var1.m_DirecCnt = 3;
         }

         if ((var1.m_Cddat & 1) != 0) {
            var1.m_Direc1 = -var1.m_Direc1;
            var1.m_Mspeed = -var1.m_Mspeed;
         }
      }

      if ((var2 & 12) == 4) {
         var1.m_Rideonwk = 4096;
         var1.m_Hitcolwk = 8192;
      }

      if ((var2 & 12) == 8) {
         var1.m_Rideonwk = 16384;
         var1.m_Hitcolwk = 32768;
      }

   }

   private void e(Action var1) {
      int var2 = super.m_Userflag & 255;
      super.m_Mstno = 5;
      super.m_Mstno_1 = 0;
      var1.m_Yspeed = -super.m_Reserve[0];
      var1.m_Xspeed = super.m_Reserve[0];
      var1.m_Yposi -= 6;
      var1.m_Xposi += 6;
      var1.m_Cddat |= 1;
      if ((super.m_Cddat & 1) == 0) {
         var1.m_Cddat &= -2;
         var1.m_Xposi -= 12;
         var1.m_Xspeed = -var1.m_Xspeed;
      }

      var1.m_Cddat |= 2;
      var1.m_Cddat &= -9;
      var1.m_R_No0 = 2;
      if ((var2 & 1) != 0) {
         var1.m_Mspeed = 1;
         var1.m_Direc1 = 1;
         var1.m_Mstno = 0;
         var1.m_DirecCnt = 1;
         var1.m_DirecSpd = 8;
         if ((var2 & 2) == 0) {
            var1.m_DirecCnt = 3;
         }

         if ((var1.m_Cddat & 1) != 0) {
            var1.m_Direc1 = -var1.m_Direc1;
            var1.m_Mspeed = -var1.m_Mspeed;
         }
      }

      if ((var2 & 12) == 4) {
         var1.m_Rideonwk = 4096;
         var1.m_Hitcolwk = 8192;
      }

      if ((var2 & 12) == 8) {
         var1.m_Rideonwk = 16384;
         var1.m_Hitcolwk = 32768;
      }

   }

   private void a(State var1, Action var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var2 != null) {
         if ((var7 & super.m_Cddat) != 0) {
            if ((var2.m_Cddat & 2) == 0 && (var3 = var2.m_Xposi - super.m_Xposi + 26) >= 0 && 52 > var3) {
               ((GameState)var1).ridePlaySet2(var6, var6, 16, this, var2);
            } else {
               var2.m_Cddat &= -9;
               var2.m_Cddat |= 2;
               super.m_Cddat &= ~var7;
            }
         } else {
            if (var8 == 0) {
               if (var2.m_Mstno != 2) {
                  ((GameState)var1).atariRideChk(26, 15, var7, this, var2, 2);
                  return;
               }
            } else {
               ((GameState)var1).atariRideChk(26, 15, var7, this, var2, 2);
            }

         }
      }
   }

   public void togedamagesub(State var1, Action var2) {
      if (var2 != null) {
         if ((var2.m_PlPower & 2) == 0 && var2.m_NoColiTimer == 0 && 4 > var2.m_R_No0) {
            var2.setYposi(var2.getYposi() - (var2.m_Yspeed << 8));
            ((GameState)var1).playDamageSet(var2, this);
         }

      }
   }

   private void a() {
      ++GameState.m_Pl_Suu;
      cCanvas.am.bgmset(6);
   }

   private void b() {
      int var1 = Utilities.sinset(super.m_Reserve[5]);
      super.m_Yposi = super.m_Reserve[0] + (var1 << 10 >> 16);
   }

   private void b(State var1) {
      int var3;
      switch(super.m_Userflag & 15) {
      case 0:
         return;
      case 1:
         super.m_Xposi = super.m_Reserve[1] + (super.m_Direc - 64);
         super.m_Direc = GameState.m_Sysdirec[6] >>> 24;
         return;
      case 2:
         super.m_Reserve[0] = super.m_Reserve[2] + (super.m_Direc - 64);
         super.m_Direc = GameState.m_Sysdirec[6] >>> 24;
         return;
      case 3:
         if (super.m_Reserve[6] == 0) {
            if ((super.m_Cddat & 24) != 0) {
               super.m_Reserve[6] = 30;
               return;
            }
         } else if (--super.m_Reserve[6] == 0) {
            super.m_Reserve[6] = 32;
            ++super.m_Userflag;
            return;
         }
         break;
      case 4:
         if (super.m_Reserve[6] != 0 && --super.m_Reserve[6] == 0) {
            Action var2;
            if ((super.m_Cddat & 8) != 0) {
               super.m_Cddat &= -9;
               Action var5 = var2 = var1.getSonicAction();
               var5.m_Cddat |= 2;
               var2.m_Cddat &= -9;
               var2.m_R_No0 = 2;
               var2.m_Yspeed = super.m_Yspeed;
            }

            if ((super.m_Cddat & 16) != 0) {
               super.m_Cddat &= -17;
               if ((var2 = var1.getTailsAction()) != null) {
                  var2.m_Cddat |= 2;
                  var2.m_Cddat &= -9;
                  var2.m_R_No0 = 2;
                  var2.m_Yspeed = super.m_Yspeed;
               }
            }

            super.m_R_No0 = 6;
         }

         int var4 = (super.m_Reserve[0] << 16 | super.m_Reserve[3]) + (super.m_Yspeed << 8);
         super.m_Reserve[0] = var4 >> 16;
         super.m_Reserve[3] = var4 & '\uffff';
         super.m_Yspeed += 56;
         if (super.m_Reserve[0] > GameState.m_ScrALim_Down + 288) {
            super.m_R_No0 = 4;
            return;
         }
         break;
      case 5:
         super.m_Xposi = super.m_Reserve[1] + -super.m_Direc + 64;
         super.m_Direc = GameState.m_Sysdirec[6] >>> 24;
         return;
      case 6:
         var3 = -super.m_Direc + 64;
         super.m_Reserve[0] = super.m_Reserve[2] + var3;
         super.m_Direc = GameState.m_Sysdirec[6] >>> 24;
         return;
      case 7:
         if (super.m_Reserve[6] == 0) {
            if (GameState.m_SwitchFlag[super.m_Userflag >> 4] != 0) {
               super.m_Reserve[6] = 60;
               return;
            }
         } else if (--super.m_Reserve[6] == 0) {
            ++super.m_Userflag;
            return;
         }
         break;
      case 8:
         int[] var10000 = super.m_Reserve;
         var10000[0] -= 2;
         if (super.m_Reserve[0] == super.m_Reserve[2] - 512) {
            super.m_Userflag = 0;
            return;
         }
      case 9:
      default:
         break;
      case 10:
         var3 = super.m_Direc - 1073741824 >> 1;
         super.m_Reserve[0] = super.m_Reserve[2] + (var3 >> 24);
         super.m_Direc = GameState.m_Sysdirec[6];
         return;
      case 11:
         var3 = -super.m_Direc + 1073741824;
         super.m_Reserve[0] = super.m_Reserve[2] + (var3 >> 25);
         super.m_Direc = GameState.m_Sysdirec[6];
         break;
      case 12:
         var3 = GameState.m_Sysdirec[3] - 805306368;
         super.m_Reserve[0] = (var3 >>> 24) + super.m_Reserve[2];
         super.m_Direc = GameState.m_Sysdirec[6];
         return;
      case 13:
         var3 = -GameState.m_Sysdirec[3] + 805306368;
         super.m_Reserve[0] = (var3 >>> 24) + 48 + super.m_Reserve[2];
         super.m_Direc = GameState.m_Sysdirec[6];
         return;
      }

   }

   void shimafoutchk(State var1) {
      this.frameOutCheck(var1);
   }

   public static void loadImages(int var0) {
      int var1 = a(var0 = a(var0));
      String[] var10000;
      if (Filenames.ImgFileNames[var1].length == 0) {
         var10000 = null;
      } else if (var1 == 24) {
         String[] var2 = null;
         switch(GameState.zoneNumber) {
         case 0:
            var2 = new String[]{Filenames.ImgFileNames[var1][0]};
            break;
         case 7:
            var2 = new String[]{Filenames.ImgFileNames[var1][3], Filenames.ImgFileNames[var1][4]};
            break;
         case 15:
            var2 = new String[]{Filenames.ImgFileNames[var1][1], Filenames.ImgFileNames[var1][2]};
         }

         var10000 = var2;
      } else {
         var10000 = Filenames.ImgFileNames[var1];
      }

      String[] var3 = var10000;
      if (var10000 != null) {
         b[var0] = new Image[var3.length];
         Utilities.loadImages(var3, b[var0]);
      }

   }

   public static void unloadImage(int var0) {
      b[var0] = null;
   }

   public static Image[] getAppImages(int var0) {
      return b[a(var0)];
   }

   private static int a(int var0) {
      if (a == null) {
         a = Utilities.arrayInputDataInt1("/ImgShareTbl.bin");
      }

      int var1;
      return (var1 = a[var0]) == 0 ? var0 : var1;
   }

   public static void disposeImages() {
      b = new Image[221][];
   }

   private void c() {
      int var1;
      switch(super.m_Userflag & 15) {
      case 1:
         this.d();
         super.m_Yposi = super.m_Reserve[1] + (super.m_Reserve[2] >> 8);

         for(var1 = 0; var1 < 1; ++var1) {
            super.m_Sprpositbl[0][0] = super.m_Xposi;
            super.m_Sprpositbl[0][1] = super.m_Yposi;
         }

         return;
      case 2:
         this.d();
         super.m_Xposi = super.m_Reserve[0] + (super.m_Reserve[2] >> 8);

         for(var1 = 0; var1 < 1; ++var1) {
            super.m_Sprpositbl[0][0] = super.m_Xposi;
            super.m_Sprpositbl[0][1] = super.m_Yposi;
         }

         return;
      default:
      }
   }

   private void d() {
      if (super.m_Reserve[4] != 0) {
         int var10002 = super.m_Reserve[4]--;
      } else {
         int[] var10000;
         if (super.m_Reserve[3] != 0) {
            var10000 = super.m_Reserve;
            var10000[2] -= 2048;
            if (super.m_Reserve[2] < 0) {
               super.m_Reserve[2] = 0;
               super.m_Reserve[3] = 0;
               super.m_Reserve[4] = 60;
               return;
            }
         } else {
            var10000 = super.m_Reserve;
            var10000[2] += 2048;
            if (8192 <= super.m_Reserve[2]) {
               super.m_Reserve[2] = 8192;
               super.m_Reserve[3] = 1;
               super.m_Reserve[4] = 60;
            }
         }

      }
   }

   private void c(State var1) {
      Action var3;
      switch(super.m_R_No1) {
      case 0:
         return;
      case 1:
      case 3:
      case 5:
      default:
         return;
      case 2:
         if (--super.m_Reserve[0] < 0) {
            super.m_Reserve[0] = 60;
            ++super.m_Mstno;
            if (super.m_Mstno == 3) {
               super.m_R_No1 = 4;
               super.m_Mstno = super.m_Reserve[3];
            }
         }

         if (--super.m_Reserve[1] < 0) {
            super.m_Reserve[1] = 11;
            int var2 = super.m_Reserve[2];
            int[] var10000 = super.m_Reserve;
            var10000[2] += 2;
            var10000 = super.m_Reserve;
            var10000[2] &= 14;
            if ((var3 = var1.insertAction(37)) != null) {
               var3.m_Actno = 37;
               var3.m_R_No0 = 6;
               var3.m_Xposi = super.m_Xposi + D[var2++];
               var3.m_Yposi = super.m_Yposi + D[var2];
               var3.m_Actflg = 4;
               var3.m_Sprpri = 2;
               var3.m_Sprhsize = 8;
            }
         }

         return;
      case 4:
         if (((var3 = var1.getSonicAction()).m_Cddat & 2) == 0) {
            GameState.m_SwData = 2056;
         }

         if (var3.m_Actno != 0 && GameState.m_ScrALim_Right + 256 > var3.m_Xposi) {
            return;
         }

         super.m_R_No1 = 0;
         this.d(var1);
         return;
      case 6:
      }
   }

   private void d(State var1) {
      var1.getSonicAction().m_PlPower = 0;
      GameState.m_PlTime_F = 0;
      GameState.stageClear = true;
      var1.insertAction(58);
   }

   private void f(Action var1) {
      int var3 = super.m_Userflag & 255;
      if ((super.m_Cddat & 1) == 0) {
         if (var1.m_Xposi <= super.m_Xposi - 16) {
            return;
         }
      } else if (var1.m_Xposi > super.m_Xposi + 16) {
         return;
      }

      if (super.m_Mstno != 1) {
         super.m_Mstno = 1;
         super.m_Mstno_1 = 0;
         super.m_Reserve[1] = Math.abs(var1.m_Xspeed) > 768 ? 2 : 3;
      } else if (--super.m_Reserve[1] == 0) {
         int var2 = -(super.m_Xposi - 28 - var1.m_Xposi);
         if ((super.m_Cddat & 1) != 0) {
            var2 = 58 + ~var2;
         }

         if (var2 < 0) {
            var2 = 0;
         }

         byte var4 = J[var2];
         if (Math.abs(var1.m_Xspeed) > 2000) {
            var4 = 4;
         }

         var1.m_Yspeed = -1024;
         var1.m_Yspeed -= var4 << 8;
         if ((super.m_Cddat & 1) != 0) {
            var1.m_Cddat |= 1;
         } else {
            var1.m_Cddat &= -2;
         }

         var1.m_Cddat |= 2;
         var1.m_Cddat &= -9;
         var1.m_Mstno = 16;
         var1.m_R_No0 = 2;
         var1.m_DashMode = false;
         if ((var3 & 1) != 0) {
            var1.m_Mspeed = 1;
            var1.m_Direc1 = 1;
            var1.m_Mstno = 0;
            var1.m_DirecCnt = 1;
            var1.m_DirecSpd = 8;
            if ((var3 & 2) == 0) {
               var1.m_DirecCnt = 3;
            }

            if ((var1.m_Cddat & 1) != 0) {
               var1.m_Direc1 = -var1.m_Direc1;
               var1.m_Mspeed = -var1.m_Mspeed;
            }
         }

         if ((var3 & 12) == 4) {
            var1.m_Rideonwk = 4096;
            var1.m_Hitcolwk = 8192;
         }

         if ((var3 & 12) == 8) {
            var1.m_Rideonwk = 16384;
            var1.m_Hitcolwk = 32768;
         }

      }
   }

   private void g(Action var1) {
      if (var1.m_R_No0 != 6) {
         var1.m_Reserve[4] = var1.m_R_No0;
         var1.m_Reserve[5] = 36;
         var1.m_R_No0 = 6;
      }

   }

   private void e(State var1) {
      int var3 = super.m_Xposi;
      int var2;
      if (super.m_Reserve[3] != 0) {
         var2 = super.m_Xposi - 1;
         if (super.m_Reserve[1] == var2) {
            super.m_Reserve[3] = 0;
            this.g((Action)this);
         } else {
            super.m_Xposi = var2;
         }
      } else {
         var2 = super.m_Xposi + 1;
         if (super.m_Reserve[2] == var2) {
            super.m_Reserve[3] = 1;
            this.g((Action)this);
         } else {
            super.m_Xposi = var2;
         }
      }

      ((GameState)var1).rideChkSub(var3, super.m_Yposi, super.m_Sprhsize, super.m_Sprvsize, 0, 8, this);
   }

   private void a(Action var1, int var2) {
      if (var2 == 2) {
         this.b((Action)var1, 0);
      } else {
         this.b((Action)var1, 1);
      }
   }

   private void b(Action var1, int var2) {
      if (var1.m_Actno == 1) {
         cCanvas.doVibration(333);
      }

      switch(var2) {
      case 0:
         var1.m_Cddat |= 4;
         var1.m_Sprvs = 14;
         var1.m_Sprhs = 7;
         var1.m_Mstno = 2;
         var1.m_Yspeed = -768;
      default:
         var1.m_Cddat |= 2;
         var1.m_Cddat &= -9;
         var1.m_R_No0 = 2;
      }
   }

   private void a(State var1, int[][] var2, int[] var3, int var4) {
      int var6 = 0;
      int var5 = var2.length;
      super.m_Actflg |= 32;
      super.m_Actflg &= -65;

      for(int var8 = 0; var8 < var5; ++var8) {
         Object var7;
         if ((var7 = var8 == 0 ? this : var1.insertAction(this, super.m_Actno)) != null) {
            ((Action)var7).m_R_No0 = 4;
            ((Action)var7).m_Actno = super.m_Actno;
            ((Action)var7).m_Patbase_Table = var2;
            ((Action)var7).m_Patno = var8;
            ((Action)var7).m_Actflg = super.m_Actflg;
            ((Action)var7).m_Xposi = super.m_Xposi;
            ((Action)var7).m_Yposi = super.m_Yposi;
            ((Action)var7).m_Sproffset = super.m_Sproffset;
            ((Action)var7).m_Sprpri = super.m_Sprpri;
            ((Action)var7).m_Sprhsize = super.m_Sprhsize;
            ((Action)var7).m_Sprvsize = super.m_Sprvsize;
            if (var4 == 0) {
               ((Action)var7).m_Xspeed = var3[var6++];
               ((Action)var7).m_Yspeed = var3[var6++];
            } else {
               ((Action)var7).m_Reserve[0] = var3[var6++] + 3;
            }
         }
      }

   }

   public static void tensuusetsub(State var0, Action var1) {
      Action var2;
      if ((var2 = var0.insertAction(41)) != null) {
         var2.m_Actno = 41;
         var2.m_Xposi = var1.m_Xposi;
         var2.m_Yposi = var1.m_Yposi;
         int var4 = GameState.m_EmyScoreCnt;
         GameState.m_EmyScoreCnt += 2;
         if (6 <= var4) {
            var4 = 6;
         }

         int var3 = Y[var4 >> 1];
         if (32 <= GameState.m_EmyScoreCnt) {
            var3 = 1000;
            var4 = 10;
         }

         GameState.scoreUp(var3, true);
         var2.m_Patno = var4 >> 1;
      }

   }

   private void f(State var1) {
      this.a(((GameState)var1).getSonicAction(), 1, super.m_Yposi);
      Action var2;
      if ((var2 = ((GameState)var1).getTailsAction()) != null) {
         if (((PlayerAction)var2).m_PLAY20_Automode == 4) {
            var2.m_BallMode = 0;
         }

         this.a(var2, 2, super.m_Yposi);
      }

   }

   void rollcmove_sub(Action var1, int var2, int var3) {
      if (var1 != null) {
         int var4;
         if (super.m_Reserve[var2] != 0) {
            if (var1.m_Xposi < var3) {
               super.m_Reserve[var2] = 0;
               var3 = var2 = super.m_Yposi;
               var4 = super.m_Reserve[0];
               var2 -= var4;
               var3 += var4;
               var4 = var1.m_Yposi;
               if (var2 <= var4) {
                  if (var3 > var4) {
                     if ((super.m_Actflg & 1) != 0) {
                        var1.m_BallMode = 1;
                        this.h(var1);
                     } else {
                        var1.m_BallMode = 0;
                     }
                  }
               }
            }
         } else if (var1.m_Xposi >= var3) {
            super.m_Reserve[var2] = 1;
            var3 = var2 = super.m_Yposi;
            var4 = super.m_Reserve[0];
            var2 -= var4;
            var3 += var4;
            var4 = var1.m_Yposi;
            if (var2 <= var4) {
               if (var3 > var4) {
                  if ((super.m_Actflg & 1) == 0) {
                     var1.m_BallMode = 1;
                     this.h(var1);
                  } else {
                     var1.m_BallMode = 0;
                  }
               }
            }
         }
      }
   }

   private void a(Action var1, int var2, int var3) {
      if (var1 != null) {
         int var4;
         if (super.m_Reserve[var2] != 0) {
            if (var1.m_Yposi < var3) {
               super.m_Reserve[var2] = 0;
               var3 = var2 = super.m_Xposi;
               var4 = super.m_Reserve[0];
               var2 -= var4;
               var3 += var4;
               var4 = var1.m_Xposi;
               if (var2 <= var4) {
                  if (var3 > var4) {
                     if ((super.m_Actflg & 1) != 0) {
                        var1.m_BallMode = 1;
                        this.h(var1);
                     } else {
                        var1.m_BallMode = 0;
                     }
                  }
               }
            }
         } else if (var1.m_Yposi >= var3) {
            super.m_Reserve[var2] = 1;
            var3 = var2 = super.m_Xposi;
            var4 = super.m_Reserve[0];
            var2 -= var4;
            var3 += var4;
            var4 = var1.m_Xposi;
            if (var2 <= var4) {
               if (var3 > var4) {
                  if ((super.m_Actflg & 1) == 0) {
                     var1.m_BallMode = 1;
                     this.h(var1);
                  } else {
                     var1.m_BallMode = 0;
                  }
               }
            }
         }
      }
   }

   private void h(Action var1) {
      if (var1 != null) {
         if ((var1.m_Cddat & 4) == 0) {
            var1.m_Cddat |= 4;
            var1.m_Sprvs = 14;
            var1.m_Sprhs = 7;
            var1.m_Mstno = 2;
            var1.m_Yposi += 5;
         }
      }
   }

   private void i(Action var1) {
      if (var1 != null) {
         int var2;
         int var3 = (var2 = super.m_Reserve[1]) + var2;
         var2 += var1.m_Xposi - super.m_Xposi;
         if (var3 > (var2 & '\uffff')) {
            var3 = var1.m_Yposi - super.m_Yposi;
            var2 = super.m_Reserve[3];
            var3 += var2;
            if (var2 > (var3 & 4095)) {
               if ((var1.m_Cddat & 2) == 0) {
                  var1.m_Xposi += super.m_Reserve[0];
               }
            }
         }
      }
   }

   private void j(Action var1) {
      if (var1 != null) {
         if ((var1.m_Cddat & 8) != 0) {
            var1.m_Cddat &= -41;
            var1.m_Mstno_1 = 1;
         }

      }
   }

   private void g(State var1) {
      int var2 = GameState.m_Sysdirec[6] >>> 24;
      int var3;
      if ((var3 = super.m_Userflag & 255) != 0) {
         label72: {
            int var10000;
            if (var3 == 16) {
               if (var2 != 63) {
                  if (63 <= var2) {
                     break label72;
                  }

                  var10000 = 64;
               } else {
                  var10000 = 64;
               }
            } else {
               if (var3 == 32) {
                  return;
               }

               if (var3 == 48) {
                  if (var2 == 65) {
                     var10000 = 64;
                  } else {
                     if (65 > var2) {
                        break label72;
                     }

                     var10000 = 64;
                  }
               } else {
                  if (var3 != 64) {
                     break label72;
                  }

                  var3 = (super.m_Direc << 8) + super.m_Direc;
                  if (super.m_Reserve[3] != 0) {
                     int var10002 = super.m_Reserve[3]--;
                  } else {
                     label78: {
                        if (super.m_Reserve[2] == 0) {
                           var2 = var1.getSonicAction().m_Xposi - super.m_Reserve[5] + 32;
                           if (64 <= var2) {
                              break label78;
                           }

                           super.m_Reserve[2] = 1;
                        }

                        if (super.m_Reserve[7] != 0) {
                           var2 = super.m_Reserve[8] + 8;
                           super.m_Reserve[8] = var2;
                           var3 += var2;
                           super.m_Direc = var3 >> 8 & 255;
                           super.m_Direc1 = var3 & 255;
                           if (var2 == 512) {
                              super.m_Reserve[8] = 0;
                              super.m_Direc = 128;
                              super.m_Direc1 = 0;
                              super.m_Reserve[7] = 0;
                              super.m_Reserve[3] = 60;
                           }
                        } else {
                           var2 = super.m_Reserve[8] - 8;
                           super.m_Reserve[8] = var2;
                           var3 += var2;
                           super.m_Direc = var3 >> 8 & 255;
                           super.m_Direc1 = var3 & 255;
                           if (var2 == -512) {
                              super.m_Reserve[8] = 0;
                              super.m_Direc = 64;
                              super.m_Direc1 = 0;
                              super.m_Reserve[7] = 1;
                              super.m_Reserve[3] = 60;
                           }
                        }
                     }
                  }

                  var10000 = super.m_Direc;
               }
            }

            var2 = var10000;
         }
      }

      if (super.m_Reserve[0] != var2) {
         super.m_Reserve[0] = var2;
         if ((super.m_Cddat & 1) != 0) {
            var2 = (var2 = -var2) + 128;
         }

         int var12 = var2;
         var2 = Utilities.sinset(var2);
         var3 = Utilities.cosset(var12);
         var12 = super.m_Reserve[4];
         int var4 = super.m_Reserve[5];
         Action var8 = (Action)super.m_ReserveObj;
         var2 <<= 12;
         var3 <<= 12;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var9 = 0;
         int var10 = 0;

         for(int var11 = 0; var11 < var8.m_Manysprcnt - 1; ++var11) {
            var8.m_Sprpositbl[var7][0] = var4 + (var6 >> 16);
            var8.m_Sprpositbl[var7][1] = var12 + (var5 >> 16);
            var9 = var5;
            var10 = var6;
            var5 += var2;
            var6 += var3;
            ++var7;
         }

         var2 >>= 1;
         var3 >>= 1;
         var5 = var9 + var2;
         var6 = var10 + var3;
         var5 >>= 16;
         var6 >>= 16;
         var5 += super.m_Reserve[4];
         var6 += super.m_Reserve[5];
         super.m_Yposi = var5;
         super.m_Xposi = var6;
      }
   }

   static {
      int[][] var10000 = new int[][]{{30, 11, -1}, {30, 12, -1}, {30, 13, -1}, {30, 14, -1}, {30, 15, -1}, {30, 16, -1}, {30, 17, -1}, {30, 18, -1}, {30, 19, -1}, {30, 20, -1}, {30, 21, -1}, {30, 22, -1}};
      s = new int[][]{{0, 0, 0, 32, 16, -16, -8}, {0, 32, 80, 32, 32, -16, -24}, {0, 0, 16, 32, 32, -16, -16}, {0, 64, 0, 16, 32, -8, -16}, {0, 32, 80, 32, 32, -16, -24}, {0, 32, 0, 32, 32, -16, -16}, {0, 32, 80, 32, 32, -16, -16}, {0, 48, 64, 32, 32, -16, -16}, {0, 48, 32, 32, 32, -16, -16}, {0, 0, 48, 48, 48, -24, -16}};
      t = new int[][]{{0, 0, 96, 32, 16, -16, -8}, {0, 96, 112, 32, 32, -16, -16}, {0, 0, 112, 32, 32, -16, -24}, {0, 64, 96, 16, 32, -8, -16}, {0, 96, 112, 32, 32, -16, -16}, {0, 32, 96, 32, 32, -16, -16}, {0, 96, 112, 32, 32, -16, -16}, {0, 48, 160, 32, 32, -16, -16}, {0, 48, 128, 32, 32, -16, -16}, {0, 0, 144, 48, 48, -24, -36}};
      u = new int[][]{{16, 0, -1}, {1, 1, 0, 0, 2, 2, 2, 2, 2, 2, -3, 0}, {16, 3, -1}, {1, 4, 3, 3, 5, 5, 5, 5, 5, 5, -3, 2}, {16, 7, -1}, {1, 8, 7, 7, 9, 9, 9, 9, 9, 9, -3, 4}, {8, 0, 1, -1}, {8, 0, 1, -1}, {8, 0, 1, -1}, {8, 0, 1, -1}};
      v = new int[]{16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 14, 12, 10, 8, 6, 4, 2, 0, -2, -4, -4, -4, -4, -4, -4, -4};
      w = new int[]{-12, -16, -16, -16, -16, -16, -16, -16, -16, -16, -16, -16, -14, -12, -10, -8, -6, -4, -2, 0, 2, 4, 4, 4, 4, 4, 4, 4};
      x = new int[][]{{0, 0, 0, 32, 32, -16, -16}, {0, 0, 0, 32, 32, -16, -16}, {0, 0, 0, 32, 32, -16, -16}, {0, 0, 0, 32, 32, -16, -16}, {0, 0, 32, 32, 32, -16, -16}, {0, 0, 32, 32, 32, -16, -16}, {0, 0, 32, 32, 32, -16, -16}, {0, 0, 32, 32, 32, -16, -16}};
      y = new byte[][]{{16, 16}, {32, 16}, {48, 16}, {64, 16}, {16, 16}, {16, 32}, {16, 48}, {16, 64}};
      z = new int[][]{{0, 0, 0, 16, 104, -8, -63}, {0, 16, 0, 16, 88, -8, -43}, {0, 16, 88, 16, 16, -8, -8}, {0, 32, 112, 16, 16, -8, -8}, {0, 32, 0, 16, 40, -8, -40}, {0, 48, 0, 16, 40, -8, -40}, {0, 32, 112, 16, 16, -8, -8}, {0, 32, 40, 16, 40, -8, -40}, {0, 48, 40, 16, 40, -8, -40}, {0, 32, 112, 16, 16, -8, -8}, {0, 0, 104, 8, 8, -4, -4}, {0, 0, 104, 8, 8, -4, -4}, {0, 0, 104, 8, 8, -4, -4}, {0, 0, 104, 8, 8, -4, -4}, {0, 0, 104, 8, 8, -4, -4}, {0, 0, 104, 8, 8, -4, -4}, {0, 0, 104, 8, 8, -4, -4}, {0, 0, 104, 8, 8, -4, -4}, {0, 0, 104, 8, 8, -4, -4}, {0, 0, 104, 8, 8, -4, -4}, {0, 0, 104, 8, 8, -4, -4}, {0, 0, 104, 8, 8, -4, -4}};
      A = new int[][]{{17405, 4, 0, 6}, {17405, 4, 0, 6}, {17334, 4, 0, 1}, {9213, 16, 0, 6}, {17382, 8, 0, 4}, {17382, 8, 0, 4}, {17382, 32, 0, 1}, {16384, 8, 0, 1}, {16384, 8, 0, 1}, {17448, 4, 0, 4}, {17222, 4, 0, 4}, {17222, 4, 0, 4}, {17222, 4, 0, 4}, {17222, 4, 48, 4}, {17222, 4, 64, 4}, {17222, 4, 96, 4}, {17222, 24, 0, 4}, {17222, 24, 0, 4}, {17222, 8, 48, 4}, {17222, 8, 64, 4}, {17222, 8, 80, 4}};
      B = new int[][]{{0, 0, 48, 48, 48, -24, -16}, {0, 0, 96, 48, 48, -24, -16}, {0, 0, 144, 48, 48, -24, -16}, {0, 8, 0, 32, 48, -16, -16}, {0, 0, 0, 8, 48, -4, -16}, {0, 8, 0, 32, 48, -16, -16}};
      C = new int[][]{{16, 2, -1}, {6, 2, 3, 4, 5, 1, 3, 4, 5, 0, 3, 4, 5, -1}, {6, 2, 3, 4, 5, 1, 3, 4, 5, 0, 3, 4, 5, -1}, {16, 0, -1}, {16, 1, -1}};
      D = new byte[]{-24, -16, 8, 8, -16, 0, 24, -8, 0, -8, 16, 0, -24, 8, 24, 16};
      E = new int[][]{{0, 0, 0, 64, 64, -32, -32}, {0, 0, 64, 64, 64, -32, -32}, {0, 0, 128, 64, 64, -32, -32}, {0, 0, 192, 64, 64, -32, -32}, {0, 0, 256, 32, 16, -16, -8}, {0, 36, 256, 16, 16, -8, -8}};
      F = new int[][]{{16, 0, -1}, {4, 0, 1, 2, 3, -2, 1}};
      G = new int[][]{{40, 4, 16, 5, 4}, {24, 6, 8, 3, 5}, {0, 8, 32, 4, -1}};
      H = new int[][]{{0, 0, 0, 56, 16, -28, -24}, {0, 56, 0, 56, 16, -28, -24}, {0, 0, 0, 56, 16, -28, -24}, {0, 56, 0, 56, 16, -28, -24}};
      I = new int[][]{{16, 0, -1}, {4, 1, 0, -3, 0}};
      J = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      K = new int[]{8, 8, 8, 8, 8, 8, 8, 9, 10, 11, 12, 13, 14, 15, 16, 16, 17, 18, 19, 20, 20, 21, 21, 22, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24};
      L = new int[]{8, 8, 8, 8, 8, 8, 8, 9, 10, 11, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 14, 14, 15, 15, 16, 16, 16, 16, 15, 15, 14, 14, 13, 13, 13, 13, 13, 13, 13, 13};
      M = new int[][][]{{{0, 0, 0, 64, 27, -32, -16}, {0, 64, 0, 48, 26, -24, -16}, {0, 0, 0, 48, 36, -24, -16}, {0, 0, 0, 48, 36, -24, -16}}};
      N = new int[][]{{32, 0}, {24, 1}, {64, 2}, {32, 3}};
      P = (O = new int[][][]{{{0, 0, 0, 32, 32, -16, -16}, {1, 0, 0, 64, 24, -32, -12}}, {{32, 12, 1, 0}, {16, 16, 0, 0}}})[1];
      Q = new int[][]{{0, 0, 0, 48, 14, -24, -8}};
      R = new int[][]{{1, 0, 0, 48, 16, -24, -8}};
      S = new short[][]{{1, 104, -104, 0}, {2, 168, -176, 64}, {2, 232, -128, 128}, {1, 104, 103, 0}};
      T = new int[][][]{{{0, 0, 0, 64, 32, -32, -16}}, {{2, 0, 0, 128, 48, -64, -16}}, {{1, 0, 0, 64, 48, -32, -16}}, {{0, 0, 0, 64, 32, -32, -16}}, {{0, 0, 0, 48, 32, -24, -16}}, {{0, 48, 0, 32, 32, -16, -16}}};
      U = new int[][][]{{{0, 0, 0, 16, 16, -16, -16}, {0, 16, 0, 16, 16, 0, -16}, {0, 0, 16, 16, 16, -16, 0}, {0, 16, 16, 16, 16, 0, 0}}, {{0, 0, 0, 16, 16, -24, -16}, {0, 16, 0, 16, 16, -8, -16}, {0, 32, 0, 16, 16, 8, -16}, {0, 0, 16, 16, 16, -24, 0}, {0, 16, 16, 16, 16, -8, 0}, {0, 32, 16, 16, 16, 8, 0}}, {{0, 0, 0, 16, 16, -32, -16}, {0, 16, 0, 16, 16, -16, -16}, {0, 32, 0, 16, 16, 0, -16}, {0, 48, 0, 16, 16, 16, -16}, {0, 0, 16, 16, 16, -32, 0}, {0, 16, 16, 16, 16, -16, 0}, {0, 32, 16, 16, 16, 0, 0}, {0, 48, 16, 16, 16, 16, 0}}, {{2, 0, 0, 32, 32, -64, -16}, {2, 32, 0, 32, 32, -32, -16}, {2, 64, 0, 32, 32, 0, -16}, {2, 96, 0, 32, 32, 32, -16}, {2, 0, 32, 32, 32, -64, 16}, {2, 32, 32, 32, 32, -32, 16}, {2, 64, 32, 32, 32, 0, 16}, {2, 96, 32, 32, 32, 32, 16}}, {{1, 0, 0, 16, 16, -32, -16}, {1, 16, 0, 16, 16, -16, -16}, {1, 32, 0, 16, 16, 0, -16}, {1, 48, 0, 16, 16, 16, -16}, {1, 0, 16, 16, 16, -32, 0}, {1, 16, 16, 16, 16, -16, 0}, {1, 32, 16, 16, 16, 0, 0}, {1, 48, 16, 16, 16, 16, 0}, {1, 0, 32, 16, 16, -32, 16}, {1, 16, 32, 16, 16, -16, 16}, {1, 32, 32, 16, 16, 0, 16}, {1, 48, 32, 16, 16, 16, 16}}, {{0, 48, 0, 16, 16, -16, -16}, {0, 64, 0, 16, 16, 0, -16}, {0, 48, 16, 16, 16, -16, 0}, {0, 64, 16, 16, 16, 0, 0}}};
      V = new int[][]{{28, 24, 20, 16, 26, 22, 18, 14, 10, 6, 24, 20, 16, 12, 8, 4, 22, 18, 14, 10, 6, 2, 20, 16, 12}, {24, 28, 32, 30, 26, 22, 6, 14, 20, 18, 10, 2}, {30, 22, 14, 6, 26, 18, 10, 2}, {22, 30, 26, 18, 6, 14, 10, 2}, {26, 18, 10, 2, 22, 14, 6, 2, 2, 2, 2, 2, 2, 2}, {26, 22, 18, 14, 10, 2, 2, 2, 2, 2, 2, 2, 2, 2}, {22, 26, 24, 18, 6, 14, 10, 2}};
      W = new int[]{-512, -512, 0, -640, 512, -512, -448, -448, 0, -512, 448, -448};
      X = new int[]{-256, -512, 256, -512, -192, -448, 192, -448};
      Y = new int[]{10, 20, 50, 100};
      Z = new int[]{150, 148, 149};
      aa = new int[]{32, 64, 128, 256};
      ab = new int[][][]{{{0, 0, 0, 16, 64, -8, -32}, {1, 0, 0, 24, 64, -12, -32}}, {{2, 0, 0, 16, 64, -8, -32}}, {{1, 0, 0, 24, 64, -12, -32}}, {{0, 0, 0, 16, 64, -8, -32}}};
      ac = new int[][][]{{{0, 0, 24, 64, 16, -32, -8}, {0, 32, 0, 16, 16, -8, -8}, {0, 0, 0, 32, 24, -16, -12}, {0, 0, 0, 1, 1, 0, 0}}, {{1, 0, 0, 64, 32, -32, -16}, {1, 64, 0, 16, 16, -8, -8}, {1, 64, 0, 16, 16, -8, -8}, {1, 0, 31, 1, 1, 0, 0}}, {{3, 0, 0, 48, 16, -24, -8}, {2, 24, 0, 16, 16, -8, -8}, {2, 0, 0, 24, 32, -12, -16}, {2, 0, 0, 24, 32, -12, -16}}, {{4, 0, 0, 64, 16, -32, -8}, {2, 24, 0, 16, 16, -8, -8}, {2, 0, 0, 24, 32, -12, -16}, {2, 0, 0, 24, 32, -12, -16}}};
   }
}
