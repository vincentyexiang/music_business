package com.vincent.music_voice.view.friend;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * 首页发现fragment
 */
public class FriendFragment extends Fragment {

    private Context mContext;
    /*
     * UI
     */

    /*
     * data
     */


    public static Fragment newInstance() {
        FriendFragment fragment = new FriendFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }
}
