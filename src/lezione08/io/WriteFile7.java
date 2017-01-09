/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author tss
 */
public class WriteFile7 {
    
    public static void main(String[] args) throws IOException {
        String source = "prima riga\nseconda riga\nterza riga\n";
        
        Files.write(Paths.get("/home/tss/nuovofile.txt"),
                source.getBytes(),
                StandardOpenOption.CREATE);
    }
}
