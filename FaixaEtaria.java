/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.faixaetaria;

/**
 *
 * @author Gomes
 */
import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        int faixa = 0;

        // Define a faixa etária com if
        if (idade >= 0 && idade <= 12) {
            faixa = 1;
        } else if (idade >= 13 && idade <= 17) {
            faixa = 2;
        } else if (idade >= 18 && idade <= 59) {
            faixa = 3;
        } else if (idade >= 60) {
            faixa = 4;
        } else {
            System.out.println("Idade inválida.");
            System.exit(0);
        }

        // Usa switch para imprimir a mensagem
        switch (faixa) {
            case 1:
                System.out.println("Você é uma criança.");
                break;
            case 2:
                System.out.println("Você é um adolescente.");
                break;
            case 3:
                System.out.println("Você é um adulto.");
                break;
            case 4:
                System.out.println("Você é um idoso.");
                break;
        }

        sc.close();
    }
}

