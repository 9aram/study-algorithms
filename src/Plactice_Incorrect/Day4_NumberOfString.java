package Plactice_Incorrect;

import java.util.Scanner;

public class Day4_NumberOfString {
    public static void main(String[] args) {
        //TODO tomorrow
        //알파벳 소문자로만 이루어진 단어가 주어진다.
        //각 알파벳이 단어에 몇개 포함되어있는지 구하여라
        Scanner sc = new Scanner(System.in);
        char[] text =   sc.next().toCharArray();
        int[] count = new int[26];
       // System.out.println((int)'a');
        for(int i=0; i< text.length; i++){
            //System.out.print(text[i]-97);
            count[text[i]-97]++;
        }
        for(int j=0; j<count.length; j++){

            System.out.print(count[j]+" ");
        }

    }
}
