package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.fragment.PropertyStatusFormFragment;

public class PropertyStatusFormFragmentActivity extends TaxonomyFormFragmentActivity {
    @Override
    protected Class<?> getFragmentClass() {
        return PropertyStatusFormFragment.class;
    }

    @Override
	protected int getEditModeTitleResource() {
		return R.string.edit_property_status;
	}
	
	@Override
	protected int getTitleResource() {
		return R.string.add_property_status;
	}
}
