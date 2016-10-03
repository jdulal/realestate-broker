package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.fragment.PropertyViewFragment;

public class PropertyViewFragmentActivity extends BaseItemViewFragmentActivity {

	@Override
	protected Class<?> getFragmentClass() {
        return PropertyViewFragment.class;
	}

	@Override
	protected Class<?> getItemFormActivityClass() {
        return PropertyFormActivity.class;
	}
}
