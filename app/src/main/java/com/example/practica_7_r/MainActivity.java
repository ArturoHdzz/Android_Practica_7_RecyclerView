package com.example.practica_7_r;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.example.practica_7_r.adapter.LibroAdapter;
import com.example.practica_7_r.model.Libro;

import java.util.ArrayList;
import java.util.List;
import android.Manifest;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verificar();

        List<Libro> Lista_libros = new ArrayList<>();
        Lista_libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "Esta obra maestra narra la historia de la familia Buendía a lo largo de siete generaciones en el pueblo ficticio de Macondo. Llena de realismo mágico, la novela explora temas como la soledad, el amor y la guerra en un mundo lleno de mariposas amarillas mágicas y sucesos surrealistas."));
        Lista_libros.add(new Libro("1984", "George Orwell", "En un sombrío futuro distópico, la novela introduce los conceptos del omnipresente y vigilante Gran Hermano o Hermano Mayor, la habitación 101, la policía del pensamiento y la neolengua. Winston Smith lucha por la verdad en un mundo donde el gobierno controla la realidad y la percepción."));
        Lista_libros.add(new Libro("Matar un ruiseñor", "Harper Lee", "La historia se desarrolla en la ficticia ciudad sureña de Maycomb, Alabama, durante la Gran Depresión. Contada a través de los ojos de Scout Finch, una niña de seis años, la novela aborda temas de racismo y justicia mientras su padre, Atticus Finch, defiende a un hombre negro acusado injustamente."));
        Lista_libros.add(new Libro("El Gran Gatsby", "F. Scott Fitzgerald", "La novela transcurre en la glamurosa década de 1920 en Nueva York. Jay Gatsby, un enigmático millonario, organiza suntuosas fiestas en su mansión en busca de reconquistar a su amor de juventud, Daisy Buchanan. La historia explora la decadencia de la alta sociedad y la búsqueda del sueño americano."));
        Lista_libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes Saavedra", "Una joya de la literatura española que narra las locuras de un caballero que se cree un caballero andante y emprende aventuras absurdas. Don Quijote lucha contra molinos de viento y cuestiona las convenciones en una sátira ingeniosa."));
        Lista_libros.add(new Libro("Harry Potter", "J.K. Rowling", "La saga de Harry Potter sigue al joven mago en su viaje desde la oscuridad a la luz. Llena de magia, amistad y aventura, la serie explora la lucha entre el bien y el mal en el mundo de la brujería."));
        Lista_libros.add(new Libro("Crimen y castigo", "Fyodor Dostoevsky", "Raskolnikov, un estudiante pobre en San Petersburgo, comete un asesinato por razones supuestamente justas. La novela explora la culpa, la redención y la psicología humana en un mundo ruso del siglo XIX."));
        Lista_libros.add(new Libro("En busca del tiempo perdido", "Marcel Proust", "Una exploración profunda de la memoria y la experiencia humana a través de la vida de Marcel. La obra maestra de la literatura moderna examina el tiempo, el arte, el amor y la identidad."));
        Lista_libros.add(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "La trilogía épica sigue a Frodo Baggins en su misión para destruir el Anillo Único y salvar la Tierra Media de la oscuridad. Llena de aventuras, amistad y un mundo rico en mitología."));
        Lista_libros.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", "La historia se desarrolla en el misterioso Cementerio de los Libros Olvidados de Barcelona. Daniel Sempere descubre un libro que cambia su vida y se embarca en una búsqueda para descubrir la verdad detrás de su autor y su historia."));
        Lista_libros.add(new Libro("Orgullo y prejuicio", "Jane Austen", "Una novela de amor y clases sociales que sigue a Elizabeth Bennet y Mr. Darcy mientras superan sus prejuicios y se enamoran en la Inglaterra del siglo XIX."));
        Lista_libros.add(new Libro("Moby-Dick", "Herman Melville", "La obsesión del capitán Ahab por cazar la ballena blanca, Moby-Dick, lleva a su tripulación en una peligrosa travesía llena de simbolismo y exploración filosófica."));
        Lista_libros.add(new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", "La novela narra la historia de amor entre Florentino Ariza y Fermina Daza a lo largo de más de medio siglo. En un mundo de pasión y cólera, la obra aborda temas de tiempo, envejecimiento y perseverancia."));
        Lista_libros.add(new Libro("Ulises", "James Joyce", "Una novela experimental que sigue un día en la vida de Leopold Bloom en Dublín. Llena de corrientes de conciencia y simbolismo, la obra es un hito de la literatura modernista."));
        Lista_libros.add(new Libro("Los juegos del hambre", "Suzanne Collins", "En un futuro distópico, Katniss Everdeen se convierte en un símbolo de resistencia al participar en los Juegos del Hambre, una competencia mortal organizada por el Capitolio. La trilogía aborda temas de opresión, desigualdad y valentía."));
        Lista_libros.add(new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", "La novela cuenta la historia del asesinato de Santiago Nasar y explora cómo la noticia de su muerte se propaga en un pequeño pueblo latinoamericano."));
        Lista_libros.add(new Libro("El código Da Vinci", "Dan Brown", "Un thriller que sigue a Robert Langdon mientras descifra códigos y símbolos en una búsqueda para descubrir un antiguo secreto religioso. Llena de misterio y conspiración."));
        Lista_libros.add(new Libro("Los pilares de la Tierra", "Ken Follett", "Una epopeya histórica que sigue la construcción de una catedral en el siglo XII en Inglaterra. La novela aborda temas de poder, ambición y fe."));
        Lista_libros.add(new Libro("La carretera", "Cormac McCarthy", "En un mundo postapocalíptico, un padre y un hijo luchan por sobrevivir mientras viajan por una carretera desolada. La novela explora la relación entre el amor y la supervivencia."));
        Lista_libros.add(new Libro("El nombre de la rosa", "Umberto Eco", "La historia sigue al monje franciscano Guillermo de Baskerville mientras investiga una serie de misteriosos asesinatos en una abadía benedictina en el siglo XIV. Llena de intriga, filosofía y debates religiosos."));


        LibroAdapter la = new LibroAdapter(Lista_libros, new LibroAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Libro item) {
                moveToDescription(item);
            }
        });
        RecyclerView rc = findViewById(R.id.rcLibros);
        rc.setAdapter(la);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);
    }

    public void moveToDescription(Libro item) {
        Intent i = new Intent(this, MainActivity3.class);
        i.putExtra("libro", item);
        startActivity(i);
    }

    private void verificar() {
        int permiso = ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET);
        int Permiso2 = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if(permiso == PackageManager.PERMISSION_GRANTED && Permiso2 == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "Tienes permiso", Toast.LENGTH_SHORT).show();
        }else{
            requestPermissions(new String[]{Manifest.permission.INTERNET, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            Intent i = new Intent(this, MainActivity4.class);
            startActivity(i);
        }
    }
}