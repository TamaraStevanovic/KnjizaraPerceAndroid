package com.example.perceandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Toast;

import com.example.perceandroid.entities.Korisnik;
import com.example.perceandroid.entities.Preporuka;
import com.example.perceandroid.entities.SviPodaci;

import java.util.ArrayList;
import java.util.List;

public class PreporuciActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    int korisnikId;
    Korisnik korisnik;

    ListView listView;
    PreporukaAdapter preporukaAdapter;
    List<Preporuka> korisniciSistema = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preporuci);

        Intent intent = getIntent();
        korisnikId = intent.getIntExtra("korisnikId", 1);
        Toast.makeText(this, "Preporucio " + korisnikId, Toast.LENGTH_SHORT).show();
        this.korisnik = SviPodaci.sviKorisnici[korisnikId];

        for (int i = 0; i < SviPodaci.sviKorisnici.length; i++) {
            if (SviPodaci.sviKorisnici[i].getKorisnikId() != korisnikId)
                if (!SviPodaci.sviKorisnici[i].getKorime().equals("admin"))
                    korisniciSistema.add(new Preporuka(SviPodaci.sviKorisnici[i].getKorime()));
        }
        preporukaAdapter = new PreporukaAdapter(this, (ArrayList<Preporuka>) korisniciSistema);
        listView = (ListView) findViewById(R.id.preporuciPrijateljima);
        listView.setAdapter(preporukaAdapter);


    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        int position = listView.getPositionForView(compoundButton);

        if (position != ListView.INVALID_POSITION) {

            Preporuka preporuke = korisniciSistema.get(position);
            preporuke.setSelected(b);
        }
    }


    public void posaljiPreporuke(View view) {
        Toast.makeText(this, "Preporuke su poslate", Toast.LENGTH_SHORT).show();
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                for (int i = 0; i < korisniciSistema.toArray().length; i++) {
                    if (korisniciSistema.get(i).isSelected()) {
                        korisniciSistema.remove(i);
                        preporukaAdapter.notifyDataSetChanged();
                    }

                }
            }


        });
    }
}