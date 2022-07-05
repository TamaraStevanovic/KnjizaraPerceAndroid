package com.example.perceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.perceandroid.entities.SviPodaci;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean prijavaNaSistem(View view) {
        EditText korisnicko_ime = findViewById(R.id.kor_ime);
        EditText lozinka = findViewById(R.id.lozinka);
        int korisnikId = 0;
        boolean postojiUsistemu = false;

        for (int i = 0; i < SviPodaci.sviKorisnici.length; i++) {

            if (korisnicko_ime.getText().toString().equals(SviPodaci.sviKorisnici[i].getKorime())
                    && lozinka.getText().toString().equals(SviPodaci.sviKorisnici[i].getSifra())) {
                postojiUsistemu = true;
                korisnikId = i+1;
                break;
            }
        }
        if (postojiUsistemu) {
            SviPodaci.korisnikUSistemu = korisnikId;
            Intent intent = new Intent(this, PocetnaActivity.class);
            intent.putExtra("korisnikId", korisnikId);
            Toast.makeText(this, "Korisnik " +korisnikId, Toast.LENGTH_SHORT).show();
            startActivity(intent);
            return true;
        } else {
            Toast.makeText(this, "Pogresni podaci", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public void registracija(View view) {

    }

}