//package ARSIPIB;
//
//
//import java.io.*;
//import java.util.Scanner;
//
//public class FileofString {
//
//    Scanner sc = new Scanner(System.in);
//
//    void SaveToFile () {
//        String x ;
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
//                x = sc.next();
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
//    public void ViewFile(){
//        int total=0;
//        String x ;
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
//                    System.out.println("Record");
//
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
//        ARSIP.FileofTeman B = new ARSIP.FileofTeman();
//
//        B.SaveToFile(); // tulis ke file
//        B.ViewFile();  // baca isi file
//
//
//    }
//}
