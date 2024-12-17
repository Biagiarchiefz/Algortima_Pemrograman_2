package LOGIN;


import java.io.*;
import java.util.Scanner;

public class FileofUser {
    Scanner sc = new Scanner(System.in);

    void SaveToFile () {
        User x = new User() ;

        System.out.println("========== SaveToFile ======");
        ObjectOutputStream out = null;

        try {
            // 1. buka file untuk ditulis
            out=new ObjectOutputStream(new FileOutputStream
                    ("C:\\teman\\user.dat "));// nama direktori+file

            for (int i=0;i<3;i++){
                System.out.println("Temanku : ");
                x.baca_teman();
                out.writeObject(x);
                x = new User() ;
            }

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void ViewFile(){
        int total=0;
        User x = new User();
        System.out.println("========== ViewFile ======");
        ObjectInputStream in = null;
        try {
            // 1. buka file untuk dibaca
            in=new ObjectInputStream(new FileInputStream
                    ("C:\\teman\\user.dat"));

            Object curR = in.readObject();

            try {
                // 2. baca dan proses setiap record yang dibaca
                while (true) {
                    System.out.println("Record");
                    x = (User) curR;
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

        FileofUser B = new FileofUser();

        B.SaveToFile(); // tulis ke file
//        B.ViewFile();  // baca isi file


    }
}
