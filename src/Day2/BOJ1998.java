package Day2;


import java.util.Scanner;

public class BOJ1998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a*b);
        //float double => 정밀도
        //float => decimal point 6~7자리 정도?
        //double => decimal point 15~16자리 정도

        //TODO for coding test "double" is beter than float
        // 코딩테스트에서는 웬만하면 float 보다는 double 쓰는게 더 좋다
    }
}