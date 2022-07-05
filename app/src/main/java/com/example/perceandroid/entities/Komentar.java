package com.example.perceandroid.entities;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Komentar {
    int knjigaId;
    KorisnikKomentar[] komentari;


    public static class KorisnikKomentar {
        String user;
        String komentar;

        public KorisnikKomentar(String user, String komentar) {
            this.user = user;
            this.komentar = komentar;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getKomentar() {
            return komentar;
        }

        public void setKomentar(String komentar) {
            this.komentar = komentar;
        }
    }

    public Komentar(int knjigaId, KorisnikKomentar[] komentari) {
        this.knjigaId = knjigaId;
        this.komentari = komentari;
    }

    public int getKnjigaId() {
        return knjigaId;
    }

    public void setKnjigaId(int knjigaId) {
        this.knjigaId = knjigaId;
    }

    public KorisnikKomentar[] getKomentari() {
        return komentari;
    }

    public void setKomentari(KorisnikKomentar[] komentari) {
        this.komentari = komentari;
    }


    public static ArrayList<Komentar.KorisnikKomentar> getKorisnikKomentar(int knjigaId) {
        ArrayList<Komentar.KorisnikKomentar> coms = new ArrayList<Komentar.KorisnikKomentar>();

        for (int i = 0; i < SviPodaci.sviKomentari.length; i++) {
            if(SviPodaci.sviKomentari[i].knjigaId == knjigaId){
               KorisnikKomentar kk[]= SviPodaci.sviKomentari[i].komentari;
                for(int j=0; j< kk.length; j++){
                    coms.add(kk[j]);
                }
            }
        }
        return new ArrayList<Komentar.KorisnikKomentar>(coms);


    }
}
