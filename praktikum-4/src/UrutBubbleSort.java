import java.util.Scanner;

public class UrutBubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] data = new int[n];

        System.out.println("Masukkan nilai-nilainya:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        // Cetak sebelum diurutkan
        System.out.print("\nSebelum diurutkan : ");
        for (int val : data) System.out.print(val + " ");

        // Algoritma Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // Tukar posisi data
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        // Cetak sesudah diurutkan
        System.out.print("\nSesudah diurutkan : ");
        for (int val : data) System.out.print(val + " ");
        System.out.println();
        input.close();
    }
}
