package com.example.sridhar123.sieaver.BashTaxActivities;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.sridhar123.sieaver.Constants.SharedPrefConstants;
import com.example.sridhar123.sieaver.GeneralConstants.GeneralConstants;
import com.example.sridhar123.sieaver.R;
import com.example.sridhar123.sieaver.SieverBaseActivity;
import com.example.sridhar123.sieaver.Utility;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class BashTaxStep4 extends SieverBaseActivity {

    private int mInvestment = 0;
    private int mDefInstalment = 0;
    private int mMaxTaxSavings = 150000;//under section 80C
    private String savings;
    private TextView investment,maxTaxSaving,defaultInstallment,potentialSavings;
    private CardView cardYouCanInvest,cardBackToHome;
    private Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bash_tax_step_4);

        investment = (TextView) findViewById(R.id.tvInvestment);
        maxTaxSaving = (TextView) findViewById(R.id.tvMaxTaxSavings);
        defaultInstallment = (TextView) findViewById(R.id.tvDefaultInstalment);
        potentialSavings = (TextView) findViewById(R.id.tvPotentialSavings);
        cardYouCanInvest = (CardView) findViewById(R.id.cardYouCanInvest);
        cardBackToHome = (CardView) findViewById(R.id.cardBackTohome);
        btn = (Button) findViewById(R.id.btnProceed);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savePotentialTaxSavings();
                Intent intent = new Intent(BashTaxStep4.this,BashAmountAndDurationPicker.class);
                intent.putExtra(GeneralConstants.DEF_INSTALMENT, mDefInstalment);
                startActivity(intent);
            }
        });
        handle();
        init();
    }

    private void savePotentialTaxSavings() {
        prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.TAX_SAVINGS, savings);
    }

    private void init() {
        if (prefManager.sharedPrefFileExists(SharedPrefConstants.SHARED_PREFS)) {
            mInvestment = prefManager.getPref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.ALREADY_INVESTED_AMOUNT, 0);
            mInvestment += prefManager.getPref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.AMT_EPF, 0);
            String amt = Utility.addSeparators(mInvestment);
            investment.setText(amt);
            mDefInstalment = mMaxTaxSavings - mInvestment;
            if (mDefInstalment > 0) {
                String defAmt = Utility.addSeparators(mDefInstalment);
                defaultInstallment.setText(defAmt);
                float mSavings = (mDefInstalment) * (3.0f / 10);  //30% of def instalment
                savings = Utility.addSeparators((int) mSavings);
                potentialSavings.setText(savings);
            } else {
                cardYouCanInvest.setVisibility(View.GONE);
                cardBackToHome.setVisibility(View.VISIBLE);
            }
        }

    }

    private void handle() {
        String amt = Utility.addSeparators(mInvestment);
        investment.setText(amt);
        String max = Utility.addSeparators(mMaxTaxSavings);
        maxTaxSaving.setText(max);
        String defAmt = Utility.addSeparators(mMaxTaxSavings - mInvestment);
        defaultInstallment.setText(defAmt);
        float mSavings = (mMaxTaxSavings - mInvestment) * (3 / 10);  //30% of def instalment
        String savings = Utility.addSeparators((int) mSavings);
        potentialSavings.setText(savings);
    }
}
