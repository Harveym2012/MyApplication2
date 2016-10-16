package com.example.mitchell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        System.out.println("Your favorite scripture is:");
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_second);
        layout.addView(textView, 4444, 4444);
        String message2 = intent.getStringExtra(MainActivity.Chaptor);
        TextView textView2 = new TextView(this);
        textView2.setTextSize(40);
        textView2.setText(message2);
        layout.addView(textView2, 2222, 3333);

        String message3 = intent.getStringExtra(MainActivity.Vorse);
        TextView textView3 = new TextView(this);
        textView3.setTextSize(40);
        textView3.setText(message3);
        layout.addView(textView3,3033, 7777);
    }

}
