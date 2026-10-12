import java.util.Scanner;

public class KalkulatorMethod {

    // A. METHOD OPERASI STATIS
    static double tambah(double a, double b) {
        return a + b;
    }

    // C. OVERLOADING METHOD TAMBAH (3 Parameter)
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            return 0;
        }
        return a / b;
    }

    static double pangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    static double akarKuadrat(double angka) {
        if (angka < 0) {
            System.out.println("Error: Nilai tidak boleh negatif!");
            return 0;
        }
        return Math.sqrt(angka);
    }

    // D. METHOD MENCARI NILAI MAKSIMUM RIWAYAT
    static double riwayatKeMaksimum(double[] riwayatHasil, int jumlahData) {
        if (jumlahData == 0) return 0;
        double max = riwayatHasil[0];
        for (int i = 1; i < jumlahData; i++) {
            if (riwayatHasil[i] > max) {
                max = riwayatHasil[i];
            }
        }
        return max;
    }

    // B. MENU UTAMA DI METHOD MAIN
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array tampung riwayat kapasitas hingga 100 kalkulasi
        double[] riwayat = new double[100];
        int hitungRiwayat = 0;
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== MENU KALKULATOR METHOD ===");
            System.out.println("1. Tambah (2 Angka)");
            System.out.println("2. Tambah Overloading (3 Angka)");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar");
            System.out.print("Pilih opsi (1-8): ");
            int pilihan = input.nextInt();

            double hasil = 0;
            boolean simpanHasil = true;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka ke-1: ");
                    double t1 = input.nextDouble();
                    System.out.print("Masukkan angka ke-2: ");
                    double t2 = input.nextDouble();
                    hasil = tambah(t1, t2);
                    System.out.println("Hasil Tambah: " + hasil);
                    break;
                case 2:
                    System.out.print("Masukkan angka ke-1: ");
                    double to1 = input.nextDouble();
                    System.out.print("Masukkan angka ke-2: ");
                    double to2 = input.nextDouble();
                    System.out.print("Masukkan angka ke-3: ");
                    double to3 = input.nextDouble();
                    hasil = tambah(to1, to2, to3);
                    System.out.println("Hasil Tambah (3 Parameter): " + hasil);
                    break;
                case 3:
                    System.out.print("Masukkan angka ke-1: ");
                    double k1 = input.nextDouble();
                    System.out.print("Masukkan angka ke-2: ");
                    double k2 = input.nextDouble();
                    hasil = kurang(k1, k2);
                    System.out.println("Hasil Kurang: " + hasil);
                    break;
                case 4:
                    System.out.print("Masukkan angka ke-1: ");
                    double kl1 = input.nextDouble();
                    System.out.print("Masukkan angka ke-2: ");
                    double kl2 = input.nextDouble();
                    hasil = kali(kl1, kl2);
                    System.out.println("Hasil Kali: " + hasil);
                    break;
                case 5:
                    System.out.print("Masukkan angka pembilang: ");
                    double b1 = input.nextDouble();
                    System.out.print("Masukkan angka penyebut: ");
                    double b2 = input.nextDouble();
                    hasil = bagi(b1, b2);
                    if (b2 != 0) System.out.println("Hasil Bagi: " + hasil);
                    else simpanHasil = false;
                    break;
                case 6:
                    System.out.print("Masukkan angka basis: ");
                    double p1 = input.nextDouble();
                    System.out.print("Masukkan angka eksponen (pangkat): ");
                    double p2 = input.nextDouble();
                    hasil = pangkat(p1, p2);
                    System.out.println("Hasil Pangkat: " + hasil);
                    break;
                case 7:
                    System.out.print("Masukkan angka: ");
                    double ak = input.nextDouble();
                    hasil = akarKuadrat(ak);
                    if (ak >= 0) System.out.println("Hasil Akar Kuadrat: " + hasil);
                    else simpanHasil = false;
                    break;
                case 8:
                    berjalan = false;
                    simpanHasil = false;
                    System.out.println("Keluar dari program.");
                    if (hitungRiwayat > 0) {
                        double nilaiTerbesar = riwayatKeMaksimum(riwayat, hitungRiwayat);
                        System.out.println("Hasil perhitungan terbesar yang pernah dilakukan: " + nilaiTerbesar);
                    } else {
                        System.out.println("Belum ada riwayat perhitungan.");
                    }
                    break;
                default:
                    simpanHasil = false;
                    System.out.println("Pilihan tidak valid!");
            }

            // Simpan setiap hasil perhitungan ke array riwayat
            if (simpanHasil && hitungRiwayat < riwayat.length) {
                riwayat[hitungRiwayat] = hasil;
                hitungRiwayat++;
            }
        }
    }
}
