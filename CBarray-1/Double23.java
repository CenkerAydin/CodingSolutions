package Array_1;
//https://codingbat.com/prob/p145365
public class Double23 {
    public boolean double23(int[]nums){
        if (nums.length<2) return false;
        if ((nums[0]==2 &&nums[1]==2)||(nums[0]==3 &&nums[1]==3) )
            return true;

        return false;
    }
}
