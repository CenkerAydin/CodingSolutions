package Array_1;
//https://codingbat.com/prob/p101230
public class MakeEnds {
    public int[]makeEnds(int[]nums){

        if (nums.length==1){
            int[]res=new int[2];
            res[0]=nums[0];
            res[1]=nums[0];
            return res;
        }
        int[] res=new int[2];
        res[0]=nums[0];
        res[1]=nums[nums.length-1];

        return res;
    }
}
