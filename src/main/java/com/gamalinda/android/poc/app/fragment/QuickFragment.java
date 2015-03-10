package com.gamalinda.android.poc.app.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import org.androidannotations.annotations.EFragment;

@EFragment
public class QuickFragment extends Fragment {

    LinearLayout layout;

    int color = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        layout = new LinearLayout(getActivity());

        if (color == 0) {
            layout.setBackgroundColor(getResources().getColor(android.R.color.background_dark));
        } else {
            layout.setBackgroundColor(color);
        }

        return layout;
    }

    public void setLayoutColor(int i) {
        color = i;
    }
}
