package Coral.Game;

import Coral.Math.Float.crlV4;

public class crlCollision {
   public static final void open() {
   }

   public static final void close() {
   }

   public static final boolean CircleCircle(crlCircle var0, crlCircle var1) {
      float var2 = var0.mCentreX - var1.mCentreX;
      float var3 = var0.mCentreY - var1.mCentreY;
      float var4 = var0.mCentreZ - var1.mCentreZ;
      var2 = var2 * var2 + var3 * var3 + var4 * var4;
      float var5 = var0.mRadius + var1.mRadius;
      return var2 <= var5 * var5;
   }

   public static final float SqDistPointSegment(crlV4 var0, crlV4 var1, crlV4 var2) {
      float var3 = var1.x - var0.x;
      float var4 = var1.y - var0.y;
      float var5 = var1.z - var0.z;
      float var6 = var2.x - var0.x;
      float var7 = var2.y - var0.y;
      float var10 = var2.z - var0.z;
      float var8;
      if ((var8 = var6 * var3 + var7 * var4 + var10 * var5) <= 0.0F) {
         return var6 * var6 + var7 * var7 + var10 * var10;
      } else {
         float var9 = var3 * var3 + var4 * var4 + var5 * var5;
         var3 = var2.x - var1.x;
         var4 = var2.y - var1.y;
         var5 = var2.z - var1.z;
         return var8 >= var9 ? var3 * var3 + var4 * var4 + var5 * var5 : var6 * var6 + var7 * var7 + var10 * var10 - var8 * (var8 / var9);
      }
   }

   public static final float ClosestPtPointSegment(crlV4 var0, crlV4 var1, crlV4 var2, crlV4 var3) {
      float var4 = var1.x - var0.x;
      float var5 = var1.y - var0.y;
      float var8 = var1.z - var0.z;
      float var6 = var2.x - var0.x;
      float var7 = var2.y - var0.y;
      float var9 = var2.z - var0.z;
      if ((var9 = (var6 * var4 + var7 * var5 + var9 * var8) / (var4 * var4 + var5 * var5 + var8 * var8)) < 0.0F) {
         var9 = 0.0F;
      }

      if (var9 > 1.0F) {
         var9 = 1.0F;
      }

      var4 *= var9;
      var5 *= var9;
      var8 *= var9;
      var3.x = var0.x + var4;
      var3.y = var0.y + var5;
      var3.z = var0.z + var8;
      return var9;
   }

   public static final float ClosestPtPointSegment2D(crlV4 var0, crlV4 var1, crlV4 var2, crlV4 var3) {
      float var4 = var1.x - var0.x;
      float var6 = var1.z - var0.z;
      float var5 = var2.x - var0.x;
      float var7 = var2.z - var0.z;
      var7 = (var5 * var4 + var7 * var6) / (var4 * var4 + var6 * var6);
      var4 *= var7;
      var6 *= var7;
      var3.x = var0.x + var4;
      var3.z = var0.z + var6;
      return var7;
   }

   public static final boolean LineTri(crlV4 var0, crlV4 var1, crlV4 var2, crlV4 var3, crlV4 var4) {
      float var5 = var2.x - var1.x;
      float var6 = var2.y - var1.y;
      float var7 = var2.z - var1.z;
      float var8 = var3.x - var1.x;
      float var9 = var3.y - var1.y;
      float var10 = var3.z - var1.z;
      float var11 = var6 * var10 - var7 * var9;
      float var12 = var7 * var8 - var5 * var10;
      float var13 = var5 * var9 - var6 * var8;
      var5 = var0.x - var1.x;
      var6 = var0.y - var1.y + 1000.0F;
      var7 = var0.z - var1.z;
      float var14 = var5 * var11 + var6 * var12 + var7 * var13;
      var5 = var5 * var11 + (var6 - 2000.0F) * var12 + var7 * var13;
      var6 = var14 - var5;
      var4.x = (var0.x * var14 - var0.x * var5) / var6;
      var4.y = ((var0.y - 1000.0F) * var14 - (var0.y + 1000.0F) * var5) / var6;
      var4.z = (var0.z * var14 - var0.z * var5) / var6;
      if ((var9 * var13 - var10 * var12) * (var4.x - var1.x) + (var10 * var11 - var8 * var13) * (var4.y - var1.y) + (var8 * var12 - var9 * var11) * (var4.z - var1.z) < 0.0F) {
         return false;
      } else {
         var8 = var2.x - var3.x;
         var9 = var2.y - var3.y;
         var10 = var2.z - var3.z;
         if ((var9 * var13 - var10 * var12) * (var4.x - var3.x) + (var10 * var11 - var8 * var13) * (var4.y - var3.y) + (var8 * var12 - var9 * var11) * (var4.z - var3.z) < 0.0F) {
            return false;
         } else {
            var8 = var1.x - var2.x;
            var9 = var1.y - var2.y;
            var10 = var1.z - var2.z;
            return !((var9 * var13 - var10 * var12) * (var4.x - var2.x) + (var10 * var11 - var8 * var13) * (var4.y - var2.y) + (var8 * var12 - var9 * var11) * (var4.z - var2.z) < 0.0F);
         }
      }
   }

   public static final boolean LineTriNoY(crlV4 var0, crlV4 var1, crlV4 var2, crlV4 var3, crlV4 var4) {
      float var5 = var2.x - var1.x;
      float var6 = 0.0F;
      var6 = var2.z - var1.z;
      float var7 = var3.x - var1.x;
      float var8 = var3.z - var1.z;
      var5 = var6 * var7 - var5 * var8;
      var6 = 1000.0F;
      var6 = 1000.0F * var5;
      float var9 = -1000.0F * var5;
      float var10 = var6 - var9;
      var4.x = (var0.x * var6 - var0.x * var9) / var10;
      var4.y = (-1000.0F * var6 - 1000.0F * var9) / var10;
      var4.z = (var0.z * var6 - var0.z * var9) / var10;
      if (-(var8 * var5) * (var4.x - var1.x) + var7 * var5 * (var4.z - var1.z) < 0.0F) {
         return false;
      } else {
         var7 = var2.x - var3.x;
         if (-((var2.z - var3.z) * var5) * (var4.x - var3.x) + var7 * var5 * (var4.z - var3.z) < 0.0F) {
            return false;
         } else {
            var7 = var1.x - var2.x;
            return !(-((var1.z - var2.z) * var5) * (var4.x - var2.x) + var7 * var5 * (var4.z - var2.z) < 0.0F);
         }
      }
   }

   public static final boolean LineTriSafe(crlV4 var0, crlV4 var1, crlV4 var2, crlV4 var3, crlV4 var4) {
      float var5 = var2.x - var1.x;
      float var6 = var2.y - var1.y;
      float var7 = var2.z - var1.z;
      float var8 = var3.x - var1.x;
      float var9 = var3.y - var1.y;
      float var10 = var3.z - var1.z;
      float var11 = var6 * var10 - var7 * var9;
      float var12 = var7 * var8 - var5 * var10;
      float var13 = var5 * var9 - var6 * var8;
      var6 = 1.0F / (float)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
      var11 *= var6;
      var12 *= var6;
      var13 *= var6;
      var5 = var0.x - var1.x;
      var6 = var0.y - var1.y + 1000.0F;
      var7 = var0.z - var1.z;
      float var14 = var5 * var11 + var6 * var12 + var7 * var13;
      var5 = var5 * var11 + (var6 - 2000.0F) * var12 + var7 * var13;
      var6 = var14 - var5;
      var4.x = (var0.x * var14 - var0.x * var5) / var6;
      var4.y = ((var0.y - 1000.0F) * var14 - (var0.y + 1000.0F) * var5) / var6;
      var4.z = (var0.z * var14 - var0.z * var5) / var6;
      if ((var9 * var13 - var10 * var12) * (var4.x - var1.x) + (var10 * var11 - var8 * var13) * (var4.y - var1.y) + (var8 * var12 - var9 * var11) * (var4.z - var1.z) < 0.0F) {
         return false;
      } else {
         var8 = var2.x - var3.x;
         var9 = var2.y - var3.y;
         var10 = var2.z - var3.z;
         if ((var9 * var13 - var10 * var12) * (var4.x - var3.x) + (var10 * var11 - var8 * var13) * (var4.y - var3.y) + (var8 * var12 - var9 * var11) * (var4.z - var3.z) < 0.0F) {
            return false;
         } else {
            var8 = var1.x - var2.x;
            var9 = var1.y - var2.y;
            var10 = var1.z - var2.z;
            return !((var9 * var13 - var10 * var12) * (var4.x - var2.x) + (var10 * var11 - var8 * var13) * (var4.y - var2.y) + (var8 * var12 - var9 * var11) * (var4.z - var2.z) < 0.0F);
         }
      }
   }

   public static final int SegmentPlane(crlV4 var0, crlV4 var1, crlPlane var2, crlV4 var3) {
      float var4 = var1.x - var0.x;
      float var5 = var1.y - var0.y;
      float var6 = var1.z - var0.z;
      float var7;
      if ((var7 = (var2.mDot - (var2.mNormalX * var0.x + var2.mNormalY * var0.y + var2.mNormalZ * var0.z)) / (var2.mNormalX * var4 + var2.mNormalY * var5 + var2.mNormalZ * var6)) >= -1.0F && var7 <= 1.0F) {
         var4 *= var7;
         var5 *= var7;
         var6 *= var7;
         var3.x = var0.x + var4;
         var3.y = var0.y + var5;
         var3.z = var0.z + var6;
         return 1;
      } else {
         return 0;
      }
   }

   public static final int rayPlane(crlV4 var0, crlV4 var1, crlV4 var2, float var3, crlV4 var4) {
      float var5 = var1.x - var0.x;
      float var6 = var1.y - var0.y;
      float var7 = var1.z - var0.z;
      float var8;
      if ((var8 = (var3 - (var2.x * var0.x + var2.y * var0.y + var2.z * var0.z)) / (var2.x * var5 + var2.y * var6 + var2.z * var7)) >= 0.0F) {
         var5 *= var8;
         var6 *= var8;
         var7 *= var8;
         var4.x = var0.x + var5;
         var4.y = var0.y + var6;
         var4.z = var0.z + var7;
         return 1;
      } else {
         return 0;
      }
   }

   public static final float distPointPlane(crlV4 var0, crlV4 var1, float var2) {
      return (var1.x * var0.x + var1.y * var0.y + var1.z * var0.z - var2) / (var1.x * var1.x + var1.y * var1.y + var1.z * var1.z);
   }

   public static boolean TestOBBOBB(crlOBB var0, crlOBB var1) {
      float var2 = var0.mOrientation0X;
      float var3 = var0.mOrientation0Y;
      float var7 = var0.mOrientation0Z;
      float var9 = var0.mOrientation1X;
      float var10 = var0.mOrientation1Y;
      float var11 = var0.mOrientation1Z;
      float var12 = var0.mOrientation2X;
      float var19 = var0.mOrientation2Y;
      float var20 = var0.mOrientation2Z;
      float var21 = var1.mOrientation0X;
      float var22 = var1.mOrientation0Y;
      float var23 = var1.mOrientation0Z;
      float var24 = var1.mOrientation1X;
      float var25 = var1.mOrientation1Y;
      float var26 = var1.mOrientation1Z;
      float var27 = var1.mOrientation2X;
      float var28 = var1.mOrientation2Y;
      float var29 = var1.mOrientation2Z;
      float var30 = var0.mDimensionsX;
      float var31 = var0.mDimensionsY;
      float var32 = var0.mDimensionsZ;
      float var33 = var1.mDimensionsX;
      float var34 = var1.mDimensionsY;
      float var35 = var1.mDimensionsZ;
      float var4 = var2 * var21 + var3 * var22 + var7 * var23;
      float var5 = var2 * var24 + var3 * var25 + var7 * var26;
      float var6 = var2 * var27 + var3 * var28 + var7 * var29;
      float var13 = var1.mCentreX - var0.mCentreX;
      float var14 = var1.mCentreY - var0.mCentreY;
      float var15 = var1.mCentreZ - var0.mCentreZ;
      float var37 = var13 * var2 + var14 * var3 + var15 * var7;
      var2 = var13 * var9 + var14 * var10 + var15 * var11;
      var3 = var13 * var12 + var14 * var19 + var15 * var20;
      var13 = (var4 < 0.0F ? -var4 : var4) + 0.1F;
      var14 = (var5 < 0.0F ? -var5 : var5) + 0.1F;
      var15 = (var6 < 0.0F ? -var6 : var6) + 0.1F;
      float var36 = var30 + var33 * var13 + var34 * var14 + var35 * var15;
      if ((var37 < 0.0F ? -var37 : var37) > var36) {
         return false;
      } else {
         var7 = var9 * var21 + var10 * var22 + var11 * var23;
         float var8 = var9 * var24 + var10 * var25 + var11 * var26;
         var9 = var9 * var27 + var10 * var28 + var11 * var29;
         float var16 = (var7 < 0.0F ? -var7 : var7) + 0.1F;
         float var17 = (var8 < 0.0F ? -var8 : var8) + 0.1F;
         float var18 = (var9 < 0.0F ? -var9 : var9) + 0.1F;
         var36 = var31 + var33 * var16 + var34 * var17 + var35 * var18;
         if ((var2 < 0.0F ? -var2 : var2) > var36) {
            return false;
         } else {
            var10 = var12 * var21 + var19 * var22 + var20 * var23;
            var11 = var12 * var24 + var19 * var25 + var20 * var26;
            var12 = var12 * var27 + var19 * var28 + var20 * var29;
            var19 = (var10 < 0.0F ? -var10 : var10) + 0.1F;
            var20 = (var11 < 0.0F ? -var11 : var11) + 0.1F;
            var21 = (var12 < 0.0F ? -var12 : var12) + 0.1F;
            var36 = var32 + var33 * var19 + var34 * var20 + var35 * var21;
            if ((var3 < 0.0F ? -var3 : var3) > var36) {
               return false;
            } else {
               var36 = var30 * var13 + var31 * var16 + var32 * var19 + var33;
               if (((var22 = var37 * var4 + var2 * var7 + var3 * var10) < 0.0F ? -var22 : var22) > var36) {
                  return false;
               } else {
                  var36 = var30 * var14 + var31 * var17 + var32 * var20 + var34;
                  if (((var22 = var37 * var5 + var2 * var8 + var3 * var11) < 0.0F ? -var22 : var22) > var36) {
                     return false;
                  } else {
                     var36 = var30 * var15 + var31 * var18 + var32 * var21 + var35;
                     if (((var22 = var37 * var6 + var2 * var9 + var3 * var12) < 0.0F ? -var22 : var22) > var36) {
                        return false;
                     } else {
                        var36 = var31 * var19 + var32 * var16 + var34 * var15 + var35 * var14;
                        if (((var22 = var3 * var7 - var2 * var10) < 0.0F ? -var22 : var22) > var36) {
                           return false;
                        } else {
                           var36 = var31 * var20 + var32 * var17 + var33 * var15 + var35 * var13;
                           if (((var22 = var3 * var8 - var2 * var11) < 0.0F ? -var22 : var22) > var36) {
                              return false;
                           } else {
                              var36 = var31 * var21 + var32 * var18 + var33 * var14 + var34 * var13;
                              if (((var22 = var3 * var9 - var2 * var12) < 0.0F ? -var22 : var22) > var36) {
                                 return false;
                              } else {
                                 var36 = var30 * var19 + var32 * var13 + var34 * var18 + var35 * var17;
                                 if (((var22 = var37 * var10 - var3 * var4) < 0.0F ? -var22 : var22) > var36) {
                                    return false;
                                 } else {
                                    var36 = var30 * var20 + var32 * var14 + var33 * var18 + var35 * var16;
                                    if (((var22 = var37 * var11 - var3 * var5) < 0.0F ? -var22 : var22) > var36) {
                                       return false;
                                    } else {
                                       var36 = var30 * var21 + var32 * var15 + var33 * var17 + var34 * var16;
                                       if (((var22 = var37 * var12 - var3 * var6) < 0.0F ? -var22 : var22) > var36) {
                                          return false;
                                       } else {
                                          var36 = var30 * var16 + var31 * var13 + var34 * var21 + var35 * var20;
                                          if (((var22 = var2 * var4 - var37 * var7) < 0.0F ? -var22 : var22) > var36) {
                                             return false;
                                          } else {
                                             var36 = var30 * var17 + var31 * var14 + var33 * var21 + var35 * var19;
                                             if (((var22 = var2 * var5 - var37 * var8) < 0.0F ? -var22 : var22) > var36) {
                                                return false;
                                             } else {
                                                var36 = var30 * var18 + var31 * var15 + var33 * var20 + var34 * var19;
                                                return !(((var22 = var2 * var6 - var37 * var9) < 0.0F ? -var22 : var22) > var36);
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static float a(crlV4 var0, crlV4 var1, crlV4 var2) {
      return (var0.x - var2.x) * (var1.z - var2.z) - (var0.z - var2.z) * (var1.x - var2.x);
   }

   public static boolean Test2DSegmentSegment(crlV4 var0, crlV4 var1, crlV4 var2, crlV4 var3, crlV4 var4) {
      float var5 = a(var0, var1, var3);
      float var6 = a(var0, var1, var2);
      if (var5 * var6 < 0.0F) {
         float var7;
         float var8 = (var7 = a(var2, var3, var0)) + var6 - var5;
         if (var7 * var8 < 0.0F) {
            var7 /= var7 - var8;
            var4.sub(var1, var0);
            var4.mul(var7);
            var4.addEq(var0);
            return true;
         }
      }

      return false;
   }

   public static boolean raySphere(crlV4 var0, crlV4 var1, crlV4 var2) {
      return raySphere(var0, var1, var2, (crlV4)null);
   }

   public static boolean raySphere(crlV4 var0, crlV4 var1, crlV4 var2, crlV4 var3) {
      float var4 = var0.x - var2.x;
      float var5 = var0.y - var2.y;
      float var7 = var0.z - var2.z;
      float var6 = var4 * var4 + var5 * var5 + var7 * var7 - 2025.0F;
      if ((var7 = var4 * var1.x + var5 * var1.y + var7 * var1.z) > 0.0F) {
         return false;
      } else if ((var4 = (var7 *= var7) - var6) < 0.0F) {
         return false;
      } else {
         if ((var7 = -var7 - var4) < 0.0F) {
            var7 = 0.0F;
         }

         if (var3 != null) {
            var3.x = var1.x;
            var3.y = var1.y;
            var3.z = var1.z;
            if (var7 > 0.0F) {
               var3.x *= var7;
               var3.y *= var7;
               var3.z *= var7;
            }

            var3.x += var0.x;
            var3.y += var0.y;
            var3.z += var0.z;
         }

         return true;
      }
   }

   public static final int IntersectLineTriangle(crlV4 var0, crlV4 var1, crlV4 var2, crlV4 var3, crlV4 var4, float var5, float var6, float var7) {
      var7 = var1.x - var0.x;
      float var8 = var1.y - var0.y;
      float var17 = var1.z - var0.z;
      float var9 = var3.x - var0.x;
      float var10 = var3.y - var0.y;
      float var11 = var3.z - var0.z;
      var6 = var4.x - var0.x;
      float var12 = var4.y - var0.y;
      float var13 = var4.z - var0.z;
      var5 = var8 * var13 - var17 * var12;
      float var14 = var17 * var6 - var7 * var13;
      float var15 = var7 * var12 - var8 * var6;
      if (var5 * var9 + var14 * var10 + var15 * var11 < 0.0F) {
         return 0;
      } else {
         float var18 = var2.x - var0.x;
         float var19 = var2.y - var0.y;
         float var16 = var2.z - var0.z;
         var5 = var8 * var16 - var17 * var19;
         var14 = var17 * var18 - var7 * var16;
         var15 = var7 * var19 - var8 * var18;
         if (var5 * var6 + var14 * var12 + var15 * var13 < 0.0F) {
            return 0;
         } else {
            var5 = var8 * var11 - var17 * var10;
            var14 = var17 * var9 - var7 * var11;
            var15 = var7 * var10 - var8 * var9;
            return var5 * var18 + var14 * var19 + var15 * var16 < 0.0F ? 0 : 1;
         }
      }
   }

   public static final boolean LineQuad(crlV4 var0, crlV4 var1, crlV4 var2, crlV4 var3, crlV4 var4, crlV4 var5, crlV4 var6) {
      float var7 = var1.x - var0.x;
      float var8 = var1.y - var0.y;
      float var20 = var1.z - var0.z;
      float var9 = var2.x - var0.x;
      float var10 = var2.y - var0.y;
      float var11 = var2.z - var0.z;
      float var12 = var3.x - var0.x;
      float var13 = var3.y - var0.y;
      float var14 = var3.z - var0.z;
      float var15 = var4.x - var0.x;
      float var16 = var4.y - var0.y;
      float var17 = var4.z - var0.z;
      float var18 = var16 * var20 - var17 * var8;
      var17 = var17 * var7 - var15 * var20;
      var15 = var15 * var8 - var16 * var7;
      float var19;
      float var21;
      if ((var16 = var9 * var18 + var10 * var17 + var11 * var15) >= 0.0F) {
         if ((var19 = -(var12 * var18 + var13 * var17 + var14 * var15)) < 0.0F) {
            return false;
         }

         var18 = var8 * var14 - var20 * var13;
         var17 = var20 * var12 - var7 * var14;
         var15 = var7 * var13 - var8 * var12;
         if ((var20 = var18 * var9 + var17 * var10 + var15 * var11) < 0.0F) {
            return false;
         }

         var21 = 1.0F / (var19 + var16 + var20);
         var19 *= var21;
         var16 *= var21;
         var20 *= var21;
         var2.x *= var19;
         var2.y *= var19;
         var2.z *= var19;
         var3.x *= var16;
         var3.y *= var16;
         var3.z *= var16;
         var4.x *= var20;
         var4.y *= var20;
         var4.z *= var20;
         var6.x += var2.x;
         var6.y += var2.y;
         var6.z += var2.z;
         var6.x += var3.x;
         var6.y += var3.y;
         var6.z += var3.z;
         var6.x += var4.x;
         var6.y += var4.y;
         var6.z += var4.z;
      } else {
         var12 = var5.x - var0.x;
         var13 = var5.y - var0.y;
         var14 = var5.z - var0.z;
         if ((var19 = var12 * var18 + var13 * var17 + var14 * var15) < 0.0F) {
            return false;
         }

         var18 = var8 * var11 - var20 * var10;
         var17 = var20 * var9 - var7 * var11;
         var15 = var7 * var10 - var8 * var9;
         if ((var20 = var18 * var12 + var17 * var13 + var15 * var14) < 0.0F) {
            return false;
         }

         var16 = -var16;
         var21 = 1.0F / (var19 + var16 + var20);
         var19 *= var21;
         var16 *= var21;
         var20 *= var21;
         var2.x *= var19;
         var2.y *= var19;
         var2.z *= var19;
         var3.x *= var16;
         var3.y *= var16;
         var3.z *= var16;
         var4.x *= var20;
         var4.y *= var20;
         var4.z *= var20;
         var6.x += var2.x;
         var6.y += var2.y;
         var6.z += var2.z;
         var6.x += var3.x;
         var6.y += var3.y;
         var6.z += var3.z;
         var6.x += var4.x;
         var6.y += var4.y;
         var6.z += var4.z;
      }

      return true;
   }

   public static boolean LineIntersect2D(crlV4 var0, crlV4 var1, crlV4 var2, crlV4 var3, crlV4 var4) {
      float var5 = var0.x;
      float var11 = var0.z;
      float var6 = var1.x;
      float var12 = var1.z;
      float var7 = var2.x;
      float var13 = var2.z;
      float var8 = var3.x;
      float var14 = var3.z;
      float var9;
      if (var6 - var5 != 0.0F) {
         var9 = (var12 - var11) / (var6 - var5);
      } else {
         var9 = Float.MAX_VALUE;
      }

      float var10;
      if (var8 - var7 != 0.0F) {
         var10 = (var14 - var13) / (var8 - var7);
      } else {
         var10 = Float.MAX_VALUE;
      }

      var14 = -1.0F;
      var8 = -1.0F;
      var11 -= var9 * var5;
      var13 -= var10 * var7;
      var5 = 1.0F / (var9 * var8 - var10 * var14);
      var4.x = (var14 * var13 - var8 * var11) * var5;
      var4.z = (var10 * var11 - var9 * var13) * var5;
      return true;
   }
}
