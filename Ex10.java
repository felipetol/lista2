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
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira a medida do lado 1: ");
        int lado1 = sc.nextInt();
        
        System.out.println("insira a medida do lado 2: ");
        int lado2 = sc.nextInt();
        
        System.out.println("insira a medida do lado 3: ");
        int lado3 = sc.nextInt();
        
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("isósceles.");
        } else {
            System.out.println("escaleno.");
        }
    }
}
