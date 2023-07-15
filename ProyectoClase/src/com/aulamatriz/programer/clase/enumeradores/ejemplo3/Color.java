package com.aulamatriz.programer.clase.enumeradores.ejemplo3;

public enum Color {
    ROJO(ConstanteColores.RGB_COLOR_ROJO,"RED",1),
    VERDE("#00FF00","Green",2),
    AZUL("#0000FF","Blue",3);

    private String hexCode;
    private String nameColor;
    private int valor;

    Color(String hexCode, String nameColor, int valor) {
        this.hexCode = hexCode;
        this.nameColor = nameColor;
        this.valor = valor;
    }

    public String getHexCode() {
        return hexCode;
    }

    public String getNameColor() {
        return nameColor;
    }

    public int getValor() {
        return valor;
    }
}
