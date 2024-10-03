/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio;

/**
 *
 * @author Admin
 */

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int maior1 = Integer.MIN_VALUE; // Primeiro maior número
        int maior2 = Integer.MIN_VALUE; // Segundo maior número

        // Laço while para solicitar 10 números
        while (contador < 10) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            // Verifica se o número digitado é maior que maior1
            if (numero > maior1) {
                maior2 = maior1; // O antigo maior se torna o segundo maior
                maior1 = numero;  // Atualiza o maior
            } else if (numero > maior2) {
                maior2 = numero; // Atualiza o segundo maior
            }

            contador++; // Incrementa o contador
        }

        // Exibe os dois maiores números
        System.out.println("Os dois maiores números digitados foram: " + maior1 + " e " + maior2);

        // Fecha o scanner
        scanner.close();
    }
}
