package com.example.perceandroid;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.perceandroid.entities.Knjiga;

public class CustomKnjigeAdapter extends ArrayAdapter<Knjiga> {
    public CustomKnjigeAdapter(Context context, ArrayList<Knjiga> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_knjiga, parent, false);
        }

        // Get the data item for this position
        Knjiga knjiga = getItem(position);

        // Lookup view for data population
        TextView naziv = (TextView) convertView.findViewById(R.id.naslovKnjige);
        TextView autor = (TextView) convertView.findViewById(R.id.autorKnjige);
        ImageView slika = (ImageView) convertView.findViewById(R.id.slikaKnjiga);
        // Populate the data into the template view using the data object
        naziv.setText(knjiga.getNaziv());
        autor.setText(knjiga.getAutor());
        slika.setImageResource(knjiga.getSlika());
        // Return the completed view to render on screen
        return convertView;
    }
}

