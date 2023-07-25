package com.aulamatriz.programer.clase.collections;

import java.util.*;

public class Listas {
    /**
     *      * Listas
     *      *
     *      *  *cada elemento tiene una posicon a partir del ordend de llegada
     *      *  *las listas implementan la interfaz List
     *      *  Son colecciones de tipos Gericos <T>
     *      *
     *      *
     * @param args
     */
    public static void main(String[] args) {

        //mutable :  Puede ser modificado
        //Inmutabe : No permite la modificacion de sus elementos ni valores (null)

        //Declarar una lista
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);

        for (Integer numero : integerList){
            System.out.println(numero);
        }
        //la lista es inmutable , no permite ser modificada su tamaño , no permite añadir valores nulls
        // El tamaño es fijo no se puede agregar o eliminar
        List<String> integerList2 = Arrays.asList("daniel","yesid","florez","lopez");
        integerList2.set(0,"HERNANDEZ");
        //integerList2.remove(1);

        for (String s: integerList2) {
            System.out.println(s);
        }


        // Esta lista es Imutable
        //Otra forma de declarar las listas por medio de list.of
        List<Double> decimales = List.of(1.10,100.1);

       // decimales.set(0,10000.1);

        for (Double deci: decimales) {
            System.out.println(deci);
        }

        //Copiando una lista
        //Inmutable J D
        // Su yo modifico la copia se afectara mi original ?
        var listaCopiada = List.copyOf(integerList);
        //listaCopiada.add(1);
        //listaCopiada.add(2);
        //listaCopiada.set(0,10);

        System.out.println(listaCopiada.get(0));

        List<Double> decimales1=decimales;

        /**
         *  en ejercicio de 5 minutos
         *  Pasar la lista inmutable  a una lista mutable
         */



        //PAsar de mutable a inmutable a mutable

        List<String> empleados2 = new ArrayList<String>();
        var empelados = List.of("daniel", "yesid", "florez");
        List<String> pasoMutable = new ArrayList<String>();

        //Pasar a un mutable por medio de un FOReacth
        for (String empelado:empelados)
        {
            empleados2.add(empelado);
            System.out.println(empelado);
        }
        //
        pasoMutable.addAll(empelados);
        pasoMutable.remove(0);

        var pasoMutable1 = new ArrayList<Integer>();
        pasoMutable1.addAll(listaCopiada);
        pasoMutable.remove(0);



        List<Integer> listaMutable = new ArrayList<Integer>();
        listaMutable.add(123);
        listaMutable.add(12345);


        listaMutable  = List.copyOf(integerList);

        listaMutable.remove(0);

        /**
         * cuando usaruna lista inmutable
         * 1) Seguridad, no se modificado
         * 2) Hilos de concurrencia
         * 3) Tiene un mejor rendimiento o velocidad al realizar iteraciones
         */

        /**
         * LinkedList
         *
         *  Almacenamiento
         *  1) ArrayList: Utiliza una matriz dinamica para almacenar los elementos . y accede por el indice
         *  2) LinkedList: es por nodos , cada elemente contiene un valor y una referencia la siguiente
         *  y por esta razon son mas rapidos
         *  Eficiencia de incercion y elminacion
         *  1) ArrayList : es mas eficiente para eliminar le primer y ultimo dato
         *  2)LinkedList : es eficiente pero debe  moverse por los nodos apra eliminar cierto valor
         *
         */


        List<Integer> ejemploLinkedList= new LinkedList<>();

        ejemploLinkedList.add(10);
        ejemploLinkedList.add(20);



    }
}
