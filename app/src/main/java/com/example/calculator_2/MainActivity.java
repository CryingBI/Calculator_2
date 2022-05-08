package com.example.calculator_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int valueOne, valueTwo;
    public boolean operatorAdd = false;
    public boolean operatorSub = false;
    public boolean operatorDiv = false;
    public boolean operatorMul = false;
    Button buttonNumber0;
    Button buttonNumber1;
    Button buttonNumber2;
    Button buttonNumber3;
    Button buttonNumber4;
    Button buttonNumber5;
    Button buttonNumber6;
    Button buttonNumber7;
    Button buttonNumber8;
    Button buttonNumber9;

    Button buttonClear;
    Button buttonClear_apart;
    Button buttonBS;
    Button buttonDivision;
    Button buttonMultiplication;
    Button buttonSubtraction;
    Button buttonAddition;
    Button buttonEqual;
    Button buttonDot;
    Button buttonSwitch;

    TextView textView_1;
    TextView textView_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNumber0 = (Button) findViewById(R.id.button_zero);
        buttonNumber1 = (Button) findViewById(R.id.button_one);
        buttonNumber2 = (Button) findViewById(R.id.button_two);
        buttonNumber3 = (Button) findViewById(R.id.button_three);
        buttonNumber4 = (Button) findViewById(R.id.button_four);
        buttonNumber5 = (Button) findViewById(R.id.button_five);
        buttonNumber6 = (Button) findViewById(R.id.button_six);
        buttonNumber7 = (Button) findViewById(R.id.button_seven);
        buttonNumber8 = (Button) findViewById(R.id.button_eight);
        buttonNumber9 = (Button) findViewById(R.id.button_nine);

        buttonClear_apart = (Button) findViewById(R.id.button_clear_apart);
        buttonClear = (Button) findViewById(R.id.button_clear);
        buttonBS = (Button) findViewById(R.id.button_bs);
        buttonDivision = (Button) findViewById(R.id.button_division);
        buttonMultiplication = (Button) findViewById(R.id.button_multiplication);
        buttonSubtraction = (Button) findViewById(R.id.button_subtraction);
        buttonAddition = (Button) findViewById(R.id.button_addition);
        buttonEqual = (Button) findViewById(R.id.button_equal);
        buttonDot = (Button) findViewById(R.id.button_dot);
        buttonSwitch = (Button) findViewById(R.id.button_switch);
        textView_1 = (TextView) findViewById(R.id.textView_1);
        textView_2 = (TextView) findViewById(R.id.textView_2);

        buttonNumber0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView_2.setText(textView_2.getText()+ "0");
            }
        });
        buttonNumber1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView_2.setText(textView_2.getText()+ "1");
            }
        });
        buttonNumber2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView_2.setText(textView_2.getText()+ "2");
            }
        });
        buttonNumber3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView_2.setText(textView_2.getText()+ "3");
            }
        });

        buttonNumber4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView_2.setText(textView_2.getText()+ "4");
            }
        });

        buttonNumber5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView_2.setText(textView_2.getText()+ "5");
            }
        });

        buttonNumber6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView_2.setText(textView_2.getText()+ "6");
            }
        });

        buttonNumber7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView_2.setText(textView_2.getText()+ "7");
            }
        });

        buttonNumber8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView_2.setText(textView_2.getText()+ "8");
            }
        });

        buttonNumber9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView_2.setText(textView_2.getText()+ "9");
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_1.setText(textView_2.getText()+ "-");
                valueOne = Integer.parseInt(textView_2.getText()+ "");
                textView_2.setText("");
                operatorSub = true;
            }
        });

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_1.setText(textView_2.getText()+ "+");
                valueOne = Integer.parseInt(textView_2.getText()+"");
                textView_2.setText("");
                operatorAdd = true;
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_1.setText(textView_2.getText()+ "*");
                valueOne = Integer.parseInt(textView_2.getText()+"");
                textView_2.setText("");
                operatorMul = true;
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_1.setText(textView_2.getText()+ "/");
                valueOne = Integer.parseInt(textView_2.getText()+"");
                textView_2.setText("");
                operatorDiv = true;
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_1.setText("");
                textView_2.setText("0");
            }
        });

        buttonClear_apart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_2.setText("0");
            }
        });

        buttonBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textView_2.getText().toString();
                if(str.length()>1){
                    str = str.substring(0, str.length()-1);
                    textView_2.setText(str);
                }else textView_2.setText("0");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueTwo = Integer.parseInt(textView_2.getText()+"");
                if(operatorAdd == true)
                {
                    textView_2.setText(valueOne + valueTwo + "");
                    operatorAdd = false;
                }
                if(operatorSub == true)
                {
                    textView_2.setText(valueOne - valueTwo + "");
                    operatorSub = false;
                }
                if(operatorMul == true)
                {
                    textView_2.setText((valueOne * valueTwo) + "");
                    operatorMul = false;
                }
                if(operatorDiv == true)
                {
                    textView_2.setText((valueOne / valueTwo) + "");
                    operatorDiv = false;
                }
                textView_1.setText("");
            }
        });
    }


}