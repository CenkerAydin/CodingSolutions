package Array_1;
//https://codingbat.com/prob/p199519
public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
    int[] middle=new int[2];
    int length=nums.length/2;
            middle[0]=nums[length-1];
            middle[1]=nums[length];

        return middle;
    }
}
