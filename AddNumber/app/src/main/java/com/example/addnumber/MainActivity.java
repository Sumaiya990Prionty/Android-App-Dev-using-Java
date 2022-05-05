package com.example.addnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   EditText firstnumber;
    EditText secondnumber;
    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAddButton(View view) {
        EditText firstnumber = findViewById(R.id.editTextTextPersonName);
        EditText secondnumber= findViewById(R.id.editTextTextPersonName2);
        TextView textView3 = findViewById(R.id.textView3);
        //double num1 = Double.parseDouble(firstnumber.getText().toString());
       // double num2 = Double.parseDouble(secondnumber.getText().toString());
       // double sum = num1+num2;
        int sum = Integer.parseInt(firstnumber.getText().toString())+Integer.parseInt(secondnumber.getText().toString());
        textView3.setText(Integer.toString(sum));
    }
}