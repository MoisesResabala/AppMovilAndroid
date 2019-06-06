package com.example.maitelandia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Modulo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo2);
    }

    //Método botón erróneo
    public void errorEleccion (View view){
        Toast.makeText(this, "Imagen incorrecta", Toast.LENGTH_SHORT).show();
    }

    //Método botón correcto
    public void correctaEleccion (View view){
        Toast.makeText(this, "FELICITACIONES CRACK", Toast.LENGTH_SHORT).show();
    }

    //Método regresar a activity 2
    public void regresarActivity (View view){
        Intent i = new Intent(this, Modulos.class);
        startActivity(i);
    }
}
