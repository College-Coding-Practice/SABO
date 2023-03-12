/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktor;

import java.util.HashMap;

/**
 *
 * @author hp
 */
public class CobaHashMap2 {
    public static void main(String[]args){
        //membuat objek hasmap
        HashMap<Integer, String> days = new HashMap<Integer, String>();
        
        //mengisi nilai ke objek days
        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");
        
        //mengubah hari minggu menjadi hari ahad
        days.put(1, "Ahad");
        //mengubah hari rabu menjadi hari rabo
        days.put(4, "Rabo");
        //mencetak semua isi dari objek days
        System.out.println("Isi objek days:"+days);
    }
}
