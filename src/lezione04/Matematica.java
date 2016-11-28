/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione04;

/**
 *
 * @author tss
 */
public class Matematica {

    public static final double PI_COSTANTE = Math.PI;

    private Matematica() {
    }

    //metodo con varargs
    public static long somma(int... numeri) {

        long risultato = 0;
        for (int i = 0; i < numeri.length; i++) {
            risultato += numeri[i];
        }
        return risultato;
    }

    //equivalente
    public static long sommaDiversa(int[] numeri) {
        return 0;
    }
}
