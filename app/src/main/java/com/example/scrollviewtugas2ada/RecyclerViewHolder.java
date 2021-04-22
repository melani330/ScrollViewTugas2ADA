package com.example.scrollviewtugas2ada;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView tv1,tv2;
    ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.daftar_judul);
        tv2= (TextView) itemView.findViewById(R.id.daftar_deskripsi);
        imageView= (ImageView) itemView.findViewById(R.id.daftar_icon);


    }
}
