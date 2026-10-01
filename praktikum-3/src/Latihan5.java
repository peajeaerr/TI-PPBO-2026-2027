import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan tinggi badan (meter, contoh 1.70): ");
        double tinggi = input.nextDouble();

        // Menghitung BMI = berat / (tinggi * tinggi)
        double bmi = berat / (tinggi * tinggi);
        System.out.printf("Skor BMI Anda: %.2f\n", bmi);

        // Menggunakan if-else bertingkat sesuai rentang standar
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Kategori: Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }
}
