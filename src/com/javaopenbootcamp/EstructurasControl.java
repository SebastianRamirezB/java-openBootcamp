package com.javaopenbootcamp;

public class EstructurasControl {

    public static void main(String[] args) {
        String frase = "";
        String[] textos = {"El fracaso es una", "gran oportunidad para", "empezar otra vez con", "mas fuerza", "(HENRY FORD)"};

        for (String texto : textos){
            frase = frase + texto + " ";
        }

        System.out.println(frase);
    }


}
