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
    private TextView textView2;
    private EditText field1;
    private final ArrayList<String> strings = new ArrayList<> ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        btn = (Button) findViewById(R.id.task1button);
        field1 = (EditText) findViewById(R.id.editTextTextMultiLine);
        textView2 = (TextView) findViewById(R.id.textView2);
//        field3 = (EditText) findViewById(R.id.editTextTextThirdNum);
//        textView5 = (TextView) findViewById(R.id.textView5);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String s = String.valueOf(field1.getText());
                addToArray(s);
                field1.setText("");
                textView2.setText(strings.toString());

            }
//                double firstNum = Double.parseDouble(field1.getText().toString());
//                double secondNum = Double.parseDouble(field2.getText().toString());
//                double thirdNum = Double.parseDouble(field3.getText().toString());
//                double[] numbersf = new double[]{firstNum, secondNum, thirdNum};
//                Arrays.sort(numbersf);
//                textView5.setText(Double.toString(numbersf[1]));
//                textView5.setTextColor(Color.rgb(0, 160, 0));
//                textView5.setTextSize(25);

//                int length = Integer.parseInt(num1.getText().toString());
//                int width = Integer.parseInt(num2.getText().toString());
//                int height = Integer.parseInt(num3.getText().toString());
//                Cuboid cub = new Cuboid(length, width, height);
//                view1.setText(Double.toString(cub.getVolume()));

//            }
        });
    }
    private void addToArray(String s){
        if (strings.size()<5){
            strings.add(s);
        }else
            strings.clear();

    }
}