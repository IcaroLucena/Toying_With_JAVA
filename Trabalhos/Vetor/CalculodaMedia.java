package com.mycompany.calculodamedia;

import java.util.Scanner;

public class CalculodaMedia {

    public static void main(String[] args) {
        // Criando o scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Criando o vetor para armazenar 5 notas de alunos
        double[] notas = new double[5];

        // Solicitando ao usuário para inserir as 5 notas
        System.out.println("Digite as 5 notas dos alunos:");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calculando a média das notas
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;

        // Contadores para os alunos acima, abaixo e na média
        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        int naMedia = 0;

        // Verificando quantos alunos estão acima, abaixo ou na média
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            } else if (notas[i] < media) {
                abaixoDaMedia++;
            } else {
                naMedia++;
            }
        }

        // Exibindo os resultados
        System.out.println("\nMédia das notas: " + media);
        System.out.println("Alunos acima da média: " + acimaDaMedia);
        System.out.println("Alunos abaixo da média: " + abaixoDaMedia);
        System.out.println("Alunos exatamente na média: " + naMedia);

        // Fechar o scanner
        scanner.close();
    }
}
