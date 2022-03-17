package com.example.android_lab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonT1, buttonT2, buttonT3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        buttonT1 = (Button) findViewById(R.id.buttonTask1);
        buttonT2 = (Button) findViewById(R.id.buttonTask2);
        buttonT3 = (Button) findViewById(R.id.buttonTask3);
        buttonT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.android_lab5.Task1");
                startActivity(intent);
            }
        });
        buttonT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.android_lab5.Task2");
                startActivity(intent);
            }
        });
        buttonT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.android_lab5.Task3");
                startActivity(intent);
            }
        });
    }
}