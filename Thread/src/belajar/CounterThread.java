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
public class CounterThread extends Thread{
    protected Counter counter = null;
    public CounterThread(Counter counter){
    this.counter = counter;
    }
    public void run() {
    for(int i=0; i<10; i++){
    counter.add(i);
    }
    }
}
