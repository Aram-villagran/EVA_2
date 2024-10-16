/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class PRACTICA3 {

    public static void main(String[] args) {
       //Solicitar una cadena al usuario. Imprimir cada caracter por separado en su propia linea
       Scanner captu = new Scanner(System.in);
        // Solicitar una cadena de texto
        System.out.print("Introduce una cadena de texto: ");
        String texto = captu.nextLine();

        // Imprimir cada carácter en su propia línea
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }

       
    }
}

       
       
    

