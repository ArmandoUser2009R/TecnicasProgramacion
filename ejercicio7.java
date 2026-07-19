/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.traduccion;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int cantidad = 0;
        int suma = 0;

        System.out.println("Ingrese numeros positivos.");
        System.out.println("Para terminar escriba un numero negativo.");

        numero = sc.nextInt();

        while (numero >= 0) {

            cantidad++;
            suma = suma + numero;

            numero = sc.nextInt();

        }

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);

    }

}