package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.fragment.AmenityFormFragment;

public class AmenityFormFragmentActivity extends TaxonomyFormFragmentActivity {

	@Override
	protected int getTitleResource() {
		return R.string.add_amenity;
	}

    @Override
    protected Class<?> getFragmentClass() {
        return AmenityFormFragment.class;
    }

    @Override
	protected int getEditModeTitleResource() {
		return R.string.edit_amenity;
	}
}
