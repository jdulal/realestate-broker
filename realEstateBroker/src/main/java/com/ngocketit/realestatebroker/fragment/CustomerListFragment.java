package com.ngocketit.realestatebroker.fragment;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.text.TextUtils;

import com.ngocketit.realestatebroker.activity.CustomerFormFragmentActivity;
import com.ngocketit.realestatebroker.activity.CustomerViewActivity;
import com.ngocketit.realestatebroker.adapter.BaseCursorAdapter;
import com.ngocketit.realestatebroker.adapter.CustomerListAdapter;
import com.ngocketit.realestatebroker.database.TableColumn;
import com.ngocketit.realestatebroker.provider.ContentDescriptor;

public class CustomerListFragment extends BaseItemListFragment {

	@Override
	protected BaseCursorAdapter createListViewAdapter() {
	    return new CustomerListAdapter(getActivity());
	}
	
	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle args) {
		String selection = null;
		String[] selectionArgs = null;

		String query = getSearchQuery();

		if (!TextUtils.isEmpty(query)) {
			selection = "C." + TableColumn.NAME + " LIKE ? OR locality_name LIKE ? ";

			selectionArgs = new String[] { 
					"%" + query + "%", 
					"%" + query + "%" 
			};
		}

	    CursorLoader cursorLoader = new CursorLoader(getActivity(),
	    	ContentDescriptor.ContentUri.ExtendedUri.CUSTOMER_GROUP_BY_LOCALITY,
	        null, selection, selectionArgs, null);

	    return cursorLoader;
	}
	
	@Override
	public Class<?> getItemViewActivityClass() {
		return CustomerViewActivity.class;
	}
	
	@Override
	public Class<?> getItemViewFragmentClass() {
		return CustomerViewFragment.class;
	}

	@Override
	public Class<?> getItemFormActivityClass() {
		return CustomerFormFragmentActivity.class;
	}

	@Override
	public Class<?> getItemFormFragmentClass() {
		return CustomerFormFragment.class;
	}
}
