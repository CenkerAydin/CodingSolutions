import java.util.Random;

public class LatinSquares7 {
    public static void main(String[] args) {

    }

    public static  int[][]makeLatinSquare(int n){
        final int[][] latinSquare=new int[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                latinSquare[i][j]=(i+j) % n+1;
            }
        }
        return latinSquare;
    }
}
