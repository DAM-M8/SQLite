package com.example.sqliteaspp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/**
 * Clase principal del restaurante. Permite ver la carta del restaurante, pedir
 * comandas, calcular la cuenta de una mesa, cobrar mesas y gestionar el alta y
 * baja de reservas de clientes.
 *
 * @author Laura Lopez
 */
public class MainActivity extends Activity {

    private Button boton;
    public GestorBDRestaurante gbdRest = new GestorBDRestaurante(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gbdRest.cargarDatos();

        boton = (Button) findViewById(R.id.Button01);
        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                lanzarPlatos(null);
            }
        });

        boton = (Button) findViewById(R.id.Button02);
        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                lanzarHacerPedido(null);
            }
        });

        boton = (Button) findViewById(R.id.Button03);
        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                lanzarCalcularPedido(null);
            }
        });

        boton = (Button) findViewById(R.id.Button04);
        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                lanzarReserva(null);
            }
        });

        boton = (Button) findViewById(R.id.Button05);
        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                lanzarEliminarReserva(null);
            }
        });

        boton = (Button) findViewById(R.id.Button06);
        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                lanzarsalir();
            }
        });

    }


    public void lanzarPlatos(View view) {
        Intent i = new Intent(this, ListarPlatos.class);
        startActivity(i);
    }

    public void lanzarHacerPedido(View view) {

        Intent i = new Intent(this, PedirPlatos.class);
        startActivity(i);
    }

    public void lanzarCalcularPedido(View view) {
        Intent i = new Intent(this, CalcularPedido.class);
        startActivity(i);
    }

    public void lanzarReserva(View view) {
        Intent i = new Intent(this, Reservar.class);
        startActivity(i);
    }

    public void lanzarEliminarReserva(View view) {
        Intent i = new Intent(this, EliminarReserva.class);
        startActivity(i);
    }

    public void lanzarsalir() {
        finish();
    }


}

