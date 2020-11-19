/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116415.latihan44.hukumohm;

/**
 * Nama : MIA AISYAH F
 * Kelas: PBO-2
 * NIM  : 10116415
 *Deskripsi Program: program ini berisi program yang dapat menghitung hasil
 * tegangan dari kuat arus dan hambatan pada suatu aliran listrik
 */
public class PBO210116415Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float kuatArus;
        float hambatan;
        
        System.out.println("===Hukum Ohm===");
        System.out.println("pada ujung-ujung kawat penghantar tersebut" + "\n" 
        + "Kuat arus yang mengalir pada suatu kawat penghantar akan berbanding "
        + "\n" + "lurus dengan beda potensial" + "\n" + "asalkan suhu kawat"
        + "dijaga konstan.");
        
        Baterai btr = new Baterai();
        Baterai ohm = new Baterai(3,12);
        System.out.println("Kuat Arus : " + ohm.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + ohm.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + ohm.hitungTegangan()+ " volt");
    }
    
}
