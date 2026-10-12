public class FilterNilaiArray {
    static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }

    static int[] filterDiAtasRataRata(int[] data) {
        double rataRata = (double) hitungTotal(data) / data.length;
        int count = 0;

        for (int nilai : data) {
            if (nilai > rataRata) count++;
        }

        int[] hasil = new int[count];
        int idx = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[idx++] = nilai;
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        int[] dummyData = {80, 75, 90, 60, 88};

        System.out.println("Total Nilai: " + hitungTotal(dummyData));

        int[] diAtasRata = filterDiAtasRataRata(dummyData);
        System.out.print("Elemen di atas rata-rata: ");
        for (int n : diAtasRata) {
            System.out.print(n + " ");
        }
    }
}
