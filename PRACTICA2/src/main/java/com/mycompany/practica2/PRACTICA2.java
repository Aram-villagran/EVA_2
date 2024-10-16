/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica2;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class PRACTICA2 {

    public static void main(String[] args) {
        // solicitar dos numeros, imprimir todos los numeros entre esos dos en orden ascendente y descendente        
       
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Seleccione el primer numero: ");
        int num1 = captu.nextInt();
        
        System.out.println("Seleccione el segundo numero: ");
        int num2 = captu.nextInt();
        
      
        System.out.println("Numeros en orden ascendente: ");
        for (int i = num1; i <= num2; i++){
        System.out.print( i + " ");
    }
        System.out.println();
        
        System.out.println("Numeros en orden descendente: ");
        for (int i = num2; i >= num1; i--){
        System.out.print( i + " ");
    }
 
        
        }
        }
    

