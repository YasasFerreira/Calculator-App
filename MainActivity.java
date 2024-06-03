package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    String old_num = "";
    String operator = "+";
    boolean operatoin = true;
    TextView ed1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if (operatoin){
            ed1.setText("");
        }
        operatoin = false;
        String number = ed1.getText().toString();
        switch (view.getId()){
            case R.id.bu1:
                number += "1";
                break;
            case R.id.bu2:
                number += "2";
                break;
            case R.id.bu3:
                number += "3";
                break;
            case R.id.bu4:
                number += "4";
                break;
            case R.id.bu5:
                number += "5";
                break;
            case R.id.bu6:
                number += "6";
                break;
            case R.id.bu7:
                number += "7";
                break;
            case R.id.bu8:
                number += "8";
                break;
            case R.id.bu9:
                number += "9";
                break;
            case R.id.bu0:
                number += "0";
                break;
            case R.id.budot:
                number += ".";
                break;

        }
        ed1.setText(number);
    }

    public void operaterEvent(View view) {
        operatoin = true;
        old_num = ed1.getText().toString();
        switch (view.getId()){
            case R.id.budiv:
                operator = "/";
                break;
            case R.id.bumul:
                operator = "x";
                break;
            case R.id.buadd:
                operator = "+";
                break;
            case R.id.busub:
                operator = "-";
                break;
        }
    }

    public void equalEvent(View view) {
        String new_num = ed1.getText().toString();
        double result = 0.0;
        switch (operator){
            case "+":
                result = Double.parseDouble(old_num)+Double.parseDouble(new_num);
                break;
            case "x":
                result = Double.parseDouble(old_num)*Double.parseDouble(new_num);
                break;
            case "-":
                result = Double.parseDouble(old_num)-Double.parseDouble(new_num);
                break;
            case "/":
                result = Double.parseDouble(old_num)/Double.parseDouble(new_num);
                break;
        }
        ed1.setText(result+"");
    }

    public void clearEvent(View view){
        ed1.setText("0");
        operatoin = true;
    }
}