import java.util.Scanner;

public class MatriksInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriks = new int[3][3];
        int totalSeluruh = 0;

        // Input data matriks
        System.out.println("Masukkan elemen matriks 3x3:");
        for (int b = 0; b < 3; b++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("Matriks[" + b + "][" + k + "]: ");
                matriks[b][k] = input.nextInt();
            }
        }

        System.out.println("\n--- Hasil Analisis Matriks ---");
        // Hitung jumlah per baris
        for (int b = 0; b < 3; b++) {
            int jumlahBaris = 0;
            for (int k = 0; k < 3; k++) {
                System.out.print(matriks[b][k] + " ");
                jumlahBaris += matriks[b][k];
                totalSeluruh += matriks[b][k];
            }
            System.out.println("-> Jumlah Baris ke-" + (b + 1) + ": " + jumlahBaris);
        }

        System.out.println("Total seluruh elemen matriks: " + totalSeluruh);
        input.close();
    }
}
