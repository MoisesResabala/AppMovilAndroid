package com.example.maitelandia;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etUsuario, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociación de los componentes a las variables de la parte lógica de la App
        etUsuario = (EditText)findViewById(R.id.et_nomUsuario);
        etPassword = (EditText)findViewById(R.id.et_password);
    }

    //Método para el botón de registro
    public void registrar (View view){

        String nombre = etUsuario.getText().toString();
        String password = etPassword.getText().toString();

        SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_Editor = preferencias.edit();

        //Estos son los if de validación de insertación de datos
        if (nombre.length() == 0){
            Toast.makeText(this, "Debe ingresar un nombre de usuario", Toast.LENGTH_SHORT).show();
        } else if (password.length() == 0){
            Toast.makeText(this, "Debe ingresar una contraseña", Toast.LENGTH_SHORT).show();
        }
        if(nombre.length() != 0 && password.length() != 0){
            obj_Editor.putString(nombre, password);
            obj_Editor.commit();
            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            etUsuario.setText("");
            etPassword.setText("");
        }
    }

    //Método para el botón ingresar
    public void ingresar (View view){

        //El intent nos dice desde que activity queremos ir a la siguiente en los parámetros
        Intent i = new Intent(this, Modulos.class);
        //Llevamos el nombre de usuario a la otra pantalla
        i.putExtra("dato", etUsuario.getText().toString());

        String nombre = etUsuario.getText().toString();

        SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String password = preferencias.getString(nombre, "");

        if(password.length() == 0){
            Toast.makeText(this, "Usuario no registrado", Toast.LENGTH_SHORT).show();
            etUsuario.setText("");
        }else {
            if (password.equals(etPassword.getText().toString())){
                startActivity(i);
            } else if (!password.equals(etPassword.getText().toString())){
                Toast.makeText(this, "CONTRASEÑA INCORRECTA", Toast.LENGTH_LONG).show();
                etPassword.setText("");
            }
        }
    }
}
