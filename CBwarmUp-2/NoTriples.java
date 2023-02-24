package WarmUp_2;
//https://codingbat.com/prob/p170221
public class NoTriples {
    public boolean noTriples(int[]nums){
        for (int i=0;i<nums.length-2;i++){
            if (nums[i]==nums[i+1] && nums[i+1]==nums[i+2] &&nums[i]==nums[i+2])
                return false;
        }
        return true;
    }
}
