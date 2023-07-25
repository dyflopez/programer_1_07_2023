package com.aulamatriz.programer.clase.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class conjuntos {
    /**
     *  SET  = hashSet y treeSet
     *
     *  1) Ls elementos no tienen posicion ni clave asociada
     *  2) emplea internamente metodos como equails y hashCode
     *  3)vienen de la intefaz SET
     *  su principal clase  es hashSet
     * @param args
     */
    public static void main(String[] args) {

        /**
         * HashSet
         *   es una implementacion de la interfaz SET
         *   No permite elementos duplicados , garantiza de los elementos son unicos
         *   No mantiene ningun orden espesifico
         */


        Set<String> hashSet = new HashSet<>();

        hashSet.add("daniel");
        hashSet.add("yesid");
        hashSet.add("Daniel");
        hashSet.add("daniel");
        hashSet.add("Aaniel");
        hashSet.add("#");
        hashSet.add("$");

        System.out.println("imprimir datos");
        for (String nombres : hashSet) {
            System.out.println(nombres);
        }

        System.out.println("imprimiendo por interfaces o funciones ");
        hashSet.forEach((valor)-> System.out.println(valor));


        /**
         * TreeSet
         *
         * 1) es implementado por la interfaz set => NavigateSet  es para los arboles
         * 2) Almacena los elementos en un orden natural
         * 3) No permite que tenga elementos duplicaods
         */

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("daniel");
        treeSet.add("yesid");
        treeSet.add("Daniel");
        treeSet.add("ariel");
        treeSet.add("Aaniel");
        treeSet.add("#");
        treeSet.add("$");


        System.out.println("************************************");
        System.out.println("imprimiendo treeSet");
        treeSet.forEach((valor)-> System.out.println(valor));


    }
}
