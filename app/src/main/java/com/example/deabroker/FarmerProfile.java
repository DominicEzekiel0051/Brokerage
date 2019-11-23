package com.example.deabroker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.webkit.WebChromeClient;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class FarmerProfile extends AppCompatActivity {

    private ViewPager viewPager;
    private BuyerViewPagerAdapter adapter;
    private TabLayout tabLayout;
    private TabItem tabItems;
    private WebChromeClient.CustomViewCallback customView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_profile);

        viewPager = findViewById(R.id.viewpager);
        adapter = new BuyerViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);
    }


}
