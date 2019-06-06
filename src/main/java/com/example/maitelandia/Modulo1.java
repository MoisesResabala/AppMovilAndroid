package com.example.maitelandia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Modulo1 extends AppCompatActivity {

    private TextView tvM1;
    private RadioButton rb1Correcto, rb1Erroneo, rb2Correcto, rb2Erroneo,rb3Correcto, rb3Erroneo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo1);

        tvM1 = (TextView) findViewById(R.id.textViewM1);
        tvM1.setText("Selecciona la opción correcta");
        rb1Correcto = (RadioButton)findViewById(R.id.rb1Correcto);
        rb1Erroneo = (RadioButton)findViewById(R.id.rb1Erroneo);
        rb2Correcto = (RadioButton)findViewById(R.id.rb2Correcto);
        rb2Erroneo = (RadioButton)findViewById(R.id.rb2Erroneo);
        rb3Correcto = (RadioButton)findViewById(R.id.rb3Correcto);
        rb3Erroneo = (RadioButton)findViewById(R.id.rb3Erroneo);
    }

    //Método botón comprobar
    public void bt_comprobar (View view){
        Integer contador = 0;
        if (rb1Correcto.isChecked()){
            contador = contador + 1;
        }
        if (rb2Correcto.isChecked()){
            contador = contador + 1;
        }
        if (rb3Correcto.isChecked()){
            contador = contador + 1;
        }
        Toast.makeText(this, "Tienes " + contador + " respuestas correctas", Toast.LENGTH_SHORT).show();

        if (contador == 3){
            Toast.makeText(this, "¡Felicitaciones, todas tus respuestas son correctas!", Toast.LENGTH_SHORT).show();
        }
    }

    //Método regresar a activity 2
    public void regresarActivity (View view){
        Intent i = new Intent(this, Modulos.class);
        startActivity(i);
    }
}
