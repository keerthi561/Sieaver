package com.example.sridhar123.syclo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.sridhar123.syclo.BashTaxActivities.BashTaxStep1;
import com.example.sridhar123.syclo.BeaverAway.BeaverAwayStep1;
import com.example.sridhar123.syclo.DreamsComeTrue.DreamStep1;

import android.os.Handler;
/**
 * Created by sridhar123 on 28/10/17.
 */
public class DashboardActivity extends SieverBaseActivity {
    private CardView cardbashtax,setgoalscard,beaverawaycard;
    private boolean hasTimePassed=false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dashboard_activity);
        cardbashtax = (CardView) findViewById(R.id.cardBashTax);
        setgoalscard = (CardView) findViewById(R.id.cardSetDreams);
        beaverawaycard = (CardView) findViewById(R.id.cardBeaverSaver);

        cardbashtax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,BashTaxStep1.class));
            }
        });

        setgoalscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,DreamStep1.class));
            }
        });

        beaverawaycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,BeaverAwayStep1.class));
            }
        });
    }

}
