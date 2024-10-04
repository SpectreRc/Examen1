package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {

    public void ejercicio1() {

        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float num3 = 0;

        try {
            System.out.println("Introduce la nota del primer trimestre: ");
            num1 = entrada.nextFloat();

            while (num1 < 0 && num1 > 10) {
                System.out.println("ERROR. ");
                System.out.println("Vuelve a introducirlo ");
                num1 = entrada.nextFloat();
            }

            System.out.println("Introduce la nota del segundo trimestre: ");
            num2 = entrada.nextFloat();

            while (num2 < 0 && num2 > 10) {
                System.out.println("ERROR. ");
                System.out.println("Vuelve a introducirlo ");
                num2 = entrada.nextFloat();
            }

            System.out.println("Introduce la nota del tercer trimestre: ");
            num3 = entrada.nextFloat();

            while (num3 < 0 && num3 > 10) {
                System.out.println("ERROR. ");
                System.out.println("Vuelve a introducirlo ");
                num3 = entrada.nextFloat();
            }

        } catch (InputMismatchException er) {
            System.out.println("ERROR. Introduce un valor válido...");
            entrada.nextLine();
        }
    }

    public void ejercicio2() {

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;

        try {

            System.out.println("Introduce un número: ");
            num1 = entrada.nextInt();

            System.out.println("Es un número (sí/no):");
            String numero = entrada.next();

            while (numero.equals("si")) {
                if (num1 > 0) {
                    System.out.println("El valor absoluto es ");
                } else {
                    num1 = num1 * -1;
                    System.out.println("El valor absoluto es ");
                }
            }
        } catch (InputMismatchException er) {
            System.out.println("ERROR. Introduce un valor válido...");
            entrada.nextLine();
        }
    }
}