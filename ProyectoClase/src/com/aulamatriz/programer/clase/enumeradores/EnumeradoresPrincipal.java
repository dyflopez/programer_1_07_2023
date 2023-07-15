package com.aulamatriz.programer.clase.enumeradores;

import com.aulamatriz.programer.clase.enumeradores.ejemplo1.DiasSemana;
import com.aulamatriz.programer.clase.enumeradores.ejemplo2.Tamano;

import java.util.Scanner;

public class EnumeradoresPrincipal {

    public static void main(String[] args) {
        /**
         * ENUM -  Define un tipo de dato que consiste en una lista de valores
         */
        System.out.println("Valores de la enumeracion Dias de la semana");
        //una forma de optener el valor de el enum
        DiasSemana lunes = DiasSemana.LUNES;
        System.out.println(lunes);
        //Como mostrar todos los dias de la semana
        System.out.println("Mostrando dias de la semana");
        var semana = DiasSemana.values();
        for (int i =0;i<DiasSemana.values().length;i++){
            System.out.println(semana[i]);
        }
        //Otra forma de mostrar el enum
        System.out.println("imprimiendo por medio de un forEath metodo 1");
        for(DiasSemana dia : DiasSemana.values()){
            System.out.println("el dia de la semana es " + dia);
        }
        System.out.println("imprimiendo por medio de un forEath metodo 2");
        for(DiasSemana dia : semana){
            System.out.println("el dia de la semana es " + dia);
        }
        //comparacion entre Enums
        System.out.println("Validacion en enums");
        for(DiasSemana dia : semana){
            if(dia.equals(DiasSemana.LUNES)){
                System.out.println("hoy es lunes");
            }
        }

        if(lunes== DiasSemana.MARTES){
            System.out.println("Hoy es martes");
        }else {
            System.out.println("Hoy no es martes");
        }


        /**
         * Desactivado metodo


            var dia  = EnumeradoresPrincipal.getCapturaDiaSemana();

         */
        DiasSemana dia = lunes;

        switch (dia){
            case LUNES:
                System.out.println("Hoy es lunes");
            break;
            case MARTES:
                System.out.println("Hoy es martes");
            break;
            case MIERCOLES:
                System.out.println("Hoy es miercoles");
            break;
            case JUEVES:
                System.out.println("Hoy es jueves");
            break;
            case VIERNES:
                System.out.println("Hoy es Viernes");
            break;
            default:
                System.out.println("No es un dia de la semana");
            break;
        }


        System.out.println("ENUM CON UN VALOR EJEMPLO 2 ");

        System.out.println("imprimiendo ENUM con valores");
        for(Tamano tamano : Tamano.values()){
            System.out.println("el dia de la semana es " + tamano.getTalla());
        }


        /**
         * Cuando usarian los ENUMS
         * 1)  Tener opciones que no se deban cambiar
         * 2)  Lista una de valores o opciones
         *
         * Ventaja
         *  1) Ayuda a dar una mejor semantica o legibilidad al cosido
         *  2)
         */
    }

    /**
     *
     * Terminar el metodo y evirar el null pointer
     * "main" java.lang.NullPointerException
     */
    public static DiasSemana getCapturaDiaSemana(){
        Scanner captura = new Scanner(System.in);
        String dia;
        DiasSemana outDiaSemana;
        System.out.println("Ingrese el dia de la semana");
        dia= captura.next();
        if(DiasSemana.LUNES.name().equalsIgnoreCase(dia)){
            outDiaSemana =  DiasSemana.LUNES;
        } else if (DiasSemana.MARTES.name().equalsIgnoreCase(dia)){
            outDiaSemana =  DiasSemana.MARTES;
        } else if (DiasSemana.MIERCOLES.name().equalsIgnoreCase(dia)){
            outDiaSemana =  DiasSemana.MIERCOLES;
        }else {
            outDiaSemana =  null;
        }
        return outDiaSemana;
    }

}
