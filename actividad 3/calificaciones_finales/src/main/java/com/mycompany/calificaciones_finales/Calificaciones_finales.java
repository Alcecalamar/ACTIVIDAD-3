/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calificaciones_finales;

/**
 *
 * @author cabal
 */
import java.util.Scanner;
public class Calificaciones_finales {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la calificación de los parciales 0 al 100: ");
        double parciales = scanner.nextDouble();
        System.out.print("Ingrese la calificación del proyecto 0 al 100: ");
        double proyecto = scanner.nextDouble();
        System.out.print("Ingrese la calificación del examen final 0 al 100: ");
        double examenFinal = scanner.nextDouble();


        if (parciales < 0 || parciales > 100 || proyecto < 0 || proyecto > 100 || examenFinal
                < 0 || examenFinal > 100) {
            System.out.println("Las calificaciones deben estar entre 0 y 100.");
        } else {

            double calificacionFinal = (parciales * 0.4) + (proyecto * 0.3) + (examenFinal * 0.3);
            System.out.printf("La calificación final es: %.2f%n", calificacionFinal);
        }
    }
}


    
