package com.example.sridhar123.sieaver;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class BashTaxStep1 extends SieverBaseActivity{

    private CardView ppf,nss,fd,hl,li;
    boolean isCardPpfChecked = false, isCardNscChecked = false, isCardFiveYearFdChecked = false, isCardHomeLoanChecked = false, isCardLifeInsuranceChecked = false;
    private ImageButton forward;
    private Button noneofthese;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bash_tax_step1);
        ppf= (CardView) findViewById(R.id.cardPpf);
        nss = (CardView) findViewById(R.id.cardNsc);
        fd = (CardView) findViewById(R.id.cardFiveYearFd);
        hl = (CardView) findViewById(R.id.cardHomeLoan);
        li = (CardView) findViewById(R.id.cardLifeInsurance);

        forward = (ImageButton) findViewById(R.id.btnForward);
        noneofthese = (Button) findViewById(R.id.btnNoneOfThese);

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BashTaxStep1.this,BashTaxStep2.class));
            }
        });
        ppf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manageCardClickEvents(0);
            }
        });
        
        nss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manageCardClickEvents(1);
            }
        });
        
        fd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manageCardClickEvents(2);
            }
        });
        
        hl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manageCardClickEvents(3);
            }
        });
        
        li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manageCardClickEvents(4);
            }
        });
    }

    private void manageCardClickEvents(int i) {
        changeCardStatus(i);        
        changeCardSelection(i);
        manageActionButtonsVisibility();

    }

    private void manageActionButtonsVisibility() {
        if (isCardLifeInsuranceChecked || isCardPpfChecked || isCardFiveYearFdChecked || isCardHomeLoanChecked || isCardNscChecked) {
            forward.setVisibility(View.VISIBLE);
            noneofthese.setVisibility(View.GONE);
        } else {
            forward.setVisibility(View.GONE);
            noneofthese.setVisibility(View.VISIBLE);
        }
    }

    private void changeCardSelection(int flag) {

        if (flag == 0) {
            if (isCardPpfChecked) {
                ppf.setCardBackgroundColor(ContextCompat.getColor(BashTaxStep1.this, R.color.colorGreen));
            } else {
                ppf.setCardBackgroundColor(ContextCompat.getColor(BashTaxStep1.this, R.color.whiteBackground));
            }
        } else if (flag == 1) {
            if (isCardNscChecked) {
                nss.setCardBackgroundColor(ContextCompat.getColor(BashTaxStep1.this, R.color.colorGreen));
               } else {
                nss.setCardBackgroundColor(ContextCompat.getColor(BashTaxStep1.this, R.color.whiteBackground));
            }
        } else if (flag == 2) {
            if (isCardFiveYearFdChecked) {
                fd.setCardBackgroundColor(ContextCompat.getColor(BashTaxStep1.this, R.color.colorGreen));
                } else {
                fd.setCardBackgroundColor(ContextCompat.getColor(BashTaxStep1.this, R.color.whiteBackground));
            }
        } else if (flag == 3) {
            if (isCardHomeLoanChecked) {
                hl.setCardBackgroundColor(ContextCompat.getColor(BashTaxStep1.this, R.color.colorGreen));
                } else {
                hl.setCardBackgroundColor(ContextCompat.getColor(BashTaxStep1.this, R.color.whiteBackground));
            }
        } else if (flag == 4) {
            if (isCardLifeInsuranceChecked) {
                li.setCardBackgroundColor(ContextCompat.getColor(BashTaxStep1.this, R.color.colorGreen));
                } else {
                li.setCardBackgroundColor(ContextCompat.getColor(BashTaxStep1.this, R.color.whiteBackground));
            }
        }

    }


    private void changeCardStatus(int flag) {
        if (flag == 0) {
            if (!isCardPpfChecked) {
                isCardPpfChecked = true;
            } else {
                isCardPpfChecked = false;
            }
        } else if (flag == 1) {
            if (!isCardNscChecked) {
                isCardNscChecked = true;
            } else {
                isCardNscChecked = false;
            }
        } else if (flag == 2) {
            if (!isCardFiveYearFdChecked) {
                isCardFiveYearFdChecked = true;
            } else {
                isCardFiveYearFdChecked = false;
            }
        } else if (flag == 3) {
            if (!isCardHomeLoanChecked) {
                isCardHomeLoanChecked = true;
            } else {
                isCardHomeLoanChecked = false;
            }
        } else if (flag == 4) {
            if (!isCardLifeInsuranceChecked) {
                isCardLifeInsuranceChecked = true;
            } else {
                isCardLifeInsuranceChecked = false;
            }
        }
    }
}
