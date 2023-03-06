package Array_2;

public class CenteredAverage {
    public int centeredAverage(int[]nums){
        int max=nums[0];
        int min=nums[0];
        for (int i=1;i<nums.length;i++){
            if (min>nums[i])
                min=nums[i];

            if (max<nums[i])
                max=nums[i];
        }
        int sum=0;
        int count=0;
        for (int i=0;i<nums.length;i++){
            count++;
            sum +=nums[i];
        }
        int ignore=max+min;
        sum -=ignore;
        int average=sum/count-2;
        return average;

    }
}
