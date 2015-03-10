package com.gamalinda.android.poc.app.activity;

import android.app.Activity;
import com.gamalinda.android.poc.app.R;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.main)
public class MainActivity extends Activity {

    @AfterViews
    void afterViews() {
//        DrawerNavigation_.intent(this).start();
        CustomTabNavigation_.intent(this).start();
    }
}
