package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaVacinaAdultos extends AppCompatActivity {

    Button botaoVacinaHB, botaoVacinaDT, botaoVacinaTV, botaoVacinaFA, botaoVacinaPV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_vacina_adultos);

        botaoVacinaHB = findViewById(R.id.bntVacinaAdultoHB);

        botaoVacinaHB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vacHB = new Intent(getApplicationContext(), TelaVacinaAdultosHB.class);
                startActivity(vacHB);
            }
        });


        botaoVacinaDT = findViewById(R.id.bntVacinaAdultoDT);

        botaoVacinaDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vacDT = new Intent(getApplicationContext(), TelaVacinaAdultosDT.class);
                startActivity(vacDT);
            }
        });

        botaoVacinaTV = findViewById(R.id.bntVacinaAdultoTV);

        botaoVacinaTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vacTV = new Intent(getApplicationContext(), TelaVacinaAdultosTV.class);
                startActivity(vacTV);
            }
        });

        botaoVacinaFA = findViewById(R.id.bntVacinaAdultoFA);

        botaoVacinaFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vacFA = new Intent(getApplicationContext(), TelaVacinaAdultosFA.class);
                startActivity(vacFA);
            }
        });

        botaoVacinaPV = findViewById(R.id.bntVacinaAdultoPV);

        botaoVacinaPV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vacPV = new Intent(getApplicationContext(), TelaVacinaAdultosPV.class);
                startActivity(vacPV);
            }
        });

    }
}