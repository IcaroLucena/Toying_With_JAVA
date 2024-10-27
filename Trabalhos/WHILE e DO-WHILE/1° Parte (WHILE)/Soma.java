package com.mycompany.soma;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Insira números inteiros (insira um número negativo para parar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero < 0) {
                break; // Sai do loop se o número for negativo
            }

            soma += numero; // Adiciona o número à soma se for positivo
        }

        System.out.println("A soma dos números positivos é: " + soma);
        scanner.close();
    }
}
