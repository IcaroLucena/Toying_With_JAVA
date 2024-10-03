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
        
        // Solicita ao usuário um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Laço for para calcular e imprimir os quadrados
        System.out.println("Tabela de quadrados de 1 até " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            int quadrado = i * i; // Calcula o quadrado do número
            System.out.println(i + "² = " + quadrado);
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
