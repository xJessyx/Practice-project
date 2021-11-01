package com.example.mycard_ios.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mycard_ios.Fragment.CheckPrizeCollectionRecord;
import com.example.mycard_ios.Fragment.RewardList;

public class FragmentStateAdapter  extends androidx.viewpager2.adapter.FragmentStateAdapter{
    public FragmentStateAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){

            case 0:
                return new RewardList();

            default:
                return new CheckPrizeCollectionRecord();

            }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
