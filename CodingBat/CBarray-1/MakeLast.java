package Array_1;
//https://codingbat.com/prob/p137188
public class MakeLast {
    public int[]makeLast(int[] nums){
        int[]res=new int[nums.length*2];
        for (int i=0;i<res.length-1;i++) {
            res[i] = 0;
        }
        res[res.length-1]=nums[nums.length-1];
        return res;
    }
}
