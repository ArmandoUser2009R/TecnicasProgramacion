/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.traduccion;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        double promedio;
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.print("Ingrese el numero " + i + ": ");
            numero = sc.nextInt();
            
            suma = suma + numero;
            
        }
        
        promedio = suma / 10.0;
        
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
        
        sc.close();
    }
}