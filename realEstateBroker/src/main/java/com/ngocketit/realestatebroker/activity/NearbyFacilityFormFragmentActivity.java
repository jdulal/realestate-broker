package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.fragment.NearbyFacilityFormFragment;

public class NearbyFacilityFormFragmentActivity extends TaxonomyFormFragmentActivity {

    @Override
    protected Class<?> getFragmentClass() {
        return NearbyFacilityFormFragment.class;
    }

    @Override
	protected int getEditModeTitleResource() {
		return R.string.edit_facility;
	}
	
	@Override
	protected int getTitleResource() {
		return R.string.add_facility;
	}

}
