package com.example.perceandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;

import android.app.Activity;
import android.content.Intent;
import android.database.DatabaseErrorHandler;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.perceandroid.entities.Knjiga;
import com.example.perceandroid.entities.SviPodaci;

import java.util.ArrayList;

public class SveKnjigeActivity extends Activity implements SearchView.OnQueryTextListener {

    int korisnikId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sve_knjige);
        Intent intent = getIntent();
        korisnikId = intent.getIntExtra("korisnikId", 1);
        Toast.makeText(this, "Sve knjige korisnik" + korisnikId, Toast.LENGTH_SHORT).show();


        popuniKnjige();

    }

    private void popuniKnjige() {
        // Construct the data source
        ArrayList<Knjiga> arrayOfBooks = Knjiga.getKnjige();
        // Create the adapter to convert the array to views
        CustomKnjigeAdapter adapter = new CustomKnjigeAdapter(this, arrayOfBooks);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.listaSveKnjige);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent newActivity = new Intent(view.getContext(), DetaljiKnjigeActivity.class);
                newActivity.putExtra("knjigaId", position+1);
                newActivity.putExtra("korisnikId", korisnikId);
                startActivity(newActivity);

            }
        });
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //naredna linija ubacuje u header menu
        getMenuInflater().inflate(R.menu.menu_search, menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setQueryHint("Unesite knjigu..");

        searchView.setOnQueryTextListener(this);

        return true;
    }

}