/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokoserbaada_Gagas3F;
///Gagas Cahya Kamajengan
///3F Informatika
///2310311700018

import java.util.Scanner;

/**
 *
 * @author USER
 */public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] kodeBarang = {"a001", "a002", "a003", "a004", "a005"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen", "Spidol", "Penghapus"};
        int[] hargaBarang = {3000, 4000, 5000, 6000, 2000};
        
        System.out.print("Masukkan item barang : ");
        int jumlahBeli = input.nextInt();
        
        String[] beliKodeBarang = new String[jumlahBeli];
        int[] beliJumlah = new int[jumlahBeli];
        int[] beliHarga = new int[jumlahBeli];
        String[] beliNamaBarang = new String[jumlahBeli];
        int totalBayar = 0;

        for (int i = 0; i < jumlahBeli; i++) {
            System.out.println("-> Data ke " + (i + 1) +  ":");
            
            System.out.print("Masukkan Kode         : ");
            String kode = input.next();
            beliKodeBarang[i] = kode;
            
            boolean found = false;
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kode.equals(kodeBarang[j])) {
                    beliNamaBarang[i] = namaBarang[j];
                    beliHarga[i] = hargaBarang[j];
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Kode barang yang diinput ga ada!");
                i--;
                continue;
            }
            
            System.out.print("Masukkan jumlah beli  : ");
            beliJumlah[i] = input.nextInt();
            totalBayar += beliHarga[i] * beliJumlah[i];
        }
        
        System.out.println("\n    TOKO SERBA ADA");
        System.out.println("***********************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("=================================================================");
        for (int i = 0; i < jumlahBeli; i++) {
            System.out.printf("%-4d%-13s%-13s%-7d%-13d%-12d\n", 
                              (i + 1), beliKodeBarang[i], beliNamaBarang[i], beliHarga[i], 
                              beliJumlah[i], beliHarga[i] * beliJumlah[i]);
        }
        System.out.println("==================================================================");
        System.out.println("Total Bayar :                                      " + totalBayar);
        System.out.println("===================================================================");
        
    }
 }
