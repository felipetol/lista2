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
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira um número: ");
        float num = sc.nextFloat();
        
        if (num > 0) {
            float resultado = num * 2;
            System.out.println("resultado: " + resultado);
        } else if (num < 0) {
            float resultado = num * 3;
            System.out.println("resultado: " + resultado);
        }
        
    }
}
