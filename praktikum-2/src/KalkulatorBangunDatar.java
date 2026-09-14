/*
 * Nama          : FAJAR ADHARI
 * NIM           : 2025573010010
 * Program Studi : TEKNIK INFORMATIKA
 * Deskripsi     : Program kalkulator bangun datar untuk menghitung luas
 *                 dan keliling persegi panjang serta lingkaran.
 */

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- PERSEGI PANJANG ---
        System.out.println("=== KELOLA PERSEGI PANJANG ===");
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        // Hitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        // Tampilkan hasil persegi panjang
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);


        // --- LINGKARAN ---
        System.out.println("\n=== KELOLA LINGKARAN ===");
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        // Hitung luas dan keliling lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * r * r;
        double kelilingLingkaran = 2 * Math.PI * r;

        // Tampilkan hasil lingkaran
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);


        // --- EVALUASI LUAS ---
        // Simpan hasil evaluasi luas ke variabel boolean luasBesar jika luas > 100
        boolean luasBesar = luasPersegiPanjang > 100;
        System.out.println("\nApakah Luas Persegi Panjang > 100? : " + luasBesar);

        input.close();
    }
}
