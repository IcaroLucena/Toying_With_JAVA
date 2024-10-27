package com.mycompany.numerospares;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo (N): ");
        int N = scanner.nextInt();

        System.out.println("Números pares de 1 a " + N + ":");
        
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}
