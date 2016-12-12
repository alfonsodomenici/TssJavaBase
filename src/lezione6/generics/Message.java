/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione6.generics;

/**
 *
 * @author tss
 */
public class Message {

    private String testo;

    public Message(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    @Override
    public String toString() {
        return "Message{" + "testo=" + testo + '}';
    }

}
