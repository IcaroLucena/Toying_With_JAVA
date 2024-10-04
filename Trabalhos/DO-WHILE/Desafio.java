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
        int numero;

        do {
            System.out.print("Insira um número inteiro (digite 0 para sair): ");
            numero = scanner.nextInt();
            
            if (numero != 0) {
                contador++;
            }
        } while (numero != 0);

        System.out.println("Você inseriu " + contador + " números.");
        scanner.close();
    }
}
