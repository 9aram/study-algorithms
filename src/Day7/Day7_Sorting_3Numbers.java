package Day7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Day7_Sorting_3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        Arrays.sort(a); //Ascending
        //Integer[] a = new Integer[3]; //Descending
        //Arrays.sort(a, Collections.reverseOrder());
        System.out.println(a[0]+" "+a[1]+" "+a[2]+" ");
    }
}
