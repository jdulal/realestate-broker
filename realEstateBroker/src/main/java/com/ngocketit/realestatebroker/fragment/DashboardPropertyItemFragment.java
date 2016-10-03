package com.ngocketit.realestatebroker.fragment;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.activity.PropertyViewFragmentActivity;
import com.ngocketit.realestatebroker.database.TableColumn;
import com.ngocketit.realestatebroker.util.CursorUtils;
import com.ngocketit.realestatebroker.util.ViewUtils;
import com.squareup.picasso.Picasso;

public class DashboardPropertyItemFragment extends DashboardSectionItemFragment {
    private int mImageWidth;
    private ImageView mImgView;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mImageWidth = ViewUtils.getContentAreaWidth(getActivity(), 8);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    protected int getContentView() {
        return R.layout.list_item_property_dashboard;
    }

    @Override
    protected Class<?> getItemViewActivityClass() {
        return PropertyViewFragmentActivity.class;
    }

    public static DashboardPropertyItemFragment newInstance(int position, Cursor cursor) {
        DashboardPropertyItemFragment item = new DashboardPropertyItemFragment();
        item.setCursor(cursor);
        item.setCursorPosition(position);

        return item;
    }

    @Override
    protected void setupView(View view, Cursor cursor) {
        mImgView = (ImageView)view.findViewById(R.id.imgCoverPic);
        TextView txtTitle = (TextView)view.findViewById(R.id.txtTitle);
        txtTitle.setText(CursorUtils.getRecordStringValue(cursor, TableColumn.NAME));

        mImgView.getLayoutParams().width = mImageWidth;
        mImgView.getLayoutParams().height = mImageWidth * 9/16;

        String coverPath = CursorUtils.getRecordStringValue(cursor, TableColumn.COVER_PIC_PATH);
        if (!TextUtils.isEmpty(coverPath)) {
            /*MediaUtils.setImageThumbnailAsync(mImgView,
                                              coverPath,
                                              mImageWidth,
                                              mImageWidth * 9/16,
                                              ThumbnailType.PROPERTY,
                                              null);*/
            Picasso.with(getActivity())
                    .load("file://" + coverPath)
                    .resize(mImageWidth, mImageWidth * 9/16)
                    .into(mImgView);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //MediaUtils.recycleImageView(mImgView);
    }
}
