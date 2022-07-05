package com.example.perceandroid.entities;

import com.example.perceandroid.R;

public final class SviPodaci {
    public static Korisnik[] sviKorisnici = {
            new Korisnik(1, "Tamara", "Stevanovic", "+381644233932", "Borska 36", "stevanovic.tamara12@gmail.com", "1", "taki"),
            new Korisnik(2, "Filip", "Apostolakopoulos", "+381638300930", "Vojvode Stepe 39", "stevanovic.tamara12@gmail.com", "1", "filip"),
            new Korisnik(3, "Daria", "Stevanovic", "381644233932", "Borska 36", "stevanovic.tamara12@gmail.com", "1", "daki"),
            new Korisnik(4, "Darko", "Stevanovic", "381644233932", "Borska 36", "stevanovic.tamara12@gmail.com", "1", "dare"),
            new Korisnik(5, "Admin", "Stevanovic", "381644233932", "Borska 36", "stevanovic.tamara12@gmail.com", "sifra123", "admin"),
            new Korisnik(6, "Pera", "Stevanovic", "381644233932", "Borska 36", "stevanovic.tamara12@gmail.com", "sifra123", "pera")

    };

    public static Knjiga[] sveKnjige = {
            new Knjiga(1, "Stepenice straha / Sveti vetar", "Miroslav Antic", 2021, 150, R.drawable.stepenice_straha, "Kratki roman Stepenice straha je ljubavna priča o sazrevanju Vuka Pavlovića u jednom morskom gradiću. Tinejdžer Vuk je na ivici ponora koji deli dečaštvo i mladost, ali kao odlučujući korak ka samostalnosti odabira da osvoji visoku i strmu morsku liticu koja je već usmrtila nekolicinu hrabrih. Njegovi roditelji se svađaju, njegov svet uzdrmala je pojava devojke Olje, a on se okreće simpatičnoj profesorki muzike Bobi..."),
            new Knjiga(2, "Sedam stubova nauke", "Džon Gribin", 2022, 500, R.drawable.sedam_stubova_nauke, "Ti „stubovi nauke“ najčešće prkose zdravom razumu. Čvrsta tela su na atomskom nivou uglavnom nepregledna prostranstva praznog prostora, što nas dovodi do pitanja: šta onda spaja čestice od kojih su sačinjena i zašto mi kad udarimo glavom o taj prazan prostor vidimo sve zvezde? S obzirom na to da nema nikakve posebne „sile života“, po čemu se onda živa bića razlikuju od neživih predmeta? U zvezdama su stvoreni hemijski elementi, ali jesu li one odgovorne i za postojanje obilja organskih molekula u čitavom univerzumu? I zašto led pluta po površini vode kad većina čvrstih tela tone? Možda ste pomislili da je to sasvim beznačajno pitanje ali kad led ne bi plutao, nikada ne bi bilo života na Zemlji."),
            new Knjiga(3, "Levoruka žena", "Peter Handke", 2022, 400, R.drawable.levoruka_zena, "Bez očiglednog razloga, a pod uticajem „prosvetljenja“ koje ne želi da objašnjava, Marijana traži od svog muža da je napusti, da ode i ostavi je samu sa osmogodišnjim detetom. I evo je, konačno „slobodne“, kako najpre proživljava trenutke panike nemirno tumarajući po sobama koje počinju da je guše. Vraća se i na stari posao prevoditeljke s francuskog, ali dok sedi u kući za pisaćom mašinom, nije u stanju da kuca. Tišina u stanu je iscrpljuje, pa izlazi u šetnje, posećuje svoju prijateljicu Francisku. I tako dan za danom, iz časa u čas, ono što je počelo kao bekstvo od zastrašujuće praznine života postepeno postaje istinsko oslobođenje."),
            new Knjiga(4, "Žena koja godinu dana nije ustala iz kreveta", "Sju Taunzend", 2022, 255, R.drawable.zena_koja_godinu_dana_nije_ustala_iz_kreveta, "Istog dana kad su njeni nadareni blizanci otišli od kuće na univerzitet, Eva je legla u krevet i ostala tamo. Sedamnaest godina je želela da celom svetu uzvikne: „Dosta! Ne mogu više!“ i konačno joj se pružila prilika za to"),
            new Knjiga(5, "Svako je sposoban za vezu", "Štefani Štal", 2022, 280, R.drawable.svako_je_sposoban_za_vezu_v, "Ispunjena ljubavna veza nije stvar sreće, već lične odluke, tvrdi Štefani Štal, autorka bestselera iz oblasti psihologije i vodeći nemački stručnjak za strah od vezivanja. Nemojte čekati da vam na vrata pokuca prava osoba ili da se vaš aktuelni partner promeni i iznenada ispuni sva vaša očekivanja. To se neće desiti. Nije bitno da li ste već u vezi ili samo razmišljate o tome – knjiga koju imate pred sobom pomoći će vam da shvatite koliko emocionalnost formirana u detinjstvu utiče na vaše sadašnje emocije i osetljivost i koliko rad sa „unutrašnjim detetom“ doprinosi uspešno ostvarenju odnosa sa voljenom osobom. ")
    };

    public static Komentar.KorisnikKomentar[] komentari1 = {
            new Komentar.KorisnikKomentar("filip", "Super knjiga!"),
            new Komentar.KorisnikKomentar("daki", "Za svaku preporuku"),
            new Komentar.KorisnikKomentar("dare", "Odlican izbor :)"),
    };
    public static Komentar.KorisnikKomentar[] komentari2 = {
            new Komentar.KorisnikKomentar("daki", "Prezadovoljna sam :)"),
    };
    public static Komentar[] sviKomentari = {
            new Komentar(1, komentari1),
            new Komentar(2, komentari2)

    };

    public static Preporuceno.Slika[] preporuceno1 = {
            new Preporuceno.Slika(R.drawable.stepenice_straha, 1, new String[]{"filip", "daki", "dare"}),
    };
    public static Preporuceno.Slika[] preporuceno2 = {
            new Preporuceno.Slika(R.drawable.sedam_stubova_nauke, 2, new String[]{"filip", "daki"}),
    };
    public static Preporuceno.Slika[] preporuceno3 = {
            new Preporuceno.Slika(R.drawable.zena_koja_godinu_dana_nije_ustala_iz_kreveta, 3, new String[]{"filip", "daki"})
    };
    public static Preporuceno svePreporuceno = new
            Preporuceno("taki", new Preporuceno.Slika[][]{preporuceno1, preporuceno2, preporuceno3});

    static KnjigaDetalji[] knjigeNaPromociji1 = {
            new KnjigaDetalji(1, R.drawable.stepenice_straha, "Stepenice straha / Sveti vetar"),
            new KnjigaDetalji(2, R.drawable.sedam_stubova_nauke, "Sedam stubova nauke"),
            new KnjigaDetalji(3, R.drawable.levoruka_zena, "Levoruka žena")
    };
    static KnjigaDetalji[] knjigeNaPromociji2 = {
            new KnjigaDetalji(5, R.drawable.svako_je_sposoban_za_vezu_v, "Svako je sposoban za vezu"),
            new KnjigaDetalji(4, R.drawable.zena_koja_godinu_dana_nije_ustala_iz_kreveta, "Žena koja godinu dana nije ustala iz kreveta")
    };
   public static Promocija[] svePromocije = {
            new Promocija(1, 100, "Top Ponuda", knjigeNaPromociji1),
            new Promocija(2, 101, "Novo", knjigeNaPromociji2),

    };

   public static int korisnikUSistemu = 0;

}
