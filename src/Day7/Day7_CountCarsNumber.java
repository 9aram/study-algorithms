package Day7;

import java.util.Scanner;

public class Day7_CountCarsNumber  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c =0;
        for(int i=0; i<5; i++){
            if(n==sc.nextInt()) c ++;
        }
        System.out.print(c);
    }
}
