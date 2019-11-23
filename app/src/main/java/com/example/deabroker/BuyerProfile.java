package com.example.deabroker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class BuyerProfile extends AppCompatActivity {

    private ViewPager viewPager;
    private BuyerViewPagerAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_profile);

        viewPager = findViewById(R.id.viewpager);
        adapter = new BuyerViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);
    }
}
