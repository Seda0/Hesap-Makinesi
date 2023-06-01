package com.example.myapplication;

public class Hesapla {
    private int gelenSayi1, gelenSayi2;

    public Hesapla(int gelenSayi1, int gelenSayi2) {
        this.gelenSayi1 = gelenSayi1;
        this.gelenSayi2 = gelenSayi2;

    }


    public float toplam() {
        return gelenSayi1 + gelenSayi2;

    }

    public float fark() {
        return gelenSayi1 - gelenSayi2;

    }

    public float bolum() {
        return gelenSayi1 / gelenSayi2;

    }

    public float carpim() {
        return gelenSayi1 * gelenSayi2;

    }
}
