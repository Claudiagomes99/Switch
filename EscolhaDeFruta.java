/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escolhadefruta;

/**
 *
 * @author Gomes
 */
 import java.util.Scanner;
public class EscolhaDeFruta {

    public static void main(String[] args) {
    Scanner frutas = new Scanner(System.in);
    
   System.out.print("Digite um número para descobrir a fruta:");
   int fruta = frutas.nextInt();
     
    switch (fruta) {
     case 1:
         System.out.println("Está fruta é uma maçã ");
         break;
     case 2:
         System.out.println("Uma banana ");
         break;
     case 3:
         System.out.println(" É uma laranja ");
         break;
     
     default:
          System.out.println(" Fruta invalida ");
          
    }
  }
}
