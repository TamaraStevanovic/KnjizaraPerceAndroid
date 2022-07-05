package com.example.perceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.perceandroid.entities.Korisnik;
import com.example.perceandroid.entities.SviPodaci;

public class MojNalogActivity extends AppCompatActivity {


    Korisnik k;
    int korisnikId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moj_nalog);

        Intent intent = getIntent();
        korisnikId = intent.getIntExtra("korisnikId",1);

        this.k= SviPodaci.sviKorisnici[korisnikId-1];
        TextView username = findViewById(R.id.username);
        username.setText(k.getKorime());

        TextView firstName = findViewById(R.id.firstName);
        firstName.setText(k.getIme());

        TextView lastName = findViewById(R.id.lastName);
        lastName.setText(k.getPrezime());

        TextView address = findViewById(R.id.address);
        address.setText(k.getAdresa());

        TextView phone = findViewById(R.id.phone);
        phone.setText(k.getTelefon());
    }

    public void izmeniInformacije(View view){
        Intent intent = new Intent(this, IzmeniNalogActivity.class);
        intent.putExtra("korisnikid", korisnikId);
        startActivity(intent);

    }
}