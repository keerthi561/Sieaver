package com.example.sridhar123.syclo.Intros;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.os.Handler;

import com.example.sridhar123.syclo.R;
import com.example.sridhar123.syclo.SieverBaseActivity;

/**
 * Created by sridhar123 on 27/10/17.
 */

public class SplashActivity extends SieverBaseActivity {

    private boolean isPaused = false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        isPaused=false;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(!isPaused)
                    proceedToNextPage();
            }
        },2000);
    }

    private void proceedToNextPage() {
        Intent intent = new Intent(this,IntroductionActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        isPaused=true;
    }
}
