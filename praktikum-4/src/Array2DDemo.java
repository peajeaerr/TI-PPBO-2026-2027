public class Array2DDemo {
    public static void main(String[] args) {
        // --- KODE DARI LANGKAH 12 ---
        int[][] matriks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Tampilan Matriks:");
        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                System.out.print(matriks[baris][kolom] + " ");
            }
            System.out.println(); // pindah baris (1 baris matriks)
        }


        // --- KODE TAMBAHAN DARI LANGKAH 13 ---
        int totalMatriks = 0;
        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                totalMatriks += matriks[baris][kolom];
            }
        }
        System.out.println("Total seluruh elemen: " + totalMatriks);
    }
}
