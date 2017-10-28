package com.example.sridhar123.sieaver;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.sridhar123.sieaver.GeneralConstants.GeneralConstants;

import java.util.ArrayList;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class BeaverAwayChosenFundsActivity extends SieverBaseActivity{
    private Button schemeDetail;
    private ArrayList<Integer> schemeIds;
    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chosen_fund_activity);

        schemeDetail = (Button) findViewById(R.id.btnSchemeDetail);
        schemeDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(BeaverAwayChosenFundsActivity.this, FundsDetailActivity.class);
                intent.putIntegerArrayListExtra(GeneralConstants.LIST_SCHEME_IDS, schemeIds);
                startActivity(intent);
            }
        });
    }
}
