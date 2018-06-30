package com.example.azat.leandactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter;
    private TextView textVieww;
    private static final String KAY = "KAY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textVieww = findViewById(R.id.counter);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.miuns);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment();
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           dacrement();
            }
        });

    }

    private void dacrement() {
        --counter;
        textVieww.setText(String.valueOf(counter));
    }

    private void increment() {
        ++counter;
        textVieww.setText(String.valueOf(counter));
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("KAY", counter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("KAY");
        textVieww.setText(String.valueOf(counter));
    }
}