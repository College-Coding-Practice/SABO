/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masedi;

/**
 *
 * @author hp
 */
public class StringManip1 {
    public static void main (String[]args){
        String s="JOGJAKARTA";
        int n=s.length();
        for(int i=0;i<n;i++)
            System.out.println("karakter ke-"+i+"="+s.charAt(i));
    }
    
}
