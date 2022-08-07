/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2;

import java.util.Scanner;
/**
 *
 * @author felipetoledo
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vetor[] = new int[3];
        int i;
        
        for (i = 0; i <= 2; i++) {
            System.out.println("insira o valor do número: ");
            vetor[i] = sc.nextInt();
        }
        
        if (vetor[2] > vetor[1]) {
            int aux = vetor[1];
            vetor[1] = vetor[2];
            vetor[2] = aux;
        }
        if (vetor[1] > vetor[0]) {
            int aux = vetor[0];
            vetor[0] = vetor[1];
            vetor[1] = aux;
        }
        if (vetor[2] > vetor[1]) {
            int aux = vetor[1];
            vetor[1] = vetor[2];
            vetor[2] = aux;
        }
        
        for (i = 0; i <= 2; i++) {
            System.out.print(vetor[i] + " ");
        }
        
    }
}
