package com.aulamatriz.programer.clase.genericos;

import com.aulamatriz.programer.clase.genericos.ejemplo1.GenericoAdicionar;
import com.aulamatriz.programer.clase.genericos.ejemplo1.MiClasGenerica;

import java.util.ArrayList;

public class GenericosPrincipal {

    /**
     * Generico en JAVA Permite trabajar con cualquier tipo de dato(Objeto).
     *
     * Ventaja
     *  La reutilizacion de codigo
     *  Mayor legibilidad
     *  Mantenimiento al codigo
     *  Es flexible pero robusta
     *
     * Permite que una clase pueda operar con cualquier Objeto menos primitivos
     * Cuando se define un generico se usa una letra (T)
     *
     * Cuando se crea un objeto  para un generico se debe espesificar  el tipo de objeto
     *
     * Al usar un generico en un metodo se debe usar un comodin
     *
     *
     */

    public static void main(String[] args) {

        // Es unero
        Integer numero=1;
        MiClasGenerica objetoEntero= new MiClasGenerica<>(numero);
        objetoEntero.showMenssage();
        objetoEntero.showMenssage("DANIEL FLOREz LOPEZ");
        System.out.println(objetoEntero.getElemento());

        MiClasGenerica objetoString= new MiClasGenerica<>("Daniel");
        objetoString.showMenssage();
        System.out.println(objetoString.getElemento());


        GenericoAdicionar genericoAdicionar = new GenericoAdicionar(20,2);
        genericoAdicionar.imprimir(genericoAdicionar);

        var valor = 1;

        System.out.println("ss");

        ArrayList<Integer> listaEneteros;


    }
}
