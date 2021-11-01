package com.example.mycard_ios.Fragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mycard_ios.R;

import java.util.Calendar;


public class DatePickerFragment extends Fragment {
    DatePickerDialog.OnDateSetListener onDateSet;
    public DatePickerFragment(){

    }
    public static DatePickerFragment newInstance() {
        DatePickerFragment frag = new DatePickerFragment();
        return frag;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @NonNull
    public Dialog onCreateDialog(@Nullable final Bundle savedInstanceState) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(),onDateSet,year,month,day);
    }
    public void setCallBack(DatePickerDialog.OnDateSetListener onDate) {
        onDateSet = onDate;
    }


    public void show(FragmentTransaction beginTransaction, String datePickerFragment) {
    }
}