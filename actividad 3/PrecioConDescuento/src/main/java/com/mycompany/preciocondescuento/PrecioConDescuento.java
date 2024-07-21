/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preciocondescuento;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class PrecioConDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el precio sin el descuento: ");
        double precioOriginal = scanner.nextDouble();


        double precioFinal;
        if (precioOriginal <= 100) {
            precioFinal = precioOriginal;
        } else if (precioOriginal <= 200) {
            precioFinal = precioOriginal * 0.90;
        } else if (precioOriginal <= 500) {
            precioFinal = precioOriginal * 0.80;
        } else {
            precioFinal = precioOriginal * 0.75;
        }

        System.out.printf("El precio con descuento es: " + precioFinal);
    }
}

