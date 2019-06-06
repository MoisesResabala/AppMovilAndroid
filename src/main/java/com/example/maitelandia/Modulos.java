package com.example.maitelandia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Modulos extends AppCompatActivity {

    private TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulos);

        tv1 = (TextView)findViewById(R.id.textView2);
        tv2 = (TextView)findViewById(R.id.textView3);
        //En el 'getIntent' se obtiene la función que tiene mi primer activity
        //Y en el segundo método, en los parámetros se pone la clave
        String dato =  getIntent().getStringExtra("dato");

        tv1.setText("Bienvenido");
        tv2.setText(dato);
    }

    //Método para botón modulo1
    public void botonModulo1 (View view){
        Intent i = new Intent(this, Modulo1.class);
        startActivity(i);
    }

    //Método para botón modulo2
    public void botonModulo2 (View view){
        Intent i = new Intent(this, Modulo2.class);
        startActivity(i);
    }

    //Método para botón modulo3
    public void botonModulo3 (View view){
        Intent i = new Intent(this, Modulo3.class);
        startActivity(i);
    }

    //Método para botón modulo4
    public void botonModulo4 (View view){
        Intent i = new Intent(this, Modulo4.class);
        startActivity(i);
    }
}
