public class NearestSquare8 {

    public static int nearestSq(final int n){
        int sqrt=(int) Math.sqrt(n);

        if (sqrt*sqrt==n) return n;

        int lower=sqrt*sqrt;
        int upper=(sqrt+1)*(sqrt+1);

        if (n-lower <upper -n){
            return lower;
        }else{
            return upper;
        }
    }
}
