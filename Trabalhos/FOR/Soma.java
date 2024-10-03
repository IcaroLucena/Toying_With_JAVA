/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soma;

/**
 *
 * @author Admin
 */
public class Soma {

    public static void main(String[] args) {
        int soma = 0;

        // Laço para somar os números de 1 a 50
        for (int i = 1; i <= 50; i++) {
            soma += i; // Adiciona o número atual à soma
        }

        // Exibe o resultado da soma
        System.out.println("A soma dos números de 1 a 50 é: " + soma);
    }
}
