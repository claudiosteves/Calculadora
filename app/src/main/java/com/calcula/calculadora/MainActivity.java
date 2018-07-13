package com.calcula.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;
    Button botaosoma;
    Button botaosubtracao;
    Button botaomultiplicacao;
    Button botaodivisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = findViewById(R.id.editNumero1Main);
        numero2 = findViewById(R.id.editNumero2Main);
        botaosubtracao = findViewById(R.id.btnSubtracaoMain);
        botaosubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double resultado = Double.parseDouble (numero1.getText().toString())
                        - Double.parseDouble (numero2.getText().toString());

                String packageContext;
                Intent intentResultado =
                        new Intent(MainActivity.this, ResultadoActivity.class);
                intentResultado.putExtra("resultado" , resultado);

                startActivity(intentResultado);
            }
        });
        botaodivisao = findViewById(R.id.btnDivisaoMain);
        botaodivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double resultado = Double.parseDouble (numero1.getText().toString())
                        / Double.parseDouble (numero2.getText().toString());

                String packageContext;
                Intent intentResultado =
                        new Intent(MainActivity.this, ResultadoActivity.class);
                intentResultado.putExtra("resultado" , resultado);

                startActivity(intentResultado);

            }
        });
        botaomultiplicacao = findViewById(R.id.btnMultiplicacaoMain);
        botaomultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double resultado = Double.parseDouble (numero1.getText().toString())
                        * Double.parseDouble (numero2.getText().toString());

                String packageContext;
                Intent intentResultado =
                        new Intent(MainActivity.this, ResultadoActivity.class);
                intentResultado.putExtra("resultado" , resultado);

                startActivity(intentResultado);
            }
        });
        botaosoma = findViewById(R.id.btnSomaMain);
        botaosoma.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {

               Double resultado = Double.parseDouble (numero1.getText().toString())
                + Double.parseDouble (numero2.getText().toString());

                String packageContext;
                Intent intentResultado =
                        new Intent(MainActivity.this, ResultadoActivity.class);
                intentResultado.putExtra("resultado" , resultado);

                startActivity(intentResultado);

            }
        });

    }

    }

