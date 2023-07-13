package com.aulamatriz.programer.clase.claseanidada.clase.externa;

public class ClaseAnidadaEstatica {

    private static  int valor;
    /**
     * Utilidades y funciones auxiliares
     *
     * Organizar las utulidades y funciones compartidas
     */
    public static  class ClaseInternaStatica{
        public void showMenssage (){
            System.out.println("mensaje" +  valor);
        }
    }
}
