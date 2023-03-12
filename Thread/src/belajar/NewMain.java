/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

/**
 *
 * @author edi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SynchronizedMethod thread1 = new SynchronizedMethod();
        SynchronizedMethod thread2 = new SynchronizedMethod();
        thread1.start();
        thread2.start();
        boolean t1IsAlive = true;
        boolean t2IsAlive = true;
        do {
        if (t1IsAlive && !thread1.isAlive()) {
        t1IsAlive = false;
        System.out.println();
        }
        if (t2IsAlive && !thread2.isAlive()) {
        t2IsAlive = false;
        System.out.println();
        }
        } while (t1IsAlive || t2IsAlive);
        }

}
