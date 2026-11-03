class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor berparameter menggunakan 'this'
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanData() {
        System.out.println("Judul        : " + this.judul);
        System.out.println("Pengarang    : " + this.pengarang);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        // Membuat 2 object berbeda
        Buku buku1 = new Buku("The Psychology of Money:", "Morgan Housel", 2020);
        Buku buku2 = new Buku(" Atomic Habits", " James Clear", 2018);

        // Menampilkan data
        System.out.println("=== DATA BUKU ===");
        buku1.tampilkanData();
        buku2.tampilkanData();
    }
}