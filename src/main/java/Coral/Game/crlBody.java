package Coral.Game;

import Coral.Math.Float.crlM44;
import Coral.Math.Float.crlQ4;
import Coral.Math.Float.crlV4;

public class crlBody {
   float fMass;
   crlM44 mInertia;
   crlM44 mInertiaInverse;
   crlV4 vPosition;
   crlV4 vVelocity;
   crlV4 vVelocityBody;
   crlV4 vAcceleration;
   crlV4 vAngularAcceleration;
   crlV4 vAngularVelocity;
   crlV4 vEulerAngles;
   float fSpeed;
   crlQ4 qOrientation;
   crlV4 vForces;
   crlV4 vMoments;
   crlM44 mIeInverse;
   crlV4 vAngularVelocityGlobal;
   crlV4 vAngularAccelerationGlobal;
   float fRadius;
   crlV4[] vVertexList = new crlV4[8];
}
