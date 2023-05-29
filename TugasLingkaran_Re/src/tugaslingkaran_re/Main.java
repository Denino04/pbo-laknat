/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaslingkaran_re;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double jari;
        double tinggi;
        int jumlah;
        try (Scanner Input = new Scanner(System.in)) {
            System.out.println("Masukkan Jari-Jari : ");
            jari = Input.nextDouble();
            System.out.println("Masukkan Tinggi : ");
            tinggi = Input.nextDouble();
            System.out.println("Masukkan Jumlah Data : ");
            jumlah = Input.nextInt();
        }
        
        Lingkaran L1 = new Lingkaran();
        L1.setJari(jari);
        L1.keliling();L1.luas();
        System.out.println("Keliling Lingkaran = " + L1.hitungKelilingLingkaran());
        System.out.println("Luas Lingkaran = " + L1.hitungLuasLingkaran());        
        System.out.println("");
        
        Tabung T1 = new Tabung();
        T1.SetTinggi(tinggi);
        System.out.println("Luas Permukaan Tabung = " + T1.hitungLuasTabung());
        System.out.println("Volume Tabung = " + T1.hitungVolumeTabung());
        System.out.println("");
        
        int numberOfThreads = 5;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        
        for (int i = 0; i < jumlah; i++) {
            Bola bola = new Bola(i++);
            executor.execute(bola);
            Cincin C1 = new Cincin(i);
            C1.setTC(tinggi);
            executor.execute(C1);
            Juring J1 = new Juring(i);
            J1.SetTJ(tinggi);
            executor.execute(J1);
            Keratan K1 = new Keratan(i);
            K1.setTK(tinggi);
            executor.execute(K1);
            Tembereng T2 = new Tembereng(i);
            T2.SetTT(tinggi);
            executor.execute(T2);
            
        }
        for (int i = 0; i < 10; i++) {
            Kerucut kerucut = new Kerucut(i++);
            executor.execute(kerucut);
            KerucutTerpancung T3 = new KerucutTerpancung(i);
            T3.SetTinggi(tinggi);
            executor.execute(T3);   
        }
    }
                
}
