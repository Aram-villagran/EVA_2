/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_num_pares;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA2_6_NUM_PARES {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Seleccione el primer numero: ");
        int num1 = captu.nextInt();
        
        System.out.println("Seleccione el segundo numero: ");
        int num2 = captu.nextInt();
        
      
        System.out.println("Numeros en orden: ");
        for (int i = num1; i <= num2; i++){
           int modulo = i % 2; //residuo de la division
           if(modulo != 1)//verdad --> sea impar, para detener la impresion
               continue;
        System.out.print( i + " ");
    }
}
}
