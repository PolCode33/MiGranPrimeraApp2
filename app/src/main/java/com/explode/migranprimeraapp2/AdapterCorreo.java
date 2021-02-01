package com.explode.migranprimeraapp2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AdapterCorreo extends RecyclerView.Adapter<AdapterCorreo.ViewHolder> {
    private LayoutInflater inflador; Correo[] datos; Context micontext;
    public AdapterCorreo(Context context, Correo[] datos) {
        this.datos= datos;
        micontext=context;
        inflador = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.list_item_correo, parent, false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, final int i) {
        holder.titulo.setText(datos[i].getDe());
        holder.subtitutlo.setText(datos[i].getAsunto());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(micontext, DetalleCorreo.class);
                intent.putExtra("texto",datos[i].getTexto());
                intent.putExtra("de",datos[i].getDe());
                intent.putExtra("asunto",datos[i].getAsunto());
                micontext.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return datos.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titulo, subtitutlo;
        ViewHolder(View itemView) {
            super(itemView);
            titulo = (TextView)itemView.findViewById(R.id.LblDe);
            subtitutlo = (TextView)itemView.findViewById(R.id.LblAsunto);
        }
    }
}
