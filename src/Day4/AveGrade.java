package Day4;

import java.util.Scanner;

public class AveGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     /*   int[] a = new int[n];

        for(int i=0; i <n ; i++){
            a[i]=sc.nextInt();
        }
        int max = 0;
        int sum = 0;
        for (int i=0; i<n; i++){
            if(a[i]>max) max=a[i];
            sum+=a[i];
        }*/
        int max = 0;
        int sum = 0;
        for (int i=0; i<n;i++){
            int temp = sc.nextInt();
            if(temp>max) max=temp;
            sum+=temp;
        }
        System.out.println(sum*100.0/max/n);
    }
}
