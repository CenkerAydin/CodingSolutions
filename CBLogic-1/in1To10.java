package Logic_1;
//https://codingbat.com/prob/p137365
public class in1To10 {
    public boolean in1To10(int n,boolean outsideMode){
        if (outsideMode){
            if (n<=1 )
                return true;
            else if (n>=10)
                return true;
            else return false;
        }else
            if (1<=n &&n<=10)
            return true;
        else
            return false;
    }
}
