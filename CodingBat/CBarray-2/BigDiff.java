package Array_2;

public class BigDiff {
    public int bigDiff(int[]nums){
        int max=nums[0];
        int min=nums[0];
        for (int i=0;i<nums.length;i++){
            if (min>nums[i])
                min=nums[i];

            if (max<nums[i])
                max=nums[i];
        }
        return max-min;
    }
}
