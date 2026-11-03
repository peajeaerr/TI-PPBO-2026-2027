public class Buku {
    // Latihan 1: Mengubah seluruh atribut menjadi private
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    // Constructor berparameter tetap dipertahankan
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Latihan 1: Menambahkan getter untuk masing-masing atribut
    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Latihan 2: Menambahkan setter untuk judul dan pengarang saja (tahunTerbit tidak dibuatkan)
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
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
