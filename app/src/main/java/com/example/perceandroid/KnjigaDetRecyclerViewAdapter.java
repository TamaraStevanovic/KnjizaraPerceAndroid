package com.example.perceandroid;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.perceandroid.entities.KnjigaDetalji;
import com.example.perceandroid.entities.SviPodaci;

import java.util.ArrayList;

public class KnjigaDetRecyclerViewAdapter extends RecyclerView.Adapter<KnjigaDetRecyclerViewAdapter.MyViewHolder> {
    public ArrayList<KnjigaDetalji> childModelArrayList;
    Context cxt;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView knjigaUrl;
        public TextView knjigaNaziv;

        public MyViewHolder(View itemView) {
            super(itemView);
            knjigaUrl = itemView.findViewById(R.id.knjiga_slika);
            knjigaNaziv = itemView.findViewById(R.id.knjiga_naziv);
        }
    }

    public  KnjigaDetRecyclerViewAdapter(ArrayList<KnjigaDetalji> arrayList, Context mContext) {
        this.cxt = mContext;
        this.childModelArrayList = arrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_recyclerview_items, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        KnjigaDetalji currentItem = childModelArrayList.get(position);
        holder.knjigaUrl.setImageResource(currentItem.getKnjigaUrl());
        holder.knjigaNaziv.setText(currentItem.getKnjigaNaziv());
        int knjigaId = currentItem.getKnjigaId();

        holder.knjigaUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(holder.itemView.getContext(), DetaljiKnjigeActivity.class);
                i.putExtra("knjigaId",knjigaId);
                i.putExtra("korisnikId", SviPodaci.korisnikUSistemu);
                holder.itemView.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return childModelArrayList.size();
    }
}

