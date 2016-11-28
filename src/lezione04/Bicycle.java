/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione04;

/**
 *
 * @author tss
 */
public class Bicycle {

    private int speed;
    private int gear;
    private static int numeroDiIstanze;

    static{
        numeroDiIstanze = 0;
    }
    
    public Bicycle() {
        this(1, 1);
    }

    public Bicycle(int speed) {
        this(speed, 1);
    }

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        this.numeroDiIstanze++;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            return;
        }
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public static int getNumeroIstanzeCreate(){
        return numeroDiIstanze;
    }
}
