package com.example.sridhar123.syclo;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.example.sridhar123.syclo.BashTaxActivities.BashTaxStep4;

/**
 * Created by sridhar123 on 28/10/17.
 */

public class BashTaxStep30 extends SieverBaseActivity{

    private ImageButton btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bash_tax_step_30);
        btn = (ImageButton) findViewById(R.id.btnForward);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BashTaxStep30.this, BashTaxStep4.class));
            }
        });
    }
}
