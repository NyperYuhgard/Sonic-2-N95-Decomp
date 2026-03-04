package STH2P1;

public interface Filenames {
    // 128x128 Genesis Chunks Equivalent
    String[] MAP_FILENAME = new String[]{
            "/MAP00.bin", "/MAP00.bin", "", "",
            "/MAP04.bin", "/MAP04.bin", "/MAP10.bin", "/MAP00.bin",
            "", "", "/MAP0A.bin", "/MAP0B.bin",
            "/MAP0C.bin", "/MAP0D.bin", "/MAP0D.bin", "/MAP0F.bin", "/MAP10.bin"
    };
    // Layout Genesis Equivalent
    String[][] ZONEMAP_FILENAME = new String[][]{
            {"/ZONE000C.bin", "/ZONE001C.bin"},
            new String[0],
            new String[0],
            new String[0],
            {"/ZONE040C.bin", "/ZONE041C.bin"},
            {"/ZONE050C.bin"},
            {"/ZONE060C.bin"},
            {"/ZONE070C.bin", "/ZONE071C.bin"},
            new String[0],
            new String[0],
            {"/ZONE0A0C.bin", "/ZONE0A1C.bin"},
            {"/ZONE0B0C.bin", "/ZONE0B1C.bin"},
            {"/ZONE0C0C.bin", "/ZONE0C1C.bin"},
            {"/ZONE0D0C.bin", "/ZONE0D1C.bin"},
            {"/ZONE0E0C.bin"},
            {"/ZONE0F0C.bin", "/ZONE0F1C.bin"},
            {"/ZONE100C.bin"}
    };

    String[] PRI_FILENAME = new String[]{
            "/PRI00.bin", "/PRI07.bin", "", "",
            "/PRI04.bin", "/PRI04.bin", "/PRI06.bin", "/PRI07.bin",
            "", "", "/PRI0A.bin", "/PRI0B.bin",
            "/PRI0C.bin", "/PRI0D.bin", "/PRI0E.bin", "/PRI0F.bin", "/PRI10.bin"
    };

    String[] TILEMAP_FILENAME = new String[]{
            "/TILE00.bin", "/TILE07.bin", "", "", "", "", "", "/TILE07.bin",
            "", "", "", "", "/TILE0C.bin", "/TILE0D.bin", "", "/TILE0F.bin", ""
    };

    String[] BLK_FILENAME = new String[]{
            "/EMERALD_HILL.png", "/HILL_TOP.png", "", "", "", "", "", "/HILL_TOP.png",
            "", "", "", "", "/CASINO_NIGHT.png", "/CHEMICAL_PLANT.png", "", "/AQUATIC_RUIN.png", ""
    };

    String[][] SC_FILENAME = new String[][]{
            {"/ZONE00SC.bin", "/ZONE00SB.bin"},
            {"/ZONE00SC.bin", "/ZONE00SB.bin"},
            new String[0],
            new String[0],
            {"/ZONE04SC.bin", "/ZONE04SC.bin"},
            {"/ZONE04SC.bin", "/ZONE04SC.bin"},
            {"/ZONE10SC.bin", "/ZONE10SB.bin"},
            {"/ZONE00SC.bin", "/ZONE00SB.bin"},
            new String[0],
            new String[0],
            {"/ZONE0ASC.bin", "/ZONE0ASC.bin"},
            {"/ZONE0BSC.bin", "/ZONE0BSC.bin"},
            {"/ZONE0CSC.bin", "/ZONE0CSB.bin"},
            {"/ZONE0DSC.bin", "/ZONE0DSB.bin"},
            {"/ZONE0DSC.bin", "/ZONE0DSB.bin"},
            {"/ZONE0FSC.bin", "/ZONE0FSB.bin"},
            {"/ZONE10SC.bin", "/ZONE10SB.bin"}
    };

    String[] FILENAMES = new String[]{
            "/BGM_LIST.bin", "/WATERCOLOR.bin", "/ACTION_FILENAME.bin", "/BLK_FILENAME.bin",
            "/MAP_FILENAME.bin", "/PLAYPOSITBL.bin", "/PRI_FILENAME.bin", "/RING_FILENAME.bin",
            "/SCR_LIM_TBL.bin", "/SC_FILENAME.bin", "/ZONEMAP_FILENAME.bin", "/MIZUTBL.bin",
            "/MIZUFLAGTBL.bin", "/SYSDIR_ADDTBL.bin", "/SYSDIR_TBL.bin", "/SYSDIRINITTBL.bin",
            "/scdtbl.bin", "/scdtblwk.bin", "/scdtblwk2.bin", "/CONTINUEMD_Filename.bin",
            "/CONTINUEMD_Table.bin", "/BGCOLOR.bin", "/ZONEALTBLK.bin", "/ZONEALTBLK_OFFSET.bin",
            "/DIFFICULTY_TABLE.bin", "/Sonic2-bar.png", "/BGBLK.bin", "/Sonic2-number.png",
            "/Sonic2-bar4.png", "/SONIC2_BAR4_Table.bin", "/sonic2-bar2.png", "/PlayerAction1FileName.bin",
            "/CONTINUEMD_Player1PatNoTable.bin", "/CONTINUEMD_Player2PatNoTable.bin", "/SLOT_ROLE.bin",
            "/SLOT_HIT_TB.bin", "/SLOT_TB_SCR.bin", "/sonic2_ca16.png", "/zone07bgb.png", "/ami0.png"
    };

    String[][] ImgFileNames = new String[][]{
            new String[0], new String[0], {"/play20.png"}, new String[0], new String[0],
            new String[0], new String[0], new String[0], {"/pleffect.png"}, new String[0],
            new String[0], {"/sonic2_c01.png"}, new String[0], {"/gole.png"}, new String[0],
            new String[0], new String[0], {"/hashi.png"}, new String[0], new String[0],
            {"/sonic2_h03.png"}, {"/buranko.png"}, {"/cablecar.png"}, new String[0],
            {"/shima.png", "/shima2.png", "/shima3.png", "/shima4.png", "/shima5.png"},
            {"/dai.png"}, new String[0], {"/sonic2_c02.png"}, {"/bgspr.png"}, {"/sonic2_c03.png"},
            new String[0], {"/break2.png"}, {"/sonic2_eggman_act5.png"}, new String[0],
            {"/sonic2_a04.png"}, {"/sonic2_a05.png"}, {"/awa.png"}, new String[0], {"/item.png"},
            new String[0], new String[0], new String[0], {"/st_mc04.png"}, {"/sonic2_a06.png"},
            {"/leaf.png"}, {"/door.png", "/door04.png", "/door07.png"}, new String[0],
            {"/bryuka.png"}, new String[0], new String[0], {"/stone.png"}, {"/st_oo01.png"},
            new String[0], new String[0], {"/spikes.png"}, {"/ring.png", "/pleffect.png"},
            new String[0], {"/sonic2_font_01.png"}, {"/sonic2_font_00.png", "/sonic2_font_01.png"},
            new String[0], new String[0], {"/st_oo09.png"}, {"/masin.png"}, {"/st_oo12.png", "/st_oo13.png"},
            {"/bjump.png"}, {"/sjump.png"}, {"/st_mp01.png"}, {"/st_oo02.png"}, {"/sonic2_ca01.png"},
            {"/st_oo04.png", "/st_oo05.png"}, new String[0], {"/st_oo07.png"},
            {"/pivot0.png", "/pivot1.png", "/pivotr.png"}, {"/taki.png"}, {"/oct.png"}, {"/wasp.png"},
            new String[0], new String[0], new String[0], new String[0], {"/seahorse.png"},
            new String[0], {"/sonic2_eggman_act5.png"}, new String[0], {"/sonic2_eggman_act8.png"},
            new String[0], {"/sonic2_eggman_00.png", "/sonic2_eggman_act1.png"},
            {"/sonic2_eggman_00.png", "/sonic2_eggman_act6.png"}, {"/billbomb.png"}, new String[0],
            new String[0], new String[0], {"/wfish2.png"}, {"/sonic2_eggman_00.png", "/sonic2_eggman_act2.png"},
            new String[0], new String[0], new String[0], new String[0], new String[0], new String[0],
            {"/st_mp02.png", "/st_mp03.png"}, {"/st_mp04.png", "/tobira_g.png"}, new String[0],
            {"/shooter.png"}, {"/st_mp07.png"}, {"/nut.png"}, {"/st_mc03.png"}, {"/step.png"},
            {"/st_mp13.png"}, {"/st_mp07.png"}, {"/dai204.png", "/crank.png"}, new String[0],
            {"/st_mp10.png"}, {"/st_cl_mp12.png"}, new String[0], new String[0], new String[0],
            {"/tekyu.png", "/tekyu2.png"}, {"/ldai.png"}, {"/st_mc05.png"}, {"/step.png"},
            {"/checkpoint.png"}, {"/rdai.png"}, {"/sonic2_c09.png"}, new String[0], new String[0],
            new String[0], {"/st_mc06.png"}, {"/tuta.png"}, {"/st_mc05.png"}, {"/sonic2_a05.png"},
            {"/buranko.png"}, new String[0], {"/sonic2_ca02.png", "/sonic2_ca03.png"},
            {"/sonic2_ca04.png", "/sonic2_ca05.png"}, new String[0], new String[0],
            {"/sonic2_eggman_00.png", "/sonic2_eggman_act3.png"}, new String[0], new String[0],
            {"/y_fly.png"}, {"/y_mole.png", "/sonic2_a09.png"}, new String[0], {"/sonic2_a09.png"},
            new String[0], {"/y_pirania.png"}, {"/y_yado.png"}, new String[0], new String[0],
            {"/y_fball.png"}, {"/y_prosio.png"}, new String[0], new String[0], {"/potos.png", "/potama.png"},
            {"/y_gamera.png"}, {"/y_kogame.png"}, new String[0], {"/y_saru.png"}, {"/y_mukade.png"},
            {"/y_kani.png"}, new String[0], {"/y_kamakiri.png"}, new String[0], {"/y_hotal.png"},
            {"/y_hitode.png"}, {"/y_tuboh.png"}, {"/y_tubov.png"}, {"/y_kumo.png"}, new String[0],
            new String[0], new String[0], new String[0], {"/y_valkrie.png", "/jet.png"},
            {"/y_coockdai.png"}, {"/y_coock.png"}, new String[0], new String[0], new String[0],
            {"/airplan.png"}, {"/sonic2_s01.png"}, {"/sonic2_s02.png"}, {"/y_fan.png"},
            {"/sonic2_w01.png"}, new String[0], {"/y_cannon.png"}, {"/sonic2_w04.png"},
            {"/sonic2_w05.png", "/sonic2_w15.png"}, new String[0], {"/sonic2_w06.png"},
            {"/sonic2_w07.png"}, {"/sonic2_w08.png"}, new String[0], {"/sonic2_w10.png"},
            {"/hagare.png", "/hagare2.png"}, {"/sonic2_w12.png"}, new String[0], new String[0],
            new String[0], new String[0], new String[0], {"/y_sandcrab.png"}, new String[0],
            new String[0], new String[0], new String[0], new String[0], new String[0],
            new String[0], new String[0], new String[0], {"/sonic2_ca06.png"}, {"/sonic2_ca07.png"},
            {"/sonic2_ca08.png"}, {"/sonic2_ca09.png"}, {"/sonic2_ca10.png"}, {"/sonic2_ca11.png"},
            {"/sonic2_ca12.png", "/sonic2_ca13.png", "/sonic2_ca14.png"}, new String[0],
            new String[0], new String[0], {"/ring.png"}
    };

    String[] PlayerAction2FileName = new String[]{
            "/PlayerActionImgName.bin", "/PLEFFECT_Table.bin", "/PLEFFECT_PG.bin",
            "/BAKUHATU_Table.bin", "/BAKUHATU_PG.bin", "/USAGI_Table.bin",
            "/USAGI_FRIENDTBL.bin", "/TENSUU_Table.bin", "/RING_Table.bin",
            "/RING_PG.bin", "/STCLEAR_Table.bin", "/STCLEAR_timebonustbl.bin",
            "/PLAWA_Table.bin", "/PLAWA_PG.bin", "/PLAWA_AWASINTBL.bin",
            "/BARIA_Table.bin", "/BARIA_PG.bin", "/MUTEKI_Table.bin",
            "/MUTEKI_MARUTBL.bin", "/MUTEKI_PCTBL.bin", "/SSFX_Table.bin",
            "/ZONE_Table.bin", "/ZONE_STAGETBL.bin"
    };

    String[][] ACTION_FILENAME = new String[][]{
            {"/ST0_0.bin", "/ST0_1.bin"}, {"/ST1_0.bin"}, new String[0], new String[0],
            {"/ST4_0.bin", "/ST4_1.bin"}, {"/ST5_0.bin"}, {"/ST6_0.bin"}, {"/ST7_0.bin", "/ST7_1.bin"},
            new String[0], new String[0], {"/STA_0.bin", "/STA_1.bin"}, {"/STB_0.bin", "/STB_1.bin"},
            {"/STC_0.bin", "/STC_1.bin"}, {"/STD_0.bin", "/STD_1.bin"}, {"/STE_0.bin"},
            {"/STF_0.bin", "/STF_1.bin"}, {"/ST10_0.bin"}
    };

    String[][] RING_FILENAME = new String[][]{
            {"/ring0_0.bin", "/ring0_1.bin"}, new String[0], new String[0], new String[0],
            {"/ring4_0.bin", "/ring4_1.bin"}, {"/ring5_0.bin"}, {"/ring6_0.bin"},
            {"/ring7_0.bin", "/ring7_1.bin"}, new String[0], new String[0],
            {"/ringA_0.bin", "/ringA_1.bin"}, {"/ringB_0.bin", "/ringB_1.bin"},
            {"/ringC_0.bin", "/ringC_1.bin"}, {"/ringD_0.bin", "/ringD_1.bin"},
            {"/ringE_0.bin"}, {"/ringF_0.bin", "/ringF_1.bin"}, {"/ring10_0.bin"}
    };

    int IMAGE_PLAYER_SONIC1 = 0;
    int IMAGE_PLAYER_SONIC2 = 1;
    int IMAGE_PLAYER_SUPER_SONIC1 = 2;
    int IMAGE_PLAYER_SUPER_SONIC2 = 3;
    int IMAGE_PLAYER_TAILS = 4;

    String[] PlayerAction1ImgName = new String[]{
            "/play00_1.png", "/play00_2.png", "/play00_3.png", "/play00_4.png", "/play20.png"
    };

    int IMAGE_PLAYER2_PLEFFECT = 0;
    int IMAGE_PLAYER2_DROWN_COUNT = 1;
    int IMAGE_PLAYER2_RING = 2;
    int IMAGE_PLAYER2_ANIMALS = 3;
    int IMAGE_PLAYER2_FONT0 = 4;
    int IMAGE_PLAYER2_FONT1 = 5;
    int IMAGE_PLAYER2_ACT_INTRO_YELLOW = 6;
    int IMAGE_PLAYER2_ACT_INTRO_RED = 7;

    String[] PlayerActionImgName = new String[]{
            "/pleffect.png", "/sonic2_dekisi_suzi.png", "/ring.png", "/usagi.png",
            "/sonic2_font_00.png", "/sonic2_font_01.png", "/sonic2_haikei_00.png", "/sonic2_haikei_01.png"
    };

    String[] CONTINUEMD_Filename = new String[]{"/sonic2_font_00.png", "/sonic2_font_01.png"};
}