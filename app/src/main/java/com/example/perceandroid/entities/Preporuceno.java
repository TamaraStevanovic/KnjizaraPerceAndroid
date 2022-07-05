package com.example.perceandroid.entities;

public class Preporuceno {
    String korisnik;
    Slika[][] slike;


    public static class Slika {
        int slikaUrl;
        int slikaId;
        String[] korisnici;

        public Slika(int slikaUrl, int slikaId, String[] korisnici) {
            this.slikaUrl = slikaUrl;
            this.slikaId = slikaId;
            this.korisnici = korisnici;
        }
    }

    public Preporuceno(String korisnik, Slika[][] slike) {
        this.korisnik = korisnik;
        this.slike = slike;
    }
}
