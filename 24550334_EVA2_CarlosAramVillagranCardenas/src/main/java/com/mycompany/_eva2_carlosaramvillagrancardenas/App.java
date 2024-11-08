/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._eva2_carlosaramvillagrancardenas;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author aramv
 */
public class App {

    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
        Random Math = new Random();
        
        while (true) {
            System.out.println("Elija una opción: 1 para Piedra, 2 para Papel, 3 para Tijera (0 para salir): ");
            int eleccionUsuario = captu.nextInt();
            
            
            if (eleccionUsuario == 0) {
                System.out.println("Juego terminado. ¡Gracias por jugar!");
                break;
            }
            
           
            if (eleccionUsuario < 1 || eleccionUsuario > 3) {
                System.out.println("Entrada no válida. Intente de nuevo.");
                continue;
            }
        }
    
    
    }

