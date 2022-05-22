package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class telaVacinaGestantesHB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_vacina_gestantes_hb);

        AlertDialog.Builder ok = new AlertDialog.Builder(telaVacinaGestantesHB.this);
        ok.setTitle("Sugestão");
        ok.setMessage("Caso esteja difícil de visualizar por conta do tamanho, utilize o zoom do seu aparelho!");
        ok.setCancelable(false);
        ok.setNegativeButton("ok",null);
        ok.create().show();
    }
}