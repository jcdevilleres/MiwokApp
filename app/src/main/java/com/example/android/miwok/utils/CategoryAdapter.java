package com.example.android.miwok.utils;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.miwok.fragments.ColorsFragment;
import com.example.android.miwok.fragments.FamilyFragment;
import com.example.android.miwok.fragments.NumbersFragment;
import com.example.android.miwok.fragments.PhrasesFragment;

/**
 * Created by Jean Claude on 1/15/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Numbers", "Family", "Colors", "Phrases" };
    private Context context;

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
