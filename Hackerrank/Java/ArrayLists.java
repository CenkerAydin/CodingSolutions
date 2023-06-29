package Java;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            ArrayList<Integer> arr2 = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                arr2.add(scanner.nextInt());
            }
            arr1.add(arr2);
        }
        int q = scanner.nextInt();


        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x > 0 && x <= n && y > 0 && y <= arr1.get(x - 1).size()) {
                System.out.println(arr1.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
    }

