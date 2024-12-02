package latihan_matrik;

public class soal_2 {

    static boolean isUpperTriangular(int[][] matriks) {
        int n = matriks.length; // Ukuran matriks

        // Iterasi untuk memeriksa elemen di bawah diagonal utama
        for (int i = 1; i < n; i++) { // Baris mulai dari 1 (di bawah diagonal utama)
            for (int j = 0; j < i; j++) { // Kolom di bawah diagonal utama
                if (matriks[i][j] != 0) {
                    return false; // Jika ada elemen bukan nol
                }
            }
        }

        return true; // Semua elemen di bawah diagonal utama adalah nol
    }


    public static void main(String[] args) {
        int[][] matriks = {
                {1, 2, 3},
                {0, 4, 5},
                {0, 0, 6}
        };

        if (isUpperTriangular(matriks)) {
            System.out.println("Matriks merupakan matriks segitiga atas.");
        } else {
            System.out.println("Matriks bukan matriks segitiga atas.");
        }
    }



}

