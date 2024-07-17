package Day5;

import java.util.Scanner;

public class StarsRightAlign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; 0<i ;i--){//5 4 3 2 1
            for (int j=1; j<=n; j++) { //1 2 3 4 5
                if(i<=j)  System.out.print("*");
                else     System.out.print(" ");
            }System.out.println();
        }
    }
}