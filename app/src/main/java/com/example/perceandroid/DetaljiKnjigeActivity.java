package com.example.perceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.perceandroid.entities.Knjiga;
import com.example.perceandroid.entities.Komentar;
import com.example.perceandroid.entities.SviPodaci;

import java.util.ArrayList;

public class DetaljiKnjigeActivity extends AppCompatActivity {

    int knjigaId;
    int korisnikId;
    Knjiga knjiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalji_knjige);

        Intent intent = getIntent();
        knjigaId = intent.getIntExtra("knjigaId", 1);
        korisnikId = intent.getIntExtra("korisnikId", 1);
        Toast.makeText(this, "Detalji korisnik" + korisnikId, Toast.LENGTH_SHORT).show();


        knjiga = SviPodaci.sveKnjige[knjigaId - 1];

        ImageView slika = findViewById(R.id.slikaDetalji);
        slika.setImageResource(knjiga.getSlika());

        TextView naslov = findViewById(R.id.naslovDetalji);
        naslov.setText(knjiga.getNaziv());

        TextView autor = findViewById(R.id.autorDetalji);
        autor.setText(knjiga.getAutor());


        TextView brojStrana = findViewById(R.id.brojStranaDetalji);
        brojStrana.setText(Integer.toString(knjiga.getBrojStrana()));

        TextView godina = findViewById(R.id.godinaDetalji);
        godina.setText(Integer.toString(knjiga.getGodinaIzdanja()));

        RatingBar rb = findViewById(R.id.ratingDetalji);
        rb.setRating(3);

        TextView oKnjizi = findViewById(R.id.oKnjiziDetalji);
        oKnjizi.setText(knjiga.getOpis());
        // Toast.makeText(this, "Knjiga" + knjigaId, Toast.LENGTH_SHORT).show();


        ArrayList<Komentar.KorisnikKomentar> arrayOfComms = Komentar.getKorisnikKomentar(knjigaId);
        CustomKomentarAdapter adapter = new CustomKomentarAdapter(this, arrayOfComms);
        ListView listView = (ListView) findViewById(R.id.komentariDetalji);
        listView.setAdapter(adapter);


    }


    public void preporuciKnjigu(View view) {
        Intent intent = new Intent(this, PreporuciActivity.class);
        intent.putExtra("korisnikId", korisnikId);
        startActivity(intent);

    }
}