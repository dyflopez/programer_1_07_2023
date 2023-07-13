package com.aulamatriz.programer.clase.interfaces.funcionales;



public class InterfazFuncionalMain {

    public static void main(String[] args) {
        /**
         * Interfaces funcionales
         *
         * Una interfaz funcional tiene solo un metodo
         * Se "puede definir" con la anotacion @FunctionalInterfaces
         * las interfaces funcionales se usan con las expreciones *Lambda*
         *
         */

        var  valor = Utilites.division.operaciones(1,2);

        System.out.println(valor);

        /**
         * Cuando se debe usar una interfaz funcional
         *
         * 1) son como base
         * 2) Cuando se necesitan utilizar en los stream para una operacion especial
         * 3) Procesamiento de datos
         * 4) Programacion asincrona  ->
         * 5) validacion de datos
         */

    }

}
