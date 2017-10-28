package com.example.sridhar123.sieaver.DreamsComeTrue;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.sridhar123.sieaver.Constants.SharedPrefConstants;
import com.example.sridhar123.sieaver.R;
import com.example.sridhar123.sieaver.SieverBaseActivity;

/**
 * Created by sridhar123 on 28/10/17.
 */

public class DreamStep2 extends SieverBaseActivity{

    private ImageButton img;
    private EditText customName;
    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dream_step_2);
        img= (ImageButton) findViewById(R.id.btnForward);
        customName = (EditText) findViewById(R.id.etGoalName);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.BYOD_DESCRIPTION, customName.getText().toString());
                intent = new Intent(DreamStep2.this, DreamStep3.class);
                startActivity(intent);
            }
        });
    }
}
