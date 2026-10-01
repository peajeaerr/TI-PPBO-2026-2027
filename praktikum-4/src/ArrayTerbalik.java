import java.util.Scanner;

public class ArrayTerbalik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[10];

        // Input data
        System.out.println("Masukkan 10 bilangan:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        // Tampilkan terbalik
        System.out.print("\nArray dalam urutan terbalik: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
