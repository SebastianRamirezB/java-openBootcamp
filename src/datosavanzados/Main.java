package datosavanzados;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //Ejercicio cadena al revés
        System.out.println("Resultado ejercicio cadena al reves: " + reverse("sebastian ramirez"));

        //Ejercicio uno:
        unidimensional();

        //Ejercicio dos:
        bidimensional();

        //Ejercicio tres:
        vector();



    }

    public static String reverse(String texto) {

        String textoReverse = "";

        for(int i = texto.length() - 1; i >= 0; i--) {
            char caracter = texto.charAt(i);
            textoReverse = textoReverse + String.valueOf(caracter);

        }

        return textoReverse;
    }


    public static void unidimensional() {

        String []colores = {"Azul", "Verde", "Rojo", "Amarrillo"};

        System.out.println("Resultado ejercicio uno: ");

        for (String color : colores){
            System.out.println(color);
        }

    }

    public static void bidimensional() {

        System.out.println("Resultado ejercicio dos: ");

        int [][]numeros = new int[2][4];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 300;
        numeros[1][1] = 500;
        numeros[1][2] = 100;
        numeros[1][3] = 700;


        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++){
                System.out.println("Posicion: " + i + " : " + j + " Valor: " + numeros[i][j]);
            }
        }

    }

    public static void vector() {

        Vector<String> paises = new Vector();

        paises.add("Colombia");
        paises.add("Francia");
        paises.add("suecia");
        paises.add("España");
        paises.add("Italia");

        paises.remove(1);
        paises.remove(1);

        for (String pais : paises) {
            System.out.println("Pais: " + pais);
        }
    }


}



