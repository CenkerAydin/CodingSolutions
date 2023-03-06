package Array_1;
//https://codingbat.com/prob/p190968
public class Sum2 {
    public int sum2(int[]nums){
        if (nums.length==0) return 0;
        if (nums.length<2) return nums[0];

        return nums[0]+nums[1];

    }
}
