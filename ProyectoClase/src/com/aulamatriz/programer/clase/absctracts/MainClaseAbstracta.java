package com.aulamatriz.programer.clase.absctracts;

public class MainClaseAbstracta {

    /**
     *  Una clase abstracta  es una clase incompleta que  proporciona una eestrcutrura comun y define metodos abstractos
     *  que deben ser implementados y completados por sus subclases
     *
     *
     *  1) cuando quiero definir una estructura en comun para multiples subclases
     *  2) definir un contrato
     *  3) cuando no se tiene una idea definida de sus metodos
     */

    public static void main(String[] args) {

        Circulo circulo = new Circulo("blue",1.9);

        circulo.calcularPerimetro();
        circulo.impimirColor();
        circulo.calcularArea();

    }


}
