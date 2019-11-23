package com.example.deabroker.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.deabroker.Farmer_Tab1;
import com.example.deabroker.Farmer_Tab2;
import com.example.deabroker.Farmer_Tab3;
import com.example.deabroker.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3 };
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Farmer_Tab1 farmer_tab1 = new Farmer_Tab1();
                return farmer_tab1;

            case 1:
                Farmer_Tab2 farmer_tab2 = new Farmer_Tab2();
                return farmer_tab2;

          /*  case2:
                Farmer_Tab3 farmer_tab3 = new Farmer_Tab3();
                return farmer_tab3; */

            case 2:
                Farmer_Tab3 farmer_tab3 = new Farmer_Tab3();
                return farmer_tab3;


            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "PRODUCTS";

            case 1:
                return "ORDERS";

            case 2:
                return "EDUCATION";

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}