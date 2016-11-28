/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione04;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class DemoParametri {
    
    public static void main(String[] args) {
        
        Bicycle bici = new Bicycle();
      
        bici.setSpeed(100);
        
        System.out.println("Bici: " + bici.getSpeed());
        
        Box box = new Box();
        
        box.setBici(bici);

        //Se stampo la velocità di bici quanto vale???
        System.out.println("Bici: " + bici.getSpeed());
        
        
    }
}
