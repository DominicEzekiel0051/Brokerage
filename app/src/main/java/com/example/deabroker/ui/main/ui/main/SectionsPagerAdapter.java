package com.example.deabroker.ui.main.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.deabroker.Buyer_Tab1;
import com.example.deabroker.Buyer_Tab2;
import com.example.deabroker.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Buyer_Tab1 buyer_tab1 = new Buyer_Tab1();
                return buyer_tab1;

            case 1:
                Buyer_Tab2 buyer_tab2 = new Buyer_Tab2();
                return buyer_tab2;

                default:
                    return null;

        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){

            case 0:
                return "FARMERS";

            case 1:
                return "BOOKING";

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}