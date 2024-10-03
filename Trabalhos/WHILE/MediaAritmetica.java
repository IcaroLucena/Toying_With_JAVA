/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaaritmetica;

/**
 *
 * @author Admin
 */

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         // Pergunta ao usuário quantos alunos há na sala
        System.out.print("Quantos alunos há na sala? ");
        int numeroDeAlunos = scanner.nextInt();

        // Variável para armazenar a soma das notas
        double somaNotas = 0;

        // Laço while para ler as notas dos alunos
        int contador = 0;
        while (contador < numeroDeAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota; // Adiciona a nota à soma
            contador++; // Incrementa o contador
        }

        // Calcula a média aritmética
        double media = somaNotas / numeroDeAlunos;

        // Exibe a média
        System.out.printf("A média da turma é: %.2f%n", media);
        
        // Fecha o scanner
        scanner.close();
    }
}