package Logic_1;
//https://codingbat.com/prob/p133158
public class Less20 {
    public boolean Less20(int n){
        if ((n+1)%20==0 ||(n+2)%20==0)
            return true;

        return false;
    }
}
