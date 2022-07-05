package com.example.perceandroid.entities;

import java.util.ArrayList;

public class Knjiga {
    int knjigaId;
    String naziv;
    String autor;
    int godinaIzdanja;
    int brojStrana;
    int slika;
    String opis;

    public Knjiga(int knjigaId, String naziv, String autor, int godinaIzdanja, int brojStrana, int slika, String opis) {
        this.knjigaId = knjigaId;
        this.naziv = naziv;
        this.autor = autor;
        this.godinaIzdanja = godinaIzdanja;
        this.brojStrana = brojStrana;
        this.slika = slika;
        this.opis = opis;
    }

    public int getKnjigaId() {
        return knjigaId;
    }

    public void setKnjigaId(int knjigaId) {
        this.knjigaId = knjigaId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public int getSlika() {
        return slika;
    }

    public void setSlika(int slika) {
        this.slika = slika;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public static ArrayList<Knjiga> getKnjige() {
        ArrayList<Knjiga> knjige = new ArrayList<Knjiga>();

        for(int i=0;i< SviPodaci.sveKnjige.length;i++){
            knjige.add(SviPodaci.sveKnjige[i]);
        }
        return knjige;
    }
}
