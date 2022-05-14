package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pdfview.PDFView;

public class TelaVacinaAdultosTV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_vacina_adultos_tv);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Influenza.pdf").show();
    }
}