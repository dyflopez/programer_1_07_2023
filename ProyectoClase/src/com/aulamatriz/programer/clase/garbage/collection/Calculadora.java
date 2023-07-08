package com.aulamatriz.programer.clase.garbage.collection;

public class Calculadora {
    //Es una plantilla para la creacion de objetos
    //objeto es la isntancia de una clase

    private  int numero1;
    private  int numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void suma(){
        int result = numero1+numero2;
        System.out.println(result);
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }


}
