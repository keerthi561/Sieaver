package com.example.sridhar123.sieaver.BeaverAway;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;

import com.example.sridhar123.sieaver.AmountFragment;
import com.example.sridhar123.sieaver.GeneralConstants.GeneralConstants;
import com.example.sridhar123.sieaver.Intros.ZoomOutPageTransformer;
import com.example.sridhar123.sieaver.R;
import com.example.sridhar123.sieaver.SieverBaseActivity;
import com.example.sridhar123.sieaver.Utility;
import com.pixplicity.multiviewpager.MultiViewPager;

import java.util.ArrayList;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class BeaverAwayStep1 extends SieverBaseActivity {

    private ArrayList<String> amountsList;
    private int selectedAmountIndex = 1;
    private Intent intent;
    private ImageButton btnForward;

    private MultiViewPager amountPicker;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beaver_away_1);
        amountPicker = (MultiViewPager) findViewById(R.id.amountPicker);
        btnForward = (ImageButton) findViewById(R.id.btnForward);
        amountsList = Utility.createSqrrlAwayPickerValues(1000, 10000, 1000);
        amountPicker.setPageTransformer(true, new ZoomOutPageTransformer());
        setAdapter();
        setOnPageChangeListener();
        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(BeaverAwayStep1.this, BeaverAwayPowerOfSmallSavingsActivity.class);
                intent.putExtra(GeneralConstants.pickerSelectedIndex, selectedAmountIndex);
                intent.putExtra(GeneralConstants.isAmountCustom, false);
                intent.putExtra(GeneralConstants.isWeekly, true);
                startActivity(intent);
            }
        });
        amountPicker.setCurrentItem(selectedAmountIndex);
    }

    private void setOnPageChangeListener() {
        amountPicker.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                selectedAmountIndex = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    private void setAdapter() {

        final FragmentStatePagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {

                @Override
                public int getCount() {
                    return amountsList.size();
                }

                @Override
                public Fragment getItem(int position) {
                    return AmountFragment.create(amountsList.get(position));
                }

            };
            amountPicker.setAdapter(adapter);
    }
}
