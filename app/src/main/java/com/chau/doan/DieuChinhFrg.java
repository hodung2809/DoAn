package com.chau.doan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class DieuChinhFrg extends FragmentPagerAdapter {
    private List<Fragment> fragmentList1 = new ArrayList<>();
    private List<String> titlist1 = new ArrayList<>();
    public DieuChinhFrg(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList1.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList1.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titlist1.get(position);
    }

    public void addTab(Fragment fragment, String title)
    {
        fragmentList1.add(fragment);
        titlist1.add(title);
    }
}
