package me.aguaclaraturbidity;

/** AguaClara Turbidity Sensor Mobile App
 *  Date: 4/6/18 -
 *  Written by Sensor Development Subteam Spring 2018
 *  This app is part of the Mobile Application-Processed Endooscope (MAPE) Turbidity Sensor.
 *  It will process images from an endoscope submerged in fluid to determine turbidity. */

import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.hardware.Camera;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements SurfaceHolder.Callback, Camera.PreviewCallback {
    private Camera camera;
    private Camera.Parameters camParams;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        SurfaceView cameraPreview = (SurfaceView) findViewById(R.id.camera_preview);

        ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.CAMERA}, 50);

        if (ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
            System.err.println("Permission request for camera successful.");
            openCamera(0); //Camera.CameraInfo.CAMERA_FACING_BACK
            try {
                cameraPreview.getHolder().addCallback(this);
                camera.setPreviewDisplay(cameraPreview.getHolder());
                camera.setPreviewCallback(this);
                camera.startPreview();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
            System.err.println("Permission request for camera unsuccessful.");
    }

    public void openCamera(int id){
        releaseCameraAndPreview();
        camera = Camera.open(id);

        camera.setDisplayOrientation(90);
        camParams = camera.getParameters();
        if (camParams.isAutoExposureLockSupported())
            camParams.setAutoExposureLock(true);

        if (camParams.isAutoWhiteBalanceLockSupported())
            camParams.setAutoWhiteBalanceLock(true);
    }

    private void releaseCameraAndPreview() {
        if (camera != null) {
            camera.stopPreview();
            camera.release();
            camera = null;
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            camera.setPreviewDisplay(surfaceHolder);
            camera.startPreview();
        } catch (IOException e) {
            Log.d("View", "Error setting camera preview: " + e.getMessage());
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    /** When the surface is destroyed, stop updating the preview surface. */
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (camera != null) {
            camera.stopPreview();
        }
    }

    @Override
    public void onPreviewFrame(byte[] bytes, Camera camera) {
        camParams.setExposureCompensation(0);
        camera.setParameters(camParams);
    }

}