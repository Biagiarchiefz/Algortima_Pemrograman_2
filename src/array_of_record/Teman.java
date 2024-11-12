package array_of_record;

import java.util.Scanner;

public class Teman {


        String nrp, nama, wa;
        Date bday;

        void baca_teman () {
            Scanner sc = new Scanner(System.in);

            System.out.println("Nrp :");
            nrp = sc.next();

            System.out.println("Nama :");
            nama= sc.next();

            System.out.println("Wa :");
            wa = sc.next();

        }

        void tampil_teman () {
            Date d = new Date(1,8,2004);
            System.out.println("Nrp :" + nrp);
            System.out.println("Nama :" + nama);
            System.out.println("Nama :" + wa);
            bday=d;
            System.out.println("Tanggal Lahir :" + bday.dd + "/" + bday.mm + "/" + bday.y);
        }

//    static void Salin (array_teman L1, array_teman L2) {
//        for (int i = 0; i < L1; i++) {
//            L2.a[i] = L1.a[i];
//        }
//    }

        public static void main(String[] args) {

            Teman T = new Teman();
            T.baca_teman();
            T.tampil_teman();

        }





    }


