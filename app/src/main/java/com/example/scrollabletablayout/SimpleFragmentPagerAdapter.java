package com.example.scrollabletablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private  String[] tabtitle=new String[] {"Tab_1","Tab_2","Tab_3","Tab_4","Tab_5","Tab_6","Tab_7","Tab_8"};

    private int pagecount=8;

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment1 fragment1=new Fragment1();
        return fragment1;
    }

    @Override
    public int getCount() {
        return pagecount;
    }
    public CharSequence getPageTitle(int position){
        return tabtitle[position];
    }
}
