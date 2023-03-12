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
public class Counter {
    long count = 0;
    public void add(long value){
    synchronized (this) {
    this.count += value;
    System.out.println(count);
    }
    }
}

