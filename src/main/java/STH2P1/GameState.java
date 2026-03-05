package STH2P1;

import Coral.crlCanvas;
import Coral.Util.crlUtil;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class GameState extends State {
   protected static final int scdtbl_bin = 16;
   protected static final int scdtblwk_bin = 17;
   protected static final int scdtblwk2_bin = 18;
   public static final int PARAM_ZONE = 0;
   public static final int PARAM_ACT = 1;
   public static final int PARAM_SCORE = 2;
   public static final int PARAM_PL_LIVES = 3;
   public static final int PARAM_EME = 4;
   public static final int PARAM_IS_INIT = 5;
   public static final int PARAM_NUM = 6;
   protected static final int LOCALSTATE_PAUSE = 1;
   protected static final int LOCALSTATE_CONFIRM = 6;
   protected static final int LOCALSTATE_DEMO_SPLASH = 7;
   protected int m_LocalState;
   protected int m_LocalState_Backup;
   private int a;
   public static int zoneNumber = 0;
   public static int actNumber = 0;
   public static final int[] APP1_PROGRESS = new int[]{11, 13, 15, 12, 7};
   public static final int[] APP2_PROGRESS = new int[]{11, 10, 4, 16, 6, 14};
   public static final int STRING_PAUSE = 0;
   protected static final int STRING_SELECT = 1;
   protected static final String[][] STRINGS_PAUSE_MENU = new String[][]{{"Pause", "Select", "Back", "Pause Menu", "Resume Game", "Audio", "Quit", "Main Menu", "Exit", "Exit demo"}, {"Pause", "Sélect.", "Retour", "Menu pause", "Reprendre Jeu", "Audio", "Quitter", "Menu Principal", "Quitter", "Quitter la démo"}, {"Pausa", "Seleziona", "Indietro", "Menu di pausa", "Riprendi partita", "Audio", "Abbandona", "Menu", "Esci", "Fine prova"}, {"Pause", "Wählen", "Zurück", "Pausenmenü", "Spiel fortsetzen", "Audio", "Abbrechen", "Hauptmenü", "Beenden", "Demo beenden"}, {"Pausa", "Selec.", "Atrás", "Menú de Pausa", "Reanudar Partida", "Audio", "Abandonar", "Menú Principal", "Salir", "Finalizar demo"}};
   private static final String[][] b = new String[][]{{"Are you sure?", "Yes", "No"}, {"Etes-vous sûr(e)?", "Oui", "Non"}, {"Sei sicuro?", "Sì", "No"}, {"Bist du sicher?", "Ja", "Nein"}, {"¿Estás seguro?", "Sí", "No"}};
   public static boolean _quitDemo;
   private static final String[][] c = new String[][]{{"Get it", "Menu"}, {"Télécharger", "Menu Principal"}, {"Scarica", "Menu Principale"}, {"Hol's dir", "Hauptmenü"}, {"Descargar", "Menú Principal"}};
   private static final String[][] d = new String[][]{{"Off", "Soft", "Medium", "Loud"}, {"Désactivé", "Faible", "Moyen", "Fort"}, {"Off", "Debole", "Medio", "Forte"}, {"Ein", "Soft", "Mittel", "Hoch"}, {"Apagado", "Bajo", "Medio", "Alto"}};
   protected static final String[] STRINGS_LOADING = new String[]{"Loading...", "Chargement...", "Caricamento...", "Ladevorgang...", "Cargando..."};
   private static final String[] e = new String[]{"Please wait...", "Veuillez patienter...", "Attendere...", "Bitte warten...", "Por favor, espera..."};
   public static final int APP_WHEN_END = 0;
   public static final int APP_NUMBER = 1;
   protected byte[] _mMapData;
   public byte[] _mZoneMapData;
   private int[] f;
   private int[] g;
   byte[][][] BGBLK = new byte[][][]{{{-8, -7, -6, -5}, {-4, -3, -2, -1}}, {{-42, -33, -22, -20}, {-9, -9, -9, -9}}, new byte[0][], new byte[0][], new byte[0][], new byte[0][], new byte[0][], new byte[0][], new byte[0][], new byte[0][], new byte[0][], new byte[0][], {{-79, -78, -77, -76}, {-75, -74, -73, -72}}, {{-96, -95, -94, 0, -92, -91}, {-80, -79, -78, -77, -76, -75}, {-64, -63, -62, -61, -60, -59}, {-48, -47, -46, -45, -44, -43}, {-32, -31, -30, -29, -28, -27}}, new byte[0][], {{-16, -16, -16, -16, -16, -16, -16, -16}, {-29, -28, -27, -26, -25, -24, -23, -22}, {-13, -12, -11, -10, -9, -8, -7, -6}, {-35, -34, -33, -32, -35, -34, -33, -32}, {-21, -20, -19, -18, -21, -20, -19, -21}, {-5, -4, -3, -2, -5, -4, -3, -2}}, new byte[0][]};
   public byte[] m_SCDAData;
   public byte[] m_SCDBData;
   private Image h;
   static final int[][] WATERCOLOR = new int[][]{{128, 0, 128, 128}, {0, 0, 128, 128}, {0, 0, 128, 128}};
   int[] waterData;
   Image waterImage;
   public static boolean m_WaterMode;
   public int[][] m_ActionData;
   public int[][] m_RingData;
   public static Action m_playerEffectAction;
   public static Action m_player2EffectAction;
   public static Action mSonicPlawaAction;
   public static Action mMasterRing;
   public static int m_Pl_Suu;
   public static int m_PlRing;
   public static int m_ChaosCnt;
   public static int m_PlRing_F;
   public static int m_PlRing_F2;
   public static int m_PlRing_T;
   public static int m_PlScore;
   public static int m_PlScore_F;
   public static int m_PlItem;
   public static int m_PlMaxSpdWk;
   public static int m_PlRetSpdWk;
   public static int m_PlAddSpdWk;
   public static int m_Pl2MaxSpdWk;
   public static int m_Pl2RetSpdWk;
   public static int m_Pl2AddSpdWk;
   public static boolean m_PlTimeOver_F;
   public static int m_PlFlag;
   public static int m_PlTime;
   public static int m_Zone_Flag;
   public static int m_WaterPosi_m;
   public static boolean m_WaterFlag;
   public static int m_WaterMovePosi;
   public static final int m_WaterSpeed = 1;
   public static int m_WaterColiFlag;
   public static int m_SSonicTimer;
   public static int m_PlTime_F;
   public static int m_ClChgTimSS;
   public static int m_ClChgFlagSS;
   public static int m_ClChgCntSS;
   public static int m_EmyScoreCnt;
   public static int m_LeverTimer;
   public static int m_BossStart;
   public static int m_BossState;
   public static int m_GameTimer;
   public static int m_SysdirFlag;
   public static int[] m_Sysdirec = new int[16];
   public static int[] m_SysdirSpd = new int[16];
   public static int[] m_SwitchFlag;
   public static int m_ScrALim_Left;
   public static int m_ScrALim_Right;
   public static int m_ScrALim_Up;
   public static int m_ScrALim_Down;
   public static int m_ScrALim2_Up;
   public static int m_ScrALim_N_Left;
   public static int m_ScrALim_N_Right;
   public static int m_ScrALim_N_Up;
   public static int m_ScrALim_N_Down;
   public static int m_Scroll_Start;
   public static int m_ScrollWait;
   public static int m_ScrA_VLine;
   public static int m_SSonicFlag;
   public static int m_GameFlag;
   private static final int[][] i = new int[][]{{210, 210, 210, 0, 0, 0, 0}, {0}, {0}, {0}, {0}, {0}, {0}, {157, 157, 157, 0, 0, 0, 0}, {0}, {0}, {0}, {0}, {748, 749, 750, 751, 752, 753, 754, 755, 756, 757, 758, 759, 59, 59, 59, 59, 59, 59, 59, 59}, {0}, {0}, {22, 23, 0, 0, 30, 31, 0, 0}, {0}};
   private static final int[] j = new int[]{761, 0, 0, 0, 742, 742, 0, 761, 0, 0, 756, 0, 748, 0, 767, 760, 0};
    static final int[][] BGCOLOR = new int[][]{
            {128, 0, 0},    // ID 00:
            {224, 64, 32},  // ID 01:
            {0, 0, 32},     // ID 02
            new int[0],     // ID 03
            {48, 14, 0},     // ID 04
            {48, 14, 0},     // ID 05
            {224, 64, 64},     // ID 06
            {224, 64, 32},  // ID 07:
            {128, 0, 0},     // ID 08
            new int[0],     // ID 09
            {0, 96, 224},     // ID 10
            {43, 0, 40},     // ID 11:
            {0, 0, 0},      // ID 12:
            {0, 0, 32},     // ID 13:
            {0, 0, 0},     // ID 14
            {0, 32, 0},     // ID 15:
            {224, 64, 64}      // ID 16:
    };
    protected static final int[][] PLAYER_START_POS_TBL = new int[][]{
            {96, 655, 96, 687},   // ID 00:
            {96, 180, 0, 0},      // ID 01:
            new int[0],           // ID 02
            new int[0],           // ID 03
            {96, 652, 96, 1516},           // ID 04
            {96, 524},           // ID 05
            {96, 1228},           // ID 06
            {96, 1007, 96, 1711}, // ID 07:
            new int[0],           // ID 08
            new int[0],           // ID 09
            {96, 1708, 96, 1388},           // ID 10
            {96, 1708, 96, 1452},           // ID 11:
            {96, 684, 96, 1420},  // ID 12:
            {96, 492, 96, 300},   // ID 13:
            {96, 301},           // ID 14
            {96, 894, 96, 894},   // ID 15:
            {288, 112}            // ID 16:
    };
    private static final int[][] k = new int[][]{
            {0, 10656, 0, 800, 0, 10560, 0, 1056},      // ID 00:
            {0, 3968, 0, 32},                           // ID 01:
            new int[0],                                 // ID 02
            new int[0],                                 // ID 03
            {0, 8832, 65280, 2048, 0, 7808, 65280, 2048},                                 // ID 04
            {0, 10880, 65280, 2048},                                 // ID 05
            {0, 16383, 0, 1824},                                 // ID 06
            {0, 10240, 0, 1824, 0, 12928, 0, 1824},     // ID 07:
            new int[0],                                 // ID 08
            new int[0],                                 // ID 09
            {0, 12160, 0, 1664, 0, 11520, 0, 1664},                                 // ID 10
            {0, 9088, 960, 1824, 0, 16383, 96, 1824},                                 // ID 11:
            {0, 10144, 0, 1824, 0, 10880, 0, 1824},     // ID 12:
            {0, 10112, 0, 1824, 0, 10880, 0, 1824},     // ID 13:
            {0, 4096, 200, 200},                                 // ID 14
            {0, 10432, 512, 1536, 0, 16383, 384, 1808}, // ID 15:
            {0, 16383, 0, 0}                                  // ID 16:
    };
   private static final int[][] l = new int[][]{{8388608, 0}, {8388608, 0}, {8388608, 0}, {8388608, 0}, {8388608, 0}, {8388608, 0}, {8388608, 0}, {8388608, 0}, {8388608, 0}, {944242688, 15597568}, {545259520, 11796480}, {813694976, 17694720}, {1350565888, 29491200}, {1887436800, 41287680}, {8388608, 0}, {1073741824, 16646144}};
   private static final int[] m = new int[]{131072, 131072, 131072, 131072, 262144, 524288, 524288, 262144, 131072, 131072, 131072, 196608, 327680, 458752, 131072, 131072};
   private static final int[] n = new int[]{16, 24, 32, 48, 32, 8, 64, 64, 56, 56, 32, 48, 80, 112, 64, 64};
   protected static int[][] DIFFICULTY_TABLE;
   public static int m_ScrollA_RightOffset = 80;
   public static int m_ScrollA_RightOffset_dist = 0;
   public static int m_ScrollA_LeftOffset = 0;
   public static int m_ScrollA_LeftOffset_dist = 0;
   public static int m_LimOverFlag;
   public static int m_BossFlag;
   public static int m_ScrChkWork;
   public static int m_SwData = -1;
   public static boolean m_ScrollStop;
   public static int m_dircolm;
   public static int[] m_FlagWorkCnt;
   public static boolean[] m_ActionWorkCnt;
   public byte[] m_ScdTbl;
   public byte[] m_ScdTblWk;
   public byte[] m_ScdTblWk2;
   public static int m_D4_Tmp;
   public static int m_D6_Tmp;
   public static int[] m_Ita0cwk;
   public static int m_SLOTWK_EVN_LEV;
   private static int o;
   private static int p;
   public static int m_Slot_sts;
   public static int m_SLOTWK_HIT_VAL;
   private static int[][] q;
   private Image[] r;
   private Image[] s;
   private static int[][] t = new int[][]{{3, 0, 1, 4, 2, 5, 4, 1}, {3, 0, 1, 4, 2, 5, 0, 2}, {3, 0, 1, 4, 2, 5, 4, 1}};
   private static int[][] u = new int[][]{{8, 819}, {18, 0}, {18, 273}, {36, 546}, {30, 1092}, {30, 1365}, {255, 4095}};
   private static int[] v = new int[]{30, 25, -1, 150, 10, 20};
   private int w;
   private int x;
   public static int m_WaterPosi;
   public static boolean m_ScrollShake;
   private Image y;
   private Image z;
   private static Image A;
   public static final int ACCEPT_NORMAL = 0;
   public static final int ACCEPT_TITLE = 1;
   public static final int ACCEPT_NONE = 2;
   public static final int ACCEPT_DONTTOUCH = 3;
   public static int m_Accept_Softkey;
   static int m_PAUSE_Cursor;
   public static boolean stageClear = false;
   public static int stageClearExtraLifeAudioRequired = 0;
   public static boolean stageClearNextStage = true;
   public boolean m_ForceAtariY;
   public static int m_D0_Tmp;
   private Object B;
   private int C;
   static boolean loading_cont = false;
   private int D = 0;
   private int E = 0;
   public static final int PRIORITY_MAP_BACKGROUND = 0;
   public static final int PRIORITY_MAP_FOREGROUND = 1;
   protected int tilesHigh;
   protected int tilesAcross;
   protected int[][] foregroundScreenMap;
   private int[] F = new int[20];
   private int[][] G = new int[20][128];
   public static int m_ScrA_HZ;
   public static int m_ScrA_VZ;
   public static int m_MoveScrTimer;
   public static int m_MoveScrMode;
   public static boolean m_ScrollMode;
   public static int m_ScrB_V_Offset;
   public static int m_ScrB_H_Offset;
   public static int m_ScrB_VZ;
   public static int m_ScrB_HZ;
   private int[] H;
   private int I;
   private static Image[] J;
   private static int[][] K = new int[][]{{1, 0, 96, 8, 16, 0, 0}, {1, 8, 96, 8, 16, 0, 0}, {1, 16, 96, 8, 16, 0, 0}, {1, 24, 96, 8, 16, 0, 0}, {1, 32, 96, 8, 16, 0, 0}, {1, 40, 96, 8, 16, 0, 0}, {1, 48, 96, 8, 16, 0, 0}, {1, 56, 96, 8, 16, 0, 0}, {1, 64, 96, 8, 16, 0, 0}, {1, 72, 96, 8, 16, 0, 0}, {1, 200, 32, 16, 16, 0, 0}, {0, 112, 176, 120, 16, 0, 0}};
   private static final int[][] L = new int[][]{{8, 10, 9, 10}, {7, 4}, {15, 4, 16, 4, 17, 4, 18, 4, 19, 4, 20, 4, 13, 4, 14, 4}, {45, 4, 46, 4, 47, 4, 48, 4}};
   private static final int[][] M = new int[][]{{135, 20, 136, 20}, {2, 4}, {16, 4, 17, 4, 18, 4, 19, 4, 20, 4, 21, 4, 14, 4, 15, 4}, {50, 4, 51, 4}};
   private Image[] N;
   private int O;
   private static int P;
   private static int Q;
   private int R;
   private int S;
   private int T;
   private static int U;
   private static int V;
   private int W;
   private int X;
   private int Y;
   private static int Z;
   public static final byte STRING_FREE_TRIAL = 0;
   public static final byte STRING_FIRST_LEVEL = 4;
   public static final String[][] FULL_GAME = new String[][]{{"Free Trial", "Trial over!", "Download the full game now!", "You have reached the end of the demo. But don't worry - get the full version from your operator's game service now! Just click on the home page icon in your phone's main menu, or use your phone browser and enter the address.", "First level for free"}, {"Démo gratuite", "Démo Terminée !", "Telechargez le jeu complet maintenant !", "La démo est terminée. Mais ne vous inquiétez pas - vous pouvez dès maintenant obtenir la version complète du jeu auprès de votre opérateur! Il suffit de cliquer sur l'icône de démarrage dans le menu principal de votre téléphone, ou bien d'utiliser votre navigateur et d'entrer l'adresse.", "Premier niveau gratuit"}, {"Prova gratuita", "Prova finita!", "Scarica il gioco completo ora!", "Sei arrivato alla fine della demo. Non preoccuparti, puoi ottenere subito la versione completa dal servizio giochi del tuo operatore! Clicca sull'icona della homepage nel menu del tuo telefono, oppure apri il browser e inserisci l'indirizzo.", "Primo livello gratuito"}, {"FREIE TESTVERSION", "Testzeit vorbei!", "Laden dir die Vollversion jetzt herunter!", "Du hast das ende der demo erreicht. Aber keine sorge - hol dir jetzt die vollversion von deinem anbieter! Klicke dazu einfach auf das homepage-symbol im hauptmenü deines handys oder gib die adresse im browser deines handys ein.", "Der erste Level ist gratis"}, {"Demo gratis", "¡Demo terminada!", "¡Descárgate la versión completa del juego!", "La versión de demostración ha caducado, pero no te preocupes. Puedes conseguir la versión completa a través del portal de juegos de tu operadora. Haz clic en el icono de la página de inicio del menú principal de tu teléfono, o introduce la dirección del portal en el navegador de tu móvil.", "¡Descárgate la versión completa del juego!"}};
   private static final String[] aa = new String[]{"Get more great games from your operator's game service! Just click on the homepage icon in your phone's main menu, or use your phone browser and enter the address!", "Obtenez plus de jeux par le biais des services de votre opérateur ! Il suffit de cliquer sur l'icône de démarrage dans le menu principal de votre téléphone, ou bien d'utiliser votre navigateur et d'entrer l'adresse !", "Scarica altri grandi giochi dal servizio giochi del tuo operatore! Clicca sull'icona della homepage nel menu principale del tuo telefono, oppure usa il browser del telefono e inserisci l'indirizzo.", "Hol' dir noch mehr spiele vom spieledienst deines anbieters! Klicke dazu einfach auf das homepage-symbol im hauptmenü deines handys oder gib die adresse im browser deines handys ein!", "¡Descárgate más juegos con el servicio de juegos de tu operadora! Haz clic en el icono de la página de inicio del menú principal de tu teléfono o utiliza el navegador de tu móvil y escribe la dirección del portal."};

   protected GameState() {
   }

   public GameState(int var1, Object var2) {
      cCanvas.am.stopAllAudio();
      super.mMode = var1;
      this.B = var2;
   }

   public void init() {
      switch(super.mMode) {
      case 12:
         this.gameInit(this.B);
         break;
      case 20:
         this.a(this.B);
      }

      this.B = null;
   }

   public void gameInit(Object var1) {
      DIFFICULTY_TABLE = Utilities.arrayInputDataInt2("/DIFFICULTY_TABLE.bin");
      Action.prepareCommonImages();
      this.a(true, true, (int[])((int[])var1));
      this.initHud();
      this.tilesHigh = cCanvas.viewPortHeight / 16 + 2;
      this.tilesAcross = cCanvas.viewPortWidth / 16 + 2;
      this.foregroundScreenMap = new int[this.tilesHigh][this.tilesAcross];
      if (this.m_LocalState != 1) {
         this.m_LocalState = 0;
      }

   }

   protected void initSpriteBuffer() {
      for(int var1 = 0; var1 < super.mSpriteBuffer.length; ++var1) {
         super.mSpriteBuffer[var1] = new GameSprite();
      }

   }

   public void update() {
      int var1;
      switch(super.mMode) {
      case 12:
         int[] var3;
         switch(this.m_LocalState) {
         case 0:
            m_GameTimer = m_GameTimer + 1 & '\uffff';
            byte var10000;
            if (m_PlTime_F == 0) {
               var10000 = 0;
            } else if ((var1 = decodePlTime(m_PlTime)) >= 35999) {
               var10000 = -1;
            } else {
               m_PlTime = encodePlTime(var1 + 1);
               var10000 = 0;
            }

            if (var10000 != 0) {
               Action var4 = this.getSonicAction();
               this.playDieSet(var4);
               m_PlTimeOver_F = true;
               m_PlTime_F = 0;
               State.m_PlTime_s = 0;
            }

            if (m_Accept_Softkey == 0 && (cCanvas.getNowOnTKeyBuf() & 512) != 0) {
               this.pause();
            }

            this.cleanSpriteBuffer();
            if ((zoneNumber == 13 || zoneNumber == 14 || zoneNumber == 15) && m_WaterMode) {
               if (m_Scroll_Start == 0 || State.mSonicAction.m_R_No0 != 6) {
                  if (zoneNumber == 13 && actNumber == 1 && State.m_ScrA_H_Posit >= 7688) {
                     m_WaterMovePosi = 1296;
                  }

                  if (m_WaterMovePosi < m_WaterPosi_m) {
                     --m_WaterPosi_m;
                  } else if (m_WaterMovePosi > m_WaterPosi_m) {
                     ++m_WaterPosi_m;
                  }
               }

               m_WaterFlag = false;
               var1 = 0;
               if (zoneNumber != 15) {
                  var1 = m_Sysdirec[0] >>> 24 >> 1;
               }

               m_WaterPosi = m_WaterPosi_m + var1;
               if (State.mSonicAction.m_R_No0 == 6) {
                  State.mSonicAction.m_airClock = 0;
               } else {
                  m_WaterFlag = true;
               }
            }

            this.actionSetCheck();
            this.updateActions();
            this.sysdirCnt();
            this.scroll();
            if (State.loadStage) {
               State.drawLoadingText = false;
               State.loadStage = false;
               var3 = new int[]{zoneNumber, actNumber, m_PlScore * 10, m_Pl_Suu, m_ChaosCnt, 0};
               this.m_LocalState = 0;
               this.a(false, false, var3);
            }

            if (m_GameFlag == 0) {
               this.updateCamera();
            } else {
               State.drawLoadingText = true;
            }

            return;
         case 1:
            this.updatePauseMenu();
            return;
         case 2:
            ++this.a;
            if (this.a >= 120) {
               var3 = new int[]{zoneNumber, actNumber, m_PlScore * 10, m_PlRing, m_Pl_Suu, m_ChaosCnt, 0};
               cCanvas.setState(16, var3);
               return;
            }
            break;
         case 3:
            ++this.a;
            if (this.a >= 60) {
               var3 = new int[]{zoneNumber, actNumber, m_PlScore * 10, m_PlRing, m_Pl_Suu, m_ChaosCnt, 0};
               super.mMode = 20;
               this.a(var3);
               return;
            }
            break;
         case 4:
            return;
         case 5:
            if (TitleState.mDemo > 0) {
               stageClear = false;
               this.m_LocalState = 7;
               if (TitleState.mDemo == 1) {
                  State.setSoftKey(256, (String)null);
               } else {
                  State.setSoftKey(256, c[cCanvas.m_Option[0]][0]);
               }

               if (_quitDemo) {
                  State.setSoftKey(512, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][8]);
               } else {
                  State.setSoftKey(512, c[cCanvas.m_Option[0]][1]);
               }

               return;
            }

            ++this.a;
            if (this.a >= 60) {
               if (actNumber + 1 != Filenames.ZONEMAP_FILENAME[zoneNumber].length) {
                  this.d(zoneNumber, actNumber + 1);
                  var3 = new int[]{zoneNumber, actNumber + 1, m_PlScore * 10, m_Pl_Suu, m_ChaosCnt, 1};
                  this.m_LocalState = 0;
                  this.a(false, true, var3);
                  return;
               }

               boolean var2 = false;

               for(var1 = 0; var1 < APP1_PROGRESS.length; ++var1) {
                  if (APP1_PROGRESS[var1] == zoneNumber) {
                     ++var1;
                     break;
                  }
               }

               if (var1 != APP1_PROGRESS.length) {
                  this.d(APP1_PROGRESS[var1], 0);
                  var3 = new int[]{APP1_PROGRESS[var1], 0, m_PlScore * 10, m_Pl_Suu, m_ChaosCnt, 1};
                  this.m_LocalState = 0;
                  this.a(true, true, var3);
                  return;
               }

               addRanking();
               cCanvas.setState(32, (Object)null);
               this.m_LocalState = 4;
            }
            break;
         case 6:
            this.updateConfirm();
            break;
         case 7:
            if (State.loadStage) {
               State.loadStage = false;
               cCanvas.setState(4, new Integer(3));
            }

            if (((var1 = cCanvas.getNowOnTKeyBuf()) == 16 || var1 == 256) && TitleState.mDemo == 2) {
               STH2P1.platRequest(TitleState.mDemoURL);
               STH2P1.quitApp();
            } else {
               if (var1 != 512) {
                  return;
               }

               if (!_quitDemo) {
                  State.drawLoadingText = true;
                  State.setSoftKey(256, (String)null);
                  State.setSoftKey(512, (String)null);
                  return;
               }

               STH2P1.quitApp();
            }
         }

         return;
      case 20:
         var1 = cCanvas.getNowOnTKeyBuf();
         if (State.loadStage) {
            loading_cont = true;
            State.drawLoadingText = false;
            State.loadStage = false;
            if (this.X <= 280) {
               cCanvas.setState(4, new Integer(3));
               this.continuemd_disposeImages();
               return;
            }

            this.H = new int[]{zoneNumber, actNumber, 0, 3, 0, 1};
            this.continuemd_disposeImages();
            cCanvas.am.stopAllAudio();
            super.mMode = 12;
            this.m_LocalState = 0;
            this.a(false, true, this.H);
         } else {
            switch(Z) {
            case 0:
               --this.I;
               if (this.I <= 0 || (var1 & 512) != 0) {
                  cCanvas.am.stopAllAudio();
                  State.setSoftKey(256, (String)null);
                  State.setSoftKey(512, (String)null);
                  State.drawLoadingText = true;
                  return;
               }

               if ((var1 & 256) == 0 && (var1 & 16) == 0) {
                  ++this.O;
                  if (this.O >= L[P][(Q << 1) + 1]) {
                     this.O = 0;
                     if (++Q << 1 >= L[P].length) {
                        Q = 0;
                     }
                  }

                  ++this.S;
                  if (this.S >= M[U][(V << 1) + 1]) {
                     this.S = 0;
                     if (++V << 1 >= M[U].length) {
                        V = 0;
                        return;
                     }
                  }
                  break;
               }

               Q = 0;
               P = 1;
               this.R = 0;
               Z = 1;
               State.setSoftKey(256, (String)null);
               State.setSoftKey(512, (String)null);
               return;
            case 1:
               ++this.O;
               ++this.S;
               if (this.S >= M[U][(V << 1) + 1]) {
                  this.S = 0;
                  if (++V << 1 >= M[U].length) {
                     V = 0;
                  }
               }

               if (this.O >= L[P][(Q << 1) + 1]) {
                  this.O = 0;
                  if (++Q << 1 >= L[P].length) {
                     Q = 0;
                     if (P == 1) {
                        P = 2;
                        this.Y = 0;
                        U = 2;
                        this.T = 0;
                        return;
                     }

                     if (P == 2) {
                        ++this.Y;
                        if (this.Y == 2) {
                           P = 3;
                           U = 3;
                           return;
                        }
                     } else if (P == 3) {
                        Z = 2;
                        return;
                     }
                  }
               }
               break;
            case 2:
               ++this.O;
               if (this.O >= L[P][(Q << 1) + 1]) {
                  this.O = 0;
                  if (++Q << 1 >= L[P].length) {
                     Q = 0;
                  }
               }

               this.W += 8;
               ++this.S;
               if (this.S >= M[U][(V << 1) + 1]) {
                  this.S = 0;
                  if (++V << 1 >= M[U].length) {
                     V = 0;
                  }
               }

               if (this.W > this.X + 20) {
                  this.X += 8;
               }

               if (this.X > 280) {
                  State.setSoftKey(256, (String)null);
                  State.setSoftKey(512, (String)null);
                  State.drawLoadingText = true;
               }
            }
         }
      }

   }

   protected void updateCamera() {
      if (!m_ScrollStop) {
         int var2 = m_ScrALim_Left + m_ScrollA_LeftOffset;
         int var1 = m_ScrALim_Right + m_ScrollA_RightOffset + m_ScrollA_LeftOffset;
         if (m_ScrollA_LeftOffset < m_ScrollA_LeftOffset_dist) {
            m_ScrollA_LeftOffset = Math.min(m_ScrollA_LeftOffset_dist, m_ScrollA_LeftOffset + 1);
         } else if (m_ScrollA_LeftOffset > m_ScrollA_LeftOffset_dist) {
            m_ScrollA_LeftOffset = Math.max(m_ScrollA_LeftOffset_dist, m_ScrollA_LeftOffset - 1);
         }

         if (m_ScrollA_RightOffset < m_ScrollA_RightOffset_dist) {
            m_ScrollA_RightOffset = Math.min(m_ScrollA_RightOffset_dist, m_ScrollA_RightOffset + 1);
         } else if (m_ScrollA_RightOffset > m_ScrollA_RightOffset_dist) {
            m_ScrollA_RightOffset = Math.max(m_ScrollA_RightOffset_dist, m_ScrollA_RightOffset - 1);
         }

         State.m_ScrA_H_Posit = Math.min(Math.max(State.mSonicAction.m_Xposi - 120, var2), var1);
         var2 = Utilities.ext(State.mSonicAction.m_Yposi) - m_ScrA_VLine;
         if (m_ScrALim_Up != 65280) {
            State.m_ScrA_V_Posit = Math.min(Math.max(var2, m_ScrALim_Up - 40 - 16), m_ScrALim_Down - 40 - 16);
         } else {
            State.m_ScrA_V_Posit = var2 & 2047;
         }

         if (State.m_ScrA_H_Posit < 0) {
            State.m_ScrA_H_Posit = 0;
         }

         if (State.m_ScrA_V_Posit < 0) {
            State.m_ScrA_V_Posit = 0;
         }
      }

   }

   public void render(Graphics var1) {
      var1.setFont(State.fT);
      switch(super.mMode) {
      case 12:
         try {
            if (loading_cont) {
               if (this.m_LocalState == 1) {
                  cCanvas.setShade(192, 0, crlCanvas.getGameHeight() - 24);
                  cCanvas.fillShade(var1);
                  int var9 = crlCanvas.getGameWidth() - 64;
                  TitleState.drawBar(var1, 0, crlCanvas.getGameWidth(), true, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][3], 0);
                  var1.setFont(State.fT);
                  TitleState.drawBar(var1, Utilities.scale(110), var9, true, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][4], 0);
                  if (cCanvas.screenRotated) {
                     State.rotatePaint(var1);
                  }
               }
            } else {
               if (m_ScrollShake && this.m_LocalState == 0) {
                  this.D = -Utilities.getRandom() % 3;
                  this.E = -Utilities.getRandom() % 3;
                  var1.translate(this.D, this.E);
               } else {
                  this.D = 0;
                  this.E = 0;
               }

               this.drawBackgroundParallax(var1);
               this.drawBackgroundMap(var1);
               this.drawActions(var1);
               if (m_ScrollShake && this.m_LocalState == 0) {
                  var1.translate(-this.D, -this.E);
                  var1.setClip(0, 0, crlCanvas.getGameWidth(), crlCanvas.getGameHeight());
               }

               Graphics var3 = var1;
               GameState var10 = this;
               int var4;
               if ((zoneNumber == 13 || zoneNumber == 14 || zoneNumber == 15) && m_WaterMode && State.m_ScrA_V_Posit + 40 + 240 > m_WaterPosi) {
                  var4 = m_WaterPosi - State.m_ScrA_V_Posit;
                  int var5 = 0;
                  if (var4 < cCanvas.viewPortOffset) {
                     var5 = 240;
                     var4 = 40;
                  } else if (var4 < 280) {
                     var5 = 280 - var4;
                  }

                  var5 = Utilities.scale(var5);
                  var4 = Utilities.scale(var4) / 2 << 1;

                  for(int var6 = 0; var6 < var5; var6 += 16) {
                     var3.drawImage(var10.waterImage, 0, var4 + var6, 20);
                  }
               }

               this.drawSpecialActions(var1);
               this.drawHud(var1);
               if (State.drawLoadingText) {
                  State.loadStage = true;
                  TitleState.drawBar(var1, cCanvas.viewPortHeight - 24, 124, true, STRINGS_LOADING[cCanvas.m_Option[0]], 0);
               }

               switch(this.m_LocalState) {
               case 1:
                  drawPauseMenu(var1, m_PAUSE_Cursor);
                  return;
               case 2:
                  var1.setColor(16777215);
                  var1.fillRect(0, 0, cCanvas.viewPortWidth, cCanvas.viewPortHeight);
                  return;
               case 3:
               case 4:
                  var1.setColor(0);
                  var1.fillRect(0, cCanvas.viewPortOffset, cCanvas.viewPortWidth, cCanvas.viewPortHeight);
                  return;
               case 5:
                  var1.setColor(0);
                  var1.fillRect(0, cCanvas.viewPortOffset, cCanvas.viewPortWidth, cCanvas.viewPortHeight);
                  System.out.println("loading...a");
                  TitleState.drawBar(var1, cCanvas.viewPortHeight, 124, true, STRINGS_LOADING[cCanvas.m_Option[0]], 0);
                  return;
               case 6:
                  drawConfirm(var1, m_PAUSE_Cursor);
               default:
                  return;
               case 7:
                  cCanvas.setShade(192, 0, crlCanvas.getGameHeight() - 24);
                  cCanvas.fillShade(var1);
                  var1.setFont(State.fT);
                  TitleState.drawBar(var1, 0, crlCanvas.getGameWidth(), true, FULL_GAME[cCanvas.m_Option[0]][0], 0);
                  int var11 = cCanvas.viewPortWidth / 2;
                  if (TitleState.mDemo == 1) {
                     var4 = cCanvas.viewPortOffset + cCanvas.viewPortHeight / 3;
                     cCanvas.drawString(var1, FULL_GAME[cCanvas.m_Option[0]][1], var11, var4 - State.fontHeight, 16777215, 1336833, 33);
                     drawTextWrapped(var1, FULL_GAME[cCanvas.m_Option[0]][3], 13, var4, crlCanvas.getGameWidth() - 16);
                  } else {
                     var4 = cCanvas.viewPortOffset + cCanvas.viewPortHeight / 2;
                     cCanvas.drawString(var1, FULL_GAME[cCanvas.m_Option[0]][1], var11, var4 - State.fontHeight, 16777215, 1336833, 33);
                     drawTextWrapped(var1, FULL_GAME[cCanvas.m_Option[0]][2], 13, var4, crlCanvas.getGameWidth() - 16);
                  }

                  if (State.drawLoadingText) {
                     System.out.println("loading...15");
                     TitleState.drawBar(var1, cCanvas.viewPortHeight - 24, 124, true, STRINGS_LOADING[cCanvas.m_Option[0]], 0);
                     State.loadStage = true;
                     State.drawLoadingText = false;
                  }
               }
            }
            break;
         } catch (Exception var8) {
            return;
         }
      case 20:
         try {
            PlayerAction.game_over_mid = false;
            if (!loading_cont) {
               var1.setColor(0);
               var1.fillRect(0, cCanvas.viewPortOffset, cCanvas.viewPortWidth, cCanvas.viewPortHeight);
               Utilities.drawImage(var1, J, K, 11, 0, 61, 82, 0, 0);
               Utilities.drawImage(var1, J, K, 10, 0, 91, 123, 0, 0);
               Utilities.drawImage(var1, J, K, 10, 0, 131, 123, 0, 0);
               int var2 = Math.min(this.I / 64, 10);
               Utilities.drawImage(var1, J, K, var2 / 10, 0, 111, 123, 0, 0);
               Utilities.drawImage(var1, J, K, var2 % 10, 0, 121, 123, 0, 0);
               Utilities.drawImage(var1, this.N, PlayerAction.PLAY20_Table, M[U][V << 1], this.T, this.X, 186, 0, 0);
               Utilities.drawImage(var1, this.N, PlayerAction.PLAY00_Table, L[P][Q << 1], this.R, this.W, 180, 0, 0);
               if (State.drawLoadingText) {
                  System.out.println("loading...4");
                  TitleState.drawBar(var1, cCanvas.viewPortHeight - 24, 124, true, STRINGS_LOADING[cCanvas.m_Option[0]], 0);
                  State.loadStage = true;
               }

               return;
            }

            cCanvas.setShade(192, 0, crlCanvas.getGameHeight() - 24);
            cCanvas.fillShade(crlCanvas._mGraphics);
         } catch (Exception var7) {
         }
      }

   }

   protected void drawBackgroundParallax(Graphics var1) {
      var1.setColor(BGCOLOR[zoneNumber][2], BGCOLOR[zoneNumber][1], BGCOLOR[zoneNumber][0]);
      var1.fillRect(-this.D, cCanvas.viewPortOffset - this.E, cCanvas.viewPortWidth - this.D, cCanvas.viewPortHeight - this.E);
      this.drawBGImage(var1, 0);
   }

   protected void drawBackgroundMap(Graphics var1) {
      this.a((Graphics)var1, 0);
   }

   protected void initHud() {
      try {
         if (this.y == null) {
            this.y = Image.createImage("/Sonic2-bar.png");
            this.z = Image.createImage("/Sonic2-number.png");
            A = Image.createImage("/arrows.png");
         }

      } catch (Exception var1) {
      }
   }

   protected void loadMapData(boolean var1, boolean var2) {
      if (var1) {
         try {
            this.h = null;
            crlUtil.garbageWait();
            this.h = Image.createImage(Filenames.BLK_FILENAME[zoneNumber]); //Level Art
         } catch (Exception var3) {
         }

         this._mMapData = Utilities.arrayInputDataByte1(Filenames.MAP_FILENAME[zoneNumber]); //128x128 Chunks
         this.g = Utilities.arrayInputDataInt1(Filenames.TILEMAP_FILENAME[zoneNumber]);
         byte[] var4 = Utilities.arrayInputDataByte1(Filenames.PRI_FILENAME[zoneNumber]);
         this.f = decodePriority(var4);
         this.m_SCDAData = Utilities.arrayInputDataByte1(Filenames.SC_FILENAME[zoneNumber][0]); //Collision 1 (Probably)
         this.m_SCDBData = Utilities.arrayInputDataByte1(Filenames.SC_FILENAME[zoneNumber][1]); //Collision 2 (Probably)
      }

      if (var2) {
         if (zoneNumber == 1) {
            this._mZoneMapData = EndingState.ENDING_SEQUENCE_MAP_DEF;
         } else {
            this._mZoneMapData = Utilities.arrayInputDataByte1(Filenames.ZONEMAP_FILENAME[zoneNumber][actNumber]); //Level Layout
         }

         this.m_ActionData = Utilities.arrayInputDataInt2(Filenames.ACTION_FILENAME[zoneNumber][actNumber]); //Objects Layout
         if (Filenames.RING_FILENAME[zoneNumber].length == 0) {
            this.m_RingData = new int[0][];
            return;
         }

         this.m_RingData = Utilities.arrayInputDataInt2(Filenames.RING_FILENAME[zoneNumber][actNumber]); //Rings Layout
      }

   }

   public static int[] decodePriority(byte[] var0) {
      int var1 = 0;
      int[] var2 = new int[var0.length << 3];

      for(int var3 = 0; var3 < var0.length; ++var3) {
         for(int var4 = 7; var4 >= 0; --var4) {
            if ((var0[var3] & 1 << var4) != 0) {
               var2[var1] = 15;
            } else {
               var2[var1] = 0;
            }

            ++var1;
         }
      }

      return var2;
   }

   private void a(Graphics var1, int var2) {
      boolean var20 = var2 != 0;
      int var3 = State.m_ScrA_H_Posit & '\ufff0';
      int var4;
      int var5 = (var4 = State.m_ScrA_V_Posit + 40 & '\ufff0') + 240 + 16;
      int var6 = var3 + 240 + 16;
      int var7 = var4 - State.m_ScrA_V_Posit;
      int var8 = 0;

      for(var4 = var4; var4 < var5; var4 += 16) {
         int var9 = var3 - State.m_ScrA_H_Posit;
         int var10 = 0;

         for(int var11 = var3; var11 < var6; var11 += 16) {
            int var12;
            if (!var20) {
               if (((var12 = this.getBlockNumber(var11, var4, this._mZoneMapData, this._mMapData)) & 512) != 0) {
                  var12 = this.a(zoneNumber, var12 & 1023) | var12 & 'ﰀ';
               }

               label47: {
                  if (zoneNumber == 12) {
                     int var15 = var12 & 1023;
                     boolean var10000;
                     if (var15 >= 748 && var15 < 760) {
                        var15 -= 748;
                        int var18 = (var15 & 1) << 4;
                        int var19 = (var15 & 2) << 3;
                        var15 = (var15 & 12) >> 2;
                        var1.drawRegion(this.r[var15], var18, var19, 16, 16, 0, Utilities.scale(var9), Utilities.scale(var7), 20);
                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     if (var10000) {
                        var12 = -1;
                        break label47;
                     }
                  }

                  if (this.a(var12) == 0) {
                     this.drawBlock(var1, var12, var9, var7);
                     var12 = -1;
                  }
               }

               this.foregroundScreenMap[var8][var10] = var12;
            } else if ((var12 = this.foregroundScreenMap[var8][var10]) != -1) {
               this.drawBlock(var1, var12, var9, var7);
            }

            var9 += 16;
            ++var10;
         }

         var7 += 16;
         ++var8;
      }

   }

   protected int getBlockNumber(int var1, int var2, byte[] var3, byte[] var4) {
      int var5 = 0;

      try {
         int var7 = this.mapAddressSets(var1, var2, var3);
         var5 = ((var4[var7] & 255) << 8 | var4[var7 + 1] & 255) & '\uffff';
      } catch (Exception var6) {
      }

      return var5;
   }

   private static int a(int var0, int var1, byte[] var2, byte[] var3) {
      int var4 = 0;

      try {
         int var5 = 0;
         int var6 = var0 >> 7 & 127 | var1 << 1 & 3840;
         if (var2.length > var6) {
            var6 += 128;
            var5 = var2[var6] & 255;
            if (zoneNumber == 12 && m_Zone_Flag >= 4 && m_ScrALim_Right == 10464 && var5 == 221) {
               var5 = 249;
            }

            var5 = (var5 <<= 7) + ((var0 & 127) >> 4 << 1) + ((var1 & 127) >> 4 << 4);
         }

         var4 = ((var3[var5] & 255) << 8 | var3[var5 + 1] & 255) & '\uffff';
      } catch (Exception var7) {
      }

      return var4;
   }

   protected int mapAddressSets(int var1, int var2, byte[] var3) {
      int var5 = 0;
      int var4 = var1 >> 7 & 127 | var2 << 1 & 3840;
      if (var3.length > var4) {
         var5 = var3[var4] & 255;
         if (zoneNumber == 12 && m_Zone_Flag >= 4 && m_ScrALim_Right == 10464 && var5 == 221) {
            var5 = 249;
         }

         var5 = (var5 <<= 7) + ((var1 & 127) >> 4 << 1) + ((var2 & 127) >> 4 << 4);
      }

      return var5;
   }

   protected int getLargeTileNumber(int var1, int var2, byte[] var3) {
      int var4 = 0;
      var1 = var1 >> 7 & 127 | var2 << 1 & 3840;
      if (var3.length > var1) {
         var4 = var3[var1] & 255;
      }

      return var4;
   }

   private int a(int var1, int var2) {
      var1 = 0;
      int var3;
      if ((var3 = var2 - j[zoneNumber]) >= 0 && var3 < i[zoneNumber].length) {
         var1 = i[zoneNumber][var3];
      } else if (var2 < this.f.length) {
         var1 = var2;
      }

      return var1;
   }

   private int a(int var1) {
      int var2 = 0;
      if (this.f.length > (var1 & 1023)) {
         var2 = this.f[var1 & 1023] == 0 ? 0 : 1;
      }

      return var2;
   }

   public void drawBlock(Graphics var1, int var2, int var3, int var4) {
      if (var3 >= -16 && var4 >= 24 && var3 <= 240 && var4 <= 280) {
         int var5 = var2;
         if ((var2 & 1023) < this.g.length) {
            var5 = this.g[var2 & 1023];
         }

         if (var5 != 0) {
            int var6 = (var5 &= 1023) % 20 << 4;
            var5 = var5 / 20 << 4;
            boolean var7 = false;
            byte var9;
            switch(var2 & 3072) {
            case 0:
               var9 = 0;
               break;
            case 1024:
               var9 = 1;
               break;
            case 2048:
               var9 = 2;
               break;
            case 3072:
               var9 = 3;
               break;
            default:
               return;
            }

            try {
               Utilities.drawImage(var1, this.h, var3, var4, var6, var5, 16, 16, var9, 0);
            } catch (Exception var8) {
            }
         }
      }
   }

   protected void scrLimSet(int var1, int var2) {
      m_ScrALim_Left = m_ScrALim_N_Left = k[var1][var2 << 2];
      m_ScrALim_Right = m_ScrALim_N_Right = k[var1][(var2 << 2) + 1];
      m_ScrALim_Up = m_ScrALim_N_Up = k[var1][(var2 << 2) + 2];
      m_ScrALim_Down = m_ScrALim_N_Down = k[var1][(var2 << 2) + 3];
   }

   protected void updateActions() {
      if (State.mActions != null) {
         boolean var1 = State.mSonicAction.m_R_No0 >= 6;

         for(int var2 = 0; var2 < State.mActions.length; ++var2) {
            if (State.mActions[var2] != null && State.mActions[var2].m_Actno != 0 && (!var1 || State.mActions[var2].classType == 1 || State.mActions[var2].classType == 2)) {
               State.mActions[var2].patset(this);
               State.mActions[var2].mBlink = false;
               State.mActions[var2].update(this);
            }
         }

      }
   }

   protected void drawActions(Graphics var1) {
      Utilities.reset1DIntArray(this.F);
      int var2;
      if (State.mActions != null) {
         for(var2 = 0; var2 < State.mActions.length; ++var2) {
            if (State.mActions[var2] != null && State.mActions[var2].m_Patbase_Image != null && State.mActions[var2].m_Patbase_Table != null && (!State.mActions[var2].mBlink || (cCanvas.m_ScreenFrame & 1) == 0) && ((State.mActions[var2].m_Actflg & 128) != 0 || State.mActions[var2].m_Actno == 21)) {
               State.mActions[var2].autoDraw(var1, this);
            }
         }
      }

      int var3;
      if (super.mSpriteBuffer != null) {
         for(var2 = 0; var2 < super.mSpriteBufferSize; ++var2) {
            if ((var3 = super.mSpriteBuffer[var2].m_Sprpri + ((super.mSpriteBuffer[var2].m_Sproffset & '耀') == 0 ? 0 : 10)) >= 0 && var3 < 20 && this.F[var3] < this.G[var3].length) {
               this.G[var3][this.F[var3]++] = var2;
            }
         }

         for(var2 = 9; var2 >= 0; --var2) {
            for(var3 = this.F[var2] - 1; var3 >= 0; --var3) {
               super.mSpriteBuffer[this.G[var2][var3]].draw(var1);
            }
         }
      }

      this.drawPostSprite(var1);

      for(var2 = 9; var2 >= 0; --var2) {
         for(var3 = this.F[var2 + 10] - 1; var3 >= 0; --var3) {
            super.mSpriteBuffer[this.G[var2 + 10][var3]].draw(var1);
         }
      }

   }

   public void drawPostSprite(Graphics var1) {
      if (m_ScrollMode && zoneNumber == 7) {
         Graphics var3 = var1;
         GameState var2 = this;

         for(int var4 = State.m_ScrB_V_Posit & -16; var4 < State.m_ScrB_V_Posit + 40 + 240 + 16; var4 += 16) {
            for(int var5 = State.m_ScrB_H_Posit & -16; var5 < State.m_ScrB_H_Posit + 240 + 16; var5 += 16) {
               int var6;
               if (((var6 = a(var5, var4 & 2047, var2._mZoneMapData, var2._mMapData)) & 512) != 0) {
                  var6 = var2.a(zoneNumber, var6 & 1023) | var6 & 'ﰀ';
               }

               var2.drawBlock(var3, var6, var5 - State.m_ScrB_H_Posit, var4 - State.m_ScrB_V_Posit);
            }
         }
      }

      this.a((Graphics)var1, 15);
   }

   protected void cleanSpriteBuffer() {
      super.mSpriteBufferSize = 0;
   }

   public int[] fCol(int var1, int var2, int var3, Action var4) {
      if ((var4.m_Cddat & 8) != 0) {
         return new int[]{0, 0};
      } else {
         switch(var3 = var4.m_Direc) {
         case 32:
            var3 = 0;
            break;
         case 160:
            var3 = 128;
            break;
         default:
            var3 = var3 + 32 & 192;
         }

         Object var5 = null;
         int var6;
         int var7;
         int var8;
         int[] var9;
         switch(var3 >> 6) {
         case 0:
            var3 = var4.m_Rideonwk;
            var8 = this.a(var1 + var4.m_Sprhs, var2 + var4.m_Sprvs, var3, 16, 0);
            var6 = this.a();
            var1 = this.a(var1 - var4.m_Sprhs, var2 + var4.m_Sprvs, var3, 16, 0);
            var2 = this.a();
            if ((var7 = this.a(var8, var1, var6, var2, var4)) != 0) {
               if (var7 < 0) {
                  if (var7 >= -28) {
                     var4.m_Yposi += var7;
                  }
               } else {
                  var1 = Math.min(Math.abs(var4.m_Xspeed >> 8) + 4, 14);
                  if (var7 <= var1) {
                     var4.m_Yposi += var7;
                  } else if (var4.m_FColFlag != 0) {
                     var4.m_Yposi += var7;
                  } else {
                     var4.m_Cddat |= 2;
                     var4.m_Cddat &= -33;
                     var4.m_Mstno_1 = 1;
                  }
               }
            }

            var9 = new int[]{var6, var2};
            break;
         case 1:
            var3 = var4.m_Rideonwk;
            var8 = this.scdChk_R(var1 - var4.m_Sprvs ^ 15, var2 - var4.m_Sprhs, var3, -16, 1024);
            var6 = this.b();
            var1 = this.scdChk_R(var1 - var4.m_Sprvs ^ 15, var2 + var4.m_Sprhs, var3, -16, 1024);
            var2 = this.b();
            if ((var7 = this.a(var8, var1, var6, var2, var4)) < 0) {
               if (var7 >= -28) {
                  var4.m_Xposi -= var7;
               }
            } else if (var7 > 0) {
               var1 = Math.min(Math.abs(var4.m_Yspeed >> 8), 14);
               if (var7 <= var1) {
                  var4.m_Xposi -= var7;
               } else if (var4.m_FColFlag != 0) {
                  var4.m_Xposi -= var7;
               } else {
                  var4.m_Cddat |= 2;
                  var4.m_Cddat &= -33;
                  var4.m_Mstno_1 = 1;
               }
            }

            var9 = new int[]{var6, var2};
            break;
         case 2:
            var3 = var4.m_Rideonwk;
            var8 = this.a(var1 + var4.m_Sprhs, var2 - var4.m_Sprvs ^ 15, var3, -16, 2048);
            var6 = this.a();
            var1 = this.a(var1 - var4.m_Sprhs, var2 - var4.m_Sprvs ^ 15, var3, -16, 2048);
            var2 = this.a();
            if ((var7 = this.a(var8, var1, var6, var2, var4)) < 0) {
               if (var7 >= -28) {
                  var4.m_Yposi -= var7;
               }
            } else if (var7 > 0) {
               var1 = Math.min(Math.abs(var4.m_Xspeed >> 8) + 4, 14);
               if (var7 <= var1) {
                  var4.m_Yposi -= var7;
               } else if (var4.m_FColFlag != 0) {
                  var4.m_Yposi -= var7;
               } else {
                  var4.m_Cddat |= 2;
                  var4.m_Cddat &= -33;
                  var4.m_Mstno_1 = 1;
               }
            }

            var9 = new int[]{var6, var2};
            break;
         default:
            var3 = var4.m_Rideonwk;
            var8 = this.scdChk_R(var1 + var4.m_Sprvs, var2 - var4.m_Sprhs, var3, 16, 0);
            var6 = this.b();
            var1 = this.scdChk_R(var1 + var4.m_Sprvs, var2 + var4.m_Sprhs, var3, 16, 0);
            var2 = this.b();
            if ((var7 = this.a(var8, var1, var6, var2, var4)) != 0) {
               if (var7 < 0) {
                  if (var7 >= -28) {
                     var4.m_Xposi += var7;
                  }
               } else {
                  var1 = Math.min(Math.abs(var4.m_Yspeed >> 8) + 4, 14);
                  if (var7 <= var1) {
                     var4.m_Xposi += var7;
                  } else if (var4.m_FColFlag != 0) {
                     var4.m_Xposi += var7;
                  } else {
                     var4.m_Cddat |= 2;
                     var4.m_Cddat &= -33;
                     var4.m_Mstno_1 = 1;
                  }
               }
            }

            var9 = new int[]{var6, var2};
         }

         return var9;
      }
   }

   public static void renderBorder(Graphics var0) {
      var0.setColor(1336833);
      var0.fillRect(-16, cCanvas.viewPortOffset + cCanvas.viewPortHeight, cCanvas.viewPortWidth + 16, cCanvas.viewPortOffset - 24);
      var0.fillRect(-16, 0, cCanvas.viewPortWidth + 16, cCanvas.viewPortOffset);
   }

   protected void drawHud(Graphics var1) {
      renderBorder(var1);
      int var2 = cCanvas.viewPortOffset + 2;
      var1.drawImage(this.y, 0, cCanvas.viewPortOffset, 20);
      this.a(var1, m_PlRing, 21, var2, 3);
      this.a(var1, m_PlScore * 10, 85, var2, m_PlScore > 99999 ? 7 : 6);
      int var3 = decodePlTime(m_PlTime);
      this.a(var1, var3 / 3600, 164, var2, 2);
      this.a(var1, var3 / 60 % 60, 182, var2, 2);
      this.a(var1, m_Pl_Suu, 223, var2, 2);
   }

   private void a(Graphics var1, int var2, int var3, int var4, int var5) {
      var2 = Math.abs(var2);
      var3 += (var5 - 1) * 7;

      do {
         int var6 = var2 % 10;
         var2 /= 10;
         var1.drawRegion(this.z, var6 << 3, 0, 8, 13, 0, var3, var4, 20);
         --var5;
         var3 -= 7;
      } while(var5 > 0);

   }

   private int a(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      if (((var6 = this.getBlockNumber(var1, var2, this._mZoneMapData, this._mMapData)) & 1023) != 0 && (var6 & var3) != 0) {
         int var7;
         if ((var7 = this.b(var3)[var6 & 1023] & 255) == 0) {
            return this.a(var1, var2 + var4, var3, var5) + 16;
         } else {
            this.w = this.m_ScdTbl[var7];
            this.w &= 255;
            var7 <<= 4;
            int var8 = var1;
            if ((var6 & 1024) != 0) {
               var8 = ~var1;
               this.w = 0 - this.w;
               this.w &= 255;
            }

            if ((var6 & 2048) != 0) {
               this.w = 0 - (this.w + 64) - 64 & 255;
            }

            var8 &= 15;
            var7 += var8;
            var7 = this.m_ScdTblWk[var7];
            if (((var6 ^ var5) & 2048) != 0) {
               var7 = 0 - var7;
            }

            if (var7 == 0) {
               return this.a(var1, var2 + var4, var3, var5) + 16;
            } else if (var7 >= 0) {
               if (var7 == 16) {
                  return this.a(var1, var2 - var4, var3, var5) - 16;
               } else {
                  var7 += var2 & 15;
                  return 15 - var7;
               }
            } else {
               return var7 + (var2 & 15) > 0 ? this.a(var1, var2 + var4, var3, var5) + 16 : this.a(var1, var2 - var4, var3, var5) - 16;
            }
         }
      } else {
         return this.a(var1, var2 + var4, var3, var5) + 16;
      }
   }

   private int a() {
      return this.w + 2 & 255;
   }

   private int a(int var1, int var2, int var3, int var4, Action var5) {
      if (var2 > var1) {
         var4 = var3;
         var2 = var1;
      }

      if ((var4 & 1) == 0 && this.absLT(var4, var5.m_Direc, 32)) {
         var5.m_Direc = var4;
         return var2;
      } else {
         var5.m_Direc = var5.m_Direc + 32 & 192;
         return var2;
      }
   }

   boolean absLT(int var1, int var2, int var3) {
      var1 &= 255;
      var2 &= 255;
      int var4;
      if ((var4 = Math.abs(var1 - var2)) > 127) {
         var4 = 0 - (var4 - 256);
      }

      return var4 <= var3;
   }

   public int scdChk_R(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      if (((var6 = this.getBlockNumber(var1, var2, this._mZoneMapData, this._mMapData)) & 1023) != 0 && (var6 & var3) != 0) {
         int var7;
         if ((var7 = this.b(var3)[var6 & 1023] & 255) == 0) {
            return this.b(var1 + var4, var2, var3, var5) + 16;
         } else {
            this.x = this.m_ScdTbl[var7];
            this.x &= 255;
            var7 <<= 4;
            int var8 = var2;
            if ((var6 & 2048) != 0) {
               var8 = ~var2;
               this.x = 0 - (this.x + 64) - 64 & 255;
            }

            if ((var6 & 1024) != 0) {
               this.x = 256 - this.x & 255;
            }

            var8 = (var8 &= 15) + var7;
            var7 = this.m_ScdTblWk2[var8];
            if (((var6 ^ var5) & 1024) != 0) {
               var7 = 0 - var7;
            }

            if (var7 == 0) {
               return this.b(var1 + var4, var2, var3, var5) + 16;
            } else if (var7 >= 0) {
               if (var7 == 16) {
                  return this.b(var1 - var4, var2, var3, var5) - 16;
               } else {
                  var7 += var1 & 15;
                  return 15 - var7;
               }
            } else {
               return var7 + (var1 & 15) > 0 ? this.b(var1 + var4, var2, var3, var5) + 16 : this.b(var1 - var4, var2, var3, var5) - 16;
            }
         }
      } else {
         return this.b(var1 + var4, var2, var3, var5) + 16;
      }
   }

   private int b() {
      return this.x & 255;
   }

   private int a(int var1, int var2, int var3, int var4) {
      int var5;
      if (((var5 = this.getBlockNumber(var1, var2, this._mZoneMapData, this._mMapData)) & 1023) != 0 && (var5 & var3) != 0) {
         if ((var3 = this.b(var3)[var5 & 1023] & 255) == 0) {
            return 15 - (var2 & 15);
         } else {
            this.w = this.m_ScdTbl[var3];
            this.w &= 255;
            var3 <<= 4;
            var1 = var1;
            if ((var5 & 1024) != 0) {
               var1 = ~var1;
               this.w = 0 - this.w;
               this.w &= 255;
            }

            if ((var5 & 2048) != 0) {
               this.w = 0 - (this.w + 64) - 64 & 255;
            }

            var1 &= 15;
            var3 += var1;
            int var6 = this.m_ScdTblWk[var3];
            if (((var5 ^ var4) & 2048) != 0) {
               var6 = 0 - var6;
            }

            if (var6 == 0) {
               return 15 - (var2 & 15);
            } else if (var6 > 0) {
               var6 += var2 & 15;
               return 15 - var6;
            } else {
               return var6 + (var2 & 15) > 0 ? 15 - (var2 & 15) : ~(var2 & 15);
            }
         }
      } else {
         return 15 - (var2 & 15);
      }
   }

   private byte[] b(int var1) {
      return (var1 & '쀀') != 0 ? this.m_SCDBData : this.m_SCDAData;
   }

   private int b(int var1, int var2, int var3, int var4) {
      byte[] var5 = this.b(var3);
      int var6;
      if (((var6 = this.getBlockNumber(var1, var2, this._mZoneMapData, this._mMapData)) & 1023) != 0 && (var6 & var3) != 0) {
         if ((var3 = var5[var6 & 1023] & 255) == 0) {
            return 15 - (var1 & 15);
         } else {
            this.x = this.m_ScdTbl[var3];
            var3 <<= 4;
            var2 = var2;
            if ((var6 & 2048) != 0) {
               var2 = ~var2;
               this.x = 0 - (this.x + 64) - 64 & 255;
            }

            if ((var6 & 1024) != 0) {
               this.x = 256 - this.x & 255;
            }

            var2 = (var2 &= 15) + var3;
            var3 = this.m_ScdTblWk2[var2];
            if (((var6 ^ var4) & 1024) != 0) {
               var3 = 0 - var3;
            }

            if (var3 == 0) {
               return 15 - (var1 & 15);
            } else if (var3 >= 0) {
               var3 += var1 & 15;
               return 15 - var3;
            } else {
               return var3 + (var1 & 15) > 0 ? 15 - (var1 & 15) : ~(var1 & 15);
            }
         }
      } else {
         return 15 - (var1 & 15);
      }
   }

   public int dirColJ(int var1, int var2, int var3, int var4, Action var5) {
      switch((var4 + 32 & 192) / 64) {
      case 0:
         return this.dirCol_D(var1, var2, var3, var5);
      case 1:
         var4 = this.scdChk_R(var1 - var5.m_Sprhs ^ 15, var2 - var5.m_Sprvs, 8192, -16, 1024);
         return Math.min(this.scdChk_R(var1 - var5.m_Sprhs ^ 15, var2 + var5.m_Sprvs, 8192, -16, 1024), var4);
      case 2:
         return this.dirCol_U(var1, var2, var3, var5);
      case 3:
      default:
         var4 = this.scdChk_R(var1 + var5.m_Sprhs ^ 15, var2 - var5.m_Sprvs, 8192, -16, 1024);
         return Math.min(this.scdChk_R(var1 + var5.m_Sprhs ^ 15, var2 + var5.m_Sprvs, 8192, -16, 1024), var4);
      }
   }

   public int playDieSet(Action var1) {
      var1.m_PlPower = 0;
      var1.m_R_No0 = 6;
      ((PlayerAction)var1).PLAY00_JumpColSub(this);
      var1.m_Cddat |= 2;
      var1.m_Yspeed = -1792;
      var1.m_Xspeed = 0;
      var1.m_Mspeed = 0;
      var1.m_Mstno = 24;
      var1.m_Sproffset |= 32768;
      m_WaterFlag = false;
      return -1;
   }

   public int dirCol_L2(int var1, int var2, int var3) {
      return this.scdChk_R(var1 - 10 ^ 15, var2, var3, -16, 1024);
   }

   public int dirCol_U(int var1, int var2, int var3, Action var4) {
      int var5 = this.a(var1 + var4.m_Sprhs, var2 - var4.m_Sprvs ^ 15, var3, -16, 2048);
      return Math.min(this.a(var1 - var4.m_Sprhs, var2 - var4.m_Sprvs ^ 15, var3, -16, 2048), var5);
   }

   public int dirCol_D(int var1, int var2, int var3, Action var4) {
      var3 = this.a(var1 + var4.m_Sprhs, var2 + var4.m_Sprvs, var4.m_Rideonwk, 16, 0);
      int var5 = this.a(var1 - var4.m_Sprhs, var2 + var4.m_Sprvs, var4.m_Rideonwk, 16, 0);
      return Math.min(var3, var5);
   }

   public int dirCol_DD(int var1, int var2, int var3, Action var4) {
      var3 = this.a(var1 + var4.m_Sprhs, var2 + var4.m_Sprvs, var4.m_Rideonwk, 16, 0);
      int var5 = this.a();
      var1 = this.a(var1 - var4.m_Sprhs, var2 + var4.m_Sprvs, var4.m_Rideonwk, 16, 0);
      int var6 = this.a();
      if (var3 < var1) {
         var6 = var5;
      }

      if ((var6 & 1) != 0) {
         var6 = 0;
      }

      return var6;
   }

   public int dirCol_R2(int var1, int var2, int var3) {
      return this.scdChk_R(var1 + 10, var2, var3, 16, 0);
   }

   public int dirCol_UD(int var1, int var2, int var3, Action var4) {
      var3 = this.a(var1 + var4.m_Sprhs, var2 - var4.m_Sprvs ^ 15, 8192, -16, 2048);
      int var5 = this.a();
      var1 = this.a(var1 - var4.m_Sprhs, var2 - var4.m_Sprvs ^ 15, 8192, -16, 2048);
      int var6 = this.a();
      if (var1 < var3) {
         var5 = var6;
      }

      if ((var5 & 1) != 0) {
         var5 = 0;
      }

      return var5;
   }

   public int plyCol_D(int var1, int var2, int var3, Action var4) {
      return this.a(var1, var2 + var4.m_Sprvs, var4.m_Rideonwk, 16, 0);
   }

   public int dirColM(int var1, int var2, int var3, Action var4) {
      char var5 = 8192;
      if ((var4.m_Hitcolwk & 8192) == 0) {
         var5 = '耀';
      }

      var1 += var4.m_Xspeed << 8;
      var2 += var4.m_Yspeed << 8;
      var1 >>= 16;
      var2 >>= 16;
      int var6 = var3;
      if ((var3 | 128) == 160) {
         --var3;
      }

      var3 = (var3 + 32) / 64 & 3;
      var6 = (var6 & 56) == 0 ? var2 + 8 : var2;
      m_dircolm = var3;
      switch(var3) {
      case 0:
         return this.a(var1, var2 + 10, var5, 16, 0);
      case 1:
         return this.dirCol_L2(var1, var6, var5);
      case 2:
         return this.a(var1, var2 - 10 ^ 15, var5, -16, 2048);
      case 3:
      default:
         return this.dirCol_R2(var1, var6, var5);
      }
   }

   protected void actionSetCheck() {
      int var1 = (State.m_ScrA_H_Posit & 'ﾀ') - 256;
      int var2 = (State.m_ScrA_H_Posit & 'ﾀ') + 256 + 384;
      int var3 = 0;
      if (this.m_ActionData != null) {
         for(int var5 = 0; var5 < this.m_ActionData.length; ++var5) {
            if (this.m_ActionData[var5][0] != 0) {
               if ((this.m_ActionData[var5][4] & '耀') != 0) {
                  ++var3;
               }

               if (this.m_ActionData[var5][2] >= var1 && this.m_ActionData[var5][2] <= var2 && ((this.m_ActionData[var5][4] & '耀') == 0 || (m_FlagWorkCnt[var3 + 2] & 128) == 0) && !m_ActionWorkCnt[var5]) {
                  int var6 = this.m_ActionData[var5][0];
                  int var4 = 0;

                  boolean var10000;
                  while(true) {
                     if (var4 >= DIFFICULTY_TABLE[cCanvas.m_Option[1]].length) {
                        var10000 = false;
                        break;
                     }

                     if (DIFFICULTY_TABLE[cCanvas.m_Option[1]][var4] == var6) {
                        var10000 = true;
                        break;
                     }

                     ++var4;
                  }

                  Action var7;
                  if (!var10000 && (this.C <= 10 || this.m_ActionData[var5][2] <= State.m_ScrA_H_Posit - 64 || this.m_ActionData[var5][2] > State.m_ScrA_H_Posit + 320 + 64) && (var7 = this.insertAction(this.m_ActionData[var5][0])) != null) {
                     m_ActionWorkCnt[var5] = true;
                     var7.m_ActionWorkCntNo = var5;
                     var7.m_Userflag = this.m_ActionData[var5][1];
                     var7.m_Xposi = this.m_ActionData[var5][2];
                     var7.m_Yposi = this.m_ActionData[var5][3] & 4095;
                     var6 = (this.m_ActionData[var5][4] & '\uf000') >> 13 & 3;
                     var7.m_Actflg |= var6;
                     var7.m_Cddat |= var6;
                     if ((this.m_ActionData[var5][4] & '耀') != 0) {
                        var7.m_Cdsts = var3;
                        int[] var8 = m_FlagWorkCnt;
                        var8[var3 + 2] |= 128;
                     }
                  }
               }
            }
         }

         ++this.C;
      }
   }

   public int playDamageSet(Action var1, Action var2) {
      if (var1.m_Actno == 1) {
         cCanvas.doVibration(1000);
      }

      if ((var1.m_PlPower & 1) == 0 && var1.m_Actno == 1) {
         if (m_PlRing == 0) {
            return this.playDieSet(var1);
         }

         Action var3;
         if ((var3 = this.insertAction(55)) != null) {
            var3.m_Xposi = var1.m_Xposi;
            var3.m_Yposi = var1.m_Yposi;
         }
      }

      var1.m_PlPower &= -2;
      var1.m_R_No0 = 4;
      ((PlayerAction)var1).PLAY00_JumpColSub(this);
      var1.m_Cddat |= 2;
      if ((var1.m_Cddat & 64) != 0) {
         var1.m_Yspeed = -512;
         var1.m_Xspeed = -256;
      } else {
         var1.m_Yspeed = -1024;
         var1.m_Xspeed = -512;
      }

      if (var1.m_Xposi >= var2.m_Xposi) {
         var1.m_Xspeed = -var1.m_Xspeed;
      }

      var1.m_Mspeed = 0;
      var1.m_Mstno = 26;
      var1.m_NoColiTimer = 120;
      return -1;
   }

   public static void scoreUp(int var0, boolean var1) {
      m_PlScore_F = 1;
      int var2;
      if ((var2 = m_PlScore % 5000) < 5000 && var2 + var0 >= 5000) {
         ++m_Pl_Suu;
         if (var1) {
            cCanvas.am.bgmset(6);
         } else {
            ++stageClearExtraLifeAudioRequired;
         }
      }

      if ((m_PlScore += var0) > 999999) {
         m_PlScore = 999999;
      }

   }

   public void rideonChk2(int var1, int var2, int var3, int var4, int var5, int var6, Action var7, Action var8) {
      if (var8.m_Yspeed >= 0) {
         int var9;
         if ((var9 = var8.m_Xposi - var1 + var3) >= 0) {
            if (var4 > var9) {
               this.a(var2, var5, var6, var7, var8);
            }
         }
      }
   }

   private void a(int var1, int var2, int var3, Action var4, Action var5) {
      var1 -= var2;
      var2 = var5.m_Yposi;
      int var6 = var5.m_Sprvs + var2;
      var6 += 4;
      if ((var1 -= var6) <= 0) {
         if (var1 >= -16) {
            if ((var5.m_PlayerFlag & 128) == 0) {
               if (var5.m_R_No0 < 6) {
                  var2 += var1;
                  var2 += 3;
                  var5.m_Yposi = var2;
                  this.rideonSet(var3, var4, var5);
               }
            }
         }
      }
   }

   public void rideonSet(int var1, Action var2, Action var3) {
      if ((var3.m_Cddat & 8) != 0 && var3.m_RideActWk != null) {
         Action var10000 = var3.m_RideActWk;
         var10000.m_Cddat &= ~var1;
      }

      var3.m_RideActWk = var2;
      var3.m_Direc = 0;
      var3.m_Yspeed = 0;
      var3.m_Mspeed = var3.m_Xspeed;
      if ((var3.m_Cddat & 2) != 0) {
         this.jumpColSub(var3);
      }

      var3.m_Cddat |= 8;
      var3.m_Cddat &= -3;
      var2.m_Cddat |= var1;
   }

   public void jumpColSub(Action var1) {
      if (var1.m_Actno != 1) {
         if ((var1.m_Cddat & 4) != 0) {
            var1.m_Sprvs = 15;
            var1.m_Sprhs = 9;
            var1.m_Mstno = 0;
            --var1.m_Yposi;
         }

         var1.m_Cddat &= -55;
         var1.m_JumpFlag = 0;
         m_EmyScoreCnt = 0;
         var1.m_Direc1 = 0;
         var1.m_SLoopFlag = 0;
         var1.m_DirecCnt = 0;
         if (var1.m_Mstno == 20) {
            var1.m_Mstno = 0;
         }

      } else {
         if ((var1.m_Cddat & 4) != 0) {
            var1.m_Sprvs = 19;
            var1.m_Sprhs = 9;
            var1.m_Mstno = 0;
            var1.m_Yposi -= 5;
         }

         var1.m_Cddat &= -55;
         var1.m_JumpFlag = 0;
         m_EmyScoreCnt = 0;
         var1.m_Direc1 = 0;
         var1.m_SLoopFlag = 0;
         var1.m_DirecCnt = 0;
         m_LeverTimer = 0;
         if (var1.m_Mstno == 20) {
            var1.m_Mstno = 0;
         }

      }
   }

   public int atariRideSub3(int var1, int var2, int var3, int var4, int var5, Action var6, Action var7) {
      m_D0_Tmp = 0;
      if ((var6.m_Cddat & var5) == 0) {
         return this.atariRideChk(var2, var3, var5, var6, var7, 2);
      } else {
         var3 = var2 + var2;
         int var8;
         if ((var7.m_Cddat & 2) == 0 && (var8 = var7.m_Xposi - var6.m_Xposi + var2) >= 0 && var8 < var3) {
            this.ridePlaySet2(var1, var1, var4, var6, var7);
            return 0;
         } else {
            var7.m_Cddat &= -9;
            var7.m_Cddat |= 2;
            var6.m_Cddat &= ~var5;
            return 0;
         }
      }
   }

   public int atariRideChk(int var1, int var2, int var3, Action var4, Action var5, int var6) {
      m_D4_Tmp = 0;
      m_D6_Tmp = 0;
      int var7 = 0;
      if (var4 != null && (var4.m_Actflg & 128) != 0 || var6 != 0) {
         m_D0_Tmp = var6 = var5.m_Xposi - var4.m_Xposi + var1;
         if (var6 >= 0) {
            int var8 = var1 + var1;
            if (var6 <= var8) {
               var8 = var5.m_Sprvs;
               var2 += var8;
               var8 = var5.m_Yposi - var4.m_Yposi;
               var8 += 4;
               if ((var8 += var2) >= 0) {
                  var8 &= 2047;
                  int var9 = var2 + var2;
                  if (var8 < var9) {
                     m_D4_Tmp = 0;
                     m_D6_Tmp = 0;
                     if ((var7 = this.a(var9, var6, var1, var2, var8, var3, var4, var5)) < 0) {
                        return m_D4_Tmp;
                     }
                  }
               }
            }
         }
      }

      if (var7 == 0 && (var4.m_Cddat & var3 << 2) != 0) {
         if (var5.m_Mstno != 2) {
            var5.m_Mstno = 1;
         }

         var7 = 2;
      }

      if (var7 == 2) {
         var4.m_Cddat &= ~(var3 << 2);
         var5.m_Cddat &= -33;
      }

      return 0;
   }

   public void ridePlaySet2(int var1, int var2, int var3, Action var4, Action var5) {
      int var6;
      m_D0_Tmp = var6 = var4.m_Yposi;
      var6 -= var3;
      if ((var5.m_PlayerFlag & 128) == 0) {
         if (var5.m_R_No0 < 6) {
            var6 -= var5.m_Sprvs;
            var5.m_Yposi = var6;
            var2 -= var4.m_Xposi;
            var5.m_Xposi -= var2;
            m_D0_Tmp = var6;
         }
      }
   }

   private int a(int var1, int var2, int var3, int var4, int var5, int var6, Action var7, Action var8) {
      if ((var8.m_PlayerFlag & 128) != 0) {
         return 0;
      } else if (var8.m_R_No0 >= 6) {
         return 3;
      } else {
         int var9 = var2;
         if ((var3 & '\uffff') < (var2 & '\uffff')) {
            var2 -= var3 << 1;
            var9 = 0 - var2;
         }

         var3 = var5;
         if ((var4 & '\uffff') < (var5 & '\uffff')) {
            var5 -= 4;
            var5 -= var1;
            var3 = 0 - var5;
         }

         if ((var9 & '\uffff') <= (var3 & '\uffff') && !this.m_ForceAtariY) {
            if (this.b(var2, var3, (int)var6, var7, var8) < 0) {
               return -1;
            }
         } else {
            this.m_ForceAtariY = false;
            int var10 = var6;
            byte var10000;
            if (var5 >= 0) {
               if (var7.m_Actno == 116) {
                  var10000 = 0;
               } else if (var5 < 16) {
                  this.a(var5, (int)var6, (Action)var7, (Action)var8);
                  var10000 = -1;
               } else if (var7.m_Actno == 133) {
                  this.a(var5, (int)var6, (Action)var7, (Action)var8);
                  var10000 = 0;
               } else if (var5 < 20) {
                  this.a(var5, (int)var6, (Action)var7, (Action)var8);
                  var10000 = -1;
               } else {
                  var10000 = 0;
               }
            } else {
               label80: {
                  if (var8.m_Yspeed == 0) {
                     var6 = var7.m_Actno;
                     if ((var8.m_Cddat & 2) != 0) {
                        var10000 = 2;
                     } else {
                        if (Math.abs(var2) < 16) {
                           this.b(var2, var3, (int)var10, var7, var8);
                        } else {
                           this.playDieSet(var8);
                        }

                        var10000 = -1;
                     }

                     if (var10000 != 2) {
                        var10000 = -1;
                        break label80;
                     }
                  } else if (var8.m_Yspeed < 0 && var5 < 0) {
                     var8.m_Yposi -= var5;
                     var8.m_Yspeed = 0;
                  }

                  this.a((int)var6, 15, -2);
                  var10000 = 0;
               }
            }

            if (var10000 < 0) {
               return -1;
            }
         }

         return 0;
      }
   }

   private int b(int var1, int var2, int var3, Action var4, Action var5) {
      if (var2 > 4) {
         if (var1 > 0 && var5.m_Xspeed >= 0) {
            var5.m_Mspeed = 0;
            var5.m_Xspeed = 0;
         } else if (var1 < 0 && var5.m_Xspeed <= 0) {
            var5.m_Mspeed = 0;
            var5.m_Xspeed = 0;
         }

         var5.m_Xposi -= var1;
         if ((var5.m_Cddat & 2) == 0) {
            var4.m_Cddat |= var3 << 2;
            var5.m_Cddat |= 32;
            this.a(var3, 13, 1);
            return -1;
         }
      }

      return 2;
   }

   private void a(int var1, int var2, Action var3, Action var4) {
      var1 -= 4;
      int var5;
      int var6 = (var5 = var3.m_Sprhsize) << 1;
      if ((var5 = var5 + var4.m_Xposi - var3.m_Xposi) >= 0 && var5 < var6 && var4.m_Yspeed >= 0) {
         var4.m_Yposi -= var1;
         --var4.m_Yposi;
         this.rideonSet(var2, var3, var4);
         this.a(var2, 17, -1);
      } else {
         m_D4_Tmp = 0;
      }
   }

   private void a(int var1, int var2, int var3) {
      int var4;
      for(var4 = 0; var4 < 16 && (1 << var4 & var1) == 0; ++var4) {
      }

      m_D6_Tmp = var4;
      m_D6_Tmp = var4 | var1 << var2;
      m_D4_Tmp = var3;
   }

   public void atariRideSub_t(int var1, int var2, int var3, int var4, Action var5, Action var6, int[] var7) {
      Action[] var11 = new Action[]{State.mSonicAction, State.mTailsAction};
      int[] var12 = new int[]{8, 16};

      for(int var8 = 0; var8 < 2; ++var8) {
         if (var11[var8] == null) {
            return;
         }

         Action var9 = var11[var8];
         int var10 = var12[var8];
         this.atariRideSub_t2(var5.m_Xposi, var5.m_Yposi, var1, var2, var3, var10, var5, var9, var7);
      }

   }

   public int atariRideSub_t2(int var1, int var2, int var3, int var4, int var5, int var6, Action var7, Action var8, int[] var9) {
      if ((var6 & var7.m_Cddat) == 0) {
         return this.atariRideChk_t(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      } else {
         var2 = var3 + var3;
         if ((var8.m_Cddat & 2) == 0) {
            if ((var4 = var8.m_Xposi - var7.m_Xposi + var3) >= 0 && var4 < var2) {
               this.ridePlaySet_t(var1, var3, var1, var5, var7, var8, var9);
               return 0;
            } else {
               var8.m_Cddat &= -9;
               var8.m_Cddat |= 2;
               var7.m_Cddat &= ~var6;
               return 0;
            }
         } else {
            var8.m_Cddat &= -9;
            var8.m_Cddat |= 2;
            var7.m_Cddat &= ~var6;
            return 0;
         }
      }
   }

   public int atariRideChk_t(int var1, int var2, int var3, int var4, int var5, int var6, Action var7, Action var8, int[] var9) {
      m_D4_Tmp = 0;
      m_D6_Tmp = 0;
      int var10;
      if ((var10 = var8.m_Xposi - var7.m_Xposi + var3) < 0) {
         return this.b(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         var5 = var3 + var3;
         if (var10 > var5) {
            return this.b(var1, var2, var3, var4, var5, var6, var7, var8);
         } else {
            int var11 = var10;
            if ((var7.m_Actflg & 1) != 0) {
               var11 = (var11 = ~var10) + var5;
            }

            if ((var11 >>= 1) < 0) {
               var11 = 0;
            }

            var5 = var9[var11] - var9[0];
            int var12 = var7.m_Yposi - var5;
            var5 = var8.m_Sprvs;
            var4 += var5;
            var5 = var8.m_Yposi - var12;
            var5 += 4;
            if ((var5 += var4) < 0) {
               return this.b(var1, var2, var3, var4, var5, var6, var7, var8);
            } else {
               var12 = var4 + var4;
               if (var5 >= var12) {
                  return this.b(var1, var2, var3, var4, var5, var6, var7, var8);
               } else {
                  m_D4_Tmp = 0;
                  m_D6_Tmp = 0;
                  this.a(var12, var10, var3, var4, var5, var6, var7, var8);
                  return m_D4_Tmp;
               }
            }
         }
      }
   }

   public void ridePlaySet_t(int var1, int var2, int var3, int var4, Action var5, Action var6, int[] var7) {
      if ((var6.m_Cddat & 8) != 0) {
         int var8 = var6.m_Xposi - var5.m_Xposi + var2 >> 1;
         if ((var5.m_Actflg & 1) != 0) {
            var8 = (var8 = ~var8) + var2;
         }

         this.ridePlaySet_t2(var1, var8, var3, var4, var5, var6, var7);
      }
   }

   private int b(int var1, int var2, int var3, int var4, int var5, int var6, Action var7, Action var8) {
      int var9 = var6 << 2;
      if ((var7.m_Cddat & var9) != 0) {
         if (var8.m_Mstno != 2) {
            var8.m_Mstno = 0;
            var8.m_Mstno_1 = 1;
         }

         var9 = var6 << 2;
         var7.m_Cddat &= ~var9;
         var8.m_Cddat &= -33;
      }

      return 0;
   }

   public void ridePlaySet_t2(int var1, int var2, int var3, int var4, Action var5, Action var6, int[] var7) {
      int var8 = var7[var2];
      var2 = var5.m_Yposi - var8;
      var8 = var6.m_Sprvs;
      var2 -= var8;
      var6.m_Yposi = var2;
      var3 -= var5.m_Xposi;
      var6.m_Xposi -= var3;
   }

   public int emyCol_D(int var1, int var2, int var3) {
      var2 += var3;
      return this.a(var1, var2, 4096, 16, 0);
   }

   public int chkPlDir(Action var1) {
      if (this.checkPlayerIndex() < 0) {
         return 0;
      } else {
         byte var2 = 0;
         byte var3 = 0;
         if (State.mActions[super.m_PlayerIndex].m_Xposi >= var1.m_Xposi) {
            var2 = 2;
         }

         if (State.mActions[super.m_PlayerIndex].m_Yposi >= var1.m_Yposi) {
            var3 = 2;
         }

         return var3 << 8 | var2;
      }
   }

   public int getD7(Action var1) {
      for(int var2 = 0; var2 < State.mActions.length; ++var2) {
         if (State.mActions[var2] == var1) {
            return var2;
         }
      }

      return 0;
   }

   public void rideChkSub(int var1, int var2, int var3, int var4, int var5, int var6, Action var7) {
      this.rideChkSub2(var1, var2, var3, var4, var5, var6, 8, var7, State.mSonicAction);
      this.rideChkSub2(var1, var2, var3, var4, var5, var6, 16, var7, State.mTailsAction);
   }

   public void rideChkSub2(int var1, int var2, int var3, int var4, int var5, int var6, int var7, Action var8, Action var9) {
      if ((var8.m_Cddat & var7) == 0) {
         this.rideonChk(var1, var2, var3, var6, var7, var8, var9);
      } else {
         var2 = var3 + var3;
         if ((var9.m_Cddat & 2) == 0 && (var4 = var9.m_Xposi - var1 + var3) >= 0 && var4 < var2) {
            this.ridePlaySet2(var1, var1, var6, var8, var9);
         } else {
            var9.m_Cddat &= -9;
            var9.m_Cddat |= 2;
            var8.m_Cddat &= ~var7;
         }
      }
   }

   public void rideonChk(int var1, int var2, int var3, int var4, int var5, Action var6, Action var7) {
      if (var7.m_Yspeed >= 0) {
         int var8;
         if ((var8 = var7.m_Xposi - var1 + var3) >= 0) {
            var3 += var3;
            if (var8 <= var3) {
               this.a(var2, var4, var5, var6, var7);
            }
         }
      }
   }

   public int atariRideSub(int var1, int var2, int var3, int var4, int var5, int var6, Action var7) {
      byte var10 = 8;
      this.c(var1, var2, var3, var4, var5, 8, var7, State.mSonicAction);
      int var8 = m_D4_Tmp;
      int var9 = m_D6_Tmp;
      if ((State.mTailsAction.m_Actflg & 128) != 0) {
         var10 = 16;
         this.c(var1, var2, var3, var4, var5, 16, var7, State.mTailsAction);
      }

      m_D4_Tmp |= var8;
      m_D6_Tmp |= var9;
      return var10;
   }

   private void c(int var1, int var2, int var3, int var4, int var5, int var6, Action var7, Action var8) {
      if ((var7.m_Cddat & var6) == 0) {
         this.atariRideChk(var3, var4, var6, var7, var8, 0);
      } else {
         var2 = var3 + var3;
         if ((var8.m_Cddat & 2) == 0 && (var4 = var8.m_Xposi - var1 + var3) >= 0 && var4 < var2) {
            this.ridePlaySet2(var1, var1, var5, var7, var8);
         } else {
            var8.m_Cddat &= -9;
            var8.m_Cddat |= 2;
            var7.m_Cddat &= ~var6;
         }
      }
   }

   protected void sysdirInit() {
      m_SysdirFlag = 125;

      for(int var1 = 0; var1 < m_Sysdirec.length; ++var1) {
         m_Sysdirec[var1] = l[var1][0];
         m_SysdirSpd[var1] = l[var1][1];
      }

   }

   protected void sysdirCnt() {
      boolean var3 = false;
      int var1 = m_SysdirFlag;
      if (6 > State.mSonicAction.m_R_No0) {
         for(int var2 = 0; var2 < 16; ++var2) {
            int var4 = 15 - var2;
            int[] var10000;
            if ((var1 & 1 << var4) == 0) {
               var10000 = m_SysdirSpd;
               var10000[var2] += m[var2];
               var10000 = m_Sysdirec;
               var10000[var2] += m_SysdirSpd[var2];
               if (m_Sysdirec[var2] >>> 24 >= n[var2]) {
                  var1 |= 1 << var4;
               }
            } else {
               var10000 = m_SysdirSpd;
               var10000[var2] -= m[var2];
               var10000 = m_Sysdirec;
               var10000[var2] += m_SysdirSpd[var2];
               if (m_Sysdirec[var2] >>> 24 < n[var2]) {
                  var1 &= ~(1 << var4);
               }
            }
         }

         m_SysdirFlag = var1;
      }

   }

   public void playLoad() {
      Action var2 = State.mSonicAction;
      m_PlFlag = State.m_PlFlag_s;
      var2.m_Xposi = State.m_PlXPosi_s;
      var2.m_Yposi = State.m_PlYPosi_s;
      Action var1;
      if ((var1 = State.mTailsAction) != null) {
         var1.m_Xposi = var2.m_Xposi;
         var1.m_Yposi = var2.m_Yposi;
         var1.m_Xposi_2 = var2.m_Xposi_2;
         var1.m_Yposi_2 = var2.m_Yposi_2;
      }

      m_PlRing = 0;
      m_PlRing_F = 0;
      m_PlRing_F2 = 0;
      int var4 = (m_PlTime = (m_PlTime = State.m_PlTime_s) & -256 | 59) >> 8 & 255;
      --var4;
      if (var4 < 0) {
         var4 = 0;
      }

      m_PlTime = m_PlTime & -65281 | var4 << 8;
      var2.m_Sproffset = State.m_PlSprOffset_s;
      var2.m_Rideonwk = State.m_PlRideonwk_s;
      var2.m_Hitcolwk = State.m_PlHitcolwk_s;
      m_Zone_Flag = State.m_Zone_Flag_s;
      m_ScrALim_Down = State.m_ScrALim_Down_s;
      m_ScrALim_N_Down = State.m_ScrALim_Down_s;
      State.m_ScrA_H_Posit = State.m_ScrA_H_Posit_s;
      State.m_ScrA_V_Posit = State.m_ScrA_V_Posit_s;
      State.m_ScrB_H_Posit = State.m_ScrB_H_Posit_s;
      State.m_ScrB_V_Posit = State.m_ScrB_V_Posit_s;
      State.m_ScrC_H_Posit = State.m_ScrC_H_Posit_s;
      State.m_ScrC_V_Posit = State.m_ScrC_V_Posit_s;
      State.m_ScrZ_H_Posit = State.m_ScrZ_H_Posit_s;
      State.m_ScrZ_V_Posit = State.m_ScrZ_V_Posit_s;
      if (m_WaterMode) {
         m_WaterPosi_m = State.m_WaterPosi_m_s;
         m_WaterFlag = State.m_WaterFlag_s;
      }

      if ((m_PlFlag & 128) != 0) {
         int var3 = State.m_PlXPosi_s;
         var3 -= 160;
         m_ScrALim_Left = var3;
      }

   }

   public void playSaves(Action var1) {
      Action var2 = State.mSonicAction;
      State.m_PlFlag_s = m_PlFlag = var1.m_Userflag;
      State.m_PlXPosi_s = var1.m_Xposi;
      State.m_PlYPosi_s = var1.m_Yposi;
      State.m_PlSprOffset_s = var2.m_Sproffset;
      State.m_PlRideonwk_s = var2.m_Rideonwk;
      State.m_PlHitcolwk_s = var2.m_Hitcolwk;
      State.m_PlTime_s = m_PlTime;
      State.m_Zone_Flag_s = m_Zone_Flag;
      State.m_ScrALim_Down_s = m_ScrALim_Down;
      State.m_ScrA_H_Posit_s = State.m_ScrA_H_Posit;
      State.m_ScrA_V_Posit_s = State.m_ScrA_V_Posit;
      State.m_ScrB_H_Posit_s = State.m_ScrB_H_Posit;
      State.m_ScrB_V_Posit_s = State.m_ScrB_V_Posit;
      State.m_ScrC_H_Posit_s = State.m_ScrC_H_Posit;
      State.m_ScrC_V_Posit_s = State.m_ScrC_V_Posit;
      State.m_ScrZ_H_Posit_s = State.m_ScrZ_H_Posit;
      State.m_ScrZ_V_Posit_s = State.m_ScrZ_V_Posit;
      State.m_WaterPosi_m_s = m_WaterPosi_m;
      State.m_WaterFlag_s = m_WaterFlag;
   }

   public void intoSPGame() {
      this.insertAction(223);
   }

   static void softkeySet_Pause() {
      if (stageClear) {
         PlayerAction2.stclearAudioOver = true;
      }

      State.setSoftKey(256, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][1]);
      State.setSoftKey(512, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][2]);
   }

   public static final void drawPauseMenu(Graphics var0, int var1) {
      cCanvas.setShade(192, 0, crlCanvas.getGameHeight() - 24);
      cCanvas.fillShade(var0);
      TitleState.drawBar(var0, 0, crlCanvas.getGameWidth(), true, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][3], 0);
      var0.setFont(State.fT);
      var1 = crlCanvas.getGameWidth() - 64;
      TitleState.drawBar(var0, Utilities.scale(110), var1, m_PAUSE_Cursor == 0, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][4], 0);
      drawSettingBar(var0, Utilities.scale(110) + 1 * (State.fontHeight + 5), var1, m_PAUSE_Cursor == 1, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][5], d[cCanvas.m_Option[0]][cCanvas.m_Option[2]]);
      if (TitleState.mDemo > 0) {
         TitleState.drawBar(var0, Utilities.scale(110) + 2 * (State.fontHeight + 5), var1, m_PAUSE_Cursor == 2, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][9], 0);
      } else {
         TitleState.drawBar(var0, Utilities.scale(110) + 2 * (State.fontHeight + 5), var1, m_PAUSE_Cursor == 2, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][6], 0);
      }

      if (State.drawLoadingText) {
         System.out.println("loading...7");
         TitleState.drawBar(var0, cCanvas.viewPortHeight - 24, 140, true, e[cCanvas.m_Option[0]], 0);
         State.loadStage = true;
         State.drawLoadingText = false;
      }

      if (cCanvas.screenRotated) {
         State.rotatePaint(var0);
      }

   }

   protected static final void drawConfirm(Graphics var0, int var1) {
      cCanvas.setShade(192, 0, crlCanvas.getGameHeight() - 24);
      cCanvas.fillShade(var0);
      if (TitleState.mDemo > 0) {
         TitleState.drawBar(var0, 0, crlCanvas.getGameWidth(), true, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][9], 0);
      } else {
         TitleState.drawBar(var0, 0, crlCanvas.getGameWidth(), true, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][6], 0);
      }

      var0.setFont(State.fT);
      var1 = (crlCanvas.getGameWidth() - State.fT.stringWidth(b[cCanvas.m_Option[0]][0])) / 2;
      TitleState.drawString(var0, b[cCanvas.m_Option[0]][0], var1, Utilities.scale(75), 16777215, 0);
      TitleState.drawBar(var0, Utilities.scale(110), 124, m_PAUSE_Cursor == 0, b[cCanvas.m_Option[0]][1], 0);
      TitleState.drawBar(var0, Utilities.scale(110) + State.fontHeight + 5, 124, m_PAUSE_Cursor == 1, b[cCanvas.m_Option[0]][2], 0);
      if (State.drawLoadingText) {
         System.out.println("loading...12");
         TitleState.drawBar(var0, cCanvas.viewPortHeight - 24, 148, true, e[cCanvas.m_Option[0]], 0);
         State.loadStage = true;
         State.drawLoadingText = false;
      }

   }

   public static void drawSettingBar(Graphics var0, int var1, int var2, boolean var3, String var4, String var5) {
      int var6 = 0;

      int var7;
      for(var7 = 0; var7 < 4; ++var7) {
         var6 = Math.max(var6, State.fT.stringWidth(d[cCanvas.m_Option[0]][var7]));
      }

      var7 = State.fT.stringWidth(var4);
      int var8 = State.fT.stringWidth(var5);
      int var9 = (var2 - (var7 + var6 + 12 + 12)) / 2;
      int var10 = (crlCanvas.getGameWidth() - var2) / 2;
      TitleState.drawBar(var0, var10, var1, var2, var3, (String)null, 0);
      var10 += var9;
      TitleState.drawString(var0, var4, var10, var1 + 3, 16777215, 0);
      var10 += var7;
      var10 += 12;
      if (var3) {
         drawArrow(var0, var10, var1 + 6, 6, 20);
      }

      var10 += 6;
      var10 += 4;
      TitleState.drawString(var0, var5, var10 + (var6 - var8) / 2, var1 + 3, 16777215, 0);
      var10 += var6;
      var10 += 4;
      if (var3) {
         drawArrow(var0, var10, var1 + 6, 5, 20);
      }

   }

   public static void drawArrow(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.drawRegion(A, 0, 0, 6, 4, var3, var1, var2, var4);
   }

   public void disposeResources() {
      this.waterImage = null;
      Action.disposeImages(-1);
      this.h = null;
      this._mMapData = null;
      this._mZoneMapData = null;
      this.f = null;
      this.m_SCDAData = null;
      this.m_SCDBData = null;
      this.m_ActionData = null;
      this.m_RingData = null;
      int var1;
      if (State.mActions != null) {
         for(var1 = 0; State.mActions.length < 0; ++var1) {
            if (State.mActions[var1] != null) {
               State.mActions[var1].dispose();
            }
         }
      }

      for(var1 = 0; var1 < State.reserveActions.length; ++var1) {
         if (State.reserveActions[var1] != null) {
            State.reserveActions[var1].dispose();
         }
      }

      State.reserveActions = new Action[128];
      State.mActions = null;
      this.m_ActionData = null;
      DIFFICULTY_TABLE = null;
      A = null;
   }

   protected void scroll() {
      int var9;
      boolean var15;
      int var4;
      label386:
      switch(zoneNumber) {
      case 0:
         if (actNumber != 0) {
            switch(m_Zone_Flag) {
            case 0:
               if (State.m_ScrA_H_Posit >= 10112) {
                  m_ScrALim_Left = State.m_ScrA_H_Posit;
                  m_ScrALim_N_Down = 912;
                  m_Zone_Flag += 2;
               }
            case 1:
            case 3:
            case 5:
            default:
               break;
            case 2:
               if (State.m_ScrA_H_Posit >= 10480) {
                  m_ScrALim_Left = 10480;
                  m_ScrALim_Right = 10560;
                  m_ScrALim_Left = 10480;
                  m_Zone_Flag += 2;
                  cCanvas.am.setFadeOut(0, Sonic2AudioManager.VOLUME_LEVELS[cCanvas.m_Option[2]], 360);
                  m_ScrChkWork = 0;
                  m_BossStart = 2;
               }
               break;
            case 4:
               cCanvas.am.killLastAudio();
               if (State.m_ScrA_V_Posit >= 904) {
                  m_ScrALim_Up = 904;
               }

               if (++m_ScrChkWork >= 90) {
                  Action var7;
                  if ((var7 = this.insertAction(86)) != null) {
                     var7.m_Userflag = 129;
                     var7.m_Xposi = 10704;
                     var7.m_Yposi = 1062;
                  }

                  m_Zone_Flag += 2;
                  cCanvas.am.bgmset(2);
               }
               break;
            case 6:
               if (m_BossFlag != 0) {
                  m_ScrALim_Left = Math.max(State.m_ScrA_H_Posit - m_ScrollA_LeftOffset, m_ScrALim_Left);
               }
            }
         }
         break;
      case 7:
         boolean var11;
         if (actNumber == 0) {
            switch(m_Zone_Flag) {
            case 0:
               if (State.m_ScrA_V_Posit >= 1024 && State.m_ScrA_H_Posit >= 6144) {
                  m_ScrollMode = true;
                  State.m_ScrB_H_Posit = State.m_ScrA_H_Posit;
                  State.m_ScrB_V_Posit = State.m_ScrA_V_Posit;
                  m_ScrB_HZ = 0;
                  m_ScrB_VZ = 0;
                  m_ScrB_H_Offset = 0;
                  m_ScrB_V_Offset = 320;
                  State.m_ScrB_V_Posit -= 256;
                  m_MoveScrTimer = 0;
                  m_Zone_Flag += 2;
               } else if (m_ScrollMode) {
                  m_ScrollMode = false;
                  m_ScrB_HZ = 0;
                  m_ScrB_VZ = 0;
               }
            case 1:
            case 3:
            default:
               break label386;
            case 2:
               if (State.m_ScrA_H_Posit >= 7680) {
                  m_ScrollShake = false;
               }

               if (State.m_ScrA_H_Posit >= 6520 && State.m_ScrA_H_Posit < 7680) {
                  label400: {
                     if (m_MoveScrMode == 0) {
                        if (m_ScrB_V_Offset != 320) {
                           var4 = var9 = m_GameTimer;
                           if ((var9 &= 3) != 0) {
                              break label400;
                           }

                           ++m_ScrB_V_Offset;
                           if ((var4 &= 63) != 0) {
                              break label400;
                           }
                        }
                     } else if (m_ScrB_V_Offset != 224) {
                        var4 = var9 = m_GameTimer & '\uffff';
                        if ((var9 &= 3) != 0) {
                           break label400;
                        }

                        --m_ScrB_V_Offset;
                        if ((var4 &= 63) != 0) {
                           break label400;
                        }
                     }

                     m_ScrollShake = false;
                     if (--m_MoveScrTimer < 0) {
                        m_MoveScrTimer = 120;
                        m_MoveScrMode ^= 1;
                        m_ScrollShake = true;
                     }
                  }
               }

               if (State.m_ScrA_H_Posit < 6144) {
                  State.m_ScrB_H_Posit = 1024;
                  var11 = false;
                  State.m_ScrB_V_Posit = 0;
                  m_ScrB_H_Offset = 0;
                  m_ScrB_V_Offset = 0;
                  m_MoveScrMode = 0;
                  m_Zone_Flag -= 2;
               } else if (State.m_ScrA_H_Posit >= 7936) {
                  State.m_ScrB_H_Posit = 1024;
                  var11 = false;
                  State.m_ScrB_V_Posit = 0;
                  m_ScrB_H_Offset = 0;
                  m_ScrB_V_Offset = 0;
                  m_MoveScrMode = 0;
                  m_Zone_Flag += 2;
               } else {
                  m_ScrB_HZ = m_ScrA_HZ;
                  m_ScrB_VZ = m_ScrA_VZ;
                  var9 = State.m_ScrA_H_Posit;
                  var4 = State.m_ScrA_V_Posit;
                  this.c(var9, var4);
               }
               break label386;
            case 4:
               if (State.m_ScrA_H_Posit < 7936) {
                  m_ScrollMode = true;
                  State.m_ScrB_H_Posit = State.m_ScrA_H_Posit;
                  State.m_ScrB_V_Posit = State.m_ScrA_V_Posit;
                  m_ScrB_HZ = 0;
                  m_ScrB_VZ = 0;
                  m_ScrB_H_Offset = 0;
                  m_ScrB_V_Offset = 320;
                  State.m_ScrB_V_Posit -= 256;
                  m_MoveScrTimer = 0;
                  m_Zone_Flag -= 2;
               } else if (m_ScrollMode) {
                  m_ScrollMode = false;
                  m_ScrB_HZ = 0;
                  m_ScrB_VZ = 0;
               }
            }
         } else {
            var11 = false;
            var15 = false;
            if (State.m_ScrA_H_Posit >= 11008 && m_Zone_Flag < 10) {
               m_Zone_Flag = 10;
               m_ScrollMode = false;
            }

            switch(m_Zone_Flag) {
            case 0:
               if (State.m_ScrA_H_Posit >= 5312) {
                  m_ScrollMode = true;
                  State.m_ScrB_H_Posit = State.m_ScrA_H_Posit;
                  State.m_ScrB_V_Posit = State.m_ScrA_V_Posit;
                  m_ScrB_HZ = 0;
                  m_ScrB_VZ = 0;
                  m_ScrB_H_Offset = 0;
                  m_ScrB_V_Offset = 704;
                  State.m_ScrB_V_Posit -= 256;
                  m_MoveScrTimer = 0;
                  m_Zone_Flag += 2;
                  if (State.m_ScrA_V_Posit >= 896) {
                     m_ScrB_H_Offset = -1664;
                     State.m_ScrB_H_Posit += 1152;
                     m_ScrB_V_Offset = 768;
                     m_Zone_Flag += 6;
                  }
               } else if (m_ScrollMode) {
                  m_ScrB_HZ = 0;
                  m_ScrB_VZ = 0;
                  m_ScrollMode = false;
                  m_ScrollShake = false;
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
               break label386;
            case 2:
               if (State.m_ScrA_H_Posit >= 6656) {
                  m_ScrollShake = false;
               }

               if (State.m_ScrA_H_Posit >= 5752 && State.m_ScrA_H_Posit < 6656) {
                  label402: {
                     if (m_MoveScrMode == 0) {
                        if (m_ScrB_V_Offset != 704) {
                           var4 = var9 = m_GameTimer;
                           if ((var9 &= 3) == 0) {
                              ++m_ScrB_V_Offset;
                              if ((var4 &= 63) != 0) {
                              }
                           }
                           break label402;
                        }
                     } else if (m_ScrB_V_Offset != 0) {
                        var4 = var9 = m_GameTimer;
                        if ((var9 &= 3) == 0) {
                           --m_ScrB_V_Offset;
                           if ((var4 &= 63) != 0) {
                           }
                        }
                        break label402;
                     }

                     m_ScrollShake = false;
                     if (--m_MoveScrTimer < 0) {
                        m_MoveScrTimer = 120;
                        m_MoveScrMode ^= 1;
                        m_ScrollShake = true;
                     }
                  }
               }

               if (State.m_ScrA_H_Posit < 5312) {
                  State.m_ScrB_H_Posit = 1024;
                  State.m_ScrB_V_Posit = 0;
                  m_ScrB_H_Offset = 0;
                  m_ScrB_V_Offset = 0;
                  m_MoveScrMode = 0;
                  m_Zone_Flag -= 2;
               } else if (State.m_ScrA_H_Posit >= 6912) {
                  State.m_ScrB_H_Posit = 1024;
                  State.m_ScrB_V_Posit = 0;
                  m_ScrB_H_Offset = 0;
                  m_ScrB_V_Offset = 0;
                  m_MoveScrMode = 0;
                  m_Zone_Flag += 2;
               } else {
                  m_ScrB_HZ = m_ScrA_HZ;
                  m_ScrB_VZ = m_ScrA_VZ;
                  var9 = State.m_ScrA_H_Posit;
                  var4 = State.m_ScrA_V_Posit;
                  this.c(var9, var4);
               }
               break label386;
            case 4:
               if (State.m_ScrA_H_Posit < 6912) {
                  m_ScrollMode = true;
                  State.m_ScrB_H_Posit = State.m_ScrA_H_Posit;
                  State.m_ScrB_V_Posit = State.m_ScrA_V_Posit;
                  m_ScrB_HZ = 0;
                  m_ScrB_VZ = 0;
                  m_ScrB_H_Offset = 0;
                  m_ScrB_V_Offset = 704;
                  State.m_ScrB_V_Posit -= 256;
                  m_MoveScrTimer = 0;
                  m_Zone_Flag -= 2;
               } else if (m_ScrollMode) {
                  m_ScrB_HZ = 0;
                  m_ScrB_VZ = 0;
                  m_ScrollMode = false;
                  m_ScrollShake = false;
               }
               break label386;
            case 6:
               if (State.m_ScrA_H_Posit >= 5616 && State.m_ScrA_H_Posit < 6848) {
                  label404: {
                     if (m_MoveScrMode == 0) {
                        if (m_ScrB_V_Offset != 768) {
                           var4 = var9 = m_GameTimer;
                           if ((var9 &= 3) == 0) {
                              ++m_ScrB_V_Offset;
                              if ((var4 &= 63) != 0) {
                              }
                           }
                           break label404;
                        }
                     } else if (m_ScrB_V_Offset != 0) {
                        var4 = var9 = m_GameTimer;
                        if ((var9 &= 3) == 0) {
                           --m_ScrB_V_Offset;
                           if ((var4 &= 63) != 0) {
                           }
                        }
                        break label404;
                     }

                     m_ScrollShake = false;
                     if (--m_MoveScrTimer < 0) {
                        m_MoveScrTimer = 120;
                        m_MoveScrMode ^= 1;
                        m_ScrollShake = true;
                     }
                  }
               }

               if (State.m_ScrA_H_Posit < 5312) {
                  State.m_ScrB_H_Posit = 1024;
                  State.m_ScrB_V_Posit = 0;
                  m_ScrB_H_Offset = 0;
                  m_ScrB_V_Offset = 0;
                  m_MoveScrMode = 0;
                  m_Zone_Flag -= 6;
               } else if (State.m_ScrA_H_Posit >= 6912) {
                  State.m_ScrB_H_Posit = 1024;
                  State.m_ScrB_V_Posit = 0;
                  m_ScrB_H_Offset = 0;
                  m_ScrB_V_Offset = 0;
                  m_MoveScrMode = 0;
                  m_Zone_Flag += 2;
               } else {
                  m_ScrB_HZ = m_ScrA_HZ;
                  m_ScrB_VZ = m_ScrA_VZ;
                  var9 = State.m_ScrA_H_Posit;
                  var4 = State.m_ScrA_V_Posit;
                  this.c(var9, var4);
               }
               break label386;
            case 8:
               if (State.m_ScrA_H_Posit < 6912) {
                  m_ScrollMode = true;
                  State.m_ScrB_H_Posit = State.m_ScrA_H_Posit;
                  State.m_ScrB_V_Posit = State.m_ScrA_V_Posit;
                  m_ScrB_HZ = 0;
                  m_ScrB_VZ = 0;
                  m_ScrB_H_Offset = -1664;
                  State.m_ScrB_H_Posit += 1152;
                  m_ScrB_V_Offset = 768;
                  State.m_ScrB_V_Posit -= 256;
                  m_MoveScrTimer = 0;
                  m_Zone_Flag -= 2;
               } else if (m_ScrollMode) {
                  m_ScrB_HZ = 0;
                  m_ScrB_VZ = 0;
                  m_ScrollMode = false;
                  m_ScrollShake = false;
               }
               break label386;
            case 10:
               if (State.m_ScrA_H_Posit >= 11344) {
                  m_ScrALim_Left = State.m_ScrA_H_Posit;
                  m_ScrALim_N_Down = 1152;
                  m_Zone_Flag += 2;
               }
               break label386;
            case 12:
               if (State.m_ScrA_H_Posit >= 11999) {
                  m_ScrALim_Left = 12000;
                  m_ScrALim_Right = 12126;
                  m_Zone_Flag += 2;
                  cCanvas.am.setFadeOut(0, Sonic2AudioManager.VOLUME_LEVELS[cCanvas.m_Option[2]], 360);
                  m_ScrChkWork = 0;
                  m_BossStart = 3;
               }
               break label386;
            case 14:
               cCanvas.am.killLastAudio();
               if (State.m_ScrA_V_Posit >= 1144) {
                  m_ScrALim_Up = 1144;
               }

               if (++m_ScrChkWork >= 90 && this.insertAction(82) != null) {
                  m_Zone_Flag += 2;
                  if (!cCanvas.am.isStarted(7)) {
                     cCanvas.am.bgmset(2);
                  }
               }
               break label386;
            case 16:
               if (m_BossFlag != 0) {
                  m_ScrALim_Left = State.m_ScrA_H_Posit;
                  if (State.m_ScrA_H_Posit >= 12512) {
                     if (m_ScrALim_Up >= 1064) {
                        m_ScrALim_Up -= 2;
                     }

                     if (m_ScrALim_N_Down >= 1072) {
                        m_ScrALim_N_Down -= 2;
                     }
                  }
               }
            }
         }
         break;
      case 12:
         int var13;
         switch(m_SLOTWK_EVN_LEV) {
         case 0:
            m_SLOTWK_EVN_LEV = 0;
            m_SLOTWK_HIT_VAL = 0;
            q = new int[3][3];
            o = 0;
            p = 0;
            var4 = (int)crlCanvas.mCounter & 255;
            q[0][0] = var4 << 8 | 8;
            var4 = (var4 << 5 | var4 >> 3) & 255;
            q[1][0] = var4 << 8 | 8;
            var4 = (var4 << 5 | var4 >> 3) & 255;
            q[2][0] = var4 << 8 | 8;
            q[0][1] = 8;
            q[1][1] = 8;
            q[2][1] = 8;
            o = 1;
            m_SLOTWK_EVN_LEV = 4;
         case 1:
         case 2:
         case 3:
         case 5:
         case 6:
         case 7:
         case 9:
         case 10:
         case 11:
         case 13:
         case 14:
         case 15:
         case 17:
         case 18:
         case 19:
         case 21:
         case 22:
         case 23:
         case 24:
         default:
            break;
         case 4:
            this.c();
            if (o == 0) {
               m_SLOTWK_EVN_LEV = 24;
               q[0][1] = 0;
               q[1][1] = 0;
               q[2][1] = 0;
            }
            break;
         case 8:
            var4 = (int)crlCanvas.mCounter & 7;
            var4 -= 4;
            var4 += 48;
            q[0][1] = var4;
            var4 = ((var4 = (int)crlCanvas.mCounter & 7) >> 4 | var4 << 4) & 7;
            var4 -= 4;
            var4 += 48;
            q[1][1] = var4;
            var4 = ((int)crlCanvas.mCounter & 1792) >> 8;
            var4 -= 4;
            var4 += 48;
            q[2][1] = var4;
            o = 2;
            p = 0;
            q[0][2] = 0;
            q[1][2] = 0;
            q[2][2] = 0;
            m_SLOTWK_EVN_LEV = 12;
            var4 = ((var4 = (int)crlCanvas.mCounter & 255) << 5 | var4 >> 3) & 255;
            int[][] var14 = u;

            for(var13 = 0; var14[var13][0] != 255 && (var4 -= var14[var13][0]) >= 0; ++var13) {
            }

            if (var14[var13][0] != 255) {
               m_SLOTWK_HIT_VAL = var14[var13][1];
            } else {
               int var1 = var4 & 7;
               m_SLOTWK_HIT_VAL = t[0][var1] << 8;
               var1 = (var4 = (var4 << 5 | var4 >> 3) & 255) & 7;
               var9 = t[1][var1] << 4;
               var4 = (var4 << 5 | var4 >> 3) & 255 & 7;
               m_SLOTWK_HIT_VAL |= t[2][var4] | var9;
            }
            break;
         case 12:
            this.c();
            if (o == 0) {
               int[] var10000 = q[0];
               var10000[1] += 48;
               var10000 = q[1];
               var10000[1] += 48;
               var10000 = q[2];
               var10000[1] += 48;
               var4 = (int)crlCanvas.mCounter & 255 & 15;
               var4 += 12;
               o = var4;
               m_SLOTWK_EVN_LEV = 16;
            }
            break;
         case 16:
            this.c();
            if (q[0][2] == 12 && q[1][2] == 12 && q[2][2] == 12) {
               this.d();
            } else {
               var4 = q[p / 4][2];
               int[] var5 = q[p / 4];
               int[] var6 = t[p / 4];
               if (var4 != 0) {
                  break;
               }

               if (p != 0) {
                  if (q[p / 4 - 1][1] != 0) {
                     break;
                  }
               } else if (o >= 0) {
                  break;
               }

               int var12 = m_SLOTWK_HIT_VAL;
               if ((var13 = p) != 0) {
                  var12 >>= var13;
               }

               var12 = var12 &= 7;
               var13 = (var13 = var5[0]) >> 8 & 7;
               if (var6[var13] == var12 && (var5[0] + var5[1] & 255) <= var5[1] << 1) {
                  var5[0] &= 65280;
                  var5[2] += 12;
                  var5[1] = 0;
                  this.a(var5, p / 4);
               }
            }
            break;
         case 20:
            this.d();
         }

         if (actNumber != 0) {
            switch(m_Zone_Flag) {
            case 0:
               if (State.m_ScrA_H_Posit >= 10176) {
                  m_ScrALim_Left = State.m_ScrA_H_Posit;
                  m_ScrALim_N_Down = 1582;
                  m_Zone_Flag += 2;
               }
            case 1:
            case 3:
            case 5:
            default:
               break label386;
            case 2:
               if (State.m_ScrA_H_Posit >= 10384) {
                  m_ScrALim_Left = 10336;
                  m_ScrALim_Right = 10464;
                  m_Zone_Flag += 2;
                  cCanvas.am.setFadeOut(0, Sonic2AudioManager.VOLUME_LEVELS[cCanvas.m_Option[2]], 360);
                  m_ScrChkWork = 0;
                  m_BossStart = 6;
               }
               break label386;
            case 4:
               cCanvas.am.killLastAudio();
               if (State.m_ScrA_V_Posit >= 1248) {
                  m_ScrALim_Up = 1248;
               }

               if (++m_ScrChkWork >= 90 && this.insertAction(81) != null) {
                  m_Zone_Flag += 2;
                  cCanvas.am.bgmset(2);
               }
               break label386;
            case 6:
               if (State.m_ScrA_H_Posit >= 10752) {
                  m_ScrALim_N_Down = 1488;
                  m_ScrALim_Left = Math.max(State.m_ScrA_H_Posit - m_ScrollA_LeftOffset, m_ScrALim_Left);
               }
            }
         }
         break;
      case 13:
         if (actNumber != 0) {
            switch(m_Zone_Flag) {
            case 0:
               if (State.m_ScrA_H_Posit >= 9856) {
                  m_ScrALim_Left = State.m_ScrA_H_Posit;
                  m_ScrALim_N_Down = 1104;
                  m_Zone_Flag += 2;
               }
            case 1:
            case 3:
            case 5:
            default:
               break;
            case 2:
               if (State.m_ScrA_H_Posit >= 10784) {
                  m_ScrALim_Left = 10784;
                  m_ScrALim_Right = 10784;
                  m_ScrollA_LeftOffset_dist = 40;
                  m_ScrollA_RightOffset_dist = 0;
                  m_Zone_Flag += 2;
                  cCanvas.am.setFadeOut(0, Sonic2AudioManager.VOLUME_LEVELS[cCanvas.m_Option[2]], 360);
                  m_ScrChkWork = 0;
                  m_BossStart = 1;
               }
               break;
            case 4:
               cCanvas.am.killLastAudio();
               if (State.m_ScrA_V_Posit > 1096) {
                  m_ScrALim_Up = 1096;
               }

               if (++m_ScrChkWork >= 90 && this.insertAction(93) != null) {
                  m_Zone_Flag += 2;
                  cCanvas.am.bgmset(2);
               }
               break;
            case 6:
               m_ScrALim_Left = Math.max(State.m_ScrA_H_Posit - m_ScrollA_LeftOffset, m_ScrALim_Left);
            }
         }
         break;
      case 15:
         if (actNumber != 0) {
            switch(m_Zone_Flag) {
            case 0:
               if (State.m_ScrA_H_Posit >= 10256) {
                  m_ScrALim_Left = State.m_ScrA_H_Posit;
                  m_ScrALim_N_Down = 1024;
                  m_Zone_Flag += 2;
                  m_BossStart = 4;
               }
            case 1:
            case 3:
            case 5:
            default:
               break;
            case 2:
               if (State.m_ScrA_H_Posit >= 10816) {
                  m_ScrALim_Right = 10816;
                  m_ScrollA_LeftOffset_dist = 40;
                  m_ScrollA_RightOffset_dist = 0;
                  m_Zone_Flag += 2;
                  cCanvas.am.setFadeOut(0, Sonic2AudioManager.VOLUME_LEVELS[cCanvas.m_Option[2]], 360);
                  m_ScrChkWork = 0;
                  this.insertAction(137);
               }
               break;
            case 4:
               cCanvas.am.killLastAudio();
               if (State.m_ScrA_V_Posit >= 1016) {
                  m_ScrALim_Up = 1016;
                  m_ScrALim_Down = 1016;
               }

               if (++m_ScrChkWork >= 90) {
                  m_Zone_Flag += 2;
                  cCanvas.am.bgmset(2);
               }
               break;
            case 6:
               m_ScrALim_Left = Math.max(State.m_ScrA_H_Posit - m_ScrollA_LeftOffset, m_ScrALim_Left);
            }
         }
      }

      byte var8 = 2;
      if (m_ScrALim_N_Down != m_ScrALim_Down) {
         if (m_ScrALim_N_Down < m_ScrALim_Down) {
            if (State.m_ScrA_V_Posit > m_ScrALim_Down) {
               m_ScrALim_Down = State.m_ScrA_V_Posit;
            }

            m_ScrALim_Down += -2;
            m_LimOverFlag = 1;
         } else {
            if (State.m_ScrA_V_Posit + 8 >= m_ScrALim_Down && (State.mSonicAction.m_Cddat & 2) != 0) {
               var8 = 8;
            }

            m_ScrALim_Down += var8;
            m_LimOverFlag = 1;
         }
      }

      switch(zoneNumber) {
      case 7:
         if (m_ScrollMode) {
            int var2 = m_ScrB_HZ << 16;
            var15 = true;
            setScrB_H_Posit(getScrB_H_Posit() + var2);
            var9 = m_ScrB_VZ << 16;
            var15 = false;
            setScrB_V_Posit(getScrB_V_Posit() + var9);
         }
      default:
      }
   }

   protected void drawSpecialActions(Graphics var1) {
      if (State.mActions != null) {
         for(int var2 = 0; var2 < State.mActions.length; ++var2) {
            if (State.mActions[var2] != null) {
               State.mActions[var2].render(var1);
            }
         }
      }

   }

   public static int decodePlTime(int var0) {
      int var1 = var0 & 255;
      int var2 = var0 >> 8 & 255;
      return (var0 >> 16 & 255) * 3600 + var2 * 60 + var1;
   }

   public void clearGame() {
      this.m_LocalState = 5;
      this.a = 0;
   }

   protected void drawBGImage(Graphics var1, int var2) {
      var1 = var1;
      byte[][] var3 = this.BGBLK[zoneNumber];
      int var4;
      int var5;
      int var6;
      int[] var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      switch(zoneNumber) {
      case 0:
         var4 = State.m_ScrA_H_Posit / 7;
         var5 = State.m_ScrA_H_Posit / 3;
         var6 = var4 & 15;
         var12 = var5 & 15;

         for(var8 = 16; var8 < 128; var8 += 16) {
            for(var9 = var4; var9 < var4 + 240 + var6; var9 += 16) {
               var10 = this.getBlockNumber(var9 & 511, var8, var3[0], this._mMapData);
               if (this.a(var10) == var2) {
                  this.drawBlock(var1, var10, var9 - var4 - var6, var8 + 70);
               }
            }
         }

         for(var8 = 0; var8 < 128; var8 += 16) {
            for(var9 = var5; var9 < var5 + 240 + var12; var9 += 16) {
               var10 = this.getBlockNumber(var9 & 511, var8, var3[1], this._mMapData);
               if (this.a(var10) == var2) {
                  this.drawBlock(var1, var10, var9 - var5 - var12, var8 + 70 + 128);
               }
            }
         }

         return;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 8:
      case 9:
      case 10:
      case 11:
      case 14:
      case 16:
      default:
         break;
      case 7:
         if (var2 != 0) {
            return;
         }

         var4 = State.m_ScrA_H_Posit / 7 & 1023;
         var5 = (int)crlCanvas.mCounter & 1023;
         var6 = State.m_ScrA_V_Posit / 56;
         var7 = new int[]{var4, var5};

         for(var8 = 0; var8 < var7.length; ++var8) {
            var9 = var7[var8] & 15;

            for(var10 = 0; var10 < 128; var10 += 16) {
               var2 = var10 + (var8 << 3 << 4);

               for(var11 = var7[var8]; var11 < var7[var8] + 240 + var9; var11 += 16) {
                  if ((var4 = a(var11 & 1023, var2, this._mZoneMapData, this._mMapData)) < 753 || var4 > 760) {
                     this.drawBlock(var1, var4, var11 - var7[var8] - var9, var2 + 70 + 16 - var6);
                  }
               }
            }
         }

         return;
      case 12:
         if (var2 == 0) {
            var4 = State.m_ScrA_H_Posit / 50 % 512;
            var5 = Math.min(State.m_ScrA_V_Posit / 50, 128 * var3.length - 310);

            for(var6 = 0; var6 < var3.length; ++var6) {
               var12 = var4 & 15;

               for(var8 = 0; var8 < 128 && (var6 << 3 << 4) + var8 <= var5 + 70 + 240; var8 += 16) {
                  if ((var6 << 3 << 4) + var8 >= var5 - 16) {
                     for(var9 = var4; var9 < var4 + 240 + var12; var9 += 16) {
                        var10 = this.getBlockNumber(var9, var8, var3[var6], this._mMapData);
                        this.drawBlock(var1, var10, var9 - var4 - var12, var8 + (var6 << 3 << 4) - var5);
                     }
                  }
               }
            }

            return;
         }
         break;
      case 13:
         var4 = State.m_ScrA_H_Posit / 7 % 768;
         var5 = Math.min(State.m_ScrA_V_Posit / 7, 360);
         var6 = var4 & 15;

         for(var12 = 0; var12 < 5; ++var12) {
            for(var8 = 0; var8 < 128 && (var12 << 3 << 4) + var8 <= var5 + 40 + 240; var8 += 16) {
               if ((var12 << 3 << 4) + var8 >= var5 - 16) {
                  for(var9 = var4; var9 < var4 + 240 + var6; var9 += 16) {
                     var10 = this.getBlockNumber(var9 % 768, var8, var3[var12], this._mMapData);
                     if (this.a(var10) == var2) {
                        this.drawBlock(var1, var10, var9 - var4 - var6, var8 + (var12 << 3 << 4) - var5);
                     }
                  }
               }
            }
         }

         return;
      case 15:
         if (var2 != 0) {
            return;
         }

         var4 = State.m_ScrA_H_Posit / 5;
         var5 = State.m_ScrA_H_Posit / 3;
         var6 = (State.m_ScrA_V_Posit << 1) / 5;
         var7 = new int[]{var5, var5, var5, var4, var5, var5, var5};

         for(var8 = 0; var8 < var7.length; ++var8) {
            var9 = var7[var8] & 15;

            for(var10 = 0; var10 < 168 && (var8 << 3 << 4) + var10 <= var6 + 40 + 240; var10 += 16) {
               if ((var8 << 3 << 4) + var10 >= var6 - 16) {
                  for(var2 = var7[var8]; var2 < var7[var8] + 240 + var9; var2 += 16) {
                     var11 = a(var2, var10 + (var8 << 3 << 4), this._mZoneMapData, this._mMapData);
                     this.drawBlock(var1, var11, var2 - var7[var8] - var9, var10 + (var8 << 3 << 4) - var6);
                  }
               }
            }
         }

         return;
      }

   }

   public void continueGame() {
      this.m_LocalState = 3;
      this.a = 0;
      m_Accept_Softkey = 2;
   }

   public static int getGameTimer() {
      return m_GameTimer & 255;
   }

   public void atariRideSub2(int var1, int var2, int var3, int var4, int var5, int var6, Action var7, Action var8) {
      this.atariRideSub3(var1, var3, var4, var5, var6, var7, var8);
      var6 <<= 1;
      this.atariRideSub3(var1, var3, var4, var5, var6, var7, State.mTailsAction);
   }

   public static int encodePlTime(int var0) {
      int var1 = var0 % 60;
      int var2 = var0 % 3600 / 60;
      return (var0 /= 3600) << 16 | var2 << 8 | var1;
   }

   public int emyCol_R(int var1, int var2, int var3) {
      var1 += var3;
      return this.scdChk_R(var1, var2, 8192, 16, 0);
   }

   public int emyCol_L(int var1, int var2, int var3) {
      var1 += var3;
      return this.scdChk_R(var1, var2, 8192, -16, 1024);
   }

   public int emyCol_U(int var1, int var2, int var3) {
      var2 = var2 - var3 ^ 15;
      return this.a(var1, var2, 8192, -16, 2048);
   }

   public void rideChkSub_h(int var1, int var2, int var3, int var4, int var5, int var6, Action var7) {
      Action[] var8 = new Action[]{State.mSonicAction, State.mTailsAction};
      boolean var9 = false;
      int var18 = 4;

      for(int var10 = 0; var10 < 2; ++var10) {
         Action var11;
         if ((var11 = var8[var10]) == null) {
            return;
         }

         var18 <<= 1;
         int var12;
         if ((var7.m_Cddat & var18) == 0) {
            int var17;
            if (var11.m_Yspeed >= 0 && (var17 = var11.m_Xposi - var7.m_Xposi + var3) >= 0) {
               var12 = var3 + var3;
               if (var17 < var12) {
                  var17 = var7.m_Yposi;
                  this.a(var17, var6, var18, var7, var11);
               }
            }
         } else {
            var4 = var3 + var3;
            if ((var11.m_Cddat & 2) == 0 && (var12 = var11.m_Xposi - var7.m_Xposi + var3) >= 0 && var12 < var4) {
               this.ridePlaySet2(var1, var1, var6, var7, var11);
            } else {
               var11.m_Cddat &= -9;
               var11.m_Cddat |= 2;
               var7.m_Cddat &= ~var18;
            }
         }
      }

   }

   public void rideChkSubR(int var1, int var2, int var3, int var4, Action var5) {
      Action[] var11 = new Action[]{State.mSonicAction, State.mTailsAction};
      boolean var6 = false;
      int var12 = 4;

      for(int var7 = 0; var7 < 2; ++var7) {
         Action var8;
         if ((var8 = var11[var7]) == null) {
            return;
         }

         var12 <<= 1;
         if ((var5.m_Cddat & var12) == 0) {
            if ((var8.m_Cddat & 8) == 0) {
               this.rideonChk(var5.m_Xposi, var5.m_Yposi, var2, var4, var12, var5, var8);
            }
         } else {
            int var9 = var2 + var2;
            int var10;
            if ((var8.m_Cddat & 2) == 0 && (var10 = var8.m_Xposi - var5.m_Xposi + var2) >= 0 && var10 < var9) {
               this.ridePlaySet2(var1, var1, var4, var5, var8);
            } else {
               var8.m_Cddat &= -9;
               var8.m_Cddat |= 2;
               var5.m_Cddat &= ~var12;
            }
         }
      }

   }

   private void a(int[] var1, int var2) {
      Graphics var3 = this.r[var2].getGraphics();
      int var4 = var1[0] >> 8 & 7;
      int var10000 = var1[0];
      byte var5 = 0;
      var3.drawRegion(this.s[0], t[var2][var4] << 1 << 4, 0, 32, 32, 0, 0, -var5, 20);
      var3.drawRegion(this.s[0], t[var2][var4] << 1 << 4, 0, 32, 32, 0, 0, -var5 + 32, 20);
   }

   private final void c() {
      int var1 = p;
      int[] var2 = q[var1 / 4];
      int var3 = var1 / 4;
      switch(var1) {
      case 0:
         p += 4;
         break;
      case 4:
         p += 4;
         break;
      case 8:
         p = 0;
         --o;
      }

      var1 = var2[0];
      int var4 = var2[1];
      var2[0] -= var4;
      var4 = var2[0];
      var1 &= 2040;
      var4 &= 2040;
      if (var1 != var4) {
         this.a(var2, var3);
      }
   }

   private final void d() {
      q[0][1] = 0;
      q[1][1] = 0;
      q[2][1] = 0;
      o = 0;
      int var1;
      int var2 = var1 = m_SLOTWK_HIT_VAL & 255;
      var1 = (var1 &= 240) >> 4;
      var2 &= 15;
      int var3 = 0;
      if (m_SLOTWK_HIT_VAL >> 8 == var1) {
         var3 += 4;
      }

      if (m_SLOTWK_HIT_VAL >> 8 == var2) {
         var3 += 8;
      }

      label31: {
         switch(var3) {
         case 0:
         default:
            break;
         case 4:
            if (var1 == 3) {
               m_SLOTWK_HIT_VAL = v[var2] << 2;
               break label31;
            }

            if (var2 == 3) {
               m_SLOTWK_HIT_VAL = v[var1] << 1;
               break label31;
            }
            break;
         case 8:
            if (var2 == 3) {
               m_SLOTWK_HIT_VAL = v[var1] << 2;
               break label31;
            }

            if (var1 == 3) {
               m_SLOTWK_HIT_VAL = v[var2] << 1;
               break label31;
            }
            break;
         case 12:
            m_SLOTWK_HIT_VAL = v[var1];
            break label31;
         }

         this.b(var1, var2);
      }

      m_SLOTWK_EVN_LEV = 24;
   }

   private void b(int var1, int var2) {
      boolean var3 = false;
      int var4;
      if (var1 == var2) {
         if (m_SLOTWK_HIT_VAL >> 8 == 3) {
            m_SLOTWK_HIT_VAL = v[var1] << 1;
            return;
         }

         if (var1 == 3) {
            var4 = m_SLOTWK_HIT_VAL >> 8 & 15;
            m_SLOTWK_HIT_VAL = v[var4] << 2;
            return;
         }
      }

      var4 = 0;
      if (m_SLOTWK_HIT_VAL >> 8 == 5) {
         var4 = 2;
      }

      if (var1 == 5) {
         var4 += 2;
      }

      if (var2 == 5) {
         var4 += 2;
      }

      m_SLOTWK_HIT_VAL = var4;
   }

   public int fColRideChk(Action var1) {
      Action var10000;
      if ((var1.m_Cddat & 8) != 0 && this.plyCol_D(State.mSonicAction) <= 0) {
         var10000 = State.mSonicAction;
         var10000.m_Cddat &= -9;
         var10000 = State.mSonicAction;
         var10000.m_Cddat |= 2;
         var1.m_Cddat &= -9;
      }

      if ((var1.m_Cddat & 16) != 0 && this.plyCol_D(State.mTailsAction) <= 0) {
         var10000 = State.mTailsAction;
         var10000.m_Cddat &= -9;
         var10000 = State.mTailsAction;
         var10000.m_Cddat |= 2;
         var1.m_Cddat &= -17;
      }

      return 0;
   }

   public int plyCol_D(Action var1) {
      return this.a(var1.m_Xposi, var1.m_Yposi + var1.m_Sprvs, var1.m_Rideonwk, 16, 0);
   }

   private boolean c(int var1, int var2) {
      if ((var1 = var1 - State.m_ScrB_H_Posit - m_ScrB_H_Offset) < 0) {
         if (var1 <= -16) {
            var1 = -16;
         }
      } else if (var1 >= 16) {
         var1 = 16;
      }

      m_ScrB_HZ = var1;
      if ((var2 = var2 - State.m_ScrB_V_Posit - m_ScrB_V_Offset) < 0) {
         if (var2 < -16) {
            var2 = -16;
         }
      } else if (var2 > 16) {
         var2 = 16;
      }

      m_ScrB_VZ = var2;
      return (var2 | var1) == 0;
   }

   public int rideChkSub_t(int var1, int var2, int var3, int var4, int var5, int var6, Action var7, int[] var8) {
      Action[] var9 = new Action[]{State.mSonicAction, State.mTailsAction};
      int[] var10 = new int[]{8, 16};

      for(int var11 = 0; var11 < 2; ++var11) {
         Action var12 = var9[var11];
         int var13 = var10[var11];
         if (var12 != null) {
            int var14;
            if ((var7.m_Cddat & var13) == 0) {
               var14 = var13;
               boolean var10000;
               if (var12.m_Yspeed < 0) {
                  var10000 = false;
               } else {
                  int var18;
                  if ((var18 = var12.m_Xposi - var7.m_Xposi + var3) < 0) {
                     var10000 = false;
                  } else {
                     var13 = var3 + var3;
                     if ((var18 & '\uffff') >= var13) {
                        var10000 = false;
                     } else {
                        if ((var7.m_Actflg & 1) != 0) {
                           var18 = (var18 = ~var18) + var13;
                        }

                        var18 >>= 1;
                        var13 = var8[var18];
                        var18 = var7.m_Yposi;
                        this.a(var18, var13, var14, var7, var12);
                        var10000 = false;
                     }
                  }
               }
            } else {
               var4 = var3 + var3;
               if ((var12.m_Cddat & 2) == 0 && (var14 = var12.m_Xposi - var7.m_Xposi + var3) >= 0 && var14 < var4) {
                  this.ridePlaySet_t(var1, var3, var1, var6, var7, var12, var8);
               } else {
                  var12.m_Cddat &= -9;
                  var12.m_Cddat |= 2;
                  var7.m_Cddat &= ~var13;
               }
            }
         }
      }

      return 0;
   }

   public void pause() {
      if (this.m_LocalState != 1 && (this.m_LocalState != 6 || loading_cont)) {
         softkeySet_Pause();
         m_Accept_Softkey = 3;
         this.m_LocalState_Backup = this.m_LocalState;
         this.m_LocalState = 1;
         State.drawLoadingText = false;
         m_PAUSE_Cursor = 0;
      }

      cCanvas.am.stopAllAudio();
   }

   public void resume() {
      this.m_LocalState = this.m_LocalState_Backup;
      m_Accept_Softkey = 0;
      if (stageClear) {
         State.setSoftKey(512, (String)null);
         State.setSoftKey(256, (String)null);
      } else {
         if (this.m_LocalState == 7) {
            State.setSoftKey(256, b[cCanvas.m_Option[0]][1]);
            State.setSoftKey(512, b[cCanvas.m_Option[0]][2]);
         } else {
            State.setSoftKey(256, (String)null);
            State.setSoftKey(512, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][0]);
         }

         if (State.mSonicAction.m_AirCnt < 12) {
            cCanvas.am.bgmset(4);
         } else {
            byte var1 = 0;
            if (PlayerAction.game_over_mid) {
               var1 = 7;
            }

            if ((State.mSonicAction.m_PlPower & 2) != 0) {
               var1 = 5;
            }

            if (m_SSonicFlag != 0) {
               var1 = 9;
            }

            if (m_BossStart != 0) {
               var1 = 2;
            }

            cCanvas.am.bgmset(var1);
         }
      }
   }

   public static final int getScrB_H_Posit() {
      return State.m_ScrB_H_Posit << 16 | State.m_ScrB_H_Posit_2 & '\uffff';
   }

   public static final void setScrB_H_Posit(int var0) {
      State.m_ScrB_H_Posit = var0 >> 16;
      State.m_ScrB_H_Posit_2 = var0 & '\uffff';
   }

   public static final int getScrB_V_Posit() {
      return State.m_ScrB_V_Posit << 16 | State.m_ScrB_V_Posit_2 & '\uffff';
   }

   public static final void setScrB_V_Posit(int var0) {
      State.m_ScrB_V_Posit = var0 >> 16;
      State.m_ScrB_V_Posit_2 = var0 & '\uffff';
   }

   public int emyCol_D3(int var1, int var2, int var3) {
      var2 += var3;
      return this.a(var1, var2, 4096, 16, 0);
   }

   private void a(Object var1) {
      State.setSoftKey(256, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][1]);
      State.setSoftKey(512, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][7]);
      this.a = 0;
      this.H = (int[])((int[])var1);
      cCanvas.am.bgmset(8);
      this.I = 703;
      (J = new Image[2])[0] = PlayerAction2.getPlayerSprites()[4];
      J[1] = PlayerAction2.getPlayerSprites()[5];
      this.N = PlayerAction.getPlayerSprites();
      Z = 0;
      this.O = 0;
      P = 0;
      Q = 0;
      this.R = 1;
      this.S = 0;
      U = 0;
      V = 0;
      this.T = 1;
      this.W = 103;
      this.X = 133;
   }

   public void continuemd_disposeImages() {
      J = null;
      this.N = null;
   }

   public static void addRanking() {
      int[][] var0 = new int[cCanvas.m_Ranking.length + 1][2];

      int var1;
      for(var1 = 0; var1 < cCanvas.m_Ranking.length; ++var1) {
         var0[var1] = cCanvas.m_Ranking[var1];
      }

      var0[cCanvas.m_Ranking.length][0] = m_PlScore * 10;
      var0[cCanvas.m_Ranking.length][1] = cCanvas.m_Option[1];

      for(var1 = 0; var1 < cCanvas.m_Ranking.length; ++var1) {
         int var2 = var0[var1][0];
         int var3 = var1;

         for(int var4 = var1 + 1; var4 < cCanvas.m_Ranking.length + 1; ++var4) {
            if (var2 < var0[var4][0]) {
               var2 = var0[var4][0];
               var3 = var4;
            }
         }

         int[] var5 = var0[var1];
         var0[var1] = var0[var3];
         var0[var3] = var5;
      }

      for(var1 = 0; var1 < cCanvas.m_Ranking.length; ++var1) {
         cCanvas.m_Ranking[var1] = var0[var1];
      }

      cCanvas.saveRanking();
   }

   private void d(int var1, int var2) {
      cCanvas.m_Option[8] = var1 << 8 | var2;
      int var3 = m_PlScore * 10;
      cCanvas.m_Option[4] = var3 >> 16;
      cCanvas.m_Option[5] = var3 & '\uffff';
      cCanvas.m_Option[6] = m_Pl_Suu;
      cCanvas.m_Option[7] = m_ChaosCnt;
      cCanvas.saveOption();
   }

   protected void updatePauseMenu() {
      int var1;
      if ((var1 = cCanvas.getNowOnTKeyBuf()) == 1) {
         m_PAUSE_Cursor = (m_PAUSE_Cursor += 2) % 3;
      } else if (var1 == 2) {
         m_PAUSE_Cursor = ++m_PAUSE_Cursor % 3;
      } else {
         if (var1 == 4) {
            if (m_PAUSE_Cursor == 1) {
               cCanvas.m_Option[2] = (cCanvas.m_Option[2] + 3) % 4;
               cCanvas.am.setGlobalVolume(Sonic2AudioManager.VOLUME_LEVELS[cCanvas.m_Option[2]], true);
               return;
            }
         } else if (var1 == 8) {
            if (m_PAUSE_Cursor == 1) {
               cCanvas.m_Option[2] = (cCanvas.m_Option[2] + 1) % 4;
               cCanvas.am.setGlobalVolume(Sonic2AudioManager.VOLUME_LEVELS[cCanvas.m_Option[2]], true);
               return;
            }
         } else {
            if (var1 == 512) {
               this.resume();
               return;
            }

            if (var1 == 16 || var1 == 256) {
               switch(m_PAUSE_Cursor) {
               case 0:
                  this.resume();
                  return;
               case 2:
                  this.m_LocalState = 6;
                  m_PAUSE_Cursor = 1;
                  State.setSoftKey(256, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][1]);
                  State.setSoftKey(512, STRINGS_PAUSE_MENU[cCanvas.m_Option[0]][2]);
               }
            }
         }

      }
   }

   protected void updateConfirm() {
      if (State.loadStage) {
         State.loadStage = false;
         cCanvas.saveOption();
         cCanvas.am.stopAllAudio();
         if (TitleState.mDemo > 0) {
            _quitDemo = true;
            m_PAUSE_Cursor = 1;
            this.m_LocalState = 5;
            this.a = 0;
         } else {
            cCanvas.setState(4, new Integer(3));
         }
      } else {
         int var1;
         if ((var1 = cCanvas.getNowOnTKeyBuf()) != 1 && var1 != 2) {
            if (var1 != 16 && var1 != 256) {
               if (var1 == 512) {
                  this.m_LocalState = 1;
                  m_PAUSE_Cursor = 0;
               }

            } else if (m_PAUSE_Cursor == 0) {
               State.drawLoadingText = true;
               State.setSoftKey(256, (String)null);
               State.setSoftKey(512, (String)null);
            } else {
               this.m_LocalState = 1;
               m_PAUSE_Cursor = 0;
            }
         } else {
            m_PAUSE_Cursor = 1 - m_PAUSE_Cursor;
         }
      }
   }

   private void a(boolean var1, boolean var2, int[] var3) {
      loading_cont = true;
      stageClear = false;
      m_GameFlag = 0;
      zoneNumber = var3[0];
      actNumber = var3[1];
      if (var3[5] != 0) {
         m_PlFlag = 0;
         State.m_PlFlag_s = 0;
      }

      this.loadMapData(var1, var2);
      State.mReserves = new int[(State.mActions = new Action[512]).length][21];
      m_FlagWorkCnt = new int[130];
      m_ActionWorkCnt = new boolean[300];
      this.C = 0;
      if (var1) {
         Action.disposePreviousImages(zoneNumber);
         Action.prepareImages(zoneNumber);
      }

      if (var1) {
         BossAction.disposeImages();
         Action.prepareBossImages(zoneNumber);
      }

      super.m_PlayerIndex = -1;
      (State.mSonicAction = this.insertAction(1)).m_Xposi = PLAYER_START_POS_TBL[zoneNumber][actNumber << 1];
      State.mSonicAction.m_Yposi = PLAYER_START_POS_TBL[zoneNumber][(actNumber << 1) + 1];
      State.mSonicAction.m_AutoFrameout = false;
      m_Pl_Suu = var3[3];
      m_PlScore = var3[2] / 10;
      m_PlRing = 0;
      (State.mTailsAction = this.insertAction(2)).m_Xposi = State.mSonicAction.m_Xposi;
      State.mTailsAction.m_Yposi = State.mSonicAction.m_Yposi;
      State.mTailsAction.m_Xposi_2 = State.mSonicAction.m_Xposi_2;
      State.mTailsAction.m_Yposi_2 = State.mSonicAction.m_Yposi_2;
      State.mTailsAction.m_AutoFrameout = false;
      if (var3[5] == 0) {
         this.playLoad();
      } else {
         this.playSaves(State.mSonicAction);
      }

      this.initSpriteBuffer();
      GameState var10 = this;
      mMasterRing = this.insertAction(221);

      for(int var11 = 0; var11 < var10.m_RingData.length; ++var11) {
         int[][] var4 = new int[][]{{24, 0}, {0, 24}};
         int var5 = var10.m_RingData[var11][2] >> 15 & 1;
         int var6 = var10.m_RingData[var11][2] >> 12 & 7;

         for(int var7 = 0; var7 <= var6; ++var7) {
            Action var8;
            (var8 = var10.insertAction(37)).m_Xposi = var10.m_RingData[var11][0] + var4[var5][0] * var7;
            var8.m_Yposi = var10.m_RingData[var11][1] + var4[var5][1] * var7;
            var8.m_AutoFrameout = false;
         }
      }

      this.scroll();
      this.insertAction(52);
      var10 = this;
      m_WaterMode = false;
      m_WaterFlag = false;
      if (zoneNumber == 13 || zoneNumber == 14 || zoneNumber == 15) {
         switch(zoneNumber) {
         case 13:
            if (actNumber == 1) {
               m_WaterMode = true;
               m_WaterMovePosi = 1808;
               m_WaterPosi_m = 1808;
               m_WaterPosi = 1808;
            }
            break;
         case 15:
            m_WaterMode = true;
            switch(actNumber) {
            case 0:
               m_WaterMovePosi = 1040;
               m_WaterPosi_m = 1040;
               m_WaterPosi = 1040;
               break;
            case 1:
               m_WaterMovePosi = 1296;
               m_WaterPosi_m = 1296;
               m_WaterPosi = 1296;
            }
         }

         try {
            if (zoneNumber == 13) {
               var10.waterImage = Image.createImage("/wpink.png");
            } else {
               var10.waterImage = Image.createImage("/water.png");
            }
         } catch (Exception var9) {
         }
      }

      m_ChaosCnt = var3[4];
      if (m_PlFlag == 0) {
         m_PlRing = 0;
         m_PlTime = 0;
         m_PlRing_F2 = 0;
         Utilities.reset1DIntArray(m_FlagWorkCnt);
      }

      m_PlTimeOver_F = false;
      m_GameFlag = 0;
      m_PlRing_T = 0;
      m_PlItem = 0;
      m_PlScore_F = 1;
      m_PlRing_F = 1;
      m_PlTime_F = 0;
      m_ClChgTimSS = 0;
      m_ClChgFlagSS = 0;
      m_ClChgCntSS = 0;
      m_ScrollShake = false;
      m_Scroll_Start = 1;
      m_Zone_Flag = 0;
      m_ScrollA_LeftOffset = 0;
      m_ScrollA_LeftOffset_dist = 0;
      m_ScrollA_RightOffset = 80;
      m_ScrollA_RightOffset_dist = 80;
      m_BossFlag = 0;
      m_BossStart = 0;
      m_BossState = 0;
      if (zoneNumber == 12) {
         var10 = this;
         if (this.s == null) {
            String[] var12 = new String[]{Filenames.FILENAMES[37]};
            this.s = new Image[var12.length];
            Utilities.loadImages(var12, this.s);
            this.r = new Image[3];

            for(int var13 = 0; var13 < 3; ++var13) {
               var10.r[var13] = Image.createImage(32, 32);
            }
         }

         m_SLOTWK_EVN_LEV = 0;
         q = new int[4][3];
         m_Ita0cwk = new int[40];
      }

      this.scrLimSet(zoneNumber, actNumber);
      this.sysdirInit();
      m_SwitchFlag = new int[16];
      if (this.m_ScdTbl == null) {
         this.m_ScdTbl = Utilities.arrayInputDataByte1(Filenames.FILENAMES[16]);
         this.m_ScdTblWk = Utilities.arrayInputDataByte1(Filenames.FILENAMES[17]);
         this.m_ScdTblWk2 = Utilities.arrayInputDataByte1(Filenames.FILENAMES[18]);
      }

      State.m_ScrA_H_Posit = State.mSonicAction.m_Xposi - cCanvas.viewPortWidth / 2;
      State.m_ScrA_V_Posit = State.mSonicAction.m_Yposi - cCanvas.viewPortOffset - cCanvas.viewPortHeight / 2;
      m_ScrA_VLine = cCanvas.viewPortOffset + cCanvas.viewPortHeight / 2;
      m_GameTimer = 0;
      m_ScrollStop = false;
      mSonicPlawaAction = null;
      cCanvas.am.setAudioBank(this);
      cCanvas.am.loadCurrentAudioBank();
      cCanvas.am.activeAudioBankListener();
      cCanvas.am.resetFades();
      if (this.m_LocalState == 0) {
         cCanvas.am.bgmset(1);
      }

   }

   public static void drawGMGSplash(Graphics var0, String var1) {
      cCanvas.setShade(192, 0, crlCanvas.getGameHeight() - 24);
      cCanvas.fillShade(var0);
      var0.setFont(State.fT);
      TitleState.drawBar(var0, 0, crlCanvas.getGameWidth(), true, var1, 0);
      int var2 = cCanvas.viewPortOffset + cCanvas.viewPortHeight / 3;
      drawTextWrapped(var0, aa[cCanvas.m_Option[0]], 13, var2, crlCanvas.getGameWidth() - 16);
      if (State.drawLoadingText) {
         System.out.println("loading...16");
         TitleState.drawBar(var0, cCanvas.viewPortHeight - 24, 124, true, STRINGS_LOADING[cCanvas.m_Option[0]], 0);
         State.loadStage = true;
         State.drawLoadingText = false;
      }

   }

   public static int drawTextWrapped(Graphics var0, String var1, int var2, int var3, int var4) {
      int var5 = var2;
      String var6 = null;
      int var7 = 0;
      int var10 = 0;

      for(int var8 = 0; var8 >= 0 && var8 < var1.length(); var10 = var8) {
         if ((var8 = var1.indexOf(32, var10)) == -1) {
            var8 = var1.length();
         } else {
            ++var8;
         }

         if ((var6 = var1.substring(var10, var8)).length() > 1 && var6.charAt(0) == '|') {
            var7 = 0;
            var3 += State.fontHeight;
            var2 = var5;
         } else {
            int var9 = State.fT.stringWidth(var6);
            if ((var7 += var9) > var4) {
               var7 = var9;
               var3 += State.fontHeight;
               var2 = var5;
            }

            var0.drawString(var6, var2, var3, 20);
            var2 += var9;
         }
      }

      return var3 + State.fontHeight;
   }
}
