/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione5;

/**
 *
 * @author tss
 */
public class DemoPersona {

    public static void main(String[] args) {
        
        Autista a = new Autista("mario", "rossi","B");
        Persona p = new Persona("giuseppe", "verdi");
        Object[] persone = new Object[2];
        persone[0]=a;
        persone[1]=p;
        stampa(persone);
    }
    
    public static void stampa(Object[] anagrafica){
        
        for (Object o : anagrafica) {
            System.out.println(o.toString());
        }
    }
}
