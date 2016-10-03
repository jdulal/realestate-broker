package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.fragment.AmenityListFragment;

public class AmenityListActivity extends TaxonomyListActivity {
    @Override
    protected Class<?> getFragmentClass() {
        return AmenityListFragment.class;
    }
}
