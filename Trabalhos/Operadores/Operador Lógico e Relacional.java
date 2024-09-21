/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operador_logico_e_relacional;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Operador_Logico_e_Relacional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Verificação de idade
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        if (idade > 21) {
            System.out.println("A pessoa tem mais de 21 anos.");
        } else {
            System.out.println("A pessoa não tem mais de 21 anos.");
        }
        
        // Verificação do salário
        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();
        double salarioMinimo = 1212.00; // Exemplo de salário mínimo
        if (salario > 5 * salarioMinimo) {
            System.out.println("O salário é maior que 5 vezes o salário mínimo.");
        } else {
            System.out.println("O salário não é maior que 5 vezes o salário mínimo.");
        }
        
        // Verificação de altura
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();
        if (altura > 1.75) {
            System.out.println("A altura é maior que 1,75 m.");
        } else {
            System.out.println("A altura não é maior que 1,75 m.");
        }
        
        // Verificação do peso
        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();
        if (peso > 70) {
            System.out.println("O peso é maior que 70 kg.");
        } else {
            System.out.println("O peso não é maior que 70 kg.");
        }
        
        // Verificação de sobrenome
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        String meuSobrenome = "Lucena"; 
        if (!sobrenome.equals(meuSobrenome)) {
            System.out.println("O sobrenome é diferente do seu.");
        } else {
            System.out.println("O sobrenome é igual ao seu.");
        }
        
        // Verificação do gênero
        System.out.print("Digite o gênero (f/m): ");
        char genero = scanner.next().charAt(0);
        if (genero == 'f') {
            System.out.println("O gênero é feminino.");
        } else {
            System.out.println("O gênero não é feminino.");
        }
        
        scanner.close();
        }
    }
