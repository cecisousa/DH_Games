package com.example.dh_games;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PaginaComprasActivity extends AppCompatActivity {

    private ImageView produto1;
    private ImageView produto2;
    private ImageView produto3;
    private Button botao2;
    private TextView valor1;
    private TextView valor2;
    private TextView valor3;
    private TextView valorFinal;
    private Double precoRevista1;
    private Double precoRevista2;
    private Double precoRevista3;
    private Double precoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_compras);

        produto1 = findViewById(R.id.revista1);
        produto2 = findViewById(R.id.revista2);
        produto3 = findViewById(R.id.revista3);
        botao2 = findViewById(R.id.button2);
        valor1 = findViewById(R.id.preco1);
        valor2 = findViewById(R.id.preco2);
        valor3 = findViewById(R.id.preco3);
        valorFinal = findViewById(R.id.textView3);

        precoRevista1 = 35.00;
        precoRevista2 = 10.00;
        precoRevista3 = 23.00;
        precoFinal = 0.00;
        valor1.setText("R$ "+ String.format("%.2f", precoRevista1).toString());
        valor2.setText("R$ "+ String.format("%.2f", precoRevista2).toString());
        valor3.setText("R$ "+ String.format("%.2f", precoRevista3).toString());

        produto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(
                        PaginaComprasActivity.this,
                        "Valor selecionado de R$ " + valor1.getText(),
                        Toast.LENGTH_SHORT
                ).show();
                precoFinal += precoRevista1;
                valorFinal.setText("R$ " + String.format("%.2f", precoFinal).toString());
            }
        });

        produto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        PaginaComprasActivity.this,
                        "Valor selecionado de R$ " + valor2.getText(),
                        Toast.LENGTH_SHORT
                ).show();
                precoFinal += precoRevista2;
                valorFinal.setText("R$ " + String.format("%.2f", precoFinal).toString());
            }
        });

        produto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        PaginaComprasActivity.this,
                        "Valor selecionado de R$ " + valor3.getText(),
                        Toast.LENGTH_SHORT
                ).show();
                precoFinal += precoRevista3;
                valorFinal.setText("R$ " + String.format("%.2f", precoFinal).toString());
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PaginaComprasActivity.this, TelaFinalActivity.class));
            }
        });

    }
}
