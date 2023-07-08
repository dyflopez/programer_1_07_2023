package com.aulamatriz.programer.clase.valor.por.referencia;

public class PrincipalValorPorReferencia {

    public static void main(String[] args) {
        Persona daniel = new Persona();
        daniel.edad=10;
        System.out.println("edad momento 1 " + daniel.edad);
        PrincipalValorPorReferencia.cambiarEdad(daniel);
        PrincipalValorPorReferencia.cambiarEdad(daniel.edad);
        System.out.println("edad momento 2 " + daniel.edad);
    }

    public static void cambiarEdad(Persona persona){
        persona.edad=100;
    }
    public static void cambiarEdad(int entero){
        entero=300;
    }
}
