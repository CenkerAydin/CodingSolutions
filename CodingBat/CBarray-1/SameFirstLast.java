package Array_1;
//https://codingbat.com/prob/p118976
public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        int sira=nums.length;
        if(sira==0)
            return false;
        if(nums[0]==nums[sira-1]){
            return true;
        }
        return false;

    }

}
