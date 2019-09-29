package com.merocalculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnplus, btnminus, btnmultiply, btnclear, btnequall, btndivide;
    private EditText view;
    int value1, value2;
    boolean mAddition, mSubtract, mDivide, mMultiply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnplus = findViewById(R.id.plus);
        btnminus = findViewById(R.id.minus);
        btnmultiply =findViewById(R.id.mul);
        btnclear = findViewById(R.id.clear);
        btnequall = findViewById(R.id.equall);
        btndivide = findViewById(R.id.divide);
        view = findViewById(R.id.view);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                view.setText(view.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString() + "9");
            }
        });


        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Integer.parseInt(view.getText() + "");
                mAddition = true;
                view.setText(null);
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Integer.parseInt(view.getText() + "");
                mSubtract = true;
                view.setText(null);
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Integer.parseInt(view.getText() + "");
                mDivide = true;
                view.setText(null);
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = Integer.parseInt(view.getText() + "");
                mMultiply = true;
                view.setText(null);
            }
        });

        btnequall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Integer.parseInt(view.getText() + "");
                if (mAddition == true){
                    view.setText(value1 + value2 +"");
                    mAddition=false;
                }

                if (mSubtract == true){
                    view.setText(value1 - value2 +"");
                    mSubtract=false;
                }
                if (mDivide == true){
                    view.setText(value1 / value2 +"");
                    mDivide=false;
                }
                if (mMultiply == true){
                    view.setText(value1 * value2 +"");
                    mMultiply=false;
                }
            }
        });


        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(null);
            }
        });


    }
}
