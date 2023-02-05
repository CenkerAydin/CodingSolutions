package Logic_2;
//https://codingbat.com/prob/p182879
public class NoTeenSum {
    public int noTeenSum(int a,int b,int c){
        int aTeen=fixTeeen(a);
        int bTeen=fixTeeen(b);
        int cTeen=fixTeeen(c);

        return aTeen+bTeen+cTeen;
    }
    public int fixTeeen(int n){
        if ((13<=n &&n<=19)&&(!(n==15 ||n==16)))
            return 0;

        return n;
    }
}
