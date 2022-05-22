package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.pdfview.PDFView;

public class telaSobreRefVac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_sobre_ref_vac);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("calendario-de-vacinacao-2020_adulto-e-idoso.pdf").show();

        AlertDialog.Builder ok = new AlertDialog.Builder(telaSobreRefVac.this);
        ok.setTitle("Sugestão");
        ok.setMessage("Caso esteja difícil de visualizar por conta do tamanho, utilize o zoom do seu aparelho!");
        ok.setCancelable(false);
        ok.setNegativeButton("ok",null);
        ok.create().show();
    }
}