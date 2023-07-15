package com.aulamatriz.programer.clase.genericos.ejemplo1;

public class MiClasGenerica <T>{

    private T elemento;
    private T elemento2;

    public MiClasGenerica(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public void showMenssage(){
        System.out.println("Tipo de T: " + elemento.getClass().getName() + elemento2);
    }
    public void showMenssage(T valor){
        System.out.println("Tipo de T: " + elemento.getClass().getName() + " "+valor);
    }


}
