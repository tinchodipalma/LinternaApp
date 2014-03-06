
package com.tdp.linterna;

import android.app.Application;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;

public class LinternaApp extends Application {

    public static Camera camera;
    public static boolean isLightOn;
    
    @Override
    public void onCreate() {
        super.onCreate();
        
        camera = Camera.open();
        isLightOn = false;
        
    }

    public static void turnOnFlashLight() {
        Parameters p = camera.getParameters();
        p.setFlashMode(Parameters.FLASH_MODE_TORCH);
        camera.setParameters(p);
        camera.startPreview();
        isLightOn = true;
    }

    public static void turnOffFlashLight() {
        Parameters p = camera.getParameters();
        p.setFlashMode(Parameters.FLASH_MODE_OFF);
        camera.setParameters(p);
        camera.stopPreview();
        isLightOn = false;
    }
    
}
