package com.dzh.todayinformationndk;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

import com.dzh.opengl.OpenGLManager;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MainActivity extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        GLSurfaceView surfaceView = findViewById(R.id.gl_view);
        surfaceView.setRenderer(new GLSurfaceView.Renderer()
        {
            @Override
            public void onSurfaceCreated(GL10 gl, EGLConfig config)
            {
                OpenGLManager.onSurfacedCreated();
            }

            @Override
            public void onSurfaceChanged(GL10 gl, int width, int height)
            {

                OpenGLManager.onSurfaceChanged(width,height);
            }

            @Override
            public void onDrawFrame(GL10 gl)
            {
                OpenGLManager.onDrawFrame();
            }
        });

    }

}
