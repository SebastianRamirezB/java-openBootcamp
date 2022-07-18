package com.javaopenbootcamp;

public class PrecioIva {
    public static void main(String[] args) {

        System.out.println("El valor del precio mas iva es de: " + getPrecio(14600));

    }

    static double getPrecio(double precio){
        double iva = precio * 19 / 100;
        double precioIva = precio + iva;
        return precioIva;
    }
}
