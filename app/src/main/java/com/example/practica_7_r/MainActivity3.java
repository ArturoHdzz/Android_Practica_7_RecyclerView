package com.example.practica_7_r;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.practica_7_r.model.Libro;

public class MainActivity3 extends AppCompatActivity {

        TextView textView2;
        TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Libro libro = (Libro) getIntent().getSerializableExtra("libro");
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        textView3.setText(libro.getTitulo());
        textView2.setText(libro.getDescripcion());

    }
}