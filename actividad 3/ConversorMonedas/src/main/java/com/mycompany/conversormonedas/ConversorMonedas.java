/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversormonedas;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en pesos mexicanos: ");
        double pesos = scanner.nextDouble();

        System.out.println("Seleccione la moneda a convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        int opcion = scanner.nextInt();

        double tasaConversion = 0;
        switch (opcion) {
            case 1:
                tasaConversion = 0.050;
                break;
            case 2:
                tasaConversion = 0.042; 
                break;
            case 3:
                tasaConversion = 1.54;
                break;
            case 4:
                tasaConversion = 5.58; 
                break;
            case 5:
                tasaConversion = 65.85;
                break;
            case 6:
                tasaConversion = 0.074;
                break;
            case 7:
                tasaConversion = 0.19; 
                break;
            case 8:
                tasaConversion = 0.066;
                break;
            case 9:
                tasaConversion = 16.54; 
                break;
            case 10:
                tasaConversion = 13.84; 
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        double cantidadConvertida = pesos * tasaConversion;
        System.out.printf("La cantidad convertida es: %.2f%n", cantidadConvertida);
    }
}
