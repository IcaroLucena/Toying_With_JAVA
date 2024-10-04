/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagemregressiva;

/**
 *
 * @author Admin
 */
public class ContagemRegressiva {

    public static void main(String[] args) {
        // Contagem regressiva de 10 a 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            // Pausa de 1 segundo entre os números
            try {
                Thread.sleep(1000); // 1000 milissegundos = 1 segundo
            } catch (InterruptedException e) {
                System.out.println("A contagem foi interrompida.");
            }
        }
        System.out.println("FIM!");
    }
}
