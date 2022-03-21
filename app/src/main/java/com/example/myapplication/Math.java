package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Math extends AppCompatActivity implements View.OnClickListener {
    TextView firstNumber1;
    TextView secondNumber1;
    TextView result1;

    Button zero1;
    Button one1;
    Button two1;
    Button three1;
    Button four1;
    Button five1;
    Button six1;
    Button seven1;
    Button eight1;
    Button nine1;
    Button sqrt;
    Button pow;
    Button sin;
    Button cos;
    Button clear1;
    Button equals1;
    Button transfer1;

    String act1;
    boolean fnum1;
    String actt1;


    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        act1 = "";
        fnum1 = true;
        actt1 = "";

        firstNumber1 = findViewById(R.id.firstNumber1);
        secondNumber1 = findViewById(R.id.secondNumber1);
        result1 = findViewById(R.id.result1);

        zero1 = findViewById(R.id.zero1);
        one1 = findViewById(R.id.one1);
        two1 = findViewById(R.id.two1);
        three1 = findViewById(R.id.three1);
        four1 = findViewById(R.id.four1);
        five1 = findViewById(R.id.five1);
        six1 = findViewById(R.id.six1);
        seven1 = findViewById(R.id.seven1);
        eight1 = findViewById(R.id.eight1);
        nine1 = findViewById(R.id.nine1);
        sqrt = findViewById(R.id.sqrt);
        pow = findViewById(R.id.pow);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        clear1 = findViewById(R.id.clear1);
        equals1 = findViewById(R.id.equals1);

        zero1.setOnClickListener(this);
        one1.setOnClickListener(this);
        two1.setOnClickListener(this);
        three1.setOnClickListener(this);
        four1.setOnClickListener(this);
        five1.setOnClickListener(this);
        six1.setOnClickListener(this);
        seven1.setOnClickListener(this);
        eight1.setOnClickListener(this);
        nine1.setOnClickListener(this);
        sqrt.setOnClickListener(this);
        pow.setOnClickListener(this);
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        clear1.setOnClickListener(this);
        equals1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.zero1:
            case R.id.one1:
            case R.id.two1:
            case R.id.three1:
            case R.id.four1:
            case R.id.five1:
            case R.id.six1:
            case R.id.seven1:
            case R.id.eight1:
            case R.id.nine1:
                Button button = (Button) view;
                String numText;
                if (fnum1) {
                    numText = firstNumber1.getText().toString();
                    numText += button.getText().toString();
                    firstNumber1.setText(numText);
                } else {
                    numText = secondNumber1.getText().toString();
                    numText += button.getText().toString();
                    secondNumber1.setText(numText);
                }
                break;
            //case R.id.sqrt:
            case R.id.pow:
            //case R.id.sin:
            //case R.id.cos:
                Button button1 = (Button) view;
                actt1 = button1.getText().toString();
                if (act1 == button1.getText().toString()) {
                    act1 = button1.getText().toString();
                    if (!fnum1) {
                        fnum1 = !fnum1;
                    }
                } else {
                    fnum1 = !fnum1;
                }
                break;

                case R.id.sqrt:
                //case R.id.pow:
                case R.id.sin:
                case R.id.cos:
                Button button2 = (Button) view;
                //actt1 = button2.getText().toString();
                if (act1 == button2.getText().toString())
                {
                    //act1 = button2.getText().toString();
                    if (!fnum1) {
                        fnum1 = !fnum1;
                    }
                } else {
                    fnum1 = !fnum1;
                }
                break;

            case R.id.equals1:
                //double num1 = Float.valueOf(firstNumber1.getText().toString());
                double  num2 = Float.valueOf(secondNumber1.getText().toString());
                switch(actt1) {
                    case ("√"):
                        double  res = java.lang.Math.sqrt(num2);
                        result1.setText(String.valueOf(res));
                        break;
                    //case ("^"):
                        //double  res2 = java.lang.Math.pow(num1,num2);
                        //result1.setText(String.valueOf(res2));
                        //break;
                    case ("sin"):
                        double  res3 = java.lang.Math.sin(num2);
                        result1.setText(String.valueOf(res3));
                        break;
                    case ("cos"):
                        double  res4 = java.lang.Math.cos(num2);
                        result1.setText(String.valueOf(res4));
                        break;
                }
                break;
            case R.id.clear1:
                firstNumber1.setText("");
                secondNumber1.setText("");
                result1.setText("");
                fnum1 = true;
                break;
        }
    }


    public void Click(View view) {
        Intent intent=new Intent(Math.this,MainActivity.class);
        //Запускаем его при нажатии:
        startActivity(intent);
    }
}
