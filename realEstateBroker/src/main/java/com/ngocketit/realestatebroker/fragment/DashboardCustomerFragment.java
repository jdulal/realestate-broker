package com.ngocketit.realestatebroker.fragment;

import android.database.Cursor;
import android.support.v4.app.FragmentManager;
import android.view.View;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.activity.CustomerFormFragmentActivity;
import com.ngocketit.realestatebroker.adapter.DashboardSectionViewPagerAdapter;

public class DashboardCustomerFragment extends DashboardSectionFragment {
    @Override
    protected Class<?> getItemFormActivityClass() {
        return CustomerFormFragmentActivity.class;
    }

    @Override
    protected DashboardSectionViewPagerAdapter createViewPagerAdapter(FragmentManager fm, Cursor cursor) {
        return null;
    }

    @Override
    protected View createContentView(Cursor cursor) {
        return null;
    }

    @Override
    protected int getEmptyMessage() {
        return R.string.no_customers;
    }
}
