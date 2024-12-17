package ARSIP;

import java.io.*;
import java.util.Scanner;

public class FileofTeman {

    Scanner sc = new Scanner(System.in);

    void SaveToFile () {
        Teman x = new Teman() ;

        System.out.println("========== SaveToFile ======");
        ObjectOutputStream out = null;

        try {
            // 1. buka file untuk ditulis
            out=new ObjectOutputStream(new FileOutputStream
                    ("C:\\teman\\teman.dat "));// nama direktori+file

            for (int i=0;i<3;i++){
                System.out.println("Temanku : ");
                x.baca_teman();
                out.writeObject(x);
                x = new Teman() ;
            }

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void ViewFile(){
        int total=0;
        Teman x = new Teman();
        System.out.println("========== ViewFile ======");
        ObjectInputStream in = null;
        try {
            // 1. buka file untuk dibaca
            in=new ObjectInputStream(new FileInputStream
                    ("C:\\teman\\teman.dat"));

            Object curR = in.readObject();

            try {
                // 2. baca dan proses setiap record yang dibaca
                while (true) {
                    System.out.println("Record");
                    x = (Teman) curR;
                    x.tampil_teman();
                    total++;
                    curR = in.readObject();
                }

            } catch (EOFException e) {}
            System.out.println("\n Total record: "+ total);

        } catch (ClassNotFoundException e) {
            System.out.println("Class tidak ditemukan.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {

        FileofTeman B = new FileofTeman();

        B.SaveToFile(); // tulis ke file
        B.ViewFile();  // baca isi file


    }
}
