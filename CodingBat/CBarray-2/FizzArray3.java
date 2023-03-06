package Array_2;
//https://codingbat.com/prob/p142539
public class FizzArray3 {
    public int[] fizzArray3(int start,int end){
        int length=end-start;
        int[]res=new int[length];
        for (int i=0;i<length;i++){
            res[i]=start+i;
        }
        return res;
    }
}
