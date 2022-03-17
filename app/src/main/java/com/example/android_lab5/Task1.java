package com.example.android_lab5;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Task1 extends AppCompatActivity {
    private Button btn;
    private TextView textView2, textView3;
    private EditText field1;
    private final ArrayList<String> strings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        addListenerOnButton();
    }

    @SuppressLint("SetTextI18n")
    private void addListenerOnButton() {
        btn = (Button) findViewById(R.id.task1button);
        field1 = (EditText) findViewById(R.id.editTextTextMultiLine);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView2.setText("Напишите строку #1");
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String s = String.valueOf(field1.getText());
                if (strings.size() < 4) {
                    textView2.setText("Напишите строку #" + (strings.size() + 2));
                    strings.add(s);
                } else {
                    strings.add(s);
                    textView3.setText(strings.toString());
                    String longest = strings.get(0);
                    String res = "";
                    for (String string : strings) {
                        if (longest.length() <= string.length()) {
                            longest = string;
                        }
                    }
                    int count = 0;
                    for (String string : strings) {
                        if (longest.length() == string.length()) {
                            System.out.println(string);
                            if (count > 0)
                                res += "\n";
                            res += string;
                            count++;
                        }
                    }
                    textView3.setText(res.toString());
                    strings.clear();
                    textView2.setText("Выведен ответ!\nМожете записать новую комбинацию!");
                }
                field1.setText("");
            }
        });
    }
}