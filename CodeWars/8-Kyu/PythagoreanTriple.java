package CodeWars;
import java.util.Arrays;
public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple) {
    Arrays.sort(triple);
    int a=(int) Math.pow(triple[0],2);
    int b=(int) Math.pow(triple[1],2);
    int c=(int) Math.pow(triple[2],2);
    if (a+b==c)
        return 1;

    return 0;
    }
}
