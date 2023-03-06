package Array_2;
//https://codingbat.com/prob/p134300
public class SameEnds {
    public boolean sameEnds(int[]nums,int len){
        for (int i=0;i<len;i++){
            if (nums[i]==nums[nums.length-len+i]) {
                return true;
            }
        }
        return false;
    }
}
