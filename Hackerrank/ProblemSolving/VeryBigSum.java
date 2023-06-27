package ProblemSolving;
//https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

import java.util.List;

public class VeryBigSum {

    public static  long aVeryBigSum(List<Long> ar){
        long res=0;
        for (int i=0;i<ar.size();i++){
            res+=ar.get(i);
        }
        return res;
    }

}
