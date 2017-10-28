package com.example.sridhar123.sieaver.DreamsComeTrue;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.sridhar123.sieaver.Constants.SharedPrefConstants;
import com.example.sridhar123.sieaver.GeneralConstants.GeneralConstants;
import com.example.sridhar123.sieaver.R;
import com.example.sridhar123.sieaver.SieverBaseActivity;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class DreamStep1 extends SieverBaseActivity {

    private CardView cd1,cd2,cd3,cd4,cd5;
    private Intent intent;
    String subtext = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dream_step1);
        cd1 = (CardView) findViewById(R.id.cardPurchase);
        cd2 = (CardView) findViewById(R.id.cardExperience);
        cd3 = (CardView) findViewById(R.id.cardOccasion);
        cd4 = (CardView) findViewById(R.id.cardTrip);
        cd5 = (CardView) findViewById(R.id.cardCustomGoal);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.BYOD_SELECTED_CATEGORY, GeneralConstants.BYOD_CATEGORY_PURCHASE);
                intent = new Intent(DreamStep1.this,DreamStep2.class);
                intent.putExtra(GeneralConstants.BYOD_SUBTEXT, subtext);
                startActivity(intent);
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtext = GeneralConstants.SUBTEXT_EXPERIENCE;
                prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.BYOD_SELECTED_CATEGORY, GeneralConstants.BYOD_CATEGORY_EXPERIENCE);
                intent = new Intent(DreamStep1.this,DreamStep2.class);
                intent.putExtra(GeneralConstants.BYOD_SUBTEXT, subtext);
                startActivity(intent);

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtext = GeneralConstants.SUBTEXT_OCCASION;
                prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.BYOD_SELECTED_CATEGORY, GeneralConstants.BYOD_CATEGORY_OCCASION);
                intent = new Intent(DreamStep1.this,DreamStep2.class);
                intent.putExtra(GeneralConstants.BYOD_SUBTEXT, subtext);
                startActivity(intent);

            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtext = GeneralConstants.SUBTEXT_TRIP;
                prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.BYOD_SELECTED_CATEGORY, GeneralConstants.BYOD_CATEGORY_TRIP);
                intent = new Intent(DreamStep1.this,DreamStep2.class);
                intent.putExtra(GeneralConstants.BYOD_SUBTEXT, subtext);
                startActivity(intent);

            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtext = GeneralConstants.SUBTEXT_CUSTOM_GOAL;
                prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.BYOD_SELECTED_CATEGORY, GeneralConstants.BYOD_CATEGORY_CUSTOM);
                intent = new Intent(DreamStep1.this,DreamStep2.class);
                intent.putExtra(GeneralConstants.BYOD_SUBTEXT, subtext);
                startActivity(intent);

            }
        });
    }
}
