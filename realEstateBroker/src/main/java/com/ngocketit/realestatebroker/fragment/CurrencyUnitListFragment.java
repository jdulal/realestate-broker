package com.ngocketit.realestatebroker.fragment;

import com.ngocketit.realestatebroker.activity.CurrencyUnitFormFragmentActivity;
import com.ngocketit.realestatebroker.common.VocabularyType;

public class CurrencyUnitListFragment extends TaxonomyListFragment {
	@Override
	protected boolean isHierarchyEnabled() {
		return false;
	}

	@Override
	protected String getTaxonomyType() {
		return VocabularyType.CURRENCY_UNIT;
	}

	@Override
	public Class<?> getItemFormActivityClass() {
		return CurrencyUnitFormFragmentActivity.class;
	}

	@Override
	public Class<?> getItemFormFragmentClass() {
		return CurrencyUnitFormFragment.class;
	}
}
