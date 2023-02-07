package com.example.voisetext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lay=(ConstraintLayout)findViewById(R.id.layout);
        lay.setBackgroundResource(R.drawable.rr);
    }

    public void start(View view) {
        Intent st=new Intent(this,Voice.class);
        startActivity(st);
        finish();
    }
}