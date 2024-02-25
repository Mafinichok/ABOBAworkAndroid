package com.example.aboba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button knopka;
    private Button tonext;
    //private Intent aboba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        knopka = findViewById(R.id.knopka);
        knopka.setOnClickListener(this::OnClick);

        tonext = findViewById(R.id.tonext);
        tonext.setOnClickListener(this::OnClick);

    }
    public void OnClick(View v) {
        if (v.getId() == R.id.knopka){

            knopka.setBackgroundTintList(getColorStateList(R.color.GREEN));
        }
        else{
            Intent aboba = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(aboba);
        }
    }
}