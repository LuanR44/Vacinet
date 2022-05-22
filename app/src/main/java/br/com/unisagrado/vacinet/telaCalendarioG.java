package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pdfview.PDFView;

public class telaCalendarioG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_sobre_ref_vac);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("calend-sbim-gestante.pdf").show();
    }
}