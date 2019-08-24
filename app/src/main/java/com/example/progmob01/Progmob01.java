package com.example.progmob01;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Progmob01 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progmob01_activity);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("test");
    }
}