package Day3;

import java.util.Scanner;

public class CountIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[201];//인덱스 선언이 200까지 되야하니깐.

        for(int i=0; i<n; i++){
            int index= sc.nextInt();
            a[index+100]++;//입력된값으로 된 인덱스의 값을 1씩 더한다.
        }
        int v = sc.nextInt();
        System.out.println(a[v+100]);//해당값인 인덱스의 값을 출력한다.

    }
}
