/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author hp
 */
public class TanggalF {
    public static void main(String[]args){
        Date tanggal = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        System.out.println("Sekarang tanggal:"+sdf.format(tanggal));
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 3); //menghitung 3 tahun kemudian setelah hari ini
        Date tigatahunlagi = cal.getTime();//membuat variabel yang bertipe data
        System.out.println("Tiga tahun lagi tanggal :"+sdf.format(tigatahunlagi));
     }
}
