package com.example.parcial3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b1;
    private Button btnIngresar, btnRegistro, btnSoporte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button) findViewById(R.id.btn_ingresar);

        b1.setOnClickListener(this);

        btnIngresar = (Button) findViewById(R.id.btn_ingresar);
        btnRegistro = (Button) findViewById(R.id.btn_registro);
        btnSoporte = (Button) findViewById(R.id.btn_soporte);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIngresar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editTextUsuario = findViewById(R.id.editTextUsuario);
                        EditText editTextContraseña = findViewById(R.id.editTextContraseña);
                        String usuario = editTextUsuario.getText().toString().trim();
                        String contraseña = editTextContraseña.getText().toString().trim();

                        if(usuario.equals("romo") && contraseña.equals("romo")) {
                            Toast.makeText(getApplicationContext(), "Iniciando Sesion", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
/*
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registro.class);
                startActivity(intent);
            }
        });

        btnSoporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Soporte.class);
                startActivity(intent);
            }
        });*/
    }

    @Override
    public void onClick(View view) {


    }
}