package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaSobreRef extends AppCompatActivity {

    Button calendarioAI, calendarioG, tuasaude, icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_sobre_ref);

        calendarioAI = findViewById(R.id.btncvAI);

        calendarioAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calendAI = new Intent(getApplicationContext(), telaSobreRefVac.class);
                startActivity(calendAI);

            }
        });

        calendarioG= findViewById(R.id.btncvG);

        calendarioG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calendG = new Intent(getApplicationContext(), telaCalendarioG.class);
                startActivity(calendG);
            }
        });

        tuasaude = findViewById(R.id.btnSite);

        tuasaude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tuasaude.com/tudo-sobre-vacinas/")));
            }
        });

        tuasaude = findViewById(R.id.btnSite2);

        tuasaude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tuasaude.com/tudo-sobre-vacinas/")));
            }
        });

        icon = findViewById(R.id.btnIcon);

        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/free-icons/vaccine")));
            }
        });
    }
}