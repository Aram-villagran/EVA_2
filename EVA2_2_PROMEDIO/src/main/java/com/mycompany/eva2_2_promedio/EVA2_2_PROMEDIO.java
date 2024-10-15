/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA2_2_PROMEDIO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int califa, sumaCali;
        //inicializar el acumulador
        sumaCali = 0;
        for(int i = 1; i <= 10 ; i++){
            System.out.println(i + "Estudiante #" + i) ;
        System.out.println("Cual es tu calificacion?");
        califa = captu.nextInt();
        captu.nextLine();
    //acumular las calificaciones
        sumaCali= sumaCali + califa;
        }
        double promedio = sumaCali / 10.0;
        System.out.println("sumaCalifa = " + sumaCali);
        
        
    }
}
