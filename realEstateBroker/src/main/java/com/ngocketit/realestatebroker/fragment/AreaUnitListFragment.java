package com.ngocketit.realestatebroker.fragment;

import com.ngocketit.realestatebroker.activity.AreaUnitFormFragmentActivity;
import com.ngocketit.realestatebroker.common.VocabularyType;

public class AreaUnitListFragment extends TaxonomyListFragment {
	@Override
	protected boolean isHierarchyEnabled() {
		return false;
	}

	@Override
	protected String getTaxonomyType() {
		return VocabularyType.AREA_UNIT;
	}

	@Override
	public Class<?> getItemFormActivityClass() {
		return AreaUnitFormFragmentActivity.class;
	}

	@Override
	public Class<?> getItemFormFragmentClass() {
		return AreaUnitFormFragment.class;
	}
}
