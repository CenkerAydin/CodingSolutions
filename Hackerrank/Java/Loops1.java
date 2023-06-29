package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
public class Loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int result;
        for(int i=1;i<=10;i++){
            result =n*i;
            System.out.println(   n+"x "+i+ " = "+n*i  );
        }


        bufferedReader.close();
    }
}
