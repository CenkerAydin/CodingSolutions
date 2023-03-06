package Logic_1;
//https://codingbat.com/prob/p118077
public class SumLimit {
    public int sumLimit(int a,int b){
    int sum=a+b;
    String lengthA=String.valueOf(a);
    int x=lengthA.length();
    String sumL=String.valueOf(sum);
    int y=sumL.length();
    if (y==x)
        return sum;
    if (y>x)
        return a;

    return sum;
    }
}
