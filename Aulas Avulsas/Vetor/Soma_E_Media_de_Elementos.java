package com.mycompany.soma_e_media_de_elementos;

import java.util.Scanner;

public class Soma_E_Media_de_Elementos {

    public static void main(String[] args) {
        // Criação do scanner para ler os números do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Criar um vetor para armazenar os 10 números inteiros
        int[] numeros = new int[10];
        
        int soma = 0; // Variável para armazenar a soma dos números
        
        // Solicitar os 10 números ao usuário e preenchê-los no vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; // Acumulando a soma dos números
        }
        
        // Calculando a média
        double media = soma / 10.0; // Divisão com 10.0 para garantir resultado em ponto flutuante
        
        // Exibindo a soma e a média
        System.out.println("\nA soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        
        // Fechando o scanner
        scanner.close();
    }
}
