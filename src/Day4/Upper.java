package Day4;

import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        for(int i=0; i<text.length; i++){
            char temp = text[i];
            if (temp>='a' && temp<='z'){
                System.out.print((char)(temp-32)); //char에 int를 빼면 int형 값이 되어버린다!!
            } else
                System.out.print((char)(temp+32));
            }
        }

    }

