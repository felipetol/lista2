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
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nome: ");
        String nome = new String();
        nome = sc.nextLine();
        
        System.out.println("gênero: ");
        String genero = new String();
        genero = sc.nextLine();
        
        System.out.println("estado civil: ");
        String estadoCivil = new String();
        estadoCivil = sc.nextLine();
        
        if (("CASADA".equals(estadoCivil)) && ("F".equals(genero))) {
            System.out.println("quantidade de tempo casada: ");
            int tempoCasada = sc.nextInt();
        }
    }
}
