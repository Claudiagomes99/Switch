/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia;

/**
 *
 * @author Gomes
 */
  import java.util.Scanner;
public class Dia {

    public static void main(String[] args) {
     Scanner dia = new Scanner(System.in);
    
    
     
    System.out.print("Digite um dia:");
    int Dia = dia.nextInt();
    
    switch( Dia){
        case 1:
          System.out.print("Domingo"); 
          break;
        case 2:
          System.out.print("Segunda");
          break;
        case 3:
          System.out.print("Terça"); 
          break;
        case 4:
          System.out.print("Quarta");
          break;
         case 5:
          System.out.print("Quinta"); 
          break;
        case 6:
          System.out.print("Sexta");
          break;
        case 7:
          System.out.println("Sábado");
          break;
        default:
            System.out.println("Dia inválido");
    }
}
}