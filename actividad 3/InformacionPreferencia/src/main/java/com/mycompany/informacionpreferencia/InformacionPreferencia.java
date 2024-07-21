/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.informacionpreferencia;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class InformacionPreferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su preferencia (artista, película, serie,serie2, pintor, etc.): ");
        String preferencia = scanner.nextLine().toLowerCase();

        switch (preferencia) {
            case "artista":
                System.out.println("Beyoncé es una cantante, compositora y actriz estadounidense.");
                break;
            case "serie":
                System.out.println("Breaking Bad es una serie de televisión dramática estadounidense creada por Vince Gilligan.");
                break;
            case "película":
                System.out.println("Inception es una película de ciencia ficción dirigida por Christopher Nolan.");
                break;
            case "serie2":
                System.out.println("Game of Thrones es una serie de televisión basada en las novelas de George R.R. Martin.");
                break;
            case "pintor":
                System.out.println("Pablo Picasso fue un pintor y escultor español, creador del cubismo.");
                break;
            default:
                System.out.println("No tengo información sobre esa preferencia.");
                break;
        }
    }
}

