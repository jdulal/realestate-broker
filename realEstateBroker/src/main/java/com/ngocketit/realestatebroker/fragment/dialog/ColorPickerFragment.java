package com.ngocketit.realestatebroker.fragment.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;

import com.ngocketit.realestatebroker.adapter.ColorPickerListAdapter;
import com.ngocketit.realestatebroker.model.ColorPickerItem;

import java.util.List;

public class ColorPickerFragment extends DialogFragment {
    Dialog.OnClickListener mClickListener;
    private List<ColorPickerItem> mItems;
    int mTitleRes = 0;

    public void setOnClickListener(DialogInterface.OnClickListener listener) {
        mClickListener = listener;
    }

    public void setItems(List<ColorPickerItem> items) {
        mItems = items;
    }

    public void setTitle(int titleRes) {
        mTitleRes = titleRes;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final FragmentActivity activity = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        ColorPickerListAdapter adapter = new ColorPickerListAdapter(activity, 0, mItems);
        builder.setAdapter(adapter, mClickListener);

        if (mTitleRes > 0) {
            builder.setTitle(mTitleRes);
        }

        return builder.create();
    }
}
