package latihan_matrik;

import java.util.Scanner;
public class soal_4 {

    // Fungsi untuk menghitung frekuensi huruf 'A'
    public static int hitungFrekuensiA(char[][] matriks) {
        int count = 0;
        int m = matriks.length;
        int n = matriks[0].length;

        // Iterasi matriks
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriks[i][j] == 'A') {
                    count++;
                }
            }
        }

        return count;
    }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input ukuran matriks
            System.out.print("Masukkan jumlah baris (m): ");
            int m = scanner.nextInt();
            System.out.print("Masukkan jumlah kolom (n): ");
            int n = scanner.nextInt();

            // Deklarasi matriks
            char[][] matriks = new char[m][n];

            // Input elemen matriks
            System.out.println("Masukkan elemen matriks karakter:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Elemen [" + i + "][" + j + "]: ");
                    matriks[i][j] = scanner.next().charAt(0); // Ambil karakter pertama dari input
                }
            }

            // Hitung frekuensi huruf 'A'
            int frekuensi = hitungFrekuensiA(matriks);

            // Output hasil
            System.out.println("Frekuensi kemunculan huruf 'A': " + frekuensi);

            scanner.close();
        }


    }


