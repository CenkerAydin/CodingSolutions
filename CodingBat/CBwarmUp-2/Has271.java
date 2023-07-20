package WarmUp_2;

public class Has271 {
    public boolean has271(int[]nums){
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            int valPlus5 = val + 5;
            int valMinus1 = val - 1;
            if (nums[i + 1] == valPlus5 && Math.abs(nums[i + 2] - valMinus1) <= 2) {
                return true;
            }
        }

        return false;
    }
}
