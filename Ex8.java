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
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int vetor[] = new int[5];
        
        int i;
        
        for(i = 0; i <= 4; i++) {
            System.out.println("insira o número: ");
            vetor[i] = sc.nextInt();
        }
        
        int j;
        for (j = 0; j < 4; j++) {
            for (i = 4; i > j; i--) {
                if(vetor[i] < vetor[i - 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = aux;
                }
            }   
        }
        
        for(i = 0; i <=4; i++) {
            System.out.print(vetor[i] + " ");
        }
        
    }
}
