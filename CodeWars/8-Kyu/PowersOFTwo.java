package CodeWars;

public class PowersOFTwo {
    public static long[] powersOfTwo(int n){

        long[] result=new long[n+1];
        for(int i=0;i<=n;i++){
            if(i==0){
                result[0]=1;
            }else{
                result[i]=(long)Math.pow(2,i);
            }
        }
        return result;

    }
}
