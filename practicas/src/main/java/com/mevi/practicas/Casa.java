package com.mevi.practicas;

/**
 * POO
 * Una clase defini a cierto objeto en especifico
 * tiene metodos, atributos y constructores
 */
public class Casa {
    private String calle;
    private char seccion;
    private short numero;
    private int precio;
    private long fechaConstruccion;
    private float impuesto;
    private double metrosCubicos;
    private boolean hipotecada;

    public Casa(String calle, char seccion, short numero, int precio, long fechaConstruccion,
                float impuesto, double metrosCubicos, boolean hipotecada) {
        this.calle = calle;
        this.seccion = seccion;
        this.numero = numero;
        this.precio = precio;
        this.fechaConstruccion = fechaConstruccion;
        this.impuesto = impuesto;
        this.metrosCubicos = metrosCubicos;
        this.hipotecada = hipotecada;
    }

    public Casa(String calle, short numero, int precio, boolean hipotecada) {
        this.calle = calle;
        this.numero = numero;
        this.precio = precio;
        this.hipotecada = hipotecada;
    }

    public Casa() {
    }

    @Override
    public String toString() {
        return "Casa{" +
                "calle='" + calle + '\'' +
                ", seccion=" + seccion +
                ", numero=" + numero +
                ", precio=" + precio +
                ", fechaConstruccion=" + fechaConstruccion +
                ", impuesto=" + impuesto +
                ", metrosCubicos=" + metrosCubicos +
                ", hipotecada=" + hipotecada +
                '}';
    }


}
