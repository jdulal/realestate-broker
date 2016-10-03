package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.fragment.PropertyTypeFormFragment;

public class PropertyTypeFormFragmentActivity extends TaxonomyFormFragmentActivity {

    @Override
    protected Class<?> getFragmentClass() {
        return PropertyTypeFormFragment.class;
    }

    @Override
	protected int getEditModeTitleResource() {
		return R.string.edit_property_type;
	}
	
	@Override
	protected int getTitleResource() {
		return R.string.add_property_type;
	}
}
