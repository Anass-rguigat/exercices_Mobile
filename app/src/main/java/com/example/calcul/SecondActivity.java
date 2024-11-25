package com.example.calcul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button back,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        back = findViewById(R.id.back);
        back.setOnClickListener(this);
        exit = findViewById(R.id.exit2);
        exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.back) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.exit2) {
            finishAffinity();
        }
    }
}
