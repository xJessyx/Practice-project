package com.example.mycard_ios.Fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.mycard_ios.MainActivity;
import com.example.mycard_ios.R;

import java.text.DateFormat;
import java.util.Calendar;


public class CheckPrizeCollectionRecord extends Fragment {

    private Button dateButton;
    private String currentDate;
    private TextView showDateTextView;

    public CheckPrizeCollectionRecord() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static CheckPrizeCollectionRecord newInstance(String param1, String param2) {
        CheckPrizeCollectionRecord fragment = new CheckPrizeCollectionRecord();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (
                getArguments() != null) {
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_check_prize_collection_record, container, false);
        dateButton =  view.findViewById(R.id.dateButton);
        dateButton.setOnClickListener(new ClickListener());
        return view;
        //return inflater.inflate(R.layout.fragment_check_prize_collection_record, container, false);
    }

    private DatePickerDialog.OnDateSetListener onDate = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(final DatePicker view, final int year, final int month, final int dayOfMonth) {
            Calendar c = Calendar.getInstance();
            c.set(Calendar.YEAR, year);
            c.set(Calendar.MONTH, month);
            c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
            dateButton.setText(currentDate);
        }
    };
    private class ClickListener implements View.OnClickListener {
        @Override
        public void onClick( View v) {
            DatePickerFragment dpf = new DatePickerFragment().newInstance();
            dpf.setCallBack(onDate);
            dpf.show(getFragmentManager().beginTransaction(),"DatePickerFragment");
        }
    }
}