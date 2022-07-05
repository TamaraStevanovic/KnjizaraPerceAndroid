package com.example.perceandroid.entities;

public class Korisnik {
    int korisnikId;

    String ime;
    String prezime;
    String telefon;
    String adresa;
    String email;
    String sifra;
    String korime;

    public Korisnik(int korisnikId, String ime, String prezime, String telefon, String adresa, String email, String sifra, String korime) {
        this.korisnikId = korisnikId;
        this.ime = ime;
        this.prezime = prezime;
        this.telefon = telefon;
        this.adresa = adresa;
        this.email = email;
        this.sifra = sifra;
        this.korime = korime;
    }

    public int getKorisnikId() {
        return korisnikId;
    }

    public void setKorisnikId(int korisnikId) {
        this.korisnikId = korisnikId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getKorime() {
        return korime;
    }

    public void setKorime(String korime) {
        this.korime = korime;
    }
}
