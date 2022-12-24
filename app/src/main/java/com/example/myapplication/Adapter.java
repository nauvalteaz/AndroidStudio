package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class holder extends RecyclerView.ViewHolder{
    ImageView img;
    TextView txtNama,TxtDesc,TxtPrice;
    RecyclerView rmenu;

    public holder(@NonNull View itemView,RecyclerViewInterface recyclerViewInterface) {
        super(itemView);
        img=itemView.findViewById(R.id.makanan1);
        txtNama=itemView.findViewById(R.id.txtMakanan1);
        TxtDesc=itemView.findViewById(R.id.txtDescription);
        TxtPrice=itemView.findViewById(R.id.txtPrice);
        rmenu=itemView.findViewById(R.id.Rmenu);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(recyclerViewInterface!=null){
                    int pos=getBindingAdapterPosition();
                    if(pos !=RecyclerView.NO_POSITION){
                        recyclerViewInterface.OnItemClick(pos);
                    }
                }
            }
        });
    }
}

public class Adapter extends RecyclerView.Adapter<holder> {
    private final RecyclerViewInterface recyclerViewInterface;
    Context context;
    ArrayList<listMakanan> listMakanan;

    public Adapter(Context context, ArrayList<com.example.myapplication.listMakanan> listMakanan,RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.listMakanan = listMakanan;
        this.recyclerViewInterface=recyclerViewInterface;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_makanan,parent,false);
        return new holder(view,recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        com.example.myapplication.listMakanan makanan=listMakanan.get(position);
        holder.img.setImageResource(makanan.getImage());
        holder.txtNama.setText(makanan.getNamaMakanan());
        holder.TxtDesc.setText(makanan.getDescription());
        holder.TxtPrice.setText(""+makanan.getPrice());
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }
}
