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
        Lista_libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        Lista_libros.add(new Libro("1984", "George Orwell"));
        Lista_libros.add(new Libro("Matar un ruiseñor", "Harper Lee"));
        Lista_libros.add(new Libro("El Gran Gatsby", "F. Scott Fitzgerald"));
        Lista_libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes Saavedra"));
        Lista_libros.add(new Libro("Harry Potter", "J.K. Rowling"));
        Lista_libros.add(new Libro("Crimen y castigo", "Fyodor Dostoevsky"));
        Lista_libros.add(new Libro("En busca del tiempo", "Marcel Proust"));
        Lista_libros.add(new Libro("El Señor de los Anillos", "J.R.R. Tolkien"));
        Lista_libros.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón"));
        Lista_libros.add(new Libro("Orgullo y prejuicio", "Jane Austen"));
        Lista_libros.add(new Libro("Moby-Dick", "Herman Melville"));
        Lista_libros.add(new Libro("El amor", "Gabriel García Márquez"));
        Lista_libros.add(new Libro("Ulises", "James Joyce"));
        Lista_libros.add(new Libro("Los juegos del hambre", "Suzanne Collins"));
        Lista_libros.add(new Libro("Crónica de una muerte", "Gabriel García Márquez"));
        Lista_libros.add(new Libro("El código Da Vinci", "Dan Brown"));
        Lista_libros.add(new Libro("Los pilares de la Tierra", "Ken Follett"));
        Lista_libros.add(new Libro("La carretera", "Cormac McCarthy"));
        Lista_libros.add(new Libro("El nombre de la rosa", "Umberto Eco"));

        LibroAdapter la = new LibroAdapter(Lista_libros);
        RecyclerView rc = findViewById(R.id.rcLibros);
        rc.setAdapter(la);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);
    }
}