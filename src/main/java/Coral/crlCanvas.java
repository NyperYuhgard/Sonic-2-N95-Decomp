package Coral;

import Coral.Debug.crlProfiler;
import Coral.Util.crlResourceManager;
import Coral.Util.crlUtil;
import STH2P1.State;
import STH2P1.TitleState;
import STH2P1.cCanvas;
import java.util.Random;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.midlet.MIDlet;

public abstract class crlCanvas extends GameCanvas implements Runnable {
    static final int MBOOSTER_MAX_INSTANCES = 1;
    public static State currentState;
    public int[] mKeyMapping = new int[]{49, 50, 51, 52, 53, 54, 55, 56, 57, 42, 48, 35};
    public int[] mKeyCounter = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public String[] mKeyMappingString = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
    public static int mStatus = 0;
    public static int mPad = 0;
    public static int oldPad = 0;
    public static final float DELTA_T_LOWER_CLAMP = 0.04F;
    public static final float DELTA_T_UPPER_CLAMP = 0.25F;
    public static final float DELTA_T_DEFAULT = 0.09F;
    public static final String STANDARD_JAD_PREFIX = "MIDlet-";
    public static final String ROCKPOOL_JAD_PREFIX = "Rockpool-";
    public static int mPadCount = 0;
    public static int mPadDB = 0;
    public static int mKey = 0;
    public static int mGameAction = 0;
    public boolean mDeviceControl = false;
    public static int mPausedState;
    protected Thread _mThread = null;
    public static Display gDisplay;
    public static Graphics _mGraphics;
    public static crlCanvas gCanvas;
    public static crlResourceManager gResourceManager;
    public static Random gRandom;
    protected static boolean _mThreadRunning;
    protected static boolean _mPaintReady;
    protected static boolean _mPaintFinished;
    protected static boolean _mQuitApp;
    protected static boolean _mCanvasShowing;
    protected static int _mFadeStatus;
    protected static int _mFadeCounter;
    protected static int _mFadeColour;
    public static int[] mFadeColData;
    public static boolean mLoadInterrupted = false;
    public static int mGameState;
    protected static long _mGameSpeed;
    protected static long _mStartTime;
    public static long _mLastFrameTime;
    public static long mCounter;
    protected static int _mHeight;
    protected static int _mWidth;
    public static String _mApplication;
    public static String _mVersion;
    public static String _mVendor;
    public static int _mCheatCode;
    public static String _mDJL;
    public static boolean _mDemo;
    public static boolean _mUpsell;
    public static String _mUpsellURL;
    public static String _mDemoURL;
    public static String _mUpsellSplash;
    public static boolean _mTriggerPaintUI;

    // Offscreen buffer for scaling (Nokia C3 Fix)
    public static Image _mOffscreenBuffer;

    public crlCanvas() {
        super(false);
        _mThreadRunning = false;
        _mQuitApp = false;
        _mPaintReady = true;
        _mPaintFinished = true;
        _mCanvasShowing = false;
        gCanvas = this;
        mStatus = 0;
        mPad = 0;
        mPadCount = 0;
        mPadDB = 0;
        mKey = 0;
        mGameAction = 0;
        this.mDeviceControl = false;
        _mGameSpeed = 62L;
        mGameState = 0;
        _mTriggerPaintUI = true;
        this.setFullScreenMode(true);
    }

    public final void open() {
    }

    public final void open(MIDlet var1) {
        crlUtil.garbageWait();
        gDisplay = Display.getDisplay(var1);

        // Internal logic: 240x320 (Portrait)
        _mWidth = 240;
        _mHeight = 320;

        // Create the drawing buffer
        try {
            _mOffscreenBuffer = Image.createImage(_mWidth, _mHeight);
            _mGraphics = _mOffscreenBuffer.getGraphics();
        } catch (Exception e) {}

        mFadeColData = new int[_mWidth];
        _mApplication = var1.getAppProperty("MIDlet-Name");
        _mVersion = var1.getAppProperty("MIDlet-Version");
        _mVendor = var1.getAppProperty("MIDlet-Vendor");
        _mDJL = var1.getAppProperty("Rockpool-DJL");
        String var2 = var1.getAppProperty("Rockpool-CheatCode");
        _mDemo = (_mDemoURL = var1.getAppProperty("Rockpool-DemoURL")) != null;
        _mUpsellURL = var1.getAppProperty("Rockpool-UpsellURL");
        _mUpsellSplash = var1.getAppProperty("Rockpool-UpsellSplash");
        _mUpsell = _mUpsellURL != null || _mUpsellSplash != null;
        if (var2 != null) {
            _mCheatCode = Integer.parseInt(var2);
        }

        gRandom = new Random();
        gResourceManager = new crlResourceManager();
        crlProfiler.open();
    }

    public void close() {
        crlProfiler.close();
        if (gResourceManager != null) {
            gResourceManager.close();
        }
        _mOffscreenBuffer = null;
        _mGraphics = null;
        gResourceManager = null;
        crlUtil.garbageWait();
    }

    public abstract void reset();

    public abstract void quitApp();

    protected abstract void cnvsUpdate();

    protected abstract void render(Graphics var1);

    public static final int getGameWidth() {
        return _mWidth;
    }

    public static final int getGameHeight() {
        return _mHeight;
    }

    public static final void setPaintReady(boolean var0) {
        _mPaintReady = var0;
    }

    public static final boolean getThreadRunning() {
        return _mThreadRunning;
    }

    public final void triggerPaint() {
        crlProfiler.start(2);

        if (_mPaintFinished && _mOffscreenBuffer != null) {
            _mPaintFinished = false;

            // 1. Render the game into the 240x320 buffer
            this.render(_mGraphics);

            Graphics gReal = this.getGraphics();
            int screenW = this.getWidth();  // 320 (C3 Landscape)
            int screenH = this.getHeight(); // 240 (C3 Landscape)

            // 2. PIXEL SCALING (Nearest Neighbor)
            // Create arrays to hold pixel lines
            int[] rawPixels = new int[240];
            int[] scaledLine = new int[320];

            for (int i = 0; i < screenH; i++) {
                // Find the corresponding row in the original image
                int srcY = (i * 320) / screenH;

                // Extract pixels from the original row
                _mOffscreenBuffer.getRGB(rawPixels, 0, 240, 0, srcY, 240, 1);

                // Stretch the row from 240 to 320
                for (int x = 0; x < 320; x++) {
                    scaledLine[x] = rawPixels[(x * 240) / 320];
                }

                // Draw the stretched line directly onto the physical screen
                gReal.drawRGB(scaledLine, 0, 320, 0, i, 320, 1, false);
            }

            _mPaintFinished = true;
        }

        crlProfiler.stop(2);
        this.flushGraphics();
    }

    public void startThread() {
        this._mThread = new Thread(this);
        this._mThread.start();
        _mThreadRunning = true;
    }

    public void stopThread() {
        this._mThread = null;
        _mThreadRunning = false;
    }

    public abstract void pause();

    public abstract void resume();

    protected final void showNotify() {
        if (!_mCanvasShowing) {
            mLoadInterrupted = true;
            this.resume();
            _mCanvasShowing = true;
            if (gDisplay != null) {
                gDisplay.setCurrent(this);
                crlUtil.garbageWait();
                this.flushGraphics();
            }
            System.gc();
        }
        _mTriggerPaintUI = true;
        _mPaintFinished = true;
        mPad = 0;
    }

    protected final void hideNotify() {
        if (!_mQuitApp) {
            if (_mCanvasShowing) {
                mLoadInterrupted = true;
                this.pause();
                _mCanvasShowing = false;
            }
            _mTriggerPaintUI = true;
            _mPaintFinished = true;
            mPad = 0;
        }
    }

    public static final float getDeltaT() {
        float var0 = 0.09F;
        if (_mLastFrameTime != 0L) {
            if ((var0 = (float)_mLastFrameTime / 1000.0F) < 0.04F) {
                var0 = 0.04F;
            } else if (var0 > 0.25F) {
                var0 = 0.25F;
            }
        }
        return var0;
    }

    public final void updateFade(Graphics var1) {
    }

    public final void setFade(int var1) {
        _mFadeColour = var1;
        _mFadeCounter = var1 >>> 24;
        _mFadeStatus = 0;
    }

    public final void cancelFade() {
        _mFadeStatus = 0;
        _mFadeColour = 0;
        _mFadeCounter = 0;
    }

    public final void startFade(int var1, int var2) {
    }

    public final boolean isFading() {
        return _mFadeStatus != 0;
    }

    public final void startFadeIn(int var1, int var2) {
    }

    public final void startFadeOut(int var1, int var2) {
    }

    public final int getFullHeight() {
        return this.getHeight();
    }

    public void createPolygon() {
    }

    protected void fillPolygon(Graphics var1, int[] var2, int var3, int[] var4, int var5, int var6, int var7) {
        var1.setColor(var7);
        var1.fillTriangle(var2[0], var4[0], var2[1], var4[1], var2[3], var4[3]);
        var1.fillTriangle(var2[1], var4[1], var2[2], var4[2], var2[3], var4[3]);
    }

    public static final void resetKeys() {
        oldPad = 0;
        mPad = 0;
        mPadDB = 0;
        mPadCount = 0;
    }

    private static final int a(int var0, boolean var1) {
        switch(var0) {
            case -7:
                if (var1) {
                    mPad = 0;
                }
                return 512;
            case -6:
                if (var1) {
                    mPad = 0;
                }
                return 256;
            case -5:
            case 53:
                return 16;
            case -4:
            case 54:
                if (var1) {
                    mPad &= 65531;
                }
                return 8;
            case -3:
            case 52:
                if (var1) {
                    mPad &= 65527;
                }
                return 4;
            case -2:
            case 6:
            case 56:
                if (var1) {
                    mPad &= 65534;
                }
                return 2;
            case -1:
            case 1:
            case 50:
                if (var1) {
                    mPad &= 65533;
                }
                return 1;
            case 35:
                return 128;
            case 42:
                return 32;
            case 48:
                return 64;
            case 49:
                if (currentState instanceof TitleState) {
                    return 0;
                }
                if (var1) {
                    mPad &= 65525;
                }
                return 5;
            case 51:
                if (currentState instanceof TitleState) {
                    return 0;
                }
                if (var1) {
                    mPad &= 65529;
                }
                return 9;
            case 55:
                if (currentState instanceof TitleState) {
                    return 0;
                }
                if (var1) {
                    mPad &= 65526;
                }
                return 6;
            case 57:
                if (currentState instanceof TitleState) {
                    return 0;
                } else {
                    if (var1) {
                        mPad &= 65530;
                    }
                    return 10;
                }
            default:
                return 0;
        }
    }

    public void keyPressed(int var1) {
        mKey = var1;
        try {
            mGameAction = this.getGameAction(var1);
        } catch (Exception var2) {
            mGameAction = 0;
        }
        oldPad = mPad;
        mPad |= a(var1, true);
        if (++mPadCount > Integer.MAX_VALUE) {
            mPadCount = Integer.MAX_VALUE;
        }
        mPadDB = 1;
        _mTriggerPaintUI = true;
    }

    public void keyRepeated(int var1) {
        if (++mPadCount > Integer.MAX_VALUE) {
            mPadCount = Integer.MAX_VALUE;
        }
        _mTriggerPaintUI = true;
    }

    public void keyReleased(int var1) {
        mKey = var1;
        oldPad = mPad;
        mPad &= '\uffff' - a(var1, false);
        mKey = 0;
        mGameAction = 0;
        if (mPad == 0) {
            mPadCount = 0;
            mPadDB = 0;
        }
        _mTriggerPaintUI = true;
    }

    public abstract void run();
}