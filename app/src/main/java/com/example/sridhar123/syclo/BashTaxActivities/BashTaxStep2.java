package com.example.sridhar123.syclo.BashTaxActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.sridhar123.syclo.BashTaxStep30;
import com.example.sridhar123.syclo.Constants.SharedPrefConstants;
import com.example.sridhar123.syclo.R;
import com.example.sridhar123.syclo.SieverBaseActivity;
import com.example.sridhar123.syclo.Utility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class BashTaxStep2 extends SieverBaseActivity {

    private List<EditText> listOfEdittexts = new ArrayList<>();
    private String collection;
    private EditText ppf,nsc,fd,hl,li;
    private TextInputLayout ppfi,nsci,fdi,hli,lii;
    private ImageButton forwardButton;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bash_tax_step_2);

        ppf = (EditText) findViewById(R.id.etPpf);
        nsc = (EditText) findViewById(R.id.etNsc);
        fd = (EditText) findViewById(R.id.etFd);
        hl = (EditText) findViewById(R.id.etHomeLoan);
        li  = (EditText) findViewById(R.id.etLifeInsurance);

        ppfi = (TextInputLayout) findViewById(R.id.inputPpf);
        nsci = (TextInputLayout) findViewById(R.id.inputNsc);
        fdi = (TextInputLayout) findViewById(R.id.inputFd);
        hli = (TextInputLayout) findViewById(R.id.inputHomeLoan);
        lii  = (TextInputLayout) findViewById(R.id.inputLifeInsurance);
        
        forwardButton = (ImageButton) findViewById(R.id.btnForward);
        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveInvestedAmount();
                startActivity(new Intent(BashTaxStep2.this,BashTaxStep3.class));
            }
        });
        showOnlyRelevantFields();
    }

    private void saveInvestedAmount() {
        int sum = 0;
        for (EditText et : listOfEdittexts) {
            sum += Utility.getDigits(et.getText().toString(), BashTaxStep2.this);
        }
        //total amount
        prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.ALREADY_INVESTED_AMOUNT, sum);
        // Toast.makeText(BashTaxStep2.this, "" + sum, Toast.LENGTH_SHORT).show();

        //individual amount
        prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.AMT_PPF, Utility.getDigits(ppf.getText().toString(), BashTaxStep2.this));
        prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.AMT_NSC, Utility.getDigits(nsc.getText().toString(), BashTaxStep2.this));
        prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.AMT_FD, Utility.getDigits(fd.getText().toString(), BashTaxStep2.this));
        prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.AMT_HOME_LOAN, Utility.getDigits(hl.getText().toString(), BashTaxStep2.this));
        prefManager.savePref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.AMT_LIFE_INSURANCE, Utility.getDigits(li.getText().toString(), BashTaxStep2.this));

    }

    private void showOnlyRelevantFields() {
        if (prefManager.sharedPrefFileExists(SharedPrefConstants.SHARED_PREFS)) {
            collection = prefManager.getPref(SharedPrefConstants.SHARED_PREFS, SharedPrefConstants.TAX_INVEST_COLLECTION, "");
            if (collection != null && !collection.isEmpty()) {
                if (collection.charAt(0) == '0') {
                    ppfi.setVisibility(View.GONE);
                } else {
                    listOfEdittexts.add(ppf);
                }
                if (collection.charAt(1) == '0') {
                    nsci.setVisibility(View.GONE);
                } else {
                    listOfEdittexts.add(nsc);
                }
                if (collection.charAt(2) == '0') {
                    fdi.setVisibility(View.GONE);
                } else {
                    listOfEdittexts.add(fd);
                }
                if (collection.charAt(3) == '0') {
                    hli.setVisibility(View.GONE);
                } else {
                    listOfEdittexts.add(hl);
                }
                if (collection.charAt(4) == '0') {
                    lii.setVisibility(View.GONE);
                } else {
                    listOfEdittexts.add(li);
                }
            }
        }
    }
}

