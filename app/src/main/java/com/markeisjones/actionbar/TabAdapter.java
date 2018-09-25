package com.markeisjones.actionbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter  extends FragmentStatePagerAdapter{

    private final List<Fragment> mFragList = new ArrayList<>();



    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragList.get(position);
    }

    @Override
    public int getCount() {
        return mFragList.size();
    }
    public void addFragment(Fragment fragment){

        mFragList.add(fragment);
    }
}
