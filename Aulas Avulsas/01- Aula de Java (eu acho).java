/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulaex;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class AulaEX {

    public static void main(String[] args) {
        //Leitura//
        Scanner leia = new Scanner(System.in);
        
        //Entrada de dados//
        int valor;
        int vdesconto;
        int pjuros;
        int vjuros;
        int pdesconto;
        
        //Entrada de dados manual//
        System.out.println("**** WINKS!!****");//nOME DA LOJA//
        System.out.println("Digite o valor da compra:");//Mostrar na tela//
        valor = leia.nextInt();//Fazer a leitura do valor//
        System.out.println("Digite a porcentagem de desconto:");
        pdesconto =leia.nextInt(); //Fazer a leitura do desconto//
        System.out.println("Digite a porcentagem de juros:");
        pjuros =leia.nextInt(); //Fazer a leitura do desconto//
        
        //Processamento//
        vdesconto = valor * pdesconto; //Calculo de desconto//
        vjuros = valor * pjuros; //Calculo de juros//
        
        //saida//
        System.out.println (" Compra 10% de desconto " + vdesconto );
        System.out.println (" Compra 10% de juros " + vjuros );
        
        System.out.println("Hello World!");
    }
}
