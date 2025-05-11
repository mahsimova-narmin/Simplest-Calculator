package com.narminmahsimova.simplestcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         number1Text = findViewById(R.id.editTextText);
         number2Text = findViewById(R.id.editTextText2);
         resultText = findViewById(R.id.textView);



    }

    public void sum(View view){

        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a number!");
        } else{
            int myNumber1 = Integer.parseInt(number1Text.getText().toString());
            int myNumber2 = Integer.parseInt(number2Text.getText().toString());

            int result = myNumber1+myNumber2;
            resultText.setText("Result: " + result);

        }
    }

    public void deduct(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a number!");
        } else{
            int myNumber1 = Integer.parseInt(number1Text.getText().toString());
            int myNumber2 = Integer.parseInt(number2Text.getText().toString());

            int result = myNumber1-myNumber2;
            resultText.setText("Result: " + result);

        }
    }

    public void multiply(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a number!");
        } else{
            int myNumber1 = Integer.parseInt(number1Text.getText().toString());
            int myNumber2 = Integer.parseInt(number2Text.getText().toString());

            int result = myNumber1*myNumber2;
            resultText.setText("Result: " + result);

        }
    }

    public void divide(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a number!");
        } else if(number2Text.getText().toString().matches("0")){
            resultText.setText("Impossible!");
        } else {
            int myNumber1 = Integer.parseInt(number1Text.getText().toString());
            int myNumber2 = Integer.parseInt(number2Text.getText().toString());

            int result = myNumber1/myNumber2;
            resultText.setText("Result: " + result);
        }
        }



}