/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.senhanumerica;

/**
 *
 * @author Admin
 */

import java.util.Scanner;

public class SenhaNumerica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1234; // Definindo a senha correta
        int senhaDigitada;

        // Loop até que a senha correta seja digitada
        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextInt();

            if (senhaDigitada != senhaCorreta) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (senhaDigitada != senhaCorreta);

        System.out.println("Senha correta! Acesso concedido.");
        scanner.close();
    }
}
