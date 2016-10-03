package com.ngocketit.realestatebroker.fragment.dialog;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;

import com.ngocketit.realestatebroker.adapter.BaseCursorMultipleAdapter;
import com.ngocketit.realestatebroker.adapter.TaxonomyListMultipleAdapter;
import com.ngocketit.realestatebroker.common.VocabularyType;
import com.ngocketit.realestatebroker.database.TableColumn;
import com.ngocketit.realestatebroker.provider.ContentDescriptor;

import java.util.ArrayList;
import java.util.List;

public class TaxonomySelectMultipleFragment extends BaseCursorSelectMultipleDialogFragment {
    private String mVocabularyType = VocabularyType.PROPERTY_STATUS;

    @Override
    protected BaseCursorMultipleAdapter createListAdapter(Context context) {
        return new TaxonomyListMultipleAdapter(context);
    }

    public void setVocabularyType(String type) {
        mVocabularyType = type;
        // TODO: need to restart the loader here or it will use the same loader for different
        // taxonomies
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        if (id == mLoaderId) {
            String selection = "C." + TableColumn.TAXONOMY + " = ? ";
            List<String> selectionArgs = new ArrayList<String>();
            selectionArgs.add(mVocabularyType);

            String[] selectionArgsStr = selectionArgs.toArray(new String[selectionArgs.size()]);

            CursorLoader cursorLoader = new CursorLoader(getActivity(),
                    ContentDescriptor.ContentUri.ExtendedUri.VOCABULARY_GROUP_BY_PARENT,
                    null, selection, selectionArgsStr, null);

            return cursorLoader;
        }

        return null;
    }
}
