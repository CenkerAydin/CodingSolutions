package Array_1;
//https://codingbat.com/prob/p175763
public class Sum3 {
    public int sum3(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            sum+=j;
        }
        return sum;
    }
}

