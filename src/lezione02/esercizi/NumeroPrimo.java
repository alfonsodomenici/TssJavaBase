/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 * Legge un numero in input e stampa se è un numero primo oppure no
 *
 * @author tss
 */
public class NumeroPrimo {

    public static void main(String[] args) {
        String risultato;

        //Crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);

        System.out.print("Inserisci il numero: ");

        //Leggo il numero in input
        int numero = s.nextInt();

        if (numero <= 1) {
            System.out.println("Non è un numero primo");
            System.exit(0);
        }

        int divisore = 1;

        boolean primo = true;

        while (divisore <= numero && primo) {
            primo = (numero % divisore != 0) || divisore == 1 || divisore == numero;
            divisore += 1;
        }

        risultato = primo ? "Il numero è primo" : "Il numero non è primo";

        System.out.println(risultato);
    }
}
