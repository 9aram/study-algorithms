package Day4;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum=0;
        for (int i=0; i<cNum.length ; i++){
            sum+=cNum[i]-'0'; //-48이나 -'0'
        }

        System.out.println(sum);
    }
}
