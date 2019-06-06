package com.example.maitelandia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Modulo3 extends AppCompatActivity {

    private RadioButton rb1Correcto, rb1Erroneo, rb2Correcto, rb2Erroneo,rb3Correcto, rb3Erroneo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo3);

        rb1Correcto = (RadioButton)findViewById(R.id.rb_1_correcto);
        rb1Erroneo = (RadioButton)findViewById(R.id.rb_1_erroneo);
        rb2Correcto = (RadioButton)findViewById(R.id.rb_2_correcto);
        rb2Erroneo = (RadioButton)findViewById(R.id.rb_2_erroneo);
        rb3Correcto = (RadioButton)findViewById(R.id.rb_3_correcto);
        rb3Erroneo = (RadioButton)findViewById(R.id.rb_3_erroneo);
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
