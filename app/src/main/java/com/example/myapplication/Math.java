package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Math extends AppCompatActivity {
    EditText editText1, editText2, resultText;
    Button button2;
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        editText1 = findViewById(R.id.edittext1);
        editText2 = findViewById(R.id.edittext2);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view ->
        {
            double num1 = Double.valueOf(editText1.getText().toString());
            double num2 = Double.valueOf(editText2.getText().toString());
            double result = java.lang.Math.pow(num1,num2);
            resultText.setText(String.valueOf(result));
        });

    }
}
