//package ARSIPIB;
//
//import java.io.*;
//import java.util.Scanner;
//
//public class FileofChar {
//    Scanner sc = new Scanner(System.in);
//
//    void SaveToFile () {
//        Char x ;
//        System.out.println("========== SaveToFile ======");
//        ObjectOutputStream out = null;
//
//        try {
//            // 1. buka file untuk ditulis
//            out=new ObjectOutputStream(new FileOutputStream
//                    ("C:\\teman\\teman.dat "));// nama direktori+file
//
//            for (int i=0;i<3;i++){
//                System.out.println("Temanku : ");
//                x = sc.next().charAt(0);
//                out.writeObject(x);
//
//            }
//
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//
//    public void ViewFile(){
//        int total=0;
//        Char x ;
//        System.out.println("========== ViewFile ======");
//        ObjectInputStream in = null;
//        try {
//            // 1. buka file untuk dibaca
//            in=new ObjectInputStream(new FileInputStream
//                    ("C:\\teman\\teman.dat"));
//
//            Object curR = in.readObject();
//
//            try {
//                // 2. baca dan proses setiap record yang dibaca
//                while (true) {
//                    System.out.println(curR + " ");
//                    total++;
//                    curR = in.readObject();
//                }
//
//            } catch (EOFException e) {}
//            System.out.println("\n Total record: "+ total);
//
//        } catch (ClassNotFoundException e) {
//            System.out.println("Class tidak ditemukan.");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//
//
//        FileofChar B = new FileofChar();
//
//        B.SaveToFile(); // tulis ke file
//        B.ViewFile();  // baca isi file
//
//
//    }
//}
