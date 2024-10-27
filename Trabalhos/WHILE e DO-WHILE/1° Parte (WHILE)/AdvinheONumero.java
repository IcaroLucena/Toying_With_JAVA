package com.mycompany.advinheonumero;

import java.util.Scanner;

public class AdvinheONumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroCorreto = 37; // Número pré-definido
        int tentativa;
        int tentativas = 0;

        System.out.println("Adivinhe o número entre 1 e 100:");

        do {
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa > numeroCorreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (tentativa < numeroCorreto) {
                System.out.println("Muito baixo! Tente novamente.");
            }
        } while (tentativa != numeroCorreto);

        System.out.println("Você acertou! O número era " + numeroCorreto + ".");
        System.out.println("Você fez " + tentativas + " tentativas.");
        
        scanner.close();
    }
}
