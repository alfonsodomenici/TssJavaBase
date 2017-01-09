/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07.interfacce;

/**
 *
 * @author tss
 */
public class DemoMultimedia {
    
    public static void main(String[] args) {
        
        System.out.println(MultiMedia.version());
        
        MultiMedia mm = new CdPlayer();
        
        
        MultiMedia mm1 = new Mp3Player();
        
        MultiMedia mm2 = new VideoPlayer();
        
        MultiMedia[] medias = new MultiMedia[3];
        medias[0] = mm;
        medias[1] = mm1;
        medias[2] = mm2;
        
        for (MultiMedia media : medias) {
            media.play();
            media.reset();
        }
    }
}
