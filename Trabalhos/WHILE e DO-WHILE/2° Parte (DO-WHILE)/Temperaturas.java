package com.mycompany.temperaturas;

import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        System.out.println("Conversor de Celsius para Fahrenheit");
        System.out.println("Digite a temperatura em Celsius (ou 0 para sair):");

        do {
            celsius = scanner.nextDouble();

            if (celsius != 0) {
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("Temperatura em Fahrenheit: %.2f%n", fahrenheit);
            }

        } while (celsius != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
