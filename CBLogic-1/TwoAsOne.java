package Logic_1;
//https://codingbat.com/prob/p113261
public class TwoAsOne {
    public boolean twoAsOne(int a,int b,int c){
    if (a+b==c)
        return true;
    else if (b+c==a)
        return true;
    else if (c+a==b) {
        return true;
    }else
        return false;
    }
}
