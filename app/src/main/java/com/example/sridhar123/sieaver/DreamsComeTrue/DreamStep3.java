package com.example.sridhar123.sieaver.DreamsComeTrue;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.sridhar123.sieaver.DreamFragment;
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
public class DreamStep3 extends SieverBaseActivity{
    private MultiViewPager amountPicker;
    private RelativeLayout setCustomAmount;
    private Intent intent;
    private ArrayList<String> amountsList;
    private int selectedAmountIndex = 3;
    private ImageButton forward;
    private String amount = "60,000";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dream_step_3);
        amountsList = Utility.createPickerValues(this, 30000, 150000, 10000, GeneralConstants.pickerTypeAmount);
        amountPicker = (MultiViewPager) findViewById(R.id.amountPicker);
        setAmountsAdapter();
        amountPicker.setPageTransformer(true, new ZoomOutPageTransformer());
        amountPicker.setCurrentItem(selectedAmountIndex);
        setCustomAmount = (RelativeLayout) findViewById(R.id.rl_set_custom_amount);
        setOnPageChangeListener();
        forward = (ImageButton) findViewById(R.id.btnForward);
        forwardClickAction();
    }

    private void setAmountsAdapter() {
        final FragmentStatePagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {

            @Override
            public int getCount() {
                return amountsList.size();
            }

            @Override
            public Fragment getItem(int position) {
                return DreamFragment.create(amountsList.get(position), true);
            }

        };
        amountPicker.setAdapter(adapter);
    }

    private void setOnPageChangeListener() {
        amountPicker.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                selectedAmountIndex = position;
                amount = amountsList.get(selectedAmountIndex);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    private void forwardClickAction() {
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DreamStep3.this, DreamStep4.class);
                intent.putExtra(GeneralConstants.selectedAmount, amount);
                intent.putExtra(GeneralConstants.pickerSelectedIndex, selectedAmountIndex);
                intent.putExtra(GeneralConstants.isAmountCustom, false);
                startActivity(intent);
            }
        });
    }
}
