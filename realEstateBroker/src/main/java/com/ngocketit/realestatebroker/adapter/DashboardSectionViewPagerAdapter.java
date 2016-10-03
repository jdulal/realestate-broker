package com.ngocketit.realestatebroker.adapter;

import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ngocketit.realestatebroker.fragment.DashboardSectionItemFragment;

public abstract class DashboardSectionViewPagerAdapter extends FragmentPagerAdapter {
    private Cursor mCursor;

    protected abstract DashboardSectionItemFragment createItem();

    public DashboardSectionViewPagerAdapter(FragmentManager fm, Cursor cursor) {
        super(fm);
        mCursor = cursor;
    }

    @Override
    public Fragment getItem(int position) {
        DashboardSectionItemFragment fragment = createItem();
        fragment.setCursorPosition(position);
        fragment.setCursor(mCursor);

        return fragment;
    }

    @Override
    public int getCount() {
        return mCursor.getCount();
    }
}
