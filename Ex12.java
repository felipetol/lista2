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
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira o número de identificação: ");
        int numeroId = sc.nextInt();
        
        System.out.println("insira a nota 1: ");
        int nota1 = sc.nextInt();
        
        System.out.println("insira a nota 2: ");
        int nota2 = sc.nextInt();
        
        System.out.println("insira a nota 3: ");
        int nota3 = sc.nextInt();
        
        float mediaEx = (nota1 + nota2 + nota3) / 3;
        
        float mediaAp = ((nota1 + nota2) * 2 + nota3 * 3 + mediaEx) / 7;
        
        System.out.println("número identificação do aluno: " + numeroId);
        System.out.println("nota 1: " + nota1);
        System.out.println("nota 2: " + nota2);
        System.out.println("nota 3: " + nota3);
        System.out.println("média dos exercícios: " + mediaEx);
        System.out.println("média aproveitamento: " + mediaAp);
        
        if (mediaAp >= 90) {
            System.out.println("conceito: A");
            System.out.println("Aprovado");
        } else if (mediaAp >= 75) {
            System.out.println("conceito: B");
            System.out.println("Aprovado");
        } else if (mediaAp >= 60) {
            System.out.println("conceito: C");
            System.out.println("Aprovado");
        } else if (mediaAp >= 40) {
            System.out.println("conceito: D");
            System.out.println("Reprovado");
        } else if (mediaAp >= 0) {
            System.out.println("conceito: E");
            System.out.println("Reprovado");
        }
    }
}
