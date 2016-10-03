package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.fragment.AreaUnitListFragment;

public class AreaUnitListActivity extends TaxonomyListActivity {
    @Override
    protected Class<?> getFragmentClass() {
        return AreaUnitListFragment.class;
    }
}
