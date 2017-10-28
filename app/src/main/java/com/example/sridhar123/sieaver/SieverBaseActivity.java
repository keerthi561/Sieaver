package com.example.sridhar123.sieaver;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sridhar123 on 27/10/17.
 */

public class SieverBaseActivity extends AppCompatActivity{

    protected FragmentManager manager;
    protected SieaverApplication application;
    protected PrefManager prefManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (SieaverApplication) getApplication();
        prefManager = application.getPrefManager();
    }
}
