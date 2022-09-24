package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void add(View view){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1+n2;
        et3.setText(""+result);
    }
    public void min(View view){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1-n2;
        et3.setText(""+result);
    }
    public void sub(View view){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1/n2;
        et3.setText(""+result);
    }
    public void mul(View view){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result=n1*n2;
        et3.setText(""+result);
    }

}