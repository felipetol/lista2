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
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira o valor de A: ");
        int A = sc.nextInt();
        
        System.out.println("insira o valor de B: ");
        int B = sc.nextInt();
        
        int C;
        if (A == B) {
            C = A + B;
        } else {
            C = A * B;
        }
        
        System.out.println("resultado: " + C);
    }
}
