package com.ngocketit.realestatebroker.fragment;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.text.TextUtils;

import com.ngocketit.realestatebroker.adapter.BaseCursorAdapter;
import com.ngocketit.realestatebroker.adapter.HierarchicalTaxonomyListAdapter;
import com.ngocketit.realestatebroker.adapter.TaxonomyListAdapter;
import com.ngocketit.realestatebroker.database.TableColumn;
import com.ngocketit.realestatebroker.provider.ContentDescriptor;

import java.util.ArrayList;
import java.util.List;

public abstract class TaxonomyListFragment extends BaseItemListFragment {
	protected boolean isHierarchyEnabled() {
		return true;
	}
	
	protected abstract String getTaxonomyType();

	@Override
	protected BaseCursorAdapter createListViewAdapter() {
	    if (isHierarchyEnabled()) {
	    	return new HierarchicalTaxonomyListAdapter(getActivity());
	    }

        return new TaxonomyListAdapter(getActivity());
	}
	
	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle args) {
		String selection = "C." + TableColumn.TAXONOMY + " = ? ";
		List<String> selectionArgs = new ArrayList<String>();
		selectionArgs.add(getTaxonomyType());

		String query = getSearchQuery();

		if (!TextUtils.isEmpty(query)) {
			selection += " AND C." + TableColumn.TITLE + " LIKE ? ";
			selectionArgs.add("%" + query + "%");
		}

		String[] selectionArgsStr = selectionArgs.toArray(new String[selectionArgs.size()]);

	    CursorLoader cursorLoader = new CursorLoader(getActivity(),
	    	ContentDescriptor.ContentUri.ExtendedUri.VOCABULARY_GROUP_BY_PARENT,
	        null, selection, selectionArgsStr, null);

	    return cursorLoader;
	}
}
