package com.ngocketit.realestatebroker.fragment;

import com.ngocketit.realestatebroker.activity.AmenityFormFragmentActivity;
import com.ngocketit.realestatebroker.common.VocabularyType;

public class AmenityListFragment extends TaxonomyListFragment {
	@Override
	protected boolean isHierarchyEnabled() {
		return false;
	}

	@Override
	protected String getTaxonomyType() {
		return VocabularyType.AMENITY;
	}

	@Override
	public Class<?> getItemFormActivityClass() {
        return AmenityFormFragmentActivity.class;
	}

	@Override
	public Class<?> getItemFormFragmentClass() {
        return AmenityFormFragment.class;
	}
}
