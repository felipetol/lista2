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
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira o valor de A: ");
        int a = sc.nextInt();
        
        System.out.println("insira o valor de B: ");
        int b = sc.nextInt();
        
        System.out.println("insira o valor de C: ");
        int c = sc.nextInt();
        
        if (a + b < c) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }
    }
}
