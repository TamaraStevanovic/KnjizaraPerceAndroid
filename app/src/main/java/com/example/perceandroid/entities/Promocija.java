package com.example.perceandroid.entities;

public class Promocija {
    int promocijaId;
    int sifraPromocije;
    String opis;
    KnjigaDetalji[] knjige;

    public Promocija(int promocijaId, int sifraPromocije, String opis, KnjigaDetalji[] knjige) {
        this.promocijaId = promocijaId;
        this.sifraPromocije = sifraPromocije;
        this.opis = opis;
        this.knjige = knjige;
    }

    public int getPromocijaId() {
        return promocijaId;
    }

    public void setPromocijaId(int promocijaId) {
        this.promocijaId = promocijaId;
    }

    public int getSifraPromocije() {
        return sifraPromocije;
    }

    public void setSifraPromocije(int sifraPromocije) {
        this.sifraPromocije = sifraPromocije;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public KnjigaDetalji[] getKnjige() {
        return knjige;
    }

    public void setKnjige(KnjigaDetalji[] knjige) {
        this.knjige = knjige;
    }

}
