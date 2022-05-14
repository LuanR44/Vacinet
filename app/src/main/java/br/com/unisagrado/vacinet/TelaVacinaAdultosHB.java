package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import android.os.Bundle;
import com.pdfview.PDFView;


public class TelaVacinaAdultosHB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_vacina_adultos_hb);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Hepatite B.pdf").show();
    }
}