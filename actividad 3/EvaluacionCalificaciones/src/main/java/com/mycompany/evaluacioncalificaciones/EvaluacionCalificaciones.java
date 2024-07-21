/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evaluacioncalificaciones;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class EvaluacionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación de 0 al 100: ");
        int calificacion1 = scanner.nextInt();
        System.out.print("Ingrese la calificación de 0 al 100: ");
        int calificacion2 = scanner.nextInt();
        System.out.print("Ingrese la calificación de 0 al 100: ");
        int calificacion3 = scanner.nextInt();
        int calificacion =(calificacion1+calificacion2+calificacion3)/3;
        char letra;
        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80 && calificacion < 90) {
            letra = 'B';
        } else if (calificacion >= 70 && calificacion < 80) {
            letra = 'C';
        } else if (calificacion >= 60 && calificacion < 70) {
            letra = 'D';
        } else {
            letra = 'F';
        }

        System.out.println("La calificación con letra es: " + letra);
    }
}

