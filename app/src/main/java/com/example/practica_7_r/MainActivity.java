package com.example.practica_7_r;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.practica_7_r.adapter.LibroAdapter;
import com.example.practica_7_r.model.Libro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Libro> Lista_libros = new ArrayList<>();
        Lista_libros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien"));
        Lista_libros.add(new Libro("El hobbit", "J.R.R. Tolkien"));
        Lista_libros.add(new Libro("El silmarillion", "J.R.R. Tolkien"));

        LibroAdapter la = new LibroAdapter(Lista_libros);
        RecyclerView rc = findViewById(R.id.rcLibros);
        rc.setAdapter(la);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);
    }
}