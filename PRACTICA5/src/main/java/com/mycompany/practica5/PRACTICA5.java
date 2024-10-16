/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica5;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class PRACTICA5 {

    public static void main(String[] args) {
//Solicitar un numero. imprimir el siguiente patrón (se deben repetir segun el numero capturado) 
//*
//**
//*** 
//****
//*****

        Scanner captu = new Scanner(System.in);
        System.out.println("Inserte el numero de veces que desee que se repita el patron:");
        int numero = captu.nextInt();
        
        System.out.println();
        
        
        for(int i= 1;i >= numero;i++){
        System.out.println(numero + i);
        }
    }
}
