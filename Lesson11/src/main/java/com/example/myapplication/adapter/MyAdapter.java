package com.example.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.myapplication.fragment.rdFragment;
import com.example.myapplication.fragment.shFragment;
import com.example.myapplication.fragment.tjFragment;
import com.example.myapplication.fragment.tzFragment;

/**
 * Created by Administrator on 2018/11/9.
 */

public class MyAdapter extends FragmentPagerAdapter {
    private String[] mTitles = new String[]{"推荐", "热点", "泰州", "社会"};

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new rdFragment();
            case 2:
                return  new tzFragment();
            case 3:
                return new shFragment();
        }
        return new tjFragment();
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }
    public CharSequence getPageTitle(int position){
        return mTitles[position];
    }
}
