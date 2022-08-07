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
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe o valor de a: ");
        int a = sc.nextInt();
        
        if (a != 0) {
            System.out.println("informe o valor de b: ");
            int b = sc.nextInt();
            
            System.out.println("informe o valor de c: ");
            int c = sc.nextInt();
            
            int delta = b * b - 4 * a * c;
            
            if (delta >=  0) {
                if (delta == 0) {
                    double resultado = (-1 * b) / (2 * a);
                    System.out.println("resultado: " + resultado);
                } else {
                    double resultado1 = (- b + Math.sqrt(delta)) / (2 * a);
                    double resultado2 = (- b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("resultado 1: " + resultado1);
                    System.out.println("resultado 2: " + resultado2);
                }
            } else {
                System.out.println("não possui raízes reais. algorítmo encerrado.");
            }
            
        } else {
            System.out.println("equação do primeiro grau. algorítmo encerrado.");
        }
    }
}
