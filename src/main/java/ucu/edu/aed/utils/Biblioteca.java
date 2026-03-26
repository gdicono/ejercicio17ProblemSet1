package ucu.edu.aed.utils;

import java.util.Objects;

public class Biblioteca {

    private ListaEnlazada<Libro> libros;

    public Biblioteca() {
        this.libros = new ListaEnlazada<>();
    }

    public void agregarLibro(Libro libro) {
        libros.agregar(libro);
    }

    public void agergarLibroExistente(Libro libro) {
        Libro libroExistente = buscarPorIsbn(libro.getIsbn());
        if (libroExistente != null) {
            libroExistente.agregarStock(libro.getStock());
        } else {
            agregarLibro(libro);
        }
    }

    private Libro buscarPorIsbn(String isbn) {
        return libros.buscar(libro -> Objects.equals(libro.getIsbn(), isbn));
    }

    public ListaEnlazada<Libro> verLibrosDisponibles() {
        return libros;
    }

}

