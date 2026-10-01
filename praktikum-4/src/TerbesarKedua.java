import java.util.Scanner;

public class TerbesarKedua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] nilai = new int[n];

        System.out.println("Masukkan nilai-nilainya:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Logika mencari terbesar pertama dan kedua
        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nilai[i] > terbesar) {
                terbesarKedua = terbesar;
                terbesar = nilai[i];
            } else if (nilai[i] > terbesarKedua && nilai[i] != terbesar) {
                terbesarKedua = nilai[i];
            }
        }

        // REVISI: Hanya menampilkan nilai terbesar kedua saja
        System.out.println("\nNilai Terbesar KEDUA: " + terbesarKedua);

        input.close();
    }
}
