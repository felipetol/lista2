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
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira o número de lados do polígono: ");
        int numeroLados = sc.nextInt();
        
        System.out.println("insira a medida do lado do polígono: ");
        int lado = sc.nextInt();
        
        double area;
        if (numeroLados == 3) {
            System.out.println("TRIÂNGULO");
            area = ((lado * lado) * Math.sqrt(3)) / 4;
            System.out.println("área: " + area);
        } else if (numeroLados == 4) {
            System.out.println("QUADRADO");
            area = lado * lado;
            System.out.println("área: " + area);
        } else if (numeroLados == 5) {
            System.out.println("PENTÁGONO");
        }
    }
}
