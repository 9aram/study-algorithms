package Day5;

import java.util.Scanner;

public class Dice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b,c));
        if(a ==b && b==c) {
            System.out.println(10000+a*1000);
        }else if (a ==b || b == c || c==a){ //같은눈이 2개나오는경우
            if(a==b) System.out.println(1000+a*100);
            else System.out.println(1000+c*100);
        }
        else  System.out.println(max*100);
    }
}
