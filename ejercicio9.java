/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.traduccion;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        
        Scanner scc= new Scanner(System.in);
        
        int numero;
        
        System.out.print("Ingrese un numero entero: ");
        numero = scc.nextInt();
        
        for (int i = 1; i <= 12; i++) {
            
            System.out.println(numero + " x " + i + " = " + (numero * i));
            
        }
        
        scc.close();
    }
}