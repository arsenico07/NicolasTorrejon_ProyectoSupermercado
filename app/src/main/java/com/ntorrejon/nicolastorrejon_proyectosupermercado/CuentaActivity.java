package com.ntorrejon.nicolastorrejon_proyectosupermercado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CuentaActivity extends AppCompatActivity {

    private Button button;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);

        button = (Button) findViewById(R.id.button);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ventanaInicio();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ventanaEscaner();

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

    private void ventanaEscaner() {
        Intent i3 = new Intent(this, EscanerActivity.class);
        startActivity(i3);
    }

    public void ventanaInicio(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}