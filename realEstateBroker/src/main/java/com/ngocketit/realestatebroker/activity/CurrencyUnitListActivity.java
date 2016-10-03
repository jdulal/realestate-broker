package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.fragment.CurrencyUnitListFragment;

public class CurrencyUnitListActivity extends TaxonomyListActivity {

    @Override
    protected Class<?> getFragmentClass() {
        return CurrencyUnitListFragment.class;
    }
}
