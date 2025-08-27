/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogo;

/**
 *
 * @author Gomes
 */
 import java.util.Scanner;
public class Jogo {

    public static void main(String[] args) {
         Scanner jogos = new Scanner(System.in);
        System.out.println("Ponha um número para um jogo:");
        
        int Jogos = jogos.nextInt();
        
        switch (Jogos){
            case 1: 
               System.out.println(" Roblox ");
               break;
            case 2: 
               System.out.println(" Minecraft  ");
               break;
            case 3: 
               System.out.println(" FNF "); 
               break;
            case 4: 
               System.out.println(" Stardew Valley ");
               break;
            case 5: 
               System.out.println(" Fifa ");
               break;
               
            default :
                System.out.println(" Jogo não encontrado "); 
               
        }
    }
}
