package com.example.sridhar123.sieaver;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class InputPanDetails extends SieverBaseActivity{

    private Button button_kyc_verify;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pan_details);
        button_kyc_verify= (Button) findViewById(R.id.kyc_verify_process);

        button_kyc_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InputPanDetails.this,PanKycDocsActivity.class));
            }
        });
    }
}
