package STH2P1;

import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class State {
   public static final int LOGOMD = 0;
   public static final int ADVAMD = 4;
   public static final int DEMOMD = 8;
   public static final int GAMEMD = 12;
   public static final int SPGAMEMD = 16;
   public static final int CONTINUEMD = 20;
   public static final int RESULTMD = 24;
   public static final int SELECTMD = 28;
   public static final int ENDINGMD = 32;
   public static final int OPTIONMD = 36;
   public static final int RDSELECTMD = 40;
   public static final int LOADMD = 64;
   public static final int SUSPENDMD = 60;
   protected static final int TILE_SIZE = 16;
   public int SCALE_FACTOR = 4;
   public static int m_ScrA_H_Posit;
   public static int m_ScrA_V_Posit;
   public static int m_ScrB_H_Posit;
   public static int m_ScrB_V_Posit;
   public static int m_ScrC_H_Posit;
   public static int m_ScrC_V_Posit;
   public static int m_ScrZ_H_Posit;
   public static int m_ScrZ_V_Posit;
   public static int m_ScrB_H_Posit_2;
   public static int m_ScrB_V_Posit_2;
   public static int m_PlXPosi_s;
   public static int m_PlYPosi_s;
   protected static int m_PlTime_s;
   public static int m_PlSprOffset_s;
   public static int m_PlRideonwk_s;
   public static int m_PlHitcolwk_s;
   public static int m_Zone_Flag_s;
   public static int m_Water_Flag_s;
   public static int m_ScrALim_Down_s;
   public static int m_ScrALim2_Down_s;
   public static int m_ScrA_H_Posit_s;
   public static int m_ScrA_V_Posit_s;
   public static int m_ScrB_H_Posit_s;
   public static int m_ScrB_V_Posit_s;
   public static int m_ScrC_H_Posit_s;
   public static int m_ScrC_V_Posit_s;
   public static int m_ScrZ_H_Posit_s;
   public static int m_ScrZ_V_Posit_s;
   public static int m_WaterPosi_m_s;
   public static boolean m_WaterFlag_s;
   public static int m_PlFlag_s;
   public static final int SPRITE_NUM = 128;
   protected GameSprite[] mSpriteBuffer = new GameSprite[128];
   protected int mSpriteBufferSize = 0;
   protected int mMode;
   public static Action[] mActions;
   public static Action[] reserveActions = new Action[128];
   public static int[][] mReserves;
   protected static final int MAX_WORKMAX = 21;
   protected static final int MAX_ACTIONS = 512;
   public static Action mSonicAction;
   public static Action mTailsAction;
   protected static boolean drawLoadingText = false;
   protected static boolean loadStage = false;
   protected static final Font fT;
   protected static final int fontHeight;
   protected int m_PlayerIndex = -1;
   protected int m_Player2Index = -1;

   public static final State getInstance(int var0, Object var1) {
      Object var2 = null;
      switch(var0) {
      case 4:
         var2 = new TitleState(var0, var1);
         break;
      case 12:
      case 20:
         var2 = new GameState(var0, var1);
         break;
      case 32:
         var2 = new EndingState(var0, var1);
      }

      return (State)var2;
   }

   public void addSpriteToBuffer(Image[] var1, int[][] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         switch(var8) {
         case 0:
            switch(var4 & 3) {
            case 0:
               this.a(var1[var2[var3][0]], var5 + var2[var3][5], var6 + var2[var3][6], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var7, var8, var9);
               return;
            case 1:
               this.a(var1[var2[var3][0]], var5 - var2[var3][3] - var2[var3][5], var6 + var2[var3][6], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var7, var8, var9);
               return;
            case 2:
               this.a(var1[var2[var3][0]], var5 + var2[var3][5], var6 - var2[var3][4] - var2[var3][6], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var7, var8, var9);
               return;
            case 3:
               this.a(var1[var2[var3][0]], var5 - var2[var3][3] - var2[var3][5], var6 - var2[var3][4] - var2[var3][6], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var7, var8, var9);
               return;
            default:
               return;
            }
         case 1:
            switch(var4 & 3) {
            case 0:
               this.a(var1[var2[var3][0]], var5 + var2[var3][6], var6 - var2[var3][3] - var2[var3][5], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var7, var8, var9);
               return;
            case 1:
               this.a(var1[var2[var3][0]], var5 + var2[var3][6], var6 - var2[var3][3] - var2[var3][5], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var7, var8, var9);
               return;
            case 2:
               this.a(var1[var2[var3][0]], var5 - var2[var3][4] - var2[var3][6], var6 + var2[var3][5], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var7, var8, var9);
               return;
            case 3:
               this.a(var1[var2[var3][0]], var5 - var2[var3][4] - var2[var3][6], var6 + var2[var3][5], var2[var3][1], var2[var3][2], var2[var3][3], var2[var3][4], var4, var7, var8, var9);
            }
         }

      } catch (Exception var10) {
      }
   }

   private void a(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (this.mSpriteBufferSize < this.mSpriteBuffer.length) {
         switch(var8 & 12) {
         case 0:
         default:
            var2 = var2;
            var3 = var3;
            break;
         case 4:
            var2 -= m_ScrA_H_Posit;
            var3 -= m_ScrA_V_Posit;
            break;
         case 8:
            var2 -= m_ScrB_H_Posit;
            var3 -= m_ScrB_V_Posit;
            break;
         case 12:
            var2 -= m_ScrZ_H_Posit;
            var3 -= m_ScrZ_V_Posit;
         }

         this.mSpriteBuffer[this.mSpriteBufferSize].setData(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
         ++this.mSpriteBufferSize;
      }

   }

   public void deleteAction(Action var1) {
      int var3 = -1;

      for(int var2 = 0; var2 < mActions.length; ++var2) {
         if (var3 == -1 && var2 < reserveActions.length && reserveActions[var2] == null) {
            var3 = var2;
         }

         if (mActions[var2] == var1) {
            mActions[var2].m_Actno = 0;
            mActions[var2].m_Actflg = 0;
            mActions[var2] = null;
            if (var3 == -1) {
               while(var2 < reserveActions.length) {
                  if (reserveActions[var2] == null) {
                     var3 = var2;
                     break;
                  }

                  ++var2;
               }
            }

            if (var3 != -1) {
               reserveActions[var3] = var1;
               return;
            }
            break;
         }
      }

   }

   public void setActions(Action[] var1) {
      mActions = var1;
   }

   public Action insertAction(int var1) {
      Action var3 = null;

      for(int var2 = 0; var2 < mActions.length; ++var2) {
         if (mActions[var2] == null) {
            mActions[var2] = var3 = Action.getInstance(var1, var2);
            break;
         }
      }

      return var3;
   }

   public Action insertAction(Action var1, int var2) {
      boolean var4 = false;
      Action var3 = null;

      int var5;
      for(var5 = 0; var5 < mActions.length; ++var5) {
         if (mActions[var5] == var1) {
            ++var5;
            break;
         }
      }

      while(var5 < mActions.length) {
         if (mActions[var5] == null) {
            mActions[var5] = var3 = Action.getInstance(var2, var5);
            break;
         }

         ++var5;
      }

      return var3;
   }

   public Action insertAction(Action var1, int var2, int var3) {
      boolean var5 = false;
      Action var4 = null;

      int var6;
      for(var6 = 0; var6 < mActions.length; ++var6) {
         if (mActions[var6] == var1) {
            ++var6;
            break;
         }
      }

      for(int var7 = Math.min(mActions.length, var6 + var3); var6 < var7; ++var6) {
         if (mActions[var6] == null) {
            mActions[var6] = var4 = Action.getInstance(var2, var6);
            break;
         }
      }

      return var4;
   }

   public Action insertAction(Action var1, int[] var2) {
      Action var3;
      if ((var3 = this.insertAction(var1, var2[0])) != null) {
         var3.m_Userflag = var2[1];
         var3.m_Xposi = var1.m_Xposi;
         var3.m_Yposi = var1.m_Yposi;
         var3.m_ReserveObj = var1;
      }

      return var3;
   }

   public void deleteActionType(int var1) {
      for(int var2 = 0; var2 < mActions.length; ++var2) {
         if (mActions[var2].m_Actno == var1) {
            this.deleteAction(mActions[var2]);
         }
      }

   }

   public Action[] getActionType(int var1) {
      Vector var3 = new Vector();

      for(int var2 = 0; var2 < mActions.length; ++var2) {
         if (mActions[var2] != null && mActions[var2].m_Actno == var1) {
            var3.addElement(mActions[var2]);
         }
      }

      Action[] var4 = new Action[var3.size()];

      for(var1 = 0; var1 < var3.size(); ++var1) {
         var4[var1] = (Action)var3.elementAt(var1);
      }

      return var4;
   }

   public int countAction(int var1) {
      int var3 = 0;

      for(int var2 = 0; var2 < mActions.length; ++var2) {
         if (mActions[var2] != null && mActions[var2].m_Actno == var1) {
            ++var3;
         }
      }

      return var3;
   }

   public int getActionIndex(Action var1) {
      int var3 = -1;

      for(int var2 = 0; var2 < mActions.length; ++var2) {
         if (mActions[var2] == var1) {
            var3 = var2;
            break;
         }
      }

      return var3;
   }

   protected int checkPlayerIndex() {
      int var1 = -1;
      if (this.m_PlayerIndex < 0 || mActions[this.m_PlayerIndex] != null || mActions[this.m_PlayerIndex].m_Actno != 1) {
         for(int var2 = 0; var2 < mActions.length; ++var2) {
            if (mActions[var2] != null && mActions[var2].m_Actno == 1) {
               var1 = var2;
               break;
            }
         }
      }

      return this.m_PlayerIndex = var1;
   }

   public Action getSonicAction() {
      return mSonicAction;
   }

   public Action getTailsAction() {
      return mTailsAction;
   }

   public static Action getPlayerAction(int var0, int var1) {
      Action var2 = null;

      for(int var3 = 0; var3 < reserveActions.length; ++var3) {
         if ((var2 = reserveActions[var3]) != null && var2.classType == 1) {
            reserveActions[var3] = null;
            var2.reset();
            var2.setType(var0, var1);
            return var2;
         }
      }

      return new PlayerAction(var0, var1);
   }

   public static Action getPlayerAction2(int var0, int var1) {
      Action var2 = null;

      for(int var3 = 0; var3 < reserveActions.length; ++var3) {
         if ((var2 = reserveActions[var3]) != null && var2.classType == 2) {
            reserveActions[var3] = null;
            var2.reset();
            var2.setType(var0, var1);
            return var2;
         }
      }

      return new PlayerAction2(var0, var1);
   }

   public static Action getCommonAction(int var0, int var1) {
      Action var2 = null;

      for(int var3 = 0; var3 < reserveActions.length; ++var3) {
         if ((var2 = reserveActions[var3]) != null && var2.classType == 3) {
            reserveActions[var3] = null;
            var2.reset();
            var2.setType(var0, var1);
            return var2;
         }
      }

      return new CommonAction(var0, var1);
   }

   public static Action getBossAction(int var0, int var1) {
      Action var2 = null;

      for(int var3 = 0; var3 < reserveActions.length; ++var3) {
         if ((var2 = reserveActions[var3]) != null && var2.classType == 9) {
            reserveActions[var3] = null;
            var2.reset();
            var2.setType(var0, var1);
            return var2;
         }
      }

      return new BossAction(var0, var1);
   }

   public static Action getEmeraldHillAction(int var0, int var1) {
      Action var2 = null;

      for(int var3 = 0; var3 < reserveActions.length; ++var3) {
         if ((var2 = reserveActions[var3]) != null && var2.classType == 4) {
            reserveActions[var3] = null;
            var2.reset();
            var2.setType(var0, var1);
            return var2;
         }
      }

      return new EmeraldHillAction(var0, var1);
   }

   public static Action getChemicalPlantAction(int var0, int var1) {
      Action var2 = null;

      for(int var3 = 0; var3 < reserveActions.length; ++var3) {
         if ((var2 = reserveActions[var3]) != null && var2.classType == 5) {
            reserveActions[var3] = null;
            var2.reset();
            var2.setType(var0, var1);
            return var2;
         }
      }

      return new ChemicalPlantAction(var0, var1);
   }

   public static Action getAquaticRuinAction(int var0, int var1) {
      Action var2 = null;

      for(int var3 = 0; var3 < reserveActions.length; ++var3) {
         if ((var2 = reserveActions[var3]) != null && var2.classType == 6) {
            reserveActions[var3] = null;
            var2.reset();
            var2.setType(var0, var1);
            return var2;
         }
      }

      return new AquaticRuinAction(var0, var1);
   }

   public static Action getCasinoNightAction(int var0, int var1) {
      Action var2 = null;

      for(int var3 = 0; var3 < reserveActions.length; ++var3) {
         if ((var2 = reserveActions[var3]) != null && var2.classType == 7) {
            reserveActions[var3] = null;
            var2.reset();
            var2.setType(var0, var1);
            return var2;
         }
      }

      return new CasinoNightAction(var0, var1);
   }

   public static Action getHillTopAction(int var0, int var1) {
      Action var2 = null;

      for(int var3 = 0; var3 < reserveActions.length; ++var3) {
         if ((var2 = reserveActions[var3]) != null && var2.classType == 8) {
            reserveActions[var3] = null;
            var2.reset();
            var2.setType(var0, var1);
            return var2;
         }
      }

      return new HillTopAction(var0, var1);
   }

   protected static void setSoftKey(int var0, String var1) {
      cCanvas.setSoftLabel(var0, var1);
   }

   public abstract void init();

   public abstract void update();

   public abstract void render(Graphics var1);

   public abstract void disposeResources();

   public abstract void pause();

   public abstract void resume();

   public static void rotatePaint(Graphics var0) {
      var0.setColor(7375521);
      var0.setClip(0, 0, 1000, 500);
      var0.fillRect(0, 0, cCanvas.newWidth, cCanvas.newHeight);
      var0.setColor(255, 255, 255);
      var0.drawString(cCanvas.screenRotatedString[cCanvas.m_Option[0]], cCanvas.newWidth / 2, cCanvas.newHeight / 2, 17);
   }

   static {
      fontHeight = (fT = Font.getFont(0, 0, 8)).getHeight();
   }
}
