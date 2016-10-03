package com.ngocketit.realestatebroker.fragment;

import com.ngocketit.realestatebroker.common.VocabularyType;

public class AmenityFormFragment extends TaxonomyFormFragment {
	@Override
	protected boolean isHierarchyEnabled() {
		return false;
	}

	@Override
	protected String getVocabularyName() {
		return VocabularyType.AMENITY;
	}
}
