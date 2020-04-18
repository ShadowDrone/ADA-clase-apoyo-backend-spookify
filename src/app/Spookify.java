package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Spookify
 */
public class Spookify {

    public List<Artista> artistas = new ArrayList<>();
    public List<Album> albums = new ArrayList<>();

    public Artista buscarArtista(String nombre) {
        for (Artista artista : this.artistas) {
            if (artista.nombre.equals(nombre)) {
                return artista;
            }
        }
        return null;
    }

    public Album buscarAlbum(String nombre) {
        for (Album album : this.albums) {
            if (album.nombre.equals(nombre)) {
                return album;
            }
        }
        return null;
    }

    public Album buscarAlbum(Album albumAbuscar) {
        return this.buscarAlbum(albumAbuscar.nombre);
    }


    public Cancion buscarCancion(String nombreCancion) {
        for (Album album : this.albums) {
            Cancion cancion;

            cancion = album.buscarCancion(nombreCancion);
            if (cancion != null)
                return cancion;
        }
        return null;
    }

    public List<Cancion> buscarCanciones(String nombreCancion) {
        List<Cancion> laListaCanciones = new ArrayList<>();

        for (Album album : this.albums) {
            Cancion cancion;

            cancion = album.buscarCancion(nombreCancion);
            if (cancion != null)
                laListaCanciones.add(cancion);
        }
        return laListaCanciones;
    }

}