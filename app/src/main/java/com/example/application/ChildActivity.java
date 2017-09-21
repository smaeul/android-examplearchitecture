package com.example.application;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class ChildActivity extends Activity {
    private static final String TAG_FRAGMENT1 = "fragment1";
    private static final String TAG_FRAGMENT2 = "fragment2";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switchToFragment1();
    }

    public void switchToFragment1() {
        final Fragment cachedFragment = getFragmentManager().findFragmentByTag(TAG_FRAGMENT1);
        final Fragment fragment = (cachedFragment != null) ? cachedFragment : new ChildFragment1();
        final FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(android.R.id.content, fragment, TAG_FRAGMENT1).commit();
    }

    public void switchToFragment2() {
        final Fragment cachedFragment = getFragmentManager().findFragmentByTag(TAG_FRAGMENT2);
        final Fragment fragment = (cachedFragment != null) ? cachedFragment : new ChildFragment2();
        final FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(android.R.id.content, fragment, TAG_FRAGMENT2).commit();
    }
}
