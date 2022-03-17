package com.example.android_lab5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Task3 extends AppCompatActivity {
    private Button btn;
    private TextView textView1, textView2;
    private EditText editText;
    private final ArrayList<String> strings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        btn = (Button) findViewById(R.id.task3button);
        textView1 = (TextView) findViewById(R.id.task3textView);
        textView2 = (TextView) findViewById(R.id.task3textView2);
        editText = (EditText) findViewById(R.id.task3editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strings.add(String.valueOf(editText.getText()));
                ArrayList<String> res = new ArrayList<>();
                for (int i = 0; i < strings.size(); i++) {
                    int output = getValue(strings.get(i)) * (i + 1);
                    res.add(String.valueOf(output));
                }
                textView1.setText(strings.toString());
                textView2.setText(res.toString());
                editText.setText("");
            }
        });
    }

    private static int getValue(String input) {
        int output = 0;
        for (int a = 0; a < input.length(); a++) {
            char character = input.charAt(a);
            int ascii = (int) character;
            if ((ascii >= 65) && (ascii <= 90)) {
                ascii = ascii - 64;
            } else if ((ascii >= 97) && (ascii <= 122)) {
                ascii = ascii - 96;
            } else ascii = 0;
            output += ascii;
        }
        return output;
    }

}