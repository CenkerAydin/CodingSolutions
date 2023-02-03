package Logic_1;
//https://codingbat.com/prob/p100962
public class SpecialEleven {
    public boolean specialEleven(int n){

        if (n%11==0||(n-1)%11==0)
        return true;

        return false;

    }

}
