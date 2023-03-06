package Array_1;
//https://codingbat.com/prob/p109537
public class BiggerTwo {
    public int[] biggerTwo(int[]a,int[]b){
        int sumA=0;
        int sumB=0;
        int[]max=new int[2];
        for (int i=0;i<a.length;i++){
            sumA+=a[i];
        }
        for (int i=0;i<b.length;i++){
            sumB+=b[i];
        }
        if (sumA>=sumB)
            return a;
        else
            return b;
    }
}
