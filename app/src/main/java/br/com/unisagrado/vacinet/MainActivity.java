package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoVacinacao, botaoSaibaMais, botaoSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoVacinacao = findViewById(R.id.bntVacinas);

        botaoVacinacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenuV = new Intent(getApplicationContext(), telaMenuVacinas.class);
                startActivity(telaMenuV);
            }
        });

        botaoSaibaMais = findViewById(R.id.bntSMMenu);

        botaoSaibaMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gov.br/saude/pt-br")));
            }
        });

        botaoSobre = findViewById(R.id.bntSobreMenu);

        botaoSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMenuS = new Intent(getApplicationContext(), TelaMenuSobre.class);
                startActivity(telaMenuS);
            }
        });

    }
}