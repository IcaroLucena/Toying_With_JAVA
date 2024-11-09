package com.mycompany.ordenacao_de_vetores;

import java.util.Random;

public class Ordenacao_de_Vetores {

    public static void main(String[] args) {
        // Criação do vetor com 15 números inteiros aleatórios
        int[] vetor = new int[15];
        Random rand = new Random();
        
        // Preenchendo o vetor com números aleatórios entre 1 e 100
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100) + 1; // Números aleatórios de 1 a 100
        }
        
        // Exibindo o vetor original
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(); // Quebra de linha
        
        // Ordenando o vetor utilizando o algoritmo Bubble Sort
        bubbleSort(vetor);
        
        // Exibindo o vetor ordenado
        System.out.println("\nVetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(); // Quebra de linha
    }

    // Função para ordenar o vetor utilizando o algoritmo Bubble Sort
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            // Flag para otimização (para parar se o vetor já estiver ordenado)
            boolean trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocou = true;
                }
            }
            // Se nenhum elemento foi trocado, o vetor já está ordenado
            if (!trocou) {
                break;
            }
        }
    }
}
