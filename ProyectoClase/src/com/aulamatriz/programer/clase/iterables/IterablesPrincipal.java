package com.aulamatriz.programer.clase.iterables;

import java.util.ArrayList;
import java.util.Iterator;

public class IterablesPrincipal {
    /**
     * 1) es un objeto wue puede ser recorrido mediante un ciclo (FOR)
     * 2)los objetos iterables implementan la interzar Iterable
     *
     *Metodos hashNext indica  si hay elementos
     * Next , Se desliza al siguiente objeto de la iteracion
     *
     */
    public static void main(String[] args) {

        String[] nombres ={"Juan","Maria","Pedro"};

        EjemploIterable ejemploIterable = new EjemploIterable(nombres);
        Iterator<String> iterar =  ejemploIterable.iterator();

        while (iterar.hasNext()){
            String nombre = iterar.next();
            System.out.println(nombre);
        }

        Integer[] numeros ={1,2,3};
        EjemploIterable numeroIterables = new EjemploIterable(numeros);
        Iterator<Integer> iterardorNumeros =  numeroIterables.iterator();
        while (iterardorNumeros.hasNext()){
            Integer nombre = iterardorNumeros.next();
            System.out.println(nombre);
        }

    }
}
