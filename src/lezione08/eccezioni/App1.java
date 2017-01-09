/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.eccezioni;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class App1 {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        GestoreFile.scrivi1("/tmp/prova/xx.txt", new ArrayList<>());
        
        //GestoreFile.scrivi2("/tmp/prova/xx.txt", new ArrayList<>());
        
    }
}
