package Java;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
public class Loops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int beforeTotal = a;
            for(int us=0; us < n; us++){
                beforeTotal += ((Math.pow(2,us))*b);
                System.out.print(beforeTotal + " ");
            }
            System.out.println();

        }
        in.close();

    }
}
