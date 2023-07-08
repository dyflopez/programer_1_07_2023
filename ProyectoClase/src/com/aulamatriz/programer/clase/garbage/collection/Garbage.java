package com.aulamatriz.programer.clase.garbage.collection;

public class Garbage {

    public static void main(String[] args) {
        //Creacion :Se reserva memoria para que el objero se inicialice;   new
        Calculadora calculadora = new Calculadora(1,2);
        //USO: El objeto  Se utiliza para realizar alguna operacion
        //finalizacion : El objeto termina su tarea
        calculadora.suma();
        //Garbage Collection :  Es un proceso automatico en  Java que se encarga de liberar espacio de memoria
        System.out.println("instante 1 , donde calculadora2 es null");
        Calculadora calculadora2 = null;
        System.out.println(calculadora);
        System.out.println("calculadora.getNumero1()=> "+ calculadora.getNumero1());
        System.out.println(calculadora2);
        System.out.println("instante 2 vamos a asignar calculadora a calculadora2");
        calculadora2=calculadora;
        System.out.println(calculadora);
        System.out.println(calculadora2);
        calculadora.setNumero1(20);
        System.out.println("calculadora.getNumero1()=> "+ calculadora.getNumero1());
        System.out.println("calculadora2.getNumero1()=> "+ calculadora2.getNumero1());




    }
}
