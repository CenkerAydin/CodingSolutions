package WarmUp_2;
//https://codingbat.com/prob/p186031
public class ArrayFront9 {
    public boolean arrayFront9(int[]nums){
        if (nums.length>=4){
            for (int i=0;i<4;i++){
                if (nums[i]==9)
                    return true;
            }
        }else {
            for (int i=0;i<nums.length;i++){
                if (nums[i]==9)
                    return true;
            }
        }
        return false;
    }
}
