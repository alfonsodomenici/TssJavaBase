/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.dadi_exception;

import lezione03.giocodadi.*;

/**
 *
 * @author tss
 */
public class DemoApp {

    public static void main(String[] args) {

        
        //Creo oggetto giocatore
        Giocatore g = new Giocatore("Rossi", 1);
        //Creo oggetti dado, uno per il giocatore ed uno per il banco
        Dado gDado = new Dado(6);
        Dado bDado = new Dado(6);

        Contatore contaMani = new Contatore(0, 1);
        while (g.saldo() > 0) {
            contaMani.conta();
            int lancioGiocatore = gDado.lancio();
            int lancioBanco = bDado.lancio();
            if (lancioGiocatore > lancioBanco) {
                g.vince();
            } else {
                g.perde();
            }
            System.out.println(contaMani.valoreCorrente()
                    + "-Risultato lancio: Giocatore->" + lancioGiocatore
                    + " ---- Banco->" + lancioBanco);
            g.stampa();
        }
    }
}
