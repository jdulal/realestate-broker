package com.ngocketit.realestatebroker.fragment;

import com.ngocketit.realestatebroker.activity.NearbyFacilityFormFragmentActivity;
import com.ngocketit.realestatebroker.common.VocabularyType;

public class NearbyFacilityListFragment extends TaxonomyListFragment {
	@Override
	protected String getTaxonomyType() {
		return VocabularyType.FACILITY;
	}

	@Override
	public Class<?> getItemFormActivityClass() {
		return NearbyFacilityFormFragmentActivity.class;
	}

	@Override
	public Class<?> getItemFormFragmentClass() {
		return NearbyFacilityFormFragment.class;
	}
}
