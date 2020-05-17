package com.vincent.music_voice.view.discovery;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * 首页发现fragment
 */
public class DiscoryFragment extends Fragment {

    private Context mContext;
    /*
     *  UI
     */


    public static Fragment newInstance() {
        DiscoryFragment fragment = new DiscoryFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }

}
