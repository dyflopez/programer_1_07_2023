package com.aulamatriz.programer.clase.interfaces.funcionales;

public  class Utilites {

    static ICalculadora suma  = (valor1,valor2) -> valor1+valor2;

    static ICalculadora resta  = (valor1,valor2) -> valor1-valor2;

    static ICalculadora multiplicacion  = (valor1,valor2) -> valor1*valor2;

    static ICalculadora division  = (valor1,valor2) -> valor1/valor2;
}
