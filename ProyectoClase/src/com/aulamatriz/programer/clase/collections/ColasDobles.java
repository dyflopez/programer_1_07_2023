package com.aulamatriz.programer.clase.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ColasDobles {

    /**
     *  PILA y COLA
     *
     *  PILA =  ultimo que entra y primero sale (Last In , Firts out) LIFO
     *  COLA  =  primero en entrar  , primero en salir (First IN, First Out) (FIFO)
     *
     *  1) Permite añadir elementos por ambis extrmos
     *  2) Implementa la interfaz Deque , que hera de Queue
     * 3)
     */

    public static void main(String[] args) {



        /**
         * ArrayDeque
         * 1) Es una clase Java que implementa la interfaz Deque
         * 2)Permite agregar y eliminar elementos tanto al principio de la cola de manera eficiente
         * 3) es dinamica
         *
         */

        Deque <String> nomresDeque = new ArrayDeque<>();

        nomresDeque.add("daniel");
        nomresDeque.add("yesid");
        nomresDeque.add("florez");
        nomresDeque.push("juan");
        nomresDeque.addFirst("Diego");
        nomresDeque.addFirst("Zu");


        nomresDeque.forEach((valor)-> System.out.println(valor));

        System.out.println("imprimier luego de sacar informacion");


        String nombre = nomresDeque.removeFirst();
        System.out.println("el valor sacado del deque es " +nombre);

         nombre = nomresDeque.removeLast();
        nomresDeque.removeLast();
        System.out.println("el valor sacado del deque es " +nombre);

        nomresDeque.forEach((valor)-> System.out.println(valor));

    }
}
