package com.ngocketit.realestatebroker.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ngocketit.realestatebroker.fragment.BasePropertySectionFormFragment;

import java.util.List;

public class PropertyFormFragmentAdapter extends FragmentStatePagerAdapter {
	List<BasePropertySectionFormFragment> mFragments;

	public PropertyFormFragmentAdapter(FragmentManager fm, List<BasePropertySectionFormFragment> fragments) {
		super(fm);
		mFragments = fragments;
	}

	@Override
	public Fragment getItem(int position) {
		return mFragments.get(position);
	}

	@Override
	public int getCount() {
		return mFragments.size();
	}

}
