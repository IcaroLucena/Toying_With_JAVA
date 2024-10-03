/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerais;

/**
 *
 * @author Admin
 */

import java.util.Scanner;

public class Numerais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário um número inteiro N
        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();
        
        // Imprime todos os números de 1 até N
        System.out.println("Números de 1 até " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
