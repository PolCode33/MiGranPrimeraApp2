package com.explode.migranprimeraapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleCorreo extends AppCompatActivity {

    TextView midetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);
        midetalle=findViewById(R.id.TxtDetalle);
        midetalle.setText(" De: " +getIntent().getExtras().getString("de")+
                " Asunto: "+getIntent().getExtras().getString("asunto")+
                " Contenido: "+getIntent().getExtras().getString("texto"));
    }
}