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
public class ExThread extends Thread{
    public ExThread()
    {
    }
    public ExThread(String threadName)
    {
    super(threadName);
    System.out.println(this);
    }
    public void run()
    {
    System.out.println(Thread.currentThread().getName());
    }
}
