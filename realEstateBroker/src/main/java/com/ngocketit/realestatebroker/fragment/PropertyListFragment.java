package com.ngocketit.realestatebroker.fragment;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.text.TextUtils;

import com.ngocketit.realestatebroker.activity.PropertyFormActivity;
import com.ngocketit.realestatebroker.activity.PropertyViewFragmentActivity;
import com.ngocketit.realestatebroker.adapter.BaseCursorAdapter;
import com.ngocketit.realestatebroker.adapter.PropertyListAdapter;
import com.ngocketit.realestatebroker.database.TableColumn;
import com.ngocketit.realestatebroker.provider.ContentDescriptor;

public class PropertyListFragment extends BaseItemListFragment {

	@Override
	public Class<?> getItemFormActivityClass() {
		return PropertyFormActivity.class;
	}

	@Override
	public Class<?> getItemFormFragmentClass() {
		return PropertyFormFragment.class;
	}

    @Override
    public Class<?> getItemViewFragmentClass() {
        return PropertyViewFragment.class;
    }

    @Override
    public Class<?> getItemViewActivityClass() {
        return PropertyViewFragmentActivity.class;
    }

    @Override
    protected BaseCursorAdapter createListViewAdapter() {
        return new PropertyListAdapter(getActivity());
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        String selection = null;
        String[] selectionArgs = null;

        String query = getSearchQuery();

        if (!TextUtils.isEmpty(query)) {
            selection = "P." + TableColumn.NAME + " LIKE ? OR locality_name LIKE ? ";

            selectionArgs = new String[] {
                    "%" + query + "%",
                    "%" + query + "%"
            };
        }

        CursorLoader cursorLoader = new CursorLoader(getActivity(),
                                                     ContentDescriptor.ContentUri.ExtendedUri.PROPERTY_GROUP_BY_LOCALITY,
                                                     null, selection, selectionArgs, null);

        return cursorLoader;
    }

}
