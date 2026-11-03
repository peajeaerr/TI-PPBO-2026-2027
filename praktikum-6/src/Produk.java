class Produk {
    String namaProduk;
    double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Method mengecek apakah harga melebihi batasHarga[cite: 1]
    public boolean isMahal(double batasHarga) {
        return this.harga > batasHarga;
    }

    public static void main(String[] args) {
        Produk laptop = new Produk("Laptop Gaming", 15000000);
        double batas = 10000000;

        System.out.println("Nama Produk : " + laptop.namaProduk);
        // Menggunakan String.format %.0f agar angka tampil utuh tanpa E
        System.out.println("Harga       : Rp " + String.format("%.0f", laptop.harga));
        System.out.println("Batas Harga : Rp " + String.format("%.0f", batas));

        if (laptop.isMahal(batas)) {
            System.out.println("Status      : Produk ini MAHAL (melebihi batas harga).");
        } else {
            System.out.println("Status      : Produk ini TERJANGKAU.");
        }
    }
}