/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.io;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author tss
 */
public class CopyFile7 {
    
    public static void main(String[] args) throws IOException {
        
        Files.copy(
                Paths.get("/home/tss/scrivi.txtSDAD"),
                Paths.get("/home/tss/copia1.txt"),
                StandardCopyOption.REPLACE_EXISTING);
    }
}
