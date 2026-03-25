package ucu.edu.aed.utils;

import ucu.edu.aed.tda.TDALista;

import java.util.Comparator;
import java.util.function.Predicate;

public class ListaEnlazada <T> implements TDALista<T> {
    private Nodo<T> primero;

    @Override
    public void agregar(T elem) {

    }

    @Override
    public void agregar(int index, T elem) {

    }

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

    @Override
    public T remover(int index) {
        return null;
    }

    @Override
    public boolean remover(T elem) {
        return false;
    }

    @Override
    public boolean contiene(T elem) {
        return false;
    }

    @Override
    public int indiceDe(T elem) {
        return 0;
    }

    @Override
    public T buscar(Predicate<T> criterio) {
        return null;
    }

    @Override
    public TDALista<T> ordenar(Comparator<T> comparator) {
        return null;
    }

    @Override
    public int tamaño() {
        return 0;
    }

    @Override
    public boolean esVacio() {
        return false;
    }

    @Override
    public void vaciar() {

    }
}



























