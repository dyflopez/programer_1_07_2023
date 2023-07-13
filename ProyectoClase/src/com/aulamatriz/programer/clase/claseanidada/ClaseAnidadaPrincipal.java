package com.aulamatriz.programer.clase.claseanidada;


import com.aulamatriz.programer.clase.absctracts.Figura;
import com.aulamatriz.programer.clase.claseanidada.clase.externa.ClaseAnidadaEstatica;
import com.aulamatriz.programer.clase.claseanidada.clase.externa.ClaseEnMetodos;
import com.aulamatriz.programer.clase.claseanidada.clase.externa.ClaseExterna;
import com.aulamatriz.programer.clase.interfaces.funcionales.ICalculadora;

public class ClaseAnidadaPrincipal {

    public static void main(String[] args) {

       // ClaseExterna.ClaseAnidad claseAnidad = new ClaseExterna.ClaseAnidad();

        ClaseExterna objetoClaseExterna = new ClaseExterna();
        ClaseExterna.ClaseAnidad claseAnidad =   objetoClaseExterna.new ClaseAnidad();

        claseAnidad.mostrarValor("hola mundo ");

        //Declarando Clase anidada estatica

        ClaseAnidadaEstatica.ClaseInternaStatica internaStatica = new ClaseAnidadaEstatica.ClaseInternaStatica();
        internaStatica.showMenssage();


        //Clase anidada local metodo
        ClaseEnMetodos claseEnMetodos = new ClaseEnMetodos();
        claseEnMetodos.getSuma();

        /**
         * No tiene un nombre y se hereda de una clase existente o implementa una interfaz
         *
         *
         *
         */
        ICalculadora calculadora = new ICalculadora() {
            @Override
            public int operaciones(int valor1, int valor2) {
                return 1+1;
            }
        };

        var valor = calculadora.operaciones(1,2);

        System.out.println(valor);

        Figura figura =new Figura("rojo") {
            @Override
            public double calcularPerimetro() {
                return 0;
            }

            @Override
            public double calcularArea() {
                return 0;
            }
        };

    }
}
