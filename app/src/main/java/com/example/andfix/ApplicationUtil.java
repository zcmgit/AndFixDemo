package com.example.andfix;

import android.app.Application;
import android.os.Environment;
import android.util.Log;

import com.alipay.euler.andfix.patch.PatchManager;

import java.io.IOException;

/**
 * @author zcm
 * @create 2018/12/05
 * @Describe
 */
public class ApplicationUtil extends Application {
    private PatchManager patchManager;

    private String TAG = ApplicationUtil.class.getSimpleName();
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("AAA","APPLICATION");
        patchManager = new PatchManager(this);
        patchManager.init("1.0");//current version
        patchManager.loadPatch();
        try {
            Log.d(TAG,"addPatch start");
            patchManager.addPatch("/storage/sdcard0/andfix/a2.apatch");
            Log.d(TAG,"addPatch success");
        } catch (IOException e) {
            e.printStackTrace();
            Log.d(TAG,"addPatch fail");
        }
    }
}
