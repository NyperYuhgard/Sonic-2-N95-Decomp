package STH2P1;

import Coral.crlCanvas;
import javax.microedition.lcdui.Graphics;

public class EndingState extends GameState {
   public static final byte[] ENDING_SEQUENCE_MAP_DEF = new byte[]{-94, 0, 0, -97, 0, 0, 0, 0, 0, 0, 0, 0, -97, 0, 0, -94, -94, 0, 0, -97, 0, 0, 0, 0, 0, 0, 0, 0, -97, 0, 0, -94, 8, 9, 22, 2, 24, 7, 32, 18, 9, 7, 9, 22, 2, 24, 7, 8, 8, 9, 22, 2, 24, 7, 32, 18, 9, 7, 9, 22, 2, 24, 7, 8, 15, 15, 15, 15, 15, 15, 48, 34, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 48, 34, 15, 15, 15, 15, 15, 15, 15, 15};
   public static int frank = 0;
   private int a = 0;
   private static final String[][] b = new String[][]{{"MUSIC COMPOSED", "BY MASATO NAKAMURA"}, {"MUSIQUE COMPOSÉE", "PAR MASATO NAKAMURA"}, {"MUSICA COMPOSTA", "DA MASATO NAKAMURA"}, {"MUSIK KOMPONIERT", "VON MASATO NAKAMURA"}, {"MÚSICA COMPUESTA", "POR MASATO NAKAMURA"}};
   private static final String[][] c = new String[][]{{"Watch out for", "Sonic the Hedgehog 2 Crash!", "coming soon ..."}, {"Watch out for", "Sonic the Hedgehog 2 Crash!", "coming soon ..."}, {"Watch out for", "Sonic the Hedgehog 2 Crash!", "coming soon ..."}, {"Watch out for", "Sonic the Hedgehog 2 Crash!", "coming soon ..."}, {"Watch out for", "Sonic the Hedgehog 2 Crash!", "coming soon ..."}};

   public EndingState(int var1, Object var2) {
      super.m_LocalState = 10;
      GameState.m_GameFlag = 0;
      GameState.zoneNumber = 1;
      GameState.actNumber = 0;
      this.a = 0;
      frank = 0;
      this.loadMapData(true, true);
      this.initHud();
      State.mActions = new Action[1024];
      GameState.DIFFICULTY_TABLE = new int[3][0];
      GameState.m_FlagWorkCnt = new int[130];
      GameState.m_ActionWorkCnt = new boolean[300];
      Action.prepareCommonImages();
      Action.prepareImages(GameState.zoneNumber);
      Action.prepareBossImages(GameState.zoneNumber);
      this.initSpriteBuffer();
      this.scroll();
      State.mReserves = new int[State.mActions.length][21];
      (State.mSonicAction = this.insertAction(1)).m_Xposi = GameState.PLAYER_START_POS_TBL[GameState.zoneNumber][GameState.actNumber << 1];
      State.mSonicAction.m_Yposi = GameState.PLAYER_START_POS_TBL[GameState.zoneNumber][(GameState.actNumber << 1) + 1];
      State.mSonicAction.m_AutoFrameout = false;
      (State.mTailsAction = this.insertAction(2)).m_Xposi = State.mSonicAction.m_Xposi;
      State.mTailsAction.m_Yposi = State.mSonicAction.m_Yposi;
      State.mTailsAction.m_Xposi_2 = State.mSonicAction.m_Xposi_2;
      State.mTailsAction.m_Yposi_2 = State.mSonicAction.m_Yposi_2;
      State.mTailsAction.m_AutoFrameout = false;
      this.insertAction(222);
      this.sysdirInit();
      if (super.m_ScdTbl == null) {
         super.m_ScdTbl = Utilities.arrayInputDataByte1(Filenames.FILENAMES[16]);
         super.m_ScdTblWk = Utilities.arrayInputDataByte1(Filenames.FILENAMES[17]);
         super.m_ScdTblWk2 = Utilities.arrayInputDataByte1(Filenames.FILENAMES[18]);
      }

      State.m_ScrA_H_Posit = State.mSonicAction.m_Xposi - cCanvas.viewPortWidth / 2;
      State.m_ScrA_V_Posit = State.mSonicAction.m_Yposi - cCanvas.viewPortOffset - cCanvas.viewPortHeight / 2;
      GameState.m_ScrA_VLine = cCanvas.viewPortOffset + cCanvas.viewPortHeight / 2;
      this.scrLimSet(GameState.zoneNumber, GameState.actNumber);
      super.tilesHigh = cCanvas.viewPortHeight / 16 + 2;
      super.tilesAcross = cCanvas.viewPortWidth / 16 + 2;
      super.foregroundScreenMap = new int[super.tilesHigh][super.tilesAcross];
      GameState.m_GameTimer = 0;
      GameState.m_ScrollStop = false;
      cCanvas.am.setAudioBank(this);
      cCanvas.am.loadCurrentAudioBank();
      cCanvas.am.activeAudioBankListener();
      State.setSoftKey(256, (String)null);
      State.setSoftKey(512, (String)null);
      cCanvas.am.bgmset(1);
   }

   public void update() {
      int var1;
      switch(super.m_LocalState) {
      case 1:
         this.updatePauseMenu();
         return;
      case 6:
         this.updateConfirm();
         return;
      case 10:
         if (State.mSonicAction.m_Xposi > GameState.m_ScrALim_Right + 288) {
            this.insertAction(224);
            super.m_LocalState = 12;
            this.a = 480;
         }
      case 12:
         if (this.a > 0) {
            --this.a;
            if (this.a == 0) {
               super.m_LocalState = 11;
               return;
            }
         }

         GameState.m_PlMaxSpdWk = 768;
         this.cleanSpriteBuffer();
         this.actionSetCheck();
         GameState.m_SwData = 2056;
         State.mTailsAction.m_Xspeed = State.mSonicAction.m_Xspeed = GameState.m_PlMaxSpdWk;
         GameState.m_Pl2MaxSpdWk = GameState.m_PlMaxSpdWk;
         this.updateActions();
         this.sysdirCnt();
         this.scroll();
         this.updateCamera();
         return;
      case 11:
         var1 = cCanvas.getNowOnTKeyBuf();
         if (--frank == -30) {
            State.setSoftKey(256, GameState.STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][1]);
            State.setSoftKey(512, (String)null);
         } else if (frank < -30 && ((var1 & 16) != 0 || (var1 & 256) != 0)) {
            super.m_LocalState = 13;
         }

         cCanvas.updateFade();
         return;
      case 13:
         var1 = cCanvas.getNowOnTKeyBuf();
         if (--frank == -30) {
            State.setSoftKey(256, GameState.STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][1]);
            State.setSoftKey(512, (String)null);
         } else if (frank < -30 && ((var1 & 16) != 0 || (var1 & 256) != 0)) {
            State.drawLoadingText = true;
            State.setSoftKey(256, (String)null);
            State.setSoftKey(512, (String)null);
         }

         if (State.loadStage) {
            State.loadStage = false;
            State.drawLoadingText = false;
            cCanvas.setState(4, new Integer(3));
         }
      case 2:
      case 3:
      case 4:
      case 5:
      case 7:
      case 8:
      case 9:
      default:
      }
   }

   public void render(Graphics var1) {
      int var2;
      int var3;
      String var4;
      switch(super.m_LocalState) {
      case 1:
         GameState.drawPauseMenu(var1, GameState.m_PAUSE_Cursor);
         return;
      case 6:
         GameState.drawConfirm(var1, GameState.m_PAUSE_Cursor);
         return;
      case 10:
      case 12:
         this.drawBackgroundParallax(var1);
         this.drawBackgroundMap(var1);
         this.drawActions(var1);
         this.drawSpecialActions(var1);
         this.drawHud(var1);
         return;
      case 11:
         var1.setColor(0, 0, 0);
         var1.fillRect(0, cCanvas.viewPortOffset, cCanvas.viewPortWidth, cCanvas.viewPortHeight);
         var1.setFont(State.fT);
         var4 = b[cCanvas.m_Option[0]][0];
         var2 = (cCanvas.viewPortWidth - State.fT.stringWidth(var4)) / 2;
         var3 = cCanvas.viewPortOffset + cCanvas.viewPortHeight / 2 - State.fontHeight;
         cCanvas.drawString(var1, var4, var2, var3, 16777215, 1336833, 20);
         var4 = b[cCanvas.m_Option[0]][1];
         var2 = (cCanvas.viewPortWidth - State.fT.stringWidth(var4)) / 2;
         var3 += State.fontHeight;
         cCanvas.drawString(var1, var4, var2, var3, 16777215, 1336833, 20);
         return;
      case 13:
         var1.setColor(0, 0, 0);
         var1.fillRect(0, cCanvas.viewPortOffset, cCanvas.viewPortWidth, cCanvas.viewPortHeight);
         if (frank <= 0 && frank >= -30) {
            cCanvas.setFade(2, 0);
         }

         var1.setFont(State.fT);
         var4 = c[cCanvas.m_Option[0]][0];
         var2 = (cCanvas.viewPortWidth - State.fT.stringWidth(var4)) / 2;
         var3 = cCanvas.viewPortOffset + cCanvas.viewPortHeight / 2 - 2 * State.fontHeight;
         cCanvas.drawString(var1, var4, var2, var3, 16777215, 1336833, 20);
         var4 = c[cCanvas.m_Option[0]][1];
         var2 = (cCanvas.viewPortWidth - State.fT.stringWidth(var4)) / 2;
         var3 += State.fontHeight;
         cCanvas.drawString(var1, var4, var2, var3, 16777215, 1336833, 20);
         var4 = c[cCanvas.m_Option[0]][2];
         var2 = (cCanvas.viewPortWidth - State.fT.stringWidth(var4)) / 2;
         var3 += State.fontHeight;
         cCanvas.drawString(var1, var4, var2, var3, 16777215, 1336833, 20);
         if (State.drawLoadingText) {
            TitleState.drawBar(var1, cCanvas.viewPortHeight, 124, true, GameState.STRINGS_LOADING[cCanvas.m_Option[0]], 0);
            State.loadStage = true;
         }

         if (frank >= 60) {
            cCanvas.setFade(-2, 0);
         }
      case 2:
      case 3:
      case 4:
      case 5:
      case 7:
      case 8:
      case 9:
      default:
      }
   }

   public void disposeResources() {
   }

   protected int mapAddressSets(int var1, int var2, byte[] var3) {
      int var6 = 0;
      int var4 = (var1 >> 7) % 32;
      int var5 = (var2 >> 7) % 3;
      var4 |= var5 << 5;
      if (var3.length > var4) {
         var6 = ((var3[var4] & 255) << 7) + ((var1 & 127) >> 4 << 1) + ((var2 & 127) >> 4 << 4);
      }

      return var6;
   }

   protected int getLargeTileNumber(int var1, int var2, byte[] var3) {
      int var4 = 0;
      var1 |= var2 << 5;
      if (var3.length > var1) {
         var4 = var3[var1] & 255;
      }

      return var4;
   }

   protected void drawBGImage(Graphics var1, int var2) {
      byte[][] var9 = super.BGBLK[GameState.zoneNumber];
      int[] var3 = new int[]{State.m_ScrA_H_Posit / 7 & 1023, (int)crlCanvas.mCounter & 1023};

      for(int var4 = 0; var4 < var9.length; ++var4) {
         int var5 = var3[var4] & 15;

         for(int var6 = 0; var6 < 128; var6 += 16) {
            for(int var7 = var3[var4]; var7 < var3[var4] + 240 + var5; var7 += 16) {
               int var8;
               if ((var8 = this.getBlockNumber(var7 & 511, var6, var9[var4], super._mMapData)) < 753 || var8 > 760) {
                  this.drawBlock(var1, var8, var7 - var3[var4] - var5, var6 + 40 + (var4 << 3 << 4));
               }
            }
         }
      }

   }

   public void resume() {
      super.m_LocalState = super.m_LocalState_Backup;
      GameState.m_Accept_Softkey = 0;
      State.setSoftKey(256, (String)null);
      State.setSoftKey(512, (String)null);
      cCanvas.am.resumeAudio();
   }
}
