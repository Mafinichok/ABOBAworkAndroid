package com.example.aboba;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_main2);
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
    }

}
