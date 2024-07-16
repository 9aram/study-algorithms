package Day4;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] ar = new int[a][b];

        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                int val = sc.nextInt();
                ar[i][j]=val;
            }
        }
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                int val = sc.nextInt();
                ar[i][j]+=val;
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
