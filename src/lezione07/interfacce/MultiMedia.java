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
public interface MultiMedia {
   
   public static final String PLAYER="CD_PLAYER";
    
   public void play();
   public void stop();
   public void pause();
   
   default public void reset(){
       System.out.println(this.getClass() + "." + "reset()... di default...");
   }
   
   public static String version(){
       return "1.0";
   }
   
}
