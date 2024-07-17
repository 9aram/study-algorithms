package Day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrefixSum {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine())    ;
        int suNo=Integer.parseInt(stringTokenizer.nextToken());
        int quizNo=Integer.parseInt(stringTokenizer.nextToken());
        long[]s = new long[suNo+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine())    ;
        for(int i=1; i<=suNo; i++){
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken())
       int i =
        }
    }
}
