package tugas8;

import java.util.Scanner;

public class TokoSerbaAda {

    public static void main(String[] args) {
        String[] kode = new String[10];
        String[] barang = new String[10];
        int[] harga = new int[10];
        int[] jumlah_beli = new int[10];
        int[] jumlah_bayar = new int[10];
        int total_bayar = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukan Item Barang : ");
        int data = input.nextInt();

        for (int i = 0; i < data; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode        : ");
            kode[i] = input.next();
            System.out.print("Masukkan Jumlah Beli : ");
            jumlah_beli[i] = input.nextInt();

            // Pemrosesan barang di dalam loop
            switch (kode[i]) {
                case "a001":
                    barang[i] = "Buku";
                    harga[i] = 3000;
                    break;
                case "a002":
                    barang[i] = "Pensil";
                    harga[i] = 4000;
                    break;
                case "a003":
                    barang[i] = "Pulpen";
                    harga[i] = 5000;
                    break;
                default:
                    System.out.println("Kode Barang Tidak Tersedia");
                    break;
            }

            jumlah_bayar[i] = harga[i] * jumlah_beli[i];
            total_bayar += jumlah_bayar[i];
        }

        System.out.println("");
        System.out.println("TOKO SERBA ADA");
        System.out.println("***********************");
        System.out.println("No    Kode Barang    Nama Barang     Harga    Jumlah Beli     Jumlah Bayar");
        System.out.println("============================================================================");
        for (int i = 0; i < data; i++) {
            System.out.printf("%-5s %-15s %-15s %-10d %-14d %-12d%n",
                    i + 1, kode[i], barang[i], harga[i], jumlah_beli[i], jumlah_bayar[i]);
        }
        System.out.println("============================================================================");

        System.out.printf("Total Bayar            %d%n", total_bayar);
        System.out.println("============================================================================");

    }
}
