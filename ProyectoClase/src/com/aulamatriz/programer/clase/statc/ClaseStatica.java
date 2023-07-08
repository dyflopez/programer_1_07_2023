package com.aulamatriz.programer.clase.statc;

import java.util.Scanner;

public class ClaseStatica {

    public static void main(String[] args) {
        Scanner capturaTeclado = new Scanner(System.in);
        System.out.println("ingrese el codigo para validar");
        int codidoCredito = capturaTeclado.nextInt();


        if(Utilities.validatMicroCredito(codidoCredito)){
            System.out.println("es un micro credito");
        }
        Empleado empleado = new Empleado();
        System.out.println("Su producto es "+ Utilities.getTipoCredito(codidoCredito));
    }
}
