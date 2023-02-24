package WarmUp_2;
//https://codingbat.com/prob/p184031
public class ArrayCount9 {
    public int arrayCount9(int[]nums){
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==9)
                count++;
        }
        return count;
    }
}
