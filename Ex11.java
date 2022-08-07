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
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("insira o valor a pagar: ");
        float valorTotal = sc.nextFloat();
        
        System.out.println("insira a forma de pagamento(1 - dinheiro ou cheque, 2 - cartão de crédito): ");
        int metodoPagamento = sc.nextInt();
        
        if (metodoPagamento == 1) {
            valorTotal = (float) (valorTotal * 0.9);
            System.out.println("valor total: " + valorTotal);
        } else if (metodoPagamento == 2) {
            System.out.println("insira o número de parcelas(1 - á vista, 2 - 2x, 3 - 3x): ");
            int numeroParcelas = sc.nextInt();
            
            if (numeroParcelas == 1) {
                valorTotal = (float) (valorTotal * 0.85);
                System.out.println("valor total: " + valorTotal);
            } else if (numeroParcelas == 3) {
                valorTotal = (float) (valorTotal * 1.2);
                System.out.println("valor total: " + valorTotal);
            } else if (numeroParcelas != 2) {
                System.out.println("número de parcelas inválido. algorítmo encerrado.");
            }
            
        } else {
            System.out.println("método inválido. algorítmo encerrado.");
        }
    }
}
