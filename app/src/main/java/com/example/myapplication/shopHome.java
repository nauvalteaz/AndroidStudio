package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class shopHome extends AppCompatActivity implements RecyclerViewInterface{
    RecyclerView rMakanan;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<listMakanan> listmakanan;
    void dataDummy(){
        listmakanan=new ArrayList<>();
        listmakanan.add(new listMakanan("ayam","ayam tepung mirip kaepci",R.drawable.makanan1,25000));
        listmakanan.add(new listMakanan("ayam kaepci","ayam tepung ril kaepci",R.drawable.makanan1,40000));
        listmakanan.add(new listMakanan("baso","baso kuah dengan mi kuning biasa",R.drawable.makanan1,10000));
        listmakanan.add(new listMakanan("baso urat","baso urat kuah mi kuning",R.drawable.makanan1,22000));
        listmakanan.add(new listMakanan("steakA3","steak orang kaya",R.drawable.makanan1,90000));
    }
    void data(){
       rMakanan=findViewById(R.id.Rmenu);
       adapter=new Adapter(this,listmakanan,this);
       layoutManager=new LinearLayoutManager(this);
       rMakanan.setLayoutManager(layoutManager);
       rMakanan.setAdapter(adapter);
    }
    ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_home);
        int images[]={R.drawable.uwu,R.drawable.uwu2,R.drawable.uwu3};
        flipper =findViewById(R.id.flipper);
        for(int image:images){
            FlipperImages(image);
        }
        dataDummy();data();
    }
    public void FlipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);

        flipper.addView(imageView);
        flipper.setFlipInterval(4000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }

    @Override
    public void OnItemClick(int position) {
        Intent intent= new Intent(shopHome.this,detail.class);
        intent.putExtra("item",listmakanan.get(position));
        startActivity(intent);
    }
}