package Coral.Math.Float;

public class crlV4 {
   public static final crlV4 UP = new crlV4(0.0F, 1.0F, 0.0F);
   public static final crlV4 ORIGIN = new crlV4(0.0F, 0.0F, 0.0F);
   public float x;
   public float y;
   public float z;
   public float w;

   public crlV4() {
      this.w = 1.0F;
   }

   public crlV4(float var1, float var2) {
      this.x = var1;
      this.y = var2;
      this.z = 0.0F;
      this.w = 1.0F;
   }

   public crlV4(float var1, float var2, float var3) {
      this.x = var1;
      this.y = var2;
      this.z = var3;
      this.w = 1.0F;
   }

   public crlV4(crlV4 var1) {
      this.x = var1.x;
      this.y = var1.y;
      this.z = var1.z;
      this.w = var1.w;
   }

   public crlV4(float var1, float var2, float var3, float var4) {
      this.x = var1;
      this.y = var2;
      this.z = var3;
      this.w = var4;
   }

   public final void set(crlV4 var1) {
      this.x = var1.x;
      this.y = var1.y;
      this.z = var1.z;
   }

   public final void set(float var1, float var2, float var3) {
      this.x = var1;
      this.y = var2;
      this.z = var3;
   }

   public final void set(float var1, float var2, float var3, float var4) {
      this.x = var1;
      this.y = var2;
      this.z = var3;
      this.w = var4;
   }

   public final void reset() {
      this.x = 0.0F;
      this.y = 0.0F;
      this.z = 0.0F;
      this.w = 1.0F;
   }

   public final void get(float[] var1) {
      var1[0] = this.x;
      var1[1] = this.y;
      var1[2] = this.z;
      var1[3] = this.w;
   }

   public static final void add(crlV4 var0, crlV4 var1, crlV4 var2) {
      var0.x = var1.x + var2.x;
      var0.y = var1.y + var2.y;
      var0.z = var1.z + var2.z;
   }

   public final void add(crlV4 var1, crlV4 var2) {
      this.x = var1.x + var2.x;
      this.y = var1.y + var2.y;
      this.z = var1.z + var2.z;
   }

   public static final void add2d(crlV4 var0, crlV4 var1, crlV4 var2) {
      var0.x = var1.x + var2.x;
      var0.y = var1.y + var2.y;
      var0.z = 0.0F;
   }

   public final void addEq(crlV4 var1) {
      this.x += var1.x;
      this.y += var1.y;
      this.z += var1.z;
   }

   public final void addEq(float var1, float var2, float var3) {
      this.x += var1;
      this.y += var2;
      this.z += var3;
   }

   public final void subEq(crlV4 var1) {
      this.x -= var1.x;
      this.y -= var1.y;
      this.z -= var1.z;
   }

   public final void subEq(float var1, float var2, float var3) {
      this.x -= var1;
      this.y -= var2;
      this.z -= var3;
   }

   public void sub(crlV4 var1, crlV4 var2) {
      this.x = var1.x - var2.x;
      this.y = var1.y - var2.y;
      this.z = var1.z - var2.z;
   }

   public static final void sub(crlV4 var0, crlV4 var1, crlV4 var2) {
      var0.x = var1.x - var2.x;
      var0.y = var1.y - var2.y;
      var0.z = var1.z - var2.z;
   }

   public static void sub2d(crlV4 var0, crlV4 var1, crlV4 var2) {
      var0.x = var1.x - var2.x;
      var0.y = var1.y - var2.y;
      var0.z = 0.0F;
   }

   public static final float dot(crlV4 var0, crlV4 var1) {
      return var0.x * var1.x + var0.y * var1.y + var0.z * var1.z;
   }

   public static float dot2d(crlV4 var0, crlV4 var1) {
      return var0.x * var1.x + var0.y * var1.y;
   }

   public final void mul(float var1) {
      this.x *= var1;
      this.y *= var1;
      this.z *= var1;
   }

   public final void mul2d(float var1) {
      this.x *= var1;
      this.y *= var1;
      this.z = 0.0F;
      this.w = 0.0F;
   }

   public final void div(float var1) {
      this.x /= var1;
      this.y /= var1;
      this.z /= var1;
   }

   public final void div(crlV4 var1) {
      this.x /= var1.x;
      this.y /= var1.y;
      this.z /= var1.z;
   }

   public final float mag() {
      return (float)Math.sqrt((double)(this.x * this.x + this.y * this.y + this.z * this.z));
   }

   public final float magSqr() {
      return this.x * this.x + this.y * this.y + this.z * this.z;
   }

   public final float mag2d() {
      return (float)Math.sqrt((double)(this.x * this.x + this.y * this.y));
   }

   public static void cross(crlV4 var0, crlV4 var1, crlV4 var2) {
      var0.x = var1.y * var2.z - var1.z * var2.y;
      var0.y = var1.z * var2.x - var1.x * var2.z;
      var0.z = var1.x * var2.y - var1.y * var2.x;
   }

   public void cross(crlV4 var1, crlV4 var2) {
      this.x = var1.y * var2.z - var1.z * var2.y;
      this.y = var1.z * var2.x - var1.x * var2.z;
      this.z = var1.x * var2.y - var1.y * var2.x;
   }

   public static float scalarTriple(crlV4 var0, crlV4 var1, crlV4 var2) {
      float var3 = 0.0F;
      float var4 = 0.0F;
      float var5 = 0.0F;
      var3 = var0.y * var1.z - var0.z * var1.y;
      var4 = var0.z * var1.x - var0.x * var1.z;
      var5 = var0.x * var1.y - var0.y * var1.x;
      return var3 * var2.x + var4 * var2.y + var5 * var2.z;
   }

   public static float distance(crlV4 var0, crlV4 var1) {
      float var2 = var1.x - var0.x;
      float var3 = var1.y - var0.y;
      float var4 = var1.z - var0.z;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
   }

   public static float distanceSqr(crlV4 var0, crlV4 var1) {
      float var2 = var1.x - var0.x;
      float var3 = var1.y - var0.y;
      float var4 = var1.z - var0.z;
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public static float distance2d(crlV4 var0, crlV4 var1) {
      float var2 = var1.x - var0.x;
      float var3 = var1.y - var0.y;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3));
   }

   public static float distanceSqr2d(crlV4 var0, crlV4 var1) {
      float var2 = var1.x - var0.x;
      float var3 = var1.y - var0.y;
      return var2 * var2 + var3 * var3;
   }

   public final void normalise() {
      float var1 = 1.0F / (float)Math.sqrt((double)(this.x * this.x + this.y * this.y + this.z * this.z));
      this.x *= var1;
      this.y *= var1;
      this.z *= var1;
   }

   public final void normalise2d() {
      float var1 = 1.0F / (float)Math.sqrt((double)(this.x * this.x + this.y * this.y));
      this.x *= var1;
      this.y *= var1;
      this.z = 0.0F;
   }

   public final void print(String var1) {
   }

   public final void print() {
   }
}
