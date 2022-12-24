package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity{
    private TextView countTxt,baseprice,totall;
    private Button minus,plus;
    private int counter,total;
    private View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.buttonD:
                    plusCounter();
                    break;
                case R.id.buttonC2:
                    minusCounter();
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_detail);
        totall=(TextView)findViewById(R.id.totall);
        baseprice=(TextView)findViewById(R.id.price);
        plus=(Button) findViewById(R.id.buttonD);
        plus.setOnClickListener(clickListener);
        minus=(Button) findViewById(R.id.buttonC2);
        minus.setOnClickListener(clickListener);
        countTxt=(TextView) findViewById(R.id.countA);
        Intent intent=getIntent();
        listMakanan listMakanan=intent.getParcelableExtra("item");
        int image=listMakanan.getImage();
        String name=listMakanan.getNamaMakanan();
        String desc=listMakanan.getDescription();
        int price=listMakanan.getPrice();

        TextView textView1=findViewById(R.id.name);
        textView1.setText(name);

        TextView textView2=findViewById(R.id.desc);
        textView2.setText(desc);

        ImageView textView3=findViewById(R.id.imageView3);
        textView3.setImageResource(image);

        TextView textView4=findViewById(R.id.price);
        textView4.setText(""+listMakanan.getPrice());

        TextView textView5=findViewById(R.id.totall);

        textView5.setText("" + calculateTotal(listMakanan));

        initCounter();

    }
    public int calculateTotal(listMakanan listMakanan) {

        total = listMakanan.getPrice()*counter++;
        return total;
    }

    private void initCounter() {
        counter=0;
        countTxt.setText(counter+"");
    }
    private void plusCounter(){
        counter++;
        countTxt.setText(counter+"");
    }
    private void minusCounter(){
        counter--;
        countTxt.setText(counter+"");
    }
    public void tot(View view){
        int n1=Integer.parseInt(countTxt.getText().toString());
        int n2=Integer.parseInt(baseprice.getText().toString());
        int result=n1*n2;
        totall.setText(""+result);
    }


}
