package com.ntorrejon.nicolastorrejon_proyectosupermercado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EscanerActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escaner);

        button2 = (Button) findViewById(R.id.button2);
        button = (Button) findViewById(R.id.button);
        button4 = (Button) findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ventanaCuenta();

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ventanaInicio();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ventanaCarrito();

            }
        });
    }

    private void ventanaCarrito() {
        Intent i2 = new Intent(this, CarritoActivity.class);
        startActivity(i2);
    }

    private void ventanaInicio() {
        Intent i3 = new Intent(this, MainActivity.class);
        startActivity(i3);
    }

    public void ventanaCuenta(){
        Intent i = new Intent(this, CuentaActivity.class);
        startActivity(i);
    }
}