package org.example;

public class bateria1u2 {

    public void ejer1(){

        String frase = "Prueba ejercicio caracteres";
        System.out.println("Prueba ejercicio caracteres");

        int tamanyo = frase.length();
        System.out.println("El tamaño de la frase es " + tamanyo);

        frase = frase.trim();
        System.out.println("La frase sin espacio es " + frase);

        String mitad1 = frase.substring(0,13);
        String mitad2 = frase.substring(13,27);
        System.out.println("El texto dividido en dos mitades es " + mitad1 + " y " + mitad2);

        String mayusculas = frase.toUpperCase();
        System.out.println("La frase en mayúsculas es " + mayusculas);

    }

    public void ejer2(){

        String frase = "Prueba ejercicios caracteres";

        String palabra1 = "Prueba";
        String palabra2 = "ejercicios";

        if (palabra1.length() > palabra2.length()){
            System.out.println("La palabra " + palabra1 + " es mayor que la palabra " + palabra2);
        }else{
            System.out.println("La palabra " + palabra2 + " es mayor que la palabra " + palabra1);
        }

    }

    public void ejer3(){

        int n = 123456;
        int m = 2;
        

    }

}
