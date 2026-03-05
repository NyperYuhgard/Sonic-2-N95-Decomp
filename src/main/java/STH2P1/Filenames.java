package STH2P1;

public interface Filenames {
    // 128x128 Genesis Chunks Equivalent
    String[] MAP_FILENAME = new String[]{
            "/MAP00.bin",  // Emerald Hill Zone 
            "/MAP00.bin",  // Zone 1 (Used In Ending)
            "",            // Zone 2 (Leftover From Genesis Version)
            "",            // Zone 3 (Leftover From Genesis Version)
            "/MAP04.bin",  // Metropolis (Unused Here, Files Dont Exist)
            "/MAP04.bin",  // Metropolis Act 3 (Unused Here, Files Dont Exist)
            "/MAP10.bin",  // Wing Fortress (Unused Here, Files Dont Exist)
            "/MAP00.bin",  // Hill Top
            "",            // Zone 8 (Leftover From Genesis Version)
            "",            // Zone 9 (Leftover From Genesis Version)
            "/MAP0A.bin",  // Oil Ocean (Unused Here, Files Dont Exist)
            "/MAP0B.bin",  // Mystic Cave (Unused Here, Files Dont Exist)
            "/MAP0C.bin",  // Casino Night
            "/MAP0D.bin",  // Chemical Plant
            "/MAP0D.bin",  // Death Egg (Unused Here, Files Dont Exist)
            "/MAP0F.bin",  // Acuatic Ruin
            "/MAP10.bin"   // Sky Chase (Unused Here, Files Dont Exist)
    };
    // Layout Genesis Equivalent
    String[][] ZONEMAP_FILENAME = new String[][]{
            {"/ZONE000C.bin", "/ZONE001C.bin"}, // Emerald Hill Act 1-2
            new String[0],                      // Zone 1 (It is not used because it is hardcoded; see loadMapData in GameState.java for more information)
            new String[0],                      // Zone 2 (Leftover From Genesis Version)
            new String[0],                      // Zone 3 (Leftover From Genesis Version)
            {"/ZONE040C.bin", "/ZONE041C.bin"}, // Metropolis Act 1-2 (Unused Here, Files Dont Exist)
            {"/ZONE050C.bin"},                  // Metropolis Act 3 (Unused Here, File Dont Exist, Act 2 pointer removed from the Genesis version)
            {"/ZONE060C.bin"},                  // Wing Fortress (Unused Here, File Dont Exist, Act 2 pointer removed from the Genesis version)
            {"/ZONE070C.bin", "/ZONE071C.bin"}, // Hill Top Act 1-2
            new String[0],                      // Zone 8 (Leftover From Genesis Version)
            new String[0],                      // Zone 9 (Leftover From Genesis Version)
            {"/ZONE0A0C.bin", "/ZONE0A1C.bin"}, // Oil Ocean Act 1-2 (Unused Here, Files Dont Exist)
            {"/ZONE0B0C.bin", "/ZONE0B1C.bin"}, // Mystic Cave (Unused Here, Files Dont Exist)
            {"/ZONE0C0C.bin", "/ZONE0C1C.bin"}, // Casino Night Act 1-2
            {"/ZONE0D0C.bin", "/ZONE0D1C.bin"}, // Chemical Plant Act 1-2
            {"/ZONE0E0C.bin"},                  // Death Egg (Unused Here, File Dont Exist, Act 2 pointer removed from the Genesis version)
            {"/ZONE0F0C.bin", "/ZONE0F1C.bin"}, // Acuatic Ruin Act 1-2
            {"/ZONE100C.bin"}                   // Sky Chase (Unused Here, File Dont Exist, Act 2 pointer removed from the Genesis version)
    };

    String[] PRI_FILENAME = new String[]{
            "/PRI00.bin",  // Emerald Hill
            "/PRI07.bin",  // Zone 1 (Used In Ending)
            "",            // Zone 2 (Leftover From Genesis Version)
            "",            // Zone 3 (Leftover From Genesis Version)
            "/PRI04.bin",  // Metropolis (Unused Here, Files Dont Exist)
            "/PRI04.bin",  // Metropolis Act 3 (Unused Here, Files Dont Exist)
            "/PRI06.bin",  // Wing Fortress (Unused Here, Files Dont Exist)
            "/PRI07.bin",  // Hill Top
            "",            // Zone 8
            "",            // Zone 9
            "/PRI0A.bin",  // Oil Ocean (Unused Here, Files Dont Exist)
            "/PRI0B.bin",  // Mystic Cave (Unused Here, Files Dont Exist)
            "/PRI0C.bin",  // Casino Night
            "/PRI0D.bin",  // Chemical Plant
            "/PRI0E.bin",  // Death Egg (Unused Here, Files Dont Exist)
            "/PRI0F.bin",  // Acuatic Ruin
            "/PRI10.bin"   // Sky Chase (Unused Here, Files Dont Exist)
    };
    // Tile Maps
    String[] TILEMAP_FILENAME = new String[]{
            "/TILE00.bin", // Emerald Hill
            "/TILE07.bin", // Zone 1 (Used In Ending)
            "",            // Zone 2 (Leftover From Genesis Version)
            "",            // Zone 3 (Leftover From Genesis Version)
            "",            // Metropolis (Deleted)
            "",            // Metropolis Act 3 (Deleted)
            "",            // Wing Fortress (Deleted)
            "/TILE07.bin", // Hill Top
            "",            // Zone 8 (Leftover From Genesis Version)
            "",            // Zone 9 (Leftover From Genesis Version)
            "",            // Oil Ocean (Deleted)
            "",            // Mystic Cave (Deleted)
            "/TILE0C.bin", // Casino Night
            "/TILE0D.bin", // Chemical Plant
            "",            // Death Egg (Deleted)
            "/TILE0F.bin", // Acuatic Ruin
            ""             // Sky Chase (Deleted)
    };
    // Tiles
    String[] BLK_FILENAME = new String[]{
            "/EMERALD_HILL.png",   // Emerald Hill Tiles
            "/HILL_TOP.png",       // Zone 1 Tiles (Used In Ending)
            "",                    // Zone 2 Tiles (Leftover From Genesis Version)
            "",                    // Zone 3 Tiles (Leftover From Genesis Version)
            "",                    // Metropolis Tiles (Deleted)
            "",                    // Metropolis Act 3 Tiles (Deleted)
            "",                    // Wing Fortress Tiles (Deleted)  
            "/HILL_TOP.png",       // Hill Top Tiles 
            "",                    // Zone 8 Tiles (Leftover From Genesis Version)
            "",                    // Zone 9 Tiles (Leftover From Genesis Version)
            "",                    // Oil Ocean Tiles (Deleted)
            "",                    // Mystic Cave Tiles (Deleted)
            "/CASINO_NIGHT.png",   // Casino Night Tiles 
            "/CHEMICAL_PLANT.png", // Chemical Plant Tiles
            "",                    // Death Egg Tiles (Deleted)
            "/AQUATIC_RUIN.png",   // Acuatic Ruin Tiles
            ""                     // Sky Chase (Deleted)
    };
    // Collisions
    String[][] SC_FILENAME = new String[][]{
            {"/ZONE00SC.bin", "/ZONE00SB.bin"}, // Emerald Hill
            {"/ZONE00SC.bin", "/ZONE00SB.bin"}, // Zone 1 (Used In Ending)
            new String[0],                      // Zone 2 (Leftover From Genesis Version)
            new String[0],                      // Zone 3 (Leftover From Genesis Version)
            {"/ZONE04SC.bin", "/ZONE04SC.bin"}, // Metropolis (Unused Here, Files Dont Exist)
            {"/ZONE04SC.bin", "/ZONE04SC.bin"}, // Metropolis Act 3 (Unused Here, Files Dont Exist)
            {"/ZONE10SC.bin", "/ZONE10SB.bin"}, // Wing Fortress (Unused Here, Files Dont Exist)
            {"/ZONE00SC.bin", "/ZONE00SB.bin"}, // Hill Top
            new String[0],                      // Zone 8 (Leftover From Genesis Version)
            new String[0],                      // Zone 9 (Leftover From Genesis Version)
            {"/ZONE0ASC.bin", "/ZONE0ASC.bin"}, // Oil Ocean (Unused Here, Files Dont Exist)
            {"/ZONE0BSC.bin", "/ZONE0BSC.bin"}, // Mystic Cave (Unused Here, Files Dont Exist)
            {"/ZONE0CSC.bin", "/ZONE0CSB.bin"}, // Casino Night
            {"/ZONE0DSC.bin", "/ZONE0DSB.bin"}, // Chemical Plant
            {"/ZONE0DSC.bin", "/ZONE0DSB.bin"}, // Death Egg (Unused Here, Files Dont Exist)
            {"/ZONE0FSC.bin", "/ZONE0FSB.bin"}, // Acuatic Ruin
            {"/ZONE10SC.bin", "/ZONE10SB.bin"}  // Sky Chase (Unused Here, Files Dont Exist)
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
    // Objects Layout
    String[][] ACTION_FILENAME = new String[][]{
            {"/ST0_0.bin", "/ST0_1.bin"},    // Emerald Hill Act 1-2
            {"/ST1_0.bin"},                  // Zone 1 (Used In Ending)
            new String[0],                   // Zone 2 (Leftover From Genesis Version)
            new String[0],                   // Zone 3 (Leftover From Genesis Version)
            {"/ST4_0.bin", "/ST4_1.bin"},    // Metropolis Act 1-2 (Unused Here, Files Dont Exist)
            {"/ST5_0.bin"},                  // Metropolis Act 3 (Unused Here, Files Dont Exist, Act 2 pointer removed from the Genesis version)
            {"/ST6_0.bin"},                  // Wing Fortress (Unused Here, Files Dont Exist, Act 2 pointer removed from the Genesis version)
            {"/ST7_0.bin", "/ST7_1.bin"},    // Hill Top Act 1-2
            new String[0],                   // Zone 8 (Leftover From Genesis Version)
            new String[0],                   // Zone 9 (Leftover From Genesis Version)
            {"/STA_0.bin", "/STA_1.bin"},    // Oil Ocean Act 1-2 (Unused Here, Files Dont Exist)
            {"/STB_0.bin", "/STB_1.bin"},    // Mystic Cave Act 1-2 (Unused Here, Files Dont Exist)
            {"/STC_0.bin", "/STC_1.bin"},    // Casino Night Act 1-2
            {"/STD_0.bin", "/STD_1.bin"},    // Chemical Plant Act 1-2
            {"/STE_0.bin"},                  // Death Egg (Unused Here, Files Dont Exist, Act 2 pointer removed from the Genesis version)
            {"/STF_0.bin", "/STF_1.bin"},    // Acuatic Ruin Act 1-2
            {"/ST10_0.bin"}                  // Sky Chase (Unused Here, Files Dont Exist, Act 2 pointer removed from the Genesis version)
    };
    // Rings Layout
    String[][] RING_FILENAME = new String[][]{
            {"/ring0_0.bin", "/ring0_1.bin"},  // Emerald Hill Act 1-2
            new String[0],                     // Zone 1 (Used In Ending)
            new String[0],                     // Zone 2 (Leftover From Genesis Version)
            new String[0],                     // Zone 3 (Leftover From Genesis Version)
            {"/ring4_0.bin", "/ring4_1.bin"},  // Metropolis Act 1-2 (Unused Here, Files Dont Exist)
            {"/ring5_0.bin"},                  // Metropolis Act 3 (Unused Here, Files Dont Exist, Act 2 pointer removed from the Genesis version)
            {"/ring6_0.bin"},                  // Wing Fortress (Unused Here, Files Dont Exist, Act 2 pointer removed from the Genesis version)
            {"/ring7_0.bin", "/ring7_1.bin"},  // Hill Top Act 1-2
            new String[0],                     // Zone 8 (Leftover From Genesis Version)
            new String[0],                     // Zone 9 (Leftover From Genesis Version)
            {"/ringA_0.bin", "/ringA_1.bin"},  // Oil Ocean Act 1-2 (Unused Here, Files Dont Exist)
            {"/ringB_0.bin", "/ringB_1.bin"},  // Mystic Cave Act 1-2 (Unused Here, Files Dont Exist)
            {"/ringC_0.bin", "/ringC_1.bin"},  // Casino Night Act 1-2
            {"/ringD_0.bin", "/ringD_1.bin"},  // Chemical Plant Act 1-2
            {"/ringE_0.bin"},                  // Death Egg (Unused Here, Files Dont Exist, Act 2 pointer removed from the Genesis version)
            {"/ringF_0.bin", "/ringF_1.bin"},  // Acuatic Ruin Act 1-2
            {"/ring10_0.bin"}                  // Sky Chase (Unused Here, Files Dont Exist, Act 2 pointer removed from the Genesis version)
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
