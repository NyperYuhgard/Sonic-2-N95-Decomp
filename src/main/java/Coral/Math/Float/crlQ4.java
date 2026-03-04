package Coral.Math.Float;

public class crlQ4 {
   public float w;
   public float x;
   public float y;
   public float z;

   public crlQ4() {
      this.w = 0.0F;
      this.x = 0.0F;
      this.y = 0.0F;
      this.z = 0.0F;
   }

   public crlQ4(float var1, float var2, float var3, float var4) {
      this.w = var1;
      this.x = var2;
      this.y = var3;
      this.z = var4;
   }

   public final float mag() {
      return (float)Math.sqrt((double)(this.w * this.w + this.x * this.x + this.y * this.y + this.z * this.z));
   }

   public final void getVector(crlV4 var1) {
      var1.x = this.x;
      var1.y = this.y;
      var1.z = this.z;
   }

   public final void getScalar(float var1) {
   }

   public final void addEq(crlQ4 var1) {
      this.w += var1.w;
      this.x += var1.x;
      this.y += var1.y;
      this.z += var1.z;
   }

   public final void subEq(crlQ4 var1) {
      this.w -= var1.w;
      this.x -= var1.x;
      this.y -= var1.y;
      this.z -= var1.z;
   }

   public final void mulEq(float var1) {
      this.w *= var1;
      this.x *= var1;
      this.y *= var1;
      this.z *= var1;
   }

   public final void divEq(float var1) {
      this.w /= var1;
      this.x /= var1;
      this.y /= var1;
      this.z /= var1;
   }

   public final void add(crlQ4 var1, crlQ4 var2, crlQ4 var3) {
      var1.w = var2.w + var3.w;
      var1.x = var2.x + var3.x;
      var1.y = var2.y + var3.y;
      var1.z = var2.z + var3.z;
   }

   public final void sub(crlQ4 var1, crlQ4 var2, crlQ4 var3) {
      var1.w = var2.w - var3.w;
      var1.x = var2.x - var3.x;
      var1.y = var2.y - var3.y;
      var1.z = var2.z - var3.z;
   }

   public final void mul(crlQ4 var1, crlQ4 var2, crlQ4 var3) {
      var1.w = var2.w * var3.w - var2.x * var3.x - var2.y * var3.y - var2.y * var3.y;
      var1.x = var2.w * var3.x + var2.x * var3.w + var2.y * var3.z - var2.z * var3.y;
      var1.y = var2.w * var3.y + var2.y * var3.w + var2.z * var3.x - var2.x * var3.z;
      var1.z = var2.w * var3.z + var2.z * var3.w + var2.x * var3.y - var2.y * var3.x;
   }

   public final void mul(crlQ4 var1, crlQ4 var2, float var3) {
      var1.w = var2.w * var3;
      var1.x = var2.x * var3;
      var1.y = var2.y * var3;
      var1.z = var2.z * var3;
   }

   public final void mul(crlQ4 var1, crlQ4 var2, crlV4 var3) {
      var1.w = -(var2.x * var3.x) + var2.y * var3.y + var2.z * var3.z;
      var1.x = var2.w * var3.x + var2.y * var3.z - var2.z * var3.y;
      var1.y = var2.w * var3.y + var2.z * var3.x - var2.x * var3.z;
      var1.z = var2.w * var3.z + var2.x * var3.y - var2.y * var3.x;
   }

   public final void mul(crlQ4 var1, crlV4 var2, crlQ4 var3) {
      var1.w = -(var3.x * var2.x) + var3.y * var2.y + var3.z * var2.z;
      var1.x = var3.w * var2.x + var3.z * var2.y - var3.y * var2.z;
      var1.y = var3.w * var2.y + var3.x * var2.z - var3.z * var2.x;
      var1.z = var3.w * var2.z + var3.y * var2.x - var3.x * var2.y;
   }

   public final void div(crlQ4 var1, crlQ4 var2, float var3) {
      var1.w = var2.w / var3;
      var1.x = var2.x / var3;
      var1.y = var2.y / var3;
      var1.z = var2.z / var3;
   }

   public final void inv(crlQ4 var1, crlQ4 var2) {
      var1.w = var2.w;
      var1.x = -var2.x;
      var1.y = -var2.y;
      var1.z = -var2.z;
   }

   public final void inv() {
      this.x = -this.x;
      this.y = -this.y;
      this.z = -this.z;
   }

   public final void getAngle(float var1, crlQ4 var2) {
      crlMath.acos((double)var2.w);
   }

   public final void getAxis(crlV4 var1, crlQ4 var2) {
      float var3;
      if ((var3 = (float)Math.sqrt((double)(var2.x * var2.x + var2.y * var2.y + var2.z * var2.z))) < 1.0E-6F) {
         var1.x = 0.0F;
         var1.y = 0.0F;
         var1.z = 0.0F;
      } else {
         var1.x = var2.x / var3;
         var1.y = var2.y / var3;
         var1.z = var2.z / var3;
      }
   }

   public final void rotate(crlQ4 var1, crlQ4 var2, crlQ4 var3) {
      var1.w = (var2.w * var3.w - var2.x * var3.x - var2.y * var3.y - var2.y * var3.y) * var2.w;
      var1.x = (var2.w * var3.x + var2.x * var3.w + var2.y * var3.z - var2.z * var3.y) * -var2.x;
      var1.y = (var2.w * var3.y + var2.y * var3.w + var2.z * var3.x - var2.x * var3.z) * -var2.y;
      var1.z = (var2.w * var3.z + var2.z * var3.w + var2.x * var3.y - var2.y * var3.x) * -var2.z;
   }

   public final void rotateV(crlV4 var1, crlQ4 var2, crlV4 var3) {
      var1.w = (-(var2.x * var3.x) + var2.y * var3.y + var2.z * var3.z) * var2.w;
      var1.x = (var2.w * var3.x + var2.y * var3.z - var2.z * var3.y) * -var2.x;
      var1.y = (var2.w * var3.y + var2.z * var3.x - var2.x * var3.z) * -var2.y;
      var1.z = (var2.w * var3.z + var2.x * var3.y - var2.y * var3.x) * -var2.z;
   }

   public final void fromEulerAngles(crlQ4 var1, float var2, float var3, float var4) {
      double var5 = Math.cos(0.5D * (double)var4);
      double var7 = Math.cos(0.5D * (double)var3);
      double var9 = Math.cos(0.5D * (double)var2);
      double var11 = Math.sin(0.5D * (double)var4);
      double var13 = Math.sin(0.5D * (double)var3);
      double var15 = Math.sin(0.5D * (double)var2);
      double var17 = var5 * var7;
      double var21 = var5 * var13;
      double var19 = var11 * var13;
      double var23 = var11 * var7;
      var1.w = (float)(var17 * var9 + var19 * var15);
      var1.x = (float)(var17 * var15 - var19 * var9);
      var1.y = (float)(var21 * var9 + var23 * var15);
      var1.z = (float)(var23 * var9 + var21 * var15);
   }

   public final void toEulerAngles(crlV4 var1, crlQ4 var2) {
      double var17 = (double)(var2.w * var2.w);
      double var19 = (double)(var2.x * var2.x);
      double var21 = (double)(var2.y * var2.y);
      double var23 = (double)(var2.z * var2.z);
      double var3 = var17 * var19 - var21 - var23;
      double var5 = (double)(2.0F * (var2.x * var2.y + var2.w * var2.z));
      double var7 = (double)(2.0F * (var2.x * var2.z - var2.w * var2.y));
      double var9 = (double)(2.0F * (var2.y * var2.z + var2.w * var2.x));
      double var11 = var17 - var19 - var21 + var23;
      double var25;
      if ((var25 = Math.abs(var7)) > 0.999999D) {
         double var13 = (double)(2.0F * (var2.x * var2.y - var2.w * var2.z));
         double var15 = (double)(2.0F * (var2.x * var2.z + var2.w * var2.y));
         var1.x = 0.0F;
         var1.y = (float)(var7 * -1.5707963267948966D / var25);
         var1.z = (float)crlMath.atan2(-var13, -var7 * var15);
      } else {
         var1.x = (float)crlMath.atan2(var9, var11);
         var1.y = (float)Math.sin(-var7);
         var1.z = (float)crlMath.atan2(var5, var3);
      }
   }
}
