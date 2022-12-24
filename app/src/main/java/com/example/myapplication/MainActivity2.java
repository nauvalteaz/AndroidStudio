package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView btnBio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnBio=findViewById(R.id.bio_btn);
        btnBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
    }
    public void sekrol(View view){
        startActivity(new Intent(MainActivity2.this,MainActivity3.class));
    }
    public void btnCalc(View view){
        startActivity(new Intent(MainActivity2.this,MainActivity4.class));
    }

    public void app_me(View view) {
        startActivity(new Intent(MainActivity2.this,splashscreen2.class));
    }
}