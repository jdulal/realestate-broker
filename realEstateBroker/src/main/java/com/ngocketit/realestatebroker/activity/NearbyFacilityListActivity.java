package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.fragment.NearbyFacilityListFragment;

public class NearbyFacilityListActivity extends TaxonomyListActivity {
    @Override
    protected Class<?> getFragmentClass() {
        return NearbyFacilityListFragment.class;
    }
}
