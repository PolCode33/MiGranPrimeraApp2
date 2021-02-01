package com.explode.migranprimeraapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.explode.migranprimeraapp2.Ejemplo1.MainActivity;

public class EjemplosFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplos_fragment);
    }

    public void ejemplo1(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void ejemplo2(View view) {
        startActivity(new Intent(this, ListaCorreo.class));
    }

    public void ejemplo3(View view) {
        startActivity(new Intent(this, MainFragmentCorreo.class));
    }
}