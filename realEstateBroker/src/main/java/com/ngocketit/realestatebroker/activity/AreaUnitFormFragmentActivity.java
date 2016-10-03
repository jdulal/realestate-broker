package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.fragment.AreaUnitFormFragment;

public class AreaUnitFormFragmentActivity extends TaxonomyFormFragmentActivity {

	@Override
	protected int getTitleResource() {
		return R.string.add_area_unit;
	}

    @Override
    protected Class<?> getFragmentClass() {
        return AreaUnitFormFragment.class;
    }

    @Override
	protected int getEditModeTitleResource() {
		return R.string.edit_area_unit;
	}
}
