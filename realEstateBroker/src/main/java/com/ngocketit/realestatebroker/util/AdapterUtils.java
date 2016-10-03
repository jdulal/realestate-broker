package com.ngocketit.realestatebroker.util;

import android.content.Context;
import android.support.v4.widget.SimpleCursorAdapter;

import com.ngocketit.realestatebroker.adapter.TaxonomySpinnerAdapter;

public class AdapterUtils {
	public static SimpleCursorAdapter createTaxonomySpinnerAdapter(Context context) {
		SimpleCursorAdapter adapter = null;
		
		adapter = new TaxonomySpinnerAdapter(context);
		adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
		
		return adapter;
	}
}
