package Day5;

import java.util.Scanner;

public class NumberOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println((int)'a');
        char[] word = sc.next().toCharArray();
        int[] a = new int[26];
        for(int i=0; i<word.length; i++){

            a[word[i]-97]++;
        }
        for(int i=0; i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
