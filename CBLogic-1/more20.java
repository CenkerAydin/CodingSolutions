package Logic_1;
//https://codingbat.com/prob/p118290
public class more20 {
    public boolean more20(int n){
        if ((n-1)%20==0 ||(n-2)%20==0)
            return true;

        return false;
    }
}
