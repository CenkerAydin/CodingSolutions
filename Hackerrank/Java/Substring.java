package Java;
//https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int start = in.nextInt();
        int end = in.nextInt();


        System.out.print(str.substring(start,end));
    }

}
