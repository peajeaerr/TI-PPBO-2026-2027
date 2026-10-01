import java.util.Scanner;

public class PolaKarakter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi/ukuran pola: ");
        int ukuran = input.nextInt();

        // 1. Pola Segitiga Terbalik
        System.out.println("\n--- Pola Segitiga Terbalik ---");
        for (int i = ukuran; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Pola Persegi
        System.out.println("\n--- Pola Persegi ---");
        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
