class Latihan5PersegiArray {
    public static void main(String[] args) {
        // Membuat Array of Objects berisi 4 ukuran sisi berbeda
        Persegi[] daftarPersegi = new Persegi[4];
        daftarPersegi[0] = new Persegi(3.0);  // Luas: 9.0
        daftarPersegi[1] = new Persegi(8.0);  // Luas: 64.0
        daftarPersegi[2] = new Persegi(5.5);  // Luas: 30.25
        daftarPersegi[3] = new Persegi(12.0); // Luas: 144.0

        // Inisialisasi persegi terbesar dengan elemen pertama
        Persegi persegiTerbesar = daftarPersegi[0];

        // Perulangan untuk mencari nilai maksimum luas
        for (int i = 1; i < daftarPersegi.length; i++) {
            if (daftarPersegi[i].hitungLuas() > persegiTerbesar.hitungLuas()) {
                persegiTerbesar = daftarPersegi[i];
            }
        }

        System.out.println("=== PERSEGI DENGAN LUAS TERBESAR ===");
        System.out.println("Ukuran Sisi : " + persegiTerbesar.sisi);
        System.out.println("Luas        : " + persegiTerbesar.hitungLuas());
    }
}