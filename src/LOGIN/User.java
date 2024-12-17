package LOGIN;

import ARSIP.Teman;

import java.util.Scanner;

public class User {

    String id, pass;

    void baca_teman () {
        Scanner sc = new Scanner(System.in);

        System.out.println("User id :");
        id = sc.next();

        System.out.println("Password :");
        pass = sc.next();


    }

    void tampil_temanHidePass () {
        System.out.println("id :" + id);
        System.out.println("Pass : ");
        System.out.println("pass :" + pass.charAt(0));
        for (int i = 1; i < pass.length(); i++) {
            System.out.println("*");
        }

        System.out.println("\n" );

    }

    void tampil_teman () {
        System.out.println("id :" + id);
        System.out.println("pass :" + pass);
    }
//    static void Salin (array_teman L1, array_teman L2) {
//        for (int i = 0; i < L1; i++) {
//            L2.a[i] = L1.a[i];
//        }
//    }

    public static void main(String[] args) {

        User T = new User();
        T.baca_teman();
        T.tampil_teman();
        T.tampil_temanHidePass();

    }

}
