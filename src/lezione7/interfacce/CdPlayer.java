/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione7.interfacce;

/**
 *
 * @author tss
 */
public class CdPlayer implements MultiMedia {

    @Override
    public void play() {
        System.out.println(this.getClass() + ".play()...");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + ".stop()...");
    }

    @Override
    public void pause() {
        System.out.println(this.getClass() + ".pause()...");
    }

    public static void work(){
        System.out.println("work()");
    }
}
