package com.example.perceandroid.entities;

public class Preporuka {
    String korisnik;
    boolean isSelected;

    public Preporuka(String korisnik) {
        this.korisnik = korisnik;
        this.isSelected = false;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
