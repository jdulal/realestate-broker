package com.ngocketit.realestatebroker.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ngocketit.realestatebroker.R;
import com.ngocketit.realestatebroker.adapter.PhotoFullscreenSliderViewPagerAdapter;

import java.util.List;

public class PhotoFullscreenSliderFragment extends BaseFragment {
    public static final String PHOTO_POSITION = "item_position";
    public static final String PHOTO_PATHS = "photo_paths";

    private ViewPager mPhotoViewPager;
    private PhotoFullscreenSliderViewPagerAdapter mPhotoAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photo_fullscreen_slider, container, false);

        mPhotoViewPager = (ViewPager)view.findViewById(R.id.pager);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Bundle args = getArguments();

        List<String> photoPaths = null;
        int currentPos = 0;

        if (args != null) {
            if (args.containsKey(PHOTO_PATHS)) {
                photoPaths = args.getStringArrayList(PHOTO_PATHS);
            }
            if (args.containsKey(PHOTO_POSITION)) {
                currentPos = args.getInt(PHOTO_POSITION);
            }
        }

        if (photoPaths != null) {
            mPhotoAdapter = new PhotoFullscreenSliderViewPagerAdapter(getActivity(), photoPaths);
            mPhotoViewPager.setAdapter(mPhotoAdapter);
            mPhotoViewPager.setCurrentItem(currentPos);
        }
    }
}
