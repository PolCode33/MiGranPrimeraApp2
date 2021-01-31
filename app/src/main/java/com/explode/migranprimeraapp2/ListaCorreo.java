package com.explode.migranprimeraapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListaCorreo extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private AdapterCorreo adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_correo);
        recyclerView = findViewById(R.id.recycler_view);
        Correo[] datos =
                new Correo[]{
                        new Correo("Persona 1", "Asunto del correo 1", "Texto del correo 1"),
                        new Correo("Persona 2", "Asunto del correo 2", "Texto del correo 2"),
                        new Correo("Persona 3", "Asunto del correo 3", "Texto del correo 3"),
                        new Correo("Persona 4", "Asunto del correo 4", "Texto del correo 4"),
                        new Correo("Persona 5", "Asunto del correo 5", "Texto del correo 5")};
        adaptador = new AdapterCorreo(this,
                datos);
        recyclerView.setAdapter(adaptador);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
