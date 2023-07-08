package com.aulamatriz.programer.clase.statc;

public class Utilities {

    public static boolean validatMicroCredito(int tipoCredito){

        return  tipoCredito==Constantes.CODIGO_MICROCREDITO?true:false;
    }

    public static String  getTipoCredito(int tipoCredito){

        String mensaje;

        switch (tipoCredito){
            case Constantes.CODIGO_POPULAR:
                mensaje= Constantes.ABREBIATURA_POPULAR;
                break;
            case Constantes.CODIGO_MICROCREDITO:
                mensaje= Constantes.ABREBIATURA_MICROCREDITO;
                break;
            case Constantes.CODIGO_MACRO_CREDITO:
                mensaje= Constantes.ABREBIATURA_MACRO_CREDITO;
                break;
            default:
                mensaje= "No encontrado!";
                break;
        }
        return mensaje;
    }

}
