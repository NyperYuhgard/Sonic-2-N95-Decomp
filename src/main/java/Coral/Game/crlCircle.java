package Coral.Game;

public class crlCircle {
   public float mCentreX;
   public float mCentreY;
   public float mCentreZ;
   public float mRadius;

   public crlCircle() {
      this.mCentreX = 0.0F;
      this.mCentreY = 0.0F;
      this.mCentreZ = 0.0F;
      this.mRadius = 0.0F;
   }

   public crlCircle(float var1, float var2, float var3) {
      this.mCentreX = var1;
      this.mCentreY = var2;
      this.mRadius = var3;
   }

   public void setRadius(float var1) {
      this.mRadius = var1;
   }

   public void setCircle(crlCircle var1) {
      this.mCentreX = var1.mCentreX;
      this.mCentreY = var1.mCentreY;
      this.mRadius = var1.mRadius;
   }

   public void setCentre(float var1, float var2) {
      this.mCentreX = var1;
      this.mCentreY = var2;
   }
}
