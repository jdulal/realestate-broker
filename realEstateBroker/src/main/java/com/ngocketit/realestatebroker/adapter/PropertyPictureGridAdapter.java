package com.ngocketit.realestatebroker.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.util.MediaUtils;

import java.util.ArrayList;
import java.util.List;

public class PropertyPictureGridAdapter extends BaseAdapter {
    private Context mContext;
    List<String> mPicturePaths = new ArrayList<String>();

    public PropertyPictureGridAdapter(Context context) {
        mContext = context;
    }

    public void setPictures(List<String> paths) {
        mPicturePaths.addAll(paths);
        notifyDataSetChanged();
    }

    public void addPicture(String path) {
        mPicturePaths.add(path);
        notifyDataSetChanged();
    }

    public void removePicture(String path) {
        mPicturePaths.remove(path);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mPicturePaths.size();
    }

    @Override
    public Object getItem(int i) {
        return mPicturePaths.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater lif = LayoutInflater.from(mContext);
            view = lif.inflate(R.layout.grid_item_property_picture, null);
        }

        String path = (String)getItem(i);
        MediaUtils.setImageFromFile((ImageView)view, path);

        return view;
    }
}
