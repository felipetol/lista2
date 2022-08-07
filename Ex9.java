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
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("altura(m): ");
        double altura = sc.nextDouble();
        
        sc.nextLine();
        System.out.println("gênero(F ou M): ");
        String genero = new String();
        genero = sc.nextLine();
        
        double pesoIdeal = 0;
        if ("F".equals(genero)) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if ("M".equals(genero)) {
            pesoIdeal = (72.7 * altura) -58;
        }
        System.out.println("peso ideal: " + pesoIdeal);
    }
}
