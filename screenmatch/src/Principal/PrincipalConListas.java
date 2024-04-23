package Principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix",1999);
        otraPelicula.evalua(6);
        var peliculaDeJuan = new Pelicula("El señor de los anillos", 2001);
        peliculaDeJuan.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        Pelicula p1 = peliculaDeJuan;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeJuan);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        List<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Pnélope Cruz");
        listaArtistas.add("Antonio Banderas");
        listaArtistas.add("Ricardo Darín");

        Collections.sort(listaArtistas);
        System.out.println("Lista de artistas ordenada: " + listaArtistas);

        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista ordenada por fechas: " + lista);
    }
}
