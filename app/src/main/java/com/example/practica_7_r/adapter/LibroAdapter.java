package com.example.practica_7_r.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica_7_r.R;
import com.example.practica_7_r.model.Libro;

import java.util.List;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.LibroViewHolder> {

    List<Libro> Lista_libros;
    final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(Libro item);
    }

    public LibroAdapter(List<Libro> lista_libros, OnItemClickListener listener) {
        Lista_libros = lista_libros;
        this.listener = listener;
    }
    @NonNull
    @Override
    public LibroAdapter.LibroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly= LayoutInflater.from(parent.getContext());
        View v = ly.inflate(R.layout.itemlibro, parent, false);
        return new LibroViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LibroAdapter.LibroViewHolder holder, int position) {
        Libro l= Lista_libros.get(position);
        holder.setData(l);
    }

    @Override
    public int getItemCount() {
        return Lista_libros.size();
    }

    public class LibroViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitulo;
        TextView txtAutor;
        Libro li;

        public LibroViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitulo= itemView.findViewById(R.id.txtTitulo);
            txtAutor= itemView.findViewById(R.id.txtAutor);
        }

        public void setData(Libro l){
            li = l;
            txtTitulo.setText(l.getTitulo());
            txtAutor.setText(l.getAutor());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(li);
                }
            });
        }
    }
}
