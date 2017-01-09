/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author tss
 */
public class ReadFile7 {
    
    public static void main(String[] args) throws IOException {
        
        List<String> righe = 
                Files.readAllLines(Paths.get("/home/tss/scrivi.txt"));
        for (String riga : righe) {
            System.out.println(riga);
        }
    }
}
