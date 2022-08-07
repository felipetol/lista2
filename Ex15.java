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
public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira o valor do ângulo 1: ");
        int angulo1 = sc.nextInt();
        
        System.out.println("insira o valor do ângulo 2: ");
        int angulo2 = sc.nextInt();
        
        System.out.println("insira o valor do ângulo 3: ");
        int angulo3 = sc.nextInt();
        
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("Retângulo");
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            System.out.println("Obtusângulo");
        } else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
            System.out.println("Acutângulo");
        }
    }
}
