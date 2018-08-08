package com.example.sridhar123.syclo;

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

public class AmountFragment extends Fragment {

    private static final String ARG_VALUE = "value";

    public static AmountFragment create(String value) {
        AmountFragment fragment = new AmountFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_VALUE, value);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_beaver_away, container, false);
        TextView tv = (TextView) rootView.findViewById(R.id.tv);
        final Bundle arguments = getArguments();
        if (arguments != null) {
            tv.setText(arguments.getString(ARG_VALUE));

        } else {
            tv.setVisibility(View.GONE);
        }
        //tv.setTextSize(30);
        return rootView;
    }
}
