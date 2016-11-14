/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02;

/**
 * Esempio di commenti i Java
 *
 * @author tss
 */
public class Main {

    //variabile statica 
    private static int colore;

    //variabile di istanza
    private int carattere;

    /**
     * Da questo metodo partirà l'esecuzione del programma
     *
     * @param args
     */
    public static void main(String[] args) {
        // singola riga

        /*
        commento su più righe
        ecc...
         */
        System.out.println("Parametri in ingrasso: " + args);

        System.out.println("Start esempio commenti..");

        //variabile locale
        int totale = 10;
        String frase;

        totale -= 20;

        if (totale > 0) {
            //variabile locale
            int x = 5;
            frase = "Il totale è positivo";
        } else {
            int x = 10;
            frase = "Il totale è negativo";
        }

        //if ternario 
        frase = (totale > 0) ? "Il totale è positivo" : "Il totale è negativo";

        System.out.println("Totale: " + totale);
        System.out.println(frase);

    }
}
