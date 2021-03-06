package datosavanzados;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
import java.io.IOException;
import java.io.FileNotFoundException;


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

        //Ejercicio cuatro:
        //Se dúplica el consume de memoria por lo que sería una operación costosa computacionalmente.

        //Ejercicio cinco:
        arrayList();

        //Ejercicio seis:
        arrayListInt();

        //Ejercicio siete:
        try {
            dividePorCero(4, 0);
        } catch (Exception e) {

            System.out.println("Esto no puede hacerse");

        } finally {
            System.out.println("Demo de código");
        }

        //Ejercicio ocho:
        copiarArchivo("./src/datosavanzados/Main.java","copia.txt");

        //Ejercicio nueve: se crea un nuevo archivo con la palabra openBootcamp, obteniendo los caracteres desde otro archivo
        escribirOpenBootCamp();
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


    public static void arrayList() {
        ArrayList<String> listaCiudades = new ArrayList<>();

        listaCiudades.add("Manizales");
        listaCiudades.add("Madrid");
        listaCiudades.add("Pensilvania");
        listaCiudades.add("Alicante");


        LinkedList<String> listaCopia = new LinkedList<>(listaCiudades);

        for (String ciudad : listaCiudades){
            System.out.println("Datos en ArrayList: " + ciudad);
        }

        for(String ciudad : listaCopia) {
            System.out.println("Datos en LinkedList: " + ciudad);
        }
    }

    public static void arrayListInt() {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        for (int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) % 2 == 0){
                numeros.remove(i);
            }
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }


    public static int dividePorCero(int a, int b) throws ArithmeticException{

        try {

            return a / b;

        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }

    }

    public static void copiarArchivo(String fileIn, String fileOut){

        try{

            InputStream in = new FileInputStream(fileIn);
            byte []datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

    public static void escribirOpenBootCamp() {

        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        ArrayList<Character> frase = new ArrayList<>();

        int clave = 1;
        map.put(1, 'o');
        map.put(2, 'p');
        map.put(3, 'e');
        map.put(4, 'n');
        map.put(5, 'b');
        map.put(6, 'o');
        map.put(7, 'o');
        map.put(8, 't');
        map.put(9, 'c');
        map.put(10, 'a');
        map.put(11, 'm');
        map.put(12, 'p');


        try {
            InputStream archivoLeido = new FileInputStream("/etc/passwd");
            byte []datos = archivoLeido.readAllBytes();

            for (byte dato: datos){

                if (clave > 12) {
                    break;
                }

                if (map.get(clave) == (char)dato){

                    frase.add((char)dato);
                    clave++;
                }

            }

            PrintStream out = new PrintStream("fraseOpen");
            for (Character letra : frase){
                out.write(letra);
            }
            out.close();

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}







