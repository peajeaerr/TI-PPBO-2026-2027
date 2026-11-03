public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    // Constructor default
    public Waktu() {
        this.jam = 0;
        this.menit = 0;
        this.detik = 0;
    }

    // Getter
    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public int getDetik() {
        return detik;
    }

    // Setter Jam dengan Validasi (0-23)
    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        } else {
            System.out.println("Nilai jam tidak valid: " + jam + " (Harus 0-23)");
        }
    }

    // Setter Menit dengan Validasi (0-59)
    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        } else {
            System.out.println("Nilai menit tidak valid: " + menit + " (Harus 0-59)");
        }
    }

    // Setter Detik dengan Validasi (0-59)
    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        } else {
            System.out.println("Nilai detik tidak valid: " + detik + " (Harus 0-59)");
        }
    }

    // Method untuk cetak waktu rapi
    public void tampilkanWaktu() {
        System.out.printf("Waktu sekarang: %02d:%02d:%02d\n", jam, menit, detik);
    }

    public static void main(String[] args) {
        Waktu w = new Waktu();

        // Uji coba nilai valid
        System.out.println("=== UJI DATA VALID ===");
        w.setJam(14);
        w.setMenit(30);
        w.setDetik(45);
        w.tampilkanWaktu();

        // Uji coba nilai tidak valid
        System.out.println("\n=== UJI DATA TIDAK VALID ===");
        w.setJam(25);
        w.setMenit(-5);
        w.setDetik(61);
        w.tampilkanWaktu();
    }
}
