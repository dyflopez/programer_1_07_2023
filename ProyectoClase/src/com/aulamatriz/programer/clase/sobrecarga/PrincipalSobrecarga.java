package com.aulamatriz.programer.clase.sobrecarga;

public class PrincipalSobrecarga {

    public static void main(String[] args) {
        var resultadoSobrecarga1 = PrincipalSobrecarga.suma(1,2);
        var resultadoSobrecarga2 = PrincipalSobrecarga.suma(1,2,3);
        var resultadoSobrecarga3 = PrincipalSobrecarga.suma(1.0,2.0);
    }

    public static int suma(int a, int b){
        return  a+b;
    }

    public static int suma(int a, int b,int c){
        return  a+b+c;
    }

    public static double suma(double a, double b){
        return  a+b;
    }
    public static String suma(String a, String b){
        return  a+b;
    }
}
