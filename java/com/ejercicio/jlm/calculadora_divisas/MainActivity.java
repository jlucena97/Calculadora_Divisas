package com.ejercicio.jlm.calculadora_divisas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private Button boton;
    private EditText euro,eurolibra,eurodolar,euroyuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Variables*/
        euro = (EditText) findViewById(R.id.euro);
        eurolibra = (EditText) findViewById(R.id.eurolibra);
        eurodolar = (EditText) findViewById(R.id.eurodolar);
        /*Boton*/
        boton = (Button) findViewById(R.id.enviar);

        boton.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,tabla.class);
        intent.putExtra("texto",euro.getText().toString());
        startActivity(intent);
    }
}