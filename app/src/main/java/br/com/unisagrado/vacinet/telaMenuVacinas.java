package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaMenuVacinas extends AppCompatActivity {

    Button botaoA, botaoG, botaoI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_menu_vacinas);

        botaoA = findViewById(R.id.bntAdultos);

        botaoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaAd = new Intent(getApplicationContext(), telaVacinaAdultos.class);
                startActivity(telaAd);
            }
        });

        botaoG = findViewById(R.id.bntGestantes);

        botaoG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaGe = new Intent(getApplicationContext(), telaVacinaGestantes.class);
                startActivity(telaGe);
            }
        });

        botaoI = findViewById(R.id.bntIndigenas);

        botaoI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaIn = new Intent(getApplicationContext(), TelaVacinaIndigenas.class);
                startActivity(telaIn);
            }
        });

    }
}