package com.example.sridhar123.sieaver.BashTaxActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.sridhar123.sieaver.R;
import com.example.sridhar123.sieaver.SieverBaseActivity;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class BashTaxStep3 extends SieverBaseActivity {

    private Button forward;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bash_tax_step_3);


        forward = (Button) findViewById(R.id.btnForward1);

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BashTaxStep3.this,BashTaxStep4.class));
            }
        });
    }
}
