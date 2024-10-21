/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_ciclos_arreglos;

/**
 *
 * @author aramv
 */
public class EVA2_14_CICLOS_ARREGLOS {

    public static void main(String[] args) {

        int[]dato, valores[]; // un solo arreglo --> valores
        int[]datos, x, y, z; // un solo arreglo --> valores
int[] arreglo = new int[100]; //todos son arreglos
    
for (int i = 0; i < arreglo.length; i++){
arreglo[i] = (int)(Math.random() * 100);

}

      //  System.out.println(arreglo); SOLO IMPRIME LA DIRECCION EN MEMORIA
      
      for (int i = 0; i < arreglo.length; i++){
          System.out.print(arreglo [i] + " - ");
        

}
      
    }
}
