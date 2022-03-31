package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.StringReader;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView firstNumber;
    TextView secondNumber;
    TextView result;

    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    Button clear;
    Button equals;
   // Button transfer;

    String act;
    boolean fnum;



    String actt;

    Spinner spinner;
    String[] str_array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act = "";
        fnum = true;
        actt = "";



        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        result = findViewById(R.id.result);

        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        clear = findViewById(R.id.clear);
        equals = findViewById(R.id.equals);
        //transfer = findViewById(R.id.transfer);
        str_array= new String[10];
        spinner = findViewById(R.id.spinner);
        str_array[0] = "История";
        for(int i=1; i< str_array.length; i++){
            str_array[i]=" ";
        }

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, str_array);
        //ArrayAdapter<CharSequence> adapter2= ArrayAdapter.createFromResource(MainActivity.this, str_array ,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter1);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        clear.setOnClickListener(this);
        equals.setOnClickListener(this);
        //spinner.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.zero:
            case R.id.one:
            case R.id.two:
            case R.id.three:
            case R.id.four:
            case R.id.five:
            case R.id.six:
            case R.id.seven:
            case R.id.eight:
            case R.id.nine:
                Button button = (Button) view;
                String numText;
                if (fnum) {
                    numText = firstNumber.getText().toString();
                    numText += button.getText().toString();
                    firstNumber.setText(numText);
                } else {
                    numText = secondNumber.getText().toString();
                    numText += button.getText().toString();
                    secondNumber.setText(numText);
                }
                break;

            case R.id.plus:
            case R.id.minus:
            case R.id.multiply:
            case R.id.divide:
                Button button1 = (Button) view;
                actt = button1.getText().toString();
                if (act == button1.getText().toString()) {
                    act = button1.getText().toString();
                    if (!fnum) {
                        fnum = !fnum;
                    }
                } else {
                    fnum = !fnum;
                }
                break;


            case R.id.equals:
                float num1 = Float.valueOf(firstNumber.getText().toString());
                float num2 = Float.valueOf(secondNumber.getText().toString());
                switch(actt) {
                case ("+"):
                    float res = num1 + num2;
                    result.setText(String.valueOf(res));
                    for (int i = 3; i >= 0; i--)
                    {
                        str_array[i+1] = str_array[i];
                    }
                    str_array[0] = String.valueOf(res);
                    break;
                case ("-"):
                    float res2 = num1 - num2;
                    result.setText(String.valueOf(res2));
                    for (int i = 3; i >= 0; i--)
                    {
                        str_array[i+1] = str_array[i];
                    }
                    str_array[0] = String.valueOf(res2);
                    break;
                case ("*"):
                    float res3 = num1 * num2;
                    result.setText(String.valueOf(res3));
                    for (int i = 3; i >= 0; i--)
                    {
                        str_array[i+1] = str_array[i];
                    }
                    str_array[0] = String.valueOf(res3);
                    break;
                case ("/"):
                    float res4 = num1 / num2;
                    result.setText(String.valueOf(res4));
                    for (int i = 3; i >= 0; i--)
                    {
                        str_array[i+1] = str_array[i];
                    }
                    str_array[0] = String.valueOf(res4);
                    break;
            }
            break;
            case R.id.clear:
                firstNumber.setText("");
                secondNumber.setText("");
                result.setText("");
                fnum = true;
                break;
        }
    }


    public void Click(View view) {
        Intent intent=new Intent(MainActivity.this,Math.class);
        //Запускаем его при нажатии:
        startActivity(intent);
    }
}