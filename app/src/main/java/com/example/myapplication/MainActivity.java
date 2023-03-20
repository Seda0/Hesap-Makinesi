package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStore;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText editTextBirinciSayi, editTextİkinciSayi;
    private TextView textViewSonuc;
    private String birinciSayi, ikinciSayi;
    private int s1, s2;
    private Hesapla hesapla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextBirinciSayi = (EditText) findViewById(R.id.editTextBirinciSayi);
        editTextİkinciSayi = (EditText) findViewById(R.id.editTextTextIkinciSayi);
        textViewSonuc = (TextView) findViewById(R.id.textViewSonuc);
    }

    public void btnHesapla(View v) {

        birinciSayi = editTextBirinciSayi.getText().toString();
        ikinciSayi = editTextİkinciSayi.getText().toString();
        if (!TextUtils.isEmpty(birinciSayi) && !TextUtils.isEmpty(ikinciSayi)) {
            s1 = Integer.valueOf(birinciSayi);
            s2 = Integer.valueOf(ikinciSayi);
            hesapla = new Hesapla(s1, s2);

            float sonuc = 0;
            switch (v.getId()) {

                case R.id.btnTopla:
                    sonuc = hesapla.toplam();
                    break;
                case R.id.btnCikar:
                    sonuc = hesapla.fark();
                    break;
                case R.id.btnCarp:
                    sonuc = hesapla.carpim();
                    break;
                case R.id.btnBolme:
                    sonuc = hesapla.bolum();
                    break;
            }

            textViewSonuc.setText("Sonuç:" + sonuc);
        } else
            textViewSonuc.setText("Girilen Değerler Boş Olamaz.");


    }
}