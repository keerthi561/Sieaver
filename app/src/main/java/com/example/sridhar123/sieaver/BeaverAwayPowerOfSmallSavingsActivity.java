package com.example.sridhar123.sieaver;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sridhar123.sieaver.GeneralConstants.GeneralConstants;

import java.util.ArrayList;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class BeaverAwayPowerOfSmallSavingsActivity extends SieverBaseActivity {

    private PickerValues pickerValues;
    private ArrayList<String> amountList;
    private int selectedAmountIndex;
    private int selectedAmount;
    private Intent intent;
    private boolean isWeekly;
    private int futureValue;
    private int interestEarned;
    private PrefManager prefManager;
    private int installmentAmount;
    private Button proceed;
    private TextView transactionType,futureValueOneYear,futureValueFiveYear,futureValueTenYear,interestOneYear,interestFiveYear,interestTenYear;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.power_of_savings);

        transactionType = (TextView) findViewById(R.id.tvTransactionType);
        futureValueOneYear = (TextView) findViewById(R.id.tvAmountInOneYear);
        futureValueFiveYear = (TextView) findViewById(R.id.tvAmountInFiveYears);
        futureValueTenYear= (TextView) findViewById(R.id.tvAmountInTenYears);

        interestOneYear = (TextView) findViewById(R.id.tvInterestInOneYear);
        interestFiveYear = (TextView) findViewById(R.id.tvInterestInFiveYears);
        interestTenYear = (TextView) findViewById(R.id.tvInterestInTenYears);

        proceed = (Button) findViewById(R.id.btnProceed);

        handleIntent();

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(BeaverAwayPowerOfSmallSavingsActivity.this, BeaverAwayChosenFundsActivity.class);
                intent.putExtra(GeneralConstants.selectedAmount, amountList.get(selectedAmountIndex));
                intent.putExtra(GeneralConstants.isWeekly, isWeekly);
//                intent.putExtra(GeneralConstants.schemeName, response.schemeList.get(0).getName());
//                intent.putExtra(GeneralConstants.schemeId, response.schemeList.get(0).getId());
                startActivity(intent);
            }
        });
    }

    private void handleIntent() {
        intent = getIntent();
        if (intent != null) {
            setTransactionType(intent.getBooleanExtra(GeneralConstants.isWeekly, false));
            generatePickerValues(intent.getBooleanExtra(GeneralConstants.isAmountCustom, false));
        }
    }
    private void setTransactionType(boolean isWeekly) {
        this.isWeekly = isWeekly;
        if (isWeekly) {
            transactionType.setText("per week");
        } else {
            transactionType.setText("Lump sum");
        }
    }

    private void generatePickerValues(boolean isAmountCustom) {
        if (isAmountCustom) {
            pickerValues = Utility.createBeaverAwayPickerValuesWithCustom(1000, 10000, 1000, intent.getIntExtra(GeneralConstants.selectedAmount, 3000));
            amountList = pickerValues.getList();
            selectedAmountIndex = pickerValues.getSelectedIndex();
        } else {
            pickerValues = Utility.createBeaverAwayPickerValuesWithCustom(1000, 10000, 1000, getAmount((intent.getIntExtra(GeneralConstants.pickerSelectedIndex, 1))));
            amountList = pickerValues.getList();
            selectedAmountIndex = pickerValues.getSelectedIndex();
        }
    }

    private int getAmount(int index) {
        if (index == 0) {
            return 500;
        } else {
            return index * 1000;
        }
    }



}
