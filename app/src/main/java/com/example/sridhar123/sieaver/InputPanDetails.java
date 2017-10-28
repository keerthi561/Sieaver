package com.example.sridhar123.sieaver;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.sridhar123.sieaver.PanKycUploads.PanKycDocsActivity2;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class InputPanDetails extends SieverBaseActivity{

    private Button button_kyc_verify,button_submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pan_details);
        button_kyc_verify= (Button) findViewById(R.id.kyc_verify_process);
        button_submit = (Button) findViewById(R.id.btnSubmit);

        button_kyc_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InputPanDetails.this,PanKycDocsActivity2.class));
            }
        });

        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InputPanDetails.this,DashboardActivity.class));
                finish();
            }
        });
    }
}
