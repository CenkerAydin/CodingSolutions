package Java;
import java.util.Scanner;
public class StdinAndStdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a);

        int b=scan.nextInt();
        System.out.println(b);

        int c =scan.nextInt();
        System.out.println(c);

        scan.close();
    }
}
