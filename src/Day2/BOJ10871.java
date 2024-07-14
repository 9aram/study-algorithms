package Day2;

import java.util.Scanner;

public class BOJ10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for(int i =0; i<n; i++){ // n의 갯수만큼 반복을 해줘야 함으로 i는 0부터 시작하니 i<n!
            int a = sc.nextInt();
            if(a < x){
                System.out.print(a + " ");
            }
        }
    }
}
