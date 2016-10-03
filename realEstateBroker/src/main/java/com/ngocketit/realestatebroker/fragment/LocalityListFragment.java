package com.ngocketit.realestatebroker.fragment;

import com.ngocketit.realestatebroker.activity.LocalityFormFragmentActivity;
import com.ngocketit.realestatebroker.common.VocabularyType;

public class LocalityListFragment extends TaxonomyListFragment {

	@Override
	protected String getTaxonomyType() {
		return VocabularyType.LOCALITY;
	}

	@Override
	public Class<?> getItemFormActivityClass() {
		return LocalityFormFragmentActivity.class;
	}

	@Override
	public Class<?> getItemFormFragmentClass() {
		return LocalityFormFragment.class;
	}

}
