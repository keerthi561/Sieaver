package com.example.sridhar123.sieaver;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sridhar123 on 28/10/17.
 */

public class DreamFragment extends Fragment {

    private static final String ARG_VALUE = "value";
    private static final String IS_TEXT_SIZE_LARGE = "text_size";

    public static DreamFragment create(String value, boolean isTextSizeLarge) {
        DreamFragment fragment = new DreamFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_VALUE, value);
        bundle.putBoolean(IS_TEXT_SIZE_LARGE, isTextSizeLarge);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_dream_amount, container, false);
        TextView tvAmount = (TextView) rootView.findViewById(R.id.tv);
        TextView tvRs = (TextView) rootView.findViewById(R.id.tvRs);

        final Bundle arguments = getArguments();
        if (arguments != null) {
            tvAmount.setText(arguments.getString(ARG_VALUE));
            if (arguments.getBoolean(IS_TEXT_SIZE_LARGE)) {
                tvAmount.setTextSize(32);
                tvRs.setTextSize(32);
            }

        } else {
            tvAmount.setVisibility(View.GONE);
        }
        //tv.setTextSize(30);
        return rootView;
    }
}
