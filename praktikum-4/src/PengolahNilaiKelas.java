import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);

        // Menentukan Nilai KKM di awal program (Ketentuan b)
        final double KKM = 70.0;

        // --- KETENTUAN A: INPUT DATA ---
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int n = input.nextInt();

        // Membuat array berukuran N untuk menyimpan nilai ujian
        double[] nilai = new double[n];

        // Membaca nilai masing-masing mahasiswa menggunakan for loop
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }

        // --- KETENTUAN B: PERHITUNGAN STATISTIK ---
        double total = 0;
        double nilaiTertinggi = nilai[0];
        double nilaiTerendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < n; i++) {
            // Menghitung total untuk rata-rata
            total += nilai[i];

            // Mencari nilai tertinggi
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            // Mencari nilai terendah
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }

            // Menghitung jumlah lulus dan tidak lulus berdasarkan KKM
            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Menghitung rata-rata kelas
        double rataRata = total / n;

        // --- KETENTUAN C: PENGURUTAN (BUBBLE SORT ASCENDING) ---
        // Membuat duplikat array untuk menampilkan data sebelum diurutkan
        double[] nilaiSebelumSort = new double[n];
        System.arraycopy(nilai, 0, nilaiSebelumSort, 0, n);

        // Algoritma Bubble Sort manual (Tanpa method bawaan Java)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    // Proses tukar posisi (swap)
                    double temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // --- KETENTUAN D: FORMAT LAPORAN ---
        System.out.println("\n=============================================");
        System.out.println("          LAPORAN PENGOLAHAN NILAI KELAS     ");
        System.out.println("=============================================");
        System.out.println("Jumlah Mahasiswa (N)    : " + n);
        System.out.println("Standar KKM             : " + KKM);
        System.out.println("---------------------------------------------");
        System.out.printf("Nilai Rata-rata Kelas   : %.2f\n", rataRata);
        System.out.println("Nilai Tertinggi         : " + nilaiTertinggi);
        System.out.println("Nilai Terendah          : " + nilaiTerendah);
        System.out.println("Jumlah Mahasiswa Lulus  : " + jumlahLulus + " orang");
        System.out.println("Jumlah Tidak Lulus      : " + jumlahTidakLulus + " orang");
        System.out.println("---------------------------------------------");

        // Menampilkan array sebelum diurutkan
        System.out.print("Nilai Sebelum Diurutkan : [");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiSebelumSort[i] + (i == n - 1 ? "" : ", "));
        }
        System.out.println("]");

        // Menampilkan array sesudah diurutkan
        System.out.print("Nilai Setelah Diurutkan : [");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + (i == n - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println("=============================================");

        input.close();
    }
}
