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
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe um número: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            num = num + 5;
        } else {
            num = num + 8;
        }
        System.out.println("resultado: " + num);
    }
}
