import java.io.*;

public class Generador {
    public static void main(String[] args) {
        // TABLA B: Rutas de archivos (1 por fila para control total)
        String[] b = {
            "/title.mid",                // 0
            "/emerald_hill.mid",         // 1
            "/chemical_plant.mid",       // 2
            "/aquatic_ruin.mid",         // 3
            "/casino_night.mid",         // 4
            "/hill_top.mid",             // 5
            "/boss.mid",                 // 6
            "/stageclear.mid",           // 7
            "/hurry.mid",                // 8
            "/invincible.mid",           // 9
            "/1up.mid",                  // 10
            "/gameover.mid",             // 11
            "/continue.mid",             // 12
            "/super_sonic.mid",          // 13
            "/score.mid",                // 14
            "/drown.mid",                // 15
            "/ring.mid",                 // 16
            "/emerald_hill_intro.mid",   // 17
            "/chemical_plant_intro.mid", // 18
            "/aquatic_ruin_intro.mid",   // 19
            "/casino_night_intro.mid",   // 20
            "/hill_top.mid",             // 21
            "/SEGA.amr",                 // 22
            "/mystic_cave_loop.mid",     // 23 <-- LOOP
            "", "", "", "", "", "",      // 24-29
            "", "", "", "", "", "",      // 30-35
            "", "", "",                  // 36-38
            "/mystic_cave_intro.mid",    // 39 <-- INTRO
            "", ""                       // 40-41
        };

        // TABLA A: Mapeo de Zonas (17 zonas)
        int[] a = {
            1,   // 0: EHZ
            5,   // 1: HTZ
            133, 132, 133, 133, 143, 5, 144, 141, 132, 
            23,  // 11: Mystic Cave Base ID
            4, 2, 138, 3, 141
        };
        
        // TABLA C: Tipos de Audio (42 elementos)
        int[] c = new int[42];
        for(int i=0; i<42; i++) c[i] = 1; 
        c[22] = 0; // SEGA.amr es el único distinto

        // TABLA D: Loop States (42 elementos)
        // 1 = Tocar una vez (Intro)
        // -1 = Bucle infinito (Loop)
        int[] d = {
            1,  -1, -1, -1, -1, -1, -1, 1,  1,  -1, 1,  1,  1,  -1, 1,  1,  // 0-15
            1,  1,  1,  1,  1,  1,  1,                                  // 16-22
            -1,                                                         // 23: Mystic Cave LOOP
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, // 24-38
            1,                                                          // 39: Mystic Cave INTRO
            -1, -1                                                      // 40-41
        };

        // SALIDA POR CONSOLA PARA VERIFICAR ANTES DE ESCRIBIR
        System.out.println("=== REVISIÓN DE DATOS DE AUDIO ===");
        for (int i = 0; i < b.length; i++) {
            if (!b[i].equals("")) {
                String tipoLoop = (d[i] == -1) ? "INFINITO (-1)" : "UNA VEZ (1)";
                System.out.println("ID [" + i + "] -> " + b[i] + " | Loop: " + tipoLoop);
            }
        }
        System.out.println("==================================\n");

        try {
            // Guardar Rutas
            DataOutputStream dosB = new DataOutputStream(new FileOutputStream("audio_b.bin"));
            int count = 0;
            for (String s : b) if (!s.equals("")) count++;
            dosB.writeByte(count); 
            for (int i = 0; i < b.length; i++) {
                if (!b[i].equals("")) {
                    dosB.writeByte(i);
                    byte[] bytes = b[i].getBytes("UTF-8");
                    dosB.writeByte(bytes.length);
                    dosB.write(bytes);
                }
            }
            dosB.close();

            // Guardar Tablas A, C, D
            FileOutputStream fosD = new FileOutputStream("audio_data.bin");
            for (int val : a) fosD.write(val);
            for (int val : c) fosD.write(val);
            for (int val : d) fosD.write(val == -1 ? 255 : val);
            fosD.close();

            System.out.println("ARCHIVOS GENERADOS: audio_b.bin y audio_data.bin listos.");
        } catch (Exception e) { e.printStackTrace(); }
    }
}
