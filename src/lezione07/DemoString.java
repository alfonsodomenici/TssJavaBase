/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07;

/**
 *
 * @author tss
 */
public class DemoString {

    public static void main(String[] args) {

        String s = "Salve!!";
        System.out.println(s.length());

        s.concat(" a tutti");
        
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Salve!!");
        sb.append(" a tutti");
        //System.out.println(sb.toString());
    }
}
