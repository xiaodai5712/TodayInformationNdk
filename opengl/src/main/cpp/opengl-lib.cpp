#include <jni.h>
#include <string>
#include <GLES2/gl2.h>
#include <GLES2/gl2ext.h>

// 定义一个宏函数 应用于字符串拼接
#define OPENGLFUN(arg) Java_com_dzh_opengl_OpenGLManager_##arg
extern "C" JNIEXPORT void JNICALL OPENGLFUN(onSurfacedCreated)(JNIEnv *env,jclass )
{
    glClearColor(0.0f,0.0f,5.0f,1.0f);
}
extern "C" JNIEXPORT void JNICALL
        OPENGLFUN(onSurfaceChanged)(JNIEnv *env,jclass, jint width, jint height)
{
    glViewport(0,0,width,height);
}

extern "C" JNIEXPORT void JNICALL
        OPENGLFUN(onDrawFrame)(JNIEnv *env,jclass )
{
    glClear(GL_COLOR_BUFFER_BIT);
}