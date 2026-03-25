package ucu.edu.aed.utils;

import ucu.edu.aed.tda.TDALista;

import java.util.Comparator;
import java.util.function.Predicate;

public class ListaEnlazada <T> implements TDALista<T> {
    private Nodo<T> primero;

    @Override
    public T obtener(int index) {
        Nodo<T> actual = primero; //Se arranca del primer nodo de la lista
        int contador = 0;
        if (index < 0) //Se valida el indice para que no sea negativo
        {
            throw new IndexOutOfBoundsException("El indice se encuentra por fuera");
        }
        while (actual != null) //Se recorre la lista, nodo por nodo
        {
            if (contador == index) //Se llega a la posición buscada
            {
                return actual.getDato(); //Devuelve el dato del nodo actual
            }
            actual = actual.getSiguiente(); //Se avanza al siguiente nodo
            contador++; //Aumenta el contador
        }

        return null;
    }
}



























