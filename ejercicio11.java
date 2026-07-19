/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.traduccion;

/**
 *
 * @author LENOVO.USER
 */
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int mayor;
        int menor;
        
        System.out.print("Ingrese el numero 1: ");
        numero = sc.nextInt();
        
        mayor = numero;
        menor = numero;
        
        for (int i = 2; i <= 10; i++) {
            
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        
        sc.close();
    }
}