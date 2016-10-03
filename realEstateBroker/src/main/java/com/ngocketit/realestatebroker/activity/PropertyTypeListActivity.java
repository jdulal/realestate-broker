package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.fragment.PropertyTypeListFragment;

public class PropertyTypeListActivity extends TaxonomyListActivity {

    @Override
    protected Class<?> getFragmentClass() {
        return PropertyTypeListFragment.class;
    }
}
