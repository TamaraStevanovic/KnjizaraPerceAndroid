package com.example.perceandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perceandroid.entities.KnjigaDetalji;
import com.example.perceandroid.entities.Promocija;
import com.example.perceandroid.entities.Promocija2;
import com.example.perceandroid.entities.SviPodaci;

import java.util.ArrayList;
import java.util.Arrays;

public class PromocijaRecyclerViewAdapter extends RecyclerView.Adapter<PromocijaRecyclerViewAdapter.MyViewHolder> {
    private ArrayList<Promocija2> parentModelArrayList;
    public Context cxt;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView promocijaKategorija;
        public RecyclerView childRecyclerView;

        public MyViewHolder(View itemView) {
            super(itemView);

            promocijaKategorija = itemView.findViewById(R.id.Ponuda_category);
            childRecyclerView = itemView.findViewById(R.id.Child_RV);
        }
    }

    public PromocijaRecyclerViewAdapter(ArrayList<Promocija2> exampleList, Context context) {
        this.parentModelArrayList = exampleList;
        this.cxt = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_recyclerview_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return parentModelArrayList.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Promocija2 currentItem = parentModelArrayList.get(position);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(cxt, LinearLayoutManager.HORIZONTAL, false);
        holder.childRecyclerView.setLayoutManager(layoutManager);
        holder.childRecyclerView.setHasFixedSize(true);

        holder.promocijaKategorija.setText(currentItem.getOpis());
        ArrayList<KnjigaDetalji> arrayList = new ArrayList<>();

        for(int i = 0; i< SviPodaci.svePromocije.length; i++){
            if (parentModelArrayList.get(position).getOpis().equals(SviPodaci.svePromocije[i].getOpis())) {
                Promocija p = SviPodaci.svePromocije[i];
                KnjigaDetalji[] kd = p.getKnjige();
                arrayList.addAll(Arrays.asList(kd));
            }
        }

        KnjigaDetRecyclerViewAdapter childRecyclerViewAdapter = new KnjigaDetRecyclerViewAdapter(arrayList,holder.childRecyclerView.getContext());
        holder.childRecyclerView.setAdapter(childRecyclerViewAdapter);
    }
}

