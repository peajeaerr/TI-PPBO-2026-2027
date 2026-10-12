import java.util.Scanner;

public class CariMinMaxArray {
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int nilai : data) {
            if (nilai < min) min = nilai;
        }
        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) max = nilai;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] nilaiUjian = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiUjian[i] = input.nextInt();
        }

        System.out.println("Nilai Minimum: " + cariNilaiMinimum(nilaiUjian));
        System.out.println("Nilai Maksimum: " + cariNilaiMaksimum(nilaiUjian));
    }
}
