/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA2_4_FACTORIAL {

    public static void main(String[] args) {
        int Numero, Factorial;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduzca su numero en forma base: ");
        Numero = captu.nextInt();
        captu.nextLine();
     Factorial = 1;
    for (int i = 1; i <= Numero; i ++){
       Factorial = Factorial * i;
    }
        System.out.println("Su numero factorial es:" + Factorial);
        
    }
    
}
