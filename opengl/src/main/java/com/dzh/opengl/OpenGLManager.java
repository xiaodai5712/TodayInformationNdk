package com.dzh.opengl;

/**
 * Date: 2020/1/17
 * author: Dzh
 */
public class OpenGLManager
{

    static
    {
        System.loadLibrary("opengl-lib");

    }
    // Used to load the 'native-lib' library on application startup
    public static native void onSurfacedCreated();

    public static native void onSurfaceChanged(int width,int height);
    public static native void onDrawFrame();
}
