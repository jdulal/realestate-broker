package com.ngocketit.realestatebroker.fragment;

import com.ngocketit.realestatebroker.activity.PropertyStatusFormFragmentActivity;
import com.ngocketit.realestatebroker.common.VocabularyType;

public class PropertyStatusListFragment extends TaxonomyListFragment {
	@Override
	protected boolean isHierarchyEnabled() {
		return false;
	}
	
	@Override
	protected String getTaxonomyType() {
		return VocabularyType.PROPERTY_STATUS;
	}

	@Override
	public Class<?> getItemFormActivityClass() {
		return PropertyStatusFormFragmentActivity.class;
	}

	@Override
	public Class<?> getItemFormFragmentClass() {
		return PropertyFormFragment.class;
	}
}
