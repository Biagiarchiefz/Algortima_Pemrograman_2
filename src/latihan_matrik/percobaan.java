package latihan_matrik;

import java.util.Scanner;
public class percobaan {

    // Fungsi untuk memeriksa apakah matriks adalah matriks identitas
    static boolean isIdentityMatrix(int[][] matriks) {
        int n = matriks.length;

        // Iterasi untuk memeriksa semua elemen
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Diagonal utama harus 1
                if (i == j && matriks[i][j] != 1) {
                    return false;
                }
                // Elemen selain diagonal utama harus 0
                if (i != j && matriks[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input ukuran matriks
            System.out.print("Masukkan ukuran matriks (n x n): ");
            int n = scanner.nextInt();

            // Deklarasi matriks
            int[][] matriks = new int[n][n];

            // Input elemen matriks
            System.out.println("Masukkan elemen matriks:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Elemen [" + i + "][" + j + "]: ");
                    matriks[i][j] = scanner.nextInt();
                }
            }

            // Periksa apakah matriks adalah identitas
            if (isIdentityMatrix(matriks)) {
                System.out.println("Matriks merupakan matriks identitas.");
            } else {
                System.out.println("Matriks bukan matriks identitas.");
            }

            scanner.close();
        }


    }



