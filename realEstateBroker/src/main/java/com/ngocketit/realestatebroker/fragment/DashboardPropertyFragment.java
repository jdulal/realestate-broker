package com.ngocketit.realestatebroker.fragment;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.activity.PropertyFormActivity;
import com.ngocketit.realestatebroker.adapter.DashboardSectionViewPagerAdapter;
import com.ngocketit.realestatebroker.provider.ContentDescriptor;
import com.ngocketit.realestatebroker.util.ViewUtils;

public class DashboardPropertyFragment extends DashboardSectionFragment {
    @Override
    protected Class<?> getItemFormActivityClass() {
        return PropertyFormActivity.class;
    }

    @Override
    protected int getEmptyMessage() {
        return R.string.no_properties;
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        CursorLoader loader = new CursorLoader(getActivity(),
                                               ContentDescriptor.ContentUri.ExtendedUri.PROPERTY_LATEST,
                                               null,
                                               null,
                                               new String[]{"5"},
                                               null);

        return loader;
    }

    @Override
    protected DashboardSectionViewPagerAdapter createViewPagerAdapter(FragmentManager fm, Cursor cursor) {
        return new DashboardSectionViewPagerAdapter(fm, cursor) {
            @Override
            protected DashboardSectionItemFragment createItem() {
                return new DashboardPropertyItemFragment();
            }
        };
    }

    @Override
    protected int getOffscreenPageLimit() {
        return 5;
    }

    @Override
    protected void setupContentView(Cursor cursor) {
        super.setupContentView(cursor);
        int screenWidth = ViewUtils.getScreenWidth(getActivity());
        mPager.getLayoutParams().width = screenWidth;
        mPager.getLayoutParams().height = screenWidth * 9/16;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
