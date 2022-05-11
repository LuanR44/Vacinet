package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaVacinaAdultosHB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_vacina_adultos_hb);
    }
}