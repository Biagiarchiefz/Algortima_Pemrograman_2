package matriks;

import java.util.Scanner;

public class matriks_int {

    int M=2;
    int N=2;
        int [][] a=new int[N][M];

        void InitMatrix(){
            for (int i=0;i<N;i++){
                for (int j=0;j<M;j++){ a[i][j]=0;
                }
            }
        }

        void ReadMatrix(){
            Scanner sc= new Scanner(System.in);
            for (int i=0;i<N;i++){
                for (int j=0;j<M;j++){
                    System.out.print("elemen[ "+i+","+j+"]"); int x=sc.nextInt();
                    a[i][j]=x;
                    System.out.print(a[i][j]+" ");
                }
            }
        }

        void ShowMatrix(){
            for (int i=0;i<N;i++){
                for (int j=0;j<M;j++){
                    System.out.println(a[i][j] + " ");
                }
            System.out.println();
        }
        }


    public static void main(String[] args) {
        matriks_int A = new matriks_int();
        matriks_int B = new matriks_int();

        B.InitMatrix();
        B.ReadMatrix();
        B.ShowMatrix();

        A.InitMatrix();
        A.ReadMatrix();
        A.ShowMatrix();

    }
}
