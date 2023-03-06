package Array_2;
//https://codingbat.com/prob/p180920
public class FizzArray {
    public int[] fizzArray(int n){
        int[] res=new int[n];
        for (int i=0;i<res.length;i++){
            res[i]=i;
        }
        return res;
    }
}
