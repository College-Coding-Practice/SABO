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
public class ThreadRunnable implements Runnable{
    Thread runner;
    public ThreadRunnable()
    {
    }
    public ThreadRunnable(String threadName)
    {
    runner = new Thread(this, threadName);
    System.out.println(runner.getName());
    runner.start();
    }
    public void run() {
    System.out.println(Thread.currentThread());
    }
}
