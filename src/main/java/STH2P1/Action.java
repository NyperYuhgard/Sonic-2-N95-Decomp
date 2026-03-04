package STH2P1;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class Action {
   public static final int UNKNOWN = 0;
   public static final int PLAYER_ACTION = 1;
   public static final int PLAYER2_ACTION = 2;
   public static final int COMMON_ACTION = 3;
   public static final int EMERALD_HILL_ACTION = 4;
   public static final int CHEMICAL_PLANT_ACTION = 5;
   public static final int AQUATIC_RUIN_ACTION = 6;
   public static final int CASINO_NIGHT_ACTION = 7;
   public static final int HILL_TOP_ACTION = 8;
   public static final int BOSS_ACTION = 9;
   public int classType = 0;
   public static final int SONIC_ACT = 1;
   public static final int TAILS_ACT = 2;
   public static final int COLICHG_ACT = 3;
   public static final int WATER_ACT = 4;
   public static final int TAILS_TAIL_ACT = 5;
   public static final int SLOOP_ACT = 6;
   public static final int OILG_ACT = 7;
   public static final int PLEFECT_ACT = 8;
   public static final int PLAWA_ACT = 10;
   public static final int KAITEN_ACT = 11;
   public static final int GOLE_ACT = 13;
   public static final int HASHI_ACT = 17;
   public static final int SISOO_ACT = 20;
   public static final int BURANKO_ACT = 21;
   public static final int CABLECAR_ACT = 22;
   public static final int SHIMA_ACT = 24;
   public static final int DAI_ACT = 25;
   public static final int DASH_ACT = 27;
   public static final int BGSPR_ACT = 28;
   public static final int MEGA_ACT = 29;
   public static final int TERMINAL_ACT = 30;
   public static final int BREAK2_ACT = 31;
   public static final int YTAMA_ACT = 32;
   public static final int SIKAKEYA_ACT = 34;
   public static final int OCHI_ACT = 35;
   public static final int AWA_ACT = 36;
   public static final int RING_ACT = 37;
   public static final int ITEM_ACT = 38;
   public static final int BAKUHATU_ACT = 39;
   public static final int USAGI_ACT = 40;
   public static final int TENSUU_ACT = 41;
   public static final int DOOR_ACT = 42;
   public static final int NOBI_ACT = 43;
   public static final int LEAF_ACT = 44;
   public static final int DOOR07_ACT = 45;
   public static final int ITEM2_ACT = 46;
   public static final int BRYUKA_ACT = 47;
   public static final int MOVESCR_ACT = 48;
   public static final int SCOPEC_ACT = 49;
   public static final int STONE_ACT = 50;
   public static final int PADJET_ACT = 51;
   public static final int ZONE_ACT = 52;
   public static final int MUTEKI_ACT = 53;
   public static final int TOGE_ACT = 54;
   public static final int FLYRING_ACT = 55;
   public static final int BARIA_ACT = 56;
   public static final int GAMEOVER_ACT = 57;
   public static final int STCLEAR_ACT = 58;
   public static final int BRKABE_ACT = 60;
   public static final int CORK_ACT = 61;
   public static final int MASIN_ACT = 62;
   public static final int FUN_ACT = 63;
   public static final int BJUMP_ACT = 64;
   public static final int SJUMP_ACT = 65;
   public static final int STEAM_ACT = 66;
   public static final int SPIKRING_ACT = 67;
   public static final int BOBIN_ACT = 68;
   public static final int SPRING_ACT = 69;
   public static final int SPBALL_ACT = 70;
   public static final int SWITCH_ACT = 71;
   public static final int PIVOT_ACT = 72;
   public static final int TAKI_ACT = 73;
   public static final int OCT_ACT = 74;
   public static final int WASP_ACT = 75;
   public static final int SEAHORSE_ACT = 80;
   public static final int BBOSS6_ACT = 81;
   public static final int BBOSS3_ACT = 82;
   public static final int BB7BUDDY_ACT = 83;
   public static final int BBOSS7_ACT = 84;
   public static final int BBOSS8_ACT = 85;
   public static final int BBOSS2_ACT = 86;
   public static final int BBOSS5_ACT = 87;
   public static final int BILLBOMB_ACT = 88;
   public static final int WFISH2_ACT = 92;
   public static final int BBOSS1_ACT = 93;
   public static final int SSHADOW_ACT = 99;
   public static final int HAMMAR_ACT = 100;
   public static final int TOBIRA_ACT = 101;
   public static final int BWALL_ACT = 102;
   public static final int SHOOTER_ACT = 103;
   public static final int SPIKEBLK_ACT = 104;
   public static final int NUT_ACT = 105;
   public static final int MOVEDAI_ACT = 106;
   public static final int DAI2_ACT = 107;
   public static final int KASSYA_ACT = 108;
   public static final int SPIKE_ACT = 109;
   public static final int CRANK_ACT = 110;
   public static final int HAGURUMA_ACT = 112;
   public static final int BGSPRP_ACT = 113;
   public static final int BELT_ACT = 114;
   public static final int SCOLI_ACT = 116;
   public static final int TEKYU_ACT = 117;
   public static final int LDAI_ACT = 118;
   public static final int PATA_ACT = 119;
   public static final int STEP_ACT = 120;
   public static final int SAVE_ACT = 121;
   public static final int RDAI_ACT = 122;
   public static final int FJUMP_ACT = 123;
   public static final int HASHIRA_ACT = 124;
   public static final int SSFX_ACT = 126;
   public static final int TSWITCH_ACT = 127;
   public static final int TUTA_ACT = 128;
   public static final int SDOOR_ACT = 129;
   public static final int DAI3_ACT = 130;
   public static final int KDAI_ACT = 131;
   public static final int ROLLC_ACT = 132;
   public static final int BANE_ACT = 133;
   public static final int FLIPPER_ACT = 134;
   public static final int SPTAIL_ACT = 136;
   public static final int BBOSS4_ACT = 137;
   public static final int CLSELECT_ACT = 139;
   public static final int Y_FLY_ACT = 140;
   public static final int Y_MOLE_ACT = 141;
   public static final int Y_MOLE0_ACT = 142;
   public static final int Y_RENGA_ACT = 143;
   public static final int Y_ROCK_ACT = 144;
   public static final int Y_PIRANIA_ACT = 145;
   public static final int Y_YADO_ACT = 146;
   public static final int Y_YADOHD_ACT = 147;
   public static final int Y_BALL_ACT = 148;
   public static final int Y_FBALL_ACT = 149;
   public static final int Y_PROSIO_ACT = 150;
   public static final int Y_PRONECK_ACT = 151;
   public static final int Y_SHOT_ACT = 152;
   public static final int Y_CUP_ACT = 153;
   public static final int Y_GAMERA_ACT = 154;
   public static final int Y_KOGAME_ACT = 155;
   public static final int Y_JET_ACT = 156;
   public static final int Y_SARU_ACT = 157;
   public static final int Y_MUKADE_ACT = 158;
   public static final int Y_KANI_ACT = 159;
   public static final int Y_KANITUME_ACT = 160;
   public static final int Y_KAMAKIRI_ACT = 161;
   public static final int Y_KAMASHOT_ACT = 162;
   public static final int Y_HOTAL_ACT = 163;
   public static final int Y_HITODE_ACT = 164;
   public static final int Y_TUBOH_ACT = 165;
   public static final int Y_TUBOV_ACT = 166;
   public static final int Y_KUMOBODY_ACT = 167;
   public static final int Y_KUMOFOOT_ACT = 168;
   public static final int Y_KUMOTIRE_ACT = 169;
   public static final int Y_KUMOITO_ACT = 170;
   public static final int Y_KUMOSHOT_ACT = 171;
   public static final int Y_VALKRIE_ACT = 172;
   public static final int Y_COOCKDAI_ACT = 173;
   public static final int Y_COOCK_ACT = 174;
   public static final int Y_MSONIC_ACT = 175;
   public static final int Y_AIRPLAN_ACT = 178;
   public static final int Y_SORAKUMO_ACT = 179;
   public static final int Y_PROPERA_ACT = 180;
   public static final int Y_FAN_ACT = 181;
   public static final int Y_ITA_ACT = 182;
   public static final int Y_FIRE_ACT = 183;
   public static final int Y_CANNON_ACT = 184;
   public static final int Y_BEEM_ACT = 185;
   public static final int Y_ROLL_ACT = 186;
   public static final int Y_B_FIRE_ACT = 188;
   public static final int Y_ELEVATOR_ACT = 189;
   public static final int Y_ITACAN_ACT = 190;
   public static final int Y_CATAPALT_ACT = 192;
   public static final int Y_HAGARE_ACT = 193;
   public static final int Y_BLOCK_ACT = 194;
   public static final int Y_DAI_ACT = 195;
   public static final int Y_KEMURI_ACT = 196;
   public static final int Y_BOSS10_ACT = 197;
   public static final int Y_EGGMAN_ACT = 198;
   public static final int Y_LASTBOSS_ACT = 199;
   public static final int Y_SANDCRAB_ACT = 200;
   public static final int HASI0C_ACT = 210;
   public static final int TOGE0C_ACT = 211;
   public static final int BOX0C_ACT = 212;
   public static final int ELE0C_ACT = 213;
   public static final int TUBO0C_ACT = 214;
   public static final int BAMPER_ACT = 215;
   public static final int ITA0C_ACT = 216;
   public static final int FIXPOLE_ACT = 217;
   public static final int SLOT_RING_ACT = 220;
   public static final int MASTER_RING_ACT = 221;
   public static final int BBOSS_P1_END_ACT = 222;
   public static final int CHAOS_EMERALD_ACT = 223;
   public static final int TO_BE_CONTINUED_ACT = 224;
   public static final int RENGA_IA = 4;
   public static final int SARUSHOT_IA = 32;
   public static final int TUBOSHOT_IA = 52;
   public static final int KUMOFOOT_IA = 56;
   public static final int KUMOTIRE_IA = 58;
   public static final int KUMOITO_IA = 60;
   public static final int KUMOSHOT_IA = 62;
   public static final int PROSHOT_IA = 16;
   public static final int ALLACTION = -1;
   public static final int PRIORITY_NUM = 10;
   protected static final int SPRPOSITBL_PATNO = 3;
   protected static final int SPRPOSITBL_XPOSI = 0;
   protected static final int SPRPOSITBL_YPOSI = 1;
   public static final int SPRPOSITBL_NUM = 4;
   public static final int PATBASETABLE_IMAGE = 0;
   public static final int PATBASETABLE_X = 1;
   public static final int PATBASETABLE_Y = 2;
   public static final int PATBASETABLE_W = 3;
   public static final int PATBASETABLE_H = 4;
   public static final int PATBASETABLE_OFFSET_X = 5;
   public static final int PATBASETABLE_OFFSET_Y = 6;
   public static final int CD_RIGHT = 1;
   public static final int CD_LEFT = 1;
   public static final int CD_WALK = 2;
   public static final int CD_JUMP = 2;
   public static final int CD_BALL = 4;
   public static final int CD_RIDEON = 8;
   public static final int CD_RIDEON2 = 16;
   public static final int CD_BALLJ = 16;
   public static final int CD_PUSH = 32;
   public static final int CD_PUSH2 = 64;
   public static final int CD_WATER = 64;
   public static final int CD_DIE = 128;
   public static final int CD_DOWN = 2;
   public static final int CD_UP = 2;
   public static final int HITCOLFLAGB = 32768;
   public static final int RIDEONFLAGB = 16384;
   public static final int HITCOLFLAG = 8192;
   public static final int RIDEONFLAG = 4096;
   public static final int UDREVERS = 2048;
   public static final int LRREVERS = 1024;
   public static final int UPDOTMAX = -28;
   public static final int DOWNDOTMAX = 14;
   public static final int DOWNDOTMAX_LR = 14;
   public static final int JUMPDOTMAX = 14;
   public static final int AF_NOMAL = 0;
   public static final int AF_SCRA = 4;
   public static final int AF_SCRB = 8;
   public static final int AF_SCRZ = 12;
   public static final int AF_UDREV = 2;
   public static final int AF_LRREV = 1;
   public static final int AF_SPRVSIZE = 16;
   public static final int AF_ONESPR = 32;
   public static final int AF_MANYSPR = 64;
   public static final int AF_SCREEN = 128;
   public static final int AF_ONESPR_D = 1;
   public static final int PLMAXSPD = 1536;
   public static final int PLADDSPD = 12;
   public static final int PLRETSPD = 128;
   public static final int PLMAXSPDS = 2560;
   public static final int PLADDSPDS = 48;
   public static final int PLRETSPDS = 256;
   public static final int PLSTASPD = 128;
   public static final int PLJUMP = 1664;
   public static final int PLJUMPS = 2048;
   public static final int PLJUMP_W = 896;
   public static final int PLPOWER_BB = 1;
   public static final int PLPOWER_MB = 2;
   public static final int PLPOWER_SB = 4;
   public static final int PLPOWER_AB = 8;
   public static final int MIRROR_NONE = 0;
   public static final int MIRROR_LR = 1;
   public static final int MIRROR_UD = 2;
   public static final int MIRROR_QUAD = 3;
   public int m_Actno;
   public int m_Actflg;
   public int m_Userflag;
   public int m_FColFlag;
   public Image[] m_Patbase_Image;
   public int[][] m_Patbase_Table;
   public int m_BallMode;
   public int m_NoColiTimer;
   public boolean mBlink = false;
   public int m_DirecCnt;
   public int m_DirecSpd;
   public static final int AIR_MAX = 30;
   public static final int AIR_THRESHOLD = 12;
   public int m_AirCnt = 30;
   public int m_airClock = 0;
   protected int m_Sprpri;
   protected int m_Colino;
   protected int m_Patno;
   protected int m_Xspeed;
   protected int m_Yspeed;
   protected int m_Sprvs;
   protected int m_Sprhs;
   protected int m_Sprhsize;
   protected int m_Sprvsize;
   protected int m_Rideonwk;
   protected int m_Hitcolwk;
   public int[] m_Reserve;
   protected int m_Cddat;
   protected boolean m_IsDrawPatno = true;
   protected int m_Xposi;
   protected int m_Yposi;
   protected int m_Xposi_2;
   protected int m_Yposi_2;
   protected int m_Sproffset;
   protected int[][] m_Sprpositbl;
   public int m_Patcnt;
   public int m_Pattim;
   public int m_MutekiTimer;
   public int m_SpeedUpTimer;
   public int m_SLoopFlag;
   public int m_R_No0;
   public int m_R_No1;
   public int m_R_No2;
   public int m_Mstno;
   public int m_Mstno_1;
   public int m_R_No0_Ms;
   public int m_Patno_Ms;
   public int m_Sprhsize_Ms;
   public int m_Manysprcnt;
   public int m_Sprvsize_Ms;
   public int m_Patbase;
   public int m_Direc;
   public int m_Direc1;
   public int m_RotateMode;
   public boolean m_DashMode;
   public int m_Mspeed;
   public int m_JumpFlag;
   public Action m_RideActWk;
   public int m_PlPower;
   public int m_FallTimer;
   public int m_Cdsts;
   public int m_ActionWorkCntNo = -1;
   public int m_Colicnt_Ms;
   public int m_Colicnt;
   public int m_PlayerFlag;
   public boolean m_AutoFrameout = true;
   public Object m_ReserveObj;
   protected int pldir_d0;
   protected int pldir_d1;
   protected int pldir_d2;
   protected int pldir_d3;

   public abstract void update(State var1);

   public abstract void render(Graphics var1);

   public abstract void setType(int var1, int var2);

   public void dispose() {
      this.m_Patbase_Image = null;
      this.m_Patbase_Table = null;
      this.m_RideActWk = null;
      this.m_ReserveObj = null;
   }

   public void reset() {
      this.dispose();
      this.m_Actno = 0;
      this.m_Actflg = 0;
      this.m_Userflag = 0;
      this.m_FColFlag = 0;
      this.m_BallMode = 0;
      this.m_NoColiTimer = 0;
      this.mBlink = false;
      this.m_DirecCnt = 0;
      this.m_DirecSpd = 0;
      this.m_Sprpri = 0;
      this.m_Colino = 0;
      this.m_Patno = 0;
      this.m_Xspeed = 0;
      this.m_Yspeed = 0;
      this.m_Sprvs = 0;
      this.m_Sprhs = 0;
      this.m_Sprhsize = 0;
      this.m_Sprvsize = 0;
      this.m_Rideonwk = 0;
      this.m_Hitcolwk = 0;
      this.m_Reserve = null;
      this.m_Cddat = 0;
      this.m_IsDrawPatno = true;
      this.m_Xposi = 0;
      this.m_Xposi_2 = 0;
      this.m_Yposi = 0;
      this.m_Yposi_2 = 0;
      this.m_Sproffset = 0;
      this.m_Sprpositbl = null;
      this.m_Patcnt = 0;
      this.m_Pattim = 0;
      this.m_MutekiTimer = 0;
      this.m_SpeedUpTimer = 0;
      this.m_SLoopFlag = 0;
      this.m_R_No0 = 0;
      this.m_R_No1 = 0;
      this.m_R_No2 = 0;
      this.m_Mstno = 0;
      this.m_Mstno_1 = 0;
      this.m_Direc = 0;
      this.m_Direc1 = 0;
      this.m_RotateMode = 0;
      this.m_DashMode = false;
      this.m_Mspeed = 0;
      this.m_JumpFlag = 0;
      this.m_PlPower = 0;
      this.m_FallTimer = 0;
      this.m_Cdsts = 0;
      this.m_ActionWorkCntNo = -1;
      this.m_Manysprcnt = 0;
      this.m_Colicnt_Ms = 0;
      this.m_Colicnt = 0;
      this.m_PlayerFlag = 0;
      this.m_R_No0_Ms = 0;
      this.m_Sprhsize_Ms = 0;
      this.m_AutoFrameout = true;
   }

   public static Action getInstance(int var0, int var1) {
      Action var2 = null;
      switch(var0) {
      case 1:
      case 2:
      case 5:
         var2 = State.getPlayerAction(var0, var1);
         break;
      case 3:
      case 6:
      case 13:
      case 21:
      case 24:
      case 25:
      case 28:
      case 31:
      case 38:
      case 45:
      case 46:
      case 49:
      case 50:
      case 54:
      case 62:
      case 64:
      case 65:
      case 88:
      case 107:
      case 114:
      case 116:
      case 121:
      case 122:
      case 132:
         var2 = State.getCommonAction(var0, var1);
      case 4:
      case 7:
      case 9:
      case 12:
      case 14:
      case 15:
      case 16:
      case 18:
      case 19:
      case 23:
      case 26:
      case 33:
      case 42:
      case 44:
      case 51:
      case 59:
      case 60:
      case 61:
      case 63:
      case 66:
      case 67:
      case 69:
      case 70:
      case 71:
      case 72:
      case 74:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 83:
      case 84:
      case 85:
      case 87:
      case 89:
      case 90:
      case 91:
      case 94:
      case 95:
      case 96:
      case 97:
      case 98:
      case 99:
      case 100:
      case 101:
      case 102:
      case 103:
      case 104:
      case 105:
      case 106:
      case 108:
      case 109:
      case 110:
      case 111:
      case 112:
      case 113:
      case 115:
      case 117:
      case 118:
      case 119:
      case 124:
      case 125:
      case 127:
      case 128:
      case 129:
      case 135:
      case 136:
      case 138:
      case 139:
      case 144:
      case 148:
      case 152:
      case 153:
      case 154:
      case 155:
      case 156:
      case 158:
      case 159:
      case 160:
      case 161:
      case 162:
      case 163:
      case 164:
      case 172:
      case 173:
      case 174:
      case 175:
      case 176:
      case 177:
      case 178:
      case 179:
      case 180:
      case 181:
      case 182:
      case 183:
      case 184:
      case 185:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 191:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
      case 198:
      case 199:
      case 201:
      case 202:
      case 203:
      case 204:
      case 205:
      case 206:
      case 207:
      case 208:
      case 209:
      case 217:
      case 218:
      case 219:
      default:
         break;
      case 8:
      case 10:
      case 37:
      case 39:
      case 40:
      case 41:
      case 52:
      case 53:
      case 55:
      case 56:
      case 57:
      case 58:
      case 126:
      case 221:
      case 223:
      case 224:
         var2 = State.getPlayerAction2(var0, var1);
         break;
      case 11:
      case 27:
      case 29:
      case 30:
      case 120:
      case 123:
      case 165:
      case 166:
      case 167:
      case 168:
      case 169:
      case 170:
      case 171:
         var2 = State.getChemicalPlantAction(var0, var1);
         break;
      case 17:
      case 73:
      case 75:
      case 92:
      case 157:
         var2 = State.getEmeraldHillAction(var0, var1);
         break;
      case 20:
      case 22:
      case 47:
      case 48:
      case 146:
      case 147:
      case 149:
      case 150:
      case 151:
         var2 = State.getHillTopAction(var0, var1);
         break;
      case 32:
      case 81:
      case 82:
      case 86:
      case 93:
      case 137:
      case 222:
         var2 = State.getBossAction(var0, var1);
         break;
      case 34:
      case 35:
      case 36:
      case 43:
      case 130:
      case 131:
      case 140:
      case 141:
      case 142:
      case 143:
      case 145:
         var2 = State.getAquaticRuinAction(var0, var1);
         break;
      case 68:
      case 133:
      case 134:
      case 200:
      case 210:
      case 211:
      case 212:
      case 213:
      case 214:
      case 215:
      case 216:
      case 220:
         var2 = State.getCasinoNightAction(var0, var1);
      }

      return var2;
   }

   public void autoDraw(Graphics var1, State var2) {
      if (this.m_Patbase_Image != null && this.m_Patbase_Table != null) {
         if (this.m_Patno >= 0 && this.m_Patno < this.m_Patbase_Table.length && this.m_IsDrawPatno) {
            var2.addSpriteToBuffer(this.m_Patbase_Image, this.m_Patbase_Table, this.m_Patno, this.m_Actflg, this.m_Xposi, this.m_Yposi, this.m_Sprpri, this.m_RotateMode, this.m_Sproffset);
         }

         if (this.m_Sprpositbl != null) {
            for(int var3 = 0; var3 < this.m_Sprpositbl.length; ++var3) {
               var2.addSpriteToBuffer(this.m_Patbase_Image, this.m_Patbase_Table, this.m_Sprpositbl[var3][3], this.m_Actflg, this.m_Sprpositbl[var3][0], this.m_Sprpositbl[var3][1], this.m_Sprpri, this.m_RotateMode, this.m_Sproffset);
            }
         }
      }

   }

   protected void speedSet() {
      this.m_Yspeed += 54;
      this.speedSet2();
   }

   protected void speedSet2() {
      int var1 = this.getXposi();
      this.setXposi(var1 + (this.m_Xspeed << 8));
      var1 = this.getYposi();
      this.setYposi(var1 + (this.m_Yspeed << 8));
   }

   protected int getXposi() {
      return this.m_Xposi << 16 | this.m_Xposi_2 & '\uffff';
   }

   protected void setXposi(int var1) {
      this.m_Xposi = var1 >> 16 & '\uffff';
      this.m_Xposi_2 = var1 & '\uffff';
   }

   protected int getYposi() {
      return this.m_Yposi << 16 | this.m_Yposi_2 & '\uffff';
   }

   protected void setYposi(int var1) {
      this.m_Yposi = var1 >> 16 & '\uffff';
      this.m_Yposi_2 = var1 & '\uffff';
   }

   public static final void prepareCommonImages() {
      PlayerAction.prepareImages();
      PlayerAction2.prepareImages();
      CommonAction.prepareImages();
   }

   public static final void prepareImages(int var0) {
      switch(var0) {
      case 0:
         EmeraldHillAction.prepareImages();
         return;
      case 7:
         HillTopAction.prepareImages();
      default:
         return;
      case 13:
         ChemicalPlantAction.prepareImages();
         return;
      case 15:
         AquaticRuinAction.prepareImages();
      case 12:
         CasinoNightAction.prepareImages();
      }
   }

   public static final void disposePreviousImages(int var0) {
      switch(var0) {
      case 0:
         return;
      case 7:
         CasinoNightAction.disposeImages();
      default:
         return;
      case 12:
         AquaticRuinAction.disposeImages();
         return;
      case 13:
         EmeraldHillAction.disposeImages();
         return;
      case 15:
         ChemicalPlantAction.disposeImages();
      }
   }

   static final void prepareBossImages(int var0) {
      BossAction.prepareImages();
   }

   protected void patchg(int[][] var1) {
      if (this.m_Mstno != this.m_Mstno_1) {
         this.m_Mstno_1 = this.m_Mstno;
         this.m_Patcnt = 0;
         this.m_Pattim = var1[this.m_Mstno][0];
         this.m_Patno = var1[this.m_Mstno][1];
      }

      --this.m_Pattim;
      if (this.m_Pattim <= 0) {
         this.m_Pattim = var1[this.m_Mstno][0];
         this.m_Patcnt = (this.m_Patcnt + 1) % (var1[this.m_Mstno].length - 1);
         int var2;
         switch(var2 = var1[this.m_Mstno][this.m_Patcnt + 1]) {
         case -7:
            this.m_R_No2 += 2;
            this.m_Mstno = -1;
            break;
         case -6:
            this.m_R_No1 += 2;
            this.m_Mstno = -1;
            break;
         case -5:
            this.m_R_No1 = 0;
            this.m_Mstno = -1;
            break;
         case -4:
            this.m_R_No0 += 2;
            this.m_Patcnt = (this.m_Patcnt + 1) % (var1[this.m_Mstno].length - 1);
            break;
         case -3:
            this.m_Mstno = var1[this.m_Mstno][this.m_Patcnt + 2];
            this.m_Mstno_1 = this.m_Mstno;
            this.m_Patcnt = 0;
            this.m_Pattim = var1[this.m_Mstno][0];
            this.m_Patno = var1[this.m_Mstno][1];
            break;
         case -2:
            this.m_Patcnt -= var1[this.m_Mstno][this.m_Patcnt + 2];
            this.m_Patno = var1[this.m_Mstno][this.m_Patcnt + 1];
            break;
         case -1:
            this.m_Patcnt = 0;
            this.m_Patno = var1[this.m_Mstno][this.m_Patcnt + 1];
            break;
         default:
            this.m_Patno = var2;
         }

         this.m_Actflg = this.m_Actflg & 252 | this.m_Cddat & 3;
      } else {
         this.m_Actflg = this.m_Actflg & 252 | this.m_Cddat & 3;
         this.m_Patno = var1[this.m_Mstno][this.m_Patcnt + 1];
      }
   }

   protected void y_Emy_Init(int[] var1) {
      this.m_Actflg = var1[0];
      this.m_Sprpri = var1[1];
      this.m_Sprhsize = var1[2];
      this.m_Colino = var1[3];
   }

   public void frameOut(State var1) {
      if (this.m_ActionWorkCntNo >= 0) {
         GameState.m_ActionWorkCnt[this.m_ActionWorkCntNo] = false;
      }

      var1.deleteAction(this);
   }

   public boolean frameOutCheckD(State var1) {
      return this.frameOutCheck(var1);
   }

   public boolean frameOutCheck(State var1) {
      if (this.m_Xposi >= 0 && this.m_Xposi <= 16384 && this.m_Yposi >= 0 && this.m_Yposi <= 2048) {
         int var2 = this.m_Xposi & 'ﾀ';
         int var3 = State.m_ScrA_H_Posit & 'ﾀ';
         if ((var2 < var3 - 256 || var2 >= var3 + 256 + 384) && this.m_AutoFrameout && this.m_Cdsts > 0) {
            int[] var10000 = GameState.m_FlagWorkCnt;
            int var10001 = this.m_Cdsts + 2;
            var10000[var10001] &= 127;
            if (this.m_ActionWorkCntNo >= 0) {
               GameState.m_ActionWorkCnt[this.m_ActionWorkCntNo] = false;
            }

            ((GameState)var1).deleteAction(this);
            return true;
         } else if ((var2 < var3 - 256 || var2 >= var3 + 256 + 384) && this.m_AutoFrameout && this.m_Cdsts == 0) {
            if (this.m_ActionWorkCntNo >= 0) {
               GameState.m_ActionWorkCnt[this.m_ActionWorkCntNo] = false;
            }

            ((GameState)var1).deleteAction(this);
            return true;
         } else {
            return false;
         }
      } else {
         if (this.m_ActionWorkCntNo >= 0) {
            GameState.m_ActionWorkCnt[this.m_ActionWorkCntNo] = false;
         }

         ((GameState)var1).deleteAction(this);
         return true;
      }
   }

   protected final void patset(State var1) {
      if ((this.m_Actflg & 12) == 0) {
         this.m_Actflg |= 128;
      } else {
         int var5 = Math.max(this.m_Sprhs, this.m_Sprhsize);
         int var2 = Math.max(this.m_Sprvs, this.m_Sprvsize);
         if (GameState.m_ScrALim_Up != 65280) {
            if (this.m_Xposi + var5 >= State.m_ScrA_H_Posit && this.m_Xposi - var5 <= State.m_ScrA_H_Posit + 320 && this.m_Yposi + var2 >= State.m_ScrA_V_Posit && this.m_Yposi - var2 <= State.m_ScrA_V_Posit + 320) {
               this.m_Actflg |= 128;
            } else {
               this.m_Actflg &= -129;
            }
         } else {
            if (this.m_Xposi + var5 >= State.m_ScrA_H_Posit && this.m_Xposi - var5 <= State.m_ScrA_H_Posit + 320) {
               var5 = State.m_ScrA_V_Posit & 2047;
               int var3 = (State.m_ScrA_V_Posit & 2047) + 320;
               int var4 = this.m_Yposi + var2;
               var2 = this.m_Yposi - var2;
               if (var4 >= var5 && var2 <= var3 || var4 >= var5 - 2048 && var2 <= var3 - 2048 || var4 >= var5 + 2048 && var2 <= var3 + 2048) {
                  this.m_Actflg |= 128;
                  return;
               }
            }

            this.m_Actflg &= -129;
         }
      }
   }

   static void disposeImages(int var0) {
      PlayerAction.disposeImages();
      PlayerAction2.disposeImages();
      CommonAction.disposeImages();
      BossAction.disposeImages();
   }

   public boolean frameOutCheckN(State var1) {
      return this.frameOutCheckX(var1, this.m_Xposi);
   }

   public boolean frameOutCheckX(State var1, int var2) {
      if ((var2 &= 65408) >= 0 && var2 <= 16384 && this.m_Yposi >= 0 && this.m_Yposi <= 2048) {
         int var3 = State.m_ScrA_H_Posit & 'ﾀ';
         if ((var2 < var3 - 256 || var2 >= var3 + 256 + 384) && this.m_AutoFrameout && this.m_Cdsts == 0) {
            if (this.m_ActionWorkCntNo >= 0) {
               GameState.m_ActionWorkCnt[this.m_ActionWorkCntNo] = false;
            }

            ((GameState)var1).deleteAction(this);
            return true;
         } else {
            return false;
         }
      } else {
         if (this.m_Cdsts > 0) {
            int[] var10000 = GameState.m_FlagWorkCnt;
            int var10001 = this.m_Cdsts + 2;
            var10000[var10001] &= 127;
         }

         if (this.m_ActionWorkCntNo >= 0) {
            GameState.m_ActionWorkCnt[this.m_ActionWorkCntNo] = false;
         }

         ((GameState)var1).deleteAction(this);
         return true;
      }
   }

   protected Action _chk_pl_dir(State var1) {
      this.pldir_d0 = 0;
      this.pldir_d1 = 0;
      Action var3 = var1.getSonicAction();
      this.pldir_d2 = this.m_Xposi - var3.m_Xposi;
      int var2;
      if ((var2 = this.pldir_d2) < 0) {
         var2 = -var2;
      }

      Action var4;
      if ((var4 = var1.getTailsAction()) != null) {
         this.pldir_d3 = this.m_Xposi - var4.m_Xposi;
         int var5;
         if ((var5 = this.pldir_d3) < 0) {
            var5 = -var5;
         }

         if ((var5 & '\uffff') < (var2 & '\uffff')) {
            var3 = var4;
            this.pldir_d2 = this.pldir_d3;
         }
      }

      if (this.pldir_d2 < 0) {
         this.pldir_d0 += 2;
      }

      this.pldir_d3 = this.m_Yposi - var3.m_Yposi;
      if (this.pldir_d3 < 0) {
         this.pldir_d1 += 2;
      }

      return var3;
   }
}
