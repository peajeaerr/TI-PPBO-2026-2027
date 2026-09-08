import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input suhu Celsius dari user
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();

        // Menghitung konversi menggunakan rumus: F = C * 9/5 + 32
        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;

        // Menampilkan hasil
        System.out.println("Hasil konversi ke Fahrenheit: " + fahrenheit);

        input.close();
    }
}
