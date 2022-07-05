package com.example.perceandroid.entities;

public class KnjigaDetalji {
    int knjigaId;
    int knjigaUrl;
    String knjigaNaziv;

    public KnjigaDetalji(int knjigaId, int knjigaUrl, String knjigaNaziv) {
        this.knjigaId = knjigaId;
        this.knjigaUrl = knjigaUrl;
        this.knjigaNaziv = knjigaNaziv;
    }

    public int getKnjigaId() {
        return knjigaId;
    }

    public void setKnjigaId(int knjigaId) {
        this.knjigaId = knjigaId;
    }

    public int getKnjigaUrl() {
        return knjigaUrl;
    }

    public void setKnjigaUrl(int knjigaUrl) {
        this.knjigaUrl = knjigaUrl;
    }

    public String getKnjigaNaziv() {
        return knjigaNaziv;
    }

    public void setKnjigaNaziv(String knjigaNaziv) {
        this.knjigaNaziv = knjigaNaziv;
    }
}
