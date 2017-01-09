/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05;

import java.util.Arrays;

/**
 *
 * @author tss
 */
public class DemoEquals {

    public static void main(String[] args) {

        Autista p = new Autista("mario", "rossi", "C");

        Autista a = new Autista("pippo", "verdi", "C");

        Autista daCercare = new Autista("pippo", "verdi", "C");

        Object[] persone = new Object[2];
        persone[0] = a;
        persone[1] = p;

        //DemoEquals demo = new DemoEquals();
        //int risultato =demo.cerca(persone, daCercare);
        int risultato = cerca(persone, daCercare);
        System.out.println(risultato);
        
    }

    /**
     * Ricerca un elemento all'interno di un vettore e ritorna l'indice della
     * prima occorrenza trovata
     *
     * @param anagrafica vettore dove ricercare
     * @param elemento elemento da cercare all'interno del vettore
     * @return indice dell'elemento se trovato, altrimenti -1
     */
    public static int cerca(Object[] anagrafica, Object elemento) {
        for (int i = 0; i < anagrafica.length; i++) {
            if (anagrafica[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
