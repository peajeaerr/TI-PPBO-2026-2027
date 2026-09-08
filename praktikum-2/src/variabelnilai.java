public class variabelnilai {
    public static void main(String[] args){
        int nilaiBulat = 9;
        double nilaiDouble = nilaiBulat;
        System.out.println("Widening: " +nilaiDouble);

        double pecahan = 9.8;
                int hasilCasting = (int) pecahan;
        System.out.println("Narrowing: " + hasilCasting);
    }
}
