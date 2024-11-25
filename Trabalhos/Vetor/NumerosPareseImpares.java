package com.mycompany.numerospareseimpares;

import java.util.Scanner;

public class NumerosPareseImpares {

    public static void main(String[] args) {
        // Criando o scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Criando o vetor de 15 números inteiros
        int[] numeros = new int[15];

        // Solicitando ao usuário para inserir 15 números
        System.out.println("Digite 15 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Variáveis para contar os números pares e ímpares
        int contagemPares = 0;
        int contagemImpares = 0;

        // Contando os números pares e ímpares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contagemPares++;
            } else {
                contagemImpares++;
            }
        }

        // Exibindo os resultados
        System.out.println("\nQuantidade de números pares: " + contagemPares);
        System.out.println("Quantidade de números ímpares: " + contagemImpares);

        // Fechar o scanner
        scanner.close();
    }
}
