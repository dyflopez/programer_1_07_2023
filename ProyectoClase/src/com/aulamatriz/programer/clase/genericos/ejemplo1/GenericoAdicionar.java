package com.aulamatriz.programer.clase.genericos.ejemplo1;

public class GenericoAdicionar <T>{

    private  T valor1;
    private  T valor2;

    public GenericoAdicionar(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void imprimir(GenericoAdicionar<?> dato){
        System.out.println(dato.valor1);
    }

    public void getSuma(MiClasGenerica<? extends Integer> dato){
        System.out.println(dato.getElemento());
    }

    public void getCadena(MiClasGenerica<? extends String> dato){
        System.out.println(dato.getElemento());
    }

}
