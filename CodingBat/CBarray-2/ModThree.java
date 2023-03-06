package Array_2;
//https://codingbat.com/prob/p159979
public class ModThree {
    public boolean modThree(int[]nums){
       for (int i=0;i<nums.length-2;i++){
           if (nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0) {
               return true;
           }else if (nums[i] % 2 != 0 && nums[i] % 2 != 0 && nums[i+2] % 2 != 0) {
               return true;
           }
       }
       return false;
    }
}
