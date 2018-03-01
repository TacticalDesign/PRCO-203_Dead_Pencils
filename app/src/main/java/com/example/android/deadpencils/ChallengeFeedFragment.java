package com.example.android.deadpencils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by adamj on 01/03/2018.
 */

public class ChallengeFeedFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Challenge Feed");
        return inflater.inflate(R.layout.fragment_challenge_feed, null);

    }
}
