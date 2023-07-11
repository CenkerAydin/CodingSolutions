//https://www.codewars.com/kata/55edaba99da3a9c84000003b/solutions/java
public class FindNumberDivisibleByNumber8 {
    public static int[] divisibleBy(int[]numbers,int divider){
        int count=0;
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]%divider==0){
                count++;
            }
        }
        int[]res=new int[count];
        int index=0;
        for (int num:numbers){
            if (num%divider==0){
                res[index]=num;
                index++;
            }
        }
        return res;
    }
}
