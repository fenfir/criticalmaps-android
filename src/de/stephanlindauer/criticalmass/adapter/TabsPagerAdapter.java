package de.stephanlindauer.criticalmass.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import de.stephanlindauer.criticalmass.fragments.AboutFragment;
import de.stephanlindauer.criticalmass.fragments.ChatFragment;
import de.stephanlindauer.criticalmass.fragments.MapFragment;
import de.stephanlindauer.criticalmass.fragments.RulesFragment;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        switch (index) {
            case 0:
                return new MapFragment();
            case 1:
                return new RulesFragment();
            case 2:
                return new ChatFragment();
            case 3:
                return new AboutFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
