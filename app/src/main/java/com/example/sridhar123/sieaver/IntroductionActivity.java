package com.example.sridhar123.sieaver;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by sridhar123 on 27/10/17.
 */

public class IntroductionActivity extends SieverBaseActivity {

    private ViewPager viewPager;
    private LinearLayout dotsLayout;
    private int[] layouts;
    private Button buttonSkip,buttonNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_intro);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        buttonNext = (Button) findViewById(R.id.btn_skip);
        buttonSkip = (Button) findViewById(R.id.btn_next);

        layouts = new int[]{
                R.layout.validatekyc,
                R.layout.bashtax,
                R.layout.goalsetting,
                R.layout.savemore
        };

        viewPager.setAdapter(new MyViewPagerAdapter());
    }

    public class MyViewPagerAdapter extends PagerAdapter{

        private LayoutInflater layoutInflater;

        public MyViewPagerAdapter() {

        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final ImageView image;
            View view = layoutInflater.inflate(layouts[position], container, false);
            container.addView(view);
            return view;
        }

        @Override
        public int getCount() {
            return layouts.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }
}
