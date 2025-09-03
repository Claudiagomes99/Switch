/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoratarifas;

/**
 *
 * @author Gomes
 */

import java.util.Scanner;

public class Calculadoratarifas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Mostra o menu para escolher
        System.out.println("Escolha o tipo de transporte digitando o número correspondente:");
        System.out.println("1 - Ônibus urbano");
        System.out.println("2 - Metrô");
        System.out.println("3 - Trem intermunicipal");
        System.out.println("4 - Ônibus rodoviário");
        
        // usuário digita a opção
        System.out.print("Digite sua opção: ");
        int tipoTransporte = sc.nextInt();
        
        // Verifica se a opção é válida
        if (tipoTransporte < 1 || tipoTransporte > 4) {
            System.out.println("Opção inválida!");
            sc.close();
            return; // encerra o programa
        }
        
        // quantidade de bilhetes
        System.out.print("Digite a quantidade de bilhetes: ");
        int quantidade = sc.nextInt();
        
        double tarifa = 0;
        
        // Calcula a tarifa
        switch(tipoTransporte) {
            case 1:
                tarifa = 4.40;
                break;
            case 2:
                tarifa = 5.00;
                break;
            case 3:
                tarifa = 6.50;
                break;
            case 4:
                tarifa = 12.00;
                break;
        }
        
        double total = tarifa * quantidade;
        System.out.printf("O valor total a pagar é: R$ %.2f\n", total);
        
        sc.close();
    }
}