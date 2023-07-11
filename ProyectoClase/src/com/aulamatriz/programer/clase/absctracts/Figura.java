package com.aulamatriz.programer.clase.absctracts;

abstract class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularPerimetro();
    public abstract  double calcularArea();


    public void impimirColor(){
        System.out.println("el color es " + color);
    }

}
