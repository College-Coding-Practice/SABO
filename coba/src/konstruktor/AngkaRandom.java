/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktor;

/**
 *
 * @author hp
 */
public class AngkaRandom {
    public static void main(String[]args){
        /** Akan mengembalikan nilai 0 <== angka random < 5 */
        System.out.println("Angka random integer antara 0 dan 5 adalah "+(int)(Math.random()*5));
        /** Akan mengemblaikan nilai 5 <== angka random < (5+10) */
        System.out.println("Angka random integer antara 5 dan 15 adalah "+(5+(int)(Math.random()*10)));
    }
    
}
