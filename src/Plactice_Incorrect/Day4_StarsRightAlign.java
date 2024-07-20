package Plactice_Incorrect;

import java.util.Scanner;

public class Day4_StarsRightAlign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; 0<i; i--){ // 5 4
            for (int j=1; j<=n; j++){//1
                if(j<i) System.out.print(" ");
                if(i<=j) System.out.print("*");
            }
            System.out.println();
        }
    }

}
