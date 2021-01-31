package com.explode.migranprimeraapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GridFragmento extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.grid_fragmento,container,false);
        GridView gv = view.findViewById(R.id.migridview);
        ArrayAdapter miarrayadapter= ArrayAdapter.createFromResource(getActivity(),R.array.lista,android.R.layout.simple_list_item_1);
        gv.setAdapter(miarrayadapter);
        return view;
    }
}
