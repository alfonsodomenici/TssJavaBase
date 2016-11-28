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
public class DemoOggetti {

    public static void main(String[] args) {

        Bicycle b1 = new Bicycle(10, 1);
        b1.getGear();
        Bicycle b2 = new Bicycle(10, 1);
        if (b1 == b2) {
            System.out.println("uguali");
        } else {
            System.out.println("diversi");
        }

        Bicycle b3 = new Bicycle();

        System.out.println("Numero istanze create: "
                + Bicycle.getNumeroIstanzeCreate());

        System.out.println(Matematica.somma(12, 14));

    }
}
