package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall=findViewById(R.id.btnCall);
        btnCall.setOnClickListener(view -> {
           String nomor="082136924448";
           Intent memanggil=new Intent(Intent.ACTION_DIAL);
           memanggil.setData(Uri.fromParts("tel",nomor,null));
           startActivity(memanggil);
        });
    }
    public void email(View view){
        String url="https://accounts.google.com/b/0/AddMailService";
        Intent bukaGmail=new Intent(Intent.ACTION_VIEW);
        bukaGmail.setData(Uri.parse(url));
        startActivity(bukaGmail);
    }
    public void mapBtn(View view){
        String url="https://www.google.com/maps/place/Bukit+Cemara+Asri+DO+51/@-7.0699535,110.4586646,18.82z/data=!4m5!3m4!1s0x2e708f0bee6544c7:0x6b9b6947abbd717f!8m2!3d-7.0699216!4d110.458942";
        Intent bukaMap=new Intent(Intent.ACTION_VIEW);
        bukaMap.setData(Uri.parse(url));
        startActivity(bukaMap);
    }
}