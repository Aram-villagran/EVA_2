/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author aramv
 */
public class EVA2_9_USUARIO_PWD {

    public static void main(String[] args) {
final String USUARIO= "Admin";
final String PASSWORD= "Admin1234";
String Password, User;

Scanner captu = new Scanner (System.in);
do{
System.out.println("Usuario:");
User = captu.nextLine();
System.out.println("Password:");
Password = captu.nextLine();
//Como validamos el acceso? 
}while(!(User.equals ("Admin") && Password.equals("Admin1234")));
        System.out.println("Bienvenido!!!");



    }
}
