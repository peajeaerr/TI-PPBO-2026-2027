import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int c = input.nextInt();

        int terbesar;

        // Menggunakan if-else bertingkat
        if (a >= b && a >= c) {
            terbesar = a;
        } else if (b >= a && b >= c) {
            terbesar = b;
        } else {
            terbesar = c;
        }

        System.out.println("Bilangan terbesar di antara ketiganya adalah: " + terbesar);
    }
}
