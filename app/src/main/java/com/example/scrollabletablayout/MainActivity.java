package com.example.scrollabletablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

TabLayout tabLayout;
ViewPager viewPager;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      tabLayout=findViewById(R.id.tab);
      viewPager=findViewById(R.id.view_pager);
      toolbar=findViewById(R.id.toolbarid);
      setSupportActionBar(toolbar);
      SimpleFragmentPagerAdapter adapter=new SimpleFragmentPagerAdapter(getSupportFragmentManager());
      viewPager.setAdapter(adapter);
      tabLayout.setupWithViewPager(viewPager);

    }
}
