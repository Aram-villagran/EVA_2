/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class Practica4 {

    public static void main(String[] args) {
//solicitar una cadena al usuario. imprimir todas las vocales

        Scanner captu = new Scanner(System.in);

        // Solicitar una cadena de texto
        System.out.print("Introduce una cadena de texto: ");
        String texto = captu.nextLine();

        // Recorrer la cadena y verificar si cada carácter es una vocal
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.print(c + " ");
            }
        }

        
    }
}

    

