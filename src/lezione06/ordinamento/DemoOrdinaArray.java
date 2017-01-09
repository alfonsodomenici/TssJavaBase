/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06.ordinamento;

/**
 *
 * @author tss
 */
public class DemoOrdinaArray {

    public static void main(String[] args) {

        //crea array di persone
        Persona[] persone = new Persona[3];
        persone[0] = new Persona("Mario", "Rossi");
        persone[1] = new Persona("Silvio", "Bianchi");
        persone[2] = new Persona("Marco", "Antonio");

        //stampa array 
        stampa(persone);

        //richiama metodo ordina passando l'array di persone
        ordina(persone);

        //stampa array ordinato
        stampa(persone);
    }

    private static void stampa(Persona[] persone) {
        System.out.println("--------STAMPA---------------");
        for (Persona persona : persone) {
            System.out.println(persona);
        }
        System.out.println("--------FINE STAMPA---------------");
    }

    /**
     * Ordinamento con BubbleSort
     * 
     * @param persone 
     */
    private static void ordina(Persona[] persone) {

        boolean disordinato;

        do {
            disordinato = false;
            for (int i = 0; i < persone.length - 1; i++) {
                Persona p = persone[i];
                Persona pNext = persone[i + 1];
                if (p.compareTo(pNext) >= 0) {
                    //scambio
                    persone[i] = pNext;
                    persone[i + 1] = p;
                    disordinato = true;
                }
            }
        } while (disordinato);
    }

}
