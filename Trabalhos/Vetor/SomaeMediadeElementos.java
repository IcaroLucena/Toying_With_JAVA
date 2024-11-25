package com.mycompany.somaemediadeelementos;

import java.util.Scanner;

public class SomaeMediadeElementos {

    public static void main(String[] args) {
        // Criando o scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Criando um vetor para armazenar os 10 números inteiros
        int[] vetor = new int[10];

        // Variáveis para armazenar a soma e a média
        int soma = 0;
        double media;

        // Solicitar ao usuário que insira 10 números
        System.out.println("Digite 10 números inteiros:");

        // Preencher o vetor com os números inseridos pelo usuário
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i]; // Adiciona o número à soma
        }

        // Calculando a média
        media = soma / 10.0; // Divide a soma por 10 para obter a média

        // Exibindo a soma e a média
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
