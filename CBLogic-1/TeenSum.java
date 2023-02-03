package Logic_1;
//https://codingbat.com/prob/p178728
public class TeenSum {
    public int teenSum(int a,int b){
    int sum=a+b;
    if ((13<=a && a<=19)|| (13<=b &&b<=19))
        return 19;

    return sum;
    }
}
