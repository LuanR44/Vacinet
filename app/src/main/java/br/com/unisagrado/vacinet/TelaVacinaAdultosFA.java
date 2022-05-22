package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pdfview.PDFView;

public class TelaVacinaAdultosFA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_vacina_adultos_fa);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Febre Amarela.pdf").show();

        AlertDialog.Builder ok = new AlertDialog.Builder(TelaVacinaAdultosFA.this);
        ok.setTitle("Sugestão");
        ok.setMessage("Caso esteja difícil de visualizar por conta do tamanho, utilize o zoom do seu aparelho!");
        ok.setCancelable(false);
        ok.setNegativeButton("ok",null);
        ok.create().show();

    }
}