package com.mycompany.busca_em_vetor;

import java.util.Scanner;

public class Busca_em_Vetor {

    public static void main(String[] args) {
        // Criação do Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Criar um vetor para armazenar 10 nomes
        String[] nomes = new String[10];
        
        // Solicitar ao usuário para inserir 10 nomes
        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        // Solicitar o nome a ser buscado
        System.out.print("\nDigite o nome a ser buscado: ");
        String nomeBuscado = scanner.nextLine();
        
        // Chamar a função para realizar a busca
        int posicao = buscarNome(nomes, nomeBuscado);
        
        // Exibir o resultado da busca
        if (posicao != -1) {
            System.out.println("O nome '" + nomeBuscado + "' foi encontrado na posição " + posicao + ".");
        } else {
            System.out.println("O nome '" + nomeBuscado + "' não foi encontrado no vetor.");
        }
        
        // Fechar o scanner
        scanner.close();
    }

    // Função que realiza a busca linear em um vetor de nomes
    public static int buscarNome(String[] vetor, String nome) {
        // Percorrer o vetor para encontrar o nome
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equalsIgnoreCase(nome)) { // Comparar nomes sem considerar maiúsculas/minúsculas
                return i; // Retorna a posição do nome se encontrado
            }
        }
        return -1; // Retorna -1 se o nome não for encontrado
    }
}
