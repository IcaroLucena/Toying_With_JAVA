package com.mycompany.numerosimpares;

import java.util.Scanner;

public class NumerosImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorImpares = 0;

        System.out.println("Insira números inteiros (insira 0 para parar):");

        do {
            numero = scanner.nextInt();

            if (numero != 0 && numero % 2 != 0) {
                contadorImpares++;
            }

        } while (numero != 0);

        System.out.println("Você inseriu " + contadorImpares + " números ímpares.");
        scanner.close();
    }
}
