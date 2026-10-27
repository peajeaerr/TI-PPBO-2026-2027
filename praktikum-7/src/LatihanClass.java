public class LatihanClass {
    public static void main(String[] args) {
        // --- KODE DARI FOTO MODUL (LANGKAH 1 & LANGKAH 3) ---
        Mahasiswa m1 = new Mahasiswa("Budi", "111", 3.5);

        // Baris ini akan menyebabkan error kompilasi: 'ipk has private access in Mahasiswa'
        m1.ipk = 9.9;

        // Baris ini juga akan memicu error serupa karena atribut nim sudah bersifat private
        m1.nim = "";

        System.out.println(m1.ipk);


        // --- KODE UNTUK MAHASISWA SITI ---
        Mahasiswa m2 = new Mahasiswa("Siti", "67890", 3.90);
        m2.tampilkanData();
        System.out.println("Cumlaude? " + m2.isCumlaude());
    }
}
