public class KonversiSuhuOverloading {
    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin") || skalaTujuan.equalsIgnoreCase("K")) {
            return celsius + 273.15;
        } else {
            return (celsius * 9 / 5) + 32;
        }
    }

    public static void main(String[] args) {
        System.out.println("100 C ke Fahrenheit: " + konversiSuhu(100));
        System.out.println("100 C ke Kelvin: " + konversiSuhu(100, "Kelvin"));
    }
}
