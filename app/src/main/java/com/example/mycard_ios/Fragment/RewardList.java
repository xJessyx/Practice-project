package com.example.mycard_ios.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mycard_ios.R;

public class RewardList extends Fragment {

    public RewardList() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static RewardList newInstance(String param1, String param2) {
        RewardList fragment = new RewardList();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_reward_list, container, false);
    }
}