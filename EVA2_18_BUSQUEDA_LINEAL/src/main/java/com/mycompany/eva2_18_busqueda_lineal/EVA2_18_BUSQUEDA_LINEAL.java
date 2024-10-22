/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    public static void main(String[] args) {
        int [] datos = {10, 50, 85, 73, 11, 25, 43, 5, 0, 6};
        int valor, posicion = -1;
        Scanner captu = new Scanner(System.in);      
        System.out.println("Valor a buscar: ");
        valor = captu.nextInt();
        captu.nextLine();
        for (int i = 0; i < datos.length; i++){
          if (valor == datos [i])
              //regresar la posicion
              posicion = i;
          //detener el ciclo
          break;
        }
        
        if(posicion == -1){
            System.out.println("VALOR NO ENCONTRADO");
        } else{
            System.out.println("El valor esta en la posicion " + posicion);
    }
    }
}
