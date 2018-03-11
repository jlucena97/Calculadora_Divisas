package com.ejercicio.jlm.calculadora_divisas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class tabla extends AppCompatActivity  implements View.OnClickListener {
    private TextView total;
    private EditText cantidad, coin;
    private Button £¥,£€,£$,$¥,€$,€¥,$€,¥£,¥$,€£,¥€,$£,boton;
    private double cantidadInsertada, cantidadTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabla);

        /*Recogemos todos los id's*/
        cantidad = (EditText) findViewById(R.id.cantidad);
        total = (TextView) findViewById(R.id.total);
        coin = (EditText) findViewById(R.id.moneda);
        €$ = (Button) findViewById(R.id.eurosdolares);
        €¥ = (Button) findViewById(R.id.eurosyuanes);
        ¥€ = (Button) findViewById(R.id.yuaneseuros);
        $€ = (Button) findViewById(R.id.dolareseuros);
        €£ = (Button) findViewById(R.id.euroslibras);
        £€ = (Button) findViewById(R.id.libraseuros);
        £$ = (Button) findViewById(R.id.librasdolares);
        ¥$ = (Button) findViewById(R.id.yuanesdolares);
        ¥£ = (Button) findViewById(R.id.yuaneslibras);
        £¥ = (Button) findViewById(R.id.librasyuanes);
        $¥ = (Button) findViewById(R.id.dolaresyuanes);
        $£ = (Button) findViewById(R.id.dolareslibras);
        /*Onclick  de los id's*/
        €$.setOnClickListener(this);
        €¥.setOnClickListener(this);
        ¥$.setOnClickListener(this);
        $€.setOnClickListener(this);
        €£.setOnClickListener(this);
        £€.setOnClickListener(this);
        £¥.setOnClickListener(this);
        ¥€.setOnClickListener(this);
        ¥£.setOnClickListener(this);
        £$.setOnClickListener(this);
        $£.setOnClickListener(this);
        $¥.setOnClickListener(this);

        /*Modificamos la cantidad para que no de error*/
        cantidad.setText("0");

    }

    public void onClick(View v) {

        cantidadInsertada = Double.parseDouble(cantidad.getText().toString());
        DecimalFormat decimal = new DecimalFormat("#.##");
        switch (v.getId()) {
            case R.id.eurosdolares:
                cantidadTotal = cantidadInsertada * 1.17965;
                total.setText(decimal.format(cantidadTotal) + " $");
                String texto = getIntent().getStringExtra("texto");
                coin.setText(texto);
                break;

            case R.id.dolaresyuanes:
                cantidadTotal = cantidadInsertada * 6.61640;
                total.setText(decimal.format(cantidadTotal) + " ¥");
                coin.setText("$");
                break;

            case R.id.dolareseuros:
                cantidadTotal = cantidadInsertada * 0.84812;
                total.setText(decimal.format(cantidadTotal) + " €");
                coin.setText("$");
                break;

            case R.id.euroslibras:
                cantidadTotal = cantidadInsertada * 0.88082;
                total.setText(decimal.format(cantidadTotal) + " £");
                coin.setText("€");
                break;

            case R.id.eurosyuanes:
                cantidadTotal = cantidadInsertada * 7.80365;
                total.setText(decimal.format(cantidadTotal) + " ¥");
                coin.setText("€");
                break;

            case R.id.libraseuros:
                cantidadTotal = cantidadInsertada * 1.13;
                total.setText(decimal.format(cantidadTotal) + " €");
                coin.setText("£");
                break;

            case R.id.yuaneslibras:
                cantidadTotal = cantidadInsertada * 0.11291;
                total.setText(decimal.format(cantidadTotal) + " £");
                coin.setText("¥");
                break;

            case R.id.librasyuanes:
                cantidadTotal = cantidadInsertada * 8.85819;
                total.setText(decimal.format(cantidadTotal) + " ¥");
                coin.setText("£");
                break;

            case R.id.librasdolares:
                cantidadTotal = cantidadInsertada * 1.33899;
                total.setText(decimal.format(cantidadTotal) + " $");
                coin.setText("£");
                break;

            case R.id.yuaneseuros:
                cantidadTotal = cantidadInsertada * 0.12823;
                total.setText(decimal.format(cantidadTotal) + " €");
                coin.setText("¥");
                break;

            case R.id.dolareslibras:
                cantidadTotal = cantidadInsertada * 0.74679;
                total.setText(decimal.format(cantidadTotal) + " £");
                coin.setText("$");
                break;

            case R.id.yuanesdolares:
                cantidadTotal = cantidadInsertada * 0.15115;
                total.setText(decimal.format(cantidadTotal) + " $");
                coin.setText("¥");
                break;

        }

    }
}