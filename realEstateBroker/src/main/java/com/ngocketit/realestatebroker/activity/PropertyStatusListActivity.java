package com.ngocketit.realestatebroker.activity;

import com.ngocketit.realestatebroker.fragment.PropertyStatusListFragment;

public class PropertyStatusListActivity extends TaxonomyListActivity {
    @Override
    protected Class<?> getFragmentClass() {
        return PropertyStatusListFragment.class;
    }
}
