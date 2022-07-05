package com.example.perceandroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perceandroid.entities.Korisnik;
import com.example.perceandroid.entities.Promocija;
import com.example.perceandroid.entities.Promocija2;
import com.example.perceandroid.entities.SviPodaci;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class PocetnaActivity extends AppCompatActivity implements SearchView.OnQueryTextListener{

    int korisnikId;
    Korisnik korisnik;
    ListView listaPromocijaView;
    String[] opisiPromocija;

    SearchView searchView;

    private RecyclerView parentRecyclerView;
    private RecyclerView.Adapter ParentAdapter;
    ArrayList<Promocija2> parentModelArrayList = new ArrayList<>();
    private RecyclerView.LayoutManager parentLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocetna);

        Intent intent = getIntent();
        korisnikId = intent.getIntExtra("korisnikId", 1);
        Toast.makeText(this, "Pocetna korisnik" + korisnikId, Toast.LENGTH_SHORT).show();

        this.korisnik = SviPodaci.sviKorisnici[korisnikId];

        //dodato
        for(int i=0;i< SviPodaci.svePromocije.length;i++){
            parentModelArrayList.add(new Promocija2(SviPodaci.svePromocije[i].getOpis()));
        }

        //parentModelArrayList.add(new Promocija2("Category1"));
        parentRecyclerView = findViewById(R.id.Parent_recyclerView);
        parentRecyclerView.setHasFixedSize(true);
        parentLayoutManager = new LinearLayoutManager(this);
        ParentAdapter = new PromocijaRecyclerViewAdapter(parentModelArrayList, PocetnaActivity.this);

        parentRecyclerView.setLayoutManager(parentLayoutManager);
        parentRecyclerView.setAdapter(ParentAdapter);
        ParentAdapter.notifyDataSetChanged();

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home_page);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.home_page:
                        Intent newActivity = new Intent(getApplicationContext(), PocetnaActivity.class);
                        newActivity.putExtra("korisnikId", korisnikId);
                        startActivity(newActivity);
                        //overridePendingTransition(0,0);
                        return true;
                    case R.id.allbooks_page:
                        Intent newActivity_allbooks = new Intent(getApplicationContext(), SveKnjigeActivity.class);
                        newActivity_allbooks.putExtra("korisnikId", korisnikId);
                        startActivity(newActivity_allbooks);
                        return true;

                    case R.id.myaccount_page:
                        return true;
                }
                return false;
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //naredna linija ubacuje u header menu
        getMenuInflater().inflate(R.menu.menu_search, menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setQueryHint("Unesite knjigu..");

        searchView.setOnQueryTextListener(this);;
        return true;
    }

    //metoda za search
    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }



}
