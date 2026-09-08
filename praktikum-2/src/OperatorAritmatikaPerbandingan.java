import java.util.Scanner;

public class OperatorAritmatikaPerbandingan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dua bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();


        // 1. Menampilkan Hasil Operator Aritmatika
        System.out.println("\n=== HASIL ARITMATIKA ===");
        System.out.println(bil1 + " + " + bil2 + " = " + (bil1 + bil2));
        System.out.println(bil1 + " - " + bil2 + " = " + (bil1 - bil2));
        System.out.println(bil1 + " * " + bil2 + " = " + (bil1 * bil2));
        // Catatan: Pembagian int menghasilkan bilangan bulat (truncation)
        System.out.println(bil1 + " / " + bil2 + " = " + (bil1 / bil2));
        System.out.println(bil1 + " % " + bil2 + " = " + (bil1 % bil2));

        // 2. Menampilkan Hasil Operator Perbandingan (Output berupa boolean)
        System.out.println("\n=== HASIL PERBANDINGAN ===");
        System.out.println(bil1 + " > " + bil2 + "  : " + (bil1 > bil2));
        System.out.println(bil1 + " < " + bil2 + "  : " + (bil1 < bil2));
        System.out.println(bil1 + " == " + bil2 + " : " + (bil1 == bil2));

        input.close();
    }
}