package com.example.perceandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.perceandroid.entities.Knjiga;
import com.example.perceandroid.entities.Komentar;

import java.util.ArrayList;

public class CustomKomentarAdapter extends ArrayAdapter<Komentar.KorisnikKomentar> {
    public CustomKomentarAdapter(Context context, ArrayList<Komentar.KorisnikKomentar> comms) {
        super(context, 0, comms);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_komentar, parent, false);
        }

        // Get the data item for this position
        Komentar.KorisnikKomentar k = getItem(position);

        // Lookup view for data population
        TextView user = (TextView) convertView.findViewById(R.id.userKomentar);
        TextView komentrar = (TextView) convertView.findViewById(R.id.komentar);
        // Populate the data into the template view using the data object
        user.setText(k.getUser());
        komentrar.setText(k.getKomentar());
        // Return the completed view to render on screen
        return convertView;
    }
}

