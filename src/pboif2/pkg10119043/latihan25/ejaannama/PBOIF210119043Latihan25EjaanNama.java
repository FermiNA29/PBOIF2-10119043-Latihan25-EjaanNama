/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program mengeja nama
 */
public class PBOIF210119043Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    
    public static void inputNama() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama depan anda untuk di eja : ");
        String nama = scanner.nextLine();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama depan anda untuk di eja : ");
        String nama = scanner.nextLine();
        String[] kata = nama.split("(?<=\\G.{1})"); //delimiter memecah huruf
        System.out.println();
        System.out.println("Ejaan untuk \"" + nama + "\" adalah : ");
        for(int i=0; i<kata.length; i++) {
            System.out.println("Huruf ke-"+ (i+1) +" : "+kata[i]);
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
    }
    
}
