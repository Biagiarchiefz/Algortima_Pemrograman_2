package latihan_matrik;

public class soal_3 {

    static boolean isIdentityMatrix(int[][] matriks) {
        int n = matriks.length; // Ukuran matriks

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

        return true; // Semua syarat matriks identitas terpenuhi
    }


        public static void main(String[] args) {
            int[][] matriks = {
                    {1, 0, 0},
                    {0, 1, 0},
                    {0, 0, 1}
            };

            if (isIdentityMatrix(matriks)) {
                System.out.println("Matriks merupakan matriks identitas.");
            } else {
                System.out.println("Matriks bukan matriks identitas.");
            }
        }


    }



