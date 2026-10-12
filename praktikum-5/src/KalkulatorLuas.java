public class KalkulatorLuas {
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Luas Persegi Panjang (p=5, l=4): " + luasPersegiPanjang(5, 4));
        System.out.println("Luas Persegi Panjang (p=10, l=7): " + luasPersegiPanjang(10, 7));
        System.out.println("Luas Lingkaran (r=7): " + luasLingkaran(7));
        System.out.println("Luas Lingkaran (r=10): " + luasLingkaran(10));
    }
}
