package Array_2;
//https://codingbat.com/prob/p109783
public class HaveThree {
    public boolean haveThree(int[]nums){
       int count=0;
       for (int i=0;i<nums.length;i++){
           if (nums [i]==3)
               count++;
       }
       if (count!=3)
           return false;
       for (int i=0;i<nums.length-1;i++){
           if (nums[i]==3 &&nums[i+1]==3)
               return false;
       }
       return true;
    }
}
