package com.example.sridhar123.syclo.DreamsComeTrue;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.sridhar123.syclo.GeneralConstants.GeneralConstants;
import com.example.sridhar123.syclo.Intros.ZoomOutPageTransformer;
import com.example.sridhar123.syclo.R;
import com.example.sridhar123.syclo.SieverBaseActivity;
import com.example.sridhar123.syclo.Utility;
import com.pixplicity.multiviewpager.MultiViewPager;

import java.util.ArrayList;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class DreamStep4 extends SieverBaseActivity{

    private Intent intent;
    private int selectedIndex;
    private boolean isAmountCustom;
    private String customAmountValue;
    private int selectedDurationValue = 6;
    private int selectedDurationIndex = 0;
    private boolean isDurationCapAdded = false;
    private ArrayList<String> monthsList;
    private TextView amount;
    private MultiViewPager durationPicker;
    private ImageButton forward;
    private Button customTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.duration_picker);
        amount = (TextView) findViewById(R.id.tvAmount);
        durationPicker = (MultiViewPager) findViewById(R.id.picker_duration);
        customTime = (Button) findViewById(R.id.btnSetCustomTime);

        monthsList = Utility.createPickerValues(this, 6, 60, 6, GeneralConstants.pickerTypeMonths);
        durationPicker = (MultiViewPager) findViewById(R.id.picker_duration);
        durationPicker.setPageTransformer(true, new ZoomOutPageTransformer());
        durationPicker.setCurrentItem(4);
        setDurationsAdapter();
        handleIntent();

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void handleIntent() {
        Intent intent = getIntent();
        if (intent != null) {

            selectedIndex = intent.getIntExtra(GeneralConstants.pickerSelectedIndex, 2);
            isAmountCustom = intent.getBooleanExtra(GeneralConstants.isAmountCustom, false);
            if (isAmountCustom) {
                customAmountValue = intent.getStringExtra(GeneralConstants.selectedAmount);
                amount.setText(Utility.addSeparators(Integer.parseInt(customAmountValue)));
            } else {
                amount.setText(intent.getStringExtra(GeneralConstants.selectedAmount));
            }
        }

    }
    private void setDurationsAdapter() {
        final FragmentStatePagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {

            @Override
            public int getCount() {
                return monthsList.size();
            }

            @Override
            public Fragment getItem(int position) {
                return DreamDurationFragment.create(monthsList.get(position), true);
            }

        };
        durationPicker.setAdapter(adapter);
    }

}
