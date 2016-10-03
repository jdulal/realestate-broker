package com.ngocketit.realestatebroker.fragment;

import com.ngocketit.realestatebroker.activity.PropertyTypeFormFragmentActivity;
import com.ngocketit.realestatebroker.common.VocabularyType;

public class PropertyTypeListFragment extends TaxonomyListFragment {
	@Override
	protected boolean isHierarchyEnabled() {
		return false;
	}
	
	@Override
	protected String getTaxonomyType() {
		return VocabularyType.PROPERTY_TYPE;
	}

	@Override
	public Class<?> getItemFormActivityClass() {
		return PropertyTypeFormFragmentActivity.class;
	}

	@Override
	public Class<?> getItemFormFragmentClass() {
		return PropertyTypeFormFragment.class;
	}
}
