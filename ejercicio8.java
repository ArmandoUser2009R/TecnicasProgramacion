/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.traduccion;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String contraseña = "";
        
        while (!contraseña.equals("java2026")) {
            
            System.out.print("Ingrese la contraseña: ");
            contraseña = sc.nextLine();
            
        }
        
        System.out.println("Acceso concedido.");
        
        sc.close();
    }
}
