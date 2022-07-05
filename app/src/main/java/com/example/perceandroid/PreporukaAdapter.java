package com.example.perceandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.perceandroid.entities.Komentar;
import com.example.perceandroid.entities.Preporuka;

import java.util.ArrayList;

public class PreporukaAdapter extends ArrayAdapter<Preporuka> {
    public PreporukaAdapter(Context context, ArrayList<Preporuka> comms) {
        super(context, 0, comms);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_preporuka, parent, false);
        }

        // Get the data item for this position
        Preporuka k = getItem(position);

        // Lookup view for data population
        TextView user = (TextView) convertView.findViewById(R.id.korisnikPreporuka);
        CheckBox checked = (CheckBox) convertView.findViewById(R.id.checkPreporuka);
        checked.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {
                if (isChecked) {
                    checked.setChecked(true);
                    //Toast.makeText(getContext(), "stiklirano za slanje" , Toast.LENGTH_SHORT).show();
                    //checked.setEnabled(false); // disable checkbox
                }
            }
        });
        // Populate the data into the template view using the data object
        user.setText(k.getKorisnik());
        checked.setChecked(k.isSelected());
        // Return the completed view to render on screen
        return convertView;
    }
}

