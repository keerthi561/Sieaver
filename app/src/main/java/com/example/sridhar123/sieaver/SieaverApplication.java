package com.example.sridhar123.sieaver;

import android.app.Application;
import android.preference.PreferenceManager;

/**
 * Created by sridhar123 on 28/10/17.
 */

public class SieaverApplication extends Application {
    private PrefManager prefManager;

    public SieaverApplication(){
        prefManager = new PrefManager(this);
    }


    public PrefManager getPrefManager() {
        return prefManager;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        prefManager.createEncryptedSharedPref(this);

    }
}
