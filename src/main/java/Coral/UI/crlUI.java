package Coral.UI;

import Coral.crlCanvas;
import Coral.Graphics2D.crlFont;
import Coral.Util.crlResourceManager;
import Coral.Util.crlString;
import Coral.Util.crlUtil;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class crlUI {
   public static final int gUIheader = 0;
   public static final int gUImiddle = 1;
   public static final int gUIfooter = 2;
   public static final int gUIfontSmall = 0;
   public static final int gUIfontMedium = 1;
   public static final int gUIfontLarge = 2;
   public static final int gUInullImage = 0;
   public static final int gCreditScrollSpeed = 1;
   public static final int gDefaultWrappedTextWidth = 260;
   public static short[] sin_table = new short[450];
   private static byte[] a = new byte[16];
   protected static int[] _mUIdefs;
   protected static int _mSplashTimer;
   protected static int _mUIdsgn;
   protected static int _mUIdsgnSave;
   protected static int _mUIoption;
   protected static int _mUIlastOption;
   protected static int _mUIoptionSave;
   protected static int _mUItransDir;
   protected static float _mUItransProgress;
   protected crlCanvas _mCanvas;
   protected static int mUImaxOpt;
   protected static int _mUIdsgnFlash;
   protected static int[] _mUIdsgnCT;
   protected static int[] _mUIdsgnXo;
   protected static byte[] _mUIdsgnCTm;
   protected static byte[] _mUIdsgnXc;
   protected static int[][] _mUIdsgnLayout;
   protected static int[] _mUIoptionStore;
   protected static int _AYS_NO;
   protected static int _AYS_YES;
   protected static boolean _mUIup;
   protected static boolean _mUIdown;
   protected static int _mUIiLine;
   protected static int _mUIwidth;
   protected static int _mUIheight;
   protected static int _mUIwidthCent;
   protected static int _mUIheightCent;
   protected static int _mBackgroundColour;
   private static int b;
   public static int mLocale;
   public static int mCurrentFont;
   protected static int _mSaveFont;
   public static crlFont[] mFont;
   protected static Image _mUImenuback;
   protected static Image[] _mUIimages;
   protected static int[] _mUIimagesH;
   protected static int _mUIimagesN = 0;
   protected byte[] _mWorkBuffer;
   protected byte[] _mCreatedString;
   private static final String[] c = new String[]{"English", "Français", "Italiano", "Deutsch", "Español", "Dutch", "Portuguese"};
   private static final String[] d = new String[]{"Enable Audio?", "Activer l'Audio?", "Permetta l'Audio?", "Erlauben Sie Ton?", "¿Permitir Sonido?", "", ""};
   private static final String[] e = new String[]{"Yes", "Oui", "Sì", "Ja", "Sí", "", ""};
   private static final String[] f = new String[]{"No", "Non", "No", "Nein", "No", "", ""};
   private static final String[] g = new String[]{"SELECT", "SÉLECT.", "SEL.", "AUSW.", "SELEC.", "", ""};
   private static final String[] h = new String[]{"EXIT", "QUITTER", "ESCI", "BEENDEN", "SALIR", "", ""};
   public static final short[] tsin = new short[]{0, 4, 8, 13, 17, 22, 26, 31, 35, 40, 44, 48, 53, 57, 61, 66, 70, 74, 79, 83, 87, 91, 95, 100, 104, 108, 112, 116, 120, 124, 128, 131, 135, 139, 143, 146, 150, 154, 157, 161, 164, 167, 171, 174, 177, 181, 184, 187, 190, 193, 196, 198, 201, 204, 207, 209, 212, 214, 217, 219, 221, 223, 226, 228, 230, 232, 233, 235, 237, 238, 240, 242, 243, 244, 246, 247, 248, 249, 250, 251, 252, 252, 253, 254, 254, 255, 255, 255, 255, 255, 256};

   public void open(crlCanvas var1, int var2, int[][] var3, int var4) {
      this._mCanvas = var1;
      _mUIwidth = crlCanvas.getGameWidth();
      _mUIheight = crlCanvas.getGameHeight();
      _mUIwidthCent = _mUIwidth / 2;
      _mUIheightCent = _mUIheight / 2;
      _mUIimagesN = var2;
      _mUIimages = new Image[var2];
      _mUIimagesH = new int[_mUIimagesN];
      _mUIdsgnLayout = var3;
      _mSplashTimer = -1;
      _mBackgroundColour = 0;
      _mUIlastOption = -1;
      _mUItransDir = 0;
      _mUItransProgress = 0.0F;
      (_mUIdefs = new int[12])[0] = 0;
      _mUIdefs[1] = 16777215;
      _mUIdefs[11] = 16776960;
      _mUIdefs[2] = 16777215;
      _mUIdefs[3] = 16777215;
      _mUIdefs[4] = 4;
      _mUIdefs[5] = 3;
      _mUIdefs[6] = var4;
      _mUIdefs[7] = 0;
      _mUIdefs[8] = 16777215;
      _mUIdefs[9] = 33008;
      _mUIdefs[10] = 5263440;
      mCurrentFont = 0;
      mUImaxOpt = _mUIdefs[6];

      for(int var5 = 0; var5 < 90; ++var5) {
         sin_table[var5] = tsin[var5];
         sin_table[var5 + 90] = tsin[90 - var5];
         sin_table[var5 + 180] = (short)(-tsin[var5]);
         sin_table[var5 + 270] = (short)(-tsin[90 - var5]);
         sin_table[var5 + 360] = tsin[var5];
      }

      _mUIdsgnCT = new int[mUImaxOpt + 1];
      _mUIdsgnXo = new int[mUImaxOpt + 1];
      _mUIdsgnCTm = new byte[mUImaxOpt + 1];
      _mUIdsgnXc = new byte[mUImaxOpt + 1];
      _mUIoptionStore = new int[var3.length];
      _mUIdsgnCT[_mUIdefs[6]] = _mUIdefs[1];
      this.b();
      _mUIoption = 0;
      _mUIdsgnCTm[0] = 1;
      _mUIdsgn = 0;
      this._mWorkBuffer = new byte[512];
      this._mCreatedString = new byte[512];
   }

   public void close() {
      this._mWorkBuffer = null;
      this._mCreatedString = null;
      _mUIoptionStore = null;
      _mUIdefs = null;
      _mUIdsgnCT = null;
      _mUIdsgnXo = null;
      _mUIdsgnCTm = null;
      _mUIdsgnXc = null;

      for(int var1 = 0; var1 < _mUIimagesN; ++var1) {
         _mUIimages[var1] = null;
      }

      _mUIimagesH = null;
      mFont = null;
   }

   public void update(int var1) {
      int[] var3 = _mUIdsgnLayout[_mUIdsgn];
      if ((_mUIdsgnLayout[_mUIdsgn][1] & 16384) == 0 || !this.keyUpdate(var1)) {
         if (var1 == 2 && _mUIdown) {
            _mUIiLine -= 4;
         }

         if (var1 == 1 && _mUIup) {
            _mUIiLine += 4;
         }

         if (crlCanvas.mPadDB == 1) {
            byte var4 = 1;
            byte var5 = 2;
            boolean var6 = _mUIdsgnLayout[_mUIdsgn][10] != 4;
            if (_mUIdsgnLayout[_mUIdsgn][10] == 2) {
               var4 = 4;
               var5 = 8;
            }

            if (var1 == var4 & var6) {
               if (_mUIoption != 0) {
                  _mUIlastOption = _mUIoption;
                  if ((_mUIdsgnLayout[_mUIdsgn][1] & 1024) != 0) {
                     if (_mUItransDir != -1) {
                        if (_mUItransDir == 1) {
                           _mUItransProgress = 10.0F - _mUItransProgress;
                        } else {
                           _mUItransProgress = 0.0F;
                        }

                        _mUItransDir = -1;
                        _mUIdsgnCTm[_mUIoption--] = 2;
                        _mUIdsgnCTm[_mUIoption] = 1;
                     }
                  } else {
                     _mUIdsgnCTm[_mUIoption--] = 2;
                     _mUIdsgnCTm[_mUIoption] = 1;
                  }
               }
            } else if (var1 == var5 & var6) {
               if (_mUIoption < _mUIdsgnLayout[_mUIdsgn][8] - 1) {
                  _mUIlastOption = _mUIoption;
                  if ((_mUIdsgnLayout[_mUIdsgn][1] & 1024) != 0) {
                     if (_mUItransDir != 1) {
                        if (_mUItransDir == -1) {
                           _mUItransProgress = 10.0F - _mUItransProgress;
                        } else {
                           _mUItransProgress = 0.0F;
                        }

                        _mUItransDir = 1;
                        _mUIdsgnCTm[_mUIoption++] = 2;
                        _mUIdsgnCTm[_mUIoption] = 1;
                     }
                  } else {
                     _mUIdsgnCTm[_mUIoption++] = 2;
                     _mUIdsgnCTm[_mUIoption] = 1;
                  }
               }
            } else if ((var1 & 16) == 16 & var6) {
               if (var3[8] != 0) {
                  this.a(var3[12 + _mUIoption * 3]);
               } else if (var3[4] != 0) {
                  this.a(var3[4]);
               }
            } else if ((var1 & 256) == 256) {
               if (var3[3] != 0) {
                  if (var3[4] != 0) {
                     this.a(var3[4]);
                  } else {
                     this.a(var3[12 + _mUIoption * 3]);
                  }
               }
            } else if ((var1 & 512) == 512 && var3[5] != 0) {
               if (var3[6] != 0) {
                  this.a(var3[6]);
               } else {
                  this.a();
                  this.b();
               }
            }

            crlCanvas.mPadDB = 0;
         }
      }

      if (_mUItransDir != 0 && (_mUItransProgress += 2.0F) >= 10.0F) {
         _mUItransProgress = 0.0F;
         _mUItransDir = 0;
      }

      crlUI var9 = this;

      int var2;
      for(var2 = 0; var2 < mUImaxOpt; ++var2) {
         int var10;
         if (_mUIdsgnCTm[var2] == 1) {
            var10 = var9.scrollOffset(_mUIdsgnFlash);
            if ((_mUIdsgnFlash += 8) > 180) {
               _mUIdsgnFlash = 0;
            }

            _mUIdsgnCT[var2] = (var10 << 16) + (var10 << 8) & 16776960;
         } else if (_mUIdsgnCTm[var2] == 2) {
            if (_mUIdsgnCTm[var2] == _mUIdsgnCT[mUImaxOpt]) {
               _mUIdsgnCTm[var2] = 0;
               _mUIdsgnCT[var2] = _mUIdsgnCT[mUImaxOpt];
            } else {
               var10 = _mUIdsgnCT[var2] >> 16 & 255;
               int var11 = _mUIdsgnCT[var2] >> 8 & 255;
               int var12 = _mUIdsgnCT[var2] & 255;
               int var13 = _mUIdsgnCT[mUImaxOpt] >> 16 & 255;
               int var7 = _mUIdsgnCT[mUImaxOpt] >> 8 & 255;
               int var8 = _mUIdsgnCT[mUImaxOpt] & 255;
               if (var10 < var13) {
                  var10 += 16;
                  if (var10 > var13) {
                     var10 = var13;
                  }
               } else if (var10 > var13 && (var10 -= 16) < var13) {
                  var10 = var13;
               }

               if (var11 < var7) {
                  var11 += 16;
                  if (var11 > var7) {
                     var11 = var7;
                  }
               } else if (var11 > var7 && (var11 -= 16) < var7) {
                  var11 = var7;
               }

               if (var12 < var8) {
                  var12 += 16;
                  if (var12 > var8) {
                     var12 = var8;
                  }
               } else if (var12 > var8 && (var12 -= 16) < var8) {
                  var12 = var8;
               }

               _mUIdsgnCT[var2] = (var10 << 16) + (var11 << 8) + var12;
            }
         }
      }

      for(var2 = 0; var2 < mUImaxOpt; ++var2) {
         if (_mUIdsgnXc[var2] == 0) {
            if (_mUIdsgnXo[var2] < 90) {
               int[] var10000 = _mUIdsgnXo;
               var10000[var2] += 5;
            }
         } else {
            --_mUIdsgnXc[var2];
         }
      }

      if (this.getRenderMode() == 1) {
         crlCanvas._mTriggerPaintUI = true;
      }

   }

   protected boolean renderTransition(Graphics var1) {
      if (_mUItransDir != 0 && (_mUIdsgnLayout[_mUIdsgn][1] & 1024) != 0) {
         boolean var2 = (_mUIdsgnLayout[_mUIdsgn][1] & 2048) == 2048;
         int var3;
         if ((_mUIdsgnLayout[_mUIdsgn][1] & 5121) == 5121) {
            this.drawSurround(var1);
            var3 = _mUIoption;
            _mUIoption = _mUIlastOption;
            var1.translate((int)((float)(-_mUItransDir) * _mUItransProgress * (float)_mUIwidth / 10.0F), 0);
            this.drawOptions(var1);
            if (!var2) {
               this.drawPanel(var1);
            }

            _mUIoption = var3;
            var1.translate(_mUItransDir * _mUIwidth, 0);
            this.drawOptions(var1);
            if (!var2) {
               this.drawPanel(var1);
            } else {
               var1.translate(-var1.getTranslateX(), 0);
               this.drawPanel(var1);
            }
         } else if ((_mUIdsgnLayout[_mUIdsgn][1] & 9217) == 9217) {
            var3 = _mUIoption;
            _mUIoption = _mUIlastOption;
            var1.translate(0, (int)((float)(-_mUItransDir) * _mUItransProgress * (float)_mUIheight / 10.0F));
            this.drawOptions(var1);
            if (!var2) {
               this.drawPanel(var1);
            }

            _mUIoption = var3;
            var1.translate(0, _mUItransDir * _mUIheight);
            this.drawOptions(var1);
            if (!var2) {
               this.drawPanel(var1);
            } else {
               var1.translate(0, -var1.getTranslateY());
               this.drawPanel(var1);
            }

            this.drawSurround(var1);
         }

         var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
         return true;
      } else {
         return false;
      }
   }

   public void render(Graphics var1) {
      if (crlCanvas._mTriggerPaintUI) {
         var1.setColor(_mBackgroundColour);
         var1.fillRect(0, 0, _mUIwidth, _mUIheight);
         this.drawBackground(var1);
         if (!this.renderTransition(var1)) {
            crlUI var2;
            (var2 = this).drawSurround(var1);
            var2.drawOptions(var1);
            var2.drawPanel(var1);
         }

         crlCanvas._mTriggerPaintUI = false;
      }

   }

   public void drawTextCentered(Graphics var1, crlString var2, int var3, int var4) {
      mFont[mCurrentFont].printCentred(var1, _mUIwidth, var3, var2.get());
   }

   public static int drawChar(Graphics var0, int var1, int var2, int var3, int var4) {
      return mFont[mCurrentFont].printChar(var0, var2, var3, (byte)var1);
   }

   public void drawScrollText(Graphics var1, byte[] var2, int var3, int var4) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      int var8;
      for(var8 = 0; var2[var6] != 0; ++var6) {
         if (var2[var6] == 124 || var2[var6] == 0) {
            System.arraycopy(var2, var5, this._mCreatedString, 0, var6 - var5);
            this._mCreatedString[var6 - var5] = 0;
            var3 = mFont[mCurrentFont].printWrapped(var1, _mUIwidth, var3, this._mCreatedString, this._mWorkBuffer, 260, false);
            var5 = var6;
            if (mFont[mCurrentFont].mLongestLineWidth > var7) {
               var7 = mFont[mCurrentFont].mLongestLineWidth;
            }

            ++var8;
         }
      }

      mFont[mCurrentFont].mLongestLineWidth = var7;
      mFont[mCurrentFont].mLinesDrawn = var8;
      var1.setColor(16777200);
      int var9 = (_mUIwidth >> 1) + 5 + var4;
      int var10 = _mUIheight - 10;
      if (var3 > crlFont.mClipBottom) {
         for(var6 = 0; var6 < 4; ++var6) {
            var1.drawLine(var9 - 10 + var6, var10 + 4 - var6, var9 - 10 - var6, var10 + 4 - var6);
         }

         _mUIdown = true;
      } else {
         _mUIdown = false;
      }

      if (_mUIiLine >= 0) {
         _mUIup = false;
      } else {
         for(var6 = 0; var6 < 4; ++var6) {
            var1.drawLine(var9 + var6, var10 + var6, var9 - var6, var10 + var6);
         }

         _mUIup = true;
      }
   }

   public void drawBackground(Graphics var1) {
      if (_mUIimages[0] != null) {
         var1.drawImage(_mUIimages[0], 0, 0, 0);
      }

      if (_mUIimages[1] != null) {
         var1.drawImage(_mUIimages[1], 0, _mUIimagesH[0], 0);
      }

      if (_mUIimages[2] != null) {
         var1.drawImage(_mUIimages[2], 0, _mUIheight - _mUIimagesH[2], 0);
      }

   }

   public void setFontSize(int var1) {
      mCurrentFont = var1;
   }

   public int getFontHeight(int var1) {
      return mFont[var1].getHeight();
   }

   public void pushFont() {
      _mSaveFont = mCurrentFont;
   }

   public void popFont() {
      mCurrentFont = _mSaveFont;
   }

   public int getWidth(crlString var1) {
      return mFont[mCurrentFont].getWidth(var1.get());
   }

   public void postLoadSetup() {
   }

   public final int getCurrentOptionData(int var1) {
      return _mUIdsgnLayout[_mUIdsgn][var1 + 11 + _mUIoption * 3];
   }

   public final int getMode() {
      return _mUIdsgnLayout[_mUIdsgn][0];
   }

   public final int getRenderMode() {
      return _mUIdsgnLayout[_mUIdsgn][1] & 1;
   }

   private final void a() {
      _mUIdsgn = _mUIdsgnSave;
      _mUIoption = _mUIoptionSave;
   }

   public final void pushMode(int var1) {
      _mUIdsgnSave = _mUIdsgn;
      _mUIoptionSave = _mUIoption;
      this.setMode(var1);
   }

   public final void popMode() {
      this.a();
      this.setMode(_mUIdsgnLayout[_mUIdsgn][0]);
   }

   public void setMode(int var1) {
      _mUIoptionStore[_mUIdsgn] = _mUIoption;
      var1 = var1;
      boolean var4 = false;
      int var2 = _mUIdsgnLayout.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         if (_mUIdsgnLayout[var3][0] == var1) {
            _mUIdsgn = var3;
            var4 = true;
            break;
         }
      }

      if ((_mUIdsgnLayout[_mUIdsgn][1] & 4) == 0) {
         _mUIoption = _mUIoptionStore[_mUIdsgn];
      } else {
         _mUIoption = 0;
      }

      _mUIiLine = 0;
      _mUIup = false;
      _mUIdown = false;
      b = _mUIheight - _mUIimagesH[2] - 32;
      crlCanvas._mTriggerPaintUI = true;
   }

   private final void b() {
      byte var2 = 2;

      for(int var1 = 0; var1 < mUImaxOpt; ++var1) {
         _mUIdsgnCT[var1] = _mUIdsgnCT[mUImaxOpt];
         _mUIdsgnCTm[var1] = 0;
         _mUIdsgnXo[var1] = 20;
         _mUIdsgnXc[var1] = var2;
         var2 = (byte)(var2 + 4);
      }

      _mUIdsgnCTm[_mUIoption] = 1;
   }

   public final int getMarginX() {
      return _mUIdefs[4];
   }

   public final int getMarginY() {
      return _mUIdefs[5];
   }

   public final int drawNumber(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      crlFont var7 = mFont[var6];
      var5 = 0;
      var6 = 0;
      var2 = var2;

      do {
         a[var6++] = (byte)(var2 % 10 + 48);
      } while((var2 /= 10) != 0);

      do {
         int var10003 = var3 + var5;
         --var6;
         var5 += var7.printChar(var1, var10003, var4, a[var6]);
      } while(var6 > 0);

      var7.mLastLineWidth = var5;
      return var5;
   }

   public final void drawTime(Graphics var1, long var2, int var4, int var5, int var6) {
      crlFont var14 = mFont[var6];
      long var8 = (var2 /= 10L) / 6000L;
      long var10 = var2 / 100L - var8 * 60L;
      long var12 = var2 - var10 * 100L - var8 * 6000L;
      int var15 = var4;
      boolean var16 = false;
      var8 %= 100L;
      var4 = var14.printChar(var1, var15, var5, (byte)((int)(var8 / 10L + 48L)));
      var8 %= 10L;
      var15 += var4;
      var4 = var14.printChar(var1, var15, var5, (byte)((int)(var8 + 48L)));
      var15 += var4;
      var4 = var14.printChar(var1, var15, var5, (byte)58);
      var15 += var4;
      var4 = var14.printChar(var1, var15, var5, (byte)((int)(var10 / 10L + 48L)));
      var10 %= 10L;
      var15 += var4;
      var4 = var14.printChar(var1, var15, var5, (byte)((int)(var10 + 48L)));
      var15 += var4;
      var4 = var14.printChar(var1, var15, var5, (byte)46);
      var15 += var4;
      var4 = var14.printChar(var1, var15, var5, (byte)((int)(var12 / 10L + 48L)));
      var12 %= 10L;
      var15 += var4;
      var14.printChar(var1, var15, var5, (byte)((int)(var12 + 48L)));
   }

   public final boolean stdSplash(Graphics var1, Image var2, int var3, int var4, int var5, boolean var6) {
      boolean var7 = false;
      if (_mSplashTimer == -1) {
         _mSplashTimer = var4;
         crlCanvas._mTriggerPaintUI = true;
      }

      if (--_mSplashTimer >= 0) {
         if (crlCanvas._mTriggerPaintUI) {
            crlCanvas._mTriggerPaintUI = false;
            var1.setColor(var3);
            var1.fillRect(0, 0, _mUIwidth, _mUIheight);
            var3 = _mUIwidth - var2.getWidth() >> 1;
            var4 = _mUIheight - var2.getHeight() >> 1;
            var1.drawImage(var2, var3, var4, 0);
         }
      } else {
         var7 = true;
      }

      return var7;
   }

   public boolean stdLoading(Graphics var1, Image var2, int var3, int var4, int var5) {
      int var8 = this.getMarginX();
      int var6 = _mUIheight / 2;
      int var7 = _mUIwidth - var8 - var8;
      var1.setColor(_mUIdefs[0]);
      var1.fillRect(0, 0, _mUIwidth, _mUIheight);
      if (var2 != null) {
         if (var3 == -1) {
            var3 = _mUIwidth - var2.getWidth() >> 1;
         }

         if (var4 == -1) {
            var4 = var2.getHeight() >> 1;
         }

         var1.drawImage(var2, var3, var4, 0);
      }

      var1.setColor(_mUIdefs[8]);
      var1.drawRect(var8 - 1, var6 - 1, var7 + 1, 19);
      var1.setColor(_mUIdefs[9]);
      var1.fillRect(var8, var6, var7 * var5 / 100, 18);
      return false;
   }

   public final boolean stdLoading(Graphics var1, Image var2, int var3) {
      return this.stdLoading(var1, var2, -1, -1, var3);
   }

   public final int stdLanguage(Graphics var1, int var2, int var3) {
      byte var4 = -1;
      int var5 = crlUtil.findLSB(var2);
      int var6 = crlUtil.findHSB(var2);
      if (crlCanvas._mTriggerPaintUI) {
         crlCanvas._mTriggerPaintUI = false;
         Font var7;
         int var8 = (var7 = Font.getFont(64, 0, 8)).getHeight();
         var1.setColor(_mUIdefs[0]);
         var1.fillRect(0, 0, _mUIwidth, _mUIheight);
         int var9 = this.getMarginX();
         int var10 = _mUIwidth - (var9 + var9);
         int var11 = _mUIheightCent - 48;
         boolean var12 = false;
         var1.setFont(var7);

         for(int var14 = var5; var14 <= var6; ++var14) {
            if (crlUtil.isBitSet(var2, var14)) {
               int var13 = var1.getFont().stringWidth(c[var14]);
               if (mLocale == var14) {
                  var1.setColor(_mUIdefs[1]);
                  int var15 = var11 - 3;
                  var1.setColor(_mUIdefs[10]);
                  var1.fillRoundRect(var9 + 2, var15 + 2, var10, var8 + 4, 16, 16);
                  var1.setColor(_mUIdefs[8]);
                  var1.fillRoundRect(var9, var15, var10, var8 + 4, 16, 16);
                  var1.setColor(_mUIdefs[9]);
                  var1.fillRoundRect(var9 + 2, var15 + 2, var10 - 4, var8, 16, 16);
                  var1.setColor(_mUIdefs[11]);
               } else {
                  var1.setColor(_mUIdefs[1]);
               }

               var1.drawString(c[var14], _mUIwidth - var13 >> 1, var11, 0);
               var11 += var8 + 4;
            }
         }

         var11 = _mUIheight - var8 - this.getMarginY();
         var1.setColor(_mUIdefs[3]);
         var1.drawString(g[mLocale], this.getSKPositiveX(var1, g[mLocale]), var11, 0);
         var1.drawString(h[mLocale], this.getSKNegativeX(var1, h[mLocale]), var11, 0);
      }

      if (crlCanvas.mPadDB == 1) {
         if (var3 == 1) {
            crlCanvas.mPadDB = 0;
            if (mLocale > var5) {
               while(true) {
                  if (!crlUtil.isBitSet(var2, --mLocale)) {
                     continue;
                  }
               }
            }
         } else if (var3 == 2) {
            crlCanvas.mPadDB = 0;
            if (mLocale < var6) {
               while(!crlUtil.isBitSet(var2, ++mLocale)) {
               }
            }
         }
      }

      if ((var3 & 16) != 16 && (var3 & 256) != 256) {
         if ((var3 & 512) == 512) {
            crlCanvas.mPad = 0;
            crlCanvas.mPadDB = 0;
            var4 = 0;
         }
      } else {
         crlCanvas.mPad = 0;
         crlCanvas.mPadDB = 0;
         var4 = 1;
      }

      return var4;
   }

   public final int stdAudioEnable(Graphics var1, int var2) {
      byte var3 = -1;
      if (crlCanvas._mTriggerPaintUI) {
         crlCanvas._mTriggerPaintUI = false;
         Font var4;
         int var5 = (var4 = Font.getFont(64, 0, 8)).getHeight();
         var1.setColor(_mUIdefs[0]);
         var1.fillRect(0, 0, _mUIwidth, _mUIheight);
         int var6 = _mUIwidthCent - 32;
         int var7 = _mUIheightCent - 48;
         var1.setColor(_mUIdefs[10]);
         var1.fillRoundRect(var6 + 2, var7 + 2, 64, 64, 16, 16);
         var1.setColor(_mUIdefs[8]);
         var1.fillRoundRect(var6, var7, 64, 64, 16, 16);
         var1.setColor(_mUIdefs[9]);
         var1.fillRoundRect(var6 + 2, var7 + 2, 60, 60, 16, 16);
         var1.setColor(_mUIdefs[10]);
         var7 += 2;
         var1.fillArc(var6 + 12, var7 + 36, 16, 16, 0, 360);
         var1.fillArc(var6 + 36, var7 + 32, 16, 16, 0, 360);
         var1.fillRect(var6 + 24, var7 + 12, 4, 34);
         var1.fillRect(var6 + 24, var7 + 12, 24, 4);
         var1.fillRect(var6 + 48, var7 + 12, 4, 26);
         var1.setColor(_mUIdefs[8]);
         var6 -= 2;
         var7 -= 2;
         var1.fillArc(var6 + 12, var7 + 36, 16, 16, 0, 360);
         var1.fillArc(var6 + 36, var7 + 32, 16, 16, 0, 360);
         var1.fillRect(var6 + 24, var7 + 12, 4, 34);
         var1.fillRect(var6 + 24, var7 + 12, 24, 4);
         var1.fillRect(var6 + 48, var7 + 12, 4, 26);
         var7 += 72;
         var1.setFont(var4);
         var1.setColor(_mUIdefs[1]);
         int var8 = var1.getFont().stringWidth(d[mLocale]);
         var1.drawString(d[mLocale], _mUIwidth - var8 >> 1, var7, 0);
         var7 = _mUIheight - var5 - this.getMarginY();
         var1.setColor(_mUIdefs[3]);
         var1.drawString(e[mLocale], this.getSKPositiveX(var1, e[mLocale]), var7, 0);
         var1.drawString(f[mLocale], this.getSKNegativeX(var1, f[mLocale]), var7, 0);
      }

      if ((var2 & 16) != 16 && (var2 & 256) != 256) {
         if ((var2 & 512) == 512) {
            crlCanvas.mPad = 0;
            crlCanvas.mPadDB = 0;
            var3 = 0;
         }
      } else {
         crlCanvas.mPad = 0;
         crlCanvas.mPadDB = 0;
         var3 = 1;
      }

      return var3;
   }

   private final void a(int var1) {
      if (var1 >= 0) {
         this.pushMode(var1);
      } else {
         this.usrActionUI(var1);
      }

      this.b();
      _mUIlastOption = -1;
      _mUItransProgress = 0.0F;
      _mUItransDir = 0;
   }

   protected void usrActionUI(int var1) {
   }

   protected void usrDrawPanel(Graphics var1, int var2) {
   }

   protected void usrDrawOptions(Graphics var1, int[] var2) {
   }

   protected int scrollOffset(int var1) {
      return sin_table[var1];
   }

   protected void drawMenuBack(Graphics var1, int var2, int var3, int var4, int var5) {
      int var6 = var3 - 1;
      var1.setClip(var2, var6, var4, 1);
      var1.drawImage(_mUIimages[2], var2, var6, 0);
      ++var6;
      var1.setClip(var2, var3, var4, var5);

      for(var3 = 0; var3 < var5; ++var3) {
         var1.drawImage(_mUImenuback, var2 + (var3 & 1), var6, 0);
         ++var6;
      }

      var1.setClip(var2, var6, var4, 1);
      var1.drawImage(_mUIimages[2], 0, var6, 0);
      var1.setClip(0, 0, _mUIwidth, _mUIheight);
   }

   protected final void drawOptions(Graphics var1) {
      int[] var2 = _mUIdsgnLayout[_mUIdsgn];
      this.pushFont();
      this.setFontSize(0);
      int var3 = this.getFontHeight(0);
      int var5 = _mUIimagesH[0] + this.getMarginY();
      if (var2[8] != 0) {
         int var6;
         label41:
         switch(var2[9]) {
         case 1:
            mFont[mCurrentFont].print(var1, this.getMarginX() - (256 - this.scrollOffset(_mUIdsgnXo[0])), var5, crlResourceManager.mLocaleText[var2[11 + 3 * _mUIoption]].get());
            break;
         case 2:
            this.drawScrollText(var1, crlResourceManager.mLocaleText[var2[11 + 3 * _mUIoption]].get(), crlFont.mClipTop + _mUIiLine, 0);
            break;
         case 3:
            var5 = _mUIheight - var2[8] * var3 - _mUIimagesH[2];
         case 0:
            int var4 = 256 - this.scrollOffset(_mUIdsgnXo[_mUIoption]);
            var1.setColor(11184640);
            var1.drawRoundRect(1 - var4, var5 + var3 * _mUIoption - 3, mFont[0].getWidth(crlResourceManager.mLocaleText[var2[11 + 3 * _mUIoption]]) + 5, var3 + 3, 16, var3 + 3);
            var6 = 0;

            while(true) {
               if (var6 >= var2[8]) {
                  break label41;
               }

               var4 = 256 - this.scrollOffset(_mUIdsgnXo[var6]);
               mFont[mCurrentFont].print(var1, this.getMarginX() - var4, var5 + var3 * var6, crlResourceManager.mLocaleText[var2[11 + var6 * 3]].get());
               ++var6;
            }
         case 4:
            for(var6 = 0; var6 < crlResourceManager.mStrCreditEndID - crlResourceManager.mStrCreditStartID + 1; ++var6) {
               int var7;
               if ((var7 = 0 + var6 * var3 + b) > crlFont.mClipTop && var7 + mFont[mCurrentFont].getHeight() < _mUIheight - _mUIimagesH[2]) {
                  mFont[mCurrentFont].printWrapped(var1, _mUIwidth, var7, crlResourceManager.mLocaleText[crlResourceManager.mStrCreditStartID + var6].get(), this._mWorkBuffer, 260, false);
               }

               if (var7 > _mUIheight) {
                  break;
               }
            }

            if (--b < -(var3 * (crlResourceManager.mStrCreditEndID - crlResourceManager.mStrCreditStartID))) {
               b = _mUIheight - _mUIimagesH[2] - 32;
            }
            break;
         default:
            this.usrDrawOptions(var1, var2);
         }
      }

      this.popFont();
   }

   protected final void drawPanel(Graphics var1) {
      int var2;
      if ((var2 = _mUIdsgnLayout[_mUIdsgn][7]) != 0) {
         this.usrDrawPanel(var1, var2);
      }

   }

   protected void drawSurround(Graphics var1) {
      int[] var2 = _mUIdsgnLayout[_mUIdsgn];
      this.pushFont();
      this.setFontSize(1);
      int var3;
      if ((var3 = var2[2]) != 0) {
         mFont[mCurrentFont].print(var1, this.getMarginX(), this.getMarginY(), crlResourceManager.mLocaleText[var3].get());
      }

      this.setFontSize(0);
      if ((var3 = var2[3]) != 0) {
         mFont[mCurrentFont].print(var1, this.getSKPositiveX(var3), this.getSKfooterY(), crlResourceManager.mLocaleText[var3].get());
      }

      if ((var3 = var2[5]) != 0) {
         mFont[mCurrentFont].print(var1, this.getSKNegativeX(var3), this.getSKfooterY(), crlResourceManager.mLocaleText[var3].get());
      }

      this.popFont();
   }

   public final int getSKfooterY() {
      return _mUIheight - this.getMarginY() - this.getFontHeight(0);
   }

   public final int getSKPositiveX(int var1) {
      return this.getMarginX();
   }

   public final int getSKNegativeX(int var1) {
      return _mUIwidth - this.getWidth(crlResourceManager.mLocaleText[var1]) - this.getMarginX();
   }

   public final int getSKPositiveX(Graphics var1, String var2) {
      return this.getMarginX();
   }

   public final int getSKNegativeX(Graphics var1, String var2) {
      return _mUIwidth - var1.getFont().stringWidth(var2) - this.getMarginX();
   }

   protected boolean keyUpdate(int var1) {
      return false;
   }
}
