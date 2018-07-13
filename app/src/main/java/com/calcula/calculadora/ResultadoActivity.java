package com.calcula.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView textoresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textoresultado = findViewById(R.id.textView);

        Intent intentResultado = getIntent();
        Double resultado = intentResultado.getDoubleExtra("resultado" , 0);
        textoresultado.setText(resultado.toString());
    }

    public void voltar(View view){
        finish();
    }
}
