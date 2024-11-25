package com.mycompany.ordenacaodevetores;

import java.util.Random;

public class OrdenacaodeVetores {

    public static void main(String[] args) {
        // Criando o vetor com 15 elementos inteiros
        int[] vetor = new int[15];

        // Gerando números aleatórios para o vetor
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);  // Números aleatórios entre 0 e 99
        }

        // Exibindo o vetor original
        System.out.println("Vetor original:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Ordenando o vetor com Bubble Sort
        bubbleSort(vetor);

        // Exibindo o vetor ordenado
        System.out.println("Vetor ordenado (Bubble Sort):");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    // Função que implementa o algoritmo Bubble Sort
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Se o número atual for maior que o próximo, troca-os
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
