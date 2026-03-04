package Coral.Audio;

public interface iAudio {
   int RET_ERROR = -1;
   int RET_OK = 0;
   int AMR = 0;
   int MIDI = 1;
   int MP3 = 2;
   int XWAV = 3;
   int FORMAT_TONE = 4;
   byte VOLUME_OFF = 0;
   byte VOLUME_QUARTER = 1;
   byte VOLUME_HALF = 2;
   byte VOLUME_FULL = 3;
   int INFINITE = -1;

   int load(iAudioLoader var1, long[] var2, int[] var3);

   void play(int var1, int var2, int var3);

   boolean isStarted(int var1);

   void pause();

   void resume();

   void stop(int var1);

   void stopAll();

   int reload();

   int unload();

   int update();
}
