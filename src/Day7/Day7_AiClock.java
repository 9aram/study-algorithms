package Day7;

import java.util.Scanner;

public class Day7_AiClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int time = sc.nextInt();

        s+=time;//plus time to s
        if(s>59){ // if s over 59 means add minutes
            m+=s/60;
            s=s%60;
        }
        if(m>59){
            h+=m/60;
            m=m%60;
        }
        if(h>23){
            h=h%24;
        }
        System.out.println(h + " "+m + " "+s);
    }
}
