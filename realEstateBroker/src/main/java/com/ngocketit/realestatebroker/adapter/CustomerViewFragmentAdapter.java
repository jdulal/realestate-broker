package com.ngocketit.realestatebroker.adapter;

import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ngocketit.realestatebroker.fragment.CustomerViewFragment;
import com.ngocketit.realestatebroker.fragment.PropertyListFragment;

public class CustomerViewFragmentAdapter extends FragmentPagerAdapter {
	private List<Bundle> mFragmentArguments;
	private CustomerViewFragment mProfileFragment;
	private PropertyListFragment mPropertyListFragment;

	public CustomerViewFragmentAdapter(FragmentManager fm, List<Bundle> arguments) {
		super(fm);
		mFragmentArguments = arguments;
	}

	@Override
	public Fragment getItem(int position) {
		Fragment fragment = null;
		
		switch (position) {
		case 0:
			if (mProfileFragment == null) {
				mProfileFragment = new CustomerViewFragment();

				if (mFragmentArguments != null) {
					mProfileFragment.setArguments(mFragmentArguments.get(0));
				}
			}
			fragment = mProfileFragment;
			break;

		case 1:
			if (mPropertyListFragment == null) {
				mPropertyListFragment = new PropertyListFragment();

				if (mFragmentArguments != null) {
					mPropertyListFragment.setArguments(mFragmentArguments.get(1));
				}
			}
			fragment = mPropertyListFragment;
			break;
		}
		
		return fragment;
	}

	@Override
	public int getCount() {
		return 2;
	}

}
