package com.example.demoviewpagernavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.demoviewpagernavigation.fragments.FirstFragment;
import com.example.demoviewpagernavigation.fragments.SecondFragment;
import com.example.demoviewpagernavigation.fragments.ThirdFragment;

import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> fragments = List.of(
            new FirstFragment(),
            new SecondFragment(),
            new ThirdFragment()
    );

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
