package ucu.edu.aed.utils;

public class Biblioteca {

    private ListaEnlazada<Libro> libros;

    public Biblioteca() {
        this.libros = new ListaEnlazada<>();
    }

    public void agregarLibro(Libro libro) {
        libros.agregar(libro);
    }

    public void agergarLibroExistente(Libro libro) {
        if (//poner metodo aca para buscar(libro.getIsbn()) != null) { // si el libro ya existe en la biblioteca
         //poner metodo aca para buscar(libro.getIsbn()).agregarStock(libro.getStock()); // agregamos el stock del libro existente con el nuevo libro
        }
        else {
            agregarLibro(//poner metodo aca para buscar); // si el libro no existe lo agregamos normalmente
        }
    }

    public ListaEnlazada<Libro> verLibrosDisponibles() {
        return libros;
    }

}

