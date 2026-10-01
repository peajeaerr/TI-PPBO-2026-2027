import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {900
        // Membuat objek Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        // KETENTUAN 3: Konstanta tarif per kWh berdasarkan peraturan PLN umum
        final double TARIF_450 = 415.0;
        final double TARIF_900 = 1352.0;
        final double TARIF_1300 = 1444.70;
        final double TARIF_2200 = 1444.70;
        final double TARIF_ATAS_2200 = 1699.53;

        // Variabel penampung hasil
        double tarifPerKwh = 0;
        boolean golonganValid = true;

        // KETENTUAN 1: Membaca input golongan daya listrik
        System.out.println("Pilihan Golongan Daya Listrik (VA):");
        System.out.println("- 450");
        System.out.println("- 900");
        System.out.println("- 1300");
        System.out.println("- 2200");
        System.out.println("- 3500 (untuk pilihan di atas 2200)");
        System.out.print("Masukkan golongan daya listrik Anda: ");
        int daya = input.nextInt();

        // KETENTUAN 2: Membaca input jumlah pemakaian listrik dalam kWh
        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        double kwh = input.nextDouble();

        // KETENTUAN 4: Validasi input kWh menggunakan operator logika (<= 0)
        if (kwh <= 0) {
            System.out.println("\n[ERROR] Input kWh salah! Pemakaian harus lebih besar dari nol.");
            golonganValid = false; // Program menolak menghitung
        }

        // KETENTUAN 3: Menentukan tarif menggunakan switch-case jika input kWh valid
        if (golonganValid) {
            switch (daya) {
                case 450:
                    tarifPerKwh = TARIF_450;
                    break;
                case 900:
                    tarifPerKwh = TARIF_900;
                    break;
                case 1300:
                    tarifPerKwh = TARIF_1300;
                    break;
                case 2200:
                    tarifPerKwh = TARIF_2200;
                    break;
                default:
                    // Jika daya di atas 2200
                    if (daya > 2200) {
                        tarifPerKwh = TARIF_ATAS_2200;
                    } else {
                        System.out.println("\n[ERROR] Golongan daya tidak terdaftar!");
                        golonganValid = false;
                    }
                    break;
            }
        }

        // KETENTUAN 5: Menampilkan hasil akhir jika semua input valid
        if (golonganValid) {
            // Menghitung total tagihan
            double totalTagihan = kwh * tarifPerKwh;

            System.out.println("\n=============================================");
            System.out.println("             Rincian Tagihan Listrik         ");
            System.out.println("=============================================");
            System.out.println("Golongan Daya  : " + daya + " VA");
            System.out.println("Jumlah kWh     : " + kwh + " kWh");
            System.out.printf("Tarif per kWh  : Rp %.2f\n", tarifPerKwh);
            System.out.println("---------------------------------------------");
            System.out.printf("Total Tagihan  : Rp %.2f\n", totalTagihan);
            System.out.println("=============================================");
        }

        input.close();
    }
}
