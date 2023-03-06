package Array_2;
//https://codingbat.com/prob/p100246
public class Pre4 {
    public int[] pre4(int[]nums){
        int count=0;
        for (int i=0;i<nums.length;i++){

            if (nums[i]==4)
                break;
            else count++;
        }
        int[]res=new int[count];
        for (int i=0;i<res.length;i++){
            res[i]=nums[i];
        }
        return res;
    }
}
