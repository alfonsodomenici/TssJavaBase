/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.eccezioni;

import java.util.Arrays;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {

        String[] righe = {"ciao a tutti.", "Tra poco caffè", "Ci vediamo più tardi"};
        
        try {
            GestoreFile.scrivi1("/tmp/prova/scrivi.txt", Arrays.asList(righe));
            
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Qualcosa è andato storto....");
            System.out.println(ex.getClass());
        }
    }

}
