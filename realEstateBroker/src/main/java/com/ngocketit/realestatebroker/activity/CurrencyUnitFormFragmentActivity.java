package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.fragment.CurrencyUnitFormFragment;

public class CurrencyUnitFormFragmentActivity extends TaxonomyFormFragmentActivity {
    @Override
    protected Class<?> getFragmentClass() {
        return CurrencyUnitFormFragment.class;
    }

    @Override
	protected int getEditModeTitleResource() {
		return R.string.edit_currency_unit;
	}
	
	@Override
	protected int getTitleResource() {
		return R.string.add_currency_unit;
	}
}
