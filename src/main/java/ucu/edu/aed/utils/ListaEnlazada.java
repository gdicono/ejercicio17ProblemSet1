package ucu.edu.aed.utils;
import ucu.edu.aed.tda.TDALista;
import java.util.Comparator;
import java.util.function.Predicate;

public class ListaEnlazada <T> implements TDALista<T> {
    protected Nodo<T> primero;

    @Override
    public void agregar(T elem) {
        if(primero==null){
            primero = new Nodo<>(elem);

        }
        else {
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(new Nodo<>(elem));
        }

    }

    @Override
    public void agregar(int index, T elem) {
        Nodo<T> nuevoNodo = new Nodo<>(elem);
        if(index == 0){ // Si el indice es igual a 0
            nuevoNodo.setSiguiente(primero); // Asignamos el siguiente del nuevo nodo al nodo que actualmente es el primero
            primero = nuevoNodo; // Ahora primero es el nuevo nodo
        }
        else {
            Nodo<T> actual = primero; // referenciamos para no perder la referencia del nodo
            for (int i = 1; i < index - 1; i++) { // recorremos la lista
            actual = actual.getSiguiente();} // actual pasa

            if (actual != null) { // si actual no es nulo
                nuevoNodo.setSiguiente(actual.getSiguiente()); // el siguiente del nuevoNodo apunta al siguiente del nodo actual
                actual.setSiguiente(nuevoNodo); // actual ahora apunta al nuevoNodo
            }
        }
    }

}
