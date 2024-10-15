/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_ciclos;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA2_1_CICLOS {

    public static void main(String[] args) {
        //ciclos o bucles
        //for (desde) cuando saben cuantas veces se va a repetir la instruccion
        //while (mientras) cuando se repite 0 o n veces
        //do while (hacer...mientras) cuanto se repite al menos 1 vez hasta n veces
        
        for (int i = 1; i <= 10; i++){
            // ++ --> operador para sumar 1 unidad
            //-- --> resta 1 unidad
            // += suma N valor
            // -= resta N valor
            // *= Multiplica por N
            // /= Divide por N
            System.out.print(i + " - ");
                    
        }
      System.out.println("");
        for (int i = 10; i >= 1; i++){
            System.out.println(i + " - ");
        }
    }
}
