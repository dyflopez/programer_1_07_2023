package com.aulamatriz.programer.clase.tiposDatos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConversionTipos {

    public static void main(String[] args) {

        //conversion de tipos
 //Conversion implicita: es el proceso en el cual un tipo de dato de menor rango
        //se convierte automaticamente en un tipo mayor
        /** Tipos de datos primitivos
         * int   -2,147,483,648 a 2,147,483,647
         * long   -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
         * float   6-7 dígitos decimales significativos
         * double  15 dígitos decimales significativos
         * char 0 a 65,535
         */
        int x=45;
        long z=x;
        char caracter='A';
        int codigoAscii=caracter;


        z=caracter;
        System.out.println(z);

        float number=x;
        System.out.println(number);

        // falla porque asume que el numero 3.1516 es un double
        //para ser un float debe tener la "f"
         float numberF = 3.1516f;
         double numbeD = 3.1516;

         System.out.println(numbeD);
 //conversion Explicita : es el proceso  mediante el cual se converte a un tipo de dato manualmente(interviene el DEV)
        String cadena= String.valueOf(caracter);
        int valor1= 2314;
        cadena = String.valueOf(valor1);

        Date fecha1 = new Date();

        long longtime = fecha1.getTime();

        System.out.println(longtime);

        List<String> listString = new ArrayList<>();
        listString.add("1");
        int tamanoArray = listString.size();

        caracter= (char) codigoAscii;

        byte n= (byte) 4546.9342354235f;
        System.out.println("........");
        System.out.println(n);

        char vv=30;
        //Clase envoltorio: Clase/objeto que envuelve tipos de datos primitivos
        System.out.println("Clase envoltorio");
        int numprimitivo=100;
        Integer numeber = numprimitivo;
        double decimalPrimitivo= 2.1;
        Double decimal = decimalPrimitivo;
        //Inferencia:
        System.out.println("inferencia ");
        var numero =10.2;
        System.out.println(numero);
        var mensaje = ConversionTipos.getMessage();

        var resultado =  mensaje+1;

        System.out.println("resultado de la inferencia => "+  resultado);

        Integer k=5;

        int p=10,s;
        k=k+p;
        s=k;
        System.out.println(s);


    }

    public  static  int getMessage(){
        return  1;
    }
}
