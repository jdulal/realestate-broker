package com.ngocketit.realestatebroker.fragment;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.common.VocabularyType;

public class CurrencyUnitFormFragment extends TaxonomyFormFragment {
	@Override
	protected boolean isHierarchyEnabled() {
		return false;
	}

	@Override
	protected String getVocabularyName() {
		return VocabularyType.CURRENCY_UNIT;
	}

    @Override
    protected int getDescriptionFieldHint() {
        return R.string.currency_symbol;
    }
}
