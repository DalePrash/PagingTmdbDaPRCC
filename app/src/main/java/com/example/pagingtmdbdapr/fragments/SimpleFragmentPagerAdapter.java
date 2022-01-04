package com.example.pagingtmdbdapr.fragments;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentPagerAdapter;




//import android.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentPagerAdapter;
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Fragment[] childFragments;


    public SimpleFragmentPagerAdapter(
            FragmentManager fm)
    {
        super(fm);
        childFragments = new Fragment[]{
                new FragmentXA(),
                new FragmentXB(),
                new FragmentXc()
        };
    }


    @Override
    public Fragment getItem(int position) {
        return childFragments[position];
    }
        /*
        if (position == 0) {
            return new FragmentXA();
        }
        else if (position == 1) {
            return new FragmentXB();
        }
        else {
            return new FragmentXc();
        }

         */


    @Override
    public int getCount()
    {

        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = getItem(position).getClass().getName();
        return title.subSequence(title.lastIndexOf(".") + 1, title.length());
    }

}
