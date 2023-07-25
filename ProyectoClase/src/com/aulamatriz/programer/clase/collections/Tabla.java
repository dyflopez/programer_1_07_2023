package com.aulamatriz.programer.clase.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Tabla {
    /**
     * MAP
     *
     * 1)Cada elemento tiene una clave unica
     * 2) no hay  orden ni posicion
     * 3)Las tablas implementan la interfaz MAP
     * 4) La clave y el valor son genericos
     * 5)la clase principal es hashMap
     */

    public static void main(String[] args) {

        //como se instancia un map
        /**
         *  1) HashMap es una implementacion de la interfaz Map
         *  2) Permite almacenar clave-valor y proporciona el valor por medio de la clave
         *  3) NO es asincrono - No usarlo en entorno o programas sincronos
         *  4) permite la clave null y valores null
         */
        System.out.println("HashMap");
        HashMap<String, Integer> inventarioMap = new HashMap();
        inventarioMap.put("Manzanas", 59);
        inventarioMap.put("Bananas", 30);
        inventarioMap.put("Naranja", 40);
        //como accder a un valor del HashMap

        var frutaMananas = inventarioMap.get("Manzanas");
        System.out.println(frutaMananas);
        //3 formas de recorrer o optener la informacion de un MAP
        for (Map.Entry<String, Integer> datos : inventarioMap.entrySet()) {
            String key = datos.getKey();
            int value = datos.getValue();
            System.out.println("<" + key + "," + value + ">");
        }

        for (String llave : inventarioMap.keySet()) {
            System.out.println("<" + llave + ">");
        }

        for (int valor : inventarioMap.values()) {
            System.out.println("<" + valor + ">");
        }

        /**
         * HashTable
         * 1)  HashTable es una implementacion de la interfaz Map
         * 2)  es sincrono, lo que se puede usar en concurrencia
         * 3) no permite guardar claves ni valres null
         */

        Map<Integer, String> hasTable = new Hashtable<>();

        hasTable.put(1, "Daniel");
        hasTable.put(1, "yesid");

        for (Map.Entry<Integer, String> fila : hasTable.entrySet()) {
            int key = fila.getKey();
            String value = fila.getValue();
            System.out.println("<" + key + "," + value + ">");
        }

        System.out.println("TreeMap");

        /**
         *  TreeMap
         *
         *  Es una implementacion de MAP pero estabasada en arboles
         *  Los elementos se ordenan automaticamente segun el orden de la naturaleza de su clsve
         *  no es sincrono
         *
         */

            Map<String, Double>  tasasNominales= new TreeMap<>();

        tasasNominales.put("MicroCredito",1.10);
        tasasNominales.put("Glold",50.90);
        tasasNominales.put("Amplio",55.90);


        tasasNominales.forEach((key,value)-> System.out.println("<" + key + "," + value + ">"));

        /**
         * MicroCredito
         * Glold
         * Amplio
         *
         * Amplio
         * Glold
         * MicroCredito
         */

        Map<Integer,String> mapaEjemplo = new HashMap<>();
        mapaEjemplo.put(1,"daniel");
        mapaEjemplo.put(1,"Yesid");


        System.out.println("impreson pasando primero por le put");
        mapaEjemplo.forEach((key,value)-> System.out.println("<" + key + "," + value + ">"));

        if(mapaEjemplo.get(1)==null){
            mapaEjemplo.put(1,"Florez");
        }
        mapaEjemplo.putIfAbsent(2,"JUAN");

        System.out.println("impreson pasando por el putIfAbsent");
        mapaEjemplo.forEach((key,value)-> System.out.println("<" + key + "," + value + ">"));


    }
}
