/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masedi;
import java.io.*;
/**
 *
 * @author hp
 */
public class ArrayTwo {
    public static void main(String[]args){
        String[][] Kata={ {"ONE", "SATU"},
                          {"COW", "SAPI"},
                          {"RUN", "LARI"},
                          {"RED", "MERAH"},
                          {"MAN", "ORANG"} };
        String KataDicari=bacaString();
        int k=-1;
        for (int i=0;i<5;i++)
if (Kata[i][0].equals(KataDicari))k=i;
        //cek ketemu atau tidak, jika k=-1 tidak ketemu
        if (k==(-1))
System.out.println("KATA TERSEBUT TIDAK ADA");
        else
System.out.println("KATA INDONESIA="+Kata[k][1]);
        }
private static String bacaString(){
System.out.print("MASUKKAN KATA:");
        int n=0; String s="";
        try{while(n!=10){
n=System.in.read();
        if(n!=10)s+=(char)n;
}
}catch(IOException ice){int a=0;};
        return s;
    }
    
}//end of class
