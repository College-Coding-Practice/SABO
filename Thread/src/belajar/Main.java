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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread threadSatu = new Thread();
        Thread threadDua = new Thread();
        Thread threadTiga = new Thread();
        Thread threadEmpat = new Thread();
        Thread threadLima = new Thread ();
        threadSatu.start();
        threadDua.start();
        threadTiga.start();
        threadEmpat.start();
        try {
        Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread());
        }
    
}
