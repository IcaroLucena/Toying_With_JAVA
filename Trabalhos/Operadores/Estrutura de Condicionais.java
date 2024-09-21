/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutura_de_condicionais;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Estrutura_de_Condicionais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Suas características
        String meuNome = "Admin";
        int minhaIdade = 30; // Exemplo
        double meuPeso = 70.0; // Exemplo
        double minhaAltura = 1.75; // Exemplo
        String minhaSerieFavorita = "Breaking Bad"; // Exemplo
        String minhaMusicaFavorita = "Imagine"; // Exemplo
        String meuJogoFavorito = "The Last of Us"; // Exemplo

        // Lendo as características da outra pessoa
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite sua série favorita: ");
        String serieFavorita = scanner.nextLine();

        System.out.print("Digite sua música favorita: ");
        String musicaFavorita = scanner.nextLine();

        System.out.print("Digite seu jogo favorito: ");
        String jogoFavorito = scanner.nextLine();

        // Contador de características iguais
        int contadorIguais = 0;

        // Comparando características
        if (nome.equals(meuNome)) {
            System.out.println("Pessoa com nome igual.");
            contadorIguais++;
        } else {
            System.out.println("Pessoa com o nome diferente.");
        }

        if (idade == minhaIdade) {
            System.out.println("A idade é igual.");
            contadorIguais++;
        } else {
            System.out.println("A idade é diferente.");
        }

        if (peso == meuPeso) {
            System.out.println("O peso é igual.");
            contadorIguais++;
        } else {
            System.out.println("O peso é diferente.");
        }

        if (altura == minhaAltura) {
            System.out.println("A altura é igual.");
            contadorIguais++;
        } else {
            System.out.println("A altura é diferente.");
        }

        if (serieFavorita.equals(minhaSerieFavorita)) {
            System.out.println("A série favorita é igual.");
            contadorIguais++;
        } else {
            System.out.println("A série favorita é diferente.");
        }

        if (musicaFavorita.equals(minhaMusicaFavorita)) {
            System.out.println("A música favorita é igual.");
            contadorIguais++;
        } else {
            System.out.println("A música favorita é diferente.");
        }

        if (jogoFavorito.equals(meuJogoFavorito)) {
            System.out.println("O jogo favorito é igual.");
            contadorIguais++;
        } else {
            System.out.println("O jogo favorito é diferente.");
        }

        // Verificando se a pessoa tem 3 ou mais características iguais
        if (contadorIguais >= 3) {
            System.out.println("Esta pessoa é bem parecida comigo!");
        } else {
            System.out.println("Esta pessoa não é tão parecida comigo.");
        }

        scanner.close();
    }
}
