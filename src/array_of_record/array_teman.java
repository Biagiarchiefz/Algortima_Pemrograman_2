package array_of_record;

import java.util.Scanner;

 class array_teman {

        int N = 3;
        Teman [] a = new Teman[N];

        void Bacaarr (){
            System.out.println("Baca nilai setiap elemen array dari keyboard");
            for (int i = 0; i < N; i++) {
                Teman T = new Teman();
                T.baca_teman();
                a[i]=T;
            }
        }

        void tampilarr(){

            for (int i = 0; i < N; i++){
                a[i].tampil_teman();
            }
        }

    void SequntialSearch_1 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("x : ");
        String x = sc.next();

        int i = 0;
        boolean stop = false;
        while ( (i < N ) && (stop == false )) {
            if ( a[i].nrp.equalsIgnoreCase(x) )
                stop = true;
            else i = i + i;

        }

        if ( stop == true )
            System.out.println(x + " ketemu index ke " + i);
        else
            System.out.println(x + " index tidak ditemukan ");
    }


//     void binary_Search () {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("X : ");
//         int X = sc.nextInt();
//
//         int i_awal = 0;
//         int i_akhir = N - 1;
//         boolean stop = false;
//
//         int k = 0;
//         while ((i_awal <= i_akhir) && (stop == false )) {
//             k = ( i_awal + i_akhir ) / 2;
//             if (X == a[k])
//                 stop = true;
//             else
//             if (a[k] > X)
//                 i_akhir = k-1; // i++
//             else
//                 i_awal = k + 1;
//         }
//
//         if (stop == true) {
//             System.out.println(X + " ketemu indeks ke " + k );
//         } else {
//             System.out.println( X + " Tidak ditemukan ");
//         }
//     }

        public static void main(String[] args) {
        array_teman A = new array_teman();

            A.Bacaarr();
            A.tampilarr();

            A.SequntialSearch_1();

        }

    }



