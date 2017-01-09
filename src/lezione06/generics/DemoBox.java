/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tss
 */
public class DemoBox {

    public static void main(String[] args) {

        Box<Persona> box = new Box<>(new Persona("xx", "yy"));
        Persona p = box.getObject();
        
        Box<Message> box1 = new Box<>(new Message("Ciao"));
        Message msg = box1.getObject();
                
        List<Persona> persone = new ArrayList<>();
    }
}
