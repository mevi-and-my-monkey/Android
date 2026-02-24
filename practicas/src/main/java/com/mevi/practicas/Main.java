package com.mevi.practicas;

/**
 * Una clase defini a cierto objeto en especifico
 * tiene metodos, atributos y constructores
 */
public class Main {
    /**
     * Visibilidad en java
     * private, protected, public
     */

    /**
     * Metodo principal de la clase
     *
     * @param args
     */
    public static void main(String[] args) {
        //constantes
        final short enteroCorto = 12; //32767
        //variables
        int enteroNormal = 3023;
        long enteroLargo;
        float decimalCorto = 24.45f;
        double decimalLargo = 23.353534543;
        char caracter = 'a';
        boolean esValido = true;

        enteroNormal = 4 / 3;
        enteroLargo = 2506L;

        System.out.println(enteroNormal);
        System.out.println(enteroLargo);
        System.out.println(enteroCorto);
        System.out.println(decimalCorto);
        System.out.println(decimalLargo);
        System.out.println(caracter);
        System.out.println(esValido);

        //array es un conjunto de elemntos
        nuevoTema("Arreglos");
        String[] nombres = new String[]{"Alejandro", "Diana", "lalo"};
        System.out.println("Arreglos:");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);


        nuevoTema("Ciclos y condiciones");
        if (enteroLargo > 500) {
            System.out.println("Es mayor a 1000");
        } else if (enteroLargo == 500) {
            System.out.println("Es igual a 500");
        } else {
            System.out.println("Es menor a 1000");
        }

        nuevoTema("Operador ternario");
        //operador ternario solo sirve para asignar un valor dependiendo de la condicion
        System.out.println(enteroLargo > 1000 ? "es mayor" : "no es mayor");

        nuevoTema("Ciclo for");
        //ciclo for
        for (int i = 0; i < 3; i++) {
            System.out.println("posicion: " + (i));
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        nuevoTema("Switch");
        //switch
        System.out.println();
        System.out.println("Switch:");
        String nombreAleatorio;

        int index = (int) (Math.random() * 8);
        nombreAleatorio = index < 4 ? nombres[index] : "Anonimo";
        System.out.println(nombreAleatorio);

        switch (nombreAleatorio) {
            case "Alejandro":
                System.out.println("Soy yo!");
                break;
            case "Diana":
                System.out.println("Es diana");
                break;
            case "lalo":
                System.out.println("Es lalo");
                break;
            default:
                System.out.println("No soy nadie");
                break;
        }
    }

    /**
     * Metodo para imprimir un titulo
     *
     * @param title
     */
    private static void nuevoTema(String title) {
        System.out.println("\n============>" + title + ":");
    }
}

