package ARSIP;

import java.util.Scanner;

public class Teman implements java.io.Serializable {


    String nrp, nama, wa;
    String [] hobby  = new String[3];
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

        System.out.println("Nrp :" + nrp);
        System.out.println("Nama :" + nama);
        System.out.println("Nama :" + wa);

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



