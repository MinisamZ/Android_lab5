package com.example.android_lab5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Task2 extends AppCompatActivity {
    private Button btn, btn2;
    private EditText editText1, editText2;
    private TextView textView, textView2;
    private final ArrayList<String> strings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        btn = (Button) findViewById(R.id.task2button);
        btn2 = (Button) findViewById(R.id.task2button2);
        editText1 = (EditText) findViewById(R.id.task2editText);
        editText2 = (EditText) findViewById(R.id.task2editText2);
        textView = (TextView) findViewById(R.id.task2textView);
        textView2 = (TextView) findViewById(R.id.task2textView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = String.valueOf(editText1.getText());
                strings.add(s);
                editText1.setText("");
                textView2.setText(strings.toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = String.valueOf(editText2.getText());
                boolean output = false;
                for (String string : strings) {
                    if (string.equals(input)) {
                        output = true;
                        break;
                    }
                }
                textView.setText(String.valueOf(output));
            }
        });
    }
}