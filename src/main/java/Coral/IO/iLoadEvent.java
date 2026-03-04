package Coral.IO;

public interface iLoadEvent {
   int TYPE_NDEF = 0;
   int TYPE_IMAGE = 1;
   int TYPE_BINARY = 4;
   int TYPE_MID = 6;
   int TYPE_AMR = 7;
   int TYPE_WAV = 15;
   int TYPE_IMP = 11;

   boolean preLoad(long var1, int var3);

   boolean onLoad(byte[] var1, long var2, int var4);

   boolean postLoad(Object var1, long var2, int var4);
}
