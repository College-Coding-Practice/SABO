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
public class StringManip3 {
    public static void main(String[]args){
        String s="JOGJAKARTA";
        System.out.println("String s="+s);
        for (int i=0;i<s.length();i++)
            System.out.println("s.substring("+i+")="+s.substring(i));
    }
    
}
