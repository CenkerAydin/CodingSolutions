package Array_1;
//https://codingbat.com/prob/p185685
public class FirstLast6 {
    public boolean firstLast6(int[] nums) {
        int order=nums.length;
        if(nums[order-1]==6|| nums[0]==6){
            return true;
        }
        return false;
    }
}
