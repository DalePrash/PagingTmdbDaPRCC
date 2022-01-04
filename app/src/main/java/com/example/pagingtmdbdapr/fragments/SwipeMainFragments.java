package com.example.pagingtmdbdapr.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.pagingtmdbdapr.R;
import com.google.android.material.tabs.TabLayout;

public class SwipeMainFragments extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager_main_x);
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new SimpleFragmentPagerAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
      //  tabLayout.setUpWithViewPager(viewPager);
    }
}
