/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.traduccion;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

           int num1;
           int num2;

            System.out.println("Ingrese el primer numero:");
            num1 = sc.nextInt();

            System.out.println("Ingrese el segundo numero:");
            num2 = sc.nextInt();

         System.out.println("La suma es: " + (num1 + num2));
         System.out.println("La resta es: " + (num1 - num2));
         System.out.println("La multiplicacion es: " + (num1 * num2));
         System.out.println("La division es: " + (num1 / num2));
         System.out.println("El residuo es: " + (num1 % num2));

    }

}