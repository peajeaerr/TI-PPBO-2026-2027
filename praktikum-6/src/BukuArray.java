class BukuArray {
    public static void main(String[] args) {
        // Membuat Array of Objects berisi 4 buku
        Buku[] daftarBuku = new Buku[4];
        daftarBuku[0] = new Buku(" The Psychology of Money: Timeless lessons on wealth, greed, and happiness", " Morgan Housel", 2020);
        daftarBuku[1] = new Buku(" The Power of Habit: Why We Do What We Do in Life and Business", " Charles Duhigg", 2012);
        daftarBuku[2] = new Buku("Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones", "James Clear", 2018   );
        daftarBuku[3] = new Buku(" The Richest Man in Babylon", "• George S. Clason", 1926);

        System.out.println("=== BUKU YANG TERBIT SETELAH TAHUN 2015 ===");
        // Perulangan untuk mengecek tahun terbit
        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println("- " + daftarBuku[i].judul + " (" + daftarBuku[i].tahunTerbit + ")");
            }
        }
    }
}