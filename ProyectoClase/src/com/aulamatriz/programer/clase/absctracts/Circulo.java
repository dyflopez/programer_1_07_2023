package com.aulamatriz.programer.clase.absctracts;

public class Circulo extends Figura{

    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }
}
