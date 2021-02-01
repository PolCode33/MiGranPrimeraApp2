package com.explode.migranprimeraapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainFragmentCorreo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment_correo);
    }
    public void mostrarDetalle(String texto) {
        ((DetalleCorreoFragment)getSupportFragmentManager()
                .findFragmentById(R.id.FrgDetalle)).mostrarDetalle(texto);
    }
}