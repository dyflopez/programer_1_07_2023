package com.aulamatriz.programer.clase.resumen.ejercicio.service;

import com.aulamatriz.programer.clase.resumen.ejercicio.constantes.Constantes;
import com.aulamatriz.programer.clase.resumen.ejercicio.dominio.EmpleadoTiempoCompleto;
import com.aulamatriz.programer.clase.resumen.ejercicio.dominio.Ocupacion;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmpleadoService {


    public EmpleadoTiempoCompleto crearEmpleado(){
        String nombre;
        String apellido;
        String tipoDocumento;
        String documento;
        String telefono;
        String nacionalidad;
        char genero;
        boolean activo;
        LocalDate fechaNacimiento;
        List< Ocupacion > ocupacionList;

        Scanner capturar = new Scanner(System.in);
        System.out.println(Constantes.MENSAJE_INGRESE_NOMBRE);
        nombre=capturar.next();
        System.out.println("ingrese el apellido");
        apellido=capturar.next();

        return null;
    }
}
