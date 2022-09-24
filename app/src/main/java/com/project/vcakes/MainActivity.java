package com.project.vcakes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.project.vcakes.Adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager_home);
        tabLayout = findViewById(R.id.tabLayout_home);

        tabLayout.setupWithViewPager(viewPager);
        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPagerAdapter.add(new HomeFragment(), "HOME");
        viewPagerAdapter.add(new OrderFragment(), "ORDER");
        viewPagerAdapter.add(new ProfileFragment(), "PROFILE");
        viewPager.setAdapter(viewPagerAdapter);
    }
}