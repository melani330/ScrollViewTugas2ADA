package com.example.scrollviewtugas2ada;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {

    private final Context context;

    String [] name={"Mahasiswa1","Mahasiswa2","Mahasiswa3","Mahasiswa4","Mahasiswa5",
            "Mahasiswa6","Mahasiswa7","Mahasiswa8","Mahasiswa9","Mahasiswa10",
            "Mahasiswa11","Mahasiswa12","Mahasiswa13","Mahasiswa14","Mahasiswa15"};

    LayoutInflater inflater;

    public RecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.list_mahasiswa, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.tv2.setOnClickListener(clickListener);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv2.setTag(holder);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);

    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();
                Intent intent = new Intent(context, DetailActivity.class);
                context.startActivity(intent);
        }
    };


    public int getItemCount() {
        return name.length;
    }
}
