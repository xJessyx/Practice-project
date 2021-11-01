package com.example.mycard_ios;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class Password extends AppCompatActivity implements View.OnClickListener {
    Button btn_yes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        btn_yes  = findViewById(R.id.yes);
        btn_yes.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
      Intent intent = new Intent(this  , Verification.class);
        startActivity(intent);
        //Password.this.finish();
    }
}