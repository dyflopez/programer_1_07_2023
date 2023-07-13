package com.aulamatriz.programer.clase.interfaces.funcionales;

public interface IShowMenssage {

    default String mostrarMensaje(int valor1, int valor){
        return  "1";
    }

    String mostrarMensaje1(int valor1, int valor);
    String mostrarMensaje3(int valor1, int valor);
}
