/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 * Legge un numero in input e stampa se pari o dispari
 *
 * @author tss
 */
public class PariDispari {

    public static void main(String[] args) {

        String risultato;

        //Crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);

        System.out.print("Inserisci il numero: ");

        //Leggo il numero in input
        int numero = s.nextInt();

        if ((numero % 2) == 0) {
            risultato = "Il numero è pari";
        } else {
            risultato = "Il numero è dispari";
        }
        System.out.println(risultato);

    }

}
