/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoraritmetico;

/**
 *
 * @author Admin
 */

import java.util.Scanner;

public class OperadorAritmetico {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
    
        Scanner scanner = new Scanner(System.in);
        
        // Lê o valor total da fatura
        System.out.print("Digite o valor total da fatura: ");
        double valorTotal = scanner.nextDouble();
        
        // Lê o número de parcelas
        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();
        
        // Lê o percentual de desconto por pagamento antecipado
        System.out.print("Digite o percentual de desconto por pagamento antecipado (em %): ");
        double percentualDesconto = scanner.nextDouble();
        
        // Lê o percentual de multa por atraso
        System.out.print("Digite o percentual de multa por atraso (em %): ");
        double percentualMulta = scanner.nextDouble();
        
        // Calcula o valor total com desconto para pagamento antecipado
        double desconto = (percentualDesconto / 100) * valorTotal;
        double valorTotalComDesconto = valorTotal - desconto;
        System.out.printf("Valor total com desconto para pagamento antecipado: R$ %.2f%n", valorTotalComDesconto);
        
        // Calcula o valor de cada parcela com multa
        double valorParcela = valorTotal / numeroParcelas;
        double valorParcelaComMulta;
        double multa;
        
        System.out.println("Detalhes de cada parcela com multa:");
        for (int i = 1; i <= numeroParcelas; i++) {
            multa = (percentualMulta / 100) * valorParcela;
            valorParcelaComMulta = valorParcela + multa;
            System.out.printf("Parcela %d: Valor original: R$ %.2f, Multa: R$ %.2f, Valor total com multa: R$ %.2f%n", i, valorParcela, multa, valorParcelaComMulta);
        }
        
        // Fecha o scanner
        scanner.close();
        }
    }