public class MethodParameter {
    // LANGKAH 2: Method dengan 1 parameter
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    // LANGKAH 3: Gunakan Beberapa Parameter Sekaligus
    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + " (" + umur + " tahun) - " + kota);
    }

    public static void main(String[] args) {
        // Panggilan method dari LANGKAH 2
        sapa("Budi");
        sapa("Siti");

        // Panggil pada method main (LANGKAH 3):
        tampilkanBiodata("Budi", 20, "Bandung");
    }
}
