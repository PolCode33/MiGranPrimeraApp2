package com.explode.migranprimeraapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListaCorreoFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private AdapterCorreo adaptador;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_lista_correo, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        Correo[] datos =
                new Correo[]{
                        new Correo("Persona 1", "Asunto del correo 1", "Texto del correo 1"),
                        new Correo("Persona 2", "Asunto del correo 2", "Texto del correo 2"),
                        new Correo("Persona 3", "Asunto del correo 3", "Texto del correo 3"),
                        new Correo("Persona 4", "Asunto del correo 4", "Texto del correo 4"),
                        new Correo("Persona 5", "Asunto del correo 5", "Texto del correo 5")};
        adaptador = new AdapterCorreo(getActivity(),
                datos);
        recyclerView.setAdapter(adaptador);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }
}
