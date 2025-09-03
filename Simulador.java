/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simulador;

/**
 *
 * @author Gomes
 */
import java.util.Scanner;

public class Simulador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000.00; // Saldo inicial 
        int opcao;

        do {
            // Menu
            System.out.println("\n=== MENU BANCÁRIO ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Encerrar atendimento");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo é: R$ %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = sc.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.printf("Saque realizado! Novo saldo: R$ %.2f%n", saldo);
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.printf("Depósito realizado! Novo saldo: R$ %.2f%n", saldo);
                    break;
                case 4:
                    System.out.println("Encerrando atendimento...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4); // Repete até o usuário escolher 4

        sc.close();
    }
}

