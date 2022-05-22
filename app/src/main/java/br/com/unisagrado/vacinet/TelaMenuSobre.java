package br.com.unisagrado.vacinet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaMenuSobre extends AppCompatActivity {

    Button botaoRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_menu_sobre);

        botaoRef = findViewById(R.id.btnref);

        botaoRef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telarf = new Intent(getApplicationContext(), telaSobreRef.class);
                startActivity(telarf);
            }
        });
    }
}