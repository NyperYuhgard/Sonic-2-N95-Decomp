package Coral.Audio;

public interface iVibration {
   int RET_ERROR = -1;
   int RET_OK = 0;

   boolean isVibrationSupported();

   void vibrate(int var1);

   void pause();

   void resume();

   void stop();

   int update();
}
