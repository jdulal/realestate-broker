package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.fragment.LocalityFormFragment;

public class LocalityFormFragmentActivity extends TaxonomyFormFragmentActivity {

    @Override
    protected Class<?> getFragmentClass() {
        return LocalityFormFragment.class;
    }

    @Override
	protected int getEditModeTitleResource() {
		return R.string.edit_locality;
	}
	
	@Override
	protected int getTitleResource() {
		return R.string.add_locality;
	}
}
