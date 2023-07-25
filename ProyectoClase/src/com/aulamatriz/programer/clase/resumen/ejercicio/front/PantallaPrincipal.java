package com.aulamatriz.programer.clase.resumen.ejercicio.front;

import com.aulamatriz.programer.clase.resumen.ejercicio.dominio.EmpleadoTiempoCompleto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PantallaPrincipal {

    public List<EmpleadoTiempoCompleto>  empleadoTiempoCompletoList = new ArrayList<>();

    public void lanzarMenu(){
        getOpcion();
    }

    private    void getMenu(){
        System.out.println("1. Ingresar Empleado \n " +
                " 2.Buscar Empleado por identificacion \n  " +
                "3. ver empleados" +
                "4. Gardar Empleados " +
                "5. Salir" );
    }

    private  void getOpcion(){
        Scanner capturaPorTeclado = new Scanner(System.in);
        int opcion=0;
        do{
            try {
                getMenu();
                String strOpcion = capturaPorTeclado.next();
                opcion= Integer.parseInt(strOpcion);
            }catch (Exception e){
                System.err.println("Error al ingresar la  informacion " + e.getMessage()  );
                System.out.println(" intente de nuevo ingresar la opcion ");
                opcion=0;
            }
        }while (opcion!=5);
    }

    private  void accionMenu(int opcion){
        switch (opcion){
            case 1:
                break;

        }
    }
}
