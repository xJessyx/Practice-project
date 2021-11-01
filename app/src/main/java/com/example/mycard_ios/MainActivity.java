package com.example.mycard_ios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn, btn2;
    EditText phone;
    Spinner spn;
    Intent a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        phone = findViewById(R.id.editTextPhone);
        spn  = findViewById(R.id.spinner);
        btn2.setOnClickListener(this);
        btn.setOnClickListener(this);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.spn_list,android.R.layout.simple_dropdown_item_1line);
        spn.setAdapter(adapter1);

//        btn2.setOnTouchListener(new View.OnTouchListener() {
//            public boolean onTouch(View v, MotionEvent event) {
//                switch (event.getAction()) {
//
//                    case MotionEvent.ACTION_DOWN:
//                        btn2.setBackgroundColor(getResources().getColor(R.color.white));
//                        btn2.setTextColor(Color.rgb(76,72,170));
//                        break;
//
//                    case MotionEvent.ACTION_UP:
//                        btn2.setBackgroundColor(getResources().getColor(R.color.purple));
//                        btn2.setTextColor(Color.rgb(255,255,255));
//                        break;
//                }
//                return true;
//            }
//        });

//
//                btn.setOnTouchListener(new View.OnTouchListener() {
//
//                    public boolean onTouch(View v, MotionEvent event) {
//                        switch (event.getAction()) {
//
//                            case MotionEvent.ACTION_DOWN:
//                                btn.setBackgroundColor(getResources().getColor(R.color.white));
//                                btn.setTextColor(Color.rgb(76,72,170));
//                                break;
//
//                            case MotionEvent.ACTION_UP:
//                                btn.setBackgroundColor(getResources().getColor(R.color.purple));
//                                btn.setTextColor(Color.rgb(255,255,255));
//                                break;
//                        }
//                        return true;
//                    }
//                });

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button:
                b = new Intent(this  , Awardsarea.class);
                startActivity(b);
                break;
            case R.id.button2 :
                a = new Intent(this  , Password.class);
                startActivity(a);
                // MainActivity.this.finish();
                break;


        }

    }
}