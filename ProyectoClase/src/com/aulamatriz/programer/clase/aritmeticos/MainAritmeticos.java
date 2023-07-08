package com.aulamatriz.programer.clase.aritmeticos;

public class MainAritmeticos {

    public static void main(String[] args) {
        // +  - /  *  ** ^

        /**
         * ()
         * ^
         * *
         * /
         * %
         * +
         * -
         */

        int numero= 1;
        //numero=numero+1;
        numero+=1;
        //numero=numero-1;
        numero-=1;
        //numero=numero*1;
        numero*=1;
        //numero=numero/1;
        numero/=1;


        int a=10;
        int b=12;
        // a=a/b;
        a/=b;
        System.out.println(a);

        int valor=3,variable;
        //Primero incrementa y luego asigno
        variable=++valor;
        System.out.println("valor = >" + valor);
        System.out.println("variable = >" + variable);
        System.out.println("**********");
        int valor1=3,variable1;
        //primero asigna y luego incrementa
        variable1=valor1++;
        System.out.println("valor = >" + valor1);
        System.out.println("variable = >" + variable1);

        /**
         * == != < > >= <= ! =
         */

        String edadDaniel="Daniel";
        String edadYesid="daniel";

        if(edadDaniel.equals(edadYesid)){
            System.out.println("son iguales ");
        } else if(edadDaniel.equalsIgnoreCase(edadYesid)){
            System.out.println("son equalsIgnoreCase ");
        } else{
            System.out.println("son diferentes ");
        }

        //estructa de control
        //Ternarios
        int edadPersona =18;
        String menaje;
        /**
         * if(edadPersona<18){
         *             menaje="la persona es menor de edad";
         *         }else{
         *             menaje="la persona es mayor de edad";
         *         }
         */
        //resultado = (condicion)?retornoVerdadero:retornoFalso;
        menaje=(edadPersona<18 && edadPersona ==0)?"la persona es menor de edad":"la persona es mayor de edad";

        System.out.println(menaje);





    }
}
