package com.example.sridhar123.sieaver;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class DashboardActivity extends SieverBaseActivity {
    private CardView cardbashtax,setgoalscard,beaverawaycard;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
        cardbashtax = (CardView) findViewById(R.id.cardBashTax);
        setgoalscard = (CardView) findViewById(R.id.cardSetDreams);
        beaverawaycard = (CardView) findViewById(R.id.cardBeaverSaver);
        setupUI();
    }

}
