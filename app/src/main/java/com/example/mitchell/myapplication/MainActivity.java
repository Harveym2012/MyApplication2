package com.example.mitchell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.mitchell.myapplication.R.id.book;
import static com.example.mitchell.myapplication.R.id.chapter;
import static com.example.mitchell.myapplication.R.id.verse;


public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "wat";
    public final static String Chaptor = "wa2t";
    public final static String Vorse = "wa3t";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        //intent.putExtra("book", findViewById(book);
        //intent.putExtra("chapter", findViewById(chapter);
        //intent.putExtra("verse", findViewById(verse);
        //this.startActivity(intent);
        EditText editText = (EditText) findViewById(R.id.book);
        EditText editText2 = (EditText) findViewById(R.id.chapter);
        EditText editText3 = (EditText) findViewById(R.id.verse);
        String message = editText.getText().toString();
        String message2 = editText2.getText().toString();
        String message3 = editText3.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(Chaptor, message2);
        intent.putExtra(Vorse, message3);
        startActivity(intent);
    }


}
