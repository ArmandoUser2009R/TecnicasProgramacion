/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.traduccion;

import java.util.Scanner;
public class Traduccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;
        String carrera;
        Double estatura;

        System.out.println("Ingrese su nombre: ") ;
        nombre =sc.nextLine();
        System.out.println("Ingrese su edad:") ;
        edad = sc.nextInt();
        System.out.println("Ingrese su carrera:") ;
        carrera = sc.next();
        System.out.println("Ingrese su estatura:") ;
        estatura = sc.nextDouble();

        System.out.println("======Los datos completos suyos son. ====== ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura);
    }

}
