package com.gamalinda.android.poc.app.activity;

import android.app.Activity;
import android.app.FragmentTransaction;
import com.gamalinda.android.poc.app.R;
import com.gamalinda.android.poc.app.fragment.QuickFragment;
import com.gamalinda.android.poc.app.fragment.QuickFragment_;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_custom_tab_navigation)
public class CustomTabNavigation extends Activity {

    FragmentTransaction fragmentTransaction;

    @AfterViews
    void afterViews() {
        fragmentTransaction = getFragmentManager().beginTransaction();

        fragmentTransaction.add(R.id.frame, createFragmentWithColor(android.R.color.holo_blue_light));
        fragmentTransaction.commit();
    }

    private int findColor(int i) {
        return getResources().getColor(i);
    }

    private QuickFragment createFragmentWithColor(int i) {
        QuickFragment qf = QuickFragment_.builder().build();
        qf.setLayoutColor(findColor(i));

        return qf;
    }

    private void switchFragmentByColor(int i) {
        QuickFragment qf = createFragmentWithColor(i);

        fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, qf);
        fragmentTransaction.commit();
    }

    @Click(R.id.button_main)
    void buttonMain() {
        switchFragmentByColor(android.R.color.holo_blue_light);
    }

    @Click(R.id.button_1)
    void button1() {
        switchFragmentByColor(android.R.color.holo_orange_light);
    }

    @Click(R.id.button_2)
    void button2() {
        switchFragmentByColor(android.R.color.holo_green_light);
    }

    @Click(R.id.button_3)
    void button3() {
        switchFragmentByColor(android.R.color.holo_red_light);
    }

    @Click(R.id.button_4)
    void button4() {
        switchFragmentByColor(android.R.color.holo_blue_dark);
    }

    @Click(R.id.button_5)
    void button5() {
        switchFragmentByColor(android.R.color.holo_green_dark);
    }

    @Click(R.id.button_6)
    void button6() {
        switchFragmentByColor(android.R.color.holo_red_dark);
    }

    @Click(R.id.button_7)
    void button7() {
        switchFragmentByColor(android.R.color.holo_purple);
    }
}
