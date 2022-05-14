package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pdfview.PDFView;

public class TelaVacinaAdultosPV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_vacina_adultos_pv);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Pneumocócica 23-valente.pdf").show();

    }
}