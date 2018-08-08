package com.example.sridhar123.syclo.DreamsComeTrue;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sridhar123.syclo.R;

/**
 * Created by sridhar123 on 28/10/17.
 */
public class DreamDurationFragment extends Fragment {

    private static final String ARG_VALUE = "value";
    private static final String IS_TEXT_SIZE_LARGE = "text_size";

    public static DreamDurationFragment create(String value, boolean isTextSizeLarge) {
        DreamDurationFragment fragment = new DreamDurationFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_VALUE, value);
        bundle.putBoolean(IS_TEXT_SIZE_LARGE, isTextSizeLarge);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_dream_duration, container, false);
        TextView tv = (TextView) rootView.findViewById(R.id.tv);
        final Bundle arguments = getArguments();
        if (arguments != null) {
            tv.setText(arguments.getString(ARG_VALUE));
            if (arguments.getBoolean(IS_TEXT_SIZE_LARGE)) {
                tv.setTextSize(32);
            }

        } else {
            tv.setVisibility(View.GONE);
        }
        return rootView;
    }
}
