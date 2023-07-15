package com.aulamatriz.programer.clase.iterables;

import java.util.Iterator;

public class EjemploIterable<T>  implements Iterable<T> {

    private T []elementos;

    public EjemploIterable(T[] elementos) {
        this.elementos = elementos;
    }

    @Override
    public Iterator<T> iterator(){
        return  new MiIteracion();
    }

    private class  MiIteracion implements  Iterator<T>{

        private int indice=0;

        @Override
        public boolean hasNext() {
            return indice< elementos.length;
        }

        @Override
        public T next() {
            return elementos[indice++];
        }
    }
}
