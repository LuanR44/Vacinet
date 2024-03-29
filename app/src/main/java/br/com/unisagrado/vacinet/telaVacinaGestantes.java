package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaVacinaGestantes extends AppCompatActivity {

    Button botaoVacinaT, botaoVacinaH, botaoVacinaI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_vacina_gestantes);

        botaoVacinaT = findViewById(R.id.bntGestantesTriplice);

        botaoVacinaT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vacT = new Intent(getApplicationContext(), TelaVacinaAdultosDT.class);
                startActivity(vacT);
            }
        });

        botaoVacinaH = findViewById(R.id.bntGestantesHepatiteB);

        botaoVacinaH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vacHB = new Intent(getApplicationContext(), TelaVacinaAdultosHB.class);
                startActivity(vacHB);
            }
        });

        botaoVacinaI = findViewById(R.id.bntGestantesInfluenza);

        botaoVacinaI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vacIF = new Intent(getApplicationContext(),TelaVacinaAdultosTV.class);
                startActivity(vacIF);
            }
        });
    }
}