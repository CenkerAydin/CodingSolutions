package Array_1;
//https://codingbat.com/prob/p180840
public class PlusTwo {
    public int[]plusTwo(int[] a,int[]b){
        int[] res=new int[4];
        res[0]=a[0];
        res[1]=a[0];
        res[2]=b[1];
        res[3]=b[2];
        return res;
    }
}
