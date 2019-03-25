package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private String firstNum = "";
    private String resultNum = "";
    private double type=0;
    private double first, second = 0;
    private EditText textFunction;
    private TextView textAnswer;
    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, addButton, subButton, mulButton, divButton, equalButton, delButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textAnswer = findViewById(R.id.textAnswer);
        textFunction = findViewById(R.id.textFunction);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        num0 = findViewById(R.id.num0);

        addButton = findViewById(R.id.addButton);
        subButton = findViewById(R.id.subButton);
        mulButton = findViewById(R.id.mulButton);
        divButton = findViewById(R.id.divButton);
        equalButton = findViewById(R.id.equalButton);
        delButton = findViewById(R.id.delButton);

        addButton.setOnClickListener(aluClick);
        subButton.setOnClickListener(aluClick);
        mulButton.setOnClickListener(aluClick);
        divButton.setOnClickListener(aluClick);

        equalButton.setOnClickListener(aluClick);

        delButton.setOnClickListener(aluClick);

        num0.setOnClickListener(mClick);
        num1.setOnClickListener(mClick);
        num2.setOnClickListener(mClick);
        num3.setOnClickListener(mClick);
        num4.setOnClickListener(mClick);
        num5.setOnClickListener(mClick);
        num6.setOnClickListener(mClick);
        num7.setOnClickListener(mClick);
        num8.setOnClickListener(mClick);
        num9.setOnClickListener(mClick);

    }


    Button.OnClickListener aluClick = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            switch (v.getId()) {
                case R.id.addButton:
                    firstNum = textFunction.getText().toString();
                    textFunction.setText("");
                    type = 1;
                    break;
                case R.id.subButton:
                    firstNum = textFunction.getText().toString();
                    textFunction.setText("");
                    type = 2;
                    break;
                case R.id.mulButton:
                    firstNum = textFunction.getText().toString();
                    textFunction.setText("");
                    type = 3;
                    break;
                case R.id.divButton:
                    firstNum = textFunction.getText().toString();
                    textFunction.setText("");
                    type = 4;
                    break;

                case R.id.equalButton:
                    resultNum = textFunction.getText().toString();
                    first = Double.parseDouble(firstNum);
                    second = Double.parseDouble(resultNum);
                    if(type == 1){
                        second = first + second;
                        resultNum = String.valueOf(second);
                        textAnswer.setText(resultNum);
                        textFunction.setText("");
                    }
                    if(type == 2){
                        second = first - second;
                        resultNum = String.valueOf(second);
                        textAnswer.setText(resultNum);
                        textFunction.setText("");
                    }
                    if(type == 3){
                        second = first * second;
                        resultNum = String.valueOf(second);
                        textAnswer.setText(resultNum);
                        textFunction.setText("");
                    }
                    if(type == 4){
                        second = first / second;
                        resultNum = String.valueOf(second);
                        textAnswer.setText(resultNum);
                        textFunction.setText("");
                    }
                    type = 0;
                    first= 0;
                    second= 0;
                    resultNum="";
                    firstNum="";
                    break;
                case R.id.delButton:
                    type = 0;
                    first= 0;
                    second= 0;
                    resultNum="";
                    firstNum="";
                    textFunction.setText("");
                    textAnswer.setText("");

            }
        }
    };



    Button.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.num0 : textFunction.setText(textFunction.getText().toString()+0);break;
                case R.id.num1 : textFunction.setText(textFunction.getText().toString()+1);break;
                case R.id.num2 : textFunction.setText(textFunction.getText().toString()+2);break;
                case R.id.num3 : textFunction.setText(textFunction.getText().toString()+3);break;
                case R.id.num4 : textFunction.setText(textFunction.getText().toString()+4);break;
                case R.id.num5 : textFunction.setText(textFunction.getText().toString()+5);break;
                case R.id.num6 : textFunction.setText(textFunction.getText().toString()+6);break;
                case R.id.num7 : textFunction.setText(textFunction.getText().toString()+7);break;
                case R.id.num8 : textFunction.setText(textFunction.getText().toString()+8);break;
                case R.id.num9 : textFunction.setText(textFunction.getText().toString()+9);break;
        }
    }
    };

}
