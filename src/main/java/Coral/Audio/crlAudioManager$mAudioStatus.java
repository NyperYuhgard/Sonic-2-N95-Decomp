package Coral.Audio;

import Coral.Util.crlManagerBase$mngrStatus;

public interface crlAudioManager$mAudioStatus extends crlManagerBase$mngrStatus {
   int STANDBY = 7;
   int LOOPING = 8;
   int PAUSED = 9;
   int ERROR = 10;
   int STOPPING = 11;
   int PLAYING = 8;
}
