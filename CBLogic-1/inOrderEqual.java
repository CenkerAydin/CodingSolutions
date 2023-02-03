package Logic_1;
//https://codingbat.com/prob/p140272
public class inOrderEqual {
    public boolean inOrderEqual(int a,int b,int c,boolean equalOk){
        if (equalOk){
            if (a<=b &&b<=c)
                return true;
        }else
            if (a<b &&b<c)
                return true;

        return false;
    }
}
