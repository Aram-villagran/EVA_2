/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
        int Numero, Exponente;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingrese su numero en forma base:");
        Numero = captu.nextInt();
        captu.nextLine();
        System.out.println("Ingrese su numero Exponente:");
        Exponente = captu.nextInt();
        captu.nextLine();
        int resu = 1;
      for (int i = 1; i <= 3; i++){
          resu = resu * Numero;
      }
        System.out.println("El resultado es: " + resu);
    }
}
