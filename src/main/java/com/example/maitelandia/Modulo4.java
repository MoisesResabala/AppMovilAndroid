package com.example.maitelandia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Modulo4 extends AppCompatActivity {

    private EditText  et1, et2, et3, et4, et5, et6, et7, et8, et9, et10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo4);

        et1 = (EditText)findViewById(R.id.etNum1);
        et2 = (EditText)findViewById(R.id.etNum2);
        et3 = (EditText)findViewById(R.id.etNum3);
        et4 = (EditText)findViewById(R.id.etNum4);
        et5 = (EditText)findViewById(R.id.etNum5);
        et6 = (EditText)findViewById(R.id.etNum6);
        et7 = (EditText)findViewById(R.id.etNum7);
        et8 = (EditText)findViewById(R.id.etNum8);
        et9 = (EditText)findViewById(R.id.etNum9);
        et10 = (EditText)findViewById(R.id.etNum10);
    }

    //Método de las validaciones
    public void validarNumeros(View view){
        if (!et9.getText().toString().equals("9")){
            Toast.makeText(this, "El número NUEVES no es el digitado", Toast.LENGTH_SHORT).show();
        } else {
            if (!et6.getText().toString().equals("6")){
                Toast.makeText(this, "El número SEIS no es el digitado", Toast.LENGTH_SHORT).show();
            } else {
                if (!et8.getText().toString().equals("8")){
                    Toast.makeText(this, "El número OCHO no es el digitado", Toast.LENGTH_SHORT).show();
                }else {
                    if (!et1.getText().toString().equals("1")){
                        Toast.makeText(this, "El número UNO no es el digitado", Toast.LENGTH_SHORT).show();
                    } else {
                        if (!et5.getText().toString().equals("5")){
                            Toast.makeText(this, "El número CINCO no es el digitado", Toast.LENGTH_SHORT).show();
                        } else {
                            if (!et2.getText().toString().equals("2")){
                                Toast.makeText(this, "El número DOS no es el digitado", Toast.LENGTH_SHORT).show();
                            } else {
                                if (!et7.getText().toString().equals("7")){
                                    Toast.makeText(this, "El número SIETE no es el digitado", Toast.LENGTH_SHORT).show();
                                } else {
                                    if (!et3.getText().toString().equals("3")){
                                        Toast.makeText(this, "El número TRES no es el digitado", Toast.LENGTH_SHORT).show();
                                    } else {
                                        if (!et10.getText().toString().equals("10")){
                                            Toast.makeText(this, "El número DIEZ no es el digitado", Toast.LENGTH_SHORT).show();
                                        } else {
                                            if (!et4.getText().toString().equals("4")){
                                                Toast.makeText(this, "El número CUATRO no es el digitado", Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (et9.getText().toString().equals("9") && et6.getText().toString().equals("6") && et8.getText().toString().equals("8")
        && et1.getText().toString().equals("1") && et5.getText().toString().equals("5") && et2.getText().toString().equals("2")
        && et7.getText().toString().equals("7") && et3.getText().toString().equals("3") && et10.getText().toString().equals("10")
        && et4.getText().toString().equals("4")){
            Toast.makeText(this, "Todos tus números son correctos. ¡Felicitaciones!", Toast.LENGTH_LONG).show();
        }
    }

    //Método regresar a activity 2
    public void regresarActivity (View view){
        Intent i = new Intent(this, Modulos.class);
        startActivity(i);
    }
}
