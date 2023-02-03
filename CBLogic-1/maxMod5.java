package Logic_1;
//https://codingbat.com/prob/p115384
public class maxMod5 {
    public int maxMod5(int a,int b) {
       int max=a;
       if (b>a)
           max=b;
        int min=a;
        if (a>b)
            min=b;
        if (a == b){
            return 0;
        }else if (a%5==b%5)
            return min;

        return max;
    }
}
