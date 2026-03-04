package Coral.Math.Float;

public class crlM44 {
   public float _11;
   public float _12;
   public float _13;
   public float _14;
   public float _21;
   public float _22;
   public float _23;
   public float _24;
   public float _31;
   public float _32;
   public float _33;
   public float _34;
   public float _41;
   public float _42;
   public float _43;
   public float _44;
   private static crlM44 a = new crlM44();
   private static crlV4 b = new crlV4();
   private static crlV4 c = new crlV4();
   private static crlV4 d = new crlV4();

   public crlM44() {
      this._11 = 1.0F;
      this._12 = 0.0F;
      this._13 = 0.0F;
      this._14 = 0.0F;
      this._21 = 0.0F;
      this._22 = 1.0F;
      this._23 = 0.0F;
      this._24 = 0.0F;
      this._31 = 0.0F;
      this._32 = 0.0F;
      this._33 = 1.0F;
      this._34 = 0.0F;
      this._41 = 0.0F;
      this._42 = 0.0F;
      this._43 = 0.0F;
      this._44 = 1.0F;
   }

   public crlM44(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      this._11 = var1;
      this._12 = var2;
      this._13 = var3;
      this._14 = var4;
      this._21 = var5;
      this._22 = var6;
      this._23 = var7;
      this._24 = var8;
      this._31 = var9;
      this._32 = var10;
      this._33 = var11;
      this._34 = var12;
      this._41 = var13;
      this._42 = var14;
      this._43 = var15;
      this._44 = var16;
   }

   public crlM44(crlM44 var1) {
      this._11 = var1._11;
      this._12 = var1._12;
      this._13 = var1._13;
      this._14 = var1._14;
      this._21 = var1._21;
      this._22 = var1._22;
      this._23 = var1._23;
      this._24 = var1._24;
      this._31 = var1._31;
      this._32 = var1._32;
      this._33 = var1._33;
      this._34 = var1._34;
      this._41 = var1._41;
      this._42 = var1._42;
      this._43 = var1._43;
      this._44 = var1._44;
   }

   public void set(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      this._11 = var1;
      this._12 = var2;
      this._13 = var3;
      this._14 = var4;
      this._21 = var5;
      this._22 = var6;
      this._23 = var7;
      this._24 = var8;
      this._31 = var9;
      this._32 = var10;
      this._33 = var11;
      this._34 = var12;
      this._41 = var13;
      this._42 = var14;
      this._43 = var15;
      this._44 = var16;
   }

   public final void set(crlM44 var1) {
      this._11 = var1._11;
      this._12 = var1._12;
      this._13 = var1._13;
      this._14 = var1._14;
      this._21 = var1._21;
      this._22 = var1._22;
      this._23 = var1._23;
      this._24 = var1._24;
      this._31 = var1._31;
      this._32 = var1._32;
      this._33 = var1._33;
      this._34 = var1._34;
      this._41 = var1._41;
      this._42 = var1._42;
      this._43 = var1._43;
      this._44 = var1._44;
   }

   public final void set(float[] var1) {
      this._11 = var1[0];
      this._12 = var1[1];
      this._13 = var1[2];
      this._14 = var1[3];
      this._21 = var1[4];
      this._22 = var1[5];
      this._23 = var1[6];
      this._24 = var1[7];
      this._31 = var1[8];
      this._32 = var1[9];
      this._33 = var1[10];
      this._34 = var1[11];
      this._41 = var1[12];
      this._42 = var1[13];
      this._43 = var1[14];
      this._44 = var1[15];
   }

   public void get(float[] var1) {
      var1[0] = this._11;
      var1[1] = this._12;
      var1[2] = this._13;
      var1[3] = this._14;
      var1[4] = this._21;
      var1[5] = this._22;
      var1[6] = this._23;
      var1[7] = this._24;
      var1[8] = this._31;
      var1[9] = this._32;
      var1[10] = this._33;
      var1[11] = this._34;
      var1[12] = this._41;
      var1[13] = this._42;
      var1[14] = this._43;
      var1[15] = this._44;
   }

   public final void setIdentity() {
      this._11 = 1.0F;
      this._12 = 0.0F;
      this._13 = 0.0F;
      this._14 = 0.0F;
      this._21 = 0.0F;
      this._22 = 1.0F;
      this._23 = 0.0F;
      this._24 = 0.0F;
      this._31 = 0.0F;
      this._32 = 0.0F;
      this._33 = 1.0F;
      this._34 = 0.0F;
      this._41 = 0.0F;
      this._42 = 0.0F;
      this._43 = 0.0F;
      this._44 = 1.0F;
   }

   public static final void setIdentity(crlM44 var0) {
      var0._11 = 1.0F;
      var0._12 = 0.0F;
      var0._13 = 0.0F;
      var0._14 = 0.0F;
      var0._21 = 0.0F;
      var0._22 = 1.0F;
      var0._23 = 0.0F;
      var0._24 = 0.0F;
      var0._31 = 0.0F;
      var0._32 = 0.0F;
      var0._33 = 1.0F;
      var0._34 = 0.0F;
      var0._41 = 0.0F;
      var0._42 = 0.0F;
      var0._43 = 0.0F;
      var0._44 = 1.0F;
   }

   public final void setPosition(float var1, float var2, float var3) {
      this._14 = var1;
      this._24 = var2;
      this._34 = var3;
      this._44 = 1.0F;
   }

   public static void setPosition(crlM44 var0, float var1, float var2, float var3) {
      var0._14 = var1;
      var0._24 = var2;
      var0._34 = var3;
      var0._44 = 1.0F;
   }

   public static final void mul(crlV4 var0, crlV4 var1, crlM44 var2) {
      float var3 = var1.x;
      float var4 = var1.y;
      float var5 = var1.z;
      var0.x = var3 * var2._11 + var4 * var2._21 + var5 * var2._31 + var2._41;
      var0.y = var3 * var2._12 + var4 * var2._22 + var5 * var2._32 + var2._42;
      var0.z = var3 * var2._13 + var4 * var2._23 + var5 * var2._33 + var2._43;
      var0.w = var3 * var2._14 + var4 * var2._24 + var5 * var2._34 + var2._44;
   }

   public static final void mul(crlM44 var0, crlM44 var1, crlM44 var2) {
      var0._11 = var1._11 * var2._11 + var1._12 * var2._21 + var1._13 * var2._31 + var1._14 * var2._41;
      var0._12 = var1._11 * var2._12 + var1._12 * var2._22 + var1._13 * var2._32 + var1._14 * var2._42;
      var0._13 = var1._11 * var2._13 + var1._12 * var2._23 + var1._13 * var2._33 + var1._14 * var2._43;
      var0._14 = var1._11 * var2._14 + var1._12 * var2._24 + var1._13 * var2._34 + var1._14 * var2._44;
      var0._21 = var1._21 * var2._11 + var1._22 * var2._21 + var1._23 * var2._31 + var1._24 * var2._41;
      var0._22 = var1._21 * var2._12 + var1._22 * var2._22 + var1._23 * var2._32 + var1._24 * var2._42;
      var0._23 = var1._21 * var2._13 + var1._22 * var2._23 + var1._23 * var2._33 + var1._24 * var2._43;
      var0._24 = var1._21 * var2._14 + var1._22 * var2._24 + var1._23 * var2._34 + var1._24 * var2._44;
      var0._31 = var1._31 * var2._11 + var1._32 * var2._21 + var1._33 * var2._31 + var1._34 * var2._41;
      var0._32 = var1._31 * var2._12 + var1._32 * var2._22 + var1._33 * var2._32 + var1._34 * var2._42;
      var0._33 = var1._31 * var2._13 + var1._32 * var2._23 + var1._33 * var2._33 + var1._34 * var2._43;
      var0._34 = var1._31 * var2._14 + var1._32 * var2._24 + var1._33 * var2._34 + var1._34 * var2._44;
      var0._41 = var0._42 = var0._43 = 0.0F;
      var0._44 = 1.0F;
   }

   public void mul(crlM44 var1) {
      float var2 = this._11 * var1._11 + this._12 * var1._21 + this._13 * var1._31 + this._14 * var1._41;
      float var3 = this._11 * var1._12 + this._12 * var1._22 + this._13 * var1._32 + this._14 * var1._42;
      float var4 = this._11 * var1._13 + this._12 * var1._23 + this._13 * var1._33 + this._14 * var1._43;
      float var5 = this._11 * var1._14 + this._12 * var1._24 + this._13 * var1._34 + this._14 * var1._44;
      float var6 = this._21 * var1._11 + this._22 * var1._21 + this._23 * var1._31 + this._24 * var1._41;
      float var7 = this._21 * var1._12 + this._22 * var1._22 + this._23 * var1._32 + this._24 * var1._42;
      float var8 = this._21 * var1._13 + this._22 * var1._23 + this._23 * var1._33 + this._24 * var1._43;
      float var9 = this._21 * var1._14 + this._22 * var1._24 + this._23 * var1._34 + this._24 * var1._44;
      float var10 = this._31 * var1._11 + this._32 * var1._21 + this._33 * var1._31 + this._34 * var1._41;
      float var11 = this._31 * var1._12 + this._32 * var1._22 + this._33 * var1._32 + this._34 * var1._42;
      float var12 = this._31 * var1._13 + this._32 * var1._23 + this._33 * var1._33 + this._34 * var1._43;
      float var13 = this._31 * var1._14 + this._32 * var1._24 + this._33 * var1._34 + this._34 * var1._44;
      this._11 = var2;
      this._12 = var3;
      this._13 = var4;
      this._14 = var5;
      this._21 = var6;
      this._22 = var7;
      this._23 = var8;
      this._24 = var9;
      this._31 = var10;
      this._32 = var11;
      this._33 = var12;
      this._34 = var13;
      this._41 = this._42 = this._43 = 0.0F;
      this._44 = 1.0F;
   }

   public final void postTranslate(float var1, float var2, float var3) {
      this._14 += this._11 * var1 + this._12 * var2 + this._13 * var3;
      this._24 += this._21 * var1 + this._22 * var2 + this._23 * var3;
      this._34 += this._31 * var1 + this._32 * var2 + this._33 * var3;
      this._41 = this._42 = this._43 = 0.0F;
      this._44 = 1.0F;
   }

   public final void postRotate(float var1, float var2, float var3, float var4) {
      float var14;
      float var15;
      float var13 = (var14 = var15 = (float)Math.sin((double)(var1 * 0.017453294F))) * var4;
      var14 *= var2;
      var15 *= var3;
      float var11;
      float var12;
      float var10 = var11 = var12 = (float)Math.cos((double)(var1 * 0.017453294F));
      float var16 = 1.0F - var10;
      float var5;
      var1 = var5 = var2 * var3 * var16;
      float var7;
      float var6 = var7 = var2 * var4 * var16;
      float var9;
      float var8 = var9 = var3 * var4 * var16;
      var10 += var2 * var2 * var16;
      var11 += var3 * var3 * var16;
      var12 += var4 * var4 * var16;
      var1 -= var13;
      var5 += var13;
      var6 += var15;
      var7 -= var15;
      var8 -= var14;
      var9 += var14;
      a._11 = this._11 * var10 + this._12 * var5 + this._13 * var7;
      a._12 = this._11 * var1 + this._12 * var11 + this._13 * var9;
      this._13 *= var12;
      this._13 += this._11 * var6 + this._12 * var8;
      a._21 = this._21 * var10 + this._22 * var5 + this._23 * var7;
      a._22 = this._21 * var1 + this._22 * var11 + this._23 * var9;
      this._23 *= var12;
      this._23 += this._21 * var6 + this._22 * var8;
      a._31 = this._31 * var10 + this._32 * var5 + this._33 * var7;
      a._32 = this._31 * var1 + this._32 * var11 + this._33 * var9;
      this._33 *= var12;
      this._33 += this._31 * var6 + this._32 * var8;
      this._11 = a._11;
      this._12 = a._12;
      this._21 = a._21;
      this._22 = a._22;
      this._31 = a._31;
      this._32 = a._32;
      this._41 = this._42 = this._43 = 0.0F;
      this._44 = 1.0F;
   }

   public final void postScale(float var1, float var2, float var3) {
      this._11 *= var1;
      this._21 *= var2;
      this._31 *= var3;
      this._12 *= var1;
      this._22 *= var2;
      this._32 *= var3;
      this._13 *= var1;
      this._23 *= var2;
      this._33 *= var3;
   }

   public final void invert() {
      float var1 = this._33 * this._44;
      float var2 = this._43 * this._34;
      float var3 = this._23 * this._44;
      float var4 = this._43 * this._24;
      float var5 = this._23 * this._34;
      float var6 = this._33 * this._24;
      float var7 = this._13 * this._44;
      float var8 = this._43 * this._14;
      float var9 = this._13 * this._34;
      float var10 = this._33 * this._14;
      float var11 = this._13 * this._24;
      float var12 = this._23 * this._14;
      float var13 = var1 * this._22 + var4 * this._32 + var5 * this._42 - (var2 * this._22 + var3 * this._32 + var6 * this._42);
      float var14 = var2 * this._12 + var7 * this._32 + var10 * this._42 - (var1 * this._12 + var8 * this._32 + var9 * this._42);
      float var15 = var3 * this._12 + var8 * this._22 + var11 * this._42 - (var4 * this._12 + var7 * this._22 + var12 * this._42);
      float var16 = var6 * this._12 + var9 * this._22 + var12 * this._32 - (var5 * this._12 + var10 * this._22 + var11 * this._32);
      float var17 = var2 * this._21 + var3 * this._31 + var6 * this._41 - (var1 * this._21 + var4 * this._31 + var5 * this._41);
      float var18 = var1 * this._11 + var8 * this._31 + var9 * this._41 - (var2 * this._11 + var7 * this._31 + var10 * this._41);
      float var19 = var4 * this._11 + var7 * this._21 + var12 * this._41 - (var3 * this._11 + var8 * this._21 + var11 * this._41);
      float var20 = var5 * this._11 + var10 * this._21 + var11 * this._31 - (var6 * this._11 + var9 * this._21 + var12 * this._31);
      var1 = this._31 * this._42;
      var2 = this._41 * this._32;
      var3 = this._21 * this._42;
      var4 = this._41 * this._22;
      var5 = this._21 * this._32;
      var6 = this._31 * this._22;
      var7 = this._11 * this._42;
      var8 = this._41 * this._12;
      var9 = this._11 * this._32;
      var10 = this._31 * this._12;
      var11 = this._11 * this._22;
      var12 = this._21 * this._12;
      float var21 = var1 * this._24 + var4 * this._34 + var5 * this._44 - (var2 * this._24 + var3 * this._34 + var6 * this._44);
      float var22 = var2 * this._14 + var7 * this._34 + var10 * this._44 - (var1 * this._14 + var8 * this._34 + var9 * this._44);
      float var23 = var3 * this._14 + var8 * this._24 + var11 * this._44 - (var4 * this._14 + var7 * this._24 + var12 * this._44);
      float var24 = var6 * this._14 + var9 * this._24 + var12 * this._34 - (var5 * this._14 + var10 * this._24 + var11 * this._34);
      float var25 = var3 * this._33 + var6 * this._43 + var2 * this._13 - (var5 * this._43 + var1 * this._13 + var4 * this._33);
      var1 = var9 * this._43 + var1 * this._13 + var8 * this._33 - (var7 * this._33 + var10 * this._43 + var2 * this._13);
      var2 = var7 * this._13 + var12 * this._43 + var4 * this._13 - (var11 * this._43 + var3 * this._13 + var8 * this._13);
      var3 = var11 * this._33 + var5 * this._13 + var10 * this._13 - (var9 * this._13 + var12 * this._33 + var6 * this._13);
      var4 = 1.0F / (this._11 * var13 + this._21 * var14 + this._31 * var15 + this._41 * var16);
      this._11 = var13 * var4;
      this._21 = var14 * var4;
      this._31 = var15 * var4;
      this._41 = var16 * var4;
      this._12 = var17 * var4;
      this._22 = var18 * var4;
      this._32 = var19 * var4;
      this._42 = var20 * var4;
      this._13 = var21 * var4;
      this._23 = var22 * var4;
      this._33 = var23 * var4;
      this._43 = var24 * var4;
      this._14 = var25 * var4;
      this._24 = var1 * var4;
      this._34 = var2 * var4;
      this._44 = var3 * var4;
   }

   public void transpose() {
      float var1 = this._12;
      this._12 = this._21;
      this._21 = var1;
      var1 = this._13;
      this._13 = this._31;
      this._31 = var1;
      var1 = this._14;
      this._14 = this._41;
      this._41 = var1;
      var1 = this._23;
      this._23 = this._32;
      this._32 = var1;
      var1 = this._24;
      this._24 = this._42;
      this._42 = var1;
      var1 = this._34;
      this._34 = this._43;
      this._43 = var1;
   }

   public void transform(float[] var1) {
      int var5 = var1.length;

      float var2;
      float var3;
      float var4;
      for(int var6 = 0; var6 < var5; var1[var6++] = var2 * this._14 + var3 * this._24 + var4 * this._34 + this._44) {
         var2 = var1[var6];
         var3 = var1[var6 + 1];
         var4 = var1[var6 + 2];
         var1[var6++] = var2 * this._11 + var3 * this._21 + var4 * this._31 + this._41;
         var1[var6++] = var2 * this._12 + var3 * this._22 + var4 * this._32 + this._42;
         var1[var6++] = var2 * this._13 + var3 * this._23 + var4 * this._33 + this._43;
      }

   }

   public void lookAt(crlV4 var1, crlV4 var2, crlV4 var3) {
      crlV4.sub(b, var1, var2);
      b.normalise();
      this._13 = b.x;
      this._23 = b.y;
      this._33 = b.z;
      this._43 = 0.0F;
      crlV4.cross(c, var3, b);
      c.normalise();
      this._11 = c.x;
      this._21 = c.y;
      this._31 = c.z;
      this._41 = 0.0F;
      crlV4.cross(d, b, c);
      this._12 = d.x;
      this._22 = d.y;
      this._32 = d.z;
      this._42 = 0.0F;
      this._14 = var1.x;
      this._24 = var1.y;
      this._34 = var1.z;
      this._44 = 0.0F;
   }

   public static void lookAt(float[] var0, crlV4 var1, crlV4 var2, crlV4 var3) {
      crlV4.sub(b, var1, var2);
      b.normalise();
      var0[2] = b.x;
      var0[6] = b.y;
      var0[10] = b.z;
      var0[14] = 0.0F;
      crlV4.cross(c, var3, b);
      c.normalise();
      var0[0] = c.x;
      var0[4] = c.y;
      var0[8] = c.z;
      var0[12] = 0.0F;
      crlV4.cross(d, b, c);
      var0[1] = d.x;
      var0[5] = d.y;
      var0[9] = d.z;
      var0[13] = 0.0F;
      var0[3] = var1.x;
      var0[7] = var1.y;
      var0[11] = var1.z;
      var0[15] = 1.0F;
   }

   public static void print(crlM44 var0) {
   }

   public static void print(String var0, crlM44 var1) {
   }
}
