package com.ngocketit.realestatebroker.activity;

import android.database.Cursor;
import android.os.Bundle;

import com.ngocketit.realestatebroker.database.TableColumn;
import com.ngocketit.realestatebroker.fragment.CustomerListFragment;
import com.ngocketit.realestatebroker.util.CursorUtils;

public class CustomerListActivity extends BaseItemListFragmentActivity {
    @Override
    protected Class<?> getFragmentClass() {
        return CustomerListFragment.class;
    }

    @Override
    protected Bundle getIntentPickResult(Cursor cursor) {
        Bundle result = super.getIntentPickResult(cursor);

        result.putString(TableColumn.NAME, CursorUtils.getRecordStringValue(cursor, TableColumn.NAME));
        result.putString(TableColumn.THUMBNAIL_PATH, CursorUtils.getRecordStringValue(cursor, TableColumn.THUMBNAIL_PATH));

        return  result;
    }
}
