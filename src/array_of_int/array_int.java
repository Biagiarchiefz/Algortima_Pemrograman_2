package array_of_int;

import java.util.Scanner;

public class array_int {

        int N = 3;
        int [] a = new int [N];

        void Bacaarr (){
            System.out.println("Baca nilai setiap elemen array dari keyboard");
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < N; i++) {
                System.out.println( i + ": " );
                a[i] = sc.nextInt();
            }

        }

        void tampilarr(){

            for (int i = 0; i < N; i++){
                System.out.println(i + ": " + a[i]);

            }
        }


        void rata_2 () {
            int total = 0;
            for (int i = 0; i < N; i++){
                total += total + a[i];
            }
            double r = total/N;
            System.out.println("rata-rata : " + r);
        }

//        static void Salin (array_int L1, array_int L2) {
//            for (int i = 0; i < L1; i++) {
//                L2.a[i] = L1.a[i];
//            }
//        }

        void SequntialSearch_1 () {
            Scanner sc = new Scanner(System.in);
            System.out.println("x : ");
            int x = sc.nextInt();

            int i = 0;
            boolean stop = false;
            while ( (i < N ) && (stop == false )) {
                if ( x == a[i])
                    stop = true;
                else i = i + i;

            }

            if ( stop == true )
                System.out.println(x + " ketemu index ke " + i);
            else
                System.out.println(x + " index tidak ditemukan ");
        }

        void binary_Search () {
            Scanner sc = new Scanner(System.in);
            System.out.println("X : ");
            int X = sc.nextInt();

            int i_awal = 0;
            int i_akhir = N - 1;
            boolean stop = false;

            int k = 0;
            while ((i_awal <= i_akhir) && (stop == false )) {
                k = ( i_awal + i_akhir ) / 2;
                if (X == a[k])
                    stop = true;
                else
                    if (a[k] > X)
                        i_akhir = k-1; // i++
                    else
                        i_awal = k + 1;
            }

            if (stop == true) {
                System.out.println(X + " ketemu indeks ke " + k );
            } else {
                System.out.println( X + " Tidak ditemukan ");
            }
        }

        void bubbleSort () {
            // menugurtkan array menaik
            int k;
            int temp;
            int i = 1;
            while (i <= N) {
                k = N -1;
                while ( k >= i) {
                    if (a[k] < a [k -1 ]) {
                        temp = a [k - 1];
                        a[k - 1] = a[k];
                        a[k] = temp;
                    }
                    k = k -1;
                }
                i = i + i;
            }
        }



        public static void main(String[] args) {
            array_int A = new array_int();

            A.Bacaarr();
            A.tampilarr();
            System.out.println("Hasil urut");
            A.bubbleSort();
            A.tampilarr();
            A.binary_Search();
//            A.SequntialSearch_1();
        }


    }
