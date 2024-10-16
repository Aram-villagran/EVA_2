/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class PRACTICA1 {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String nombre;
            
        
        System.out.println("Ingrese el texto");
        nombre = captu.nextLine();
        
        System.out.print("Introduce un número de veces a repetir: ");
        int numero = captu.nextInt();
    
      
     for (int i = 0; i < numero; i++) {
        System.out.println(nombre);
    }
                
    }
}
