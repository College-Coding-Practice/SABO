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
public class SynchronizedMethod extends Thread{
    static String[] msg = {};
    public SynchronizedMethod(String id)
    {
    super(id);
    }

    SynchronizedMethod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void randomWait() {
    try {
    Thread.currentThread().sleep(10);
    } catch (InterruptedException e) {
    System.out.println();
    }}
    public synchronized void run() {
    SynchronizedOutput.displayList(getName(), msg);
    }
}
