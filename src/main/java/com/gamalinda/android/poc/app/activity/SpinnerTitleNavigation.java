package com.gamalinda.android.poc.app.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import com.gamalinda.android.poc.app.R;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.res.StringArrayRes;

@EActivity
public class SpinnerTitleNavigation extends Activity implements ActionBar.OnNavigationListener {

    @StringArrayRes(R.array.spinner_action_list)
    String[] strings;

    SpinnerAdapter spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.spinner_action_list, android.R.layout.simple_spinner_dropdown_item);
        getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        getActionBar().setListNavigationCallbacks(spinnerAdapter, this);
        getActionBar().setDisplayShowTitleEnabled(false);
    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {

        Toast.makeText(this, "Selected " + strings[itemPosition], Toast.LENGTH_SHORT).show();
        return false;
    }
}
