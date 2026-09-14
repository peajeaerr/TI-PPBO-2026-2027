import java.util.Scanner;

public class LatihanOperasi {
    public static void main(String[] args) {
        // 1. Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Membaca dua bilangan bulat
        System.out.print("Masukkan bilangan bulat pertama: ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan bilangan bulat kedua: ");
        int bil2 = input.nextInt();

        // 2. Menampilkan hasil seluruh operator aritmatika (+, -, *, /, %)
        System.out.println("\n=== HASIL OPERATOR ARITMATIKA ===");
        System.out.println(bil1 + " + " + bil2 + " = " + (bil1 + bil2));
        System.out.println(bil1 + " - " + bil2 + " = " + (bil1 - bil2));
        System.out.println(bil1 + " * " + bil2 + " = " + (bil1 * bil2));

        // Antisipasi error pembagian dengan nol (division by zero)
        if (bil2 != 0) {
            // Pembagian antar integer (int) akan menghasilkan pembulatan ke bawah
            System.out.println(bil1 + " / " + bil2 + " = " + (bil1 / bil2));
            System.out.println(bil1 + " % " + bil2 + " = " + (bil1 % bil2));
        } else {
            System.out.println(bil1 + " / " + bil2 + " = Tidak terdefinisi (pembagian dengan nol)");
            System.out.println(bil1 + " % " + bil2 + " = Tidak terdefinisi (modulus dengan nol)");
        }

        // 3. Menampilkan hasil perbandingan (>, <, ==) dalam bentuk boolean
        System.out.println("\n=== HASIL PERBANDINGAN (BOOLEAN) ===");
        System.out.println(bil1 + " > " + bil2 + "  : " + (bil1 > bil2));
        System.out.println(bil1 + " < " + bil2 + "  : " + (bil1 < bil2));
        System.out.println(bil1 + " == " + bil2 + " : " + (bil1 == bil2));

        // Menutup scanner
        input.close();
    }
}
