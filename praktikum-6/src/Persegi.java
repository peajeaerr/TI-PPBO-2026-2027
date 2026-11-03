class Persegi {
    double sisi;

    // Constructor berparameter
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Instance method menghitung luas
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Instance method menghitung keliling
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public static void main(String[] args) {
        // Membuat beberapa object dengan ukuran sisi berbeda
        Persegi p1 = new Persegi(4.0);
        Persegi p2 = new Persegi(7.5);
        Persegi p3 = new Persegi(10.0);

        System.out.println("=== HASIL PERHITUNGAN PERSEGI ===");
        System.out.println("Persegi 1 (Sisi " + p1.sisi + ") -> Luas: " + p1.hitungLuas() + " | Keliling: " + p1.hitungKeliling());
        System.out.println("Persegi 2 (Sisi " + p2.sisi + ") -> Luas: " + p2.hitungLuas() + " | Keliling: " + p2.hitungKeliling());
        System.out.println("Persegi 3 (Sisi " + p3.sisi + ") -> Luas: " + p3.hitungLuas() + " | Keliling: " + p3.hitungKeliling());
    }
}