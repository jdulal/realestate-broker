package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.fragment.LocalityListFragment;

public class LocalityListActivity extends TaxonomyListActivity {

    @Override
    protected Class<?> getFragmentClass() {
        return LocalityListFragment.class;
    }
}
