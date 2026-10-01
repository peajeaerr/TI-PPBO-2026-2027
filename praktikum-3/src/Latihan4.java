import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();
        System.out.print("Apakah Anda mahasiswa? (true/false): ");
        boolean isMahasiswa = input.nextBoolean();

        int hargaTiket;

        // Gabungan if-else dan operator logika (Mahasiswa DAN umur di bawah 25 tahun dapat harga khusus)
        if (isMahasiswa && umur < 25) {
            hargaTiket = 25000; // Harga khusus diskon
            System.out.println("Selamat, Anda mendapatkan harga khusus mahasiswa!");
        } else {
            hargaTiket = 50000; // Harga normal
        }

        System.out.println("Harga tiket bioskop Anda: Rp " + hargaTiket);
    }
}
