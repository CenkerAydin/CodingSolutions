package Java;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class HashSets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        // Use a HashSet to store the unique pairs
        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String pair = pair_left[i] + " " + pair_right[i];
            set.add(pair);
            System.out.println(set.size());

        }
    }
}
