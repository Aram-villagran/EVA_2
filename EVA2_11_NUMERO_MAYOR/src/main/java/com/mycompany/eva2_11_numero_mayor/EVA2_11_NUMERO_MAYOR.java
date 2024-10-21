/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA2_11_NUMERO_MAYOR {

    public static void main(String[] args) {
//solicitar un numero entero
//dejar de preguntar cuando se introduzca un -1
//decir cual fue el numero mas grande que introduzca el usuario

int numero;
int mayor = -1;
        Scanner captu = new Scanner(System.in);
while (true){
            System.out.println("Introduzca el numero -1: ");
            numero = captu.nextInt();
              if (numero == -1){
        break;
    }
        if (numero > mayor){
    mayor = numero;
        } 
}
          
   if (mayor != -1){
        System.out.println("El numero ingresado mas grande fue:" + mayor );
        
   }else{
       System.out.println("No ha ingresado un numero valido");
   }
    }
    }
