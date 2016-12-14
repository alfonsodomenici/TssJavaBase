/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione7;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import lezione6.ordinamento.*;
import org.apache.commons.io.FileSystemUtils;
import util.DateFunction;
import util.LibreriaFunzioniArray;

/**
 *
 * @author tss
 */
public class DemoOrdinaArray {

    public static void main(String[] args) throws ParseException, IOException {

        //crea array di persone
        Persona[] persone = new Persona[3];
        persone[0] = new Persona("Mario", "Rossi");
        persone[1] = new Persona("Silvio", "Bianchi");
        persone[2] = new Persona("Marco", "Antonio");

        //stampa array 
        LibreriaFunzioniArray.stampa(persone);

        //richiama metodo ordina passando l'array di persone
        LibreriaFunzioniArray.ordina(persone);

        //stampa array ordinato
        LibreriaFunzioniArray.stampa(persone);
        
        Messaggio[] messaggi = new Messaggio[3];
        messaggi[0] = new Messaggio("ciao");
        messaggi[1] = new Messaggio("arrivederci");
        messaggi[2] = new Messaggio("bye");
        
        LibreriaFunzioniArray.stampa(messaggi);
        
        LibreriaFunzioniArray.ordina(messaggi);
        
        LibreriaFunzioniArray.stampa(messaggi);
        
        System.out.println(LibreriaFunzioniArray.
                cerca(persone, new Persona("Silvio", "Bianchiii")));
        
        System.out.println(LibreriaFunzioniArray.
                cerca(messaggi, new Messaggio("ciao")));
        
        System.out.println(DateFunction.convert(new Date()));
        
        System.out.println(DateFunction.convert("01/01/2010"));
        
        System.out.println(FileSystemUtils.freeSpaceKb());
    }

    

    

}
