package com.example.perceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.perceandroid.entities.Korisnik;
import com.example.perceandroid.entities.SviPodaci;

public class IzmeniNalogActivity extends AppCompatActivity {

    int korisnikId;
    Korisnik k;
    EditText usernameET,firstNameET,lastNameET,addressET,phoneET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izmeni_nalog);

        Intent intent = getIntent();
        korisnikId = intent.getIntExtra("id",1);
        this.k= SviPodaci.sviKorisnici[korisnikId-1];

        usernameET = (EditText) findViewById(R.id.username);
        firstNameET = (EditText)findViewById(R.id.firstName);
        lastNameET = (EditText)findViewById(R.id.lastName);
        addressET = (EditText)findViewById(R.id.address);
        phoneET =(EditText) findViewById(R.id.phone);

        usernameET.setText(k.getKorime());
        firstNameET.setText(k.getIme());
        lastNameET.setText(k.getPrezime());
        addressET.setText(k.getAdresa());
        phoneET.setText(k.getTelefon());
    }

    public void sacuvaj(View view) {
        String username = usernameET.getText().toString();
        String firstName = firstNameET.getText().toString();
        String lastName = lastNameET.getText().toString();
        String address = addressET.getText().toString();
        String phone = phoneET.getText().toString();
        String msg="";
        boolean usernameCheck=false;

        if(username.equals("") || firstName.equals("")|| lastName.equals("")|| address.equals("")|| phone.equals(""))
            msg="Unesite sve podatke";
        else {
            for (int i = 0; i < SviPodaci.sviKorisnici.length; i++) {
                if (SviPodaci.sviKorisnici[i].getKorime().equals(username) && i != korisnikId) {
                    msg = "Korisnicko ime postoji u sistemu";
                    usernameCheck=true;
                    break;
                }
            }

            if (!usernameCheck) {
                k.setKorime(username);
                k.setIme(firstName);
                k.setPrezime(lastName);
                k.setAdresa(address);
                k.setTelefon(phone);
                SviPodaci.sviKorisnici[korisnikId-1]=k;

                Intent intent = new Intent(this, MojNalogActivity.class);
                intent.putExtra("id", korisnikId);
                startActivity(intent);
                return;
            }

        }
        if(!msg.equals(""))
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}