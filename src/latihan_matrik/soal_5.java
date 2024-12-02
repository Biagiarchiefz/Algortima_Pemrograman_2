package latihan_matrik;

import java.util.Scanner;

public class soal_5 {

    // Fungsi untuk memeriksa apakah ada baris yang semua elemennya 0
    public static boolean cekBarisNol(int[][] matriks) {
        int m = matriks.length;
        int n = matriks[0].length;

        for (int i = 0; i < m; i++) {
            boolean semuaNol = true; // Asumsi awal semua elemen di baris ini adalah nol
            for (int j = 0; j < n; j++) {
                if (matriks[i][j] != 0) {
                    semuaNol = false; // Jika ada elemen bukan nol, tandai sebagai false
                    break; // Keluar dari loop kolom
                }
            }
            if (semuaNol) {
                return true; // Jika satu baris semua nol, langsung kembalikan true
            }
        }

        return false; // Tidak ada baris yang semua elemennya nol
    }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input ukuran matriks
            System.out.print("Masukkan jumlah baris (m): ");
            int m = scanner.nextInt();
            System.out.print("Masukkan jumlah kolom (n): ");
            int n = scanner.nextInt();

            // Deklarasi matriks
            int[][] matriks = new int[m][n];

            // Input elemen matriks
            System.out.println("Masukkan elemen matriks:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Elemen [" + i + "][" + j + "]: ");
                    matriks[i][j] = scanner.nextInt();
                }
            }

            // Periksa apakah ada baris yang semua elemennya 0
            boolean adaBarisNol = cekBarisNol(matriks);

            // Output hasil
            if (adaBarisNol) {
                System.out.println("Ada baris yang semua elemennya 0.");
            } else {
                System.out.println("Tidak ada baris yang semua elemennya 0.");
            }

            scanner.close();
        }


    }



