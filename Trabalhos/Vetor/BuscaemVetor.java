package com.mycompany.buscaemvetor;

import java.util.Scanner;

public class BuscaemVetor {

    public static void main(String[] args) {
        // Criando o scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Criando o vetor de 10 nomes
        String[] nomes = new String[10];

        // Solicitando ao usuário para inserir 10 nomes
        System.out.println("Digite 10 nomes:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Solicitando ao usuário para inserir o nome a ser buscado
        System.out.print("\nDigite o nome a ser buscado: ");
        String nomeBusca = scanner.nextLine();

        // Buscando o nome no vetor
        int posicao = -1;  // Inicializando com -1 (valor que indica não encontrado)
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                posicao = i;
                break;
            }
        }

        // Exibindo o resultado da busca
        if (posicao != -1) {
            System.out.println("O nome '" + nomeBusca + "' foi encontrado na posição " + (posicao + 1) + ".");
        } else {
            System.out.println("O nome '" + nomeBusca + "' não foi encontrado.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
