package com.bignerdranch.android.hellomoon;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;


public class VideoContainerFragment extends Fragment {

    private MediaPlayer   mPlayer;
    private SurfaceHolder mSurfaceHolder;
     VideoView vid;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_hello_moon_video, container, false);

        vid = (VideoView) v.findViewById(R.id.videoSurface);
        vid.setVideoPath("F:/AndroidProject/HelloMoon2/app/src/main/res/raw/apollo_17_stroll.mpg");

        vid.setMediaController(new MediaController(getActivity()));
        vid.start();
        vid.requestFocus();


        return v;
    }}

