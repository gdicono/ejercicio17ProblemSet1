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
    public void agregar(int index, T elem){

    }
    @Override
    public T obtener(int index) {

    }
    @Override
    public T remover(int index) {

    }
    @Override
    public boolean remover(T elem) {

    }
    @Override
    public boolean contiene(T elem) {

    }
    @Override
    public int indiceDe(T elem) {

    }
    @Override
    public T buscar(Predicate<T> criterio) {
        Nodo<T> actual = this.primero;
        while (actual != null && criterio.test(actual.getDato()) == false) {
            actual = actual.getSiguiente();
        }
        if (actual == null) {
            return null;
        }
        return actual.getDato();
    }

    @Override
    public TDALista<T> ordenar(Comparator<T> comparator) {

    }
    @Override
    public int tamaño() {

    }
    @Override
    public boolean esVacio(){

    }

    @Override
    public void vaciar(){

    }
}
