package Coral.Game;

import Coral.Math.Float.crlV4;

public class crlPlane {
   public float mNormalX;
   public float mNormalY;
   public float mNormalZ;
   public float mDot;

   public final void setPlane(crlV4 var1, float var2) {
      this.mNormalX = var1.x;
      this.mNormalY = var1.y;
      this.mNormalZ = var1.z;
      this.mDot = var2;
   }

   public final void computePlane(crlV4 var1, crlV4 var2, crlV4 var3) {
      float var4 = var2.x - var1.x;
      float var5 = var2.y - var1.y;
      float var8 = var2.z - var1.z;
      float var6 = var3.x - var1.x;
      float var7 = var3.y - var1.y;
      float var9 = var3.z - var1.z;
      this.mNormalX = var5 * var9 - var8 * var7;
      this.mNormalY = var8 * var6 - var4 * var9;
      this.mNormalZ = var4 * var7 - var5 * var6;
      var8 = 1.0F / (float)Math.sqrt((double)(this.mNormalX * this.mNormalX + this.mNormalY * this.mNormalY + this.mNormalZ * this.mNormalZ));
      this.mNormalX *= var8;
      this.mNormalY *= var8;
      this.mNormalZ *= var8;
      this.mDot = this.mNormalX * var1.x + this.mNormalY * var1.y + this.mNormalZ * var1.z;
   }

   public final void computePlane(crlV4 var1, crlV4 var2) {
      this.mDot = var2.x * var1.x + var2.y * var1.y + var2.z * var1.z;
      this.mNormalX = var2.x;
      this.mNormalY = var2.y;
      this.mNormalZ = var2.z;
   }

   public final void computePlane(crlV4 var1, float var2, float var3, float var4) {
      this.mDot = var2 * var1.x + var3 * var1.y + var4 * var1.z;
      this.mNormalX = var2;
      this.mNormalY = var3;
      this.mNormalZ = var4;
   }
}
